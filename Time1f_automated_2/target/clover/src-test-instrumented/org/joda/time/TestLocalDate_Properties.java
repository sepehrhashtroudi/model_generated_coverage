/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2010 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time;

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDate_Properties extends TestCase {static class __CLR4_4_1i6ji6jle6nl8aj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,23585,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);

    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1i6ji6jle6nl8aj.R.inc(23563);
        __CLR4_4_1i6ji6jle6nl8aj.R.inc(23564);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1i6ji6jle6nl8aj.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1i6ji6jle6nl8aj.R.inc(23565);
        __CLR4_4_1i6ji6jle6nl8aj.R.inc(23566);return new TestSuite(TestLocalDate_Properties.class);
    }finally{__CLR4_4_1i6ji6jle6nl8aj.R.flushNeeded();}}

    public TestLocalDate_Properties(String name) {
        super(name);__CLR4_4_1i6ji6jle6nl8aj.R.inc(23568);try{__CLR4_4_1i6ji6jle6nl8aj.R.inc(23567);
    }finally{__CLR4_4_1i6ji6jle6nl8aj.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1i6ji6jle6nl8aj.R.inc(23569);
        __CLR4_4_1i6ji6jle6nl8aj.R.inc(23570);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1i6ji6jle6nl8aj.R.inc(23571);zone = DateTimeZone.getDefault();
        __CLR4_4_1i6ji6jle6nl8aj.R.inc(23572);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1i6ji6jle6nl8aj.R.inc(23573);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1i6ji6jle6nl8aj.R.inc(23574);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1i6ji6jle6nl8aj.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1i6ji6jle6nl8aj.R.inc(23575);
        __CLR4_4_1i6ji6jle6nl8aj.R.inc(23576);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1i6ji6jle6nl8aj.R.inc(23577);DateTimeZone.setDefault(zone);
        __CLR4_4_1i6ji6jle6nl8aj.R.inc(23578);zone = null;
        __CLR4_4_1i6ji6jle6nl8aj.R.inc(23579);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1i6ji6jle6nl8aj.R.inc(23580);systemDefaultLocale = null;
    }finally{__CLR4_4_1i6ji6jle6nl8aj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(LocalDate test, int year, int month, int day) {try{__CLR4_4_1i6ji6jle6nl8aj.R.inc(23581);
        __CLR4_4_1i6ji6jle6nl8aj.R.inc(23582);assertEquals(year, test.getYear());
        __CLR4_4_1i6ji6jle6nl8aj.R.inc(23583);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1i6ji6jle6nl8aj.R.inc(23584);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1i6ji6jle6nl8aj.R.flushNeeded();}}
}
