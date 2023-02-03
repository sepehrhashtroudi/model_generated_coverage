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

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.commons.lang3.builder.ToStringStyleTest.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.builder.SimpleToStringStyleTest}.
 *
 * @version $Id$
 */
public class SimpleToStringStyleTest {static class __CLR4_4_1fuqfuqldni84wd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,20562,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Integer base = Integer.valueOf(5);
    
    @Before
    public void setUp() throws Exception {try{__CLR4_4_1fuqfuqldni84wd.R.inc(20546);
        __CLR4_4_1fuqfuqldni84wd.R.inc(20547);ToStringBuilder.setDefaultStyle(ToStringStyle.SIMPLE_STYLE);
    }finally{__CLR4_4_1fuqfuqldni84wd.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1fuqfuqldni84wd.R.inc(20548);
        __CLR4_4_1fuqfuqldni84wd.R.inc(20549);ToStringBuilder.setDefaultStyle(ToStringStyle.DEFAULT_STYLE);
    }finally{__CLR4_4_1fuqfuqldni84wd.R.flushNeeded();}}

    //----------------------------------------------------------------
    
@Test
public void appendSummary() {__CLR4_4_1fuqfuqldni84wd.R.globalSliceStart(getClass().getName(),20550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p6yo0dfuu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fuqfuqldni84wd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fuqfuqldni84wd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.SimpleToStringStyleTest.appendSummary",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p6yo0dfuu(){try{__CLR4_4_1fuqfuqldni84wd.R.inc(20550); __CLR4_4_1fuqfuqldni84wd.R.inc(20551);String[] summary = { "one", "two", "three", "four", "five" }; __CLR4_4_1fuqfuqldni84wd.R.inc(20552);String[] expected = { "one", "two", "three", "four", "five" }; __CLR4_4_1fuqfuqldni84wd.R.inc(20553);String[] actual = { "one", "two", "three", "four", "five" }; __CLR4_4_1fuqfuqldni84wd.R.inc(20554);for (int i = 0; (((i < summary.length)&&(__CLR4_4_1fuqfuqldni84wd.R.iget(20555)!=0|true))||(__CLR4_4_1fuqfuqldni84wd.R.iget(20556)==0&false)); i++) {{ __CLR4_4_1fuqfuqldni84wd.R.inc(20557);assertEquals(expected[i], actual[i]); } }__CLR4_4_1fuqfuqldni84wd.R.inc(20558);for (int i = 0; (((i < expected.length)&&(__CLR4_4_1fuqfuqldni84wd.R.iget(20559)!=0|true))||(__CLR4_4_1fuqfuqldni84wd.R.iget(20560)==0&false)); i++) {{ __CLR4_4_1fuqfuqldni84wd.R.inc(20561);assertEquals(expected[i], actual[i]); } }}finally{__CLR4_4_1fuqfuqldni84wd.R.flushNeeded();}}
    

    
    
    

    

    

    

    

    

}
