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
package org.apache.commons.lang3.exception;

import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.List;

/**
 * Tests {@link org.apache.commons.lang3.exception.ExceptionUtils}.
 * 
 * <h3>Notes</h3>
 * <p>
 * Make sure this exception code does not depend on Java 1.4 nested exceptions. SVN revision 38990 does not compile with
 * Java 1.3.1.
 * </p>
 * <ul>
 * <li>Compiled with Sun Java 1.3.1_15</li>
 * <li>Tested with Sun Java 1.3.1_15</li>
 * <li>Tested with Sun Java 1.4.2_12</li>
 * <li>Tested with Sun Java 1.5.0_08</li>
 * <li>All of the above on Windows XP SP2 + patches.</li>
 * </ul>
 * <p>
 * Gary Gregory; August 16, 2006.
 * </p>
 * 
 * @since 1.0
 */
public class ExceptionUtilsTest {static class __CLR4_4_1g54g54ldni84yo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,20960,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private NestableException nested;
    private Throwable withCause;
    private Throwable withoutCause;
    private Throwable jdkNoCause;
    private ExceptionWithCause cyclicCause;


    @Before
    public void setUp() {try{__CLR4_4_1g54g54ldni84yo.R.inc(20920);
        __CLR4_4_1g54g54ldni84yo.R.inc(20921);withoutCause = createExceptionWithoutCause();
        __CLR4_4_1g54g54ldni84yo.R.inc(20922);nested = new NestableException(withoutCause);
        __CLR4_4_1g54g54ldni84yo.R.inc(20923);withCause = new ExceptionWithCause(nested);
        __CLR4_4_1g54g54ldni84yo.R.inc(20924);jdkNoCause = new NullPointerException();
        __CLR4_4_1g54g54ldni84yo.R.inc(20925);final ExceptionWithCause a = new ExceptionWithCause(null);
        __CLR4_4_1g54g54ldni84yo.R.inc(20926);final ExceptionWithCause b = new ExceptionWithCause(a);
        __CLR4_4_1g54g54ldni84yo.R.inc(20927);a.setCause(b);
        __CLR4_4_1g54g54ldni84yo.R.inc(20928);cyclicCause = new ExceptionWithCause(a);
    }finally{__CLR4_4_1g54g54ldni84yo.R.flushNeeded();}}


    @After
    public void tearDown() throws Exception {try{__CLR4_4_1g54g54ldni84yo.R.inc(20929);
        __CLR4_4_1g54g54ldni84yo.R.inc(20930);withoutCause = null;
        __CLR4_4_1g54g54ldni84yo.R.inc(20931);nested = null;
        __CLR4_4_1g54g54ldni84yo.R.inc(20932);withCause = null;
        __CLR4_4_1g54g54ldni84yo.R.inc(20933);jdkNoCause = null;
        __CLR4_4_1g54g54ldni84yo.R.inc(20934);cyclicCause = null;
    }finally{__CLR4_4_1g54g54ldni84yo.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private Throwable createExceptionWithoutCause() {try{__CLR4_4_1g54g54ldni84yo.R.inc(20935);
        __CLR4_4_1g54g54ldni84yo.R.inc(20936);try {
            __CLR4_4_1g54g54ldni84yo.R.inc(20937);throw new ExceptionWithoutCause();
        } catch (final Throwable t) {
            __CLR4_4_1g54g54ldni84yo.R.inc(20938);return t;
        }
    }finally{__CLR4_4_1g54g54ldni84yo.R.flushNeeded();}}

    private Throwable createExceptionWithCause() {try{__CLR4_4_1g54g54ldni84yo.R.inc(20939);
        __CLR4_4_1g54g54ldni84yo.R.inc(20940);try {
            __CLR4_4_1g54g54ldni84yo.R.inc(20941);try {
                __CLR4_4_1g54g54ldni84yo.R.inc(20942);throw new ExceptionWithCause(createExceptionWithoutCause());
            } catch (final Throwable t) {
                __CLR4_4_1g54g54ldni84yo.R.inc(20943);throw new ExceptionWithCause(t);
            }
        } catch (final Throwable t) {
            __CLR4_4_1g54g54ldni84yo.R.inc(20944);return t;
        }
    }finally{__CLR4_4_1g54g54ldni84yo.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    
    
    
    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    
    
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Provides a method with a well known chained/nested exception
     * name which matches the full signature (e.g. has a return value
     * of <code>Throwable</code>.
     */
    private static class ExceptionWithCause extends Exception {
        private Throwable cause;

        public ExceptionWithCause(final String str, final Throwable cause) {
            super(str);__CLR4_4_1g54g54ldni84yo.R.inc(20946);try{__CLR4_4_1g54g54ldni84yo.R.inc(20945);
            __CLR4_4_1g54g54ldni84yo.R.inc(20947);setCause(cause);
        }finally{__CLR4_4_1g54g54ldni84yo.R.flushNeeded();}}

        public ExceptionWithCause(final Throwable cause) {
            super();__CLR4_4_1g54g54ldni84yo.R.inc(20949);try{__CLR4_4_1g54g54ldni84yo.R.inc(20948);
            __CLR4_4_1g54g54ldni84yo.R.inc(20950);setCause(cause);
        }finally{__CLR4_4_1g54g54ldni84yo.R.flushNeeded();}}

        @Override
        public Throwable getCause() {try{__CLR4_4_1g54g54ldni84yo.R.inc(20951);
            __CLR4_4_1g54g54ldni84yo.R.inc(20952);return cause;
        }finally{__CLR4_4_1g54g54ldni84yo.R.flushNeeded();}}

        public void setCause(final Throwable cause) {try{__CLR4_4_1g54g54ldni84yo.R.inc(20953);
            __CLR4_4_1g54g54ldni84yo.R.inc(20954);this.cause = cause;
        }finally{__CLR4_4_1g54g54ldni84yo.R.flushNeeded();}}
    }

    /**
     * Provides a method with a well known chained/nested exception
     * name which does not match the full signature (e.g. lacks a
     * return value of <code>Throwable</code>.
     */
    private static class ExceptionWithoutCause extends Exception {
        @SuppressWarnings("unused")
        public void getTargetException() {try{__CLR4_4_1g54g54ldni84yo.R.inc(20955);
        }finally{__CLR4_4_1g54g54ldni84yo.R.flushNeeded();}}
    }

    // Temporary classes to allow the nested exception code to be removed 
    // prior to a rewrite of this test class. 
    private static class NestableException extends Exception { 
        @SuppressWarnings("unused")
        public NestableException() { super();__CLR4_4_1g54g54ldni84yo.R.inc(20957);try{__CLR4_4_1g54g54ldni84yo.R.inc(20956); }finally{__CLR4_4_1g54g54ldni84yo.R.flushNeeded();}}
        public NestableException(final Throwable t) { super(t);__CLR4_4_1g54g54ldni84yo.R.inc(20959);try{__CLR4_4_1g54g54ldni84yo.R.inc(20958); }finally{__CLR4_4_1g54g54ldni84yo.R.flushNeeded();}}
    }

}
