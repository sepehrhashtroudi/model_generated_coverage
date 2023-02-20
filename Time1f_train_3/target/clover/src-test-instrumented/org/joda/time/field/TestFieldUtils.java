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
public class TestFieldUtils extends TestCase {static class __CLR4_4_1ruiruile6rcmwr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,36258,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) {try{__CLR4_4_1ruiruile6rcmwr.R.inc(36090);
        __CLR4_4_1ruiruile6rcmwr.R.inc(36091);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ruiruile6rcmwr.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ruiruile6rcmwr.R.inc(36092);
        __CLR4_4_1ruiruile6rcmwr.R.inc(36093);return new TestSuite(TestFieldUtils.class);
    }finally{__CLR4_4_1ruiruile6rcmwr.R.flushNeeded();}}

    public TestFieldUtils(String name) {
        super(name);__CLR4_4_1ruiruile6rcmwr.R.inc(36095);try{__CLR4_4_1ruiruile6rcmwr.R.inc(36094);
    }finally{__CLR4_4_1ruiruile6rcmwr.R.flushNeeded();}}


public void testSafeAddInt454() {__CLR4_4_1ruiruile6rcmwr.R.globalSliceStart(getClass().getName(),36096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ijjedpruo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ruiruile6rcmwr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ruiruile6rcmwr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeAddInt454",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36096,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ijjedpruo(){try{__CLR4_4_1ruiruile6rcmwr.R.inc(36096); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36097);assertEquals(0, FieldUtils.safeAdd(0, 0)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36098);assertEquals(5, FieldUtils.safeAdd(2, 3)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36099);assertEquals(-1, FieldUtils.safeAdd(2, -3)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36100);assertEquals(1, FieldUtils.safeAdd(-2, 3)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36101);assertEquals(-5, FieldUtils.safeAdd(-2, -3)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36102);assertEquals(Integer.MAX_VALUE - 1, FieldUtils.safeAdd(Integer.MAX_VALUE, -1)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36103);assertEquals(Integer.MIN_VALUE + 1, FieldUtils.safeAdd(Integer.MIN_VALUE, 1)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36104);assertEquals(-1, FieldUtils.safeAdd(Integer.MIN_VALUE, Integer.MAX_VALUE)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36105);assertEquals(-1, FieldUtils.safeAdd(Integer.MAX_VALUE, Integer.MIN_VALUE)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36106);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36107);FieldUtils.safeAdd(Integer.MAX_VALUE, 1); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36108);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36109);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36110);FieldUtils.safeAdd(Integer.MAX_VALUE, 100); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36111);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36112);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36113);FieldUtils.safeAdd(Integer.MAX_VALUE, Integer.MAX_VALUE); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36114);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36115);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36116);FieldUtils.safeAdd(Integer.MIN_VALUE, -1); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36117);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36118);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36119);FieldUtils.safeAdd(Integer.MIN_VALUE, -100); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36120);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36121);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36122);FieldUtils.safeAdd(Integer.MIN_VALUE, Integer.MIN_VALUE); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36123);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1ruiruile6rcmwr.R.flushNeeded();}} 


public void testSafeAddLong455() {__CLR4_4_1ruiruile6rcmwr.R.globalSliceStart(getClass().getName(),36124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14jrkm5rvg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ruiruile6rcmwr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ruiruile6rcmwr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeAddLong455",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14jrkm5rvg(){try{__CLR4_4_1ruiruile6rcmwr.R.inc(36124); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36125);assertEquals(0L, FieldUtils.safeAdd(0L, 0L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36126);assertEquals(5L, FieldUtils.safeAdd(2L, 3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36127);assertEquals(-1L, FieldUtils.safeAdd(2L, -3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36128);assertEquals(1L, FieldUtils.safeAdd(-2L, 3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36129);assertEquals(-5L, FieldUtils.safeAdd(-2L, -3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36130);assertEquals(Long.MAX_VALUE - 1, FieldUtils.safeAdd(Long.MAX_VALUE, -1L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36131);assertEquals(Long.MIN_VALUE + 1, FieldUtils.safeAdd(Long.MIN_VALUE, 1L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36132);assertEquals(-1, FieldUtils.safeAdd(Long.MIN_VALUE, Long.MAX_VALUE)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36133);assertEquals(-1, FieldUtils.safeAdd(Long.MAX_VALUE, Long.MIN_VALUE)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36134);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36135);FieldUtils.safeAdd(Long.MAX_VALUE, 1L); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36136);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36137);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36138);FieldUtils.safeAdd(Long.MAX_VALUE, 100L); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36139);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36140);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36141);FieldUtils.safeAdd(Long.MAX_VALUE, Long.MAX_VALUE); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36142);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36143);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36144);FieldUtils.safeAdd(Long.MIN_VALUE, -1L); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36145);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36146);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36147);FieldUtils.safeAdd(Long.MIN_VALUE, -100L); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36148);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36149);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36150);FieldUtils.safeAdd(Long.MIN_VALUE, Long.MIN_VALUE); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36151);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1ruiruile6rcmwr.R.flushNeeded();}} 


public void testSafeSubtractLong456() {__CLR4_4_1ruiruile6rcmwr.R.globalSliceStart(getClass().getName(),36152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3t8bxrw8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ruiruile6rcmwr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ruiruile6rcmwr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeSubtractLong456",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36152,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3t8bxrw8(){try{__CLR4_4_1ruiruile6rcmwr.R.inc(36152); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36153);assertEquals(0L, FieldUtils.safeSubtract(0L, 0L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36154);assertEquals(-1L, FieldUtils.safeSubtract(2L, 3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36155);assertEquals(5L, FieldUtils.safeSubtract(2L, -3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36156);assertEquals(-5L, FieldUtils.safeSubtract(-2L, 3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36157);assertEquals(1L, FieldUtils.safeSubtract(-2L, -3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36158);assertEquals(Long.MAX_VALUE - 1, FieldUtils.safeSubtract(Long.MAX_VALUE, 1L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36159);assertEquals(Long.MIN_VALUE + 1, FieldUtils.safeSubtract(Long.MIN_VALUE, -1L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36160);assertEquals(0, FieldUtils.safeSubtract(Long.MIN_VALUE, Long.MIN_VALUE)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36161);assertEquals(0, FieldUtils.safeSubtract(Long.MAX_VALUE, Long.MAX_VALUE)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36162);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36163);FieldUtils.safeSubtract(Long.MIN_VALUE, 1L); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36164);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36165);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36166);FieldUtils.safeSubtract(Long.MIN_VALUE, 100L); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36167);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36168);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36169);FieldUtils.safeSubtract(Long.MIN_VALUE, Long.MAX_VALUE); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36170);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36171);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36172);FieldUtils.safeSubtract(Long.MAX_VALUE, -1L); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36173);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36174);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36175);FieldUtils.safeSubtract(Long.MAX_VALUE, -100L); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36176);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36177);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36178);FieldUtils.safeSubtract(Long.MAX_VALUE, Long.MIN_VALUE); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36179);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1ruiruile6rcmwr.R.flushNeeded();}} 


public void testSafeMultiplyLongInt458() {__CLR4_4_1ruiruile6rcmwr.R.globalSliceStart(getClass().getName(),36180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mpvxwurx0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ruiruile6rcmwr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ruiruile6rcmwr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeMultiplyLongInt458",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mpvxwurx0(){try{__CLR4_4_1ruiruile6rcmwr.R.inc(36180); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36181);assertEquals(0L, FieldUtils.safeMultiply(0L, 0)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36182);assertEquals(1L, FieldUtils.safeMultiply(1L, 1)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36183);assertEquals(3L, FieldUtils.safeMultiply(1L, 3)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36184);assertEquals(3L, FieldUtils.safeMultiply(3L, 1)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36185);assertEquals(6L, FieldUtils.safeMultiply(2L, 3)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36186);assertEquals(-6L, FieldUtils.safeMultiply(2L, -3)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36187);assertEquals(-6L, FieldUtils.safeMultiply(-2L, 3)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36188);assertEquals(6L, FieldUtils.safeMultiply(-2L, -3)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36189);assertEquals(-1L * Integer.MIN_VALUE, FieldUtils.safeMultiply(-1L, Integer.MIN_VALUE)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36190);assertEquals(Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, 1)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36191);assertEquals(Long.MIN_VALUE, FieldUtils.safeMultiply(Long.MIN_VALUE, 1)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36192);assertEquals(-Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, -1)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36193);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36194);FieldUtils.safeMultiply(Long.MIN_VALUE, -1); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36195);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36196);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36197);FieldUtils.safeMultiply(Long.MIN_VALUE, 100); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36198);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36199);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36200);FieldUtils.safeMultiply(Long.MIN_VALUE, Integer.MAX_VALUE); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36201);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36202);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36203);FieldUtils.safeMultiply(Long.MAX_VALUE, Integer.MIN_VALUE); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36204);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1ruiruile6rcmwr.R.flushNeeded();}} 


public void testSafeMultiplyLongLong459() {__CLR4_4_1ruiruile6rcmwr.R.globalSliceStart(getClass().getName(),36205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s54n38rxp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ruiruile6rcmwr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ruiruile6rcmwr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeMultiplyLongLong459",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36205,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s54n38rxp(){try{__CLR4_4_1ruiruile6rcmwr.R.inc(36205); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36206);assertEquals(0L, FieldUtils.safeMultiply(0L, 0L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36207);assertEquals(1L, FieldUtils.safeMultiply(1L, 1L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36208);assertEquals(3L, FieldUtils.safeMultiply(1L, 3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36209);assertEquals(3L, FieldUtils.safeMultiply(3L, 1L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36210);assertEquals(6L, FieldUtils.safeMultiply(2L, 3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36211);assertEquals(-6L, FieldUtils.safeMultiply(2L, -3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36212);assertEquals(-6L, FieldUtils.safeMultiply(-2L, 3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36213);assertEquals(6L, FieldUtils.safeMultiply(-2L, -3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36214);assertEquals(Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, 1L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36215);assertEquals(Long.MIN_VALUE, FieldUtils.safeMultiply(Long.MIN_VALUE, 1L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36216);assertEquals(-Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, -1L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36217);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36218);FieldUtils.safeMultiply(Long.MIN_VALUE, -1L); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36219);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36220);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36221);FieldUtils.safeMultiply(-1L, Long.MIN_VALUE); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36222);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36223);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36224);FieldUtils.safeMultiply(Long.MIN_VALUE, 100L); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36225);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36226);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36227);FieldUtils.safeMultiply(Long.MIN_VALUE, Long.MAX_VALUE); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36228);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36229);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36230);FieldUtils.safeMultiply(Long.MAX_VALUE, Long.MIN_VALUE); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36231);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1ruiruile6rcmwr.R.flushNeeded();}} 


public void testSafeDivideLongLong460() {__CLR4_4_1ruiruile6rcmwr.R.globalSliceStart(getClass().getName(),36232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ppd7l1ryg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ruiruile6rcmwr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ruiruile6rcmwr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeDivideLongLong460",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36232,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ppd7l1ryg(){try{__CLR4_4_1ruiruile6rcmwr.R.inc(36232); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36233);assertEquals(1L, FieldUtils.safeDivide(1L, 1L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36234);assertEquals(1L, FieldUtils.safeDivide(3L, 3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36235);assertEquals(0L, FieldUtils.safeDivide(1L, 3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36236);assertEquals(3L, FieldUtils.safeDivide(3L, 1L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36237);assertEquals(1L, FieldUtils.safeDivide(5L, 3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36238);assertEquals(-1L, FieldUtils.safeDivide(5L, -3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36239);assertEquals(-1L, FieldUtils.safeDivide(-5L, 3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36240);assertEquals(1L, FieldUtils.safeDivide(-5L, -3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36241);assertEquals(2L, FieldUtils.safeDivide(6L, 3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36242);assertEquals(-2L, FieldUtils.safeDivide(6L, -3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36243);assertEquals(-2L, FieldUtils.safeDivide(-6L, 3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36244);assertEquals(2L, FieldUtils.safeDivide(-6L, -3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36245);assertEquals(2L, FieldUtils.safeDivide(7L, 3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36246);assertEquals(-2L, FieldUtils.safeDivide(7L, -3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36247);assertEquals(-2L, FieldUtils.safeDivide(-7L, 3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36248);assertEquals(2L, FieldUtils.safeDivide(-7L, -3L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36249);assertEquals(Long.MAX_VALUE, FieldUtils.safeDivide(Long.MAX_VALUE, 1L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36250);assertEquals(Long.MIN_VALUE, FieldUtils.safeDivide(Long.MIN_VALUE, 1L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36251);assertEquals(-Long.MAX_VALUE, FieldUtils.safeDivide(Long.MAX_VALUE, -1L)); 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36252);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36253);FieldUtils.safeDivide(Long.MIN_VALUE, -1L); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36254);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1ruiruile6rcmwr.R.inc(36255);try { 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36256);FieldUtils.safeDivide(1L, 0L); 
         __CLR4_4_1ruiruile6rcmwr.R.inc(36257);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1ruiruile6rcmwr.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
