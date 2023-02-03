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

import java.text.NumberFormat;
import java.util.Calendar;

/**
 * Tests the difference in performance between CharUtils and CharSet.
 * 
 * Sample runs:

Now: Thu Mar 18 14:29:48 PST 2004
Sun Microsystems Inc. Java(TM) 2 Runtime Environment, Standard Edition 1.3.1_10-b03
Sun Microsystems Inc. Java HotSpot(TM) Client VM 1.3.1_10-b03
Windows XP 5.1 x86 pentium i486 i386
Do nohting: 0 milliseconds.
run_CharUtils_isAsciiNumeric: 4,545 milliseconds.
run_inlined_CharUtils_isAsciiNumeric: 3,417 milliseconds.
run_inlined_CharUtils_isAsciiNumeric: 85,679 milliseconds.


Now: Thu Mar 18 14:24:51 PST 2004
Sun Microsystems Inc. Java(TM) 2 Runtime Environment, Standard Edition 1.4.2_04-b05
Sun Microsystems Inc. Java HotSpot(TM) Client VM 1.4.2_04-b05
Windows XP 5.1 x86 pentium i486 i386
Do nohting: 0 milliseconds.
run_CharUtils_isAsciiNumeric: 2,578 milliseconds.
run_inlined_CharUtils_isAsciiNumeric: 2,477 milliseconds.
run_inlined_CharUtils_isAsciiNumeric: 114,429 milliseconds.

Now: Thu Mar 18 14:27:55 PST 2004
Sun Microsystems Inc. Java(TM) 2 Runtime Environment, Standard Edition 1.4.2_04-b05
Sun Microsystems Inc. Java HotSpot(TM) Server VM 1.4.2_04-b05
Windows XP 5.1 x86 pentium i486 i386
Do nohting: 0 milliseconds.
run_CharUtils_isAsciiNumeric: 630 milliseconds.
run_inlined_CharUtils_isAsciiNumeric: 709 milliseconds.
run_inlined_CharUtils_isAsciiNumeric: 84,420 milliseconds.


 * @version $Id$
 */
public class CharUtilsPerfRun {public static class __CLR4_4_1eymeymldniggs4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367339710L,8589935092L,19457,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    final static String VERSION = "$Id$";

    final static int WARM_UP = 100;

    final static int COUNT = 5000;

    final static char[] CHAR_SAMPLES;
    static {try{__CLR4_4_1eymeymldniggs4.R.inc(19390);
        __CLR4_4_1eymeymldniggs4.R.inc(19391);CHAR_SAMPLES = new char[Character.MAX_VALUE];
        __CLR4_4_1eymeymldniggs4.R.inc(19392);for (char i = Character.MIN_VALUE; (((i < Character.MAX_VALUE)&&(__CLR4_4_1eymeymldniggs4.R.iget(19393)!=0|true))||(__CLR4_4_1eymeymldniggs4.R.iget(19394)==0&false)); i++) {{
            __CLR4_4_1eymeymldniggs4.R.inc(19395);CHAR_SAMPLES[i] = i;
        }
    }}finally{__CLR4_4_1eymeymldniggs4.R.flushNeeded();}}

    public static void main(final String[] args) {try{__CLR4_4_1eymeymldniggs4.R.inc(19396);
        __CLR4_4_1eymeymldniggs4.R.inc(19397);new CharUtilsPerfRun().run();
    }finally{__CLR4_4_1eymeymldniggs4.R.flushNeeded();}}

    private void printSysInfo() {try{__CLR4_4_1eymeymldniggs4.R.inc(19398);
        __CLR4_4_1eymeymldniggs4.R.inc(19399);System.out.println(VERSION);
        __CLR4_4_1eymeymldniggs4.R.inc(19400);System.out.println("Now: " + Calendar.getInstance().getTime());
        __CLR4_4_1eymeymldniggs4.R.inc(19401);System.out.println(System.getProperty("java.vendor")
                + " "
                + System.getProperty("java.runtime.name")
                + " "
                + System.getProperty("java.runtime.version"));
        __CLR4_4_1eymeymldniggs4.R.inc(19402);System.out.println(System.getProperty("java.vm.vendor")
                + " "
                + System.getProperty("java.vm.name")
                + " "
                + System.getProperty("java.vm.version"));
        __CLR4_4_1eymeymldniggs4.R.inc(19403);System.out.println(System.getProperty("os.name")
            + " "
            + System.getProperty("os.version")
            + " "
            + System.getProperty("os.arch")
            + " "
            + System.getProperty("sun.cpu.isalist"));
    }finally{__CLR4_4_1eymeymldniggs4.R.flushNeeded();}}

