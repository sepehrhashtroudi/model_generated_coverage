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
public class InheritanceTest extends TestCase {static class __CLR4_4_143t43tld3ms42j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674165277821L,8589935092L,5425,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_143t43tld3ms42j.R.inc(5321);
    __CLR4_4_143t43tld3ms42j.R.inc(5322);super.setUp();
    __CLR4_4_143t43tld3ms42j.R.inc(5323);gson = new Gson();
  }finally{__CLR4_4_143t43tld3ms42j.R.flushNeeded();}}


public void testBaseSerializedAsSub12() {__CLR4_4_143t43tld3ms42j.R.globalSliceStart(getClass().getName(),5324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gj2lsh43w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_143t43tld3ms42j.R.rethrow($CLV_t2$);}finally{__CLR4_4_143t43tld3ms42j.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InheritanceTest.testBaseSerializedAsSub12",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gj2lsh43w(){try{__CLR4_4_143t43tld3ms42j.R.inc(5324); 
     __CLR4_4_143t43tld3ms42j.R.inc(5325);Base base = new Sub(); 
     __CLR4_4_143t43tld3ms42j.R.inc(5326);JsonObject json = gson.toJsonTree(base).getAsJsonObject(); 
     __CLR4_4_143t43tld3ms42j.R.inc(5327);assertEquals(Sub.SUB_NAME, json.get(Sub.SUB_FIELD_KEY).getAsString()); 
 }finally{__CLR4_4_143t43tld3ms42j.R.flushNeeded();}} 


