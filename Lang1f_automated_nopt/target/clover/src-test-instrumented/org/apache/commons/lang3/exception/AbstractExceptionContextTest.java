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
package org.apache.commons.lang3.exception;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.SerializationUtils;
import org.apache.commons.lang3.tuple.Pair;


/**
 * Abstract test of an ExceptionContext implementation.
 */
public abstract class AbstractExceptionContextTest<T extends ExceptionContext & Serializable> {static class __CLR4_4_1g3vg3vldni84ye{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,20911,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected static final String TEST_MESSAGE_2 = "This is monotonous";
    protected static final String TEST_MESSAGE = "Test Message";
    protected T exceptionContext;

    protected static class ObjectWithFaultyToString {
        @Override
        public String toString() {try{__CLR4_4_1g3vg3vldni84ye.R.inc(20875);
            __CLR4_4_1g3vg3vldni84ye.R.inc(20876);throw new RuntimeException("Crap");
        }finally{__CLR4_4_1g3vg3vldni84ye.R.flushNeeded();}}
    }


    @Before
    public void setUp() throws Exception {try{__CLR4_4_1g3vg3vldni84ye.R.inc(20877);
        __CLR4_4_1g3vg3vldni84ye.R.inc(20878);exceptionContext
            .addContextValue("test1", null)
            .addContextValue("test2", "some value")
            .addContextValue("test Date", new Date())
            .addContextValue("test Nbr", Integer.valueOf(5))
            .addContextValue("test Poorly written obj", new ObjectWithFaultyToString());
    }finally{__CLR4_4_1g3vg3vldni84ye.R.flushNeeded();}}

@Test
public void testGetContextEntries1091() {__CLR4_4_1g3vg3vldni84ye.R.globalSliceStart(getClass().getName(),20879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y1qx99g3z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g3vg3vldni84ye.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g3vg3vldni84ye.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.AbstractExceptionContextTest.testGetContextEntries1091",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y1qx99g3z(){try{__CLR4_4_1g3vg3vldni84ye.R.inc(20879); __CLR4_4_1g3vg3vldni84ye.R.inc(20880);ContextedException e = new ContextedException(); __CLR4_4_1g3vg3vldni84ye.R.inc(20881);e.addContextValue("key1", "value1"); __CLR4_4_1g3vg3vldni84ye.R.inc(20882);e.addContextValue("key2", "value2"); __CLR4_4_1g3vg3vldni84ye.R.inc(20883);e.addContextValue("key3", "value3"); __CLR4_4_1g3vg3vldni84ye.R.inc(20884);List<Pair<String, Object>> pairs = e.getContextEntries(); __CLR4_4_1g3vg3vldni84ye.R.inc(20885);assertEquals(3, pairs.size()); __CLR4_4_1g3vg3vldni84ye.R.inc(20886);assertEquals("key1", pairs.get(0).getKey()); __CLR4_4_1g3vg3vldni84ye.R.inc(20887);assertEquals("value1", pairs.get(0).getValue()); __CLR4_4_1g3vg3vldni84ye.R.inc(20888);assertEquals("value2", pairs.get(1).getKey()); __CLR4_4_1g3vg3vldni84ye.R.inc(20889);assertEquals("value3", pairs.get(1).getValue()); }finally{__CLR4_4_1g3vg3vldni84ye.R.flushNeeded();}}
@Test
public void testGetContextEntries1094() {__CLR4_4_1g3vg3vldni84ye.R.globalSliceStart(getClass().getName(),20890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oar0vug4a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g3vg3vldni84ye.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g3vg3vldni84ye.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.AbstractExceptionContextTest.testGetContextEntries1094",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20890,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oar0vug4a(){try{__CLR4_4_1g3vg3vldni84ye.R.inc(20890); __CLR4_4_1g3vg3vldni84ye.R.inc(20891);ContextedRuntimeException e = new ContextedRuntimeException(); __CLR4_4_1g3vg3vldni84ye.R.inc(20892);e.addContextValue("key1", "value1"); __CLR4_4_1g3vg3vldni84ye.R.inc(20893);e.addContextValue("key2", "value2"); __CLR4_4_1g3vg3vldni84ye.R.inc(20894);e.addContextValue("key3", "value3"); __CLR4_4_1g3vg3vldni84ye.R.inc(20895);List<Pair<String, Object>> entries = e.getContextEntries(); __CLR4_4_1g3vg3vldni84ye.R.inc(20896);assertEquals(3, entries.size()); __CLR4_4_1g3vg3vldni84ye.R.inc(20897);assertEquals("key1", entries.get(0).getKey()); __CLR4_4_1g3vg3vldni84ye.R.inc(20898);assertEquals("value1", entries.get(0).getValue()); __CLR4_4_1g3vg3vldni84ye.R.inc(20899);assertEquals("value2", entries.get(1).getKey()); __CLR4_4_1g3vg3vldni84ye.R.inc(20900);assertEquals("value3", entries.get(1).getValue()); }finally{__CLR4_4_1g3vg3vldni84ye.R.flushNeeded();}}
@Test
public void testGetContextEntries1097() {__CLR4_4_1g3vg3vldni84ye.R.globalSliceStart(getClass().getName(),20901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ejr4ifg4l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g3vg3vldni84ye.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g3vg3vldni84ye.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.AbstractExceptionContextTest.testGetContextEntries1097",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20901,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ejr4ifg4l(){try{__CLR4_4_1g3vg3vldni84ye.R.inc(20901); __CLR4_4_1g3vg3vldni84ye.R.inc(20902);ContextedRuntimeException e = new ContextedRuntimeException(); __CLR4_4_1g3vg3vldni84ye.R.inc(20903);e.setContextValue("key1", "value1"); __CLR4_4_1g3vg3vldni84ye.R.inc(20904);e.setContextValue("key2", "value2"); __CLR4_4_1g3vg3vldni84ye.R.inc(20905);List<Pair<String, Object>> contextEntries = e.getContextEntries(); __CLR4_4_1g3vg3vldni84ye.R.inc(20906);assertEquals(2, contextEntries.size()); __CLR4_4_1g3vg3vldni84ye.R.inc(20907);assertEquals("key1", contextEntries.get(0).getKey()); __CLR4_4_1g3vg3vldni84ye.R.inc(20908);assertEquals("value1", contextEntries.get(0).getValue()); __CLR4_4_1g3vg3vldni84ye.R.inc(20909);assertEquals("value2", contextEntries.get(1).getKey()); __CLR4_4_1g3vg3vldni84ye.R.inc(20910);assertEquals("value2", contextEntries.get(1).getValue()); }finally{__CLR4_4_1g3vg3vldni84ye.R.flushNeeded();}}
    

    

    

    

    

    
    
    
}
