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
public class ParameterizedTypesTest extends TestCase {static class __CLR4_4_13t83t8le6ouxkc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676526949504L,8589935092L,5140,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13t83t8le6ouxkc.R.inc(4940);
    __CLR4_4_13t83t8le6ouxkc.R.inc(4941);super.setUp();
    __CLR4_4_13t83t8le6ouxkc.R.inc(4942);gson = new Gson();
  }finally{__CLR4_4_13t83t8le6ouxkc.R.flushNeeded();}}

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

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
      this(null, null, null, null, null, null);__CLR4_4_13t83t8le6ouxkc.R.inc(4944);try{__CLR4_4_13t83t8le6ouxkc.R.inc(4943);
    }finally{__CLR4_4_13t83t8le6ouxkc.R.flushNeeded();}}

    public ObjectWithTypeVariables(T obj, T[] array, List<T> list, List<T>[] arrayOfList,
        List<? extends T> wildcardList, List<? extends T>[] arrayOfWildcardList) {try{__CLR4_4_13t83t8le6ouxkc.R.inc(4945);
      __CLR4_4_13t83t8le6ouxkc.R.inc(4946);this.typeParameterObj = obj;
      __CLR4_4_13t83t8le6ouxkc.R.inc(4947);this.typeParameterArray = array;
      __CLR4_4_13t83t8le6ouxkc.R.inc(4948);this.listOfTypeParameters = list;
      __CLR4_4_13t83t8le6ouxkc.R.inc(4949);this.arrayOfListOfTypeParameters = arrayOfList;
      __CLR4_4_13t83t8le6ouxkc.R.inc(4950);this.listOfWildcardTypeParameters = wildcardList;
      __CLR4_4_13t83t8le6ouxkc.R.inc(4951);this.arrayOfListOfWildcardTypeParameters = arrayOfWildcardList;
    }finally{__CLR4_4_13t83t8le6ouxkc.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_13t83t8le6ouxkc.R.inc(4952);
      __CLR4_4_13t83t8le6ouxkc.R.inc(4953);StringBuilder sb = new StringBuilder().append("{");

      __CLR4_4_13t83t8le6ouxkc.R.inc(4954);boolean needsComma = false;
      __CLR4_4_13t83t8le6ouxkc.R.inc(4955);if ((((typeParameterObj != null)&&(__CLR4_4_13t83t8le6ouxkc.R.iget(4956)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(4957)==0&false))) {{
        __CLR4_4_13t83t8le6ouxkc.R.inc(4958);sb.append("\"typeParameterObj\":").append(toString(typeParameterObj));
        __CLR4_4_13t83t8le6ouxkc.R.inc(4959);needsComma = true;
      }

      }__CLR4_4_13t83t8le6ouxkc.R.inc(4960);if ((((typeParameterArray != null)&&(__CLR4_4_13t83t8le6ouxkc.R.iget(4961)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(4962)==0&false))) {{
        __CLR4_4_13t83t8le6ouxkc.R.inc(4963);if ((((needsComma)&&(__CLR4_4_13t83t8le6ouxkc.R.iget(4964)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(4965)==0&false))) {{
          __CLR4_4_13t83t8le6ouxkc.R.inc(4966);sb.append(',');
        }
        }__CLR4_4_13t83t8le6ouxkc.R.inc(4967);sb.append("\"typeParameterArray\":[");
        __CLR4_4_13t83t8le6ouxkc.R.inc(4968);appendObjectsToBuilder(sb, Arrays.asList(typeParameterArray));
        __CLR4_4_13t83t8le6ouxkc.R.inc(4969);sb.append(']');
        __CLR4_4_13t83t8le6ouxkc.R.inc(4970);needsComma = true;
      }

      }__CLR4_4_13t83t8le6ouxkc.R.inc(4971);if ((((listOfTypeParameters != null)&&(__CLR4_4_13t83t8le6ouxkc.R.iget(4972)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(4973)==0&false))) {{
        __CLR4_4_13t83t8le6ouxkc.R.inc(4974);if ((((needsComma)&&(__CLR4_4_13t83t8le6ouxkc.R.iget(4975)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(4976)==0&false))) {{
          __CLR4_4_13t83t8le6ouxkc.R.inc(4977);sb.append(',');
        }
        }__CLR4_4_13t83t8le6ouxkc.R.inc(4978);sb.append("\"listOfTypeParameters\":[");
        __CLR4_4_13t83t8le6ouxkc.R.inc(4979);appendObjectsToBuilder(sb, listOfTypeParameters);
        __CLR4_4_13t83t8le6ouxkc.R.inc(4980);sb.append(']');
        __CLR4_4_13t83t8le6ouxkc.R.inc(4981);needsComma = true;
      }

      }__CLR4_4_13t83t8le6ouxkc.R.inc(4982);if ((((arrayOfListOfTypeParameters != null)&&(__CLR4_4_13t83t8le6ouxkc.R.iget(4983)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(4984)==0&false))) {{
        __CLR4_4_13t83t8le6ouxkc.R.inc(4985);if ((((needsComma)&&(__CLR4_4_13t83t8le6ouxkc.R.iget(4986)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(4987)==0&false))) {{
          __CLR4_4_13t83t8le6ouxkc.R.inc(4988);sb.append(',');
        }
        }__CLR4_4_13t83t8le6ouxkc.R.inc(4989);sb.append("\"arrayOfListOfTypeParameters\":[");
        __CLR4_4_13t83t8le6ouxkc.R.inc(4990);appendObjectsToBuilder(sb, arrayOfListOfTypeParameters);
        __CLR4_4_13t83t8le6ouxkc.R.inc(4991);sb.append(']');
        __CLR4_4_13t83t8le6ouxkc.R.inc(4992);needsComma = true;
      }

      }__CLR4_4_13t83t8le6ouxkc.R.inc(4993);if ((((listOfWildcardTypeParameters != null)&&(__CLR4_4_13t83t8le6ouxkc.R.iget(4994)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(4995)==0&false))) {{
        __CLR4_4_13t83t8le6ouxkc.R.inc(4996);if ((((needsComma)&&(__CLR4_4_13t83t8le6ouxkc.R.iget(4997)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(4998)==0&false))) {{
          __CLR4_4_13t83t8le6ouxkc.R.inc(4999);sb.append(',');
        }
        }__CLR4_4_13t83t8le6ouxkc.R.inc(5000);sb.append("\"listOfWildcardTypeParameters\":[");
        __CLR4_4_13t83t8le6ouxkc.R.inc(5001);appendObjectsToBuilder(sb, listOfWildcardTypeParameters);
        __CLR4_4_13t83t8le6ouxkc.R.inc(5002);sb.append(']');
        __CLR4_4_13t83t8le6ouxkc.R.inc(5003);needsComma = true;
      }

      }__CLR4_4_13t83t8le6ouxkc.R.inc(5004);if ((((arrayOfListOfWildcardTypeParameters != null)&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5005)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5006)==0&false))) {{
        __CLR4_4_13t83t8le6ouxkc.R.inc(5007);if ((((needsComma)&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5008)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5009)==0&false))) {{
          __CLR4_4_13t83t8le6ouxkc.R.inc(5010);sb.append(',');
        }
        }__CLR4_4_13t83t8le6ouxkc.R.inc(5011);sb.append("\"arrayOfListOfWildcardTypeParameters\":[");
        __CLR4_4_13t83t8le6ouxkc.R.inc(5012);appendObjectsToBuilder(sb, arrayOfListOfWildcardTypeParameters);
        __CLR4_4_13t83t8le6ouxkc.R.inc(5013);sb.append(']');
        __CLR4_4_13t83t8le6ouxkc.R.inc(5014);needsComma = true;
      }
      }__CLR4_4_13t83t8le6ouxkc.R.inc(5015);sb.append('}');
      __CLR4_4_13t83t8le6ouxkc.R.inc(5016);return sb.toString();
    }finally{__CLR4_4_13t83t8le6ouxkc.R.flushNeeded();}}

    private void appendObjectsToBuilder(StringBuilder sb, Iterable<? extends T> iterable) {try{__CLR4_4_13t83t8le6ouxkc.R.inc(5017);
      __CLR4_4_13t83t8le6ouxkc.R.inc(5018);boolean isFirst = true;
      __CLR4_4_13t83t8le6ouxkc.R.inc(5019);for (T obj : iterable) {{
        __CLR4_4_13t83t8le6ouxkc.R.inc(5020);if ((((!isFirst)&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5021)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5022)==0&false))) {{
          __CLR4_4_13t83t8le6ouxkc.R.inc(5023);sb.append(',');
        }
        }__CLR4_4_13t83t8le6ouxkc.R.inc(5024);isFirst = false;
        __CLR4_4_13t83t8le6ouxkc.R.inc(5025);sb.append(toString(obj));
      }
    }}finally{__CLR4_4_13t83t8le6ouxkc.R.flushNeeded();}}

    private void appendObjectsToBuilder(StringBuilder sb, List<? extends T>[] arrayOfList) {try{__CLR4_4_13t83t8le6ouxkc.R.inc(5026);
      __CLR4_4_13t83t8le6ouxkc.R.inc(5027);boolean isFirst = true;
      __CLR4_4_13t83t8le6ouxkc.R.inc(5028);for (List<? extends T> list : arrayOfList) {{
        __CLR4_4_13t83t8le6ouxkc.R.inc(5029);if ((((!isFirst)&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5030)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5031)==0&false))) {{
          __CLR4_4_13t83t8le6ouxkc.R.inc(5032);sb.append(',');
        }
        }__CLR4_4_13t83t8le6ouxkc.R.inc(5033);isFirst = false;
        __CLR4_4_13t83t8le6ouxkc.R.inc(5034);if ((((list != null)&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5035)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5036)==0&false))) {{
          __CLR4_4_13t83t8le6ouxkc.R.inc(5037);sb.append('[');
          __CLR4_4_13t83t8le6ouxkc.R.inc(5038);appendObjectsToBuilder(sb, list);
          __CLR4_4_13t83t8le6ouxkc.R.inc(5039);sb.append(']');
        } }else {{
          __CLR4_4_13t83t8le6ouxkc.R.inc(5040);sb.append("null");
        }
      }}
    }}finally{__CLR4_4_13t83t8le6ouxkc.R.flushNeeded();}}

    public String toString(T obj) {try{__CLR4_4_13t83t8le6ouxkc.R.inc(5041);
      __CLR4_4_13t83t8le6ouxkc.R.inc(5042);return obj.toString();
    }finally{__CLR4_4_13t83t8le6ouxkc.R.flushNeeded();}}
  }

  private static class MultiParameters<A, B, C, D, E> {
    A a;
    B b;
    C c;
    D d;
    E e;
    // For use by Gson
    @SuppressWarnings("unused")
    private MultiParameters() {try{__CLR4_4_13t83t8le6ouxkc.R.inc(5043);
    }finally{__CLR4_4_13t83t8le6ouxkc.R.flushNeeded();}}
    MultiParameters(A a, B b, C c, D d, E e) {
      super();__CLR4_4_13t83t8le6ouxkc.R.inc(5045);try{__CLR4_4_13t83t8le6ouxkc.R.inc(5044);
      __CLR4_4_13t83t8le6ouxkc.R.inc(5046);this.a = a;
      __CLR4_4_13t83t8le6ouxkc.R.inc(5047);this.b = b;
      __CLR4_4_13t83t8le6ouxkc.R.inc(5048);this.c = c;
      __CLR4_4_13t83t8le6ouxkc.R.inc(5049);this.d = d;
      __CLR4_4_13t83t8le6ouxkc.R.inc(5050);this.e = e;
    }finally{__CLR4_4_13t83t8le6ouxkc.R.flushNeeded();}}
    @Override
    public int hashCode() {try{__CLR4_4_13t83t8le6ouxkc.R.inc(5051);
      __CLR4_4_13t83t8le6ouxkc.R.inc(5052);final int prime = 31;
      __CLR4_4_13t83t8le6ouxkc.R.inc(5053);int result = 1;
      __CLR4_4_13t83t8le6ouxkc.R.inc(5054);result = prime * result + (((((a == null) )&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5055)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5056)==0&false))? 0 : a.hashCode());
      __CLR4_4_13t83t8le6ouxkc.R.inc(5057);result = prime * result + (((((b == null) )&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5058)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5059)==0&false))? 0 : b.hashCode());
      __CLR4_4_13t83t8le6ouxkc.R.inc(5060);result = prime * result + (((((c == null) )&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5061)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5062)==0&false))? 0 : c.hashCode());
      __CLR4_4_13t83t8le6ouxkc.R.inc(5063);result = prime * result + (((((d == null) )&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5064)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5065)==0&false))? 0 : d.hashCode());
      __CLR4_4_13t83t8le6ouxkc.R.inc(5066);result = prime * result + (((((e == null) )&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5067)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5068)==0&false))? 0 : e.hashCode());
      __CLR4_4_13t83t8le6ouxkc.R.inc(5069);return result;
    }finally{__CLR4_4_13t83t8le6ouxkc.R.flushNeeded();}}
    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object obj) {try{__CLR4_4_13t83t8le6ouxkc.R.inc(5070);
      __CLR4_4_13t83t8le6ouxkc.R.inc(5071);if ((((this == obj)&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5072)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5073)==0&false))) {{
        __CLR4_4_13t83t8le6ouxkc.R.inc(5074);return true;
      }
      }__CLR4_4_13t83t8le6ouxkc.R.inc(5075);if ((((obj == null)&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5076)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5077)==0&false))) {{
        __CLR4_4_13t83t8le6ouxkc.R.inc(5078);return false;
      }
      }__CLR4_4_13t83t8le6ouxkc.R.inc(5079);if ((((getClass() != obj.getClass())&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5080)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5081)==0&false))) {{
        __CLR4_4_13t83t8le6ouxkc.R.inc(5082);return false;
      }
      }__CLR4_4_13t83t8le6ouxkc.R.inc(5083);MultiParameters<A, B, C, D, E> other = (MultiParameters<A, B, C, D, E>) obj;
      __CLR4_4_13t83t8le6ouxkc.R.inc(5084);if ((((a == null)&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5085)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5086)==0&false))) {{
        __CLR4_4_13t83t8le6ouxkc.R.inc(5087);if ((((other.a != null)&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5088)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5089)==0&false))) {{
          __CLR4_4_13t83t8le6ouxkc.R.inc(5090);return false;
        }
      }} }else {__CLR4_4_13t83t8le6ouxkc.R.inc(5091);if ((((!a.equals(other.a))&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5092)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5093)==0&false))) {{
        __CLR4_4_13t83t8le6ouxkc.R.inc(5094);return false;
      }
      }}__CLR4_4_13t83t8le6ouxkc.R.inc(5095);if ((((b == null)&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5096)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5097)==0&false))) {{
        __CLR4_4_13t83t8le6ouxkc.R.inc(5098);if ((((other.b != null)&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5099)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5100)==0&false))) {{
          __CLR4_4_13t83t8le6ouxkc.R.inc(5101);return false;
        }
      }} }else {__CLR4_4_13t83t8le6ouxkc.R.inc(5102);if ((((!b.equals(other.b))&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5103)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5104)==0&false))) {{
        __CLR4_4_13t83t8le6ouxkc.R.inc(5105);return false;
      }
      }}__CLR4_4_13t83t8le6ouxkc.R.inc(5106);if ((((c == null)&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5107)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5108)==0&false))) {{
        __CLR4_4_13t83t8le6ouxkc.R.inc(5109);if ((((other.c != null)&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5110)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5111)==0&false))) {{
          __CLR4_4_13t83t8le6ouxkc.R.inc(5112);return false;
        }
      }} }else {__CLR4_4_13t83t8le6ouxkc.R.inc(5113);if ((((!c.equals(other.c))&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5114)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5115)==0&false))) {{
        __CLR4_4_13t83t8le6ouxkc.R.inc(5116);return false;
      }
      }}__CLR4_4_13t83t8le6ouxkc.R.inc(5117);if ((((d == null)&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5118)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5119)==0&false))) {{
        __CLR4_4_13t83t8le6ouxkc.R.inc(5120);if ((((other.d != null)&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5121)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5122)==0&false))) {{
          __CLR4_4_13t83t8le6ouxkc.R.inc(5123);return false;
        }
      }} }else {__CLR4_4_13t83t8le6ouxkc.R.inc(5124);if ((((!d.equals(other.d))&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5125)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5126)==0&false))) {{
        __CLR4_4_13t83t8le6ouxkc.R.inc(5127);return false;
      }
      }}__CLR4_4_13t83t8le6ouxkc.R.inc(5128);if ((((e == null)&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5129)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5130)==0&false))) {{
        __CLR4_4_13t83t8le6ouxkc.R.inc(5131);if ((((other.e != null)&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5132)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5133)==0&false))) {{
          __CLR4_4_13t83t8le6ouxkc.R.inc(5134);return false;
        }
      }} }else {__CLR4_4_13t83t8le6ouxkc.R.inc(5135);if ((((!e.equals(other.e))&&(__CLR4_4_13t83t8le6ouxkc.R.iget(5136)!=0|true))||(__CLR4_4_13t83t8le6ouxkc.R.iget(5137)==0&false))) {{
        __CLR4_4_13t83t8le6ouxkc.R.inc(5138);return false;
      }
      }}__CLR4_4_13t83t8le6ouxkc.R.inc(5139);return true;
    }finally{__CLR4_4_13t83t8le6ouxkc.R.flushNeeded();}}
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
