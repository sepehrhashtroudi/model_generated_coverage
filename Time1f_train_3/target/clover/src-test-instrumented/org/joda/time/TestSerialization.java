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
public class TestSerialization extends TestCase {static class __CLR4_4_1o5jo5jle6rcm1s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,31409,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1o5jo5jle6rcm1s.R.inc(31303);
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31304);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1o5jo5jle6rcm1s.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1o5jo5jle6rcm1s.R.inc(31305);
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31306);return new TestSuite(TestSerialization.class);
    }finally{__CLR4_4_1o5jo5jle6rcm1s.R.flushNeeded();}}

    public TestSerialization(String name) {
        super(name);__CLR4_4_1o5jo5jle6rcm1s.R.inc(31308);try{__CLR4_4_1o5jo5jle6rcm1s.R.inc(31307);
    }finally{__CLR4_4_1o5jo5jle6rcm1s.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1o5jo5jle6rcm1s.R.inc(31309);
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31310);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31311);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31312);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31313);originalLocale = Locale.getDefault();
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31314);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31315);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31316);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1o5jo5jle6rcm1s.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1o5jo5jle6rcm1s.R.inc(31317);
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31318);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31319);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31320);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31321);Locale.setDefault(originalLocale);
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31322);originalDateTimeZone = null;
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31323);originalTimeZone = null;
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31324);originalLocale = null;
    }finally{__CLR4_4_1o5jo5jle6rcm1s.R.flushNeeded();}}

    //-----------------------------------------------------------------------

@SuppressWarnings("deprecation") 
 public void testSerializedYearMonthDay18() throws Exception {__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceStart(getClass().getName(),31325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vhe5fo65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o5jo5jle6rcm1s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedYearMonthDay18",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31325,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vhe5fo65() throws Exception{try{__CLR4_4_1o5jo5jle6rcm1s.R.inc(31325); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31326);YearMonthDay test = new YearMonthDay(); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31327);loadAndCompare(test, "YearMonthDay", false); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31328);inlineCompare(test, false); 
 }finally{__CLR4_4_1o5jo5jle6rcm1s.R.flushNeeded();}} 


public void testSerializedGJChronologyChangedInternals109() throws Exception {__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceStart(getClass().getName(),31329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uvfv5eo69();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o5jo5jle6rcm1s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedGJChronologyChangedInternals109",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31329,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uvfv5eo69() throws Exception{try{__CLR4_4_1o5jo5jle6rcm1s.R.inc(31329); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31330);GJChronology test = GJChronology.getInstance(PARIS, 123L, 2); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31331);loadAndCompare(test, "GJChronologyChangedInternals", true); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31332);inlineCompare(test, true); 
 }finally{__CLR4_4_1o5jo5jle6rcm1s.R.flushNeeded();}} 


public void testSerializedGJChronology121() throws Exception {__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceStart(getClass().getName(),31333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f9iq06o6d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o5jo5jle6rcm1s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedGJChronology121",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31333,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f9iq06o6d() throws Exception{try{__CLR4_4_1o5jo5jle6rcm1s.R.inc(31333); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31334);GJChronology test = GJChronology.getInstance(TOKYO); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31335);loadAndCompare(test, "GJChronology", true); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31336);inlineCompare(test, true); 
 }finally{__CLR4_4_1o5jo5jle6rcm1s.R.flushNeeded();}} 


public void testDuration232() throws Exception {__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceStart(getClass().getName(),31337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5pma6o6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o5jo5jle6rcm1s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testDuration232",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31337,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5pma6o6h() throws Exception{try{__CLR4_4_1o5jo5jle6rcm1s.R.inc(31337); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31338);Duration test = Duration.millis(12345); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31339);loadAndCompare(test, "Duration", false); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31340);inlineCompare(test, false); 
 }finally{__CLR4_4_1o5jo5jle6rcm1s.R.flushNeeded();}} 


public void testSerializedCopticChronology311() throws Exception {__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceStart(getClass().getName(),31341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b6hodeo6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o5jo5jle6rcm1s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedCopticChronology311",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31341,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b6hodeo6l() throws Exception{try{__CLR4_4_1o5jo5jle6rcm1s.R.inc(31341); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31342);CopticChronology test = CopticChronology.getInstance(LONDON); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31343);loadAndCompare(test, "CopticChronology", true); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31344);inlineCompare(test, true); 
 }finally{__CLR4_4_1o5jo5jle6rcm1s.R.flushNeeded();}} 


