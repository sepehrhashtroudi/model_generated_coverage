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

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ObjectUtils;

/**
 * Unit test for Tokenizer.
 * 
 */
public class StrTokenizerTest {static class __CLR4_4_1gksgksldni851d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,21522,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String CSV_SIMPLE_FIXTURE = "A,b,c";

    private static final String TSV_SIMPLE_FIXTURE = "A\tb\tc";

    private void checkClone(final StrTokenizer tokenizer) {try{__CLR4_4_1gksgksldni851d.R.inc(21484);
        __CLR4_4_1gksgksldni851d.R.inc(21485);assertFalse(StrTokenizer.getCSVInstance() == tokenizer);
        __CLR4_4_1gksgksldni851d.R.inc(21486);assertFalse(StrTokenizer.getTSVInstance() == tokenizer);
    }finally{__CLR4_4_1gksgksldni851d.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    private void testCSV(final String data) {try{__CLR4_4_1gksgksldni851d.R.inc(21487);
        __CLR4_4_1gksgksldni851d.R.inc(21488);this.testXSVAbc(StrTokenizer.getCSVInstance(data));
        __CLR4_4_1gksgksldni851d.R.inc(21489);this.testXSVAbc(StrTokenizer.getCSVInstance(data.toCharArray()));
    }finally{__CLR4_4_1gksgksldni851d.R.flushNeeded();}}

    

    

    

    void testEmpty(final StrTokenizer tokenizer) {try{__CLR4_4_1gksgksldni851d.R.inc(21490);
        __CLR4_4_1gksgksldni851d.R.inc(21491);this.checkClone(tokenizer);
        __CLR4_4_1gksgksldni851d.R.inc(21492);assertFalse(tokenizer.hasNext());
        __CLR4_4_1gksgksldni851d.R.inc(21493);assertFalse(tokenizer.hasPrevious());
        __CLR4_4_1gksgksldni851d.R.inc(21494);assertEquals(null, tokenizer.nextToken());
        __CLR4_4_1gksgksldni851d.R.inc(21495);assertEquals(0, tokenizer.size());
        __CLR4_4_1gksgksldni851d.R.inc(21496);try {
            __CLR4_4_1gksgksldni851d.R.inc(21497);tokenizer.next();
            __CLR4_4_1gksgksldni851d.R.inc(21498);fail();
        } catch (final NoSuchElementException ex) {}
    }finally{__CLR4_4_1gksgksldni851d.R.flushNeeded();}}

    

    //-----------------------------------------------------------------------
    

    /**
     * Tests that the {@link StrTokenizer#clone()} clone method catches {@link CloneNotSupportedException} and returns
     * <code>null</code>.
     */
    

    

    
  
    // -----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    void testXSVAbc(final StrTokenizer tokenizer) {try{__CLR4_4_1gksgksldni851d.R.inc(21499);
        __CLR4_4_1gksgksldni851d.R.inc(21500);this.checkClone(tokenizer);
        __CLR4_4_1gksgksldni851d.R.inc(21501);assertEquals(-1, tokenizer.previousIndex());
        __CLR4_4_1gksgksldni851d.R.inc(21502);assertEquals(0, tokenizer.nextIndex());
        __CLR4_4_1gksgksldni851d.R.inc(21503);assertEquals(null, tokenizer.previousToken());
        __CLR4_4_1gksgksldni851d.R.inc(21504);assertEquals("A", tokenizer.nextToken());
        __CLR4_4_1gksgksldni851d.R.inc(21505);assertEquals(1, tokenizer.nextIndex());
        __CLR4_4_1gksgksldni851d.R.inc(21506);assertEquals("b", tokenizer.nextToken());
        __CLR4_4_1gksgksldni851d.R.inc(21507);assertEquals(2, tokenizer.nextIndex());
        __CLR4_4_1gksgksldni851d.R.inc(21508);assertEquals("c", tokenizer.nextToken());
        __CLR4_4_1gksgksldni851d.R.inc(21509);assertEquals(3, tokenizer.nextIndex());
        __CLR4_4_1gksgksldni851d.R.inc(21510);assertEquals(null, tokenizer.nextToken());
        __CLR4_4_1gksgksldni851d.R.inc(21511);assertEquals(3, tokenizer.nextIndex());
        __CLR4_4_1gksgksldni851d.R.inc(21512);assertEquals("c", tokenizer.previousToken());
        __CLR4_4_1gksgksldni851d.R.inc(21513);assertEquals(2, tokenizer.nextIndex());
        __CLR4_4_1gksgksldni851d.R.inc(21514);assertEquals("b", tokenizer.previousToken());
        __CLR4_4_1gksgksldni851d.R.inc(21515);assertEquals(1, tokenizer.nextIndex());
        __CLR4_4_1gksgksldni851d.R.inc(21516);assertEquals("A", tokenizer.previousToken());
        __CLR4_4_1gksgksldni851d.R.inc(21517);assertEquals(0, tokenizer.nextIndex());
        __CLR4_4_1gksgksldni851d.R.inc(21518);assertEquals(null, tokenizer.previousToken());
        __CLR4_4_1gksgksldni851d.R.inc(21519);assertEquals(0, tokenizer.nextIndex());
        __CLR4_4_1gksgksldni851d.R.inc(21520);assertEquals(-1, tokenizer.previousIndex());
        __CLR4_4_1gksgksldni851d.R.inc(21521);assertEquals(3, tokenizer.size());
    }finally{__CLR4_4_1gksgksldni851d.R.flushNeeded();}}

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
