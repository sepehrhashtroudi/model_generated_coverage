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

package com.google.gson.common;

import junit.framework.Assert;

import java.util.Collection;

/**
 * Handy asserts that we wish were present in {@link Assert}
 * so that we didn't have to write them.
 *
 * @author Inderjeet Singh
 */
public class MoreAsserts {public static class __CLR4_4_1394394le6ouxh5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676526949504L,8589935092L,4243,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  public static void assertEquals(int[] expected, int[] target) {try{__CLR4_4_1394394le6ouxh5.R.inc(4216);
    __CLR4_4_1394394le6ouxh5.R.inc(4217);if ((((expected == null)&&(__CLR4_4_1394394le6ouxh5.R.iget(4218)!=0|true))||(__CLR4_4_1394394le6ouxh5.R.iget(4219)==0&false))) {{
      __CLR4_4_1394394le6ouxh5.R.inc(4220);Assert.assertNull(target);
    }
    }__CLR4_4_1394394le6ouxh5.R.inc(4221);Assert.assertEquals(expected.length, target.length);
    __CLR4_4_1394394le6ouxh5.R.inc(4222);for (int i = 0; (((i < expected.length)&&(__CLR4_4_1394394le6ouxh5.R.iget(4223)!=0|true))||(__CLR4_4_1394394le6ouxh5.R.iget(4224)==0&false)); ++i) {{
      __CLR4_4_1394394le6ouxh5.R.inc(4225);Assert.assertEquals(expected[i], target[i]);
    }
  }}finally{__CLR4_4_1394394le6ouxh5.R.flushNeeded();}}

  public static void assertEquals(Integer[] expected, Integer[] target) {try{__CLR4_4_1394394le6ouxh5.R.inc(4226);
    __CLR4_4_1394394le6ouxh5.R.inc(4227);if ((((expected == null)&&(__CLR4_4_1394394le6ouxh5.R.iget(4228)!=0|true))||(__CLR4_4_1394394le6ouxh5.R.iget(4229)==0&false))) {{
      __CLR4_4_1394394le6ouxh5.R.inc(4230);Assert.assertNull(target);
    }
    }__CLR4_4_1394394le6ouxh5.R.inc(4231);Assert.assertEquals(expected.length, target.length);
    __CLR4_4_1394394le6ouxh5.R.inc(4232);for (int i = 0; (((i < expected.length)&&(__CLR4_4_1394394le6ouxh5.R.iget(4233)!=0|true))||(__CLR4_4_1394394le6ouxh5.R.iget(4234)==0&false)); ++i) {{
      __CLR4_4_1394394le6ouxh5.R.inc(4235);Assert.assertEquals(expected[i], target[i]);
    }
  }}finally{__CLR4_4_1394394le6ouxh5.R.flushNeeded();}}

  /**
   * Asserts that the specified {@code value} is not present in {@code collection}
   * @param collection the collection to look into
   * @param value the value that needs to be checked for presence
   */
  public static <T> void assertContains(Collection<T> collection, T value) {try{__CLR4_4_1394394le6ouxh5.R.inc(4236);
    __CLR4_4_1394394le6ouxh5.R.inc(4237);for (T entry : collection) {{
      __CLR4_4_1394394le6ouxh5.R.inc(4238);if ((((entry.equals(value))&&(__CLR4_4_1394394le6ouxh5.R.iget(4239)!=0|true))||(__CLR4_4_1394394le6ouxh5.R.iget(4240)==0&false))) {{
        __CLR4_4_1394394le6ouxh5.R.inc(4241);return;
      }
    }}
    }__CLR4_4_1394394le6ouxh5.R.inc(4242);Assert.fail(value + " not present in " + collection);
  }finally{__CLR4_4_1394394le6ouxh5.R.flushNeeded();}}
}
