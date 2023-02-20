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

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.InstanceCreator;
import com.google.gson.annotations.Expose;

import junit.framework.TestCase;

/**
 * Unit tests for the regarding functional "@Expose" type tests.
 *
 * @author Joel Leitch
 */
public class ExposeFieldsTest extends TestCase {static class __CLR4_4_142v42vle6rzgxl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532200005L,8589935092L,5315,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_142v42vle6rzgxl.R.inc(5287);
    __CLR4_4_142v42vle6rzgxl.R.inc(5288);super.setUp();
    __CLR4_4_142v42vle6rzgxl.R.inc(5289);gson = new GsonBuilder()
        .excludeFieldsWithoutExposeAnnotation()
        .registerTypeAdapter(SomeInterface.class, new SomeInterfaceInstanceCreator())
        .create();
  }finally{__CLR4_4_142v42vle6rzgxl.R.flushNeeded();}}

  

  

  

  

  

  
  
  
  
  

  @SuppressWarnings("unused")
  private static class ClassWithExposedFields {
    @Expose private final Integer a;
    private final Integer b;
    @Expose(serialize = false) final long c;
    @Expose(deserialize = false) final double d;
    @Expose(serialize = false, deserialize = false) final char e;

    // For use by Gson
    private ClassWithExposedFields() {
      this(null, null);__CLR4_4_142v42vle6rzgxl.R.inc(5291);try{__CLR4_4_142v42vle6rzgxl.R.inc(5290);
    }finally{__CLR4_4_142v42vle6rzgxl.R.flushNeeded();}}

    public ClassWithExposedFields(Integer a, Integer b) {
      this(a, b, 1L, 2.0, 'a');__CLR4_4_142v42vle6rzgxl.R.inc(5293);try{__CLR4_4_142v42vle6rzgxl.R.inc(5292);
    }finally{__CLR4_4_142v42vle6rzgxl.R.flushNeeded();}}
    public ClassWithExposedFields(Integer a, Integer b, long c, double d, char e) {try{__CLR4_4_142v42vle6rzgxl.R.inc(5294);
      __CLR4_4_142v42vle6rzgxl.R.inc(5295);this.a = a;
      __CLR4_4_142v42vle6rzgxl.R.inc(5296);this.b = b;
      __CLR4_4_142v42vle6rzgxl.R.inc(5297);this.c = c;
      __CLR4_4_142v42vle6rzgxl.R.inc(5298);this.d = d;
      __CLR4_4_142v42vle6rzgxl.R.inc(5299);this.e = e;
    }finally{__CLR4_4_142v42vle6rzgxl.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_142v42vle6rzgxl.R.inc(5300);
      __CLR4_4_142v42vle6rzgxl.R.inc(5301);StringBuilder sb = new StringBuilder("{");
      __CLR4_4_142v42vle6rzgxl.R.inc(5302);if ((((a != null)&&(__CLR4_4_142v42vle6rzgxl.R.iget(5303)!=0|true))||(__CLR4_4_142v42vle6rzgxl.R.iget(5304)==0&false))) {{
        __CLR4_4_142v42vle6rzgxl.R.inc(5305);sb.append("\"a\":").append(a).append(",");
      }
      }__CLR4_4_142v42vle6rzgxl.R.inc(5306);sb.append("\"d\":").append(d);
      __CLR4_4_142v42vle6rzgxl.R.inc(5307);sb.append("}");
      __CLR4_4_142v42vle6rzgxl.R.inc(5308);return sb.toString();
    }finally{__CLR4_4_142v42vle6rzgxl.R.flushNeeded();}}
  }

  private static class ClassWithNoExposedFields {
    private final int a = 0;
    private final int b = 1;
  }
  
  private static interface SomeInterface {
    // Empty interface
  }
  
  private static class SomeObject implements SomeInterface {
    // Do nothing
  }
  
  private static class SomeInterfaceInstanceCreator implements InstanceCreator<SomeInterface> {
    public SomeInterface createInstance(Type type) {try{__CLR4_4_142v42vle6rzgxl.R.inc(5309);
      __CLR4_4_142v42vle6rzgxl.R.inc(5310);return new SomeObject();
    }finally{__CLR4_4_142v42vle6rzgxl.R.flushNeeded();}}
  }
  
  private static class ClassWithInterfaceField {
    @Expose
    private final SomeInterface interfaceField;

    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithInterfaceField() {
      this(null);__CLR4_4_142v42vle6rzgxl.R.inc(5312);try{__CLR4_4_142v42vle6rzgxl.R.inc(5311);
    }finally{__CLR4_4_142v42vle6rzgxl.R.flushNeeded();}}

    public ClassWithInterfaceField(SomeInterface interfaceField) {try{__CLR4_4_142v42vle6rzgxl.R.inc(5313);
      __CLR4_4_142v42vle6rzgxl.R.inc(5314);this.interfaceField = interfaceField;
    }finally{__CLR4_4_142v42vle6rzgxl.R.flushNeeded();}}
  }  
}
