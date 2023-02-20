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
import com.google.gson.JsonParseException;
import com.google.gson.common.MoreAsserts;
import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.reflect.TypeToken;

import junit.framework.TestCase;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * Functional tests for Json serialization and deserialization of collections.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class CollectionTest extends TestCase {static class __CLR4_4_13sf3sfle6rvqo9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0030\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532025874L,8589935092L,4982,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13sf3sfle6rvqo9.R.inc(4911);
    __CLR4_4_13sf3sfle6rvqo9.R.inc(4912);super.setUp();
    __CLR4_4_13sf3sfle6rvqo9.R.inc(4913);gson = new Gson();
  }finally{__CLR4_4_13sf3sfle6rvqo9.R.flushNeeded();}}


public void testNullsInListDeserialization96() {__CLR4_4_13sf3sfle6rvqo9.R.globalSliceStart(getClass().getName(),4914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i6e2oa3si();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13sf3sfle6rvqo9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13sf3sfle6rvqo9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testNullsInListDeserialization96",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i6e2oa3si(){try{__CLR4_4_13sf3sfle6rvqo9.R.inc(4914); 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4915);List<String> expected = new ArrayList<String>(); 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4916);expected.add("foo"); 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4917);expected.add(null); 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4918);expected.add("bar"); 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4919);String json = "[\"foo\",null,\"bar\"]"; 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4920);Type expectedType = new TypeToken<List<String>>() { 
     }.getType(); 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4921);List<String> target = gson.fromJson(json, expectedType); 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4922);for (int i = 0; (((i < expected.size())&&(__CLR4_4_13sf3sfle6rvqo9.R.iget(4923)!=0|true))||(__CLR4_4_13sf3sfle6rvqo9.R.iget(4924)==0&false)); ++i) {{ 
         __CLR4_4_13sf3sfle6rvqo9.R.inc(4925);assertEquals(expected.get(i), target.get(i)); 
     } 
 }}finally{__CLR4_4_13sf3sfle6rvqo9.R.flushNeeded();}} 


public void testCollectionOfStringsDeserialization97() {__CLR4_4_13sf3sfle6rvqo9.R.globalSliceStart(getClass().getName(),4926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gprjt33su();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13sf3sfle6rvqo9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13sf3sfle6rvqo9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testCollectionOfStringsDeserialization97",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4926,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gprjt33su(){try{__CLR4_4_13sf3sfle6rvqo9.R.inc(4926); 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4927);String json = "[\"Hello\",\"World\"]"; 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4928);Type collectionType = new TypeToken<Collection<String>>() { 
     }.getType(); 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4929);Collection<String> target = gson.fromJson(json, collectionType); 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4930);assertTrue(target.contains("Hello")); 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4931);assertTrue(target.contains("World")); 
 }finally{__CLR4_4_13sf3sfle6rvqo9.R.flushNeeded();}} 


public void testQueueSerialization119() {__CLR4_4_13sf3sfle6rvqo9.R.globalSliceStart(getClass().getName(),4932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jjq7rl3t0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13sf3sfle6rvqo9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13sf3sfle6rvqo9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testQueueSerialization119",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4932,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jjq7rl3t0(){try{__CLR4_4_13sf3sfle6rvqo9.R.inc(4932); 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4933);Queue<String> queue = new LinkedList<String>(); 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4934);queue.add("a1"); 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4935);queue.add("a2"); 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4936);Type queueType = new TypeToken<Queue<String>>() { 
     }.getType(); 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4937);String json = gson.toJson(queue, queueType); 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4938);assertTrue(json.contains("a1")); 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4939);assertTrue(json.contains("a2")); 
 }finally{__CLR4_4_13sf3sfle6rvqo9.R.flushNeeded();}} 


public void testSetDeserialization122() {__CLR4_4_13sf3sfle6rvqo9.R.globalSliceStart(getClass().getName(),4940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ipuysn3t8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13sf3sfle6rvqo9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13sf3sfle6rvqo9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testSetDeserialization122",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ipuysn3t8(){try{__CLR4_4_13sf3sfle6rvqo9.R.inc(4940); 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4941);String json = "[{value:1},{value:2}]"; 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4942);Type type = new TypeToken<Set<Entry>>() { 
     }.getType(); 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4943);Set<Entry> set = gson.fromJson(json, type); 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4944);assertEquals(2, set.size()); 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4945);for (Entry entry : set) {{ 
         __CLR4_4_13sf3sfle6rvqo9.R.inc(4946);assertTrue(entry.value == 1 || entry.value == 2); 
     } 
 }}finally{__CLR4_4_13sf3sfle6rvqo9.R.flushNeeded();}} 


