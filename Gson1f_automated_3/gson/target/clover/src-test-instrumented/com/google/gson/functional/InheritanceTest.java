/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2009 Google Inc.
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
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.common.TestTypes.Base;
import com.google.gson.common.TestTypes.ClassWithBaseArrayField;
import com.google.gson.common.TestTypes.ClassWithBaseField;
import com.google.gson.common.TestTypes.Nested;
import com.google.gson.common.TestTypes.Sub;

import junit.framework.TestCase;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Functional tests for Json serialization and deserialization of classes with 
 * inheritance hierarchies.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class InheritanceTest extends TestCase {static class __CLR4_4_13mo3mole6p2024{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676527279339L,8589935092L,4788,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13mo3mole6p2024.R.inc(4704);
    __CLR4_4_13mo3mole6p2024.R.inc(4705);super.setUp();
    __CLR4_4_13mo3mole6p2024.R.inc(4706);gson = new Gson();
  }finally{__CLR4_4_13mo3mole6p2024.R.flushNeeded();}}

public void testCharacterSerialization27() throws Exception {__CLR4_4_13mo3mole6p2024.R.globalSliceStart(getClass().getName(),4707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_150mx2z3mr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13mo3mole6p2024.R.rethrow($CLV_t2$);}finally{__CLR4_4_13mo3mole6p2024.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InheritanceTest.testCharacterSerialization27",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4707,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_150mx2z3mr() throws Exception{try{__CLR4_4_13mo3mole6p2024.R.inc(4707); 
     __CLR4_4_13mo3mole6p2024.R.inc(4708);Character character = 'a'; 
     __CLR4_4_13mo3mole6p2024.R.inc(4709);JsonElement json = gson.toJsonTree(character); 
     __CLR4_4_13mo3mole6p2024.R.inc(4710);assertTrue(json.isJsonArray()); 
     __CLR4_4_13mo3mole6p2024.R.inc(4711);JsonArray array = json.getAsJsonArray(); 
     __CLR4_4_13mo3mole6p2024.R.inc(4712);assertEquals('a', array.get(0).getAsString()); 
     __CLR4_4_13mo3mole6p2024.R.inc(4713);assertEquals('a', array.get(1).getAsString()); 
 }finally{__CLR4_4_13mo3mole6p2024.R.flushNeeded();}}
  

  

  

  

  

  

  

  

  

  

  private static class SubTypeOfNested extends Nested {
    private final long value = 5;

    // Used by Gson
    @SuppressWarnings("unused")
    private SubTypeOfNested() {
      this(null, null);__CLR4_4_13mo3mole6p2024.R.inc(4715);try{__CLR4_4_13mo3mole6p2024.R.inc(4714);
    }finally{__CLR4_4_13mo3mole6p2024.R.flushNeeded();}}

    public SubTypeOfNested(BagOfPrimitives primitive1, BagOfPrimitives primitive2) {
      super(primitive1, primitive2);__CLR4_4_13mo3mole6p2024.R.inc(4717);try{__CLR4_4_13mo3mole6p2024.R.inc(4716);
    }finally{__CLR4_4_13mo3mole6p2024.R.flushNeeded();}}

    @Override
    public void appendFields(StringBuilder sb) {try{__CLR4_4_13mo3mole6p2024.R.inc(4718);
      __CLR4_4_13mo3mole6p2024.R.inc(4719);sb.append("\"value\":").append(value).append(",");
      __CLR4_4_13mo3mole6p2024.R.inc(4720);super.appendFields(sb);
    }finally{__CLR4_4_13mo3mole6p2024.R.flushNeeded();}}
  }

  

  
  
  private static class ClassWithSubInterfacesOfCollection {
    private List<Integer> list;
    private Queue<Long> queue;
    private Set<Float> set;
    private SortedSet<Character> sortedSet;

    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithSubInterfacesOfCollection() {try{__CLR4_4_13mo3mole6p2024.R.inc(4721);
    }finally{__CLR4_4_13mo3mole6p2024.R.flushNeeded();}}

    public ClassWithSubInterfacesOfCollection(List<Integer> list, Queue<Long> queue, Set<Float> set,
        SortedSet<Character> sortedSet) {try{__CLR4_4_13mo3mole6p2024.R.inc(4722);
      __CLR4_4_13mo3mole6p2024.R.inc(4723);this.list = list;
      __CLR4_4_13mo3mole6p2024.R.inc(4724);this.queue = queue;
      __CLR4_4_13mo3mole6p2024.R.inc(4725);this.set = set;
      __CLR4_4_13mo3mole6p2024.R.inc(4726);this.sortedSet = sortedSet;
    }finally{__CLR4_4_13mo3mole6p2024.R.flushNeeded();}}

    boolean listContains(int... values) {try{__CLR4_4_13mo3mole6p2024.R.inc(4727);
      __CLR4_4_13mo3mole6p2024.R.inc(4728);for (int value : values) {{
        __CLR4_4_13mo3mole6p2024.R.inc(4729);if ((((!list.contains(value))&&(__CLR4_4_13mo3mole6p2024.R.iget(4730)!=0|true))||(__CLR4_4_13mo3mole6p2024.R.iget(4731)==0&false))) {{
          __CLR4_4_13mo3mole6p2024.R.inc(4732);return false;
        }
      }}
      }__CLR4_4_13mo3mole6p2024.R.inc(4733);return true;
    }finally{__CLR4_4_13mo3mole6p2024.R.flushNeeded();}}
    
    boolean queueContains(long... values) {try{__CLR4_4_13mo3mole6p2024.R.inc(4734);
      __CLR4_4_13mo3mole6p2024.R.inc(4735);for (long value : values) {{
        __CLR4_4_13mo3mole6p2024.R.inc(4736);if ((((!queue.contains(value))&&(__CLR4_4_13mo3mole6p2024.R.iget(4737)!=0|true))||(__CLR4_4_13mo3mole6p2024.R.iget(4738)==0&false))) {{
          __CLR4_4_13mo3mole6p2024.R.inc(4739);return false;
        }
      }}
      }__CLR4_4_13mo3mole6p2024.R.inc(4740);return true;      
    }finally{__CLR4_4_13mo3mole6p2024.R.flushNeeded();}}
    
    boolean setContains(float... values) {try{__CLR4_4_13mo3mole6p2024.R.inc(4741);
      __CLR4_4_13mo3mole6p2024.R.inc(4742);for (float value : values) {{
        __CLR4_4_13mo3mole6p2024.R.inc(4743);if ((((!set.contains(value))&&(__CLR4_4_13mo3mole6p2024.R.iget(4744)!=0|true))||(__CLR4_4_13mo3mole6p2024.R.iget(4745)==0&false))) {{
          __CLR4_4_13mo3mole6p2024.R.inc(4746);return false;
        }
      }}
      }__CLR4_4_13mo3mole6p2024.R.inc(4747);return true;
    }finally{__CLR4_4_13mo3mole6p2024.R.flushNeeded();}}

    boolean sortedSetContains(char... values) {try{__CLR4_4_13mo3mole6p2024.R.inc(4748);
      __CLR4_4_13mo3mole6p2024.R.inc(4749);for (char value : values) {{
        __CLR4_4_13mo3mole6p2024.R.inc(4750);if ((((!sortedSet.contains(value))&&(__CLR4_4_13mo3mole6p2024.R.iget(4751)!=0|true))||(__CLR4_4_13mo3mole6p2024.R.iget(4752)==0&false))) {{
          __CLR4_4_13mo3mole6p2024.R.inc(4753);return false;
        }
      }}
      }__CLR4_4_13mo3mole6p2024.R.inc(4754);return true;      
    }finally{__CLR4_4_13mo3mole6p2024.R.flushNeeded();}}
    
    public String getExpectedJson() {try{__CLR4_4_13mo3mole6p2024.R.inc(4755);
      __CLR4_4_13mo3mole6p2024.R.inc(4756);StringBuilder sb = new StringBuilder();
      __CLR4_4_13mo3mole6p2024.R.inc(4757);sb.append("{");
      __CLR4_4_13mo3mole6p2024.R.inc(4758);sb.append("\"list\":");
      __CLR4_4_13mo3mole6p2024.R.inc(4759);append(sb, list).append(",");
      __CLR4_4_13mo3mole6p2024.R.inc(4760);sb.append("\"queue\":");
      __CLR4_4_13mo3mole6p2024.R.inc(4761);append(sb, queue).append(",");
      __CLR4_4_13mo3mole6p2024.R.inc(4762);sb.append("\"set\":");
      __CLR4_4_13mo3mole6p2024.R.inc(4763);append(sb, set).append(",");
      __CLR4_4_13mo3mole6p2024.R.inc(4764);sb.append("\"sortedSet\":");
      __CLR4_4_13mo3mole6p2024.R.inc(4765);append(sb, sortedSet);
      __CLR4_4_13mo3mole6p2024.R.inc(4766);sb.append("}");
      __CLR4_4_13mo3mole6p2024.R.inc(4767);return sb.toString();
    }finally{__CLR4_4_13mo3mole6p2024.R.flushNeeded();}}

    private StringBuilder append(StringBuilder sb, Collection<?> c) {try{__CLR4_4_13mo3mole6p2024.R.inc(4768);
      __CLR4_4_13mo3mole6p2024.R.inc(4769);sb.append("[");
      __CLR4_4_13mo3mole6p2024.R.inc(4770);boolean first = true;
      __CLR4_4_13mo3mole6p2024.R.inc(4771);for (Object o : c) {{
        __CLR4_4_13mo3mole6p2024.R.inc(4772);if ((((!first)&&(__CLR4_4_13mo3mole6p2024.R.iget(4773)!=0|true))||(__CLR4_4_13mo3mole6p2024.R.iget(4774)==0&false))) {{
          __CLR4_4_13mo3mole6p2024.R.inc(4775);sb.append(",");
        } }else {{
          __CLR4_4_13mo3mole6p2024.R.inc(4776);first = false;
        }
        }__CLR4_4_13mo3mole6p2024.R.inc(4777);if ((((o instanceof String || o instanceof Character)&&(__CLR4_4_13mo3mole6p2024.R.iget(4778)!=0|true))||(__CLR4_4_13mo3mole6p2024.R.iget(4779)==0&false))) {{
          __CLR4_4_13mo3mole6p2024.R.inc(4780);sb.append('\"');
        }
        }__CLR4_4_13mo3mole6p2024.R.inc(4781);sb.append(o.toString());
        __CLR4_4_13mo3mole6p2024.R.inc(4782);if ((((o instanceof String || o instanceof Character)&&(__CLR4_4_13mo3mole6p2024.R.iget(4783)!=0|true))||(__CLR4_4_13mo3mole6p2024.R.iget(4784)==0&false))) {{
          __CLR4_4_13mo3mole6p2024.R.inc(4785);sb.append('\"');
        }
      }}
      }__CLR4_4_13mo3mole6p2024.R.inc(4786);sb.append("]");
      __CLR4_4_13mo3mole6p2024.R.inc(4787);return sb;
    }finally{__CLR4_4_13mo3mole6p2024.R.flushNeeded();}}
  }
}
