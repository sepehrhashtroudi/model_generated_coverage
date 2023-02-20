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
package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;

/**
 * This class is a Junit unit test for serialization.
 *
 * @author Stephen Colebourne
 */
public class TestSerialization extends TestCase {static class __CLR4_4_1o9io9ile6rjd41{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,31548,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

//    private static class MockDelegatedDurationField extends DelegatedDurationField implements Serializable {
//        private static final long serialVersionUID = 1878496002811998493L;        
//        public MockDelegatedDurationField() {
//            super(MillisDurationField.INSTANCE);
//        }
//    }

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1o9io9ile6rjd41.R.inc(31446);
        __CLR4_4_1o9io9ile6rjd41.R.inc(31447);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1o9io9ile6rjd41.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1o9io9ile6rjd41.R.inc(31448);
        __CLR4_4_1o9io9ile6rjd41.R.inc(31449);return new TestSuite(TestSerialization.class);
    }finally{__CLR4_4_1o9io9ile6rjd41.R.flushNeeded();}}

    public TestSerialization(String name) {
        super(name);__CLR4_4_1o9io9ile6rjd41.R.inc(31451);try{__CLR4_4_1o9io9ile6rjd41.R.inc(31450);
    }finally{__CLR4_4_1o9io9ile6rjd41.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1o9io9ile6rjd41.R.inc(31452);
        __CLR4_4_1o9io9ile6rjd41.R.inc(31453);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1o9io9ile6rjd41.R.inc(31454);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1o9io9ile6rjd41.R.inc(31455);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1o9io9ile6rjd41.R.inc(31456);originalLocale = Locale.getDefault();
        __CLR4_4_1o9io9ile6rjd41.R.inc(31457);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1o9io9ile6rjd41.R.inc(31458);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1o9io9ile6rjd41.R.inc(31459);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1o9io9ile6rjd41.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1o9io9ile6rjd41.R.inc(31460);
        __CLR4_4_1o9io9ile6rjd41.R.inc(31461);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1o9io9ile6rjd41.R.inc(31462);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1o9io9ile6rjd41.R.inc(31463);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1o9io9ile6rjd41.R.inc(31464);Locale.setDefault(originalLocale);
        __CLR4_4_1o9io9ile6rjd41.R.inc(31465);originalDateTimeZone = null;
        __CLR4_4_1o9io9ile6rjd41.R.inc(31466);originalTimeZone = null;
        __CLR4_4_1o9io9ile6rjd41.R.inc(31467);originalLocale = null;
    }finally{__CLR4_4_1o9io9ile6rjd41.R.flushNeeded();}}

    //-----------------------------------------------------------------------

@SuppressWarnings("deprecation") 
 public void testSerializedYearMonthDay19() throws Exception {__CLR4_4_1o9io9ile6rjd41.R.globalSliceStart(getClass().getName(),31468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11dikn2oa4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o9io9ile6rjd41.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o9io9ile6rjd41.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedYearMonthDay19",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11dikn2oa4() throws Exception{try{__CLR4_4_1o9io9ile6rjd41.R.inc(31468); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31469);YearMonthDay test = new YearMonthDay(); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31470);loadAndCompare(test, "YearMonthDay", false); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31471);inlineCompare(test, false); 
 }finally{__CLR4_4_1o9io9ile6rjd41.R.flushNeeded();}} 


public void testSerializedGJChronologyChangedInternals115() throws Exception {__CLR4_4_1o9io9ile6rjd41.R.globalSliceStart(getClass().getName(),31472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e5ktrroa8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o9io9ile6rjd41.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o9io9ile6rjd41.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedGJChronologyChangedInternals115",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e5ktrroa8() throws Exception{try{__CLR4_4_1o9io9ile6rjd41.R.inc(31472); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31473);GJChronology test = GJChronology.getInstance(PARIS, 123L, 2); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31474);loadAndCompare(test, "GJChronologyChangedInternals", true); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31475);inlineCompare(test, true); 
 }finally{__CLR4_4_1o9io9ile6rjd41.R.flushNeeded();}} 


public void testDuration229() throws Exception {__CLR4_4_1o9io9ile6rjd41.R.globalSliceStart(getClass().getName(),31476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4kraeoac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o9io9ile6rjd41.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o9io9ile6rjd41.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testDuration229",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31476,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4kraeoac() throws Exception{try{__CLR4_4_1o9io9ile6rjd41.R.inc(31476); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31477);Duration test = Duration.millis(12345); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31478);loadAndCompare(test, "Duration", false); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31479);inlineCompare(test, false); 
 }finally{__CLR4_4_1o9io9ile6rjd41.R.flushNeeded();}} 


