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
public class ParameterizedTypesTest extends TestCase {static class __CLR4_4_14dw4dwle6rxkt8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532111297L,8589935092L,5900,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_14dw4dwle6rxkt8.R.inc(5684);
    __CLR4_4_14dw4dwle6rxkt8.R.inc(5685);super.setUp();
    __CLR4_4_14dw4dwle6rxkt8.R.inc(5686);gson = new Gson();
  }finally{__CLR4_4_14dw4dwle6rxkt8.R.flushNeeded();}}


@SuppressWarnings("unchecked") 
 public void testParameterizedTypeGenericArraysSerialization147() throws Exception {__CLR4_4_14dw4dwle6rxkt8.R.globalSliceStart(getClass().getName(),5687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gxr1hh4dz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14dw4dwle6rxkt8.R.rethrow($CLV_t2$);}finally{__CLR4_4_14dw4dwle6rxkt8.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ParameterizedTypesTest.testParameterizedTypeGenericArraysSerialization147",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5687,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gxr1hh4dz() throws Exception{try{__CLR4_4_14dw4dwle6rxkt8.R.inc(5687); 
     __CLR4_4_14dw4dwle6rxkt8.R.inc(5688);List<Integer> list = new ArrayList<Integer>(); 
     __CLR4_4_14dw4dwle6rxkt8.R.inc(5689);list.add(1); 
     __CLR4_4_14dw4dwle6rxkt8.R.inc(5690);list.add(2); 
     __CLR4_4_14dw4dwle6rxkt8.R.inc(5691);List<Integer>[] arrayOfLists = new List[] { list, list }; 
     __CLR4_4_14dw4dwle6rxkt8.R.inc(5692);Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<Integer>>() { 
     }.getType(); 
     __CLR4_4_14dw4dwle6rxkt8.R.inc(5693);ObjectWithTypeVariables<Integer> objToSerialize = new ObjectWithTypeVariables<Integer>(null, null, null, arrayOfLists, null, null); 
     __CLR4_4_14dw4dwle6rxkt8.R.inc(5694);String json = gson.toJson(objToSerialize, typeOfSrc); 
     __CLR4_4_14dw4dwle6rxkt8.R.inc(5695);assertEquals("{\"arrayOfListOfTypeParameters\":[[1,2],[1,2]]}", json); 
 }finally{__CLR4_4_14dw4dwle6rxkt8.R.flushNeeded();}} 


