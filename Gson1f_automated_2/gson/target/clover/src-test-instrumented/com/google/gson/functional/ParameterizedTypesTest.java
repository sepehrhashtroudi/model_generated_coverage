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
public class ParameterizedTypesTest extends TestCase {static class __CLR4_4_13sq3sqld3n63a1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674165929950L,8589935092L,5122,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13sq3sqld3n63a1.R.inc(4922);
    __CLR4_4_13sq3sqld3n63a1.R.inc(4923);super.setUp();
    __CLR4_4_13sq3sqld3n63a1.R.inc(4924);gson = new Gson();
  }finally{__CLR4_4_13sq3sqld3n63a1.R.flushNeeded();}}

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

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
      this(null, null, null, null, null, null);__CLR4_4_13sq3sqld3n63a1.R.inc(4926);try{__CLR4_4_13sq3sqld3n63a1.R.inc(4925);
    }finally{__CLR4_4_13sq3sqld3n63a1.R.flushNeeded();}}

    public ObjectWithTypeVariables(T obj, T[] array, List<T> list, List<T>[] arrayOfList,
        List<? extends T> wildcardList, List<? extends T>[] arrayOfWildcardList) {try{__CLR4_4_13sq3sqld3n63a1.R.inc(4927);
      __CLR4_4_13sq3sqld3n63a1.R.inc(4928);this.typeParameterObj = obj;
      __CLR4_4_13sq3sqld3n63a1.R.inc(4929);this.typeParameterArray = array;
      __CLR4_4_13sq3sqld3n63a1.R.inc(4930);this.listOfTypeParameters = list;
      __CLR4_4_13sq3sqld3n63a1.R.inc(4931);this.arrayOfListOfTypeParameters = arrayOfList;
      __CLR4_4_13sq3sqld3n63a1.R.inc(4932);this.listOfWildcardTypeParameters = wildcardList;
      __CLR4_4_13sq3sqld3n63a1.R.inc(4933);this.arrayOfListOfWildcardTypeParameters = arrayOfWildcardList;
    }finally{__CLR4_4_13sq3sqld3n63a1.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_13sq3sqld3n63a1.R.inc(4934);
      __CLR4_4_13sq3sqld3n63a1.R.inc(4935);StringBuilder sb = new StringBuilder().append("{");

      __CLR4_4_13sq3sqld3n63a1.R.inc(4936);boolean needsComma = false;
      __CLR4_4_13sq3sqld3n63a1.R.inc(4937);if ((((typeParameterObj != null)&&(__CLR4_4_13sq3sqld3n63a1.R.iget(4938)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(4939)==0&false))) {{
        __CLR4_4_13sq3sqld3n63a1.R.inc(4940);sb.append("\"typeParameterObj\":").append(toString(typeParameterObj));
        __CLR4_4_13sq3sqld3n63a1.R.inc(4941);needsComma = true;
      }

      }__CLR4_4_13sq3sqld3n63a1.R.inc(4942);if ((((typeParameterArray != null)&&(__CLR4_4_13sq3sqld3n63a1.R.iget(4943)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(4944)==0&false))) {{
        __CLR4_4_13sq3sqld3n63a1.R.inc(4945);if ((((needsComma)&&(__CLR4_4_13sq3sqld3n63a1.R.iget(4946)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(4947)==0&false))) {{
          __CLR4_4_13sq3sqld3n63a1.R.inc(4948);sb.append(',');
        }
        }__CLR4_4_13sq3sqld3n63a1.R.inc(4949);sb.append("\"typeParameterArray\":[");
        __CLR4_4_13sq3sqld3n63a1.R.inc(4950);appendObjectsToBuilder(sb, Arrays.asList(typeParameterArray));
        __CLR4_4_13sq3sqld3n63a1.R.inc(4951);sb.append(']');
        __CLR4_4_13sq3sqld3n63a1.R.inc(4952);needsComma = true;
      }

      }__CLR4_4_13sq3sqld3n63a1.R.inc(4953);if ((((listOfTypeParameters != null)&&(__CLR4_4_13sq3sqld3n63a1.R.iget(4954)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(4955)==0&false))) {{
        __CLR4_4_13sq3sqld3n63a1.R.inc(4956);if ((((needsComma)&&(__CLR4_4_13sq3sqld3n63a1.R.iget(4957)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(4958)==0&false))) {{
          __CLR4_4_13sq3sqld3n63a1.R.inc(4959);sb.append(',');
        }
        }__CLR4_4_13sq3sqld3n63a1.R.inc(4960);sb.append("\"listOfTypeParameters\":[");
        __CLR4_4_13sq3sqld3n63a1.R.inc(4961);appendObjectsToBuilder(sb, listOfTypeParameters);
        __CLR4_4_13sq3sqld3n63a1.R.inc(4962);sb.append(']');
        __CLR4_4_13sq3sqld3n63a1.R.inc(4963);needsComma = true;
      }

      }__CLR4_4_13sq3sqld3n63a1.R.inc(4964);if ((((arrayOfListOfTypeParameters != null)&&(__CLR4_4_13sq3sqld3n63a1.R.iget(4965)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(4966)==0&false))) {{
        __CLR4_4_13sq3sqld3n63a1.R.inc(4967);if ((((needsComma)&&(__CLR4_4_13sq3sqld3n63a1.R.iget(4968)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(4969)==0&false))) {{
          __CLR4_4_13sq3sqld3n63a1.R.inc(4970);sb.append(',');
        }
        }__CLR4_4_13sq3sqld3n63a1.R.inc(4971);sb.append("\"arrayOfListOfTypeParameters\":[");
        __CLR4_4_13sq3sqld3n63a1.R.inc(4972);appendObjectsToBuilder(sb, arrayOfListOfTypeParameters);
        __CLR4_4_13sq3sqld3n63a1.R.inc(4973);sb.append(']');
        __CLR4_4_13sq3sqld3n63a1.R.inc(4974);needsComma = true;
      }

      }__CLR4_4_13sq3sqld3n63a1.R.inc(4975);if ((((listOfWildcardTypeParameters != null)&&(__CLR4_4_13sq3sqld3n63a1.R.iget(4976)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(4977)==0&false))) {{
        __CLR4_4_13sq3sqld3n63a1.R.inc(4978);if ((((needsComma)&&(__CLR4_4_13sq3sqld3n63a1.R.iget(4979)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(4980)==0&false))) {{
          __CLR4_4_13sq3sqld3n63a1.R.inc(4981);sb.append(',');
        }
        }__CLR4_4_13sq3sqld3n63a1.R.inc(4982);sb.append("\"listOfWildcardTypeParameters\":[");
        __CLR4_4_13sq3sqld3n63a1.R.inc(4983);appendObjectsToBuilder(sb, listOfWildcardTypeParameters);
        __CLR4_4_13sq3sqld3n63a1.R.inc(4984);sb.append(']');
        __CLR4_4_13sq3sqld3n63a1.R.inc(4985);needsComma = true;
      }

      }__CLR4_4_13sq3sqld3n63a1.R.inc(4986);if ((((arrayOfListOfWildcardTypeParameters != null)&&(__CLR4_4_13sq3sqld3n63a1.R.iget(4987)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(4988)==0&false))) {{
        __CLR4_4_13sq3sqld3n63a1.R.inc(4989);if ((((needsComma)&&(__CLR4_4_13sq3sqld3n63a1.R.iget(4990)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(4991)==0&false))) {{
          __CLR4_4_13sq3sqld3n63a1.R.inc(4992);sb.append(',');
        }
        }__CLR4_4_13sq3sqld3n63a1.R.inc(4993);sb.append("\"arrayOfListOfWildcardTypeParameters\":[");
        __CLR4_4_13sq3sqld3n63a1.R.inc(4994);appendObjectsToBuilder(sb, arrayOfListOfWildcardTypeParameters);
        __CLR4_4_13sq3sqld3n63a1.R.inc(4995);sb.append(']');
        __CLR4_4_13sq3sqld3n63a1.R.inc(4996);needsComma = true;
      }
      }__CLR4_4_13sq3sqld3n63a1.R.inc(4997);sb.append('}');
      __CLR4_4_13sq3sqld3n63a1.R.inc(4998);return sb.toString();
    }finally{__CLR4_4_13sq3sqld3n63a1.R.flushNeeded();}}

    private void appendObjectsToBuilder(StringBuilder sb, Iterable<? extends T> iterable) {try{__CLR4_4_13sq3sqld3n63a1.R.inc(4999);
      __CLR4_4_13sq3sqld3n63a1.R.inc(5000);boolean isFirst = true;
      __CLR4_4_13sq3sqld3n63a1.R.inc(5001);for (T obj : iterable) {{
        __CLR4_4_13sq3sqld3n63a1.R.inc(5002);if ((((!isFirst)&&(__CLR4_4_13sq3sqld3n63a1.R.iget(5003)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(5004)==0&false))) {{
          __CLR4_4_13sq3sqld3n63a1.R.inc(5005);sb.append(',');
        }
        }__CLR4_4_13sq3sqld3n63a1.R.inc(5006);isFirst = false;
        __CLR4_4_13sq3sqld3n63a1.R.inc(5007);sb.append(toString(obj));
      }
    }}finally{__CLR4_4_13sq3sqld3n63a1.R.flushNeeded();}}

    private void appendObjectsToBuilder(StringBuilder sb, List<? extends T>[] arrayOfList) {try{__CLR4_4_13sq3sqld3n63a1.R.inc(5008);
      __CLR4_4_13sq3sqld3n63a1.R.inc(5009);boolean isFirst = true;
      __CLR4_4_13sq3sqld3n63a1.R.inc(5010);for (List<? extends T> list : arrayOfList) {{
        __CLR4_4_13sq3sqld3n63a1.R.inc(5011);if ((((!isFirst)&&(__CLR4_4_13sq3sqld3n63a1.R.iget(5012)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(5013)==0&false))) {{
          __CLR4_4_13sq3sqld3n63a1.R.inc(5014);sb.append(',');
        }
        }__CLR4_4_13sq3sqld3n63a1.R.inc(5015);isFirst = false;
        __CLR4_4_13sq3sqld3n63a1.R.inc(5016);if ((((list != null)&&(__CLR4_4_13sq3sqld3n63a1.R.iget(5017)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(5018)==0&false))) {{
          __CLR4_4_13sq3sqld3n63a1.R.inc(5019);sb.append('[');
          __CLR4_4_13sq3sqld3n63a1.R.inc(5020);appendObjectsToBuilder(sb, list);
          __CLR4_4_13sq3sqld3n63a1.R.inc(5021);sb.append(']');
        } }else {{
          __CLR4_4_13sq3sqld3n63a1.R.inc(5022);sb.append("null");
        }
      }}
    }}finally{__CLR4_4_13sq3sqld3n63a1.R.flushNeeded();}}

    public String toString(T obj) {try{__CLR4_4_13sq3sqld3n63a1.R.inc(5023);
      __CLR4_4_13sq3sqld3n63a1.R.inc(5024);return obj.toString();
    }finally{__CLR4_4_13sq3sqld3n63a1.R.flushNeeded();}}
  }

  private static class MultiParameters<A, B, C, D, E> {
    A a;
    B b;
    C c;
    D d;
    E e;
    // For use by Gson
    @SuppressWarnings("unused")
    private MultiParameters() {try{__CLR4_4_13sq3sqld3n63a1.R.inc(5025);
    }finally{__CLR4_4_13sq3sqld3n63a1.R.flushNeeded();}}
    MultiParameters(A a, B b, C c, D d, E e) {
      super();__CLR4_4_13sq3sqld3n63a1.R.inc(5027);try{__CLR4_4_13sq3sqld3n63a1.R.inc(5026);
      __CLR4_4_13sq3sqld3n63a1.R.inc(5028);this.a = a;
      __CLR4_4_13sq3sqld3n63a1.R.inc(5029);this.b = b;
      __CLR4_4_13sq3sqld3n63a1.R.inc(5030);this.c = c;
      __CLR4_4_13sq3sqld3n63a1.R.inc(5031);this.d = d;
      __CLR4_4_13sq3sqld3n63a1.R.inc(5032);this.e = e;
    }finally{__CLR4_4_13sq3sqld3n63a1.R.flushNeeded();}}
    @Override
    public int hashCode() {try{__CLR4_4_13sq3sqld3n63a1.R.inc(5033);
      __CLR4_4_13sq3sqld3n63a1.R.inc(5034);final int prime = 31;
      __CLR4_4_13sq3sqld3n63a1.R.inc(5035);int result = 1;
      __CLR4_4_13sq3sqld3n63a1.R.inc(5036);result = prime * result + (((((a == null) )&&(__CLR4_4_13sq3sqld3n63a1.R.iget(5037)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(5038)==0&false))? 0 : a.hashCode());
      __CLR4_4_13sq3sqld3n63a1.R.inc(5039);result = prime * result + (((((b == null) )&&(__CLR4_4_13sq3sqld3n63a1.R.iget(5040)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(5041)==0&false))? 0 : b.hashCode());
      __CLR4_4_13sq3sqld3n63a1.R.inc(5042);result = prime * result + (((((c == null) )&&(__CLR4_4_13sq3sqld3n63a1.R.iget(5043)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(5044)==0&false))? 0 : c.hashCode());
      __CLR4_4_13sq3sqld3n63a1.R.inc(5045);result = prime * result + (((((d == null) )&&(__CLR4_4_13sq3sqld3n63a1.R.iget(5046)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(5047)==0&false))? 0 : d.hashCode());
      __CLR4_4_13sq3sqld3n63a1.R.inc(5048);result = prime * result + (((((e == null) )&&(__CLR4_4_13sq3sqld3n63a1.R.iget(5049)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(5050)==0&false))? 0 : e.hashCode());
      __CLR4_4_13sq3sqld3n63a1.R.inc(5051);return result;
    }finally{__CLR4_4_13sq3sqld3n63a1.R.flushNeeded();}}
    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object obj) {try{__CLR4_4_13sq3sqld3n63a1.R.inc(5052);
      __CLR4_4_13sq3sqld3n63a1.R.inc(5053);if ((((this == obj)&&(__CLR4_4_13sq3sqld3n63a1.R.iget(5054)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(5055)==0&false))) {{
        __CLR4_4_13sq3sqld3n63a1.R.inc(5056);return true;
      }
      }__CLR4_4_13sq3sqld3n63a1.R.inc(5057);if ((((obj == null)&&(__CLR4_4_13sq3sqld3n63a1.R.iget(5058)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(5059)==0&false))) {{
        __CLR4_4_13sq3sqld3n63a1.R.inc(5060);return false;
      }
      }__CLR4_4_13sq3sqld3n63a1.R.inc(5061);if ((((getClass() != obj.getClass())&&(__CLR4_4_13sq3sqld3n63a1.R.iget(5062)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(5063)==0&false))) {{
        __CLR4_4_13sq3sqld3n63a1.R.inc(5064);return false;
      }
      }__CLR4_4_13sq3sqld3n63a1.R.inc(5065);MultiParameters<A, B, C, D, E> other = (MultiParameters<A, B, C, D, E>) obj;
      __CLR4_4_13sq3sqld3n63a1.R.inc(5066);if ((((a == null)&&(__CLR4_4_13sq3sqld3n63a1.R.iget(5067)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(5068)==0&false))) {{
        __CLR4_4_13sq3sqld3n63a1.R.inc(5069);if ((((other.a != null)&&(__CLR4_4_13sq3sqld3n63a1.R.iget(5070)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(5071)==0&false))) {{
          __CLR4_4_13sq3sqld3n63a1.R.inc(5072);return false;
        }
      }} }else {__CLR4_4_13sq3sqld3n63a1.R.inc(5073);if ((((!a.equals(other.a))&&(__CLR4_4_13sq3sqld3n63a1.R.iget(5074)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(5075)==0&false))) {{
        __CLR4_4_13sq3sqld3n63a1.R.inc(5076);return false;
      }
      }}__CLR4_4_13sq3sqld3n63a1.R.inc(5077);if ((((b == null)&&(__CLR4_4_13sq3sqld3n63a1.R.iget(5078)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(5079)==0&false))) {{
        __CLR4_4_13sq3sqld3n63a1.R.inc(5080);if ((((other.b != null)&&(__CLR4_4_13sq3sqld3n63a1.R.iget(5081)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(5082)==0&false))) {{
          __CLR4_4_13sq3sqld3n63a1.R.inc(5083);return false;
        }
      }} }else {__CLR4_4_13sq3sqld3n63a1.R.inc(5084);if ((((!b.equals(other.b))&&(__CLR4_4_13sq3sqld3n63a1.R.iget(5085)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(5086)==0&false))) {{
        __CLR4_4_13sq3sqld3n63a1.R.inc(5087);return false;
      }
      }}__CLR4_4_13sq3sqld3n63a1.R.inc(5088);if ((((c == null)&&(__CLR4_4_13sq3sqld3n63a1.R.iget(5089)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(5090)==0&false))) {{
        __CLR4_4_13sq3sqld3n63a1.R.inc(5091);if ((((other.c != null)&&(__CLR4_4_13sq3sqld3n63a1.R.iget(5092)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(5093)==0&false))) {{
          __CLR4_4_13sq3sqld3n63a1.R.inc(5094);return false;
        }
      }} }else {__CLR4_4_13sq3sqld3n63a1.R.inc(5095);if ((((!c.equals(other.c))&&(__CLR4_4_13sq3sqld3n63a1.R.iget(5096)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(5097)==0&false))) {{
        __CLR4_4_13sq3sqld3n63a1.R.inc(5098);return false;
      }
      }}__CLR4_4_13sq3sqld3n63a1.R.inc(5099);if ((((d == null)&&(__CLR4_4_13sq3sqld3n63a1.R.iget(5100)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(5101)==0&false))) {{
        __CLR4_4_13sq3sqld3n63a1.R.inc(5102);if ((((other.d != null)&&(__CLR4_4_13sq3sqld3n63a1.R.iget(5103)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(5104)==0&false))) {{
          __CLR4_4_13sq3sqld3n63a1.R.inc(5105);return false;
        }
      }} }else {__CLR4_4_13sq3sqld3n63a1.R.inc(5106);if ((((!d.equals(other.d))&&(__CLR4_4_13sq3sqld3n63a1.R.iget(5107)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(5108)==0&false))) {{
        __CLR4_4_13sq3sqld3n63a1.R.inc(5109);return false;
      }
      }}__CLR4_4_13sq3sqld3n63a1.R.inc(5110);if ((((e == null)&&(__CLR4_4_13sq3sqld3n63a1.R.iget(5111)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(5112)==0&false))) {{
        __CLR4_4_13sq3sqld3n63a1.R.inc(5113);if ((((other.e != null)&&(__CLR4_4_13sq3sqld3n63a1.R.iget(5114)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(5115)==0&false))) {{
          __CLR4_4_13sq3sqld3n63a1.R.inc(5116);return false;
        }
      }} }else {__CLR4_4_13sq3sqld3n63a1.R.inc(5117);if ((((!e.equals(other.e))&&(__CLR4_4_13sq3sqld3n63a1.R.iget(5118)!=0|true))||(__CLR4_4_13sq3sqld3n63a1.R.iget(5119)==0&false))) {{
        __CLR4_4_13sq3sqld3n63a1.R.inc(5120);return false;
      }
      }}__CLR4_4_13sq3sqld3n63a1.R.inc(5121);return true;
    }finally{__CLR4_4_13sq3sqld3n63a1.R.flushNeeded();}}
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
