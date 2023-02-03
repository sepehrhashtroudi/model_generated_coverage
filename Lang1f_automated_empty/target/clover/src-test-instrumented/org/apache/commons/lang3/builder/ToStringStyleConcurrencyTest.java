/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.lang3.builder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;

/**
 * Tests concurrent access for the default {@link ToStringStyle}.
 * <p>
 * The {@link ToStringStyle} class includes a registry to avoid infinite loops for objects with circular references. We
 * want to make sure that we do not get concurrency exceptions accessing this registry.
 * </p>
 * <p>
 * This test passes but only tests one aspect of the issue.
 * </p>
 * 
 * @see <a href="https://issues.apache.org/jira/browse/LANG-762">[LANG-762] Handle or document ReflectionToStringBuilder
 *      and ToStringBuilder for collections that are not thread safe</a>
 * @since 3.1
 * @version $Id$
 */
public class ToStringStyleConcurrencyTest {static class __CLR4_4_1fpzfpzldniggw4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367339710L,8589935092L,20400,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static class CollectionHolder<T extends Collection<?>> {
        T collection;

        CollectionHolder(final T collection) {try{__CLR4_4_1fpzfpzldniggw4.R.inc(20375);
            __CLR4_4_1fpzfpzldniggw4.R.inc(20376);this.collection = collection;
        }finally{__CLR4_4_1fpzfpzldniggw4.R.flushNeeded();}}
    }

    private static final List<Integer> LIST;
    private static final int LIST_SIZE = 100000;
    private static final int REPEAT = 100;

    static {try{__CLR4_4_1fpzfpzldniggw4.R.inc(20377);
        __CLR4_4_1fpzfpzldniggw4.R.inc(20378);LIST = new ArrayList<Integer>(LIST_SIZE);
        __CLR4_4_1fpzfpzldniggw4.R.inc(20379);for (int i = 0; (((i < LIST_SIZE)&&(__CLR4_4_1fpzfpzldniggw4.R.iget(20380)!=0|true))||(__CLR4_4_1fpzfpzldniggw4.R.iget(20381)==0&false)); i++) {{
            __CLR4_4_1fpzfpzldniggw4.R.inc(20382);LIST.add(Integer.valueOf(i));
        }
    }}finally{__CLR4_4_1fpzfpzldniggw4.R.flushNeeded();}}

    

    

    

    private void testConcurrency(final CollectionHolder<List<Integer>> holder) throws InterruptedException,
            ExecutionException {try{__CLR4_4_1fpzfpzldniggw4.R.inc(20383);
        __CLR4_4_1fpzfpzldniggw4.R.inc(20384);final List<Integer> list = holder.collection;
        // make a big array that takes a long time to toString()
        __CLR4_4_1fpzfpzldniggw4.R.inc(20385);list.addAll(LIST);
        // Create a thread pool with two threads to cause the most contention on the underlying resource.
        __CLR4_4_1fpzfpzldniggw4.R.inc(20386);final ExecutorService threadPool = Executors.newFixedThreadPool(2);
        // Consumes toStrings
        __CLR4_4_1fpzfpzldniggw4.R.inc(20387);final Callable<Integer> consumer = new Callable<Integer>() {
            @Override
            public Integer call() {try{__CLR4_4_1fpzfpzldniggw4.R.inc(20388);
                __CLR4_4_1fpzfpzldniggw4.R.inc(20389);for (int i = 0; (((i < REPEAT)&&(__CLR4_4_1fpzfpzldniggw4.R.iget(20390)!=0|true))||(__CLR4_4_1fpzfpzldniggw4.R.iget(20391)==0&false)); i++) {{
                    // Calls ToStringStyle
                    __CLR4_4_1fpzfpzldniggw4.R.inc(20392);new ToStringBuilder(holder).append(holder.collection);
                }
                }__CLR4_4_1fpzfpzldniggw4.R.inc(20393);return Integer.valueOf(REPEAT);
            }finally{__CLR4_4_1fpzfpzldniggw4.R.flushNeeded();}}
        };
        __CLR4_4_1fpzfpzldniggw4.R.inc(20394);final Collection<Callable<Integer>> tasks = new ArrayList<Callable<Integer>>();
        __CLR4_4_1fpzfpzldniggw4.R.inc(20395);tasks.add(consumer);
        __CLR4_4_1fpzfpzldniggw4.R.inc(20396);tasks.add(consumer);
        __CLR4_4_1fpzfpzldniggw4.R.inc(20397);final List<Future<Integer>> futures = threadPool.invokeAll(tasks);
        __CLR4_4_1fpzfpzldniggw4.R.inc(20398);for (final Future<Integer> future : futures) {{
            __CLR4_4_1fpzfpzldniggw4.R.inc(20399);future.get();
        }
    }}finally{__CLR4_4_1fpzfpzldniggw4.R.flushNeeded();}}
}
