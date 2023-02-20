/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
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
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for YearMonth.
 *
 * @author Stephen Colebourne
 */
public class TestYearMonth_Basics extends TestCase {static class __CLR4_4_1k06k06le6np4nd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,25984,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
//    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
//    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
//    private static final Chronology ISO_TOKYO = ISOChronology.getInstance(TOKYO);
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
//    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);
//    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1k06k06le6np4nd.R.inc(25926);
        __CLR4_4_1k06k06le6np4nd.R.inc(25927);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1k06k06le6np4nd.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1k06k06le6np4nd.R.inc(25928);
        __CLR4_4_1k06k06le6np4nd.R.inc(25929);return new TestSuite(TestYearMonth_Basics.class);
    }finally{__CLR4_4_1k06k06le6np4nd.R.flushNeeded();}}

    public TestYearMonth_Basics(String name) {
        super(name);__CLR4_4_1k06k06le6np4nd.R.inc(25931);try{__CLR4_4_1k06k06le6np4nd.R.inc(25930);
    }finally{__CLR4_4_1k06k06le6np4nd.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1k06k06le6np4nd.R.inc(25932);
        __CLR4_4_1k06k06le6np4nd.R.inc(25933);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1k06k06le6np4nd.R.inc(25934);zone = DateTimeZone.getDefault();
        __CLR4_4_1k06k06le6np4nd.R.inc(25935);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1k06k06le6np4nd.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1k06k06le6np4nd.R.inc(25936);
        __CLR4_4_1k06k06le6np4nd.R.inc(25937);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1k06k06le6np4nd.R.inc(25938);DateTimeZone.setDefault(zone);
        __CLR4_4_1k06k06le6np4nd.R.inc(25939);zone = null;
    }finally{__CLR4_4_1k06k06le6np4nd.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testWithField1133() {__CLR4_4_1k06k06le6np4nd.R.globalSliceStart(getClass().getName(),25940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v7uh3rk0k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k06k06le6np4nd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k06k06le6np4nd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithField1133",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v7uh3rk0k(){try{__CLR4_4_1k06k06le6np4nd.R.inc(25940); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25941);YearMonth test = new YearMonth(2004, 6); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25942);YearMonth result = test.withField(DateTimeFieldType.year(), 2006); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25943);assertEquals(new YearMonth(2004, 6), test); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25944);assertEquals(new YearMonth(2006, 6), result); 
 }finally{__CLR4_4_1k06k06le6np4nd.R.flushNeeded();}}
public void testWithField1134() {__CLR4_4_1k06k06le6np4nd.R.globalSliceStart(getClass().getName(),25945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ryuibak0p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k06k06le6np4nd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k06k06le6np4nd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithField1134",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ryuibak0p(){try{__CLR4_4_1k06k06le6np4nd.R.inc(25945); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25946);YearMonth test = new YearMonth(2004, 6); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25947);try { 
         __CLR4_4_1k06k06le6np4nd.R.inc(25948);test.withField(DateTimeFieldType.hourOfDay(), 6); 
         __CLR4_4_1k06k06le6np4nd.R.inc(25949);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1k06k06le6np4nd.R.flushNeeded();}}
public void testMinusYears_int135() {__CLR4_4_1k06k06le6np4nd.R.globalSliceStart(getClass().getName(),25950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c8m5cik0u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k06k06le6np4nd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k06k06le6np4nd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testMinusYears_int135",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25950,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c8m5cik0u(){try{__CLR4_4_1k06k06le6np4nd.R.inc(25950); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25951);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25952);YearMonth result = test.minusYears(1); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25953);YearMonth expected = new YearMonth(2001, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25954);assertEquals(expected, result); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25955);result = test.minusYears(0); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25956);assertSame(test, result); 
 }finally{__CLR4_4_1k06k06le6np4nd.R.flushNeeded();}}
public void testToString_DTFormatter136() {__CLR4_4_1k06k06le6np4nd.R.globalSliceStart(getClass().getName(),25957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12g6tk2k11();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k06k06le6np4nd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k06k06le6np4nd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToString_DTFormatter136",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25957,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12g6tk2k11(){try{__CLR4_4_1k06k06le6np4nd.R.inc(25957); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25958);YearMonth test = new YearMonth(2002, 6); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25959);assertEquals("2002 \ufffd\ufffd", test.toString(DateTimeFormat.forPattern("yyyy HH"))); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25960);assertEquals("2002-06", test.toString((DateTimeFormatter) null)); 
 }finally{__CLR4_4_1k06k06le6np4nd.R.flushNeeded();}}
public void testToString_String_Locale137() {__CLR4_4_1k06k06le6np4nd.R.globalSliceStart(getClass().getName(),25961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_114if6zk15();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k06k06le6np4nd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k06k06le6np4nd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToString_String_Locale137",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25961,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_114if6zk15(){try{__CLR4_4_1k06k06le6np4nd.R.inc(25961); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25962);YearMonth test = new YearMonth(1970, 6); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25963);assertEquals("Tue 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25964);assertEquals("mar. 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25965);assertEquals("1970-06", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25966);assertEquals("Tue 9/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25967);assertEquals("1970-06", test.toString(null, null)); 
 }finally{__CLR4_4_1k06k06le6np4nd.R.flushNeeded();}}
public void testToString_String_Locale138() {__CLR4_4_1k06k06le6np4nd.R.globalSliceStart(getClass().getName(),25968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_124hjlik1c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k06k06le6np4nd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k06k06le6np4nd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToString_String_Locale138",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25968,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_124hjlik1c(){try{__CLR4_4_1k06k06le6np4nd.R.inc(25968); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25969);YearMonth test = new YearMonth(2002, 6); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25970);assertEquals("\ufffd 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25971);assertEquals("\ufffd 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25972);assertEquals("2002-06", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25973);assertEquals("\ufffd 9/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1k06k06le6np4nd.R.inc(25974);assertEquals("2002-06", test.toString(null, null)); 
 }finally{__CLR4_4_1k06k06le6np4nd.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    
    
    class MockYM extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1k06k06le6np4nd.R.inc(25975);
            __CLR4_4_1k06k06le6np4nd.R.inc(25976);return COPTIC_UTC;
        }finally{__CLR4_4_1k06k06le6np4nd.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1k06k06le6np4nd.R.inc(25977);
            __CLR4_4_1k06k06le6np4nd.R.inc(25978);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
            };
        }finally{__CLR4_4_1k06k06le6np4nd.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1k06k06le6np4nd.R.inc(25979);
            __CLR4_4_1k06k06le6np4nd.R.inc(25980);return new int[] {1970, 6};
        }finally{__CLR4_4_1k06k06le6np4nd.R.flushNeeded();}}
    }

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
    

    //-----------------------------------------------------------------------
    private void check(YearMonth test, int year, int month) {try{__CLR4_4_1k06k06le6np4nd.R.inc(25981);
        __CLR4_4_1k06k06le6np4nd.R.inc(25982);assertEquals(year, test.getYear());
        __CLR4_4_1k06k06le6np4nd.R.inc(25983);assertEquals(month, test.getMonthOfYear());
    }finally{__CLR4_4_1k06k06le6np4nd.R.flushNeeded();}}
}
