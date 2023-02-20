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
public class TestFieldUtils extends TestCase {static class __CLR4_4_1s0rs0rle6rjdjv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,36458,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) {try{__CLR4_4_1s0rs0rle6rjdjv.R.inc(36315);
        __CLR4_4_1s0rs0rle6rjdjv.R.inc(36316);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1s0rs0rle6rjdjv.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1s0rs0rle6rjdjv.R.inc(36317);
        __CLR4_4_1s0rs0rle6rjdjv.R.inc(36318);return new TestSuite(TestFieldUtils.class);
    }finally{__CLR4_4_1s0rs0rle6rjdjv.R.flushNeeded();}}

    public TestFieldUtils(String name) {
        super(name);__CLR4_4_1s0rs0rle6rjdjv.R.inc(36320);try{__CLR4_4_1s0rs0rle6rjdjv.R.inc(36319);
    }finally{__CLR4_4_1s0rs0rle6rjdjv.R.flushNeeded();}}


public void testSafeAddInt455() {__CLR4_4_1s0rs0rle6rjdjv.R.globalSliceStart(getClass().getName(),36321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lsjd66s0x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s0rs0rle6rjdjv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s0rs0rle6rjdjv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeAddInt455",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36321,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lsjd66s0x(){try{__CLR4_4_1s0rs0rle6rjdjv.R.inc(36321); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36322);assertEquals(0, FieldUtils.safeAdd(0, 0)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36323);assertEquals(5, FieldUtils.safeAdd(2, 3)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36324);assertEquals(-1, FieldUtils.safeAdd(2, -3)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36325);assertEquals(1, FieldUtils.safeAdd(-2, 3)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36326);assertEquals(-5, FieldUtils.safeAdd(-2, -3)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36327);assertEquals(Integer.MAX_VALUE - 1, FieldUtils.safeAdd(Integer.MAX_VALUE, -1)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36328);assertEquals(Integer.MIN_VALUE + 1, FieldUtils.safeAdd(Integer.MIN_VALUE, 1)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36329);assertEquals(-1, FieldUtils.safeAdd(Integer.MIN_VALUE, Integer.MAX_VALUE)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36330);assertEquals(-1, FieldUtils.safeAdd(Integer.MAX_VALUE, Integer.MIN_VALUE)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36331);try { 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36332);FieldUtils.safeAdd(Integer.MAX_VALUE, 1); 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36333);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36334);try { 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36335);FieldUtils.safeAdd(Integer.MAX_VALUE, 100); 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36336);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36337);try { 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36338);FieldUtils.safeAdd(Integer.MAX_VALUE, Integer.MAX_VALUE); 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36339);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36340);try { 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36341);FieldUtils.safeAdd(Integer.MIN_VALUE, -1); 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36342);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36343);try { 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36344);FieldUtils.safeAdd(Integer.MIN_VALUE, -100); 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36345);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36346);try { 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36347);FieldUtils.safeAdd(Integer.MIN_VALUE, Integer.MIN_VALUE); 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36348);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1s0rs0rle6rjdjv.R.flushNeeded();}} 


public void testSafeAddLong456() {__CLR4_4_1s0rs0rle6rjdjv.R.globalSliceStart(getClass().getName(),36349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17srjems1p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s0rs0rle6rjdjv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s0rs0rle6rjdjv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeAddLong456",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17srjems1p(){try{__CLR4_4_1s0rs0rle6rjdjv.R.inc(36349); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36350);assertEquals(0L, FieldUtils.safeAdd(0L, 0L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36351);assertEquals(5L, FieldUtils.safeAdd(2L, 3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36352);assertEquals(-1L, FieldUtils.safeAdd(2L, -3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36353);assertEquals(1L, FieldUtils.safeAdd(-2L, 3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36354);assertEquals(-5L, FieldUtils.safeAdd(-2L, -3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36355);assertEquals(Long.MAX_VALUE - 1, FieldUtils.safeAdd(Long.MAX_VALUE, -1L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36356);assertEquals(Long.MIN_VALUE + 1, FieldUtils.safeAdd(Long.MIN_VALUE, 1L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36357);assertEquals(-1, FieldUtils.safeAdd(Long.MIN_VALUE, Long.MAX_VALUE)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36358);assertEquals(-1, FieldUtils.safeAdd(Long.MAX_VALUE, Long.MIN_VALUE)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36359);try { 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36360);FieldUtils.safeAdd(Long.MAX_VALUE, 1L); 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36361);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36362);try { 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36363);FieldUtils.safeAdd(Long.MAX_VALUE, 100L); 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36364);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36365);try { 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36366);FieldUtils.safeAdd(Long.MAX_VALUE, Long.MAX_VALUE); 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36367);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36368);try { 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36369);FieldUtils.safeAdd(Long.MIN_VALUE, -1L); 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36370);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36371);try { 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36372);FieldUtils.safeAdd(Long.MIN_VALUE, -100L); 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36373);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36374);try { 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36375);FieldUtils.safeAdd(Long.MIN_VALUE, Long.MIN_VALUE); 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36376);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1s0rs0rle6rjdjv.R.flushNeeded();}} 


public void testSafeSubtractLong457() {__CLR4_4_1s0rs0rle6rjdjv.R.globalSliceStart(getClass().getName(),36377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hct74es2h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s0rs0rle6rjdjv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s0rs0rle6rjdjv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeSubtractLong457",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36377,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hct74es2h(){try{__CLR4_4_1s0rs0rle6rjdjv.R.inc(36377); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36378);assertEquals(0L, FieldUtils.safeSubtract(0L, 0L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36379);assertEquals(-1L, FieldUtils.safeSubtract(2L, 3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36380);assertEquals(5L, FieldUtils.safeSubtract(2L, -3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36381);assertEquals(-5L, FieldUtils.safeSubtract(-2L, 3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36382);assertEquals(1L, FieldUtils.safeSubtract(-2L, -3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36383);assertEquals(Long.MAX_VALUE - 1, FieldUtils.safeSubtract(Long.MAX_VALUE, 1L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36384);assertEquals(Long.MIN_VALUE + 1, FieldUtils.safeSubtract(Long.MIN_VALUE, -1L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36385);assertEquals(0, FieldUtils.safeSubtract(Long.MIN_VALUE, Long.MIN_VALUE)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36386);assertEquals(0, FieldUtils.safeSubtract(Long.MAX_VALUE, Long.MAX_VALUE)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36387);try { 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36388);FieldUtils.safeSubtract(Long.MIN_VALUE, 1L); 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36389);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36390);try { 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36391);FieldUtils.safeSubtract(Long.MIN_VALUE, 100L); 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36392);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36393);try { 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36394);FieldUtils.safeSubtract(Long.MIN_VALUE, Long.MAX_VALUE); 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36395);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36396);try { 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36397);FieldUtils.safeSubtract(Long.MAX_VALUE, -1L); 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36398);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36399);try { 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36400);FieldUtils.safeSubtract(Long.MAX_VALUE, -100L); 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36401);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36402);try { 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36403);FieldUtils.safeSubtract(Long.MAX_VALUE, Long.MIN_VALUE); 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36404);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1s0rs0rle6rjdjv.R.flushNeeded();}} 


public void testSafeMultiplyLongLong459() {__CLR4_4_1s0rs0rle6rjdjv.R.globalSliceStart(getClass().getName(),36405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s54n38s39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s0rs0rle6rjdjv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s0rs0rle6rjdjv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeMultiplyLongLong459",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36405,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s54n38s39(){try{__CLR4_4_1s0rs0rle6rjdjv.R.inc(36405); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36406);assertEquals(0L, FieldUtils.safeMultiply(0L, 0L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36407);assertEquals(1L, FieldUtils.safeMultiply(1L, 1L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36408);assertEquals(3L, FieldUtils.safeMultiply(1L, 3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36409);assertEquals(3L, FieldUtils.safeMultiply(3L, 1L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36410);assertEquals(6L, FieldUtils.safeMultiply(2L, 3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36411);assertEquals(-6L, FieldUtils.safeMultiply(2L, -3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36412);assertEquals(-6L, FieldUtils.safeMultiply(-2L, 3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36413);assertEquals(6L, FieldUtils.safeMultiply(-2L, -3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36414);assertEquals(Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, 1L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36415);assertEquals(Long.MIN_VALUE, FieldUtils.safeMultiply(Long.MIN_VALUE, 1L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36416);assertEquals(-Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, -1L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36417);try { 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36418);FieldUtils.safeMultiply(Long.MIN_VALUE, -1L); 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36419);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36420);try { 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36421);FieldUtils.safeMultiply(-1L, Long.MIN_VALUE); 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36422);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36423);try { 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36424);FieldUtils.safeMultiply(Long.MIN_VALUE, 100L); 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36425);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36426);try { 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36427);FieldUtils.safeMultiply(Long.MIN_VALUE, Long.MAX_VALUE); 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36428);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36429);try { 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36430);FieldUtils.safeMultiply(Long.MAX_VALUE, Long.MIN_VALUE); 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36431);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1s0rs0rle6rjdjv.R.flushNeeded();}} 


public void testSafeDivideLongLong460() {__CLR4_4_1s0rs0rle6rjdjv.R.globalSliceStart(getClass().getName(),36432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ppd7l1s40();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s0rs0rle6rjdjv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s0rs0rle6rjdjv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeDivideLongLong460",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ppd7l1s40(){try{__CLR4_4_1s0rs0rle6rjdjv.R.inc(36432); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36433);assertEquals(1L, FieldUtils.safeDivide(1L, 1L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36434);assertEquals(1L, FieldUtils.safeDivide(3L, 3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36435);assertEquals(0L, FieldUtils.safeDivide(1L, 3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36436);assertEquals(3L, FieldUtils.safeDivide(3L, 1L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36437);assertEquals(1L, FieldUtils.safeDivide(5L, 3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36438);assertEquals(-1L, FieldUtils.safeDivide(5L, -3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36439);assertEquals(-1L, FieldUtils.safeDivide(-5L, 3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36440);assertEquals(1L, FieldUtils.safeDivide(-5L, -3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36441);assertEquals(2L, FieldUtils.safeDivide(6L, 3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36442);assertEquals(-2L, FieldUtils.safeDivide(6L, -3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36443);assertEquals(-2L, FieldUtils.safeDivide(-6L, 3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36444);assertEquals(2L, FieldUtils.safeDivide(-6L, -3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36445);assertEquals(2L, FieldUtils.safeDivide(7L, 3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36446);assertEquals(-2L, FieldUtils.safeDivide(7L, -3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36447);assertEquals(-2L, FieldUtils.safeDivide(-7L, 3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36448);assertEquals(2L, FieldUtils.safeDivide(-7L, -3L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36449);assertEquals(Long.MAX_VALUE, FieldUtils.safeDivide(Long.MAX_VALUE, 1L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36450);assertEquals(Long.MIN_VALUE, FieldUtils.safeDivide(Long.MIN_VALUE, 1L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36451);assertEquals(-Long.MAX_VALUE, FieldUtils.safeDivide(Long.MAX_VALUE, -1L)); 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36452);try { 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36453);FieldUtils.safeDivide(Long.MIN_VALUE, -1L); 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36454);fail(); 
     } catch (ArithmeticException e) { 
     } 
     __CLR4_4_1s0rs0rle6rjdjv.R.inc(36455);try { 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36456);FieldUtils.safeDivide(1L, 0L); 
         __CLR4_4_1s0rs0rle6rjdjv.R.inc(36457);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1s0rs0rle6rjdjv.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
