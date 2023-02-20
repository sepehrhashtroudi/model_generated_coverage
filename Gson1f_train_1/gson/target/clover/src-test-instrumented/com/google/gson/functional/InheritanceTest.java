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
public class InheritanceTest extends TestCase {static class __CLR4_4_144j44jle6rxkqy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532111297L,8589935092L,5454,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_144j44jle6rxkqy.R.inc(5347);
    __CLR4_4_144j44jle6rxkqy.R.inc(5348);super.setUp();
    __CLR4_4_144j44jle6rxkqy.R.inc(5349);gson = new Gson();
  }finally{__CLR4_4_144j44jle6rxkqy.R.flushNeeded();}}


public void testSubInterfacesOfCollectionDeserialization49() throws Exception {__CLR4_4_144j44jle6rxkqy.R.globalSliceStart(getClass().getName(),5350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14yru6a44m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_144j44jle6rxkqy.R.rethrow($CLV_t2$);}finally{__CLR4_4_144j44jle6rxkqy.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InheritanceTest.testSubInterfacesOfCollectionDeserialization49",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5350,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14yru6a44m() throws Exception{try{__CLR4_4_144j44jle6rxkqy.R.inc(5350); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5351);String json = "{\"list\":[0,1,2,3],\"queue\":[0,1,2,3],\"set\":[0.1,0.2,0.3,0.4]," + "\"sortedSet\":[\"a\",\"b\",\"c\",\"d\"]" + "}"; 
     __CLR4_4_144j44jle6rxkqy.R.inc(5352);ClassWithSubInterfacesOfCollection target = gson.fromJson(json, ClassWithSubInterfacesOfCollection.class); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5353);assertTrue(target.listContains(0, 1, 2, 3)); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5354);assertTrue(target.queueContains(0, 1, 2, 3)); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5355);assertTrue(target.setContains(0.1F, 0.2F, 0.3F, 0.4F)); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5356);assertTrue(target.sortedSetContains('a', 'b', 'c', 'd')); 
 }finally{__CLR4_4_144j44jle6rxkqy.R.flushNeeded();}} 


