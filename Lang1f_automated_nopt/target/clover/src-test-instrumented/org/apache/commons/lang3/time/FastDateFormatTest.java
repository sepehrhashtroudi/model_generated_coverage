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
package org.apache.commons.lang3.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.time.FastDateFormat}.
 *
 * @since 2.0
 * @version $Id$
 */
public class FastDateFormatTest {static class __CLR4_4_1gtegteldni852g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,21837,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /*
     * Only the cache methods need to be tested here.  
     * The print methods are tested by {@link FastDateFormat_PrinterTest}
     * and the parse methods are tested by {@link FastDateFormat_ParserTest}
     */
@Test
public void testEquals909() {__CLR4_4_1gtegteldni852g.R.globalSliceStart(getClass().getName(),21794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bk12zsgte();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gtegteldni852g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gtegteldni852g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.testEquals909",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bk12zsgte(){try{__CLR4_4_1gtegteldni852g.R.inc(21794); }finally{__CLR4_4_1gtegteldni852g.R.flushNeeded();}}
@Test
public void testEquals913() {__CLR4_4_1gtegteldni852g.R.globalSliceStart(getClass().getName(),21795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11c5z73gtf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gtegteldni852g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gtegteldni852g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.testEquals913",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11c5z73gtf(){try{__CLR4_4_1gtegteldni852g.R.inc(21795); __CLR4_4_1gtegteldni852g.R.inc(21796);FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd"); __CLR4_4_1gtegteldni852g.R.inc(21797);FastDateFormat fdf2 = FastDateFormat.getInstance("yyyy-MM-dd"); __CLR4_4_1gtegteldni852g.R.inc(21798);FastDateFormat fdf3 = FastDateFormat.getInstance("yyyy-MM-dd"); __CLR4_4_1gtegteldni852g.R.inc(21799);assertTrue(!fdf.equals(fdf2)); __CLR4_4_1gtegteldni852g.R.inc(21800);assertTrue(!fdf.equals(fdf3)); __CLR4_4_1gtegteldni852g.R.inc(21801);assertTrue(fdf.equals(fdf)); __CLR4_4_1gtegteldni852g.R.inc(21802);assertTrue(!fdf.equals(fdf)); __CLR4_4_1gtegteldni852g.R.inc(21803);assertTrue(fdf.equals(fdf2)); __CLR4_4_1gtegteldni852g.R.inc(21804);assertTrue(!fdf.equals(fdf3)); }finally{__CLR4_4_1gtegteldni852g.R.flushNeeded();}}
    

    

    

    

    

    

           

    

    

    

    

    

    

    final static private int NTHREADS= 10;
    final static private int NROUNDS= 10000;
    
    private long measureTime(final Format formatter, final Format parser) throws InterruptedException {try{__CLR4_4_1gtegteldni852g.R.inc(21805);
        __CLR4_4_1gtegteldni852g.R.inc(21806);final ExecutorService pool = Executors.newFixedThreadPool(NTHREADS);
        __CLR4_4_1gtegteldni852g.R.inc(21807);final AtomicInteger failures= new AtomicInteger(0);
        __CLR4_4_1gtegteldni852g.R.inc(21808);final AtomicLong totalElapsed= new AtomicLong(0);
        
        __CLR4_4_1gtegteldni852g.R.inc(21809);for(int i= 0; (((i<NTHREADS)&&(__CLR4_4_1gtegteldni852g.R.iget(21810)!=0|true))||(__CLR4_4_1gtegteldni852g.R.iget(21811)==0&false)); ++i) {{
            __CLR4_4_1gtegteldni852g.R.inc(21812);pool.submit(new Runnable() {
                @Override
                public void run() {try{__CLR4_4_1gtegteldni852g.R.inc(21813);
                    __CLR4_4_1gtegteldni852g.R.inc(21814);for(int i= 0; (((i<NROUNDS)&&(__CLR4_4_1gtegteldni852g.R.iget(21815)!=0|true))||(__CLR4_4_1gtegteldni852g.R.iget(21816)==0&false)); ++i) {{
                        __CLR4_4_1gtegteldni852g.R.inc(21817);try {
                            __CLR4_4_1gtegteldni852g.R.inc(21818);final Date date= new Date();
                            __CLR4_4_1gtegteldni852g.R.inc(21819);final String formattedDate= formatter.format(date);
                            __CLR4_4_1gtegteldni852g.R.inc(21820);final long start= System.currentTimeMillis();        
                            __CLR4_4_1gtegteldni852g.R.inc(21821);final Object pd= parser.parseObject(formattedDate);
                            __CLR4_4_1gtegteldni852g.R.inc(21822);totalElapsed.addAndGet(System.currentTimeMillis()-start);
                            __CLR4_4_1gtegteldni852g.R.inc(21823);if((((!date.equals(pd))&&(__CLR4_4_1gtegteldni852g.R.iget(21824)!=0|true))||(__CLR4_4_1gtegteldni852g.R.iget(21825)==0&false))) {{
                                __CLR4_4_1gtegteldni852g.R.inc(21826);failures.incrementAndGet();
                            }
                        }} catch (final Exception e) {
                            __CLR4_4_1gtegteldni852g.R.inc(21827);failures.incrementAndGet();
                            __CLR4_4_1gtegteldni852g.R.inc(21828);e.printStackTrace();
                        }
                    }
                }}finally{__CLR4_4_1gtegteldni852g.R.flushNeeded();}}                
            });
        }
        }__CLR4_4_1gtegteldni852g.R.inc(21829);pool.shutdown();                        
        __CLR4_4_1gtegteldni852g.R.inc(21830);if((((!pool.awaitTermination(20, TimeUnit.SECONDS))&&(__CLR4_4_1gtegteldni852g.R.iget(21831)!=0|true))||(__CLR4_4_1gtegteldni852g.R.iget(21832)==0&false))) {{
            __CLR4_4_1gtegteldni852g.R.inc(21833);pool.shutdownNow();
            __CLR4_4_1gtegteldni852g.R.inc(21834);fail("did not complete tasks");
        }
        }__CLR4_4_1gtegteldni852g.R.inc(21835);assertEquals(0, failures.get());
        __CLR4_4_1gtegteldni852g.R.inc(21836);return totalElapsed.get();
    }finally{__CLR4_4_1gtegteldni852g.R.flushNeeded();}}
}