public void testSerializedISOChronology295() throws Exception {__CLR4_4_1o9io9ile6rjd41.R.globalSliceStart(getClass().getName(),31480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hzc1pqoag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o9io9ile6rjd41.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o9io9ile6rjd41.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedISOChronology295",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hzc1pqoag() throws Exception{try{__CLR4_4_1o9io9ile6rjd41.R.inc(31480); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31481);ISOChronology test = ISOChronology.getInstance(PARIS); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31482);loadAndCompare(test, "ISOChronology", true); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31483);inlineCompare(test, true); 
 }finally{__CLR4_4_1o9io9ile6rjd41.R.flushNeeded();}} 


public void testSerializedCopticChronology312() throws Exception {__CLR4_4_1o9io9ile6rjd41.R.globalSliceStart(getClass().getName(),31484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1efhn5voak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o9io9ile6rjd41.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o9io9ile6rjd41.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedCopticChronology312",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1efhn5voak() throws Exception{try{__CLR4_4_1o9io9ile6rjd41.R.inc(31484); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31485);CopticChronology test = CopticChronology.getInstance(LONDON); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31486);loadAndCompare(test, "CopticChronology", true); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31487);inlineCompare(test, true); 
 }finally{__CLR4_4_1o9io9ile6rjd41.R.flushNeeded();}} 


public void testSerializedBuddhistChronology427() throws Exception {__CLR4_4_1o9io9ile6rjd41.R.globalSliceStart(getClass().getName(),31488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1enbctfoao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o9io9ile6rjd41.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o9io9ile6rjd41.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedBuddhistChronology427",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1enbctfoao() throws Exception{try{__CLR4_4_1o9io9ile6rjd41.R.inc(31488); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31489);BuddhistChronology test = BuddhistChronology.getInstance(PARIS); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31490);loadAndCompare(test, "BuddhistChronology", true); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31491);inlineCompare(test, true); 
 }finally{__CLR4_4_1o9io9ile6rjd41.R.flushNeeded();}} 


public void testSerializedLocalDateBuddhist492() throws Exception {__CLR4_4_1o9io9ile6rjd41.R.globalSliceStart(getClass().getName(),31492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e9sxa4oas();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o9io9ile6rjd41.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o9io9ile6rjd41.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedLocalDateBuddhist492",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e9sxa4oas() throws Exception{try{__CLR4_4_1o9io9ile6rjd41.R.inc(31492); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31493);LocalDate test = new LocalDate(BuddhistChronology.getInstanceUTC()); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31494);loadAndCompare(test, "LocalDateBuddhist", false); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31495);inlineCompare(test, false); 
 }finally{__CLR4_4_1o9io9ile6rjd41.R.flushNeeded();}} 


public void testSerializedDateTimeProperty634() throws Exception {__CLR4_4_1o9io9ile6rjd41.R.globalSliceStart(getClass().getName(),31496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18n48o8oaw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o9io9ile6rjd41.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o9io9ile6rjd41.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedDateTimeProperty634",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31496,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18n48o8oaw() throws Exception{try{__CLR4_4_1o9io9ile6rjd41.R.inc(31496); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31497);DateTime.Property test = new DateTime().hourOfDay(); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31498);loadAndCompare(test, "DateTimeProperty", false); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31499);inlineCompare(test, false); 
 }finally{__CLR4_4_1o9io9ile6rjd41.R.flushNeeded();}} 


public void testSerializedGregorianChronology928() throws Exception {__CLR4_4_1o9io9ile6rjd41.R.globalSliceStart(getClass().getName(),31500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h2ycbiob0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o9io9ile6rjd41.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o9io9ile6rjd41.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedGregorianChronology928",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h2ycbiob0() throws Exception{try{__CLR4_4_1o9io9ile6rjd41.R.inc(31500); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31501);GregorianChronology test = GregorianChronology.getInstance(PARIS); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31502);loadAndCompare(test, "GregorianChronology", true); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31503);inlineCompare(test, true); 
 }finally{__CLR4_4_1o9io9ile6rjd41.R.flushNeeded();}} 


