/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2010 Google Inc.
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

package com.google.gson;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * An implementation of the {@link Cache} interface that evict objects from the cache using an
 * LRU (least recently used) algorithm.  Object start getting evicted from the cache once the
 * {@code maxCapacity} is reached.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
final class LruCache<K, V> extends LinkedHashMap<K, V> implements Cache<K, V> {public static class __CLR4_4_11jc1jcld3ms3je{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674165276788L,8589935092L,2007,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private static final long serialVersionUID = 1L;

  private final int maxCapacity;

  LruCache(int maxCapacity) {
    super(maxCapacity, 0.7F, true);__CLR4_4_11jc1jcld3ms3je.R.inc(1993);try{__CLR4_4_11jc1jcld3ms3je.R.inc(1992);
    __CLR4_4_11jc1jcld3ms3je.R.inc(1994);this.maxCapacity = maxCapacity;
  }finally{__CLR4_4_11jc1jcld3ms3je.R.flushNeeded();}}

  public void addElement(K key, V value) {try{__CLR4_4_11jc1jcld3ms3je.R.inc(1995);
    __CLR4_4_11jc1jcld3ms3je.R.inc(1996);put(key, value);
  }finally{__CLR4_4_11jc1jcld3ms3je.R.flushNeeded();}}

  public void clear() {try{__CLR4_4_11jc1jcld3ms3je.R.inc(1997);
    __CLR4_4_11jc1jcld3ms3je.R.inc(1998);super.clear();
  }finally{__CLR4_4_11jc1jcld3ms3je.R.flushNeeded();}}

  public V getElement(K key) {try{__CLR4_4_11jc1jcld3ms3je.R.inc(1999);
    __CLR4_4_11jc1jcld3ms3je.R.inc(2000);return get(key);
  }finally{__CLR4_4_11jc1jcld3ms3je.R.flushNeeded();}}

  public V removeElement(K key) {try{__CLR4_4_11jc1jcld3ms3je.R.inc(2001);
    __CLR4_4_11jc1jcld3ms3je.R.inc(2002);return remove(key);
  }finally{__CLR4_4_11jc1jcld3ms3je.R.flushNeeded();}}

  public int size() {try{__CLR4_4_11jc1jcld3ms3je.R.inc(2003);
    __CLR4_4_11jc1jcld3ms3je.R.inc(2004);return super.size();
  }finally{__CLR4_4_11jc1jcld3ms3je.R.flushNeeded();}}
  
  @Override
  protected boolean removeEldestEntry(Map.Entry<K, V> entry) {try{__CLR4_4_11jc1jcld3ms3je.R.inc(2005);
    __CLR4_4_11jc1jcld3ms3je.R.inc(2006);return size() > maxCapacity;
  }finally{__CLR4_4_11jc1jcld3ms3je.R.flushNeeded();}}
}
