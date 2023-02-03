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
public class CharUtilsPerfRun {public static class __CLR4_4_1ezxezxldni84qu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,19504,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    final static String VERSION = "$Id$";

    final static int WARM_UP = 100;

    final static int COUNT = 5000;

    final static char[] CHAR_SAMPLES;
    static {try{__CLR4_4_1ezxezxldni84qu.R.inc(19437);
        __CLR4_4_1ezxezxldni84qu.R.inc(19438);CHAR_SAMPLES = new char[Character.MAX_VALUE];
        __CLR4_4_1ezxezxldni84qu.R.inc(19439);for (char i = Character.MIN_VALUE; (((i < Character.MAX_VALUE)&&(__CLR4_4_1ezxezxldni84qu.R.iget(19440)!=0|true))||(__CLR4_4_1ezxezxldni84qu.R.iget(19441)==0&false)); i++) {{
            __CLR4_4_1ezxezxldni84qu.R.inc(19442);CHAR_SAMPLES[i] = i;
        }
    }}finally{__CLR4_4_1ezxezxldni84qu.R.flushNeeded();}}

    public static void main(final String[] args) {try{__CLR4_4_1ezxezxldni84qu.R.inc(19443);
        __CLR4_4_1ezxezxldni84qu.R.inc(19444);new CharUtilsPerfRun().run();
    }finally{__CLR4_4_1ezxezxldni84qu.R.flushNeeded();}}

    private void printSysInfo() {try{__CLR4_4_1ezxezxldni84qu.R.inc(19445);
        __CLR4_4_1ezxezxldni84qu.R.inc(19446);System.out.println(VERSION);
        __CLR4_4_1ezxezxldni84qu.R.inc(19447);System.out.println("Now: " + Calendar.getInstance().getTime());
        __CLR4_4_1ezxezxldni84qu.R.inc(19448);System.out.println(System.getProperty("java.vendor")
                + " "
                + System.getProperty("java.runtime.name")
                + " "
                + System.getProperty("java.runtime.version"));
        __CLR4_4_1ezxezxldni84qu.R.inc(19449);System.out.println(System.getProperty("java.vm.vendor")
                + " "
                + System.getProperty("java.vm.name")
                + " "
                + System.getProperty("java.vm.version"));
        __CLR4_4_1ezxezxldni84qu.R.inc(19450);System.out.println(System.getProperty("os.name")
            + " "
            + System.getProperty("os.version")
            + " "
            + System.getProperty("os.arch")
            + " "
            + System.getProperty("sun.cpu.isalist"));
    }finally{__CLR4_4_1ezxezxldni84qu.R.flushNeeded();}}

    private void run() {try{__CLR4_4_1ezxezxldni84qu.R.inc(19451);
        __CLR4_4_1ezxezxldni84qu.R.inc(19452);this.printSysInfo();
        __CLR4_4_1ezxezxldni84qu.R.inc(19453);long start;
        __CLR4_4_1ezxezxldni84qu.R.inc(19454);start = System.currentTimeMillis();
        __CLR4_4_1ezxezxldni84qu.R.inc(19455);this.printlnTotal("Do nohting", start);
        //System.out.println("Warming up...");
        __CLR4_4_1ezxezxldni84qu.R.inc(19456);run_CharUtils_isAsciiNumeric(WARM_UP);
        //System.out.println("Measuring...");
        __CLR4_4_1ezxezxldni84qu.R.inc(19457);start = System.currentTimeMillis();
        __CLR4_4_1ezxezxldni84qu.R.inc(19458);run_CharUtils_isAsciiNumeric(COUNT);
        __CLR4_4_1ezxezxldni84qu.R.inc(19459);this.printlnTotal("run_CharUtils_isAsciiNumeric", start);
        //System.out.println("Warming up...");
        __CLR4_4_1ezxezxldni84qu.R.inc(19460);run_inlined_CharUtils_isAsciiNumeric(WARM_UP);
        //System.out.println("Measuring...");
        __CLR4_4_1ezxezxldni84qu.R.inc(19461);start = System.currentTimeMillis();
        __CLR4_4_1ezxezxldni84qu.R.inc(19462);run_inlined_CharUtils_isAsciiNumeric(COUNT);
        __CLR4_4_1ezxezxldni84qu.R.inc(19463);this.printlnTotal("run_inlined_CharUtils_isAsciiNumeric", start);
        //System.out.println("Warming up...");
        __CLR4_4_1ezxezxldni84qu.R.inc(19464);run_CharSet(WARM_UP);
        //System.out.println("Measuring...");
        __CLR4_4_1ezxezxldni84qu.R.inc(19465);start = System.currentTimeMillis();
        __CLR4_4_1ezxezxldni84qu.R.inc(19466);run_CharSet(COUNT);
        __CLR4_4_1ezxezxldni84qu.R.inc(19467);this.printlnTotal("run_CharSet", start);
    }finally{__CLR4_4_1ezxezxldni84qu.R.flushNeeded();}}

