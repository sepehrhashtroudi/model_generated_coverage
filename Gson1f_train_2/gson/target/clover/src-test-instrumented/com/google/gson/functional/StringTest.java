/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package com.google.gson.functional;

import com.google.gson.Gson;

import junit.framework.TestCase;

/**
 * Functional tests for Json serialization and deserialization of strings.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class StringTest extends TestCase {static class __CLR4_4_14nq4nqld3ms467{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1674165277821L,8589935092L,6045,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_14nq4nqld3ms467.R.inc(6038);
    __CLR4_4_14nq4nqld3ms467.R.inc(6039);super.setUp();
    __CLR4_4_14nq4nqld3ms467.R.inc(6040);gson = new Gson();
  }finally{__CLR4_4_14nq4nqld3ms467.R.flushNeeded();}}
  

public void testSingleQuoteInStringSerialization25() throws Exception {__CLR4_4_14nq4nqld3ms467.R.globalSliceStart(getClass().getName(),6041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o9egiq4nt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14nq4nqld3ms467.R.rethrow($CLV_t2$);}finally{__CLR4_4_14nq4nqld3ms467.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.StringTest.testSingleQuoteInStringSerialization25",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6041,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o9egiq4nt() throws Exception{try{__CLR4_4_14nq4nqld3ms467.R.inc(6041); 
     __CLR4_4_14nq4nqld3ms467.R.inc(6042);String valueWithQuotes = "beforeQuote'afterQuote"; 
     __CLR4_4_14nq4nqld3ms467.R.inc(6043);String jsonRepresentation = gson.toJson(valueWithQuotes); 
     __CLR4_4_14nq4nqld3ms467.R.inc(6044);assertEquals(valueWithQuotes, gson.fromJson(jsonRepresentation, String.class)); 
 }finally{__CLR4_4_14nq4nqld3ms467.R.flushNeeded();}} 

  

  

  

  

  

  

  

  

  

  

  

  

  

  
  
  
  
  /**
   * Created in response to http://groups.google.com/group/google-gson/browse_thread/thread/2431d4a3d0d6cb23
   */
  
  
  /**
   * Created in response to http://groups.google.com/group/google-gson/browse_thread/thread/2431d4a3d0d6cb23
   */
  
  
  
  
  
}
