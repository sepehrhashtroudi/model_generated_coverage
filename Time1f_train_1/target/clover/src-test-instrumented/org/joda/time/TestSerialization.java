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
public class TestSerialization extends TestCase {static class __CLR4_4_1oa4oa4le6qea5l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,31574,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1oa4oa4le6qea5l.R.inc(31468);
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31469);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1oa4oa4le6qea5l.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1oa4oa4le6qea5l.R.inc(31470);
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31471);return new TestSuite(TestSerialization.class);
    }finally{__CLR4_4_1oa4oa4le6qea5l.R.flushNeeded();}}

    public TestSerialization(String name) {
        super(name);__CLR4_4_1oa4oa4le6qea5l.R.inc(31473);try{__CLR4_4_1oa4oa4le6qea5l.R.inc(31472);
    }finally{__CLR4_4_1oa4oa4le6qea5l.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1oa4oa4le6qea5l.R.inc(31474);
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31475);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31476);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31477);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31478);originalLocale = Locale.getDefault();
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31479);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31480);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31481);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1oa4oa4le6qea5l.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1oa4oa4le6qea5l.R.inc(31482);
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31483);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31484);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31485);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31486);Locale.setDefault(originalLocale);
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31487);originalDateTimeZone = null;
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31488);originalTimeZone = null;
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31489);originalLocale = null;
    }finally{__CLR4_4_1oa4oa4le6qea5l.R.flushNeeded();}}

    //-----------------------------------------------------------------------

@SuppressWarnings("deprecation") 
 public void testSerializedYearMonthDay22() throws Exception {__CLR4_4_1oa4oa4le6qea5l.R.globalSliceStart(getClass().getName(),31490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18cdpnaoaq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa4oa4le6qea5l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa4oa4le6qea5l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedYearMonthDay22",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31490,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18cdpnaoaq() throws Exception{try{__CLR4_4_1oa4oa4le6qea5l.R.inc(31490); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31491);YearMonthDay test = new YearMonthDay(); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31492);loadAndCompare(test, "YearMonthDay", false); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31493);inlineCompare(test, false); 
 }finally{__CLR4_4_1oa4oa4le6qea5l.R.flushNeeded();}} 


public void testSerializedGJChronologyChangedInternals115() throws Exception {__CLR4_4_1oa4oa4le6qea5l.R.globalSliceStart(getClass().getName(),31494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e5ktrroau();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa4oa4le6qea5l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa4oa4le6qea5l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedGJChronologyChangedInternals115",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e5ktrroau() throws Exception{try{__CLR4_4_1oa4oa4le6qea5l.R.inc(31494); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31495);GJChronology test = GJChronology.getInstance(PARIS, 123L, 2); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31496);loadAndCompare(test, "GJChronologyChangedInternals", true); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31497);inlineCompare(test, true); 
 }finally{__CLR4_4_1oa4oa4le6qea5l.R.flushNeeded();}} 


public void testSerializedGJChronology126() throws Exception {__CLR4_4_1oa4oa4le6qea5l.R.globalSliceStart(getClass().getName(),31498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1viijyjoay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa4oa4le6qea5l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa4oa4le6qea5l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedGJChronology126",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1viijyjoay() throws Exception{try{__CLR4_4_1oa4oa4le6qea5l.R.inc(31498); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31499);GJChronology test = GJChronology.getInstance(TOKYO); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31500);loadAndCompare(test, "GJChronology", true); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31501);inlineCompare(test, true); 
 }finally{__CLR4_4_1oa4oa4le6qea5l.R.flushNeeded();}} 


public void testDuration232() throws Exception {__CLR4_4_1oa4oa4le6qea5l.R.globalSliceStart(getClass().getName(),31502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5pma6ob2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa4oa4le6qea5l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa4oa4le6qea5l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testDuration232",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31502,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5pma6ob2() throws Exception{try{__CLR4_4_1oa4oa4le6qea5l.R.inc(31502); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31503);Duration test = Duration.millis(12345); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31504);loadAndCompare(test, "Duration", false); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31505);inlineCompare(test, false); 
 }finally{__CLR4_4_1oa4oa4le6qea5l.R.flushNeeded();}} 


public void testSerializedISOChronology287() throws Exception {__CLR4_4_1oa4oa4le6qea5l.R.globalSliceStart(getClass().getName(),31506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_158ix8vob6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa4oa4le6qea5l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa4oa4le6qea5l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedISOChronology287",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_158ix8vob6() throws Exception{try{__CLR4_4_1oa4oa4le6qea5l.R.inc(31506); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31507);ISOChronology test = ISOChronology.getInstance(PARIS); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31508);loadAndCompare(test, "ISOChronology", true); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31509);inlineCompare(test, true); 
 }finally{__CLR4_4_1oa4oa4le6qea5l.R.flushNeeded();}} 


