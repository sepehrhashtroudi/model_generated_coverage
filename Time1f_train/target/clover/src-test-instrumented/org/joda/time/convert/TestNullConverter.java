/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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
package org.joda.time.convert;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for NullConverter.
 *
 * @author Stephen Colebourne
 */
public class TestNullConverter extends TestCase {static class __CLR4_4_1t2lt2llc8axevu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,37715,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private long TEST_TIME_NOW =
            20 * DateTimeConstants.MILLIS_PER_DAY
            + 10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;
            
    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology ISO;
    private static Chronology JULIAN;
    
    private DateTimeZone zone = null;
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1t2lt2llc8axevu.R.inc(37677);
        __CLR4_4_1t2lt2llc8axevu.R.inc(37678);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1t2lt2llc8axevu.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1t2lt2llc8axevu.R.inc(37679);
        __CLR4_4_1t2lt2llc8axevu.R.inc(37680);return new TestSuite(TestNullConverter.class);
    }finally{__CLR4_4_1t2lt2llc8axevu.R.flushNeeded();}}

    public TestNullConverter(String name) {
        super(name);__CLR4_4_1t2lt2llc8axevu.R.inc(37682);try{__CLR4_4_1t2lt2llc8axevu.R.inc(37681);
    }finally{__CLR4_4_1t2lt2llc8axevu.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1t2lt2llc8axevu.R.inc(37683);
        __CLR4_4_1t2lt2llc8axevu.R.inc(37684);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1t2lt2llc8axevu.R.inc(37685);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1t2lt2llc8axevu.R.inc(37686);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1t2lt2llc8axevu.R.inc(37687);originalLocale = Locale.getDefault();
        __CLR4_4_1t2lt2llc8axevu.R.inc(37688);DateTimeZone.setDefault(DateTimeZone.forID("Europe/London"));
        __CLR4_4_1t2lt2llc8axevu.R.inc(37689);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1t2lt2llc8axevu.R.inc(37690);Locale.setDefault(Locale.UK);
        
        __CLR4_4_1t2lt2llc8axevu.R.inc(37691);ISO = ISOChronology.getInstance();
        __CLR4_4_1t2lt2llc8axevu.R.inc(37692);JULIAN = JulianChronology.getInstance();
    }finally{__CLR4_4_1t2lt2llc8axevu.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1t2lt2llc8axevu.R.inc(37693);
        __CLR4_4_1t2lt2llc8axevu.R.inc(37694);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1t2lt2llc8axevu.R.inc(37695);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1t2lt2llc8axevu.R.inc(37696);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1t2lt2llc8axevu.R.inc(37697);Locale.setDefault(originalLocale);
        __CLR4_4_1t2lt2llc8axevu.R.inc(37698);originalDateTimeZone = null;
        __CLR4_4_1t2lt2llc8axevu.R.inc(37699);originalTimeZone = null;
        __CLR4_4_1t2lt2llc8axevu.R.inc(37700);originalLocale = null;
    }finally{__CLR4_4_1t2lt2llc8axevu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testSupportedType276() throws Exception {__CLR4_4_1t2lt2llc8axevu.R.globalSliceStart(getClass().getName(),37701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gzu0iqt39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t2lt2llc8axevu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t2lt2llc8axevu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testSupportedType276",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37701,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gzu0iqt39() throws Exception{try{__CLR4_4_1t2lt2llc8axevu.R.inc(37701); 
     __CLR4_4_1t2lt2llc8axevu.R.inc(37702);assertEquals(null, NullConverter.INSTANCE.getSupportedType()); 
 }finally{__CLR4_4_1t2lt2llc8axevu.R.flushNeeded();}} 


public void testSetInto_Object_Chronology21388() throws Exception {__CLR4_4_1t2lt2llc8axevu.R.globalSliceStart(getClass().getName(),37703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pjv9wut3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t2lt2llc8axevu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t2lt2llc8axevu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testSetInto_Object_Chronology21388",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37703,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pjv9wut3b() throws Exception{try{__CLR4_4_1t2lt2llc8axevu.R.inc(37703); 
     __CLR4_4_1t2lt2llc8axevu.R.inc(37704);MutableInterval m = new MutableInterval(1000L, 2000L, GJChronology.getInstance()); 
     __CLR4_4_1t2lt2llc8axevu.R.inc(37705);NullConverter.INSTANCE.setInto(m, null, CopticChronology.getInstance()); 
     __CLR4_4_1t2lt2llc8axevu.R.inc(37706);assertEquals(TEST_TIME_NOW, m.getStartMillis()); 
     __CLR4_4_1t2lt2llc8axevu.R.inc(37707);assertEquals(TEST_TIME_NOW, m.getEndMillis()); 
     __CLR4_4_1t2lt2llc8axevu.R.inc(37708);assertEquals(CopticChronology.getInstance(), m.getChronology()); 
 }finally{__CLR4_4_1t2lt2llc8axevu.R.flushNeeded();}} 


public void testSetInto_Object1470() throws Exception {__CLR4_4_1t2lt2llc8axevu.R.globalSliceStart(getClass().getName(),37709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gcpgwht3h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t2lt2llc8axevu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t2lt2llc8axevu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testSetInto_Object1470",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gcpgwht3h() throws Exception{try{__CLR4_4_1t2lt2llc8axevu.R.inc(37709); 
     __CLR4_4_1t2lt2llc8axevu.R.inc(37710);MutablePeriod m = new MutablePeriod(PeriodType.millis()); 
     __CLR4_4_1t2lt2llc8axevu.R.inc(37711);NullConverter.INSTANCE.setInto(m, null, null); 
     __CLR4_4_1t2lt2llc8axevu.R.inc(37712);assertEquals(0L, m.getMillis()); 
 }finally{__CLR4_4_1t2lt2llc8axevu.R.flushNeeded();}} 


public void testGetDurationMillis_Object1744() throws Exception {__CLR4_4_1t2lt2llc8axevu.R.globalSliceStart(getClass().getName(),37713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r9vkert3l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t2lt2llc8axevu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t2lt2llc8axevu.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testGetDurationMillis_Object1744",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37713,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r9vkert3l() throws Exception{try{__CLR4_4_1t2lt2llc8axevu.R.inc(37713); 
     __CLR4_4_1t2lt2llc8axevu.R.inc(37714);assertEquals(0L, NullConverter.INSTANCE.getDurationMillis(null)); 
 }finally{__CLR4_4_1t2lt2llc8axevu.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

}
