/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package com.google.gson.functional;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import junit.framework.TestCase;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.common.TestTypes.BagOfPrimitives;

/**
 * Functional tests for {@link Gson#toJsonTree(Object)} and 
 * {@link Gson#toJsonTree(Object, java.lang.reflect.Type)}
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class JsonTreeTest extends TestCase {static class __CLR4_4_148t48tle6rvqr6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0030\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676532025874L,8589935092L,5529,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_148t48tle6rvqr6.R.inc(5501);
    __CLR4_4_148t48tle6rvqr6.R.inc(5502);super.setUp();
    __CLR4_4_148t48tle6rvqr6.R.inc(5503);gson = new Gson();
  }finally{__CLR4_4_148t48tle6rvqr6.R.flushNeeded();}}


public void testToJsonTreeObjectType206() {__CLR4_4_148t48tle6rvqr6.R.globalSliceStart(getClass().getName(),5504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1unmwib48w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_148t48tle6rvqr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_148t48tle6rvqr6.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.JsonTreeTest.testToJsonTreeObjectType206",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5504,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1unmwib48w(){try{__CLR4_4_148t48tle6rvqr6.R.inc(5504); 
     __CLR4_4_148t48tle6rvqr6.R.inc(5505);SubTypeOfBagOfPrimitives bag = new SubTypeOfBagOfPrimitives(10L, 5, false, "foo", 1.4F); 
     __CLR4_4_148t48tle6rvqr6.R.inc(5506);JsonElement json = gson.toJsonTree(bag, BagOfPrimitives.class); 
     __CLR4_4_148t48tle6rvqr6.R.inc(5507);assertTrue(json.isJsonObject()); 
     __CLR4_4_148t48tle6rvqr6.R.inc(5508);JsonObject obj = json.getAsJsonObject(); 
     __CLR4_4_148t48tle6rvqr6.R.inc(5509);Set<Entry<String, JsonElement>> children = obj.entrySet(); 
     __CLR4_4_148t48tle6rvqr6.R.inc(5510);assertEquals(4, children.size()); 
     __CLR4_4_148t48tle6rvqr6.R.inc(5511);assertContains(obj, new JsonPrimitive(10L)); 
     __CLR4_4_148t48tle6rvqr6.R.inc(5512);assertContains(obj, new JsonPrimitive(5)); 
     __CLR4_4_148t48tle6rvqr6.R.inc(5513);assertContains(obj, new JsonPrimitive(false)); 
     __CLR4_4_148t48tle6rvqr6.R.inc(5514);assertContains(obj, new JsonPrimitive("foo")); 
 }finally{__CLR4_4_148t48tle6rvqr6.R.flushNeeded();}} 

  

  

  

  private void assertContains(JsonObject json, JsonPrimitive child) {try{__CLR4_4_148t48tle6rvqr6.R.inc(5515);
    __CLR4_4_148t48tle6rvqr6.R.inc(5516);for (Map.Entry<String, JsonElement> entry : json.entrySet()) {{
      __CLR4_4_148t48tle6rvqr6.R.inc(5517);JsonElement node = entry.getValue();
      __CLR4_4_148t48tle6rvqr6.R.inc(5518);if ((((node.isJsonPrimitive())&&(__CLR4_4_148t48tle6rvqr6.R.iget(5519)!=0|true))||(__CLR4_4_148t48tle6rvqr6.R.iget(5520)==0&false))) {{
        __CLR4_4_148t48tle6rvqr6.R.inc(5521);if ((((node.getAsJsonPrimitive().equals(child))&&(__CLR4_4_148t48tle6rvqr6.R.iget(5522)!=0|true))||(__CLR4_4_148t48tle6rvqr6.R.iget(5523)==0&false))) {{
          __CLR4_4_148t48tle6rvqr6.R.inc(5524);return;
        }
      }}
    }}
    }__CLR4_4_148t48tle6rvqr6.R.inc(5525);fail();
  }finally{__CLR4_4_148t48tle6rvqr6.R.flushNeeded();}}
  
  private static class SubTypeOfBagOfPrimitives extends BagOfPrimitives {
    @SuppressWarnings("unused")
    float f = 1.2F;
    public SubTypeOfBagOfPrimitives(long l, int i, boolean b, String string, float f) {
      super(l, i, b, string);__CLR4_4_148t48tle6rvqr6.R.inc(5527);try{__CLR4_4_148t48tle6rvqr6.R.inc(5526);
      __CLR4_4_148t48tle6rvqr6.R.inc(5528);this.f = f;
    }finally{__CLR4_4_148t48tle6rvqr6.R.flushNeeded();}}
  }
}