public void testSerializedUnsupportedDateTimeField949() throws Exception {__CLR4_4_1o9io9ile6rjd41.R.globalSliceStart(getClass().getName(),31504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12vrni3ob4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o9io9ile6rjd41.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o9io9ile6rjd41.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedUnsupportedDateTimeField949",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31504,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12vrni3ob4() throws Exception{try{__CLR4_4_1o9io9ile6rjd41.R.inc(31504); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31505);UnsupportedDateTimeField test = UnsupportedDateTimeField.getInstance(DateTimeFieldType.year(), UnsupportedDurationField.getInstance(DurationFieldType.years())); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31506);loadAndCompare(test, "UnsupportedDateTimeField", true); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31507);inlineCompare(test, true); 
 }finally{__CLR4_4_1o9io9ile6rjd41.R.flushNeeded();}} 


public void testSerializedLocalTime978() throws Exception {__CLR4_4_1o9io9ile6rjd41.R.globalSliceStart(getClass().getName(),31508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189vye9ob8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o9io9ile6rjd41.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o9io9ile6rjd41.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedLocalTime978",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31508,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189vye9ob8() throws Exception{try{__CLR4_4_1o9io9ile6rjd41.R.inc(31508); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31509);LocalTime test = new LocalTime(); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31510);loadAndCompare(test, "LocalTime", false); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31511);inlineCompare(test, false); 
 }finally{__CLR4_4_1o9io9ile6rjd41.R.flushNeeded();}} 


public void testSerializedMutableDateTimeProperty1089() throws Exception {__CLR4_4_1o9io9ile6rjd41.R.globalSliceStart(getClass().getName(),31512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11o83qfobc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o9io9ile6rjd41.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o9io9ile6rjd41.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedMutableDateTimeProperty1089",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31512,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11o83qfobc() throws Exception{try{__CLR4_4_1o9io9ile6rjd41.R.inc(31512); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31513);MutableDateTime.Property test = new MutableDateTime().hourOfDay(); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31514);loadAndCompare(test, "MutableDateTimeProperty", false); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31515);inlineCompare(test, false); 
 }finally{__CLR4_4_1o9io9ile6rjd41.R.flushNeeded();}} 


