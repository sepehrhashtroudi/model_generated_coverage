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

import java.util.BitSet;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test to show whether using BitSet for removeAll() methods is faster than using HashSet.
 */
public class HashSetvBitSetTest {static class __CLR4_4_1f40f40ldni84s3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,19672,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int LOOPS = 2000; // number of times to invoke methods
    private static final int LOOPS2 = 10000;

    

    /**
     * @return bitSet - HashSet
     */
    private long printTimes(final int count) {try{__CLR4_4_1f40f40ldni84s3.R.inc(19584);
        __CLR4_4_1f40f40ldni84s3.R.inc(19585);final long hashSet = timeHashSet(count);
        __CLR4_4_1f40f40ldni84s3.R.inc(19586);final long bitSet = timeBitSet(count);
        // If percent is less than 100, then bitset is faster
        __CLR4_4_1f40f40ldni84s3.R.inc(19587);System.out.println("Ratio="+(bitSet*100/hashSet)+"% count="+count+" hash="+hashSet+" bits="+bitSet);
        __CLR4_4_1f40f40ldni84s3.R.inc(19588);return bitSet - hashSet;
    }finally{__CLR4_4_1f40f40ldni84s3.R.flushNeeded();}}

    private static long timeHashSet(final int count) {try{__CLR4_4_1f40f40ldni84s3.R.inc(19589);
        __CLR4_4_1f40f40ldni84s3.R.inc(19590);int [] result = new int[0];
        __CLR4_4_1f40f40ldni84s3.R.inc(19591);final long start = System.nanoTime();
        __CLR4_4_1f40f40ldni84s3.R.inc(19592);for (int i = 0; (((i < LOOPS)&&(__CLR4_4_1f40f40ldni84s3.R.iget(19593)!=0|true))||(__CLR4_4_1f40f40ldni84s3.R.iget(19594)==0&false)); i++) {{
            __CLR4_4_1f40f40ldni84s3.R.inc(19595);result = testHashSet(count);
        }
        }__CLR4_4_1f40f40ldni84s3.R.inc(19596);final long elapsed = System.nanoTime() - start;
        __CLR4_4_1f40f40ldni84s3.R.inc(19597);Assert.assertEquals(count, result.length);
        __CLR4_4_1f40f40ldni84s3.R.inc(19598);return elapsed;
    }finally{__CLR4_4_1f40f40ldni84s3.R.flushNeeded();}}

    private static long timeBitSet(final int count) {try{__CLR4_4_1f40f40ldni84s3.R.inc(19599);
        __CLR4_4_1f40f40ldni84s3.R.inc(19600);int [] result = new int[0];
        __CLR4_4_1f40f40ldni84s3.R.inc(19601);final long start = System.nanoTime();
        __CLR4_4_1f40f40ldni84s3.R.inc(19602);for (int i = 0; (((i < LOOPS)&&(__CLR4_4_1f40f40ldni84s3.R.iget(19603)!=0|true))||(__CLR4_4_1f40f40ldni84s3.R.iget(19604)==0&false)); i++) {{
            __CLR4_4_1f40f40ldni84s3.R.inc(19605);result = testBitSet(count);
        }
        }__CLR4_4_1f40f40ldni84s3.R.inc(19606);final long elapsed = System.nanoTime() - start;
        __CLR4_4_1f40f40ldni84s3.R.inc(19607);Assert.assertEquals(count, result.length);
        __CLR4_4_1f40f40ldni84s3.R.inc(19608);return elapsed;
    }finally{__CLR4_4_1f40f40ldni84s3.R.flushNeeded();}}

    @SuppressWarnings("boxing")
    private static int[] testHashSet(final int count) {try{__CLR4_4_1f40f40ldni84s3.R.inc(19609);
        __CLR4_4_1f40f40ldni84s3.R.inc(19610);final HashSet<Integer> toRemove = new HashSet<Integer>();
            __CLR4_4_1f40f40ldni84s3.R.inc(19611);int found = 0;
            __CLR4_4_1f40f40ldni84s3.R.inc(19612);for (int i = 0; (((i < count)&&(__CLR4_4_1f40f40ldni84s3.R.iget(19613)!=0|true))||(__CLR4_4_1f40f40ldni84s3.R.iget(19614)==0&false)); i++) {{
                __CLR4_4_1f40f40ldni84s3.R.inc(19615);toRemove.add(found++);
            }
            }__CLR4_4_1f40f40ldni84s3.R.inc(19616);return extractIndices(toRemove);
        }finally{__CLR4_4_1f40f40ldni84s3.R.flushNeeded();}}
    
    private static int[] testBitSet(final int count) {try{__CLR4_4_1f40f40ldni84s3.R.inc(19617);
        __CLR4_4_1f40f40ldni84s3.R.inc(19618);final BitSet toRemove = new BitSet();
        __CLR4_4_1f40f40ldni84s3.R.inc(19619);int found = 0;
        __CLR4_4_1f40f40ldni84s3.R.inc(19620);for (int i = 0; (((i < count)&&(__CLR4_4_1f40f40ldni84s3.R.iget(19621)!=0|true))||(__CLR4_4_1f40f40ldni84s3.R.iget(19622)==0&false)); i++) {{
            __CLR4_4_1f40f40ldni84s3.R.inc(19623);toRemove.set(found++);
        }
        }__CLR4_4_1f40f40ldni84s3.R.inc(19624);return extractIndices(toRemove);
    }finally{__CLR4_4_1f40f40ldni84s3.R.flushNeeded();}}
    

