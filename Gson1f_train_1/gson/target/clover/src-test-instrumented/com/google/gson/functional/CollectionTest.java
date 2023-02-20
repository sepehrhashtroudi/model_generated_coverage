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
public class CollectionTest extends TestCase {static class __CLR4_4_13su3sule6rxkne{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532111297L,8589935092L,5014,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13su3sule6rxkne.R.inc(4926);
    __CLR4_4_13su3sule6rxkne.R.inc(4927);super.setUp();
    __CLR4_4_13su3sule6rxkne.R.inc(4928);gson = new Gson();
  }finally{__CLR4_4_13su3sule6rxkne.R.flushNeeded();}}


public void testCollectionOfObjectWithNullSerialization95() {__CLR4_4_13su3sule6rxkne.R.globalSliceStart(getClass().getName(),4929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rtjsu83sx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13su3sule6rxkne.R.rethrow($CLV_t2$);}finally{__CLR4_4_13su3sule6rxkne.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testCollectionOfObjectWithNullSerialization95",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4929,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rtjsu83sx(){try{__CLR4_4_13su3sule6rxkne.R.inc(4929); 
     __CLR4_4_13su3sule6rxkne.R.inc(4930);List<Object> target = new ArrayList<Object>(); 
     __CLR4_4_13su3sule6rxkne.R.inc(4931);target.add("Hello"); 
     __CLR4_4_13su3sule6rxkne.R.inc(4932);target.add(null); 
     __CLR4_4_13su3sule6rxkne.R.inc(4933);target.add("World"); 
     __CLR4_4_13su3sule6rxkne.R.inc(4934);assertEquals("[\"Hello\",null,\"World\"]", gson.toJson(target)); 
     __CLR4_4_13su3sule6rxkne.R.inc(4935);Type type = new TypeToken<List<Object>>() { 
     }.getType(); 
     __CLR4_4_13su3sule6rxkne.R.inc(4936);assertEquals("[\"Hello\",null,\"World\"]", gson.toJson(target, type)); 
 }finally{__CLR4_4_13su3sule6rxkne.R.flushNeeded();}} 


public void testNullsInListDeserialization97() {__CLR4_4_13su3sule6rxkne.R.globalSliceStart(getClass().getName(),4937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1exe3vt3t5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13su3sule6rxkne.R.rethrow($CLV_t2$);}finally{__CLR4_4_13su3sule6rxkne.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testNullsInListDeserialization97",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4937,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1exe3vt3t5(){try{__CLR4_4_13su3sule6rxkne.R.inc(4937); 
     __CLR4_4_13su3sule6rxkne.R.inc(4938);List<String> expected = new ArrayList<String>(); 
     __CLR4_4_13su3sule6rxkne.R.inc(4939);expected.add("foo"); 
     __CLR4_4_13su3sule6rxkne.R.inc(4940);expected.add(null); 
     __CLR4_4_13su3sule6rxkne.R.inc(4941);expected.add("bar"); 
     __CLR4_4_13su3sule6rxkne.R.inc(4942);String json = "[\"foo\",null,\"bar\"]"; 
     __CLR4_4_13su3sule6rxkne.R.inc(4943);Type expectedType = new TypeToken<List<String>>() { 
     }.getType(); 
     __CLR4_4_13su3sule6rxkne.R.inc(4944);List<String> target = gson.fromJson(json, expectedType); 
     __CLR4_4_13su3sule6rxkne.R.inc(4945);for (int i = 0; (((i < expected.size())&&(__CLR4_4_13su3sule6rxkne.R.iget(4946)!=0|true))||(__CLR4_4_13su3sule6rxkne.R.iget(4947)==0&false)); ++i) {{ 
         __CLR4_4_13su3sule6rxkne.R.inc(4948);assertEquals(expected.get(i), target.get(i)); 
     } 
 }}finally{__CLR4_4_13su3sule6rxkne.R.flushNeeded();}} 


public void testCollectionOfStringsDeserialization98() {__CLR4_4_13su3sule6rxkne.R.globalSliceStart(getClass().getName(),4949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dgrl0m3th();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13su3sule6rxkne.R.rethrow($CLV_t2$);}finally{__CLR4_4_13su3sule6rxkne.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testCollectionOfStringsDeserialization98",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dgrl0m3th(){try{__CLR4_4_13su3sule6rxkne.R.inc(4949); 
     __CLR4_4_13su3sule6rxkne.R.inc(4950);String json = "[\"Hello\",\"World\"]"; 
     __CLR4_4_13su3sule6rxkne.R.inc(4951);Type collectionType = new TypeToken<Collection<String>>() { 
     }.getType(); 
     __CLR4_4_13su3sule6rxkne.R.inc(4952);Collection<String> target = gson.fromJson(json, collectionType); 
     __CLR4_4_13su3sule6rxkne.R.inc(4953);assertTrue(target.contains("Hello")); 
     __CLR4_4_13su3sule6rxkne.R.inc(4954);assertTrue(target.contains("World")); 
 }finally{__CLR4_4_13su3sule6rxkne.R.flushNeeded();}} 