public void testSerializedLocalDateTime1298() throws Exception {__CLR4_4_1o9io9ile6rjd41.R.globalSliceStart(getClass().getName(),31516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hh5ui1obg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o9io9ile6rjd41.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o9io9ile6rjd41.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedLocalDateTime1298",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hh5ui1obg() throws Exception{try{__CLR4_4_1o9io9ile6rjd41.R.inc(31516); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31517);LocalDateTime test = new LocalDateTime(); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31518);loadAndCompare(test, "LocalDateTime", false); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31519);inlineCompare(test, false); 
 }finally{__CLR4_4_1o9io9ile6rjd41.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testSerializedDateMidnightProperty1460() throws Exception {__CLR4_4_1o9io9ile6rjd41.R.globalSliceStart(getClass().getName(),31520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_121f1pvobk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o9io9ile6rjd41.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o9io9ile6rjd41.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedDateMidnightProperty1460",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_121f1pvobk() throws Exception{try{__CLR4_4_1o9io9ile6rjd41.R.inc(31520); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31521);DateMidnight.Property test = new DateMidnight().monthOfYear(); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31522);loadAndCompare(test, "DateMidnightProperty", false); 
     __CLR4_4_1o9io9ile6rjd41.R.inc(31523);inlineCompare(test, false); 
 }finally{__CLR4_4_1o9io9ile6rjd41.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    private void loadAndCompare(Serializable test, String filename, boolean same) throws Exception {try{__CLR4_4_1o9io9ile6rjd41.R.inc(31524);
        __CLR4_4_1o9io9ile6rjd41.R.inc(31525);FileInputStream fis = new FileInputStream("src/test/resources/" + filename + ".dat");
        __CLR4_4_1o9io9ile6rjd41.R.inc(31526);ObjectInputStream ois = new ObjectInputStream(fis);
        __CLR4_4_1o9io9ile6rjd41.R.inc(31527);Object obj = ois.readObject();
        __CLR4_4_1o9io9ile6rjd41.R.inc(31528);ois.close();
        __CLR4_4_1o9io9ile6rjd41.R.inc(31529);if ((((same)&&(__CLR4_4_1o9io9ile6rjd41.R.iget(31530)!=0|true))||(__CLR4_4_1o9io9ile6rjd41.R.iget(31531)==0&false))) {{
            __CLR4_4_1o9io9ile6rjd41.R.inc(31532);assertSame(test, obj);
        } }else {{
            __CLR4_4_1o9io9ile6rjd41.R.inc(31533);assertEquals(test, obj);
        }
//        try {
//            fis = new FileInputStream("src/test/resources/" + filename + "2.dat");
//            ois = new ObjectInputStream(fis);
//            obj = ois.readObject();
//            ois.close();
//            if (same) {
//                assertSame(test, obj);
//            } else {
//                assertEquals(test, obj);
//            }
//        } catch (FileNotFoundException ex) {
//            // ignore
//        }
    }}finally{__CLR4_4_1o9io9ile6rjd41.R.flushNeeded();}}

    public void inlineCompare(Serializable test, boolean same) throws Exception {try{__CLR4_4_1o9io9ile6rjd41.R.inc(31534);
        __CLR4_4_1o9io9ile6rjd41.R.inc(31535);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1o9io9ile6rjd41.R.inc(31536);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1o9io9ile6rjd41.R.inc(31537);oos.writeObject(test);
        __CLR4_4_1o9io9ile6rjd41.R.inc(31538);oos.close();
        
        __CLR4_4_1o9io9ile6rjd41.R.inc(31539);ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        __CLR4_4_1o9io9ile6rjd41.R.inc(31540);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1o9io9ile6rjd41.R.inc(31541);Object obj = ois.readObject();
        __CLR4_4_1o9io9ile6rjd41.R.inc(31542);ois.close();
        
        __CLR4_4_1o9io9ile6rjd41.R.inc(31543);if ((((same)&&(__CLR4_4_1o9io9ile6rjd41.R.iget(31544)!=0|true))||(__CLR4_4_1o9io9ile6rjd41.R.iget(31545)==0&false))) {{
            __CLR4_4_1o9io9ile6rjd41.R.inc(31546);assertSame(test, obj);
        } }else {{
            __CLR4_4_1o9io9ile6rjd41.R.inc(31547);assertEquals(test, obj);
        }
    }}finally{__CLR4_4_1o9io9ile6rjd41.R.flushNeeded();}}

//    //-----------------------------------------------------------------------
//    public void testStoreSerializedInstant() throws Exception {
//        Instant test = new Instant();
//        store(test, "Instant.dat");
//    }
//
//    public void testStoreSerializedDateTime() throws Exception {
//        DateTime test = new DateTime();
//        store(test, "DateTime.dat");
//    }
//
//    public void testStoreSerializedMutableDateTime() throws Exception {
//        MutableDateTime test = new MutableDateTime();
//        store(test, "MutableDateTime.dat");
//    }
//
//    public void testStoreSerializedDateMidnight() throws Exception {
//        DateMidnight test = new DateMidnight();
//        store(test, "DateMidnight.dat");
//    }
//
//    public void testStoreSerializedLocalDate() throws Exception {
//        LocalDate test = new LocalDate();
//        store(test, "LocalDate.dat");
//    }
//
//    public void testStoreSerializedLocalDateBuddhist() throws Exception {
//        LocalDate test = new LocalDate(BuddhistChronology.getInstanceUTC());
//        store(test, "LocalDateBuddhist.dat");
//    }
//
//    public void testStoreSerializedLocalTime() throws Exception {
//        LocalTime test = new LocalTime();
//        store(test, "LocalTime.dat");
//    }
//
//    public void testStoreSerializedLocalDateTime() throws Exception {
//        LocalDateTime test = new LocalDateTime();
//        store(test, "LocalDateTime.dat");
//    }
//
//    public void testStoreSerializedYearMonthDay() throws Exception {
//        YearMonthDay test = new YearMonthDay();
//        store(test, "YearMonthDay.dat");
//    }
//
//    public void testStoreSerializedYearMonthDayProperty() throws Exception {
//        YearMonthDay.Property test = new YearMonthDay().monthOfYear();
//        store(test, "YearMonthDayProperty.dat");
//    }
//
//    public void testStoreSerializedTimeOfDay() throws Exception {
//        TimeOfDay test = new TimeOfDay();
//        store(test, "TimeOfDay.dat");
//    }
//
//    public void testStoreSerializedTimeOfDayProperty() throws Exception {
//        TimeOfDay.Property test = new TimeOfDay().hourOfDay();
//        store(test, "TimeOfDayProperty.dat");
//    }
//
//    public void testStoreSerializedDateTimeZoneUTC() throws Exception {
//        DateTimeZone test = DateTimeZone.UTC;
//        store(test, "DateTimeZoneUTC.dat");
//    }
//
//    public void testStoreSerializedDateTimeZone() throws Exception {
//        DateTimeZone test = PARIS;
//        store(test, "DateTimeZone.dat");
//    }
//
//    public void testStoreSerializedCopticChronology() throws Exception {
//        CopticChronology test = CopticChronology.getInstance(LONDON);
//        store(test, "CopticChronology.dat");
//    }
//
//    public void testStoreSerializedISOChronology() throws Exception {
//        ISOChronology test = ISOChronology.getInstance(PARIS);
//        store(test, "ISOChronology.dat");
//    }
//
//    public void testStoreSerializedGJChronology() throws Exception {
//        GJChronology test = GJChronology.getInstance(TOKYO);
//        store(test, "GJChronology.dat");
//    }
//
//    // Format changed in v1.2 - min days in first week not deserialized in v1.0/1.1
//    public void testStoreSerializedGJChronologyChangedInternals() throws Exception {
//        GJChronology test = GJChronology.getInstance(PARIS, 123L, 2);
//        store(test, "GJChronologyChangedInternals.dat");
//    }
//
//    public void testStoreSerializedGregorianChronology() throws Exception {
//        GregorianChronology test = GregorianChronology.getInstance(PARIS);
//        store(test, "GregorianChronology.dat");
//    }
//
//    public void testStoreSerializedJulianChronology() throws Exception {
//        JulianChronology test = JulianChronology.getInstance(PARIS);
//        store(test, "JulianChronology.dat");
//    }
//
//    public void testStoreSerializedBuddhistChronology() throws Exception {
//        BuddhistChronology test = BuddhistChronology.getInstance(PARIS);
//        store(test, "BuddhistChronology.dat");
//    }
//
//    public void testStoreSerializedPeriodType() throws Exception {
//        PeriodType test = PeriodType.dayTime();
//        store(test, "PeriodType.dat");
//    }
//
//    public void testStoreSerializedDateTimeFieldType() throws Exception {
//        DateTimeFieldType test = DateTimeFieldType.clockhourOfDay();
//        store(test, "DateTimeFieldType.dat");
//    }
//
//    public void testStoreSerializedUnsupportedDateTimeField() throws Exception {
//        UnsupportedDateTimeField test = UnsupportedDateTimeField.getInstance(
//                DateTimeFieldType.year(),
//                UnsupportedDurationField.getInstance(DurationFieldType.years()));
//        store(test, "UnsupportedDateTimeField.dat");
//    }
//
//    public void testStoreSerializedDurationFieldType() throws Exception {
//        DurationFieldType test = DurationFieldType.MINUTES_TYPE;
//        store(test, "DurationFieldType.dat");
//    }
//
//    public void testStoreSerializedMillisDurationField() throws Exception {
//        MillisDurationField test = (MillisDurationField) MillisDurationField.INSTANCE;
//        store(test, "MillisDurationField.dat");
//    }
//
//    public void testStoreSerializedDelegatedDurationField() throws Exception {
//        DelegatedDurationField test = new MockDelegatedDurationField();
//        store(test, "DelegatedDurationField.dat");
//    }
//
//    public void testStoreSerializedUnsupportedDurationField() throws Exception {
//        UnsupportedDurationField test = UnsupportedDurationField.getInstance(DurationFieldType.eras());
//        store(test, "UnsupportedDurationField.dat");
//    }
//
    // format changed (properly defined) in v1.1
//    public void testStoreSerializedDateTimeProperty() throws Exception {
//        DateTime.Property test = new DateTime().hourOfDay();
//        store(test, "DateTimeProperty.dat");
//    }
//
//    public void testStoreSerializedMutableDateTimeProperty() throws Exception {
//        MutableDateTime.Property test = new MutableDateTime().hourOfDay();
//        store(test, "MutableDateTimeProperty.dat");
//    }
//
//    public void testStoreSerializedDateMidnightProperty() throws Exception {
//        DateMidnight.Property test = new DateMidnight().monthOfYear();
//        store(test, "DateMidnightProperty.dat");
//    }
//
//    public void testStoreSerializedDateMidnightProperty() throws Exception {
//        Duration test = Duration.millis(12345);
//        store(test, "Duration.dat");
//    }

//    private void store(Serializable test, String filename) throws Exception {
//        FileOutputStream fos = new FileOutputStream("src/test/resources/" + filename);
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        try {
//            oos.writeObject(test);
//        } finally {
//            oos.close();
//        }
//        oos.close();
//    }

}