public void testRawCollectionDeserializationNotAlllowed171() {__CLR4_4_13sf3sfle6rvqo9.R.globalSliceStart(getClass().getName(),4947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gc65l43tf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13sf3sfle6rvqo9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13sf3sfle6rvqo9.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testRawCollectionDeserializationNotAlllowed171",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4947,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gc65l43tf(){try{__CLR4_4_13sf3sfle6rvqo9.R.inc(4947); 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4948);String json = "[0,1,2,3,4,5,6,7,8,9]"; 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4949);try { 
         __CLR4_4_13sf3sfle6rvqo9.R.inc(4950);gson.fromJson(json, Collection.class); 
         __CLR4_4_13sf3sfle6rvqo9.R.inc(4951);fail("Can not deserialize a non-genericized collection."); 
     } catch (JsonParseException expected) { 
     } 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4952);json = "[\"Hello\", \"World\"]"; 
     __CLR4_4_13sf3sfle6rvqo9.R.inc(4953);try { 
         __CLR4_4_13sf3sfle6rvqo9.R.inc(4954);gson.fromJson(json, Collection.class); 
         __CLR4_4_13sf3sfle6rvqo9.R.inc(4955);fail("Can not deserialize a non-genericized collection."); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_13sf3sfle6rvqo9.R.flushNeeded();}} 

  

  

  
  
  

  

  

  

  

  

  
  
  

  

  

  

  

  

  

  
  
  
  
  
  
  

  @SuppressWarnings({ "rawtypes" })
  private static int[] toIntArray(Collection collection) {try{__CLR4_4_13sf3sfle6rvqo9.R.inc(4956);
    __CLR4_4_13sf3sfle6rvqo9.R.inc(4957);int[] ints = new int[collection.size()];
    __CLR4_4_13sf3sfle6rvqo9.R.inc(4958);int i = 0;
    __CLR4_4_13sf3sfle6rvqo9.R.inc(4959);for (Iterator iterator = collection.iterator(); (((iterator.hasNext())&&(__CLR4_4_13sf3sfle6rvqo9.R.iget(4960)!=0|true))||(__CLR4_4_13sf3sfle6rvqo9.R.iget(4961)==0&false)); ++i) {{
      __CLR4_4_13sf3sfle6rvqo9.R.inc(4962);Object obj = iterator.next();
      __CLR4_4_13sf3sfle6rvqo9.R.inc(4963);if ((((obj instanceof Integer)&&(__CLR4_4_13sf3sfle6rvqo9.R.iget(4964)!=0|true))||(__CLR4_4_13sf3sfle6rvqo9.R.iget(4965)==0&false))) {{
        __CLR4_4_13sf3sfle6rvqo9.R.inc(4966);ints[i] = ((Integer)obj).intValue();
      } }else {__CLR4_4_13sf3sfle6rvqo9.R.inc(4967);if ((((obj instanceof Long)&&(__CLR4_4_13sf3sfle6rvqo9.R.iget(4968)!=0|true))||(__CLR4_4_13sf3sfle6rvqo9.R.iget(4969)==0&false))) {{
        __CLR4_4_13sf3sfle6rvqo9.R.inc(4970);ints[i] = ((Long)obj).intValue();
      }
    }}}
    }__CLR4_4_13sf3sfle6rvqo9.R.inc(4971);return ints;
  }finally{__CLR4_4_13sf3sfle6rvqo9.R.flushNeeded();}}

  private static class ObjectWithWildcardCollection {
    private final Collection<? extends BagOfPrimitives> collection;

    // For use by Gson
    @SuppressWarnings({ "unchecked", "unused" })
    public ObjectWithWildcardCollection() {
      this(Collections.EMPTY_LIST);__CLR4_4_13sf3sfle6rvqo9.R.inc(4973);try{__CLR4_4_13sf3sfle6rvqo9.R.inc(4972);
    }finally{__CLR4_4_13sf3sfle6rvqo9.R.flushNeeded();}}
    
    public ObjectWithWildcardCollection(Collection<? extends BagOfPrimitives> collection) {try{__CLR4_4_13sf3sfle6rvqo9.R.inc(4974);
      __CLR4_4_13sf3sfle6rvqo9.R.inc(4975);this.collection = collection;
    }finally{__CLR4_4_13sf3sfle6rvqo9.R.flushNeeded();}}
    
    public Collection<? extends BagOfPrimitives> getCollection() {try{__CLR4_4_13sf3sfle6rvqo9.R.inc(4976);
      __CLR4_4_13sf3sfle6rvqo9.R.inc(4977);return collection;
    }finally{__CLR4_4_13sf3sfle6rvqo9.R.flushNeeded();}}
  }
  
  private static class Entry {
    int value;
    // For use by Gson
    @SuppressWarnings("unused")
    private Entry() {
      this(10);__CLR4_4_13sf3sfle6rvqo9.R.inc(4979);try{__CLR4_4_13sf3sfle6rvqo9.R.inc(4978);
    }finally{__CLR4_4_13sf3sfle6rvqo9.R.flushNeeded();}}
    Entry(int value) {try{__CLR4_4_13sf3sfle6rvqo9.R.inc(4980);
      __CLR4_4_13sf3sfle6rvqo9.R.inc(4981);this.value = value;
    }finally{__CLR4_4_13sf3sfle6rvqo9.R.flushNeeded();}}
  }
  
  
}