    private static int[] extractIndices(final HashSet<Integer> coll) {try{__CLR4_4_1f40f40ldni84s3.R.inc(19625);
        __CLR4_4_1f40f40ldni84s3.R.inc(19626);final int[] result = new int[coll.size()];
        __CLR4_4_1f40f40ldni84s3.R.inc(19627);int i = 0;
        __CLR4_4_1f40f40ldni84s3.R.inc(19628);for (final Integer index : coll) {{
            __CLR4_4_1f40f40ldni84s3.R.inc(19629);result[i++] = index.intValue();
        }
        }__CLR4_4_1f40f40ldni84s3.R.inc(19630);return result;
    }finally{__CLR4_4_1f40f40ldni84s3.R.flushNeeded();}}

    private static int[] extractIndices(final BitSet coll) {try{__CLR4_4_1f40f40ldni84s3.R.inc(19631);
        __CLR4_4_1f40f40ldni84s3.R.inc(19632);final int[] result = new int[coll.cardinality()];
        __CLR4_4_1f40f40ldni84s3.R.inc(19633);int i = 0;
        __CLR4_4_1f40f40ldni84s3.R.inc(19634);int j=0;
        __CLR4_4_1f40f40ldni84s3.R.inc(19635);while((j=coll.nextSetBit(j)) != -1) {{
            __CLR4_4_1f40f40ldni84s3.R.inc(19638);result[i++] = j++;            
        }
        }__CLR4_4_1f40f40ldni84s3.R.inc(19639);return result;
    }finally{__CLR4_4_1f40f40ldni84s3.R.flushNeeded();}}
    
    

    private long printTimes(final int arraySize, final int bitSetSize) {try{__CLR4_4_1f40f40ldni84s3.R.inc(19640);
        __CLR4_4_1f40f40ldni84s3.R.inc(19641);final int[] array = new int[arraySize];
        __CLR4_4_1f40f40ldni84s3.R.inc(19642);final BitSet remove = new BitSet();
        __CLR4_4_1f40f40ldni84s3.R.inc(19643);for (int i = 0; (((i < bitSetSize)&&(__CLR4_4_1f40f40ldni84s3.R.iget(19644)!=0|true))||(__CLR4_4_1f40f40ldni84s3.R.iget(19645)==0&false)); i++) {{
            __CLR4_4_1f40f40ldni84s3.R.inc(19646);remove.set(i);
        }
        }__CLR4_4_1f40f40ldni84s3.R.inc(19647);final long bitSet = timeBitSetRemoveAll(array, remove );
        __CLR4_4_1f40f40ldni84s3.R.inc(19648);final long extract = timeExtractRemoveAll(array, remove);
        // If percent is less than 100, then direct use of bitset is faster
        __CLR4_4_1f40f40ldni84s3.R.inc(19649);System.out.println("Ratio="+(bitSet*100/extract)+"% array="+array.length+" count="+remove.cardinality()+" extract="+extract+" bitset="+bitSet);
        __CLR4_4_1f40f40ldni84s3.R.inc(19650);return bitSet - extract;
    }finally{__CLR4_4_1f40f40ldni84s3.R.flushNeeded();}}

    private long timeBitSetRemoveAll(final int[] array, final BitSet toRemove) {try{__CLR4_4_1f40f40ldni84s3.R.inc(19651);
        __CLR4_4_1f40f40ldni84s3.R.inc(19652);int[] output = new int[0];
        __CLR4_4_1f40f40ldni84s3.R.inc(19653);final long start = System.nanoTime();
        __CLR4_4_1f40f40ldni84s3.R.inc(19654);for(int i = 0; (((i < LOOPS2)&&(__CLR4_4_1f40f40ldni84s3.R.iget(19655)!=0|true))||(__CLR4_4_1f40f40ldni84s3.R.iget(19656)==0&false)); i++){{
            __CLR4_4_1f40f40ldni84s3.R.inc(19657);output = (int[]) ArrayUtils.removeAll(array, toRemove);            
        }
        }__CLR4_4_1f40f40ldni84s3.R.inc(19658);final long end = System.nanoTime();
        __CLR4_4_1f40f40ldni84s3.R.inc(19659);Assert.assertEquals(array.length-toRemove.cardinality(), output.length);
        __CLR4_4_1f40f40ldni84s3.R.inc(19660);return end - start;
    }finally{__CLR4_4_1f40f40ldni84s3.R.flushNeeded();}}
    
    private long timeExtractRemoveAll(final int[] array, final BitSet toRemove) {try{__CLR4_4_1f40f40ldni84s3.R.inc(19661);
        __CLR4_4_1f40f40ldni84s3.R.inc(19662);int[] output = new int[0];
        __CLR4_4_1f40f40ldni84s3.R.inc(19663);final long start = System.nanoTime();
        __CLR4_4_1f40f40ldni84s3.R.inc(19664);for(int i = 0; (((i < LOOPS2)&&(__CLR4_4_1f40f40ldni84s3.R.iget(19665)!=0|true))||(__CLR4_4_1f40f40ldni84s3.R.iget(19666)==0&false)); i++){{
            __CLR4_4_1f40f40ldni84s3.R.inc(19667);final int[] extractIndices = extractIndices(toRemove);
            __CLR4_4_1f40f40ldni84s3.R.inc(19668);output = (int[]) ArrayUtils.removeAll((Object)array, extractIndices);
        }
        }__CLR4_4_1f40f40ldni84s3.R.inc(19669);final long end = System.nanoTime();
        __CLR4_4_1f40f40ldni84s3.R.inc(19670);Assert.assertEquals(array.length-toRemove.cardinality(), output.length);
        __CLR4_4_1f40f40ldni84s3.R.inc(19671);return end - start;
    }finally{__CLR4_4_1f40f40ldni84s3.R.flushNeeded();}}
    
}
