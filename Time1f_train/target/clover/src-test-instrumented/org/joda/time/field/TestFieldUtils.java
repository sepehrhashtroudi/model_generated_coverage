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
public class TestFieldUtils extends TestCase {static class __CLR4_4_1tldtldlc8axey0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,38496,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) {try{__CLR4_4_1tldtldlc8axey0.R.inc(38353);
        __CLR4_4_1tldtldlc8axey0.R.inc(38354);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1tldtldlc8axey0.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1tldtldlc8axey0.R.inc(38355);
        __CLR4_4_1tldtldlc8axey0.R.inc(38356);return new TestSuite(TestFieldUtils.class);
    }finally{__CLR4_4_1tldtldlc8axey0.R.flushNeeded();}}

    public TestFieldUtils(String name) {
        super(name);__CLR4_4_1tldtldlc8axey0.R.inc(38358);try{__CLR4_4_1tldtldlc8axey0.R.inc(38357);
    }finally{__CLR4_4_1tldtldlc8axey0.R.flushNeeded();}}


public void testSafeMultiplyLongLong285() {__CLR4_4_1tldtldlc8axey0.R.globalSliceStart(getClass().getName(),38359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xht8o5tlj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tldtldlc8axey0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tldtldlc8axey0.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeMultiplyLongLong285",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xht8o5tlj(){try{__CLR4_4_1tldtldlc8axey0.R.inc(38359); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38360);assertEquals(0L, FieldUtils.safeMultiply(0L, 0L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38361);assertEquals(1L, FieldUtils.safeMultiply(1L, 1L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38362);assertEquals(3L, FieldUtils.safeMultiply(1L, 3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38363);assertEquals(3L, FieldUtils.safeMultiply(3L, 1L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38364);assertEquals(6L, FieldUtils.safeMultiply(2L, 3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38365);assertEquals(-6L, FieldUtils.safeMultiply(2L, -3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38366);assertEquals(-6L, FieldUtils.safeMultiply(-2L, 3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38367);assertEquals(6L, FieldUtils.safeMultiply(-2L, -3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38368);assertEquals(Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, 1L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38369);assertEquals(Long.MIN_VALUE, FieldUtils.safeMultiply(Long.MIN_VALUE, 1L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38370);assertEquals(-Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, -1L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38371);try { 
         __CLR4_4_1tldtldlc8axey0.R.inc(38372);FieldUtils.safeMultiply(Long.MIN_VALUE, -1L); 
         __CLR4_4_1tldtldlc8axey0.R.inc(38373);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1tldtldlc8axey0.R.inc(38374);try { 
         __CLR4_4_1tldtldlc8axey0.R.inc(38375);FieldUtils.safeMultiply(-1L, Long.MIN_VALUE); 
         __CLR4_4_1tldtldlc8axey0.R.inc(38376);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1tldtldlc8axey0.R.inc(38377);try { 
         __CLR4_4_1tldtldlc8axey0.R.inc(38378);FieldUtils.safeMultiply(Long.MIN_VALUE, 100L); 
         __CLR4_4_1tldtldlc8axey0.R.inc(38379);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1tldtldlc8axey0.R.inc(38380);try { 
         __CLR4_4_1tldtldlc8axey0.R.inc(38381);FieldUtils.safeMultiply(Long.MIN_VALUE, Long.MAX_VALUE); 
         __CLR4_4_1tldtldlc8axey0.R.inc(38382);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1tldtldlc8axey0.R.inc(38383);try { 
         __CLR4_4_1tldtldlc8axey0.R.inc(38384);FieldUtils.safeMultiply(Long.MAX_VALUE, Long.MIN_VALUE); 
         __CLR4_4_1tldtldlc8axey0.R.inc(38385);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1tldtldlc8axey0.R.flushNeeded();}} 


public void testSafeSubtractLong849() {__CLR4_4_1tldtldlc8axey0.R.globalSliceStart(getClass().getName(),38386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eegjajtma();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tldtldlc8axey0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tldtldlc8axey0.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeSubtractLong849",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38386,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eegjajtma(){try{__CLR4_4_1tldtldlc8axey0.R.inc(38386); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38387);assertEquals(0L, FieldUtils.safeSubtract(0L, 0L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38388);assertEquals(-1L, FieldUtils.safeSubtract(2L, 3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38389);assertEquals(5L, FieldUtils.safeSubtract(2L, -3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38390);assertEquals(-5L, FieldUtils.safeSubtract(-2L, 3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38391);assertEquals(1L, FieldUtils.safeSubtract(-2L, -3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38392);assertEquals(Long.MAX_VALUE - 1, FieldUtils.safeSubtract(Long.MAX_VALUE, 1L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38393);assertEquals(Long.MIN_VALUE + 1, FieldUtils.safeSubtract(Long.MIN_VALUE, -1L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38394);assertEquals(0, FieldUtils.safeSubtract(Long.MIN_VALUE, Long.MIN_VALUE)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38395);assertEquals(0, FieldUtils.safeSubtract(Long.MAX_VALUE, Long.MAX_VALUE)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38396);try { 
         __CLR4_4_1tldtldlc8axey0.R.inc(38397);FieldUtils.safeSubtract(Long.MIN_VALUE, 1L); 
         __CLR4_4_1tldtldlc8axey0.R.inc(38398);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1tldtldlc8axey0.R.inc(38399);try { 
         __CLR4_4_1tldtldlc8axey0.R.inc(38400);FieldUtils.safeSubtract(Long.MIN_VALUE, 100L); 
         __CLR4_4_1tldtldlc8axey0.R.inc(38401);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1tldtldlc8axey0.R.inc(38402);try { 
         __CLR4_4_1tldtldlc8axey0.R.inc(38403);FieldUtils.safeSubtract(Long.MIN_VALUE, Long.MAX_VALUE); 
         __CLR4_4_1tldtldlc8axey0.R.inc(38404);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1tldtldlc8axey0.R.inc(38405);try { 
         __CLR4_4_1tldtldlc8axey0.R.inc(38406);FieldUtils.safeSubtract(Long.MAX_VALUE, -1L); 
         __CLR4_4_1tldtldlc8axey0.R.inc(38407);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1tldtldlc8axey0.R.inc(38408);try { 
         __CLR4_4_1tldtldlc8axey0.R.inc(38409);FieldUtils.safeSubtract(Long.MAX_VALUE, -100L); 
         __CLR4_4_1tldtldlc8axey0.R.inc(38410);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1tldtldlc8axey0.R.inc(38411);try { 
         __CLR4_4_1tldtldlc8axey0.R.inc(38412);FieldUtils.safeSubtract(Long.MAX_VALUE, Long.MIN_VALUE); 
         __CLR4_4_1tldtldlc8axey0.R.inc(38413);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1tldtldlc8axey0.R.flushNeeded();}} 


public void testSafeAddInt1156() {__CLR4_4_1tldtldlc8axey0.R.globalSliceStart(getClass().getName(),38414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f1cq5xtn2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tldtldlc8axey0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tldtldlc8axey0.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeAddInt1156",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f1cq5xtn2(){try{__CLR4_4_1tldtldlc8axey0.R.inc(38414); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38415);assertEquals(0, FieldUtils.safeAdd(0, 0)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38416);assertEquals(5, FieldUtils.safeAdd(2, 3)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38417);assertEquals(-1, FieldUtils.safeAdd(2, -3)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38418);assertEquals(1, FieldUtils.safeAdd(-2, 3)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38419);assertEquals(-5, FieldUtils.safeAdd(-2, -3)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38420);assertEquals(Integer.MAX_VALUE - 1, FieldUtils.safeAdd(Integer.MAX_VALUE, -1)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38421);assertEquals(Integer.MIN_VALUE + 1, FieldUtils.safeAdd(Integer.MIN_VALUE, 1)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38422);assertEquals(-1, FieldUtils.safeAdd(Integer.MIN_VALUE, Integer.MAX_VALUE)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38423);assertEquals(-1, FieldUtils.safeAdd(Integer.MAX_VALUE, Integer.MIN_VALUE)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38424);try { 
         __CLR4_4_1tldtldlc8axey0.R.inc(38425);FieldUtils.safeAdd(Integer.MAX_VALUE, 1); 
         __CLR4_4_1tldtldlc8axey0.R.inc(38426);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1tldtldlc8axey0.R.inc(38427);try { 
         __CLR4_4_1tldtldlc8axey0.R.inc(38428);FieldUtils.safeAdd(Integer.MAX_VALUE, 100); 
         __CLR4_4_1tldtldlc8axey0.R.inc(38429);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1tldtldlc8axey0.R.inc(38430);try { 
         __CLR4_4_1tldtldlc8axey0.R.inc(38431);FieldUtils.safeAdd(Integer.MAX_VALUE, Integer.MAX_VALUE); 
         __CLR4_4_1tldtldlc8axey0.R.inc(38432);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1tldtldlc8axey0.R.inc(38433);try { 
         __CLR4_4_1tldtldlc8axey0.R.inc(38434);FieldUtils.safeAdd(Integer.MIN_VALUE, -1); 
         __CLR4_4_1tldtldlc8axey0.R.inc(38435);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1tldtldlc8axey0.R.inc(38436);try { 
         __CLR4_4_1tldtldlc8axey0.R.inc(38437);FieldUtils.safeAdd(Integer.MIN_VALUE, -100); 
         __CLR4_4_1tldtldlc8axey0.R.inc(38438);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1tldtldlc8axey0.R.inc(38439);try { 
         __CLR4_4_1tldtldlc8axey0.R.inc(38440);FieldUtils.safeAdd(Integer.MIN_VALUE, Integer.MIN_VALUE); 
         __CLR4_4_1tldtldlc8axey0.R.inc(38441);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1tldtldlc8axey0.R.flushNeeded();}} 


public void testSafeDivideLongLong1301() {__CLR4_4_1tldtldlc8axey0.R.globalSliceStart(getClass().getName(),38442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o50pt2tnu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tldtldlc8axey0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tldtldlc8axey0.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeDivideLongLong1301",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o50pt2tnu(){try{__CLR4_4_1tldtldlc8axey0.R.inc(38442); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38443);assertEquals(1L, FieldUtils.safeDivide(1L, 1L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38444);assertEquals(1L, FieldUtils.safeDivide(3L, 3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38445);assertEquals(0L, FieldUtils.safeDivide(1L, 3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38446);assertEquals(3L, FieldUtils.safeDivide(3L, 1L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38447);assertEquals(1L, FieldUtils.safeDivide(5L, 3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38448);assertEquals(-1L, FieldUtils.safeDivide(5L, -3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38449);assertEquals(-1L, FieldUtils.safeDivide(-5L, 3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38450);assertEquals(1L, FieldUtils.safeDivide(-5L, -3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38451);assertEquals(2L, FieldUtils.safeDivide(6L, 3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38452);assertEquals(-2L, FieldUtils.safeDivide(6L, -3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38453);assertEquals(-2L, FieldUtils.safeDivide(-6L, 3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38454);assertEquals(2L, FieldUtils.safeDivide(-6L, -3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38455);assertEquals(2L, FieldUtils.safeDivide(7L, 3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38456);assertEquals(-2L, FieldUtils.safeDivide(7L, -3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38457);assertEquals(-2L, FieldUtils.safeDivide(-7L, 3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38458);assertEquals(2L, FieldUtils.safeDivide(-7L, -3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38459);assertEquals(Long.MAX_VALUE, FieldUtils.safeDivide(Long.MAX_VALUE, 1L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38460);assertEquals(Long.MIN_VALUE, FieldUtils.safeDivide(Long.MIN_VALUE, 1L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38461);assertEquals(-Long.MAX_VALUE, FieldUtils.safeDivide(Long.MAX_VALUE, -1L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38462);try { 
         __CLR4_4_1tldtldlc8axey0.R.inc(38463);FieldUtils.safeDivide(Long.MIN_VALUE, -1L); 
         __CLR4_4_1tldtldlc8axey0.R.inc(38464);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1tldtldlc8axey0.R.inc(38465);try { 
         __CLR4_4_1tldtldlc8axey0.R.inc(38466);FieldUtils.safeDivide(1L, 0L); 
         __CLR4_4_1tldtldlc8axey0.R.inc(38467);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1tldtldlc8axey0.R.flushNeeded();}} 


public void testSafeAddLong1643() {__CLR4_4_1tldtldlc8axey0.R.globalSliceStart(getClass().getName(),38468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11esoiftok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tldtldlc8axey0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tldtldlc8axey0.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeAddLong1643",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11esoiftok(){try{__CLR4_4_1tldtldlc8axey0.R.inc(38468); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38469);assertEquals(0L, FieldUtils.safeAdd(0L, 0L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38470);assertEquals(5L, FieldUtils.safeAdd(2L, 3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38471);assertEquals(-1L, FieldUtils.safeAdd(2L, -3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38472);assertEquals(1L, FieldUtils.safeAdd(-2L, 3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38473);assertEquals(-5L, FieldUtils.safeAdd(-2L, -3L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38474);assertEquals(Long.MAX_VALUE - 1, FieldUtils.safeAdd(Long.MAX_VALUE, -1L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38475);assertEquals(Long.MIN_VALUE + 1, FieldUtils.safeAdd(Long.MIN_VALUE, 1L)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38476);assertEquals(-1, FieldUtils.safeAdd(Long.MIN_VALUE, Long.MAX_VALUE)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38477);assertEquals(-1, FieldUtils.safeAdd(Long.MAX_VALUE, Long.MIN_VALUE)); 
     __CLR4_4_1tldtldlc8axey0.R.inc(38478);try { 
         __CLR4_4_1tldtldlc8axey0.R.inc(38479);FieldUtils.safeAdd(Long.MAX_VALUE, 1L); 
         __CLR4_4_1tldtldlc8axey0.R.inc(38480);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1tldtldlc8axey0.R.inc(38481);try { 
         __CLR4_4_1tldtldlc8axey0.R.inc(38482);FieldUtils.safeAdd(Long.MAX_VALUE, 100L); 
         __CLR4_4_1tldtldlc8axey0.R.inc(38483);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1tldtldlc8axey0.R.inc(38484);try { 
         __CLR4_4_1tldtldlc8axey0.R.inc(38485);FieldUtils.safeAdd(Long.MAX_VALUE, Long.MAX_VALUE); 
         __CLR4_4_1tldtldlc8axey0.R.inc(38486);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1tldtldlc8axey0.R.inc(38487);try { 
         __CLR4_4_1tldtldlc8axey0.R.inc(38488);FieldUtils.safeAdd(Long.MIN_VALUE, -1L); 
         __CLR4_4_1tldtldlc8axey0.R.inc(38489);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1tldtldlc8axey0.R.inc(38490);try { 
         __CLR4_4_1tldtldlc8axey0.R.inc(38491);FieldUtils.safeAdd(Long.MIN_VALUE, -100L); 
         __CLR4_4_1tldtldlc8axey0.R.inc(38492);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1tldtldlc8axey0.R.inc(38493);try { 
         __CLR4_4_1tldtldlc8axey0.R.inc(38494);FieldUtils.safeAdd(Long.MIN_VALUE, Long.MIN_VALUE); 
         __CLR4_4_1tldtldlc8axey0.R.inc(38495);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1tldtldlc8axey0.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
