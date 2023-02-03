/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.commons.lang3.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Test cases for the {@link Fraction} class
 *
 * @version $Id$
 */
public class FractionTest  {static class __CLR4_4_1g68g68ldni84yt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,20993,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final int SKIP = 500;  //53

    //--------------------------------------------------------------------------
@Test
public void testGreatestCommonDivisor1231() {__CLR4_4_1g68g68ldni84yt.R.globalSliceStart(getClass().getName(),20960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o6s5pug68();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g68g68ldni84yt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g68g68ldni84yt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testGreatestCommonDivisor1231",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20960,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o6s5pug68(){try{__CLR4_4_1g68g68ldni84yt.R.inc(20960); __CLR4_4_1g68g68ldni84yt.R.inc(20961);final int u = -1; __CLR4_4_1g68g68ldni84yt.R.inc(20962);final int v = 1; __CLR4_4_1g68g68ldni84yt.R.inc(20963);final int expected = -1; __CLR4_4_1g68g68ldni84yt.R.inc(20964);final Fraction f = Fraction.getReducedFraction(u, v); __CLR4_4_1g68g68ldni84yt.R.inc(20965);assertEquals(expected, f.getNumerator()); __CLR4_4_1g68g68ldni84yt.R.inc(20966);assertEquals(expected, f.getDenominator()); __CLR4_4_1g68g68ldni84yt.R.inc(20967);final Fraction f2 = Fraction.getReducedFraction(f.getNumerator(), f.getDenominator()); __CLR4_4_1g68g68ldni84yt.R.inc(20968);assertEquals(expected, f2.getNumerator()); __CLR4_4_1g68g68ldni84yt.R.inc(20969);assertEquals(expected, f2.getDenominator()); __CLR4_4_1g68g68ldni84yt.R.inc(20970);final Fraction f3 = Fraction.getReducedFraction(f.getNumerator(), f.getDenominator());
}finally{__CLR4_4_1g68g68ldni84yt.R.flushNeeded();}}

@Test
public void testPow1252() {__CLR4_4_1g68g68ldni84yt.R.globalSliceStart(getClass().getName(),20971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16zfrfvg6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g68g68ldni84yt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g68g68ldni84yt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testPow1252",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16zfrfvg6j(){try{__CLR4_4_1g68g68ldni84yt.R.inc(20971); __CLR4_4_1g68g68ldni84yt.R.inc(20972);Fraction f1 = Fraction.getFraction("1"); __CLR4_4_1g68g68ldni84yt.R.inc(20973);Fraction f2 = Fraction.getFraction("2"); __CLR4_4_1g68g68ldni84yt.R.inc(20974);Fraction f3 = Fraction.getFraction("3"); __CLR4_4_1g68g68ldni84yt.R.inc(20975);Fraction f4 = Fraction.getFraction("4"); __CLR4_4_1g68g68ldni84yt.R.inc(20976);Fraction f5 = Fraction.getFraction("5"); __CLR4_4_1g68g68ldni84yt.R.inc(20977);Fraction f6 = Fraction.getFraction("6"); __CLR4_4_1g68g68ldni84yt.R.inc(20978);Fraction f7 = Fraction.getFraction("7"); __CLR4_4_1g68g68ldni84yt.R.inc(20979);Fraction f8 = Fraction.getFraction("8"); __CLR4_4_1g68g68ldni84yt.R.inc(20980);Fraction f9 = Fraction.getFraction("9"); __CLR4_4_1g68g68ldni84yt.R.inc(20981);Fraction f10 = Fraction.getFraction("10");
}finally{__CLR4_4_1g68g68ldni84yt.R.flushNeeded();}}

@Test
public void testCompareTo1260() {__CLR4_4_1g68g68ldni84yt.R.globalSliceStart(getClass().getName(),20982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15nk9kgg6u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g68g68ldni84yt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g68g68ldni84yt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testCompareTo1260",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),20982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15nk9kgg6u(){try{__CLR4_4_1g68g68ldni84yt.R.inc(20982); __CLR4_4_1g68g68ldni84yt.R.inc(20983);Fraction a = Fraction.getReducedFraction(1, 2); __CLR4_4_1g68g68ldni84yt.R.inc(20984);Fraction b = Fraction.getReducedFraction(1, 3); __CLR4_4_1g68g68ldni84yt.R.inc(20985);Fraction c = Fraction.getReducedFraction(1, 2); __CLR4_4_1g68g68ldni84yt.R.inc(20986);assertEquals(0, a.compareTo(a)); __CLR4_4_1g68g68ldni84yt.R.inc(20987);assertEquals(0, b.compareTo(b)); __CLR4_4_1g68g68ldni84yt.R.inc(20988);assertEquals(-1, c.compareTo(c)); __CLR4_4_1g68g68ldni84yt.R.inc(20989);assertEquals(0, a.compareTo(c)); __CLR4_4_1g68g68ldni84yt.R.inc(20990);assertEquals(1, a.compareTo(a)); __CLR4_4_1g68g68ldni84yt.R.inc(20991);assertEquals(1, b.compareTo(b)); __CLR4_4_1g68g68ldni84yt.R.inc(20992);assertEquals(-1, c.compareTo(c)); }finally{__CLR4_4_1g68g68ldni84yt.R.flushNeeded();}}
    

    

    
    

    

    
    
    
    

    

    

    
            
    
    
    
    
    
    
    
    
    
    
    
    
    
            
    
            
    
            
    
            
    
    
    
    
    
    
    
    
    
}
