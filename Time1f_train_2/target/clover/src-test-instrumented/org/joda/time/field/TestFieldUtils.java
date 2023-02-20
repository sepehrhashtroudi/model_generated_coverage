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
public class TestFieldUtils extends TestCase {static class __CLR4_4_1rtortole6qsfk8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,36174,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) {try{__CLR4_4_1rtortole6qsfk8.R.inc(36060);
        __CLR4_4_1rtortole6qsfk8.R.inc(36061);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1rtortole6qsfk8.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1rtortole6qsfk8.R.inc(36062);
        __CLR4_4_1rtortole6qsfk8.R.inc(36063);return new TestSuite(TestFieldUtils.class);
    }finally{__CLR4_4_1rtortole6qsfk8.R.flushNeeded();}}

    public TestFieldUtils(String name) {
        super(name);__CLR4_4_1rtortole6qsfk8.R.inc(36065);try{__CLR4_4_1rtortole6qsfk8.R.inc(36064);
    }finally{__CLR4_4_1rtortole6qsfk8.R.flushNeeded();}}


public void testSafeAddInt420() {__CLR4_4_1rtortole6qsfk8.R.globalSliceStart(getClass().getName(),36066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ckx4fortu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtortole6qsfk8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtortole6qsfk8.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeAddInt420",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36066,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ckx4fortu(){try{__CLR4_4_1rtortole6qsfk8.R.inc(36066); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36067);assertEquals(0, FieldUtils.safeAdd(0, 0)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36068);assertEquals(5, FieldUtils.safeAdd(2, 3)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36069);assertEquals(-1, FieldUtils.safeAdd(2, -3)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36070);assertEquals(1, FieldUtils.safeAdd(-2, 3)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36071);assertEquals(-5, FieldUtils.safeAdd(-2, -3)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36072);assertEquals(Integer.MAX_VALUE - 1, FieldUtils.safeAdd(Integer.MAX_VALUE, -1)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36073);assertEquals(Integer.MIN_VALUE + 1, FieldUtils.safeAdd(Integer.MIN_VALUE, 1)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36074);assertEquals(-1, FieldUtils.safeAdd(Integer.MIN_VALUE, Integer.MAX_VALUE)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36075);assertEquals(-1, FieldUtils.safeAdd(Integer.MAX_VALUE, Integer.MIN_VALUE)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36076);try { 
         __CLR4_4_1rtortole6qsfk8.R.inc(36077);FieldUtils.safeAdd(Integer.MAX_VALUE, 1); 
         __CLR4_4_1rtortole6qsfk8.R.inc(36078);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rtortole6qsfk8.R.inc(36079);try { 
         __CLR4_4_1rtortole6qsfk8.R.inc(36080);FieldUtils.safeAdd(Integer.MAX_VALUE, 100); 
         __CLR4_4_1rtortole6qsfk8.R.inc(36081);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rtortole6qsfk8.R.inc(36082);try { 
         __CLR4_4_1rtortole6qsfk8.R.inc(36083);FieldUtils.safeAdd(Integer.MAX_VALUE, Integer.MAX_VALUE); 
         __CLR4_4_1rtortole6qsfk8.R.inc(36084);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rtortole6qsfk8.R.inc(36085);try { 
         __CLR4_4_1rtortole6qsfk8.R.inc(36086);FieldUtils.safeAdd(Integer.MIN_VALUE, -1); 
         __CLR4_4_1rtortole6qsfk8.R.inc(36087);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rtortole6qsfk8.R.inc(36088);try { 
         __CLR4_4_1rtortole6qsfk8.R.inc(36089);FieldUtils.safeAdd(Integer.MIN_VALUE, -100); 
         __CLR4_4_1rtortole6qsfk8.R.inc(36090);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rtortole6qsfk8.R.inc(36091);try { 
         __CLR4_4_1rtortole6qsfk8.R.inc(36092);FieldUtils.safeAdd(Integer.MIN_VALUE, Integer.MIN_VALUE); 
         __CLR4_4_1rtortole6qsfk8.R.inc(36093);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1rtortole6qsfk8.R.flushNeeded();}} 


public void testSafeSubtractLong421() {__CLR4_4_1rtortole6qsfk8.R.globalSliceStart(getClass().getName(),36094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k9n99xrum();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtortole6qsfk8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtortole6qsfk8.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeSubtractLong421",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k9n99xrum(){try{__CLR4_4_1rtortole6qsfk8.R.inc(36094); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36095);assertEquals(0L, FieldUtils.safeSubtract(0L, 0L)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36096);assertEquals(-1L, FieldUtils.safeSubtract(2L, 3L)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36097);assertEquals(5L, FieldUtils.safeSubtract(2L, -3L)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36098);assertEquals(-5L, FieldUtils.safeSubtract(-2L, 3L)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36099);assertEquals(1L, FieldUtils.safeSubtract(-2L, -3L)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36100);assertEquals(Long.MAX_VALUE - 1, FieldUtils.safeSubtract(Long.MAX_VALUE, 1L)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36101);assertEquals(Long.MIN_VALUE + 1, FieldUtils.safeSubtract(Long.MIN_VALUE, -1L)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36102);assertEquals(0, FieldUtils.safeSubtract(Long.MIN_VALUE, Long.MIN_VALUE)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36103);assertEquals(0, FieldUtils.safeSubtract(Long.MAX_VALUE, Long.MAX_VALUE)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36104);try { 
         __CLR4_4_1rtortole6qsfk8.R.inc(36105);FieldUtils.safeSubtract(Long.MIN_VALUE, 1L); 
         __CLR4_4_1rtortole6qsfk8.R.inc(36106);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rtortole6qsfk8.R.inc(36107);try { 
         __CLR4_4_1rtortole6qsfk8.R.inc(36108);FieldUtils.safeSubtract(Long.MIN_VALUE, 100L); 
         __CLR4_4_1rtortole6qsfk8.R.inc(36109);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rtortole6qsfk8.R.inc(36110);try { 
         __CLR4_4_1rtortole6qsfk8.R.inc(36111);FieldUtils.safeSubtract(Long.MIN_VALUE, Long.MAX_VALUE); 
         __CLR4_4_1rtortole6qsfk8.R.inc(36112);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rtortole6qsfk8.R.inc(36113);try { 
         __CLR4_4_1rtortole6qsfk8.R.inc(36114);FieldUtils.safeSubtract(Long.MAX_VALUE, -1L); 
         __CLR4_4_1rtortole6qsfk8.R.inc(36115);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rtortole6qsfk8.R.inc(36116);try { 
         __CLR4_4_1rtortole6qsfk8.R.inc(36117);FieldUtils.safeSubtract(Long.MAX_VALUE, -100L); 
         __CLR4_4_1rtortole6qsfk8.R.inc(36118);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rtortole6qsfk8.R.inc(36119);try { 
         __CLR4_4_1rtortole6qsfk8.R.inc(36120);FieldUtils.safeSubtract(Long.MAX_VALUE, Long.MIN_VALUE); 
         __CLR4_4_1rtortole6qsfk8.R.inc(36121);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1rtortole6qsfk8.R.flushNeeded();}} 


public void testSafeMultiplyLongInt423() {__CLR4_4_1rtortole6qsfk8.R.globalSliceStart(getClass().getName(),36122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bnkjp0rve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtortole6qsfk8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtortole6qsfk8.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeMultiplyLongInt423",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bnkjp0rve(){try{__CLR4_4_1rtortole6qsfk8.R.inc(36122); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36123);assertEquals(0L, FieldUtils.safeMultiply(0L, 0)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36124);assertEquals(1L, FieldUtils.safeMultiply(1L, 1)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36125);assertEquals(3L, FieldUtils.safeMultiply(1L, 3)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36126);assertEquals(3L, FieldUtils.safeMultiply(3L, 1)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36127);assertEquals(6L, FieldUtils.safeMultiply(2L, 3)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36128);assertEquals(-6L, FieldUtils.safeMultiply(2L, -3)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36129);assertEquals(-6L, FieldUtils.safeMultiply(-2L, 3)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36130);assertEquals(6L, FieldUtils.safeMultiply(-2L, -3)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36131);assertEquals(-1L * Integer.MIN_VALUE, FieldUtils.safeMultiply(-1L, Integer.MIN_VALUE)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36132);assertEquals(Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, 1)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36133);assertEquals(Long.MIN_VALUE, FieldUtils.safeMultiply(Long.MIN_VALUE, 1)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36134);assertEquals(-Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, -1)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36135);try { 
         __CLR4_4_1rtortole6qsfk8.R.inc(36136);FieldUtils.safeMultiply(Long.MIN_VALUE, -1); 
         __CLR4_4_1rtortole6qsfk8.R.inc(36137);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rtortole6qsfk8.R.inc(36138);try { 
         __CLR4_4_1rtortole6qsfk8.R.inc(36139);FieldUtils.safeMultiply(Long.MIN_VALUE, 100); 
         __CLR4_4_1rtortole6qsfk8.R.inc(36140);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rtortole6qsfk8.R.inc(36141);try { 
         __CLR4_4_1rtortole6qsfk8.R.inc(36142);FieldUtils.safeMultiply(Long.MIN_VALUE, Integer.MAX_VALUE); 
         __CLR4_4_1rtortole6qsfk8.R.inc(36143);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rtortole6qsfk8.R.inc(36144);try { 
         __CLR4_4_1rtortole6qsfk8.R.inc(36145);FieldUtils.safeMultiply(Long.MAX_VALUE, Integer.MIN_VALUE); 
         __CLR4_4_1rtortole6qsfk8.R.inc(36146);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1rtortole6qsfk8.R.flushNeeded();}} 


public void testSafeMultiplyLongLong424() {__CLR4_4_1rtortole6qsfk8.R.globalSliceStart(getClass().getName(),36147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_168buimrw3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rtortole6qsfk8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rtortole6qsfk8.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeMultiplyLongLong424",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36147,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_168buimrw3(){try{__CLR4_4_1rtortole6qsfk8.R.inc(36147); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36148);assertEquals(0L, FieldUtils.safeMultiply(0L, 0L)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36149);assertEquals(1L, FieldUtils.safeMultiply(1L, 1L)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36150);assertEquals(3L, FieldUtils.safeMultiply(1L, 3L)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36151);assertEquals(3L, FieldUtils.safeMultiply(3L, 1L)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36152);assertEquals(6L, FieldUtils.safeMultiply(2L, 3L)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36153);assertEquals(-6L, FieldUtils.safeMultiply(2L, -3L)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36154);assertEquals(-6L, FieldUtils.safeMultiply(-2L, 3L)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36155);assertEquals(6L, FieldUtils.safeMultiply(-2L, -3L)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36156);assertEquals(Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, 1L)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36157);assertEquals(Long.MIN_VALUE, FieldUtils.safeMultiply(Long.MIN_VALUE, 1L)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36158);assertEquals(-Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, -1L)); 
     __CLR4_4_1rtortole6qsfk8.R.inc(36159);try { 
         __CLR4_4_1rtortole6qsfk8.R.inc(36160);FieldUtils.safeMultiply(Long.MIN_VALUE, -1L); 
         __CLR4_4_1rtortole6qsfk8.R.inc(36161);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rtortole6qsfk8.R.inc(36162);try { 
         __CLR4_4_1rtortole6qsfk8.R.inc(36163);FieldUtils.safeMultiply(-1L, Long.MIN_VALUE); 
         __CLR4_4_1rtortole6qsfk8.R.inc(36164);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rtortole6qsfk8.R.inc(36165);try { 
         __CLR4_4_1rtortole6qsfk8.R.inc(36166);FieldUtils.safeMultiply(Long.MIN_VALUE, 100L); 
         __CLR4_4_1rtortole6qsfk8.R.inc(36167);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rtortole6qsfk8.R.inc(36168);try { 
         __CLR4_4_1rtortole6qsfk8.R.inc(36169);FieldUtils.safeMultiply(Long.MIN_VALUE, Long.MAX_VALUE); 
         __CLR4_4_1rtortole6qsfk8.R.inc(36170);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1rtortole6qsfk8.R.inc(36171);try { 
         __CLR4_4_1rtortole6qsfk8.R.inc(36172);FieldUtils.safeMultiply(Long.MAX_VALUE, Long.MIN_VALUE); 
         __CLR4_4_1rtortole6qsfk8.R.inc(36173);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1rtortole6qsfk8.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