    private void run() {try{__CLR4_4_1eymeymldniggs4.R.inc(19404);
        __CLR4_4_1eymeymldniggs4.R.inc(19405);this.printSysInfo();
        __CLR4_4_1eymeymldniggs4.R.inc(19406);long start;
        __CLR4_4_1eymeymldniggs4.R.inc(19407);start = System.currentTimeMillis();
        __CLR4_4_1eymeymldniggs4.R.inc(19408);this.printlnTotal("Do nohting", start);
        //System.out.println("Warming up...");
        __CLR4_4_1eymeymldniggs4.R.inc(19409);run_CharUtils_isAsciiNumeric(WARM_UP);
        //System.out.println("Measuring...");
        __CLR4_4_1eymeymldniggs4.R.inc(19410);start = System.currentTimeMillis();
        __CLR4_4_1eymeymldniggs4.R.inc(19411);run_CharUtils_isAsciiNumeric(COUNT);
        __CLR4_4_1eymeymldniggs4.R.inc(19412);this.printlnTotal("run_CharUtils_isAsciiNumeric", start);
        //System.out.println("Warming up...");
        __CLR4_4_1eymeymldniggs4.R.inc(19413);run_inlined_CharUtils_isAsciiNumeric(WARM_UP);
        //System.out.println("Measuring...");
        __CLR4_4_1eymeymldniggs4.R.inc(19414);start = System.currentTimeMillis();
        __CLR4_4_1eymeymldniggs4.R.inc(19415);run_inlined_CharUtils_isAsciiNumeric(COUNT);
        __CLR4_4_1eymeymldniggs4.R.inc(19416);this.printlnTotal("run_inlined_CharUtils_isAsciiNumeric", start);
        //System.out.println("Warming up...");
        __CLR4_4_1eymeymldniggs4.R.inc(19417);run_CharSet(WARM_UP);
        //System.out.println("Measuring...");
        __CLR4_4_1eymeymldniggs4.R.inc(19418);start = System.currentTimeMillis();
        __CLR4_4_1eymeymldniggs4.R.inc(19419);run_CharSet(COUNT);
        __CLR4_4_1eymeymldniggs4.R.inc(19420);this.printlnTotal("run_CharSet", start);
    }finally{__CLR4_4_1eymeymldniggs4.R.flushNeeded();}}

    private int run_CharSet(final int loopCount) {try{__CLR4_4_1eymeymldniggs4.R.inc(19421);
        __CLR4_4_1eymeymldniggs4.R.inc(19422);int t = 0;
        __CLR4_4_1eymeymldniggs4.R.inc(19423);for (int i = 0; (((i < loopCount)&&(__CLR4_4_1eymeymldniggs4.R.iget(19424)!=0|true))||(__CLR4_4_1eymeymldniggs4.R.iget(19425)==0&false)); i++) {{
            __CLR4_4_1eymeymldniggs4.R.inc(19426);for (final char ch : CHAR_SAMPLES) {{
                __CLR4_4_1eymeymldniggs4.R.inc(19427);final boolean b = CharSet.ASCII_NUMERIC.contains(ch);
                __CLR4_4_1eymeymldniggs4.R.inc(19428);t += (((b )&&(__CLR4_4_1eymeymldniggs4.R.iget(19429)!=0|true))||(__CLR4_4_1eymeymldniggs4.R.iget(19430)==0&false))? 1 : 0;
            }
        }}
        }__CLR4_4_1eymeymldniggs4.R.inc(19431);return t;
    }finally{__CLR4_4_1eymeymldniggs4.R.flushNeeded();}}

    private int run_CharUtils_isAsciiNumeric(final int loopCount) {try{__CLR4_4_1eymeymldniggs4.R.inc(19432);
        __CLR4_4_1eymeymldniggs4.R.inc(19433);int t = 0;
        __CLR4_4_1eymeymldniggs4.R.inc(19434);for (int i = 0; (((i < loopCount)&&(__CLR4_4_1eymeymldniggs4.R.iget(19435)!=0|true))||(__CLR4_4_1eymeymldniggs4.R.iget(19436)==0&false)); i++) {{
            __CLR4_4_1eymeymldniggs4.R.inc(19437);for (final char ch : CHAR_SAMPLES) {{
                __CLR4_4_1eymeymldniggs4.R.inc(19438);final boolean b = CharUtils.isAsciiNumeric(ch);
                __CLR4_4_1eymeymldniggs4.R.inc(19439);t += (((b )&&(__CLR4_4_1eymeymldniggs4.R.iget(19440)!=0|true))||(__CLR4_4_1eymeymldniggs4.R.iget(19441)==0&false))? 1 : 0;
            }
        }}
        }__CLR4_4_1eymeymldniggs4.R.inc(19442);return t;
    }finally{__CLR4_4_1eymeymldniggs4.R.flushNeeded();}}

    private int run_inlined_CharUtils_isAsciiNumeric(final int loopCount) {try{__CLR4_4_1eymeymldniggs4.R.inc(19443);
        __CLR4_4_1eymeymldniggs4.R.inc(19444);int t = 0;
        __CLR4_4_1eymeymldniggs4.R.inc(19445);for (int i = 0; (((i < loopCount)&&(__CLR4_4_1eymeymldniggs4.R.iget(19446)!=0|true))||(__CLR4_4_1eymeymldniggs4.R.iget(19447)==0&false)); i++) {{
            __CLR4_4_1eymeymldniggs4.R.inc(19448);for (final char ch : CHAR_SAMPLES) {{
                __CLR4_4_1eymeymldniggs4.R.inc(19449);final boolean b = ch >= '0' && ch <= '9';
                __CLR4_4_1eymeymldniggs4.R.inc(19450);t += (((b )&&(__CLR4_4_1eymeymldniggs4.R.iget(19451)!=0|true))||(__CLR4_4_1eymeymldniggs4.R.iget(19452)==0&false))? 1 : 0;
            }
        }}
        }__CLR4_4_1eymeymldniggs4.R.inc(19453);return t;
    }finally{__CLR4_4_1eymeymldniggs4.R.flushNeeded();}}

    private void printlnTotal(final String prefix, final long start) {try{__CLR4_4_1eymeymldniggs4.R.inc(19454);
        __CLR4_4_1eymeymldniggs4.R.inc(19455);final long total = System.currentTimeMillis() - start;
        __CLR4_4_1eymeymldniggs4.R.inc(19456);System.out.println(prefix + ": " + NumberFormat.getInstance().format(total) + " milliseconds.");
    }finally{__CLR4_4_1eymeymldniggs4.R.flushNeeded();}}
}
