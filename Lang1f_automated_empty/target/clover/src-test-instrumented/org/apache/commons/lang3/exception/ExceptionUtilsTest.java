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
public class ExceptionUtilsTest {static class __CLR4_4_1fwdfwdldniggxl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367339710L,8589935092L,20645,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private NestableException nested;
    private Throwable withCause;
    private Throwable withoutCause;
    private Throwable jdkNoCause;
    private ExceptionWithCause cyclicCause;


    @Before
    public void setUp() {try{__CLR4_4_1fwdfwdldniggxl.R.inc(20605);
        __CLR4_4_1fwdfwdldniggxl.R.inc(20606);withoutCause = createExceptionWithoutCause();
        __CLR4_4_1fwdfwdldniggxl.R.inc(20607);nested = new NestableException(withoutCause);
        __CLR4_4_1fwdfwdldniggxl.R.inc(20608);withCause = new ExceptionWithCause(nested);
        __CLR4_4_1fwdfwdldniggxl.R.inc(20609);jdkNoCause = new NullPointerException();
        __CLR4_4_1fwdfwdldniggxl.R.inc(20610);final ExceptionWithCause a = new ExceptionWithCause(null);
        __CLR4_4_1fwdfwdldniggxl.R.inc(20611);final ExceptionWithCause b = new ExceptionWithCause(a);
        __CLR4_4_1fwdfwdldniggxl.R.inc(20612);a.setCause(b);
        __CLR4_4_1fwdfwdldniggxl.R.inc(20613);cyclicCause = new ExceptionWithCause(a);
    }finally{__CLR4_4_1fwdfwdldniggxl.R.flushNeeded();}}


    @After
    public void tearDown() throws Exception {try{__CLR4_4_1fwdfwdldniggxl.R.inc(20614);
        __CLR4_4_1fwdfwdldniggxl.R.inc(20615);withoutCause = null;
        __CLR4_4_1fwdfwdldniggxl.R.inc(20616);nested = null;
        __CLR4_4_1fwdfwdldniggxl.R.inc(20617);withCause = null;
        __CLR4_4_1fwdfwdldniggxl.R.inc(20618);jdkNoCause = null;
        __CLR4_4_1fwdfwdldniggxl.R.inc(20619);cyclicCause = null;
    }finally{__CLR4_4_1fwdfwdldniggxl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private Throwable createExceptionWithoutCause() {try{__CLR4_4_1fwdfwdldniggxl.R.inc(20620);
        __CLR4_4_1fwdfwdldniggxl.R.inc(20621);try {
            __CLR4_4_1fwdfwdldniggxl.R.inc(20622);throw new ExceptionWithoutCause();
        } catch (final Throwable t) {
            __CLR4_4_1fwdfwdldniggxl.R.inc(20623);return t;
        }
    }finally{__CLR4_4_1fwdfwdldniggxl.R.flushNeeded();}}

    private Throwable createExceptionWithCause() {try{__CLR4_4_1fwdfwdldniggxl.R.inc(20624);
        __CLR4_4_1fwdfwdldniggxl.R.inc(20625);try {
            __CLR4_4_1fwdfwdldniggxl.R.inc(20626);try {
                __CLR4_4_1fwdfwdldniggxl.R.inc(20627);throw new ExceptionWithCause(createExceptionWithoutCause());
            } catch (final Throwable t) {
                __CLR4_4_1fwdfwdldniggxl.R.inc(20628);throw new ExceptionWithCause(t);
            }
        } catch (final Throwable t) {
            __CLR4_4_1fwdfwdldniggxl.R.inc(20629);return t;
        }
    }finally{__CLR4_4_1fwdfwdldniggxl.R.flushNeeded();}}

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
            super(str);__CLR4_4_1fwdfwdldniggxl.R.inc(20631);try{__CLR4_4_1fwdfwdldniggxl.R.inc(20630);
            __CLR4_4_1fwdfwdldniggxl.R.inc(20632);setCause(cause);
        }finally{__CLR4_4_1fwdfwdldniggxl.R.flushNeeded();}}

        public ExceptionWithCause(final Throwable cause) {
            super();__CLR4_4_1fwdfwdldniggxl.R.inc(20634);try{__CLR4_4_1fwdfwdldniggxl.R.inc(20633);
            __CLR4_4_1fwdfwdldniggxl.R.inc(20635);setCause(cause);
        }finally{__CLR4_4_1fwdfwdldniggxl.R.flushNeeded();}}

        @Override
        public Throwable getCause() {try{__CLR4_4_1fwdfwdldniggxl.R.inc(20636);
            __CLR4_4_1fwdfwdldniggxl.R.inc(20637);return cause;
        }finally{__CLR4_4_1fwdfwdldniggxl.R.flushNeeded();}}

        public void setCause(final Throwable cause) {try{__CLR4_4_1fwdfwdldniggxl.R.inc(20638);
            __CLR4_4_1fwdfwdldniggxl.R.inc(20639);this.cause = cause;
        }finally{__CLR4_4_1fwdfwdldniggxl.R.flushNeeded();}}
    }

    /**
     * Provides a method with a well known chained/nested exception
     * name which does not match the full signature (e.g. lacks a
     * return value of <code>Throwable</code>.
     */
    private static class ExceptionWithoutCause extends Exception {
        @SuppressWarnings("unused")
        public void getTargetException() {try{__CLR4_4_1fwdfwdldniggxl.R.inc(20640);
        }finally{__CLR4_4_1fwdfwdldniggxl.R.flushNeeded();}}
    }

    // Temporary classes to allow the nested exception code to be removed 
    // prior to a rewrite of this test class. 
    private static class NestableException extends Exception { 
        @SuppressWarnings("unused")
        public NestableException() { super();__CLR4_4_1fwdfwdldniggxl.R.inc(20642);try{__CLR4_4_1fwdfwdldniggxl.R.inc(20641); }finally{__CLR4_4_1fwdfwdldniggxl.R.flushNeeded();}}
        public NestableException(final Throwable t) { super(t);__CLR4_4_1fwdfwdldniggxl.R.inc(20644);try{__CLR4_4_1fwdfwdldniggxl.R.inc(20643); }finally{__CLR4_4_1fwdfwdldniggxl.R.flushNeeded();}}
    }

}
