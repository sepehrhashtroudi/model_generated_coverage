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

import java.util.LinkedList;
import java.util.Random;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Tests concurrent access for {@link ReflectionToStringBuilder}.
 * <p>
 * The {@link ToStringStyle} class includes a registry to avoid infinite loops for objects with circular references. We
 * want to make sure that we do not get concurrency exceptions accessing this registry.
 * </p>
 * 
 * @see <a href="https://issues.apache.org/jira/browse/LANG-762">[LANG-762] Handle or document ReflectionToStringBuilder
 *      and ToStringBuilder for collections that are not thread safe</a>
 * @since 3.1
 * @version $Id$
 */
public class ReflectionToStringBuilderMutateInspectConcurrencyTest {static class __CLR4_4_1fnhfnhldniggvn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367339710L,8589935092L,20307,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    class TestFixture {
        final private LinkedList<Integer> listField = new LinkedList<Integer>();
        final private Random random = new Random();
        private final int N = 100;

        public TestFixture() {try{__CLR4_4_1fnhfnhldniggvn.R.inc(20285);
            __CLR4_4_1fnhfnhldniggvn.R.inc(20286);synchronized (this) {
                __CLR4_4_1fnhfnhldniggvn.R.inc(20287);for (int i = 0; (((i < N)&&(__CLR4_4_1fnhfnhldniggvn.R.iget(20288)!=0|true))||(__CLR4_4_1fnhfnhldniggvn.R.iget(20289)==0&false)); i++) {{
                    __CLR4_4_1fnhfnhldniggvn.R.inc(20290);listField.add(Integer.valueOf(i));
                }
            }}
        }finally{__CLR4_4_1fnhfnhldniggvn.R.flushNeeded();}}

        public synchronized void add() {try{__CLR4_4_1fnhfnhldniggvn.R.inc(20291);
            __CLR4_4_1fnhfnhldniggvn.R.inc(20292);listField.add(Integer.valueOf(random.nextInt(N)));
        }finally{__CLR4_4_1fnhfnhldniggvn.R.flushNeeded();}}

        public synchronized void delete() {try{__CLR4_4_1fnhfnhldniggvn.R.inc(20293);
            __CLR4_4_1fnhfnhldniggvn.R.inc(20294);listField.remove(Integer.valueOf(random.nextInt(N)));
        }finally{__CLR4_4_1fnhfnhldniggvn.R.flushNeeded();}}
    }

    class MutatingClient implements Runnable {
        final private TestFixture testFixture;
        final private Random random = new Random();

        public MutatingClient(final TestFixture testFixture) {try{__CLR4_4_1fnhfnhldniggvn.R.inc(20295);
            __CLR4_4_1fnhfnhldniggvn.R.inc(20296);this.testFixture = testFixture;
        }finally{__CLR4_4_1fnhfnhldniggvn.R.flushNeeded();}}

        @Override
        public void run() {try{__CLR4_4_1fnhfnhldniggvn.R.inc(20297);
            __CLR4_4_1fnhfnhldniggvn.R.inc(20298);if ((((random.nextBoolean())&&(__CLR4_4_1fnhfnhldniggvn.R.iget(20299)!=0|true))||(__CLR4_4_1fnhfnhldniggvn.R.iget(20300)==0&false))) {{
                __CLR4_4_1fnhfnhldniggvn.R.inc(20301);testFixture.add();
            } }else {{
                __CLR4_4_1fnhfnhldniggvn.R.inc(20302);testFixture.delete();
            }
        }}finally{__CLR4_4_1fnhfnhldniggvn.R.flushNeeded();}}
    }

    class InspectingClient implements Runnable {
        final private TestFixture testFixture;

        public InspectingClient(final TestFixture testFixture) {try{__CLR4_4_1fnhfnhldniggvn.R.inc(20303);
            __CLR4_4_1fnhfnhldniggvn.R.inc(20304);this.testFixture = testFixture;
        }finally{__CLR4_4_1fnhfnhldniggvn.R.flushNeeded();}}

        @Override
        public void run() {try{__CLR4_4_1fnhfnhldniggvn.R.inc(20305);
            __CLR4_4_1fnhfnhldniggvn.R.inc(20306);ReflectionToStringBuilder.toString(testFixture);
        }finally{__CLR4_4_1fnhfnhldniggvn.R.flushNeeded();}}
    }

    
}
