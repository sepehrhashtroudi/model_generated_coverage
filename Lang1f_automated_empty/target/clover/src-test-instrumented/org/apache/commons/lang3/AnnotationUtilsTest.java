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

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static org.apache.commons.lang3.AnnotationUtilsTest.Stooge.CURLY;
import static org.apache.commons.lang3.AnnotationUtilsTest.Stooge.LARRY;
import static org.apache.commons.lang3.AnnotationUtilsTest.Stooge.MOE;
import static org.apache.commons.lang3.AnnotationUtilsTest.Stooge.SHEMP;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

/**
 * @version $Id$
 */
public class AnnotationUtilsTest {static class __CLR4_4_1ey1ey1ldniggr8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367339710L,8589935092L,19374,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @TestAnnotation(
            booleanValue = false,
            booleanValues = { false },
            byteValue = 0,
            byteValues = { 0 },
            charValue = 0,
            charValues = { 0 },
            doubleValue = 0,
            doubleValues = { 0 },
            floatValue = 0,
            floatValues = { 0 },
            intValue = 0,
            intValues = { 0 },
            longValue = 0,
            longValues = { 0 },
            nest = @NestAnnotation(
                    booleanValue = false,
                    booleanValues = { false },
                    byteValue = 0,
                    byteValues = { 0 },
                    charValue = 0,
                    charValues = { 0 },
                    doubleValue = 0,
                    doubleValues = { 0 },
                    floatValue = 0,
                    floatValues = { 0 },
                    intValue = 0,
                    intValues = { 0 },
                    longValue = 0,
                    longValues = { 0 },
                    shortValue = 0,
                    shortValues = { 0 },
                    stooge = CURLY,
                    stooges = { MOE, LARRY, SHEMP },
                    string = "",
                    strings = { "" },
                    type = Object.class,
                    types = { Object.class }
            ),
            nests = {
                @NestAnnotation(
                        booleanValue = false,
                        booleanValues = { false },
                        byteValue = 0,
                        byteValues = { 0 },
                        charValue = 0,
                        charValues = { 0 },
                        doubleValue = 0,
                        doubleValues = { 0 },
                        floatValue = 0,
                        floatValues = { 0 },
                        intValue = 0,
                        intValues = { 0 },
                        longValue = 0,
                        longValues = { 0 },
                        shortValue = 0,
                        shortValues = { 0 },
                        stooge = CURLY,
                        stooges = { MOE, LARRY, SHEMP },
                        string = "",
                        strings = { "" },
                        type = Object[].class,
                        types = { Object[].class }
                )
            },
            shortValue = 0,
            shortValues = { 0 },
            stooge = SHEMP,
            stooges = { MOE, LARRY, CURLY },
            string = "",
            strings = { "" },
            type = Object.class,
            types = { Object.class }
    )
    public Object dummy1;

    @TestAnnotation(
            booleanValue = false,
            booleanValues = { false },
            byteValue = 0,
            byteValues = { 0 },
            charValue = 0,
            charValues = { 0 },
            doubleValue = 0,
            doubleValues = { 0 },
            floatValue = 0,
            floatValues = { 0 },
            intValue = 0,
            intValues = { 0 },
            longValue = 0,
            longValues = { 0 },
            nest = @NestAnnotation(
                    booleanValue = false,
                    booleanValues = { false },
                    byteValue = 0,
                    byteValues = { 0 },
                    charValue = 0,
                    charValues = { 0 },
                    doubleValue = 0,
                    doubleValues = { 0 },
                    floatValue = 0,
                    floatValues = { 0 },
                    intValue = 0,
                    intValues = { 0 },
                    longValue = 0,
                    longValues = { 0 },
                    shortValue = 0,
                    shortValues = { 0 },
                    stooge = CURLY,
                    stooges = { MOE, LARRY, SHEMP },
                    string = "",
                    strings = { "" },
                    type = Object.class,
                    types = { Object.class }
            ),
            nests = {
                @NestAnnotation(
                        booleanValue = false,
                        booleanValues = { false },
                        byteValue = 0,
                        byteValues = { 0 },
                        charValue = 0,
                        charValues = { 0 },
                        doubleValue = 0,
                        doubleValues = { 0 },
                        floatValue = 0,
                        floatValues = { 0 },
                        intValue = 0,
                        intValues = { 0 },
                        longValue = 0,
                        longValues = { 0 },
                        shortValue = 0,
                        shortValues = { 0 },
                        stooge = CURLY,
                        stooges = { MOE, LARRY, SHEMP },
                        string = "",
                        strings = { "" },
                        type = Object[].class,
                        types = { Object[].class }
                )
            },
            shortValue = 0,
            shortValues = { 0 },
            stooge = SHEMP,
            stooges = { MOE, LARRY, CURLY },
            string = "",
            strings = { "" },
            type = Object.class,
            types = { Object.class }
    )
    public Object dummy2;

