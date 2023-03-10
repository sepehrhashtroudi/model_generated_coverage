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

package com.google.gson;

import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;

/**
 * This strategy will exclude any files and/or class that are passed the
 * {@link #version} value.
 *
 * @author Joel Leitch
 */
final class VersionExclusionStrategy implements ExclusionStrategy {public static class __CLR4_4_128b28ble6rxjtz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532109058L,8589935092L,2920,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private final double version;

  public VersionExclusionStrategy(double version) {try{__CLR4_4_128b28ble6rxjtz.R.inc(2891);
    __CLR4_4_128b28ble6rxjtz.R.inc(2892);Preconditions.checkArgument(version >= 0.0D);
    __CLR4_4_128b28ble6rxjtz.R.inc(2893);this.version = version;
  }finally{__CLR4_4_128b28ble6rxjtz.R.flushNeeded();}}

  public boolean shouldSkipField(FieldAttributes f) {try{__CLR4_4_128b28ble6rxjtz.R.inc(2894);
    __CLR4_4_128b28ble6rxjtz.R.inc(2895);return !isValidVersion(f.getAnnotation(Since.class), f.getAnnotation(Until.class));
  }finally{__CLR4_4_128b28ble6rxjtz.R.flushNeeded();}}

  public boolean shouldSkipClass(Class<?> clazz) {try{__CLR4_4_128b28ble6rxjtz.R.inc(2896);
    __CLR4_4_128b28ble6rxjtz.R.inc(2897);return !isValidVersion(clazz.getAnnotation(Since.class), clazz.getAnnotation(Until.class));
  }finally{__CLR4_4_128b28ble6rxjtz.R.flushNeeded();}}

  private boolean isValidVersion(Since since, Until until) {try{__CLR4_4_128b28ble6rxjtz.R.inc(2898);
    __CLR4_4_128b28ble6rxjtz.R.inc(2899);return (isValidSince(since) && isValidUntil(until));
  }finally{__CLR4_4_128b28ble6rxjtz.R.flushNeeded();}}

  private boolean isValidSince(Since annotation) {try{__CLR4_4_128b28ble6rxjtz.R.inc(2900);
    __CLR4_4_128b28ble6rxjtz.R.inc(2901);if ((((annotation != null)&&(__CLR4_4_128b28ble6rxjtz.R.iget(2902)!=0|true))||(__CLR4_4_128b28ble6rxjtz.R.iget(2903)==0&false))) {{
      __CLR4_4_128b28ble6rxjtz.R.inc(2904);double annotationVersion = annotation.value();
      __CLR4_4_128b28ble6rxjtz.R.inc(2905);if ((((annotationVersion > version)&&(__CLR4_4_128b28ble6rxjtz.R.iget(2906)!=0|true))||(__CLR4_4_128b28ble6rxjtz.R.iget(2907)==0&false))) {{
        __CLR4_4_128b28ble6rxjtz.R.inc(2908);return false;
      }
    }}
    }__CLR4_4_128b28ble6rxjtz.R.inc(2909);return true;
  }finally{__CLR4_4_128b28ble6rxjtz.R.flushNeeded();}}

  private boolean isValidUntil(Until annotation) {try{__CLR4_4_128b28ble6rxjtz.R.inc(2910);
    __CLR4_4_128b28ble6rxjtz.R.inc(2911);if ((((annotation != null)&&(__CLR4_4_128b28ble6rxjtz.R.iget(2912)!=0|true))||(__CLR4_4_128b28ble6rxjtz.R.iget(2913)==0&false))) {{
      __CLR4_4_128b28ble6rxjtz.R.inc(2914);double annotationVersion = annotation.value();
      __CLR4_4_128b28ble6rxjtz.R.inc(2915);if ((((annotationVersion <= version)&&(__CLR4_4_128b28ble6rxjtz.R.iget(2916)!=0|true))||(__CLR4_4_128b28ble6rxjtz.R.iget(2917)==0&false))) {{
        __CLR4_4_128b28ble6rxjtz.R.inc(2918);return false;
      }
    }}
    }__CLR4_4_128b28ble6rxjtz.R.inc(2919);return true;
  }finally{__CLR4_4_128b28ble6rxjtz.R.flushNeeded();}}
}
