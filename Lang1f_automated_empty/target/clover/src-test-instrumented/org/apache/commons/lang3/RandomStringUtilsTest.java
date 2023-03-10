/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Random;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.RandomStringUtils}.
 *
 * @version $Id$
 */
public class RandomStringUtilsTest {static class __CLR4_4_1f7kf7kldniggt3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367339710L,8589935092L,19721,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    /**
     * Test the implementation
     */
    

    

    

    
    
    /**
     * Make sure boundary alphanumeric characters are generated by randomAlphaNumeric
     * This test will fail randomly with probability = 6 * (61/62)**1000 ~ 5.2E-7
     */  
    
// Defects4J: flaky method
//     @Test
//     public void testRandomAlphaNumeric() {
//         final char[] testChars = {'a', 'z', 'A', 'Z', '0', '9'};
//         final boolean[] found = {false, false, false, false, false, false};
//         for (int i = 0; i < 100; i++) {
//             final String randString = RandomStringUtils.randomAlphanumeric(10);
//             for (int j = 0; j < testChars.length; j++) {
//                 if (randString.indexOf(testChars[j]) > 0) {
//                     found[j] = true;
//                 }
//             }
//         }
//         for (int i = 0; i < testChars.length; i++) {
//             if (!found[i]) {
//                 fail("alphanumeric character not generated in 1000 attempts: " 
//                    + testChars[i] +" -- repeated failures indicate a problem ");
//             }
//         }
//     }
    
    /**
     * Make sure '0' and '9' are generated by randomNumeric
     * This test will fail randomly with probability = 2 * (9/10)**1000 ~ 3.5E-46
     */  
    
// Defects4J: flaky method
//     @Test
//     public void testRandomNumeric() {
//         final char[] testChars = {'0','9'};
//         final boolean[] found = {false, false};
//         for (int i = 0; i < 100; i++) {
//             final String randString = RandomStringUtils.randomNumeric(10);
//             for (int j = 0; j < testChars.length; j++) {
//                 if (randString.indexOf(testChars[j]) > 0) {
//                     found[j] = true;
//                 }
//             }
//         }
//         for (int i = 0; i < testChars.length; i++) {
//             if (!found[i]) {
//                 fail("digit not generated in 1000 attempts: " 
//                    + testChars[i] +" -- repeated failures indicate a problem ");
//             }
//         }  
//     }
    
    /**
     * Make sure boundary alpha characters are generated by randomAlphabetic
     * This test will fail randomly with probability = 4 * (51/52)**1000 ~ 1.58E-8
     */  
    
// Defects4J: flaky method
//     @Test
//     public void testRandomAlphabetic() {
//         final char[] testChars = {'a', 'z', 'A', 'Z'};
//         final boolean[] found = {false, false, false, false};
//         for (int i = 0; i < 100; i++) {
//             final String randString = RandomStringUtils.randomAlphabetic(10);
//             for (int j = 0; j < testChars.length; j++) {
//                 if (randString.indexOf(testChars[j]) > 0) {
//                     found[j] = true;
//                 }
//             }
//         }
//         for (int i = 0; i < testChars.length; i++) {
//             if (!found[i]) {
//                 fail("alphanumeric character not generated in 1000 attempts: " 
//                    + testChars[i] +" -- repeated failures indicate a problem ");
//             }
//         }
//     }
    
    /**
     * Make sure 32 and 127 are generated by randomNumeric
     * This test will fail randomly with probability = 2*(95/96)**1000 ~ 5.7E-5
     */  
    
// Defects4J: flaky method
//     @Test
//     public void testRandomAscii() {
//         final char[] testChars = {(char) 32, (char) 126};
//         final boolean[] found = {false, false};
//         for (int i = 0; i < 100; i++) {
//             final String randString = RandomStringUtils.randomAscii(10);
//             for (int j = 0; j < testChars.length; j++) {
//                 if (randString.indexOf(testChars[j]) > 0) {
//                     found[j] = true;
//                 }
//             }
//         }
//         for (int i = 0; i < testChars.length; i++) {
//             if (!found[i]) {
//                 fail("ascii character not generated in 1000 attempts: " 
//                 + (int) testChars[i] + 
//                  " -- repeated failures indicate a problem");
//             }
//         }  
//     }
    
    /** 
     * Test homogeneity of random strings generated --
     * i.e., test that characters show up with expected frequencies
     * in generated strings.  Will fail randomly about 1 in 1000 times.
     * Repeated failures indicate a problem.
     */
    
// Defects4J: flaky method
//     @Test
//     public void testRandomStringUtilsHomog() {
//         final String set = "abc";
//         final char[] chars = set.toCharArray();
//         String gen = "";
//         final int[] counts = {0,0,0};
//         final int[] expected = {200,200,200};
//         for (int i = 0; i< 100; i++) {
//            gen = RandomStringUtils.random(6,chars);
//            for (int j = 0; j < 6; j++) {
//                switch (gen.charAt(j)) {
//                    case 'a': {counts[0]++; break;}
//                    case 'b': {counts[1]++; break;}
//                    case 'c': {counts[2]++; break;}
//                    default: {fail("generated character not in set");}
//                }
//            }
//         } 
//         // Perform chi-square test with df = 3-1 = 2, testing at .001 level
//         assertTrue("test homogeneity -- will fail about 1 in 1000 times",
//             chiSquare(expected,counts) < 13.82);  
//     }
    
    /**
     * Computes Chi-Square statistic given observed and expected counts
     * @param observed array of observed frequency counts
     * @param expected array of expected frequency counts
     */
    private double chiSquare(final int[] expected, final int[] observed) {try{__CLR4_4_1f7kf7kldniggt3.R.inc(19712);
        __CLR4_4_1f7kf7kldniggt3.R.inc(19713);double sumSq = 0.0d;
        __CLR4_4_1f7kf7kldniggt3.R.inc(19714);double dev = 0.0d;
        __CLR4_4_1f7kf7kldniggt3.R.inc(19715);for (int i = 0; (((i < observed.length)&&(__CLR4_4_1f7kf7kldniggt3.R.iget(19716)!=0|true))||(__CLR4_4_1f7kf7kldniggt3.R.iget(19717)==0&false)); i++) {{
            __CLR4_4_1f7kf7kldniggt3.R.inc(19718);dev = observed[i] - expected[i];
            __CLR4_4_1f7kf7kldniggt3.R.inc(19719);sumSq += dev * dev / expected[i];
        }
        }__CLR4_4_1f7kf7kldniggt3.R.inc(19720);return sumSq;
    }finally{__CLR4_4_1f7kf7kldniggt3.R.flushNeeded();}}           

    /**
     * Checks if the string got by {@link RandomStringUtils#random(int)}
     * can be converted to UTF-8 and back without loss.
     *
     * @see <a href="http://issues.apache.org/jira/browse/LANG-100">LANG-100</a>
     *
     * @throws Exception
     */
    
}

