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
public class TestYearMonth_Basics extends TestCase {static class __CLR4_4_1k0dk0dle6o7a38{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,25984,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1k0dk0dle6o7a38.R.inc(25933);
        __CLR4_4_1k0dk0dle6o7a38.R.inc(25934);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1k0dk0dle6o7a38.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1k0dk0dle6o7a38.R.inc(25935);
        __CLR4_4_1k0dk0dle6o7a38.R.inc(25936);return new TestSuite(TestYearMonth_Basics.class);
    }finally{__CLR4_4_1k0dk0dle6o7a38.R.flushNeeded();}}

    public TestYearMonth_Basics(String name) {
        super(name);__CLR4_4_1k0dk0dle6o7a38.R.inc(25938);try{__CLR4_4_1k0dk0dle6o7a38.R.inc(25937);
    }finally{__CLR4_4_1k0dk0dle6o7a38.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1k0dk0dle6o7a38.R.inc(25939);
        __CLR4_4_1k0dk0dle6o7a38.R.inc(25940);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1k0dk0dle6o7a38.R.inc(25941);zone = DateTimeZone.getDefault();
        __CLR4_4_1k0dk0dle6o7a38.R.inc(25942);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1k0dk0dle6o7a38.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1k0dk0dle6o7a38.R.inc(25943);
        __CLR4_4_1k0dk0dle6o7a38.R.inc(25944);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1k0dk0dle6o7a38.R.inc(25945);DateTimeZone.setDefault(zone);
        __CLR4_4_1k0dk0dle6o7a38.R.inc(25946);zone = null;
    }finally{__CLR4_4_1k0dk0dle6o7a38.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testWithChronologyRetainFields_nullChrono147() {__CLR4_4_1k0dk0dle6o7a38.R.globalSliceStart(getClass().getName(),25947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t1q45ck0r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k0dk0dle6o7a38.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k0dk0dle6o7a38.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithChronologyRetainFields_nullChrono147",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25947,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t1q45ck0r(){try{__CLR4_4_1k0dk0dle6o7a38.R.inc(25947); 
     __CLR4_4_1k0dk0dle6o7a38.R.inc(25948);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); 
     __CLR4_4_1k0dk0dle6o7a38.R.inc(25949);YearMonth test = base.withChronologyRetainFields(null); 
     __CLR4_4_1k0dk0dle6o7a38.R.inc(25950);check(base, 2005, 6); 
     __CLR4_4_1k0dk0dle6o7a38.R.inc(25951);assertEquals(COPTIC_UTC, base.getChronology()); 
     __CLR4_4_1k0dk0dle6o7a38.R.inc(25952);check(test, 2005, 6); 
     __CLR4_4_1k0dk0dle6o7a38.R.inc(25953);assertEquals(ISO_UTC, test.getChronology()); 
 }finally{__CLR4_4_1k0dk0dle6o7a38.R.flushNeeded();}}
public void testWithChronologyRetainFields_sameChrono148() {__CLR4_4_1k0dk0dle6o7a38.R.globalSliceStart(getClass().getName(),25954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xcyj7ik0y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k0dk0dle6o7a38.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k0dk0dle6o7a38.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithChronologyRetainFields_sameChrono148",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xcyj7ik0y(){try{__CLR4_4_1k0dk0dle6o7a38.R.inc(25954); 
     __CLR4_4_1k0dk0dle6o7a38.R.inc(25955);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); 
     __CLR4_4_1k0dk0dle6o7a38.R.inc(25956);YearMonth test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     __CLR4_4_1k0dk0dle6o7a38.R.inc(25957);assertSame(base, test); 
 }finally{__CLR4_4_1k0dk0dle6o7a38.R.flushNeeded();}}
public void testProperty149() {__CLR4_4_1k0dk0dle6o7a38.R.globalSliceStart(getClass().getName(),25958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1749dsak12();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k0dk0dle6o7a38.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k0dk0dle6o7a38.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testProperty149",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1749dsak12(){try{__CLR4_4_1k0dk0dle6o7a38.R.inc(25958); 
     __CLR4_4_1k0dk0dle6o7a38.R.inc(25959);YearMonth test = new YearMonth(2005, 6); 
     __CLR4_4_1k0dk0dle6o7a38.R.inc(25960);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1k0dk0dle6o7a38.R.inc(25961);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1k0dk0dle6o7a38.R.inc(25962);try { 
         __CLR4_4_1k0dk0dle6o7a38.R.inc(25963);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1k0dk0dle6o7a38.R.inc(25964);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1k0dk0dle6o7a38.R.inc(25965);try { 
         __CLR4_4_1k0dk0dle6o7a38.R.inc(25966);test.property(null); 
         __CLR4_4_1k0dk0dle6o7a38.R.inc(25967);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1k0dk0dle6o7a38.R.flushNeeded();}}
public void testToString_String150() {__CLR4_4_1k0dk0dle6o7a38.R.globalSliceStart(getClass().getName(),25968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1isq8ypk1c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k0dk0dle6o7a38.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k0dk0dle6o7a38.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToString_String150",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25968,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1isq8ypk1c(){try{__CLR4_4_1k0dk0dle6o7a38.R.inc(25968); 
     __CLR4_4_1k0dk0dle6o7a38.R.inc(25969);YearMonth test = new YearMonth(2002, 6); 
     __CLR4_4_1k0dk0dle6o7a38.R.inc(25970);assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1k0dk0dle6o7a38.R.inc(25971);assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1k0dk0dle6o7a38.R.inc(25972);assertEquals("2002-06", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1k0dk0dle6o7a38.R.inc(25973);assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1k0dk0dle6o7a38.R.inc(25974);assertEquals("2002-06", test.toString(null, null)); 
 }finally{__CLR4_4_1k0dk0dle6o7a38.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    
    
    class MockYM extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1k0dk0dle6o7a38.R.inc(25975);
            __CLR4_4_1k0dk0dle6o7a38.R.inc(25976);return COPTIC_UTC;
        }finally{__CLR4_4_1k0dk0dle6o7a38.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1k0dk0dle6o7a38.R.inc(25977);
            __CLR4_4_1k0dk0dle6o7a38.R.inc(25978);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
            };
        }finally{__CLR4_4_1k0dk0dle6o7a38.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1k0dk0dle6o7a38.R.inc(25979);
            __CLR4_4_1k0dk0dle6o7a38.R.inc(25980);return new int[] {1970, 6};
        }finally{__CLR4_4_1k0dk0dle6o7a38.R.flushNeeded();}}
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
    private void check(YearMonth test, int year, int month) {try{__CLR4_4_1k0dk0dle6o7a38.R.inc(25981);
        __CLR4_4_1k0dk0dle6o7a38.R.inc(25982);assertEquals(year, test.getYear());
        __CLR4_4_1k0dk0dle6o7a38.R.inc(25983);assertEquals(month, test.getMonthOfYear());
    }finally{__CLR4_4_1k0dk0dle6o7a38.R.flushNeeded();}}
}
