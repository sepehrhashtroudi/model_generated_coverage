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

import com.google.gson.DefaultTypeAdapters.DefaultDateTypeAdapter;

import junit.framework.TestCase;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.Date;

/**
 * Simple unit tests for the {@link JsonDeserializerExceptionWrapper} class.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class JsonDeserializerExceptionWrapperTest extends TestCase {static class __CLR4_4_134i34ild3ms3w6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674165277821L,8589935092L,4075,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  private static final String DATE_STRING =
      DateFormat.getDateInstance(DateFormat.LONG).format(new Date());
  private static final JsonPrimitive PRIMITIVE_ELEMENT = new JsonPrimitive(DATE_STRING);


public void testProperSerialization82() throws Exception {__CLR4_4_134i34ild3ms3w6.R.globalSliceStart(getClass().getName(),4050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_118cndb34i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_134i34ild3ms3w6.R.rethrow($CLV_t2$);}finally{__CLR4_4_134i34ild3ms3w6.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonDeserializerExceptionWrapperTest.testProperSerialization82",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4050,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_118cndb34i() throws Exception{try{__CLR4_4_134i34ild3ms3w6.R.inc(4050); 
     __CLR4_4_134i34ild3ms3w6.R.inc(4051);DefaultDateTypeAdapter dateSerializer = new DefaultDateTypeAdapter(DateFormat.LONG); 
     __CLR4_4_134i34ild3ms3w6.R.inc(4052);JsonDeserializerExceptionWrapper<Date> wrappedJsonSerializer = new JsonDeserializerExceptionWrapper<Date>(dateSerializer); 
     __CLR4_4_134i34ild3ms3w6.R.inc(4053);Date expected = dateSerializer.deserialize(PRIMITIVE_ELEMENT, Date.class, null); 
     __CLR4_4_134i34ild3ms3w6.R.inc(4054);Date actual = wrappedJsonSerializer.deserialize(PRIMITIVE_ELEMENT, Date.class, null); 
     __CLR4_4_134i34ild3ms3w6.R.inc(4055);assertEquals(expected, actual); 
 }finally{__CLR4_4_134i34ild3ms3w6.R.flushNeeded();}} 


public void testRethrowJsonParseException166() throws Exception {__CLR4_4_134i34ild3ms3w6.R.globalSliceStart(getClass().getName(),4056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12932tp34o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_134i34ild3ms3w6.R.rethrow($CLV_t2$);}finally{__CLR4_4_134i34ild3ms3w6.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonDeserializerExceptionWrapperTest.testRethrowJsonParseException166",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4056,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12932tp34o() throws Exception{try{__CLR4_4_134i34ild3ms3w6.R.inc(4056); 
     __CLR4_4_134i34ild3ms3w6.R.inc(4057);String errorMsg = "please rethrow me"; 
     __CLR4_4_134i34ild3ms3w6.R.inc(4058);JsonDeserializerExceptionWrapper<String> wrappedJsonSerializer = new JsonDeserializerExceptionWrapper<String>(new ExceptionJsonDeserializer(new JsonParseException(errorMsg))); 
     __CLR4_4_134i34ild3ms3w6.R.inc(4059);try { 
         __CLR4_4_134i34ild3ms3w6.R.inc(4060);wrappedJsonSerializer.deserialize(PRIMITIVE_ELEMENT, String.class, null); 
         __CLR4_4_134i34ild3ms3w6.R.inc(4061);fail("JsonParseException should have been thrown"); 
     } catch (JsonParseException expected) { 
         __CLR4_4_134i34ild3ms3w6.R.inc(4062);assertNull(expected.getCause()); 
         __CLR4_4_134i34ild3ms3w6.R.inc(4063);assertEquals(errorMsg, expected.getMessage()); 
     } 
 }finally{__CLR4_4_134i34ild3ms3w6.R.flushNeeded();}} 


public void testWrappedExceptionPropagation167() throws Exception {__CLR4_4_134i34ild3ms3w6.R.globalSliceStart(getClass().getName(),4064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vjpt3d34w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_134i34ild3ms3w6.R.rethrow($CLV_t2$);}finally{__CLR4_4_134i34ild3ms3w6.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonDeserializerExceptionWrapperTest.testWrappedExceptionPropagation167",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4064,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vjpt3d34w() throws Exception{try{__CLR4_4_134i34ild3ms3w6.R.inc(4064); 
     __CLR4_4_134i34ild3ms3w6.R.inc(4065);IllegalArgumentException exceptionToThrow = new IllegalArgumentException(); 
     __CLR4_4_134i34ild3ms3w6.R.inc(4066);JsonDeserializerExceptionWrapper<String> wrappedJsonSerializer = new JsonDeserializerExceptionWrapper<String>(new ExceptionJsonDeserializer(exceptionToThrow)); 
     __CLR4_4_134i34ild3ms3w6.R.inc(4067);try { 
         __CLR4_4_134i34ild3ms3w6.R.inc(4068);wrappedJsonSerializer.deserialize(PRIMITIVE_ELEMENT, String.class, null); 
         __CLR4_4_134i34ild3ms3w6.R.inc(4069);fail("JsonParseException should have been thrown"); 
     } catch (JsonParseException expected) { 
         __CLR4_4_134i34ild3ms3w6.R.inc(4070);assertEquals(exceptionToThrow, expected.getCause()); 
     } 
 }finally{__CLR4_4_134i34ild3ms3w6.R.flushNeeded();}} 

  

  

  

  private static class ExceptionJsonDeserializer implements JsonDeserializer<String> {
    private final RuntimeException exceptionToThrow;

    public ExceptionJsonDeserializer(RuntimeException exceptionToThrow) {try{__CLR4_4_134i34ild3ms3w6.R.inc(4071);
      __CLR4_4_134i34ild3ms3w6.R.inc(4072);this.exceptionToThrow = exceptionToThrow;
    }finally{__CLR4_4_134i34ild3ms3w6.R.flushNeeded();}}

    public String deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_134i34ild3ms3w6.R.inc(4073);
      __CLR4_4_134i34ild3ms3w6.R.inc(4074);throw exceptionToThrow;
    }finally{__CLR4_4_134i34ild3ms3w6.R.flushNeeded();}}
  }
}
