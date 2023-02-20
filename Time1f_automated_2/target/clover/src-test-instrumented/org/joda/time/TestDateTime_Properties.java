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

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 * @author Mike Schrag
 */
public class TestDateTime_Properties extends TestCase {static class __CLR4_4_1hbxhbxle6nl871{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,22526,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);

    //private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
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
            
    // 2002-04-05 Fri
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06 Tue
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) {try{__CLR4_4_1hbxhbxle6nl871.R.inc(22461);
        __CLR4_4_1hbxhbxle6nl871.R.inc(22462);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hbxhbxle6nl871.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hbxhbxle6nl871.R.inc(22463);
        __CLR4_4_1hbxhbxle6nl871.R.inc(22464);return new TestSuite(TestDateTime_Properties.class);
    }finally{__CLR4_4_1hbxhbxle6nl871.R.flushNeeded();}}

    public TestDateTime_Properties(String name) {
        super(name);__CLR4_4_1hbxhbxle6nl871.R.inc(22466);try{__CLR4_4_1hbxhbxle6nl871.R.inc(22465);
    }finally{__CLR4_4_1hbxhbxle6nl871.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hbxhbxle6nl871.R.inc(22467);
        __CLR4_4_1hbxhbxle6nl871.R.inc(22468);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hbxhbxle6nl871.R.inc(22469);zone = DateTimeZone.getDefault();
        __CLR4_4_1hbxhbxle6nl871.R.inc(22470);locale = Locale.getDefault();
        __CLR4_4_1hbxhbxle6nl871.R.inc(22471);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1hbxhbxle6nl871.R.inc(22472);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1hbxhbxle6nl871.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hbxhbxle6nl871.R.inc(22473);
        __CLR4_4_1hbxhbxle6nl871.R.inc(22474);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hbxhbxle6nl871.R.inc(22475);DateTimeZone.setDefault(zone);
        __CLR4_4_1hbxhbxle6nl871.R.inc(22476);Locale.setDefault(locale);
        __CLR4_4_1hbxhbxle6nl871.R.inc(22477);zone = null;
    }finally{__CLR4_4_1hbxhbxle6nl871.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertyGetCenturyOfEra261() {__CLR4_4_1hbxhbxle6nl871.R.globalSliceStart(getClass().getName(),22478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r1f5b0hce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hbxhbxle6nl871.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hbxhbxle6nl871.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetCenturyOfEra261",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22478,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r1f5b0hce(){try{__CLR4_4_1hbxhbxle6nl871.R.inc(22478); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22479);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22480);assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField()); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22481);assertEquals("centuryOfEra", test.centuryOfEra().getName()); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22482);assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString()); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22483);assertSame(test, test.centuryOfEra().getDateTime()); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22484);assertEquals(20, test.centuryOfEra().get()); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22485);assertEquals("20", test.centuryOfEra().getAsString()); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22486);assertEquals("20", test.centuryOfEra().getAsText()); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22487);assertEquals("20", test.centuryOfEra().getAsText(Locale.FRENCH)); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22488);assertEquals("20", test.centuryOfEra().getAsShortText()); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22489);assertEquals("20", test.centuryOfEra().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22490);assertEquals(test.getChronology().centuries(), test.centuryOfEra().getDurationField()); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22491);assertEquals(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField()); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22492);assertEquals(7, test.centuryOfEra().getMaximumTextLength(null)); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22493);assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1hbxhbxle6nl871.R.flushNeeded();}}
public void testPropertySetDayOfWeek262() {__CLR4_4_1hbxhbxle6nl871.R.globalSliceStart(getClass().getName(),22494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ffswevhcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hbxhbxle6nl871.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hbxhbxle6nl871.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetDayOfWeek262",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ffswevhcu(){try{__CLR4_4_1hbxhbxle6nl871.R.inc(22494); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22495);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22496);DateTime copy = test.dayOfWeek().setCopy(4); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22497);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22498);assertEquals("2004-01-19T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22499);try { 
         __CLR4_4_1hbxhbxle6nl871.R.inc(22500);test.dayOfWeek().setCopy(54); 
         __CLR4_4_1hbxhbxle6nl871.R.inc(22501);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22502);try { 
         __CLR4_4_1hbxhbxle6nl871.R.inc(22503);test.dayOfWeek().setCopy(0); 
         __CLR4_4_1hbxhbxle6nl871.R.inc(22504);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hbxhbxle6nl871.R.flushNeeded();}}
public void testPropertyAddLongDayOfWeek263() {__CLR4_4_1hbxhbxle6nl871.R.globalSliceStart(getClass().getName(),22505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b009izhd5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hbxhbxle6nl871.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hbxhbxle6nl871.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddLongDayOfWeek263",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b009izhd5(){try{__CLR4_4_1hbxhbxle6nl871.R.inc(22505); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22506);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22507);DateTime copy = test.dayOfWeek().addToCopy(9L); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22508);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22509);assertEquals("2004-12-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22510);copy = test.dayOfWeek().addToCopy(0L); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22511);assertEquals("2004-12-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22512);copy = test.dayOfWeek().addToCopy(292278993 - 2004 + 1); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22513);assertEquals(-292275054, copy.getYear()); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22514);copy = test.dayOfWeek().addToCopy(-292275054 - 2004 - 1); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22515);assertEquals(292278993, copy.getYear()); 
 }finally{__CLR4_4_1hbxhbxle6nl871.R.flushNeeded();}}
public void testPropertyWithMaximumValueDayOfMonth264() {__CLR4_4_1hbxhbxle6nl871.R.globalSliceStart(getClass().getName(),22516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aovmqchdg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hbxhbxle6nl871.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hbxhbxle6nl871.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyWithMaximumValueDayOfMonth264",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aovmqchdg(){try{__CLR4_4_1hbxhbxle6nl871.R.inc(22516); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22517);DateTime test = new DateTime(1972, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22518);DateTime copy = test.dayOfMonth().withMaximumValue(); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22519);assertEquals("1972-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22520);assertEquals("1972-06-30T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1hbxhbxle6nl871.R.flushNeeded();}}
public void testPropertyWithMaximumValueMillisOfDayDSTGap265() {__CLR4_4_1hbxhbxle6nl871.R.globalSliceStart(getClass().getName(),22521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w1eweyhdl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hbxhbxle6nl871.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hbxhbxle6nl871.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyWithMaximumValueMillisOfDayDSTGap265",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w1eweyhdl(){try{__CLR4_4_1hbxhbxle6nl871.R.inc(22521); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22522);DateTimeZone gaza = DateTimeZone.forID("Asia/Gaza"); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22523);DateTime dt = new DateTime(2001, 4, 20, 18, 0, 0, 0, gaza); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22524);DateTime test = dt.millisOfDay().withMaximumValue(); 
     __CLR4_4_1hbxhbxle6nl871.R.inc(22525);assertEquals("2001-04-20T01:00:00.000+03:00", test.toString()); 
 }finally{__CLR4_4_1hbxhbxle6nl871.R.flushNeeded();}}
    

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
    

    

    

    

    

    

    

    

    

    

    

}