    @TestAnnotation(
            booleanValue = false,
            booleanValues = { false },
            byteValue = 0,
            byteValues = { 0 },
            charValue = 0,
            charValues = { 0 },
            doubleValue = 0,
            doubleValues = { 0 },
            floatValue = 0,
            floatValues = { 0 },
            intValue = 0,
            intValues = { 0 },
            longValue = 0,
            longValues = { 0 },
            nest = @NestAnnotation(
                    booleanValue = false,
                    booleanValues = { false },
                    byteValue = 0,
                    byteValues = { 0 },
                    charValue = 0,
                    charValues = { 0 },
                    doubleValue = 0,
                    doubleValues = { 0 },
                    floatValue = 0,
                    floatValues = { 0 },
                    intValue = 0,
                    intValues = { 0 },
                    longValue = 0,
                    longValues = { 0 },
                    shortValue = 0,
                    shortValues = { 0 },
                    stooge = CURLY,
                    stooges = { MOE, LARRY, SHEMP },
                    string = "",
                    strings = { "" },
                    type = Object.class,
                    types = { Object.class }
            ),
            nests = {
                @NestAnnotation(
                        booleanValue = false,
                        booleanValues = { false },
                        byteValue = 0,
                        byteValues = { 0 },
                        charValue = 0,
                        charValues = { 0 },
                        doubleValue = 0,
                        doubleValues = { 0 },
                        floatValue = 0,
                        floatValues = { 0 },
                        intValue = 0,
                        intValues = { 0 },
                        longValue = 0,
                        longValues = { 0 },
                        shortValue = 0,
                        shortValues = { 0 },
                        stooge = CURLY,
                        stooges = { MOE, LARRY, SHEMP },
                        string = "",
                        strings = { "" },
                        type = Object[].class,
                        types = { Object[].class }
                ),
                //add a second NestAnnotation to break equality:
                @NestAnnotation(
                        booleanValue = false,
                        booleanValues = { false },
                        byteValue = 0,
                        byteValues = { 0 },
                        charValue = 0,
                        charValues = { 0 },
                        doubleValue = 0,
                        doubleValues = { 0 },
                        floatValue = 0,
                        floatValues = { 0 },
                        intValue = 0,
                        intValues = { 0 },
                        longValue = 0,
                        longValues = { 0 },
                        shortValue = 0,
                        shortValues = { 0 },
                        stooge = CURLY,
                        stooges = { MOE, LARRY, SHEMP },
                        string = "",
                        strings = { "" },
                        type = Object[].class,
                        types = { Object[].class }
                )
            },
            shortValue = 0,
            shortValues = { 0 },
            stooge = SHEMP,
            stooges = { MOE, LARRY, CURLY },
            string = "",
            strings = { "" },
            type = Object.class,
            types = { Object.class }
    )
    public Object dummy3;

    @NestAnnotation(
            booleanValue = false,
            booleanValues = { false },
            byteValue = 0,
            byteValues = { 0 },
            charValue = 0,
            charValues = { 0 },
            doubleValue = 0,
            doubleValues = { 0 },
            floatValue = 0,
            floatValues = { 0 },
            intValue = 0,
            intValues = { 0 },
            longValue = 0,
            longValues = { 0 },
            shortValue = 0,
            shortValues = { 0 },
            stooge = CURLY,
            stooges = { MOE, LARRY, SHEMP },
            string = "",
            strings = { "" },
            type = Object[].class,
            types = { Object[].class }
    )
    public Object dummy4;

    @Target(FIELD)
    @Retention(RUNTIME)
    public @interface TestAnnotation {
        String string();
        String[] strings();
        Class<?> type();
        Class<?>[] types();
        byte byteValue();
        byte[] byteValues();
        short shortValue();
        short[] shortValues();
        int intValue();
        int[] intValues();
        char charValue();
        char[] charValues();
        long longValue();
        long[] longValues();
        float floatValue();
        float[] floatValues();
        double doubleValue();
        double[] doubleValues();
        boolean booleanValue();
        boolean[] booleanValues();
        Stooge stooge();
        Stooge[] stooges();
        NestAnnotation nest();
        NestAnnotation[] nests();
    }

    public @interface NestAnnotation {
        String string();
        String[] strings();
        Class<?> type();
        Class<?>[] types();
        byte byteValue();
        byte[] byteValues();
        short shortValue();
        short[] shortValues();
        int intValue();
        int[] intValues();
        char charValue();
        char[] charValues();
        long longValue();
        long[] longValues();
        float floatValue();
        float[] floatValues();
        double doubleValue();
        double[] doubleValues();
        boolean booleanValue();
        boolean[] booleanValues();
        Stooge stooge();
        Stooge[] stooges();
    }

    public static enum Stooge {
        MOE, LARRY, CURLY, JOE, SHEMP;
    }

    private Field field1;
    private Field field2;
    private Field field3;
    private Field field4;

    @Before
    public void setup() throws Exception {try{__CLR4_4_1ey1ey1ldniggr8.R.inc(19369);
        __CLR4_4_1ey1ey1ldniggr8.R.inc(19370);field1 = getClass().getDeclaredField("dummy1");
        __CLR4_4_1ey1ey1ldniggr8.R.inc(19371);field2 = getClass().getDeclaredField("dummy2");
        __CLR4_4_1ey1ey1ldniggr8.R.inc(19372);field3 = getClass().getDeclaredField("dummy3");
        __CLR4_4_1ey1ey1ldniggr8.R.inc(19373);field4 = getClass().getDeclaredField("dummy4");
    }finally{__CLR4_4_1ey1ey1ldniggr8.R.flushNeeded();}}

    

    

    

    

    

    

    

    

    

    

}