public void testSerializedJulianChronology420() throws Exception {__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceStart(getClass().getName(),31345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12a8h56o6p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o5jo5jle6rcm1s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedJulianChronology420",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31345,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12a8h56o6p() throws Exception{try{__CLR4_4_1o5jo5jle6rcm1s.R.inc(31345); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31346);JulianChronology test = JulianChronology.getInstance(PARIS); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31347);loadAndCompare(test, "JulianChronology", true); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31348);inlineCompare(test, true); 
 }finally{__CLR4_4_1o5jo5jle6rcm1s.R.flushNeeded();}} 


public void testSerializedLocalDateBuddhist492() throws Exception {__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceStart(getClass().getName(),31349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e9sxa4o6t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o5jo5jle6rcm1s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedLocalDateBuddhist492",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e9sxa4o6t() throws Exception{try{__CLR4_4_1o5jo5jle6rcm1s.R.inc(31349); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31350);LocalDate test = new LocalDate(BuddhistChronology.getInstanceUTC()); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31351);loadAndCompare(test, "LocalDateBuddhist", false); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31352);inlineCompare(test, false); 
 }finally{__CLR4_4_1o5jo5jle6rcm1s.R.flushNeeded();}} 


public void testSerializedDateTimeProperty626() throws Exception {__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceStart(getClass().getName(),31353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vuz7mto6x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o5jo5jle6rcm1s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedDateTimeProperty626",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31353,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vuz7mto6x() throws Exception{try{__CLR4_4_1o5jo5jle6rcm1s.R.inc(31353); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31354);DateTime.Property test = new DateTime().hourOfDay(); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31355);loadAndCompare(test, "DateTimeProperty", false); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31356);inlineCompare(test, false); 
 }finally{__CLR4_4_1o5jo5jle6rcm1s.R.flushNeeded();}} 


public void testSerializedPeriodType764() throws Exception {__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceStart(getClass().getName(),31357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_188gnmdo71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o5jo5jle6rcm1s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedPeriodType764",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31357,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_188gnmdo71() throws Exception{try{__CLR4_4_1o5jo5jle6rcm1s.R.inc(31357); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31358);PeriodType test = PeriodType.dayTime(); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31359);loadAndCompare(test, "PeriodType", false); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31360);inlineCompare(test, false); 
 }finally{__CLR4_4_1o5jo5jle6rcm1s.R.flushNeeded();}} 


public void testSerializedUnsupportedDateTimeField924() throws Exception {__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceStart(getClass().getName(),31361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17jd8keo75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o5jo5jle6rcm1s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedUnsupportedDateTimeField924",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31361,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17jd8keo75() throws Exception{try{__CLR4_4_1o5jo5jle6rcm1s.R.inc(31361); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31362);UnsupportedDateTimeField test = UnsupportedDateTimeField.getInstance(DateTimeFieldType.year(), UnsupportedDurationField.getInstance(DurationFieldType.years())); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31363);loadAndCompare(test, "UnsupportedDateTimeField", true); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31364);inlineCompare(test, true); 
 }finally{__CLR4_4_1o5jo5jle6rcm1s.R.flushNeeded();}} 


public void testSerializedLocalTime950() throws Exception {__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceStart(getClass().getName(),31365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mohftzo79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o5jo5jle6rcm1s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedLocalTime950",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mohftzo79() throws Exception{try{__CLR4_4_1o5jo5jle6rcm1s.R.inc(31365); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31366);LocalTime test = new LocalTime(); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31367);loadAndCompare(test, "LocalTime", false); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31368);inlineCompare(test, false); 
 }finally{__CLR4_4_1o5jo5jle6rcm1s.R.flushNeeded();}} 