public void testSerializedCopticChronology299() throws Exception {__CLR4_4_1oa4oa4le6qea5l.R.globalSliceStart(getClass().getName(),31510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1728vzzoba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa4oa4le6qea5l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa4oa4le6qea5l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedCopticChronology299",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31510,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1728vzzoba() throws Exception{try{__CLR4_4_1oa4oa4le6qea5l.R.inc(31510); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31511);CopticChronology test = CopticChronology.getInstance(LONDON); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31512);loadAndCompare(test, "CopticChronology", true); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31513);inlineCompare(test, true); 
 }finally{__CLR4_4_1oa4oa4le6qea5l.R.flushNeeded();}} 


public void testSerializedJulianChronology412() throws Exception {__CLR4_4_1oa4oa4le6qea5l.R.globalSliceStart(getClass().getName(),31514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pi3g3robe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa4oa4le6qea5l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa4oa4le6qea5l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedJulianChronology412",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pi3g3robe() throws Exception{try{__CLR4_4_1oa4oa4le6qea5l.R.inc(31514); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31515);JulianChronology test = JulianChronology.getInstance(PARIS); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31516);loadAndCompare(test, "JulianChronology", true); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31517);inlineCompare(test, true); 
 }finally{__CLR4_4_1oa4oa4le6qea5l.R.flushNeeded();}} 


public void testSerializedBuddhistChronology421() throws Exception {__CLR4_4_1oa4oa4le6qea5l.R.globalSliceStart(getClass().getName(),31518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y5b5k9obi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa4oa4le6qea5l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa4oa4le6qea5l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedBuddhistChronology421",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y5b5k9obi() throws Exception{try{__CLR4_4_1oa4oa4le6qea5l.R.inc(31518); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31519);BuddhistChronology test = BuddhistChronology.getInstance(PARIS); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31520);loadAndCompare(test, "BuddhistChronology", true); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31521);inlineCompare(test, true); 
 }finally{__CLR4_4_1oa4oa4le6qea5l.R.flushNeeded();}} 


public void testSerializedLocalDateBuddhist481() throws Exception {__CLR4_4_1oa4oa4le6qea5l.R.globalSliceStart(getClass().getName(),31522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ip1y1wobm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa4oa4le6qea5l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa4oa4le6qea5l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedLocalDateBuddhist481",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31522,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ip1y1wobm() throws Exception{try{__CLR4_4_1oa4oa4le6qea5l.R.inc(31522); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31523);LocalDate test = new LocalDate(BuddhistChronology.getInstanceUTC()); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31524);loadAndCompare(test, "LocalDateBuddhist", false); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31525);inlineCompare(test, false); 
 }finally{__CLR4_4_1oa4oa4le6qea5l.R.flushNeeded();}} 


public void testSerializedPeriodType765() throws Exception {__CLR4_4_1oa4oa4le6qea5l.R.globalSliceStart(getClass().getName(),31526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14zgotwobq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa4oa4le6qea5l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa4oa4le6qea5l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedPeriodType765",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14zgotwobq() throws Exception{try{__CLR4_4_1oa4oa4le6qea5l.R.inc(31526); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31527);PeriodType test = PeriodType.dayTime(); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31528);loadAndCompare(test, "PeriodType", false); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31529);inlineCompare(test, false); 
 }finally{__CLR4_4_1oa4oa4le6qea5l.R.flushNeeded();}} 


public void testSerializedGregorianChronology912() throws Exception {__CLR4_4_1oa4oa4le6qea5l.R.globalSliceStart(getClass().getName(),31530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w4wcyvobu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa4oa4le6qea5l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa4oa4le6qea5l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedGregorianChronology912",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31530,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w4wcyvobu() throws Exception{try{__CLR4_4_1oa4oa4le6qea5l.R.inc(31530); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31531);GregorianChronology test = GregorianChronology.getInstance(PARIS); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31532);loadAndCompare(test, "GregorianChronology", true); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31533);inlineCompare(test, true); 
 }finally{__CLR4_4_1oa4oa4le6qea5l.R.flushNeeded();}} 