public void testQueueSerialization117() {__CLR4_4_13su3sule6rxkne.R.globalSliceStart(getClass().getName(),4955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q1q5cj3tn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13su3sule6rxkne.R.rethrow($CLV_t2$);}finally{__CLR4_4_13su3sule6rxkne.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testQueueSerialization117",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q1q5cj3tn(){try{__CLR4_4_13su3sule6rxkne.R.inc(4955); 
     __CLR4_4_13su3sule6rxkne.R.inc(4956);Queue<String> queue = new LinkedList<String>(); 
     __CLR4_4_13su3sule6rxkne.R.inc(4957);queue.add("a1"); 
     __CLR4_4_13su3sule6rxkne.R.inc(4958);queue.add("a2"); 
     __CLR4_4_13su3sule6rxkne.R.inc(4959);Type queueType = new TypeToken<Queue<String>>() { 
     }.getType(); 
     __CLR4_4_13su3sule6rxkne.R.inc(4960);String json = gson.toJson(queue, queueType); 
     __CLR4_4_13su3sule6rxkne.R.inc(4961);assertTrue(json.contains("a1")); 
     __CLR4_4_13su3sule6rxkne.R.inc(4962);assertTrue(json.contains("a2")); 
 }finally{__CLR4_4_13su3sule6rxkne.R.flushNeeded();}} 


public void testSetDeserialization121() {__CLR4_4_13su3sule6rxkne.R.globalSliceStart(getClass().getName(),4963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lyuxl43tv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13su3sule6rxkne.R.rethrow($CLV_t2$);}finally{__CLR4_4_13su3sule6rxkne.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testSetDeserialization121",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4963,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lyuxl43tv(){try{__CLR4_4_13su3sule6rxkne.R.inc(4963); 
     __CLR4_4_13su3sule6rxkne.R.inc(4964);String json = "[{value:1},{value:2}]"; 
     __CLR4_4_13su3sule6rxkne.R.inc(4965);Type type = new TypeToken<Set<Entry>>() { 
     }.getType(); 
     __CLR4_4_13su3sule6rxkne.R.inc(4966);Set<Entry> set = gson.fromJson(json, type); 
     __CLR4_4_13su3sule6rxkne.R.inc(4967);assertEquals(2, set.size()); 
     __CLR4_4_13su3sule6rxkne.R.inc(4968);for (Entry entry : set) {{ 
         __CLR4_4_13su3sule6rxkne.R.inc(4969);assertTrue(entry.value == 1 || entry.value == 2); 
     } 
 }}finally{__CLR4_4_13su3sule6rxkne.R.flushNeeded();}} 


public void testRawCollectionDeserializationNotAlllowed167() {__CLR4_4_13su3sule6rxkne.R.globalSliceStart(getClass().getName(),4970);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_164b1sf3u2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13su3sule6rxkne.R.rethrow($CLV_t2$);}finally{__CLR4_4_13su3sule6rxkne.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testRawCollectionDeserializationNotAlllowed167",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4970,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_164b1sf3u2(){try{__CLR4_4_13su3sule6rxkne.R.inc(4970); 
     __CLR4_4_13su3sule6rxkne.R.inc(4971);String json = "[0,1,2,3,4,5,6,7,8,9]"; 
     __CLR4_4_13su3sule6rxkne.R.inc(4972);try { 
         __CLR4_4_13su3sule6rxkne.R.inc(4973);gson.fromJson(json, Collection.class); 
         __CLR4_4_13su3sule6rxkne.R.inc(4974);fail("Can not deserialize a non-genericized collection."); 
     } catch (JsonParseException expected) { 
     } 
     __CLR4_4_13su3sule6rxkne.R.inc(4975);json = "[\"Hello\", \"World\"]"; 
     __CLR4_4_13su3sule6rxkne.R.inc(4976);try { 
         __CLR4_4_13su3sule6rxkne.R.inc(4977);gson.fromJson(json, Collection.class); 
         __CLR4_4_13su3sule6rxkne.R.inc(4978);fail("Can not deserialize a non-genericized collection."); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_13su3sule6rxkne.R.flushNeeded();}} 


