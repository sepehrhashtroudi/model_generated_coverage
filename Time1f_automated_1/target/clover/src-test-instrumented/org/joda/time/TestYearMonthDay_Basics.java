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
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestYearMonthDay_Basics extends TestCase {static class __CLR4_4_1k8pk8ple6ndpuf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,26288,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1k8pk8ple6ndpuf.R.inc(26233);
        __CLR4_4_1k8pk8ple6ndpuf.R.inc(26234);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1k8pk8ple6ndpuf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1k8pk8ple6ndpuf.R.inc(26235);
        __CLR4_4_1k8pk8ple6ndpuf.R.inc(26236);return new TestSuite(TestYearMonthDay_Basics.class);
    }finally{__CLR4_4_1k8pk8ple6ndpuf.R.flushNeeded();}}

    public TestYearMonthDay_Basics(String name) {
        super(name);__CLR4_4_1k8pk8ple6ndpuf.R.inc(26238);try{__CLR4_4_1k8pk8ple6ndpuf.R.inc(26237);
    }finally{__CLR4_4_1k8pk8ple6ndpuf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1k8pk8ple6ndpuf.R.inc(26239);
        __CLR4_4_1k8pk8ple6ndpuf.R.inc(26240);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1k8pk8ple6ndpuf.R.inc(26241);zone = DateTimeZone.getDefault();
        __CLR4_4_1k8pk8ple6ndpuf.R.inc(26242);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1k8pk8ple6ndpuf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1k8pk8ple6ndpuf.R.inc(26243);
        __CLR4_4_1k8pk8ple6ndpuf.R.inc(26244);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1k8pk8ple6ndpuf.R.inc(26245);DateTimeZone.setDefault(zone);
        __CLR4_4_1k8pk8ple6ndpuf.R.inc(26246);zone = null;
    }finally{__CLR4_4_1k8pk8ple6ndpuf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertySetMonth7() {__CLR4_4_1k8pk8ple6ndpuf.R.globalSliceStart(getClass().getName(),26247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ifzbwnk93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8pk8ple6ndpuf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8pk8ple6ndpuf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPropertySetMonth7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ifzbwnk93(){try{__CLR4_4_1k8pk8ple6ndpuf.R.inc(26247); 
     __CLR4_4_1k8pk8ple6ndpuf.R.inc(26248);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1k8pk8ple6ndpuf.R.inc(26249);YearMonthDay copy = test.monthOfYear().setCopy(12); 
     __CLR4_4_1k8pk8ple6ndpuf.R.inc(26250);check(test, 1972, 6, 9); 
     __CLR4_4_1k8pk8ple6ndpuf.R.inc(26251);check(copy, 1972, 12, 9); 
     __CLR4_4_1k8pk8ple6ndpuf.R.inc(26252);test = new YearMonthDay(1972, 1, 31); 
     __CLR4_4_1k8pk8ple6ndpuf.R.inc(26253);copy = test.monthOfYear().setCopy(2); 
     __CLR4_4_1k8pk8ple6ndpuf.R.inc(26254);check(copy, 1972, 2, 29); 
     __CLR4_4_1k8pk8ple6ndpuf.R.inc(26255);try { 
         __CLR4_4_1k8pk8ple6ndpuf.R.inc(26256);test.monthOfYear().setCopy(13); 
         __CLR4_4_1k8pk8ple6ndpuf.R.inc(26257);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1k8pk8ple6ndpuf.R.inc(26258);try { 
         __CLR4_4_1k8pk8ple6ndpuf.R.inc(26259);test.monthOfYear().setCopy(0); 
         __CLR4_4_1k8pk8ple6ndpuf.R.inc(26260);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1k8pk8ple6ndpuf.R.flushNeeded();}}
public void testWithField48() {__CLR4_4_1k8pk8ple6ndpuf.R.globalSliceStart(getClass().getName(),26261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw9w5vk9h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8pk8ple6ndpuf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8pk8ple6ndpuf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithField48",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw9w5vk9h(){try{__CLR4_4_1k8pk8ple6ndpuf.R.inc(26261); 
     __CLR4_4_1k8pk8ple6ndpuf.R.inc(26262);YearMonthDay test = new YearMonthDay(2004, 6, 9); 
     __CLR4_4_1k8pk8ple6ndpuf.R.inc(26263);YearMonthDay result = test.withField(DateTimeFieldType.year(), 2004); 
     __CLR4_4_1k8pk8ple6ndpuf.R.inc(26264);assertEquals(new YearMonthDay(2004, 6, 9), test); 
     __CLR4_4_1k8pk8ple6ndpuf.R.inc(26265);assertSame(test, result); 
 }finally{__CLR4_4_1k8pk8ple6ndpuf.R.flushNeeded();}}
public void testPlusDays_int9() {__CLR4_4_1k8pk8ple6ndpuf.R.globalSliceStart(getClass().getName(),26266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e5gdd9k9m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8pk8ple6ndpuf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8pk8ple6ndpuf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlusDays_int9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26266,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e5gdd9k9m(){try{__CLR4_4_1k8pk8ple6ndpuf.R.inc(26266); 
     __CLR4_4_1k8pk8ple6ndpuf.R.inc(26267);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1k8pk8ple6ndpuf.R.inc(26268);YearMonthDay result = test.plusDays(1); 
     __CLR4_4_1k8pk8ple6ndpuf.R.inc(26269);YearMonthDay expected = new YearMonthDay(2002, 5, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1k8pk8ple6ndpuf.R.inc(26270);assertEquals(expected, result); 
     __CLR4_4_1k8pk8ple6ndpuf.R.inc(26271);result = test.plusDays(0); 
     __CLR4_4_1k8pk8ple6ndpuf.R.inc(26272);assertSame(test, result); 
 }finally{__CLR4_4_1k8pk8ple6ndpuf.R.flushNeeded();}}
public void testToDateTimeAtMidnight10() {__CLR4_4_1k8pk8ple6ndpuf.R.globalSliceStart(getClass().getName(),26273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1is6qz5k9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k8pk8ple6ndpuf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k8pk8ple6ndpuf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtMidnight10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26273,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1is6qz5k9t(){try{__CLR4_4_1k8pk8ple6ndpuf.R.inc(26273); 
     __CLR4_4_1k8pk8ple6ndpuf.R.inc(26274);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1k8pk8ple6ndpuf.R.inc(26275);DateTime test = base.toDateTimeAtMidnight(); 
     __CLR4_4_1k8pk8ple6ndpuf.R.inc(26276);check(base, 2005, 6, 9); 
     __CLR4_4_1k8pk8ple6ndpuf.R.inc(26277);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1k8pk8ple6ndpuf.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    
    
    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1k8pk8ple6ndpuf.R.inc(26278);
            __CLR4_4_1k8pk8ple6ndpuf.R.inc(26279);return COPTIC_UTC;
        }finally{__CLR4_4_1k8pk8ple6ndpuf.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1k8pk8ple6ndpuf.R.inc(26280);
            __CLR4_4_1k8pk8ple6ndpuf.R.inc(26281);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
            };
        }finally{__CLR4_4_1k8pk8ple6ndpuf.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1k8pk8ple6ndpuf.R.inc(26282);
            __CLR4_4_1k8pk8ple6ndpuf.R.inc(26283);return new int[] {1970, 6, 9};
        }finally{__CLR4_4_1k8pk8ple6ndpuf.R.flushNeeded();}}
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
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    private void check(YearMonthDay test, int hour, int min, int sec) {try{__CLR4_4_1k8pk8ple6ndpuf.R.inc(26284);
        __CLR4_4_1k8pk8ple6ndpuf.R.inc(26285);assertEquals(hour, test.getYear());
        __CLR4_4_1k8pk8ple6ndpuf.R.inc(26286);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1k8pk8ple6ndpuf.R.inc(26287);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1k8pk8ple6ndpuf.R.flushNeeded();}}
}
