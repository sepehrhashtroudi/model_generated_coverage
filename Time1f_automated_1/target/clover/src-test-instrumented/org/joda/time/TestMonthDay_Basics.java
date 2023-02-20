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
 * This class is a Junit unit test for MonthDay. Based on {@link TestYearMonth_Basics} 
 */
public class TestMonthDay_Basics extends TestCase {static class __CLR4_4_1iupiuple6ndpmk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,24517,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
//    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
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

    public static void main(String[] args) {try{__CLR4_4_1iupiuple6ndpmk.R.inc(24433);
        __CLR4_4_1iupiuple6ndpmk.R.inc(24434);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1iupiuple6ndpmk.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1iupiuple6ndpmk.R.inc(24435);
        __CLR4_4_1iupiuple6ndpmk.R.inc(24436);return new TestSuite(TestMonthDay_Basics.class);
    }finally{__CLR4_4_1iupiuple6ndpmk.R.flushNeeded();}}

    public TestMonthDay_Basics(String name) {
        super(name);__CLR4_4_1iupiuple6ndpmk.R.inc(24438);try{__CLR4_4_1iupiuple6ndpmk.R.inc(24437);
    }finally{__CLR4_4_1iupiuple6ndpmk.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1iupiuple6ndpmk.R.inc(24439);
        __CLR4_4_1iupiuple6ndpmk.R.inc(24440);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1iupiuple6ndpmk.R.inc(24441);zone = DateTimeZone.getDefault();
        __CLR4_4_1iupiuple6ndpmk.R.inc(24442);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1iupiuple6ndpmk.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1iupiuple6ndpmk.R.inc(24443);
        __CLR4_4_1iupiuple6ndpmk.R.inc(24444);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1iupiuple6ndpmk.R.inc(24445);DateTimeZone.setDefault(zone);
        __CLR4_4_1iupiuple6ndpmk.R.inc(24446);zone = null;
    }finally{__CLR4_4_1iupiuple6ndpmk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFormat_unknownString542() {__CLR4_4_1iupiuple6ndpmk.R.globalSliceStart(getClass().getName(),24447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ddfzp1iv3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iupiuple6ndpmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iupiuple6ndpmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testFormat_unknownString542",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ddfzp1iv3(){try{__CLR4_4_1iupiuple6ndpmk.R.inc(24447); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24448);try { 
         __CLR4_4_1iupiuple6ndpmk.R.inc(24449);DateTimeFormat.forPattern(null); 
         __CLR4_4_1iupiuple6ndpmk.R.inc(24450);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24451);try { 
         __CLR4_4_1iupiuple6ndpmk.R.inc(24452);DateTimeFormat.forPattern(""); 
         __CLR4_4_1iupiuple6ndpmk.R.inc(24453);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24454);try { 
         __CLR4_4_1iupiuple6ndpmk.R.inc(24455);DateTimeFormat.forPattern("A"); 
         __CLR4_4_1iupiuple6ndpmk.R.inc(24456);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24457);try { 
         __CLR4_4_1iupiuple6ndpmk.R.inc(24458);DateTimeFormat.forPattern("dd/mm/AA"); 
         __CLR4_4_1iupiuple6ndpmk.R.inc(24459);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1iupiuple6ndpmk.R.flushNeeded();}}
public void testPropertySetMonthOfYear630() {__CLR4_4_1iupiuple6ndpmk.R.globalSliceStart(getClass().getName(),24460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gpadflivg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iupiuple6ndpmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iupiuple6ndpmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPropertySetMonthOfYear630",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gpadflivg(){try{__CLR4_4_1iupiuple6ndpmk.R.inc(24460); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24461);MonthDay test = new MonthDay(10, 6); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24462);MonthDay copy = test.monthOfYear().setCopy(12); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24463);check(test, 10, 6); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24464);check(copy, 12, 6); 
 }finally{__CLR4_4_1iupiuple6ndpmk.R.flushNeeded();}}
public void testPlusMonths_int631() {__CLR4_4_1iupiuple6ndpmk.R.globalSliceStart(getClass().getName(),24465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_182knd8ivl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iupiuple6ndpmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iupiuple6ndpmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusMonths_int631",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24465,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_182knd8ivl(){try{__CLR4_4_1iupiuple6ndpmk.R.inc(24465); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24466);MonthDay test = new MonthDay(6, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24467);MonthDay result = test.plusMonths(1); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24468);MonthDay expected = new MonthDay(8, 9, BuddhistChronology.getInstance()); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24469);assertEquals(expected, result); 
 }finally{__CLR4_4_1iupiuple6ndpmk.R.flushNeeded();}}
public void testPropertySetDayOfMonth637() {__CLR4_4_1iupiuple6ndpmk.R.globalSliceStart(getClass().getName(),24470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1va6kzdivq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iupiuple6ndpmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iupiuple6ndpmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPropertySetDayOfMonth637",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24470,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1va6kzdivq(){try{__CLR4_4_1iupiuple6ndpmk.R.inc(24470); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24471);MonthDay test = new MonthDay(4, 6); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24472);MonthDay copy = test.dayOfMonth().setCopy(12); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24473);check(test, 4, 6); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24474);check(copy, 4, 12); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24475);copy = test.dayOfMonth().setCopy(13); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24476);check(copy, 4, 13); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24477);copy = test.dayOfMonth().setCopy(14); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24478);check(copy, 4, 4); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24479);copy = test.dayOfMonth().setCopy(-12); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24480);check(copy, 4, 4); 
 }finally{__CLR4_4_1iupiuple6ndpmk.R.flushNeeded();}}
public void testToString_String638() {__CLR4_4_1iupiuple6ndpmk.R.globalSliceStart(getClass().getName(),24481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pb9a40iw1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iupiuple6ndpmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iupiuple6ndpmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToString_String638",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24481,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pb9a40iw1(){try{__CLR4_4_1iupiuple6ndpmk.R.inc(24481); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24482);MonthDay test = new MonthDay(5, 6); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24483);assertEquals("\ufffd 6/5", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24484);assertEquals("\ufffd 6/5", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24485);assertEquals("--05-06", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24486);assertEquals("\ufffd 6/5", test.toString("EEE d/M", null)); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24487);assertEquals("--05-06", test.toString(null, null)); 
 }finally{__CLR4_4_1iupiuple6ndpmk.R.flushNeeded();}}
public void testPropertyGetDayOfMonth639() {__CLR4_4_1iupiuple6ndpmk.R.globalSliceStart(getClass().getName(),24488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jauvehiw8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iupiuple6ndpmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iupiuple6ndpmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPropertyGetDayOfMonth639",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jauvehiw8(){try{__CLR4_4_1iupiuple6ndpmk.R.inc(24488); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24489);MonthDay test = new MonthDay(4, 6); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24490);assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField()); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24491);assertEquals("dayOfMonth", test.dayOfMonth().getName()); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24492);assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString()); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24493);assertSame(test, test.dayOfMonth().getReadablePartial()); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24494);assertSame(test, test.dayOfMonth().getMonthDay()); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24495);assertEquals(6, test.dayOfMonth().get()); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24496);assertEquals("6", test.dayOfMonth().getAsString()); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24497);assertEquals("6", test.dayOfMonth().getAsText()); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24498);assertEquals("6", test.dayOfMonth().getAsText(Locale.FRENCH)); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24499);assertEquals("6", test.dayOfMonth().getAsShortText()); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24500);assertEquals("6", test.dayOfMonth().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24501);assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField()); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24502);assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField()); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24503);assertEquals(2, test.dayOfMonth().getMaximumTextLength(null)); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24504);assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null)); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24505);test = new MonthDay(4, 7); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24506);assertEquals("7", test.dayOfMonth().getAsText(Locale.FRENCH)); 
     __CLR4_4_1iupiuple6ndpmk.R.inc(24507);assertEquals("7", test.dayOfMonth().getAsShortText(Locale.FRENCH)); 
 }finally{__CLR4_4_1iupiuple6ndpmk.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    
    
    class MockMD extends MockPartial {
        
        @Override
        public Chronology getChronology() {try{__CLR4_4_1iupiuple6ndpmk.R.inc(24508);
            __CLR4_4_1iupiuple6ndpmk.R.inc(24509);return COPTIC_UTC;
        }finally{__CLR4_4_1iupiuple6ndpmk.R.flushNeeded();}}
        
        @Override
        public DateTimeField[] getFields() {try{__CLR4_4_1iupiuple6ndpmk.R.inc(24510);
            __CLR4_4_1iupiuple6ndpmk.R.inc(24511);return new DateTimeField[] {
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth()
            };
        }finally{__CLR4_4_1iupiuple6ndpmk.R.flushNeeded();}}
        
        @Override
        public int[] getValues() {try{__CLR4_4_1iupiuple6ndpmk.R.inc(24512);
            __CLR4_4_1iupiuple6ndpmk.R.inc(24513);return new int[] {10, 6};
        }finally{__CLR4_4_1iupiuple6ndpmk.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-------------------------------------------------------------------------
    

    

    

    
    
    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-------------------------------------------------------------------------
    

    

    

    
    
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
    private void check(MonthDay test, int month, int day) {try{__CLR4_4_1iupiuple6ndpmk.R.inc(24514);
        __CLR4_4_1iupiuple6ndpmk.R.inc(24515);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1iupiuple6ndpmk.R.inc(24516);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1iupiuple6ndpmk.R.flushNeeded();}}
}