@SuppressWarnings({ "unchecked", "rawtypes" }) 
 public void testRawCollectionOfBagOfPrimitivesNotAllowed215() {__CLR4_4_13su3sule6rxkne.R.globalSliceStart(getClass().getName(),4979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lqmpag3ub();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13su3sule6rxkne.R.rethrow($CLV_t2$);}finally{__CLR4_4_13su3sule6rxkne.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.CollectionTest.testRawCollectionOfBagOfPrimitivesNotAllowed215",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4979,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lqmpag3ub(){try{__CLR4_4_13su3sule6rxkne.R.inc(4979); 
     __CLR4_4_13su3sule6rxkne.R.inc(4980);try { 
         __CLR4_4_13su3sule6rxkne.R.inc(4981);BagOfPrimitives bag = new BagOfPrimitives(10, 20, false, "stringValue"); 
         __CLR4_4_13su3sule6rxkne.R.inc(4982);String json = '[' + bag.getExpectedJson() + ',' + bag.getExpectedJson() + ']'; 
         __CLR4_4_13su3sule6rxkne.R.inc(4983);Collection target = gson.fromJson(json, Collection.class); 
         __CLR4_4_13su3sule6rxkne.R.inc(4984);assertEquals(2, target.size()); 
         __CLR4_4_13su3sule6rxkne.R.inc(4985);for (BagOfPrimitives bag1 : (Collection<BagOfPrimitives>) target) {{ 
             __CLR4_4_13su3sule6rxkne.R.inc(4986);assertEquals(bag.getExpectedJson(), bag1.getExpectedJson()); 
         } 
         }__CLR4_4_13su3sule6rxkne.R.inc(4987);fail("Raw collection of objects should not work"); 
     } catch (JsonParseException expected) { 
     } 
 }finally{__CLR4_4_13su3sule6rxkne.R.flushNeeded();}} 

  

  

  
  
  

  

  

  

  

  

  
  
  

  

  

  

  

  

  

  
  
  
  
  
  
  

  @SuppressWarnings({ "rawtypes" })
  private static int[] toIntArray(Collection collection) {try{__CLR4_4_13su3sule6rxkne.R.inc(4988);
    __CLR4_4_13su3sule6rxkne.R.inc(4989);int[] ints = new int[collection.size()];
    __CLR4_4_13su3sule6rxkne.R.inc(4990);int i = 0;
    __CLR4_4_13su3sule6rxkne.R.inc(4991);for (Iterator iterator = collection.iterator(); (((iterator.hasNext())&&(__CLR4_4_13su3sule6rxkne.R.iget(4992)!=0|true))||(__CLR4_4_13su3sule6rxkne.R.iget(4993)==0&false)); ++i) {{
      __CLR4_4_13su3sule6rxkne.R.inc(4994);Object obj = iterator.next();
      __CLR4_4_13su3sule6rxkne.R.inc(4995);if ((((obj instanceof Integer)&&(__CLR4_4_13su3sule6rxkne.R.iget(4996)!=0|true))||(__CLR4_4_13su3sule6rxkne.R.iget(4997)==0&false))) {{
        __CLR4_4_13su3sule6rxkne.R.inc(4998);ints[i] = ((Integer)obj).intValue();
      } }else {__CLR4_4_13su3sule6rxkne.R.inc(4999);if ((((obj instanceof Long)&&(__CLR4_4_13su3sule6rxkne.R.iget(5000)!=0|true))||(__CLR4_4_13su3sule6rxkne.R.iget(5001)==0&false))) {{
        __CLR4_4_13su3sule6rxkne.R.inc(5002);ints[i] = ((Long)obj).intValue();
      }
    }}}
    }__CLR4_4_13su3sule6rxkne.R.inc(5003);return ints;
  }finally{__CLR4_4_13su3sule6rxkne.R.flushNeeded();}}

  private static class ObjectWithWildcardCollection {
    private final Collection<? extends BagOfPrimitives> collection;

    // For use by Gson
    @SuppressWarnings({ "unchecked", "unused" })
    public ObjectWithWildcardCollection() {
      this(Collections.EMPTY_LIST);__CLR4_4_13su3sule6rxkne.R.inc(5005);try{__CLR4_4_13su3sule6rxkne.R.inc(5004);
    }finally{__CLR4_4_13su3sule6rxkne.R.flushNeeded();}}
    
    public ObjectWithWildcardCollection(Collection<? extends BagOfPrimitives> collection) {try{__CLR4_4_13su3sule6rxkne.R.inc(5006);
      __CLR4_4_13su3sule6rxkne.R.inc(5007);this.collection = collection;
    }finally{__CLR4_4_13su3sule6rxkne.R.flushNeeded();}}
    
    public Collection<? extends BagOfPrimitives> getCollection() {try{__CLR4_4_13su3sule6rxkne.R.inc(5008);
      __CLR4_4_13su3sule6rxkne.R.inc(5009);return collection;
    }finally{__CLR4_4_13su3sule6rxkne.R.flushNeeded();}}
  }
  
  private static class Entry {
    int value;
    // For use by Gson
    @SuppressWarnings("unused")
    private Entry() {
      this(10);__CLR4_4_13su3sule6rxkne.R.inc(5011);try{__CLR4_4_13su3sule6rxkne.R.inc(5010);
    }finally{__CLR4_4_13su3sule6rxkne.R.flushNeeded();}}
    Entry(int value) {try{__CLR4_4_13su3sule6rxkne.R.inc(5012);
      __CLR4_4_13su3sule6rxkne.R.inc(5013);this.value = value;
    }finally{__CLR4_4_13su3sule6rxkne.R.flushNeeded();}}
  }
  
  
}