public void testSubInterfacesOfCollectionSerialization115() throws Exception {__CLR4_4_144j44jle6rxkqy.R.globalSliceStart(getClass().getName(),5357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q1ptop44t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_144j44jle6rxkqy.R.rethrow($CLV_t2$);}finally{__CLR4_4_144j44jle6rxkqy.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.InheritanceTest.testSubInterfacesOfCollectionSerialization115",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5357,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q1ptop44t() throws Exception{try{__CLR4_4_144j44jle6rxkqy.R.inc(5357); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5358);List<Integer> list = new LinkedList<Integer>(); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5359);list.add(0); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5360);list.add(1); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5361);list.add(2); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5362);list.add(3); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5363);Queue<Long> queue = new LinkedList<Long>(); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5364);queue.add(0L); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5365);queue.add(1L); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5366);queue.add(2L); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5367);queue.add(3L); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5368);Set<Float> set = new TreeSet<Float>(); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5369);set.add(0.1F); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5370);set.add(0.2F); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5371);set.add(0.3F); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5372);set.add(0.4F); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5373);SortedSet<Character> sortedSet = new TreeSet<Character>(); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5374);sortedSet.add('a'); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5375);sortedSet.add('b'); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5376);sortedSet.add('c'); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5377);sortedSet.add('d'); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5378);ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list, queue, set, sortedSet); 
     __CLR4_4_144j44jle6rxkqy.R.inc(5379);assertEquals(target.getExpectedJson(), gson.toJson(target)); 
 }finally{__CLR4_4_144j44jle6rxkqy.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  

  private static class SubTypeOfNested extends Nested {
    private final long value = 5;

    // Used by Gson
    @SuppressWarnings("unused")
    private SubTypeOfNested() {
      this(null, null);__CLR4_4_144j44jle6rxkqy.R.inc(5381);try{__CLR4_4_144j44jle6rxkqy.R.inc(5380);
    }finally{__CLR4_4_144j44jle6rxkqy.R.flushNeeded();}}

    public SubTypeOfNested(BagOfPrimitives primitive1, BagOfPrimitives primitive2) {
      super(primitive1, primitive2);__CLR4_4_144j44jle6rxkqy.R.inc(5383);try{__CLR4_4_144j44jle6rxkqy.R.inc(5382);
    }finally{__CLR4_4_144j44jle6rxkqy.R.flushNeeded();}}

    @Override
    public void appendFields(StringBuilder sb) {try{__CLR4_4_144j44jle6rxkqy.R.inc(5384);
      __CLR4_4_144j44jle6rxkqy.R.inc(5385);sb.append("\"value\":").append(value).append(",");
      __CLR4_4_144j44jle6rxkqy.R.inc(5386);super.appendFields(sb);
    }finally{__CLR4_4_144j44jle6rxkqy.R.flushNeeded();}}
  }

  

  
  
  private static class ClassWithSubInterfacesOfCollection {
    private List<Integer> list;
    private Queue<Long> queue;
    private Set<Float> set;
    private SortedSet<Character> sortedSet;

    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithSubInterfacesOfCollection() {try{__CLR4_4_144j44jle6rxkqy.R.inc(5387);
    }finally{__CLR4_4_144j44jle6rxkqy.R.flushNeeded();}}

    public ClassWithSubInterfacesOfCollection(List<Integer> list, Queue<Long> queue, Set<Float> set,
        SortedSet<Character> sortedSet) {try{__CLR4_4_144j44jle6rxkqy.R.inc(5388);
      __CLR4_4_144j44jle6rxkqy.R.inc(5389);this.list = list;
      __CLR4_4_144j44jle6rxkqy.R.inc(5390);this.queue = queue;
      __CLR4_4_144j44jle6rxkqy.R.inc(5391);this.set = set;
      __CLR4_4_144j44jle6rxkqy.R.inc(5392);this.sortedSet = sortedSet;
    }finally{__CLR4_4_144j44jle6rxkqy.R.flushNeeded();}}

    boolean listContains(int... values) {try{__CLR4_4_144j44jle6rxkqy.R.inc(5393);
      __CLR4_4_144j44jle6rxkqy.R.inc(5394);for (int value : values) {{
        __CLR4_4_144j44jle6rxkqy.R.inc(5395);if ((((!list.contains(value))&&(__CLR4_4_144j44jle6rxkqy.R.iget(5396)!=0|true))||(__CLR4_4_144j44jle6rxkqy.R.iget(5397)==0&false))) {{
          __CLR4_4_144j44jle6rxkqy.R.inc(5398);return false;
        }
      }}
      }__CLR4_4_144j44jle6rxkqy.R.inc(5399);return true;
    }finally{__CLR4_4_144j44jle6rxkqy.R.flushNeeded();}}
    
    boolean queueContains(long... values) {try{__CLR4_4_144j44jle6rxkqy.R.inc(5400);
      __CLR4_4_144j44jle6rxkqy.R.inc(5401);for (long value : values) {{
        __CLR4_4_144j44jle6rxkqy.R.inc(5402);if ((((!queue.contains(value))&&(__CLR4_4_144j44jle6rxkqy.R.iget(5403)!=0|true))||(__CLR4_4_144j44jle6rxkqy.R.iget(5404)==0&false))) {{
          __CLR4_4_144j44jle6rxkqy.R.inc(5405);return false;
        }
      }}
      }__CLR4_4_144j44jle6rxkqy.R.inc(5406);return true;      
    }finally{__CLR4_4_144j44jle6rxkqy.R.flushNeeded();}}
    
    boolean setContains(float... values) {try{__CLR4_4_144j44jle6rxkqy.R.inc(5407);
      __CLR4_4_144j44jle6rxkqy.R.inc(5408);for (float value : values) {{
        __CLR4_4_144j44jle6rxkqy.R.inc(5409);if ((((!set.contains(value))&&(__CLR4_4_144j44jle6rxkqy.R.iget(5410)!=0|true))||(__CLR4_4_144j44jle6rxkqy.R.iget(5411)==0&false))) {{
          __CLR4_4_144j44jle6rxkqy.R.inc(5412);return false;
        }
      }}
      }__CLR4_4_144j44jle6rxkqy.R.inc(5413);return true;
    }finally{__CLR4_4_144j44jle6rxkqy.R.flushNeeded();}}

    boolean sortedSetContains(char... values) {try{__CLR4_4_144j44jle6rxkqy.R.inc(5414);
      __CLR4_4_144j44jle6rxkqy.R.inc(5415);for (char value : values) {{
        __CLR4_4_144j44jle6rxkqy.R.inc(5416);if ((((!sortedSet.contains(value))&&(__CLR4_4_144j44jle6rxkqy.R.iget(5417)!=0|true))||(__CLR4_4_144j44jle6rxkqy.R.iget(5418)==0&false))) {{
          __CLR4_4_144j44jle6rxkqy.R.inc(5419);return false;
        }
      }}
      }__CLR4_4_144j44jle6rxkqy.R.inc(5420);return true;      
    }finally{__CLR4_4_144j44jle6rxkqy.R.flushNeeded();}}
    
    public String getExpectedJson() {try{__CLR4_4_144j44jle6rxkqy.R.inc(5421);
      __CLR4_4_144j44jle6rxkqy.R.inc(5422);StringBuilder sb = new StringBuilder();
      __CLR4_4_144j44jle6rxkqy.R.inc(5423);sb.append("{");
      __CLR4_4_144j44jle6rxkqy.R.inc(5424);sb.append("\"list\":");
      __CLR4_4_144j44jle6rxkqy.R.inc(5425);append(sb, list).append(",");
      __CLR4_4_144j44jle6rxkqy.R.inc(5426);sb.append("\"queue\":");
      __CLR4_4_144j44jle6rxkqy.R.inc(5427);append(sb, queue).append(",");
      __CLR4_4_144j44jle6rxkqy.R.inc(5428);sb.append("\"set\":");
      __CLR4_4_144j44jle6rxkqy.R.inc(5429);append(sb, set).append(",");
      __CLR4_4_144j44jle6rxkqy.R.inc(5430);sb.append("\"sortedSet\":");
      __CLR4_4_144j44jle6rxkqy.R.inc(5431);append(sb, sortedSet);
      __CLR4_4_144j44jle6rxkqy.R.inc(5432);sb.append("}");
      __CLR4_4_144j44jle6rxkqy.R.inc(5433);return sb.toString();
    }finally{__CLR4_4_144j44jle6rxkqy.R.flushNeeded();}}

    private StringBuilder append(StringBuilder sb, Collection<?> c) {try{__CLR4_4_144j44jle6rxkqy.R.inc(5434);
      __CLR4_4_144j44jle6rxkqy.R.inc(5435);sb.append("[");
      __CLR4_4_144j44jle6rxkqy.R.inc(5436);boolean first = true;
      __CLR4_4_144j44jle6rxkqy.R.inc(5437);for (Object o : c) {{
        __CLR4_4_144j44jle6rxkqy.R.inc(5438);if ((((!first)&&(__CLR4_4_144j44jle6rxkqy.R.iget(5439)!=0|true))||(__CLR4_4_144j44jle6rxkqy.R.iget(5440)==0&false))) {{
          __CLR4_4_144j44jle6rxkqy.R.inc(5441);sb.append(",");
        } }else {{
          __CLR4_4_144j44jle6rxkqy.R.inc(5442);first = false;
        }
        }__CLR4_4_144j44jle6rxkqy.R.inc(5443);if ((((o instanceof String || o instanceof Character)&&(__CLR4_4_144j44jle6rxkqy.R.iget(5444)!=0|true))||(__CLR4_4_144j44jle6rxkqy.R.iget(5445)==0&false))) {{
          __CLR4_4_144j44jle6rxkqy.R.inc(5446);sb.append('\"');
        }
        }__CLR4_4_144j44jle6rxkqy.R.inc(5447);sb.append(o.toString());
        __CLR4_4_144j44jle6rxkqy.R.inc(5448);if ((((o instanceof String || o instanceof Character)&&(__CLR4_4_144j44jle6rxkqy.R.iget(5449)!=0|true))||(__CLR4_4_144j44jle6rxkqy.R.iget(5450)==0&false))) {{
          __CLR4_4_144j44jle6rxkqy.R.inc(5451);sb.append('\"');
        }
      }}
      }__CLR4_4_144j44jle6rxkqy.R.inc(5452);sb.append("]");
      __CLR4_4_144j44jle6rxkqy.R.inc(5453);return sb;
    }finally{__CLR4_4_144j44jle6rxkqy.R.flushNeeded();}}
  }
}
