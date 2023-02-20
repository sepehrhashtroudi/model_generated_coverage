/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time.field;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * 
 *
 * @author Brian S O'Neill
 */
public class TestFieldUtils extends TestCase {static class __CLR4_4_1rx5rx5le6qealc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,36325,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) {try{__CLR4_4_1rx5rx5le6qealc.R.inc(36185);
        __CLR4_4_1rx5rx5le6qealc.R.inc(36186);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1rx5rx5le6qealc.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1rx5rx5le6qealc.R.inc(36187);
        __CLR4_4_1rx5rx5le6qealc.R.inc(36188);return new TestSuite(TestFieldUtils.class);
    }finally{__CLR4_4_1rx5rx5le6qealc.R.flushNeeded();}}

    public TestFieldUtils(String name) {
        super(name);__CLR4_4_1rx5rx5le6qealc.R.inc(36190);try{__CLR4_4_1rx5rx5le6qealc.R.inc(36189);
    }finally{__CLR4_4_1rx5rx5le6qealc.R.flushNeeded();}}


public void testSafeAddInt447() {__CLR4_4_1rx5rx5le6qealc.R.globalSliceStart(getClass().getName(),36191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11fblsfrxb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rx5rx5le6qealc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rx5rx5le6qealc.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeAddInt447",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36191,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11fblsfrxb(){try{__CLR4_4_1rx5rx5le6qealc.R.inc(36191); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36192);assertEquals(0, FieldUtils.safeAdd(0, 0)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36193);assertEquals(5, FieldUtils.safeAdd(2, 3)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36194);assertEquals(-1, FieldUtils.safeAdd(2, -3)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36195);assertEquals(1, FieldUtils.safeAdd(-2, 3)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36196);assertEquals(-5, FieldUtils.safeAdd(-2, -3)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36197);assertEquals(Integer.MAX_VALUE - 1, FieldUtils.safeAdd(Integer.MAX_VALUE, -1)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36198);assertEquals(Integer.MIN_VALUE + 1, FieldUtils.safeAdd(Integer.MIN_VALUE, 1)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36199);assertEquals(-1, FieldUtils.safeAdd(Integer.MIN_VALUE, Integer.MAX_VALUE)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36200);assertEquals(-1, FieldUtils.safeAdd(Integer.MAX_VALUE, Integer.MIN_VALUE)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36201);try { 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36202);FieldUtils.safeAdd(Integer.MAX_VALUE, 1); 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36203);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36204);try { 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36205);FieldUtils.safeAdd(Integer.MAX_VALUE, 100); 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36206);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36207);try { 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36208);FieldUtils.safeAdd(Integer.MAX_VALUE, Integer.MAX_VALUE); 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36209);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36210);try { 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36211);FieldUtils.safeAdd(Integer.MIN_VALUE, -1); 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36212);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36213);try { 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36214);FieldUtils.safeAdd(Integer.MIN_VALUE, -100); 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36215);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36216);try { 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36217);FieldUtils.safeAdd(Integer.MIN_VALUE, Integer.MIN_VALUE); 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36218);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1rx5rx5le6qealc.R.flushNeeded();}} 


public void testSafeAddLong448() {__CLR4_4_1rx5rx5le6qealc.R.globalSliceStart(getClass().getName(),36219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ff3fjzry3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rx5rx5le6qealc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rx5rx5le6qealc.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeAddLong448",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36219,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ff3fjzry3(){try{__CLR4_4_1rx5rx5le6qealc.R.inc(36219); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36220);assertEquals(0L, FieldUtils.safeAdd(0L, 0L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36221);assertEquals(5L, FieldUtils.safeAdd(2L, 3L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36222);assertEquals(-1L, FieldUtils.safeAdd(2L, -3L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36223);assertEquals(1L, FieldUtils.safeAdd(-2L, 3L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36224);assertEquals(-5L, FieldUtils.safeAdd(-2L, -3L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36225);assertEquals(Long.MAX_VALUE - 1, FieldUtils.safeAdd(Long.MAX_VALUE, -1L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36226);assertEquals(Long.MIN_VALUE + 1, FieldUtils.safeAdd(Long.MIN_VALUE, 1L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36227);assertEquals(-1, FieldUtils.safeAdd(Long.MIN_VALUE, Long.MAX_VALUE)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36228);assertEquals(-1, FieldUtils.safeAdd(Long.MAX_VALUE, Long.MIN_VALUE)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36229);try { 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36230);FieldUtils.safeAdd(Long.MAX_VALUE, 1L); 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36231);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36232);try { 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36233);FieldUtils.safeAdd(Long.MAX_VALUE, 100L); 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36234);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36235);try { 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36236);FieldUtils.safeAdd(Long.MAX_VALUE, Long.MAX_VALUE); 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36237);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36238);try { 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36239);FieldUtils.safeAdd(Long.MIN_VALUE, -1L); 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36240);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36241);try { 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36242);FieldUtils.safeAdd(Long.MIN_VALUE, -100L); 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36243);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36244);try { 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36245);FieldUtils.safeAdd(Long.MIN_VALUE, Long.MIN_VALUE); 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36246);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1rx5rx5le6qealc.R.flushNeeded();}} 


public void testSafeMultiplyLongInt450() {__CLR4_4_1rx5rx5le6qealc.R.globalSliceStart(getClass().getName(),36247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13a3seyryv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rx5rx5le6qealc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rx5rx5le6qealc.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeMultiplyLongInt450",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13a3seyryv(){try{__CLR4_4_1rx5rx5le6qealc.R.inc(36247); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36248);assertEquals(0L, FieldUtils.safeMultiply(0L, 0)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36249);assertEquals(1L, FieldUtils.safeMultiply(1L, 1)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36250);assertEquals(3L, FieldUtils.safeMultiply(1L, 3)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36251);assertEquals(3L, FieldUtils.safeMultiply(3L, 1)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36252);assertEquals(6L, FieldUtils.safeMultiply(2L, 3)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36253);assertEquals(-6L, FieldUtils.safeMultiply(2L, -3)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36254);assertEquals(-6L, FieldUtils.safeMultiply(-2L, 3)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36255);assertEquals(6L, FieldUtils.safeMultiply(-2L, -3)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36256);assertEquals(-1L * Integer.MIN_VALUE, FieldUtils.safeMultiply(-1L, Integer.MIN_VALUE)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36257);assertEquals(Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, 1)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36258);assertEquals(Long.MIN_VALUE, FieldUtils.safeMultiply(Long.MIN_VALUE, 1)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36259);assertEquals(-Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, -1)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36260);try { 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36261);FieldUtils.safeMultiply(Long.MIN_VALUE, -1); 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36262);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36263);try { 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36264);FieldUtils.safeMultiply(Long.MIN_VALUE, 100); 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36265);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36266);try { 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36267);FieldUtils.safeMultiply(Long.MIN_VALUE, Integer.MAX_VALUE); 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36268);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36269);try { 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36270);FieldUtils.safeMultiply(Long.MAX_VALUE, Integer.MIN_VALUE); 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36271);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1rx5rx5le6qealc.R.flushNeeded();}} 


public void testSafeMultiplyLongLong451() {__CLR4_4_1rx5rx5le6qealc.R.globalSliceStart(getClass().getName(),36272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1254wrgrzk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rx5rx5le6qealc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rx5rx5le6qealc.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeMultiplyLongLong451",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1254wrgrzk(){try{__CLR4_4_1rx5rx5le6qealc.R.inc(36272); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36273);assertEquals(0L, FieldUtils.safeMultiply(0L, 0L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36274);assertEquals(1L, FieldUtils.safeMultiply(1L, 1L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36275);assertEquals(3L, FieldUtils.safeMultiply(1L, 3L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36276);assertEquals(3L, FieldUtils.safeMultiply(3L, 1L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36277);assertEquals(6L, FieldUtils.safeMultiply(2L, 3L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36278);assertEquals(-6L, FieldUtils.safeMultiply(2L, -3L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36279);assertEquals(-6L, FieldUtils.safeMultiply(-2L, 3L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36280);assertEquals(6L, FieldUtils.safeMultiply(-2L, -3L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36281);assertEquals(Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, 1L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36282);assertEquals(Long.MIN_VALUE, FieldUtils.safeMultiply(Long.MIN_VALUE, 1L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36283);assertEquals(-Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, -1L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36284);try { 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36285);FieldUtils.safeMultiply(Long.MIN_VALUE, -1L); 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36286);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36287);try { 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36288);FieldUtils.safeMultiply(-1L, Long.MIN_VALUE); 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36289);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36290);try { 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36291);FieldUtils.safeMultiply(Long.MIN_VALUE, 100L); 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36292);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36293);try { 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36294);FieldUtils.safeMultiply(Long.MIN_VALUE, Long.MAX_VALUE); 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36295);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36296);try { 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36297);FieldUtils.safeMultiply(Long.MAX_VALUE, Long.MIN_VALUE); 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36298);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1rx5rx5le6qealc.R.flushNeeded();}} 


public void testSafeDivideLongLong452() {__CLR4_4_1rx5rx5le6qealc.R.globalSliceStart(getClass().getName(),36299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12hi8mgs0b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rx5rx5le6qealc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rx5rx5le6qealc.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeDivideLongLong452",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12hi8mgs0b(){try{__CLR4_4_1rx5rx5le6qealc.R.inc(36299); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36300);assertEquals(1L, FieldUtils.safeDivide(1L, 1L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36301);assertEquals(1L, FieldUtils.safeDivide(3L, 3L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36302);assertEquals(0L, FieldUtils.safeDivide(1L, 3L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36303);assertEquals(3L, FieldUtils.safeDivide(3L, 1L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36304);assertEquals(1L, FieldUtils.safeDivide(5L, 3L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36305);assertEquals(-1L, FieldUtils.safeDivide(5L, -3L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36306);assertEquals(-1L, FieldUtils.safeDivide(-5L, 3L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36307);assertEquals(1L, FieldUtils.safeDivide(-5L, -3L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36308);assertEquals(2L, FieldUtils.safeDivide(6L, 3L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36309);assertEquals(-2L, FieldUtils.safeDivide(6L, -3L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36310);assertEquals(-2L, FieldUtils.safeDivide(-6L, 3L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36311);assertEquals(2L, FieldUtils.safeDivide(-6L, -3L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36312);assertEquals(2L, FieldUtils.safeDivide(7L, 3L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36313);assertEquals(-2L, FieldUtils.safeDivide(7L, -3L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36314);assertEquals(-2L, FieldUtils.safeDivide(-7L, 3L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36315);assertEquals(2L, FieldUtils.safeDivide(-7L, -3L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36316);assertEquals(Long.MAX_VALUE, FieldUtils.safeDivide(Long.MAX_VALUE, 1L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36317);assertEquals(Long.MIN_VALUE, FieldUtils.safeDivide(Long.MIN_VALUE, 1L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36318);assertEquals(-Long.MAX_VALUE, FieldUtils.safeDivide(Long.MAX_VALUE, -1L)); 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36319);try { 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36320);FieldUtils.safeDivide(Long.MIN_VALUE, -1L); 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36321);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rx5rx5le6qealc.R.inc(36322);try { 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36323);FieldUtils.safeDivide(1L, 0L); 
         __CLR4_4_1rx5rx5le6qealc.R.inc(36324);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1rx5rx5le6qealc.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