public void testVariableTypeArrayDeserialization170() throws Exception {__CLR4_4_14dw4dwle6rxkt8.R.globalSliceStart(getClass().getName(),5696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vldd1p4e8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14dw4dwle6rxkt8.R.rethrow($CLV_t2$);}finally{__CLR4_4_14dw4dwle6rxkt8.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ParameterizedTypesTest.testVariableTypeArrayDeserialization170",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5696,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vldd1p4e8() throws Exception{try{__CLR4_4_14dw4dwle6rxkt8.R.inc(5696); 
     __CLR4_4_14dw4dwle6rxkt8.R.inc(5697);Integer[] array = { 1, 2, 3 }; 
     __CLR4_4_14dw4dwle6rxkt8.R.inc(5698);Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<Integer>>() { 
     }.getType(); 
     __CLR4_4_14dw4dwle6rxkt8.R.inc(5699);ObjectWithTypeVariables<Integer> objToSerialize = new ObjectWithTypeVariables<Integer>(null, array, null, null, null, null); 
     __CLR4_4_14dw4dwle6rxkt8.R.inc(5700);String json = gson.toJson(objToSerialize, typeOfSrc); 
     __CLR4_4_14dw4dwle6rxkt8.R.inc(5701);ObjectWithTypeVariables<Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc); 
     __CLR4_4_14dw4dwle6rxkt8.R.inc(5702);assertEquals(objAfterDeserialization.getExpectedJson(), json); 
 }finally{__CLR4_4_14dw4dwle6rxkt8.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

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
      this(null, null, null, null, null, null);__CLR4_4_14dw4dwle6rxkt8.R.inc(5704);try{__CLR4_4_14dw4dwle6rxkt8.R.inc(5703);
    }finally{__CLR4_4_14dw4dwle6rxkt8.R.flushNeeded();}}

    public ObjectWithTypeVariables(T obj, T[] array, List<T> list, List<T>[] arrayOfList,
        List<? extends T> wildcardList, List<? extends T>[] arrayOfWildcardList) {try{__CLR4_4_14dw4dwle6rxkt8.R.inc(5705);
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5706);this.typeParameterObj = obj;
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5707);this.typeParameterArray = array;
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5708);this.listOfTypeParameters = list;
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5709);this.arrayOfListOfTypeParameters = arrayOfList;
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5710);this.listOfWildcardTypeParameters = wildcardList;
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5711);this.arrayOfListOfWildcardTypeParameters = arrayOfWildcardList;
    }finally{__CLR4_4_14dw4dwle6rxkt8.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_14dw4dwle6rxkt8.R.inc(5712);
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5713);StringBuilder sb = new StringBuilder().append("{");

      __CLR4_4_14dw4dwle6rxkt8.R.inc(5714);boolean needsComma = false;
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5715);if ((((typeParameterObj != null)&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5716)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5717)==0&false))) {{
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5718);sb.append("\"typeParameterObj\":").append(toString(typeParameterObj));
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5719);needsComma = true;
      }

      }__CLR4_4_14dw4dwle6rxkt8.R.inc(5720);if ((((typeParameterArray != null)&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5721)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5722)==0&false))) {{
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5723);if ((((needsComma)&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5724)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5725)==0&false))) {{
          __CLR4_4_14dw4dwle6rxkt8.R.inc(5726);sb.append(',');
        }
        }__CLR4_4_14dw4dwle6rxkt8.R.inc(5727);sb.append("\"typeParameterArray\":[");
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5728);appendObjectsToBuilder(sb, Arrays.asList(typeParameterArray));
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5729);sb.append(']');
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5730);needsComma = true;
      }

      }__CLR4_4_14dw4dwle6rxkt8.R.inc(5731);if ((((listOfTypeParameters != null)&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5732)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5733)==0&false))) {{
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5734);if ((((needsComma)&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5735)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5736)==0&false))) {{
          __CLR4_4_14dw4dwle6rxkt8.R.inc(5737);sb.append(',');
        }
        }__CLR4_4_14dw4dwle6rxkt8.R.inc(5738);sb.append("\"listOfTypeParameters\":[");
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5739);appendObjectsToBuilder(sb, listOfTypeParameters);
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5740);sb.append(']');
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5741);needsComma = true;
      }

      }__CLR4_4_14dw4dwle6rxkt8.R.inc(5742);if ((((arrayOfListOfTypeParameters != null)&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5743)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5744)==0&false))) {{
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5745);if ((((needsComma)&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5746)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5747)==0&false))) {{
          __CLR4_4_14dw4dwle6rxkt8.R.inc(5748);sb.append(',');
        }
        }__CLR4_4_14dw4dwle6rxkt8.R.inc(5749);sb.append("\"arrayOfListOfTypeParameters\":[");
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5750);appendObjectsToBuilder(sb, arrayOfListOfTypeParameters);
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5751);sb.append(']');
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5752);needsComma = true;
      }

      }__CLR4_4_14dw4dwle6rxkt8.R.inc(5753);if ((((listOfWildcardTypeParameters != null)&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5754)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5755)==0&false))) {{
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5756);if ((((needsComma)&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5757)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5758)==0&false))) {{
          __CLR4_4_14dw4dwle6rxkt8.R.inc(5759);sb.append(',');
        }
        }__CLR4_4_14dw4dwle6rxkt8.R.inc(5760);sb.append("\"listOfWildcardTypeParameters\":[");
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5761);appendObjectsToBuilder(sb, listOfWildcardTypeParameters);
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5762);sb.append(']');
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5763);needsComma = true;
      }

      }__CLR4_4_14dw4dwle6rxkt8.R.inc(5764);if ((((arrayOfListOfWildcardTypeParameters != null)&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5765)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5766)==0&false))) {{
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5767);if ((((needsComma)&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5768)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5769)==0&false))) {{
          __CLR4_4_14dw4dwle6rxkt8.R.inc(5770);sb.append(',');
        }
        }__CLR4_4_14dw4dwle6rxkt8.R.inc(5771);sb.append("\"arrayOfListOfWildcardTypeParameters\":[");
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5772);appendObjectsToBuilder(sb, arrayOfListOfWildcardTypeParameters);
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5773);sb.append(']');
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5774);needsComma = true;
      }
      }__CLR4_4_14dw4dwle6rxkt8.R.inc(5775);sb.append('}');
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5776);return sb.toString();
    }finally{__CLR4_4_14dw4dwle6rxkt8.R.flushNeeded();}}

    private void appendObjectsToBuilder(StringBuilder sb, Iterable<? extends T> iterable) {try{__CLR4_4_14dw4dwle6rxkt8.R.inc(5777);
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5778);boolean isFirst = true;
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5779);for (T obj : iterable) {{
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5780);if ((((!isFirst)&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5781)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5782)==0&false))) {{
          __CLR4_4_14dw4dwle6rxkt8.R.inc(5783);sb.append(',');
        }
        }__CLR4_4_14dw4dwle6rxkt8.R.inc(5784);isFirst = false;
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5785);sb.append(toString(obj));
      }
    }}finally{__CLR4_4_14dw4dwle6rxkt8.R.flushNeeded();}}

    private void appendObjectsToBuilder(StringBuilder sb, List<? extends T>[] arrayOfList) {try{__CLR4_4_14dw4dwle6rxkt8.R.inc(5786);
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5787);boolean isFirst = true;
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5788);for (List<? extends T> list : arrayOfList) {{
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5789);if ((((!isFirst)&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5790)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5791)==0&false))) {{
          __CLR4_4_14dw4dwle6rxkt8.R.inc(5792);sb.append(',');
        }
        }__CLR4_4_14dw4dwle6rxkt8.R.inc(5793);isFirst = false;
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5794);if ((((list != null)&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5795)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5796)==0&false))) {{
          __CLR4_4_14dw4dwle6rxkt8.R.inc(5797);sb.append('[');
          __CLR4_4_14dw4dwle6rxkt8.R.inc(5798);appendObjectsToBuilder(sb, list);
          __CLR4_4_14dw4dwle6rxkt8.R.inc(5799);sb.append(']');
        } }else {{
          __CLR4_4_14dw4dwle6rxkt8.R.inc(5800);sb.append("null");
        }
      }}
    }}finally{__CLR4_4_14dw4dwle6rxkt8.R.flushNeeded();}}

    public String toString(T obj) {try{__CLR4_4_14dw4dwle6rxkt8.R.inc(5801);
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5802);return obj.toString();
    }finally{__CLR4_4_14dw4dwle6rxkt8.R.flushNeeded();}}
  }

  private static class MultiParameters<A, B, C, D, E> {
    A a;
    B b;
    C c;
    D d;
    E e;
    // For use by Gson
    @SuppressWarnings("unused")
    private MultiParameters() {try{__CLR4_4_14dw4dwle6rxkt8.R.inc(5803);
    }finally{__CLR4_4_14dw4dwle6rxkt8.R.flushNeeded();}}
    MultiParameters(A a, B b, C c, D d, E e) {
      super();__CLR4_4_14dw4dwle6rxkt8.R.inc(5805);try{__CLR4_4_14dw4dwle6rxkt8.R.inc(5804);
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5806);this.a = a;
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5807);this.b = b;
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5808);this.c = c;
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5809);this.d = d;
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5810);this.e = e;
    }finally{__CLR4_4_14dw4dwle6rxkt8.R.flushNeeded();}}
    @Override
    public int hashCode() {try{__CLR4_4_14dw4dwle6rxkt8.R.inc(5811);
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5812);final int prime = 31;
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5813);int result = 1;
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5814);result = prime * result + (((((a == null) )&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5815)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5816)==0&false))? 0 : a.hashCode());
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5817);result = prime * result + (((((b == null) )&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5818)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5819)==0&false))? 0 : b.hashCode());
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5820);result = prime * result + (((((c == null) )&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5821)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5822)==0&false))? 0 : c.hashCode());
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5823);result = prime * result + (((((d == null) )&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5824)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5825)==0&false))? 0 : d.hashCode());
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5826);result = prime * result + (((((e == null) )&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5827)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5828)==0&false))? 0 : e.hashCode());
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5829);return result;
    }finally{__CLR4_4_14dw4dwle6rxkt8.R.flushNeeded();}}
    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object obj) {try{__CLR4_4_14dw4dwle6rxkt8.R.inc(5830);
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5831);if ((((this == obj)&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5832)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5833)==0&false))) {{
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5834);return true;
      }
      }__CLR4_4_14dw4dwle6rxkt8.R.inc(5835);if ((((obj == null)&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5836)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5837)==0&false))) {{
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5838);return false;
      }
      }__CLR4_4_14dw4dwle6rxkt8.R.inc(5839);if ((((getClass() != obj.getClass())&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5840)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5841)==0&false))) {{
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5842);return false;
      }
      }__CLR4_4_14dw4dwle6rxkt8.R.inc(5843);MultiParameters<A, B, C, D, E> other = (MultiParameters<A, B, C, D, E>) obj;
      __CLR4_4_14dw4dwle6rxkt8.R.inc(5844);if ((((a == null)&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5845)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5846)==0&false))) {{
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5847);if ((((other.a != null)&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5848)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5849)==0&false))) {{
          __CLR4_4_14dw4dwle6rxkt8.R.inc(5850);return false;
        }
      }} }else {__CLR4_4_14dw4dwle6rxkt8.R.inc(5851);if ((((!a.equals(other.a))&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5852)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5853)==0&false))) {{
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5854);return false;
      }
      }}__CLR4_4_14dw4dwle6rxkt8.R.inc(5855);if ((((b == null)&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5856)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5857)==0&false))) {{
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5858);if ((((other.b != null)&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5859)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5860)==0&false))) {{
          __CLR4_4_14dw4dwle6rxkt8.R.inc(5861);return false;
        }
      }} }else {__CLR4_4_14dw4dwle6rxkt8.R.inc(5862);if ((((!b.equals(other.b))&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5863)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5864)==0&false))) {{
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5865);return false;
      }
      }}__CLR4_4_14dw4dwle6rxkt8.R.inc(5866);if ((((c == null)&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5867)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5868)==0&false))) {{
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5869);if ((((other.c != null)&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5870)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5871)==0&false))) {{
          __CLR4_4_14dw4dwle6rxkt8.R.inc(5872);return false;
        }
      }} }else {__CLR4_4_14dw4dwle6rxkt8.R.inc(5873);if ((((!c.equals(other.c))&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5874)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5875)==0&false))) {{
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5876);return false;
      }
      }}__CLR4_4_14dw4dwle6rxkt8.R.inc(5877);if ((((d == null)&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5878)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5879)==0&false))) {{
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5880);if ((((other.d != null)&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5881)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5882)==0&false))) {{
          __CLR4_4_14dw4dwle6rxkt8.R.inc(5883);return false;
        }
      }} }else {__CLR4_4_14dw4dwle6rxkt8.R.inc(5884);if ((((!d.equals(other.d))&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5885)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5886)==0&false))) {{
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5887);return false;
      }
      }}__CLR4_4_14dw4dwle6rxkt8.R.inc(5888);if ((((e == null)&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5889)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5890)==0&false))) {{
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5891);if ((((other.e != null)&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5892)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5893)==0&false))) {{
          __CLR4_4_14dw4dwle6rxkt8.R.inc(5894);return false;
        }
      }} }else {__CLR4_4_14dw4dwle6rxkt8.R.inc(5895);if ((((!e.equals(other.e))&&(__CLR4_4_14dw4dwle6rxkt8.R.iget(5896)!=0|true))||(__CLR4_4_14dw4dwle6rxkt8.R.iget(5897)==0&false))) {{
        __CLR4_4_14dw4dwle6rxkt8.R.inc(5898);return false;
      }
      }}__CLR4_4_14dw4dwle6rxkt8.R.inc(5899);return true;
    }finally{__CLR4_4_14dw4dwle6rxkt8.R.flushNeeded();}}
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