public void testSerializedUnsupportedDateTimeField935() throws Exception {__CLR4_4_1oa4oa4le6qea5l.R.globalSliceStart(getClass().getName(),31534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pfhmrmoby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa4oa4le6qea5l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa4oa4le6qea5l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedUnsupportedDateTimeField935",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pfhmrmoby() throws Exception{try{__CLR4_4_1oa4oa4le6qea5l.R.inc(31534); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31535);UnsupportedDateTimeField test = UnsupportedDateTimeField.getInstance(DateTimeFieldType.year(), UnsupportedDurationField.getInstance(DurationFieldType.years())); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31536);loadAndCompare(test, "UnsupportedDateTimeField", true); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31537);inlineCompare(test, true); 
 }finally{__CLR4_4_1oa4oa4le6qea5l.R.flushNeeded();}} 


public void testSerializedMutableDateTimeProperty1070() throws Exception {__CLR4_4_1oa4oa4le6qea5l.R.globalSliceStart(getClass().getName(),31538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dqhk1roc2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa4oa4le6qea5l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa4oa4le6qea5l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedMutableDateTimeProperty1070",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31538,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dqhk1roc2() throws Exception{try{__CLR4_4_1oa4oa4le6qea5l.R.inc(31538); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31539);MutableDateTime.Property test = new MutableDateTime().hourOfDay(); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31540);loadAndCompare(test, "MutableDateTimeProperty", false); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31541);inlineCompare(test, false); 
 }finally{__CLR4_4_1oa4oa4le6qea5l.R.flushNeeded();}} 


public void testSerializedDateTimeFieldType1381() throws Exception {__CLR4_4_1oa4oa4le6qea5l.R.globalSliceStart(getClass().getName(),31542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1coahs5oc6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa4oa4le6qea5l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa4oa4le6qea5l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedDateTimeFieldType1381",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1coahs5oc6() throws Exception{try{__CLR4_4_1oa4oa4le6qea5l.R.inc(31542); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31543);DateTimeFieldType test = DateTimeFieldType.clockhourOfDay(); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31544);loadAndCompare(test, "DateTimeFieldType", true); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31545);inlineCompare(test, true); 
 }finally{__CLR4_4_1oa4oa4le6qea5l.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testSerializedDateMidnightProperty1462() throws Exception {__CLR4_4_1oa4oa4le6qea5l.R.globalSliceStart(getClass().getName(),31546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14gkvv3oca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oa4oa4le6qea5l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oa4oa4le6qea5l.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedDateMidnightProperty1462",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14gkvv3oca() throws Exception{try{__CLR4_4_1oa4oa4le6qea5l.R.inc(31546); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31547);DateMidnight.Property test = new DateMidnight().monthOfYear(); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31548);loadAndCompare(test, "DateMidnightProperty", false); 
     __CLR4_4_1oa4oa4le6qea5l.R.inc(31549);inlineCompare(test, false); 
 }finally{__CLR4_4_1oa4oa4le6qea5l.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    private void loadAndCompare(Serializable test, String filename, boolean same) throws Exception {try{__CLR4_4_1oa4oa4le6qea5l.R.inc(31550);
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31551);FileInputStream fis = new FileInputStream("src/test/resources/" + filename + ".dat");
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31552);ObjectInputStream ois = new ObjectInputStream(fis);
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31553);Object obj = ois.readObject();
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31554);ois.close();
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31555);if ((((same)&&(__CLR4_4_1oa4oa4le6qea5l.R.iget(31556)!=0|true))||(__CLR4_4_1oa4oa4le6qea5l.R.iget(31557)==0&false))) {{
            __CLR4_4_1oa4oa4le6qea5l.R.inc(31558);assertSame(test, obj);
        } }else {{
            __CLR4_4_1oa4oa4le6qea5l.R.inc(31559);assertEquals(test, obj);
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
    }}finally{__CLR4_4_1oa4oa4le6qea5l.R.flushNeeded();}}

    public void inlineCompare(Serializable test, boolean same) throws Exception {try{__CLR4_4_1oa4oa4le6qea5l.R.inc(31560);
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31561);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31562);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31563);oos.writeObject(test);
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31564);oos.close();
        
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31565);ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31566);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31567);Object obj = ois.readObject();
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31568);ois.close();
        
        __CLR4_4_1oa4oa4le6qea5l.R.inc(31569);if ((((same)&&(__CLR4_4_1oa4oa4le6qea5l.R.iget(31570)!=0|true))||(__CLR4_4_1oa4oa4le6qea5l.R.iget(31571)==0&false))) {{
            __CLR4_4_1oa4oa4le6qea5l.R.inc(31572);assertSame(test, obj);
        } }else {{
            __CLR4_4_1oa4oa4le6qea5l.R.inc(31573);assertEquals(test, obj);
        }
    }}finally{__CLR4_4_1oa4oa4le6qea5l.R.flushNeeded();}}

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