public void testSubInterfacesOfCollectionSerialization118() throws Exception {__CLR4_4_143t43tld3ms42j.R.globalSliceStart(getClass().getName(),5328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z8ebx0440();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_143t43tld3ms42j.R.rethrow($CLV_t2$);}finally{__CLR4_4_143t43tld3ms42j.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InheritanceTest.testSubInterfacesOfCollectionSerialization118",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5328,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z8ebx0440() throws Exception{try{__CLR4_4_143t43tld3ms42j.R.inc(5328); 
     __CLR4_4_143t43tld3ms42j.R.inc(5329);List<Integer> list = new LinkedList<Integer>(); 
     __CLR4_4_143t43tld3ms42j.R.inc(5330);list.add(0); 
     __CLR4_4_143t43tld3ms42j.R.inc(5331);list.add(1); 
     __CLR4_4_143t43tld3ms42j.R.inc(5332);list.add(2); 
     __CLR4_4_143t43tld3ms42j.R.inc(5333);list.add(3); 
     __CLR4_4_143t43tld3ms42j.R.inc(5334);Queue<Long> queue = new LinkedList<Long>(); 
     __CLR4_4_143t43tld3ms42j.R.inc(5335);queue.add(0L); 
     __CLR4_4_143t43tld3ms42j.R.inc(5336);queue.add(1L); 
     __CLR4_4_143t43tld3ms42j.R.inc(5337);queue.add(2L); 
     __CLR4_4_143t43tld3ms42j.R.inc(5338);queue.add(3L); 
     __CLR4_4_143t43tld3ms42j.R.inc(5339);Set<Float> set = new TreeSet<Float>(); 
     __CLR4_4_143t43tld3ms42j.R.inc(5340);set.add(0.1F); 
     __CLR4_4_143t43tld3ms42j.R.inc(5341);set.add(0.2F); 
     __CLR4_4_143t43tld3ms42j.R.inc(5342);set.add(0.3F); 
     __CLR4_4_143t43tld3ms42j.R.inc(5343);set.add(0.4F); 
     __CLR4_4_143t43tld3ms42j.R.inc(5344);SortedSet<Character> sortedSet = new TreeSet<Character>(); 
     __CLR4_4_143t43tld3ms42j.R.inc(5345);sortedSet.add('a'); 
     __CLR4_4_143t43tld3ms42j.R.inc(5346);sortedSet.add('b'); 
     __CLR4_4_143t43tld3ms42j.R.inc(5347);sortedSet.add('c'); 
     __CLR4_4_143t43tld3ms42j.R.inc(5348);sortedSet.add('d'); 
     __CLR4_4_143t43tld3ms42j.R.inc(5349);ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list, queue, set, sortedSet); 
     __CLR4_4_143t43tld3ms42j.R.inc(5350);assertEquals(target.getExpectedJson(), gson.toJson(target)); 
 }finally{__CLR4_4_143t43tld3ms42j.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  

  private static class SubTypeOfNested extends Nested {
    private final long value = 5;

    // Used by Gson
    @SuppressWarnings("unused")
    private SubTypeOfNested() {
      this(null, null);__CLR4_4_143t43tld3ms42j.R.inc(5352);try{__CLR4_4_143t43tld3ms42j.R.inc(5351);
    }finally{__CLR4_4_143t43tld3ms42j.R.flushNeeded();}}

    public SubTypeOfNested(BagOfPrimitives primitive1, BagOfPrimitives primitive2) {
      super(primitive1, primitive2);__CLR4_4_143t43tld3ms42j.R.inc(5354);try{__CLR4_4_143t43tld3ms42j.R.inc(5353);
    }finally{__CLR4_4_143t43tld3ms42j.R.flushNeeded();}}

    @Override
    public void appendFields(StringBuilder sb) {try{__CLR4_4_143t43tld3ms42j.R.inc(5355);
      __CLR4_4_143t43tld3ms42j.R.inc(5356);sb.append("\"value\":").append(value).append(",");
      __CLR4_4_143t43tld3ms42j.R.inc(5357);super.appendFields(sb);
    }finally{__CLR4_4_143t43tld3ms42j.R.flushNeeded();}}
  }

  

  
  
  private static class ClassWithSubInterfacesOfCollection {
    private List<Integer> list;
    private Queue<Long> queue;
    private Set<Float> set;
    private SortedSet<Character> sortedSet;

    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithSubInterfacesOfCollection() {try{__CLR4_4_143t43tld3ms42j.R.inc(5358);
    }finally{__CLR4_4_143t43tld3ms42j.R.flushNeeded();}}

    public ClassWithSubInterfacesOfCollection(List<Integer> list, Queue<Long> queue, Set<Float> set,
        SortedSet<Character> sortedSet) {try{__CLR4_4_143t43tld3ms42j.R.inc(5359);
      __CLR4_4_143t43tld3ms42j.R.inc(5360);this.list = list;
      __CLR4_4_143t43tld3ms42j.R.inc(5361);this.queue = queue;
      __CLR4_4_143t43tld3ms42j.R.inc(5362);this.set = set;
      __CLR4_4_143t43tld3ms42j.R.inc(5363);this.sortedSet = sortedSet;
    }finally{__CLR4_4_143t43tld3ms42j.R.flushNeeded();}}

    boolean listContains(int... values) {try{__CLR4_4_143t43tld3ms42j.R.inc(5364);
      __CLR4_4_143t43tld3ms42j.R.inc(5365);for (int value : values) {{
        __CLR4_4_143t43tld3ms42j.R.inc(5366);if ((((!list.contains(value))&&(__CLR4_4_143t43tld3ms42j.R.iget(5367)!=0|true))||(__CLR4_4_143t43tld3ms42j.R.iget(5368)==0&false))) {{
          __CLR4_4_143t43tld3ms42j.R.inc(5369);return false;
        }
      }}
      }__CLR4_4_143t43tld3ms42j.R.inc(5370);return true;
    }finally{__CLR4_4_143t43tld3ms42j.R.flushNeeded();}}
    
    boolean queueContains(long... values) {try{__CLR4_4_143t43tld3ms42j.R.inc(5371);
      __CLR4_4_143t43tld3ms42j.R.inc(5372);for (long value : values) {{
        __CLR4_4_143t43tld3ms42j.R.inc(5373);if ((((!queue.contains(value))&&(__CLR4_4_143t43tld3ms42j.R.iget(5374)!=0|true))||(__CLR4_4_143t43tld3ms42j.R.iget(5375)==0&false))) {{
          __CLR4_4_143t43tld3ms42j.R.inc(5376);return false;
        }
      }}
      }__CLR4_4_143t43tld3ms42j.R.inc(5377);return true;      
    }finally{__CLR4_4_143t43tld3ms42j.R.flushNeeded();}}
    
    boolean setContains(float... values) {try{__CLR4_4_143t43tld3ms42j.R.inc(5378);
      __CLR4_4_143t43tld3ms42j.R.inc(5379);for (float value : values) {{
        __CLR4_4_143t43tld3ms42j.R.inc(5380);if ((((!set.contains(value))&&(__CLR4_4_143t43tld3ms42j.R.iget(5381)!=0|true))||(__CLR4_4_143t43tld3ms42j.R.iget(5382)==0&false))) {{
          __CLR4_4_143t43tld3ms42j.R.inc(5383);return false;
        }
      }}
      }__CLR4_4_143t43tld3ms42j.R.inc(5384);return true;
    }finally{__CLR4_4_143t43tld3ms42j.R.flushNeeded();}}

    boolean sortedSetContains(char... values) {try{__CLR4_4_143t43tld3ms42j.R.inc(5385);
      __CLR4_4_143t43tld3ms42j.R.inc(5386);for (char value : values) {{
        __CLR4_4_143t43tld3ms42j.R.inc(5387);if ((((!sortedSet.contains(value))&&(__CLR4_4_143t43tld3ms42j.R.iget(5388)!=0|true))||(__CLR4_4_143t43tld3ms42j.R.iget(5389)==0&false))) {{
          __CLR4_4_143t43tld3ms42j.R.inc(5390);return false;
        }
      }}
      }__CLR4_4_143t43tld3ms42j.R.inc(5391);return true;      
    }finally{__CLR4_4_143t43tld3ms42j.R.flushNeeded();}}
    
    public String getExpectedJson() {try{__CLR4_4_143t43tld3ms42j.R.inc(5392);
      __CLR4_4_143t43tld3ms42j.R.inc(5393);StringBuilder sb = new StringBuilder();
      __CLR4_4_143t43tld3ms42j.R.inc(5394);sb.append("{");
      __CLR4_4_143t43tld3ms42j.R.inc(5395);sb.append("\"list\":");
      __CLR4_4_143t43tld3ms42j.R.inc(5396);append(sb, list).append(",");
      __CLR4_4_143t43tld3ms42j.R.inc(5397);sb.append("\"queue\":");
      __CLR4_4_143t43tld3ms42j.R.inc(5398);append(sb, queue).append(",");
      __CLR4_4_143t43tld3ms42j.R.inc(5399);sb.append("\"set\":");
      __CLR4_4_143t43tld3ms42j.R.inc(5400);append(sb, set).append(",");
      __CLR4_4_143t43tld3ms42j.R.inc(5401);sb.append("\"sortedSet\":");
      __CLR4_4_143t43tld3ms42j.R.inc(5402);append(sb, sortedSet);
      __CLR4_4_143t43tld3ms42j.R.inc(5403);sb.append("}");
      __CLR4_4_143t43tld3ms42j.R.inc(5404);return sb.toString();
    }finally{__CLR4_4_143t43tld3ms42j.R.flushNeeded();}}

    private StringBuilder append(StringBuilder sb, Collection<?> c) {try{__CLR4_4_143t43tld3ms42j.R.inc(5405);
      __CLR4_4_143t43tld3ms42j.R.inc(5406);sb.append("[");
      __CLR4_4_143t43tld3ms42j.R.inc(5407);boolean first = true;
      __CLR4_4_143t43tld3ms42j.R.inc(5408);for (Object o : c) {{
        __CLR4_4_143t43tld3ms42j.R.inc(5409);if ((((!first)&&(__CLR4_4_143t43tld3ms42j.R.iget(5410)!=0|true))||(__CLR4_4_143t43tld3ms42j.R.iget(5411)==0&false))) {{
          __CLR4_4_143t43tld3ms42j.R.inc(5412);sb.append(",");
        } }else {{
          __CLR4_4_143t43tld3ms42j.R.inc(5413);first = false;
        }
        }__CLR4_4_143t43tld3ms42j.R.inc(5414);if ((((o instanceof String || o instanceof Character)&&(__CLR4_4_143t43tld3ms42j.R.iget(5415)!=0|true))||(__CLR4_4_143t43tld3ms42j.R.iget(5416)==0&false))) {{
          __CLR4_4_143t43tld3ms42j.R.inc(5417);sb.append('\"');
        }
        }__CLR4_4_143t43tld3ms42j.R.inc(5418);sb.append(o.toString());
        __CLR4_4_143t43tld3ms42j.R.inc(5419);if ((((o instanceof String || o instanceof Character)&&(__CLR4_4_143t43tld3ms42j.R.iget(5420)!=0|true))||(__CLR4_4_143t43tld3ms42j.R.iget(5421)==0&false))) {{
          __CLR4_4_143t43tld3ms42j.R.inc(5422);sb.append('\"');
        }
      }}
      }__CLR4_4_143t43tld3ms42j.R.inc(5423);sb.append("]");
      __CLR4_4_143t43tld3ms42j.R.inc(5424);return sb;
    }finally{__CLR4_4_143t43tld3ms42j.R.flushNeeded();}}
  }
}
