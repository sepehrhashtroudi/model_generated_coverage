/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
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
package org.joda.time.chrono;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;

/**
 * This class is a Junit unit test for JulianChronology.
 *
 * @author Stephen Colebourne
 */
public class TestJulianChronology extends TestCase {static class __CLR4_4_1kkfkkfle6nl8k9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,26697,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1kkfkkfle6nl8k9.R.inc(26655);
        __CLR4_4_1kkfkkfle6nl8k9.R.inc(26656);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kkfkkfle6nl8k9.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kkfkkfle6nl8k9.R.inc(26657);
        __CLR4_4_1kkfkkfle6nl8k9.R.inc(26658);return new TestSuite(TestJulianChronology.class);
    }finally{__CLR4_4_1kkfkkfle6nl8k9.R.flushNeeded();}}

    public TestJulianChronology(String name) {
        super(name);__CLR4_4_1kkfkkfle6nl8k9.R.inc(26660);try{__CLR4_4_1kkfkkfle6nl8k9.R.inc(26659);
    }finally{__CLR4_4_1kkfkkfle6nl8k9.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kkfkkfle6nl8k9.R.inc(26661);
        __CLR4_4_1kkfkkfle6nl8k9.R.inc(26662);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kkfkkfle6nl8k9.R.inc(26663);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1kkfkkfle6nl8k9.R.inc(26664);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1kkfkkfle6nl8k9.R.inc(26665);originalLocale = Locale.getDefault();
        __CLR4_4_1kkfkkfle6nl8k9.R.inc(26666);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1kkfkkfle6nl8k9.R.inc(26667);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1kkfkkfle6nl8k9.R.inc(26668);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1kkfkkfle6nl8k9.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kkfkkfle6nl8k9.R.inc(26669);
        __CLR4_4_1kkfkkfle6nl8k9.R.inc(26670);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kkfkkfle6nl8k9.R.inc(26671);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1kkfkkfle6nl8k9.R.inc(26672);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1kkfkkfle6nl8k9.R.inc(26673);Locale.setDefault(originalLocale);
        __CLR4_4_1kkfkkfle6nl8k9.R.inc(26674);originalDateTimeZone = null;
        __CLR4_4_1kkfkkfle6nl8k9.R.inc(26675);originalTimeZone = null;
        __CLR4_4_1kkfkkfle6nl8k9.R.inc(26676);originalLocale = null;
    }finally{__CLR4_4_1kkfkkfle6nl8k9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFactoryUTC183() {__CLR4_4_1kkfkkfle6nl8k9.R.globalSliceStart(getClass().getName(),26677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e65fevkl1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkfkkfle6nl8k9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkfkkfle6nl8k9.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testFactoryUTC183",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26677,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e65fevkl1(){try{__CLR4_4_1kkfkkfle6nl8k9.R.inc(26677); 
     __CLR4_4_1kkfkkfle6nl8k9.R.inc(26678);assertEquals(JulianChronology.getInstanceUTC(), JulianChronology.getInstance(LONDON).withUTC()); 
     __CLR4_4_1kkfkkfle6nl8k9.R.inc(26679);assertEquals(JulianChronology.getInstanceUTC(), JulianChronology.getInstance(TOKYO).withUTC()); 
     __CLR4_4_1kkfkkfle6nl8k9.R.inc(26680);assertEquals(JulianChronology.getInstanceUTC(), JulianChronology.getInstanceUTC().withUTC()); 
     __CLR4_4_1kkfkkfle6nl8k9.R.inc(26681);assertSame(JulianChronology.class, JulianChronology.getInstanceUTC().getClass()); 
 }finally{__CLR4_4_1kkfkkfle6nl8k9.R.flushNeeded();}}
public void testFactory_Zone185() {__CLR4_4_1kkfkkfle6nl8k9.R.globalSliceStart(getClass().getName(),26682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15njuxukl6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkfkkfle6nl8k9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkfkkfle6nl8k9.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testFactory_Zone185",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26682,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15njuxukl6(){try{__CLR4_4_1kkfkkfle6nl8k9.R.inc(26682); 
     __CLR4_4_1kkfkkfle6nl8k9.R.inc(26683);assertEquals(TOKYO, JulianChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1kkfkkfle6nl8k9.R.inc(26684);assertEquals(PARIS, JulianChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1kkfkkfle6nl8k9.R.inc(26685);assertEquals(LONDON, JulianChronology.getInstance(null).getZone()); 
     __CLR4_4_1kkfkkfle6nl8k9.R.inc(26686);assertSame(JulianChronology.class, JulianChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1kkfkkfle6nl8k9.R.flushNeeded();}}
public void testFactory_Zone_int186() {__CLR4_4_1kkfkkfle6nl8k9.R.globalSliceStart(getClass().getName(),26687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lkanwzklb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kkfkkfle6nl8k9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kkfkkfle6nl8k9.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testFactory_Zone_int186",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26687,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lkanwzklb(){try{__CLR4_4_1kkfkkfle6nl8k9.R.inc(26687); 
     __CLR4_4_1kkfkkfle6nl8k9.R.inc(26688);JulianChronology chrono = JulianChronology.getInstance(TOKYO, 2); 
     __CLR4_4_1kkfkkfle6nl8k9.R.inc(26689);assertEquals(TOKYO, chrono.getZone()); 
     __CLR4_4_1kkfkkfle6nl8k9.R.inc(26690);assertEquals(2, chrono.getMinimumDaysInFirstWeek()); 
     __CLR4_4_1kkfkkfle6nl8k9.R.inc(26691);try { 
         __CLR4_4_1kkfkkfle6nl8k9.R.inc(26692);JulianChronology.getInstance(TOKYO, 0); 
         __CLR4_4_1kkfkkfle6nl8k9.R.inc(26693);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1kkfkkfle6nl8k9.R.inc(26694);try { 
         __CLR4_4_1kkfkkfle6nl8k9.R.inc(26695);JulianChronology.getInstance(TOKYO, 8); 
         __CLR4_4_1kkfkkfle6nl8k9.R.inc(26696);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kkfkkfle6nl8k9.R.flushNeeded();}}
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

}