    private int run_CharSet(final int loopCount) {try{__CLR4_4_1ezxezxldni84qu.R.inc(19468);
        __CLR4_4_1ezxezxldni84qu.R.inc(19469);int t = 0;
        __CLR4_4_1ezxezxldni84qu.R.inc(19470);for (int i = 0; (((i < loopCount)&&(__CLR4_4_1ezxezxldni84qu.R.iget(19471)!=0|true))||(__CLR4_4_1ezxezxldni84qu.R.iget(19472)==0&false)); i++) {{
            __CLR4_4_1ezxezxldni84qu.R.inc(19473);for (final char ch : CHAR_SAMPLES) {{
                __CLR4_4_1ezxezxldni84qu.R.inc(19474);final boolean b = CharSet.ASCII_NUMERIC.contains(ch);
                __CLR4_4_1ezxezxldni84qu.R.inc(19475);t += (((b )&&(__CLR4_4_1ezxezxldni84qu.R.iget(19476)!=0|true))||(__CLR4_4_1ezxezxldni84qu.R.iget(19477)==0&false))? 1 : 0;
            }
        }}
        }__CLR4_4_1ezxezxldni84qu.R.inc(19478);return t;
    }finally{__CLR4_4_1ezxezxldni84qu.R.flushNeeded();}}

    private int run_CharUtils_isAsciiNumeric(final int loopCount) {try{__CLR4_4_1ezxezxldni84qu.R.inc(19479);
        __CLR4_4_1ezxezxldni84qu.R.inc(19480);int t = 0;
        __CLR4_4_1ezxezxldni84qu.R.inc(19481);for (int i = 0; (((i < loopCount)&&(__CLR4_4_1ezxezxldni84qu.R.iget(19482)!=0|true))||(__CLR4_4_1ezxezxldni84qu.R.iget(19483)==0&false)); i++) {{
            __CLR4_4_1ezxezxldni84qu.R.inc(19484);for (final char ch : CHAR_SAMPLES) {{
                __CLR4_4_1ezxezxldni84qu.R.inc(19485);final boolean b = CharUtils.isAsciiNumeric(ch);
                __CLR4_4_1ezxezxldni84qu.R.inc(19486);t += (((b )&&(__CLR4_4_1ezxezxldni84qu.R.iget(19487)!=0|true))||(__CLR4_4_1ezxezxldni84qu.R.iget(19488)==0&false))? 1 : 0;
            }
        }}
        }__CLR4_4_1ezxezxldni84qu.R.inc(19489);return t;
    }finally{__CLR4_4_1ezxezxldni84qu.R.flushNeeded();}}

    private int run_inlined_CharUtils_isAsciiNumeric(final int loopCount) {try{__CLR4_4_1ezxezxldni84qu.R.inc(19490);
        __CLR4_4_1ezxezxldni84qu.R.inc(19491);int t = 0;
        __CLR4_4_1ezxezxldni84qu.R.inc(19492);for (int i = 0; (((i < loopCount)&&(__CLR4_4_1ezxezxldni84qu.R.iget(19493)!=0|true))||(__CLR4_4_1ezxezxldni84qu.R.iget(19494)==0&false)); i++) {{
            __CLR4_4_1ezxezxldni84qu.R.inc(19495);for (final char ch : CHAR_SAMPLES) {{
                __CLR4_4_1ezxezxldni84qu.R.inc(19496);final boolean b = ch >= '0' && ch <= '9';
                __CLR4_4_1ezxezxldni84qu.R.inc(19497);t += (((b )&&(__CLR4_4_1ezxezxldni84qu.R.iget(19498)!=0|true))||(__CLR4_4_1ezxezxldni84qu.R.iget(19499)==0&false))? 1 : 0;
            }
        }}
        }__CLR4_4_1ezxezxldni84qu.R.inc(19500);return t;
    }finally{__CLR4_4_1ezxezxldni84qu.R.flushNeeded();}}

    private void printlnTotal(final String prefix, final long start) {try{__CLR4_4_1ezxezxldni84qu.R.inc(19501);
        __CLR4_4_1ezxezxldni84qu.R.inc(19502);final long total = System.currentTimeMillis() - start;
        __CLR4_4_1ezxezxldni84qu.R.inc(19503);System.out.println(prefix + ": " + NumberFormat.getInstance().format(total) + " milliseconds.");
    }finally{__CLR4_4_1ezxezxldni84qu.R.flushNeeded();}}
}