public void testSerializedMutableDateTimeProperty1061() throws Exception {__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceStart(getClass().getName(),31369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cqddpbo7d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o5jo5jle6rcm1s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedMutableDateTimeProperty1061",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cqddpbo7d() throws Exception{try{__CLR4_4_1o5jo5jle6rcm1s.R.inc(31369); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31370);MutableDateTime.Property test = new MutableDateTime().hourOfDay(); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31371);loadAndCompare(test, "MutableDateTimeProperty", false); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31372);inlineCompare(test, false); 
 }finally{__CLR4_4_1o5jo5jle6rcm1s.R.flushNeeded();}} 


public void testSerializedLocalDateTime1295() throws Exception {__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceStart(getClass().getName(),31373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r85qvgo7h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o5jo5jle6rcm1s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedLocalDateTime1295",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31373,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r85qvgo7h() throws Exception{try{__CLR4_4_1o5jo5jle6rcm1s.R.inc(31373); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31374);LocalDateTime test = new LocalDateTime(); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31375);loadAndCompare(test, "LocalDateTime", false); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31376);inlineCompare(test, false); 
 }finally{__CLR4_4_1o5jo5jle6rcm1s.R.flushNeeded();}} 


public void testSerializedDateTimeFieldType1383() throws Exception {__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceStart(getClass().getName(),31377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j6afd3o7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o5jo5jle6rcm1s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedDateTimeFieldType1383",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31377,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j6afd3o7l() throws Exception{try{__CLR4_4_1o5jo5jle6rcm1s.R.inc(31377); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31378);DateTimeFieldType test = DateTimeFieldType.clockhourOfDay(); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31379);loadAndCompare(test, "DateTimeFieldType", true); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31380);inlineCompare(test, true); 
 }finally{__CLR4_4_1o5jo5jle6rcm1s.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testSerializedDateMidnightProperty1462() throws Exception {__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceStart(getClass().getName(),31381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14gkvv3o7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o5jo5jle6rcm1s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o5jo5jle6rcm1s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedDateMidnightProperty1462",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31381,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14gkvv3o7p() throws Exception{try{__CLR4_4_1o5jo5jle6rcm1s.R.inc(31381); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31382);DateMidnight.Property test = new DateMidnight().monthOfYear(); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31383);loadAndCompare(test, "DateMidnightProperty", false); 
     __CLR4_4_1o5jo5jle6rcm1s.R.inc(31384);inlineCompare(test, false); 
 }finally{__CLR4_4_1o5jo5jle6rcm1s.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    private void loadAndCompare(Serializable test, String filename, boolean same) throws Exception {try{__CLR4_4_1o5jo5jle6rcm1s.R.inc(31385);
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31386);FileInputStream fis = new FileInputStream("src/test/resources/" + filename + ".dat");
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31387);ObjectInputStream ois = new ObjectInputStream(fis);
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31388);Object obj = ois.readObject();
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31389);ois.close();
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31390);if ((((same)&&(__CLR4_4_1o5jo5jle6rcm1s.R.iget(31391)!=0|true))||(__CLR4_4_1o5jo5jle6rcm1s.R.iget(31392)==0&false))) {{
            __CLR4_4_1o5jo5jle6rcm1s.R.inc(31393);assertSame(test, obj);
        } }else {{
            __CLR4_4_1o5jo5jle6rcm1s.R.inc(31394);assertEquals(test, obj);
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
    }}finally{__CLR4_4_1o5jo5jle6rcm1s.R.flushNeeded();}}

    public void inlineCompare(Serializable test, boolean same) throws Exception {try{__CLR4_4_1o5jo5jle6rcm1s.R.inc(31395);
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31396);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31397);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31398);oos.writeObject(test);
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31399);oos.close();
        
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31400);ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31401);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31402);Object obj = ois.readObject();
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31403);ois.close();
        
        __CLR4_4_1o5jo5jle6rcm1s.R.inc(31404);if ((((same)&&(__CLR4_4_1o5jo5jle6rcm1s.R.iget(31405)!=0|true))||(__CLR4_4_1o5jo5jle6rcm1s.R.iget(31406)==0&false))) {{
            __CLR4_4_1o5jo5jle6rcm1s.R.inc(31407);assertSame(test, obj);
        } }else {{
            __CLR4_4_1o5jo5jle6rcm1s.R.inc(31408);assertEquals(test, obj);
        }
    }}finally{__CLR4_4_1o5jo5jle6rcm1s.R.flushNeeded();}}

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
