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
public class TestDateTime_Properties extends TestCase {static class __CLR4_4_1il5il5le6rckpn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,24423,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1il5il5le6rckpn.R.inc(24089);
        __CLR4_4_1il5il5le6rckpn.R.inc(24090);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1il5il5le6rckpn.R.inc(24091);
        __CLR4_4_1il5il5le6rckpn.R.inc(24092);return new TestSuite(TestDateTime_Properties.class);
    }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}}

    public TestDateTime_Properties(String name) {
        super(name);__CLR4_4_1il5il5le6rckpn.R.inc(24094);try{__CLR4_4_1il5il5le6rckpn.R.inc(24093);
    }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1il5il5le6rckpn.R.inc(24095);
        __CLR4_4_1il5il5le6rckpn.R.inc(24096);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1il5il5le6rckpn.R.inc(24097);zone = DateTimeZone.getDefault();
        __CLR4_4_1il5il5le6rckpn.R.inc(24098);locale = Locale.getDefault();
        __CLR4_4_1il5il5le6rckpn.R.inc(24099);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1il5il5le6rckpn.R.inc(24100);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1il5il5le6rckpn.R.inc(24101);
        __CLR4_4_1il5il5le6rckpn.R.inc(24102);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1il5il5le6rckpn.R.inc(24103);DateTimeZone.setDefault(zone);
        __CLR4_4_1il5il5le6rckpn.R.inc(24104);Locale.setDefault(locale);
        __CLR4_4_1il5il5le6rckpn.R.inc(24105);zone = null;
    }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyAddWrapFieldYear273() {__CLR4_4_1il5il5le6rckpn.R.globalSliceStart(getClass().getName(),24106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1huw2qilm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1il5il5le6rckpn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1il5il5le6rckpn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddWrapFieldYear273",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24106,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1huw2qilm(){try{__CLR4_4_1il5il5le6rckpn.R.inc(24106); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24107);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24108);DateTime copy = test.year().addWrapFieldToCopy(9); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24109);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24110);assertEquals("2013-06-09T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24111);copy = test.year().addWrapFieldToCopy(0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24112);assertEquals(2004, copy.getYear()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24113);copy = test.year().addWrapFieldToCopy(292278993 - 2004 + 1); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24114);assertEquals(-292275054, copy.getYear()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24115);copy = test.year().addWrapFieldToCopy(-292275054 - 2004 - 1); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24116);assertEquals(292278993, copy.getYear()); 
 }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}} 


public void testPropertyGetMonthOfYear516() {__CLR4_4_1il5il5le6rckpn.R.globalSliceStart(getClass().getName(),24117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1exyllwilx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1il5il5le6rckpn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1il5il5le6rckpn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMonthOfYear516",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1exyllwilx(){try{__CLR4_4_1il5il5le6rckpn.R.inc(24117); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24118);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24119);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24120);assertEquals("monthOfYear", test.monthOfYear().getName()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24121);assertEquals("Property[monthOfYear]", test.monthOfYear().toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24122);assertSame(test, test.monthOfYear().getDateTime()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24123);assertEquals(6, test.monthOfYear().get()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24124);assertEquals("6", test.monthOfYear().getAsString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24125);assertEquals("June", test.monthOfYear().getAsText()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24126);assertEquals("June", test.monthOfYear().getField().getAsText(6, Locale.ENGLISH)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24127);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24128);assertEquals("juin", test.monthOfYear().getField().getAsText(6, Locale.FRENCH)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24129);assertEquals("Jun", test.monthOfYear().getAsShortText()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24130);assertEquals("Jun", test.monthOfYear().getField().getAsShortText(6, Locale.ENGLISH)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24131);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24132);assertEquals("juin", test.monthOfYear().getField().getAsShortText(6, Locale.FRENCH)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24133);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24134);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24135);assertEquals(9, test.monthOfYear().getMaximumTextLength(null)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24136);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24137);test = new DateTime(2004, 7, 9, 0, 0, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24138);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24139);assertEquals("juillet", test.monthOfYear().getField().getAsText(7, Locale.FRENCH)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24140);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24141);assertEquals("juil.", test.monthOfYear().getField().getAsShortText(7, Locale.FRENCH)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24142);assertEquals(1, test.monthOfYear().getMinimumValue()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24143);assertEquals(1, test.monthOfYear().getMinimumValueOverall()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24144);assertEquals(12, test.monthOfYear().getMaximumValue()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24145);assertEquals(12, test.monthOfYear().getMaximumValueOverall()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24146);assertEquals(1, test.monthOfYear().getMinimumValue()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24147);assertEquals(1, test.monthOfYear().getMinimumValueOverall()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24148);assertEquals(12, test.monthOfYear().getMaximumValue()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24149);assertEquals(12, test.monthOfYear().getMaximumValueOverall()); 
 }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}} 


public void testPropertyGetCenturyOfEra616() {__CLR4_4_1il5il5le6rckpn.R.globalSliceStart(getClass().getName(),24150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s7xt1mimu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1il5il5le6rckpn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1il5il5le6rckpn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetCenturyOfEra616",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s7xt1mimu(){try{__CLR4_4_1il5il5le6rckpn.R.inc(24150); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24151);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24152);assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24153);assertEquals("centuryOfEra", test.centuryOfEra().getName()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24154);assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24155);assertSame(test, test.centuryOfEra().getDateTime()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24156);assertEquals(20, test.centuryOfEra().get()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24157);assertEquals("20", test.centuryOfEra().getAsString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24158);assertEquals("20", test.centuryOfEra().getAsText()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24159);assertEquals("20", test.centuryOfEra().getAsText(Locale.FRENCH)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24160);assertEquals("20", test.centuryOfEra().getAsShortText()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24161);assertEquals("20", test.centuryOfEra().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24162);assertEquals(test.getChronology().centuries(), test.centuryOfEra().getDurationField()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24163);assertEquals(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24164);assertEquals(7, test.centuryOfEra().getMaximumTextLength(null)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24165);assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}} 


public void testPropertyGetYearOfCentury617() {__CLR4_4_1il5il5le6rckpn.R.globalSliceStart(getClass().getName(),24166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c99eyaina();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1il5il5le6rckpn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1il5il5le6rckpn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetYearOfCentury617",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c99eyaina(){try{__CLR4_4_1il5il5le6rckpn.R.inc(24166); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24167);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24168);assertSame(test.getChronology().yearOfCentury(), test.yearOfCentury().getField()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24169);assertEquals("yearOfCentury", test.yearOfCentury().getName()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24170);assertEquals("Property[yearOfCentury]", test.yearOfCentury().toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24171);assertSame(test, test.yearOfCentury().getDateTime()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24172);assertEquals(4, test.yearOfCentury().get()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24173);assertEquals("4", test.yearOfCentury().getAsString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24174);assertEquals("4", test.yearOfCentury().getAsText()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24175);assertEquals("4", test.yearOfCentury().getAsText(Locale.FRENCH)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24176);assertEquals("4", test.yearOfCentury().getAsShortText()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24177);assertEquals("4", test.yearOfCentury().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24178);assertEquals(test.getChronology().years(), test.yearOfCentury().getDurationField()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24179);assertEquals(test.getChronology().centuries(), test.yearOfCentury().getRangeDurationField()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24180);assertEquals(2, test.yearOfCentury().getMaximumTextLength(null)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24181);assertEquals(2, test.yearOfCentury().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}} 


public void testPropertyToIntervalYearOfEra618() {__CLR4_4_1il5il5le6rckpn.R.globalSliceStart(getClass().getName(),24182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ksupxninq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1il5il5le6rckpn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1il5il5le6rckpn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalYearOfEra618",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ksupxninq(){try{__CLR4_4_1il5il5le6rckpn.R.inc(24182); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24183);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24184);Interval testInterval = test.yearOfEra().toInterval(); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24185);assertEquals(new DateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24186);assertEquals(new DateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd()); 
 }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}} 


public void testPropertySetYear619() {__CLR4_4_1il5il5le6rckpn.R.globalSliceStart(getClass().getName(),24187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ltd0tinv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1il5il5le6rckpn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1il5il5le6rckpn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetYear619",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ltd0tinv(){try{__CLR4_4_1il5il5le6rckpn.R.inc(24187); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24188);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24189);DateTime copy = test.year().setCopy(1960); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24190);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24191);assertEquals("1960-06-09T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}} 


public void testPropertyGetWeekyear620() {__CLR4_4_1il5il5le6rckpn.R.globalSliceStart(getClass().getName(),24192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cmq6zpio0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1il5il5le6rckpn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1il5il5le6rckpn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetWeekyear620",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cmq6zpio0(){try{__CLR4_4_1il5il5le6rckpn.R.inc(24192); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24193);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24194);assertSame(test.getChronology().weekyear(), test.weekyear().getField()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24195);assertEquals("weekyear", test.weekyear().getName()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24196);assertEquals("Property[weekyear]", test.weekyear().toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24197);assertSame(test, test.weekyear().getDateTime()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24198);assertEquals(2004, test.weekyear().get()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24199);assertEquals("2004", test.weekyear().getAsString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24200);assertEquals("2004", test.weekyear().getAsText()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24201);assertEquals("2004", test.weekyear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24202);assertEquals("2004", test.weekyear().getAsShortText()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24203);assertEquals("2004", test.weekyear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24204);assertEquals(test.getChronology().weekyears(), test.weekyear().getDurationField()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24205);assertEquals(null, test.weekyear().getRangeDurationField()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24206);assertEquals(9, test.weekyear().getMaximumTextLength(null)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24207);assertEquals(9, test.weekyear().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}} 


public void testPropertyCompareToDayOfYear622() {__CLR4_4_1il5il5le6rckpn.R.globalSliceStart(getClass().getName(),24208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ikmtxiiog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1il5il5le6rckpn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1il5il5le6rckpn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyCompareToDayOfYear622",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ikmtxiiog(){try{__CLR4_4_1il5il5le6rckpn.R.inc(24208); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24209);DateTime test1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24210);DateTime test2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24211);assertEquals(true, test1.dayOfYear().compareTo(test2) < 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24212);assertEquals(true, test2.dayOfYear().compareTo(test1) > 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24213);assertEquals(true, test1.dayOfYear().compareTo(test1) == 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24214);try { 
         __CLR4_4_1il5il5le6rckpn.R.inc(24215);test1.dayOfYear().compareTo((ReadableInstant) null); 
         __CLR4_4_1il5il5le6rckpn.R.inc(24216);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1il5il5le6rckpn.R.inc(24217);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24218);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24219);assertEquals(true, test1.dayOfYear().compareTo(dt2) < 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24220);assertEquals(true, test2.dayOfYear().compareTo(dt1) > 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24221);assertEquals(true, test1.dayOfYear().compareTo(dt1) == 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24222);try { 
         __CLR4_4_1il5il5le6rckpn.R.inc(24223);test1.dayOfYear().compareTo((ReadableInstant) null); 
         __CLR4_4_1il5il5le6rckpn.R.inc(24224);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}} 


public void testPropertyAddLongDayOfWeek623() {__CLR4_4_1il5il5le6rckpn.R.globalSliceStart(getClass().getName(),24225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ndgstiox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1il5il5le6rckpn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1il5il5le6rckpn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddLongDayOfWeek623",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ndgstiox(){try{__CLR4_4_1il5il5le6rckpn.R.inc(24225); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24226);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24227);DateTime copy = test.dayOfWeek().addToCopy(1L); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24228);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24229);assertEquals("2004-06-10T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}} 


public void testPropertyGetMinuteOfDay624() {__CLR4_4_1il5il5le6rckpn.R.globalSliceStart(getClass().getName(),24230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oid7czip2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1il5il5le6rckpn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1il5il5le6rckpn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMinuteOfDay624",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oid7czip2(){try{__CLR4_4_1il5il5le6rckpn.R.inc(24230); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24231);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24232);assertSame(test.getChronology().minuteOfDay(), test.minuteOfDay().getField()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24233);assertEquals("minuteOfDay", test.minuteOfDay().getName()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24234);assertEquals("Property[minuteOfDay]", test.minuteOfDay().toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24235);assertSame(test, test.minuteOfDay().getDateTime()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24236);assertEquals(803, test.minuteOfDay().get()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24237);assertEquals("803", test.minuteOfDay().getAsString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24238);assertEquals("803", test.minuteOfDay().getAsText()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24239);assertEquals("803", test.minuteOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24240);assertEquals("803", test.minuteOfDay().getAsShortText()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24241);assertEquals("803", test.minuteOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24242);assertEquals(test.getChronology().minutes(), test.minuteOfDay().getDurationField()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24243);assertEquals(test.getChronology().days(), test.minuteOfDay().getRangeDurationField()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24244);assertEquals(4, test.minuteOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24245);assertEquals(4, test.minuteOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}} 


public void testPropertyGetSecondOfDay625() {__CLR4_4_1il5il5le6rckpn.R.globalSliceStart(getClass().getName(),24246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qukzluipi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1il5il5le6rckpn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1il5il5le6rckpn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetSecondOfDay625",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qukzluipi(){try{__CLR4_4_1il5il5le6rckpn.R.inc(24246); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24247);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24248);assertSame(test.getChronology().secondOfDay(), test.secondOfDay().getField()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24249);assertEquals("secondOfDay", test.secondOfDay().getName()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24250);assertEquals("Property[secondOfDay]", test.secondOfDay().toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24251);assertSame(test, test.secondOfDay().getDateTime()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24252);assertEquals(48223, test.secondOfDay().get()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24253);assertEquals("48223", test.secondOfDay().getAsString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24254);assertEquals("48223", test.secondOfDay().getAsText()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24255);assertEquals("48223", test.secondOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24256);assertEquals("48223", test.secondOfDay().getAsShortText()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24257);assertEquals("48223", test.secondOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24258);assertEquals(test.getChronology().seconds(), test.secondOfDay().getDurationField()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24259);assertEquals(test.getChronology().days(), test.secondOfDay().getRangeDurationField()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24260);assertEquals(5, test.secondOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24261);assertEquals(5, test.secondOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}} 


public void testPropertyGetHourOfDay627() {__CLR4_4_1il5il5le6rckpn.R.globalSliceStart(getClass().getName(),24262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s563wwipy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1il5il5le6rckpn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1il5il5le6rckpn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetHourOfDay627",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s563wwipy(){try{__CLR4_4_1il5il5le6rckpn.R.inc(24262); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24263);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24264);assertSame(test.getChronology().hourOfDay(), test.hourOfDay().getField()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24265);assertEquals("hourOfDay", test.hourOfDay().getName()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24266);assertEquals("Property[hourOfDay]", test.hourOfDay().toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24267);assertSame(test, test.hourOfDay().getDateTime()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24268);assertEquals(13, test.hourOfDay().get()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24269);assertEquals("13", test.hourOfDay().getAsString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24270);assertEquals("13", test.hourOfDay().getAsText()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24271);assertEquals("13", test.hourOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24272);assertEquals("13", test.hourOfDay().getAsShortText()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24273);assertEquals("13", test.hourOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24274);assertEquals(test.getChronology().hours(), test.hourOfDay().getDurationField()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24275);assertEquals(test.getChronology().days(), test.hourOfDay().getRangeDurationField()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24276);assertEquals(2, test.hourOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24277);assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}} 


public void testPropertyAddMonthOfYear628() {__CLR4_4_1il5il5le6rckpn.R.globalSliceStart(getClass().getName(),24278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tv62zbiqe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1il5il5le6rckpn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1il5il5le6rckpn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddMonthOfYear628",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24278,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tv62zbiqe(){try{__CLR4_4_1il5il5le6rckpn.R.inc(24278); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24279);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24280);DateTime copy = test.monthOfYear().addToCopy(6); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24281);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24282);assertEquals("2004-12-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24283);copy = test.monthOfYear().addToCopy(7); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24284);assertEquals("2005-01-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24285);copy = test.monthOfYear().addToCopy(-5); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24286);assertEquals("2004-01-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24287);copy = test.monthOfYear().addToCopy(-6); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24288);assertEquals("2003-12-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24289);test = new DateTime(2004, 1, 31, 0, 0, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24290);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24291);assertEquals("2004-01-31T00:00:00.000Z", test.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24292);assertEquals("2004-02-29T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24293);copy = test.monthOfYear().addToCopy(2); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24294);assertEquals("2004-03-31T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24295);copy = test.monthOfYear().addToCopy(3); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24296);assertEquals("2004-04-30T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24297);test = new DateTime(2003, 1, 31, 0, 0, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24298);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24299);assertEquals("2003-02-28T00:00:00.000Z", copy.toString()); 
 }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}} 


public void testPropertySetTextDayOfMonth629() {__CLR4_4_1il5il5le6rckpn.R.globalSliceStart(getClass().getName(),24300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1le5429ir0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1il5il5le6rckpn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1il5il5le6rckpn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetTextDayOfMonth629",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24300,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1le5429ir0(){try{__CLR4_4_1il5il5le6rckpn.R.inc(24300); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24301);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24302);DateTime copy = test.dayOfMonth().setCopy("12"); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24303);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24304);assertEquals("2004-06-12T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}} 


public void testPropertyWithMaximumValueMillisOfDayDSTGap630() {__CLR4_4_1il5il5le6rckpn.R.globalSliceStart(getClass().getName(),24305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13x63i0ir5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1il5il5le6rckpn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1il5il5le6rckpn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyWithMaximumValueMillisOfDayDSTGap630",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13x63i0ir5(){try{__CLR4_4_1il5il5le6rckpn.R.inc(24305); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24306);DateTimeZone paris = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24307);DateTime dt = new DateTime(1926, 4, 17, 18, 0, 0, 0, paris); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24308);DateTime test = dt.millisOfDay().withMaximumValue(); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24309);assertEquals("1926-04-17T22:59:59.999Z", test.toString()); 
 }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}} 


public void testPropertyRoundHalfFloorHourOfDay632() {__CLR4_4_1il5il5le6rckpn.R.globalSliceStart(getClass().getName(),24310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yoiy5pira();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1il5il5le6rckpn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1il5il5le6rckpn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRoundHalfFloorHourOfDay632",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yoiy5pira(){try{__CLR4_4_1il5il5le6rckpn.R.inc(24310); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24311);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24312);DateTime copy = test.hourOfDay().roundHalfFloorCopy(); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24313);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24314);test = new DateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24315);copy = test.hourOfDay().roundHalfFloorCopy(); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24316);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24317);test = new DateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24318);copy = test.hourOfDay().roundHalfFloorCopy(); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24319);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}} 


public void testPropertyRoundHalfCeilingHourOfDay633() {__CLR4_4_1il5il5le6rckpn.R.globalSliceStart(getClass().getName(),24320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qda3hdirk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1il5il5le6rckpn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1il5il5le6rckpn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRoundHalfCeilingHourOfDay633",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qda3hdirk(){try{__CLR4_4_1il5il5le6rckpn.R.inc(24320); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24321);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24322);DateTime copy = test.hourOfDay().roundHalfCeilingCopy(); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24323);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24324);test = new DateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24325);copy = test.hourOfDay().roundHalfCeilingCopy(); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24326);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24327);test = new DateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24328);copy = test.hourOfDay().roundHalfCeilingCopy(); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24329);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}} 


public void testPropertyRoundHalfEvenHourOfDay634() {__CLR4_4_1il5il5le6rckpn.R.globalSliceStart(getClass().getName(),24330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11xd70viru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1il5il5le6rckpn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1il5il5le6rckpn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRoundHalfEvenHourOfDay634",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11xd70viru(){try{__CLR4_4_1il5il5le6rckpn.R.inc(24330); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24331);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24332);DateTime copy = test.hourOfDay().roundHalfEvenCopy(); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24333);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24334);test = new DateTime(2004, 6, 9, 14, 30, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24335);copy = test.hourOfDay().roundHalfEvenCopy(); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24336);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24337);test = new DateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24338);copy = test.hourOfDay().roundHalfEvenCopy(); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24339);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24340);test = new DateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24341);copy = test.hourOfDay().roundHalfEvenCopy(); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24342);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}} 


public void testPropertyAddDayOfMonth819() {__CLR4_4_1il5il5le6rckpn.R.globalSliceStart(getClass().getName(),24343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vvz64gis7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1il5il5le6rckpn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1il5il5le6rckpn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddDayOfMonth819",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vvz64gis7(){try{__CLR4_4_1il5il5le6rckpn.R.inc(24343); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24344);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24345);DateTime copy = test.dayOfMonth().addToCopy(9); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24346);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24347);assertEquals("2004-06-18T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24348);copy = test.dayOfMonth().addToCopy(21); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24349);assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24350);copy = test.dayOfMonth().addToCopy(22); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24351);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24352);copy = test.dayOfMonth().addToCopy(22 + 30); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24353);assertEquals("2004-07-31T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24354);copy = test.dayOfMonth().addToCopy(22 + 31); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24355);assertEquals("2004-08-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24356);copy = test.dayOfMonth().addToCopy(21 + 31 + 31 + 30 + 31 + 30 + 31); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24357);assertEquals("2004-12-31T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24358);copy = test.dayOfMonth().addToCopy(22 + 31 + 31 + 30 + 31 + 30 + 31); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24359);assertEquals("2005-01-01T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24360);copy = test.dayOfMonth().addToCopy(-8); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24361);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24362);copy = test.dayOfMonth().addToCopy(-9); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24363);assertEquals("2004-05-31T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24364);copy = test.dayOfMonth().addToCopy(-8 - 31 - 30 - 31 - 29 - 31); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24365);assertEquals("2004-01-01T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24366);copy = test.dayOfMonth().addToCopy(-9 - 31 - 30 - 31 - 29 - 31); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24367);assertEquals("2003-12-31T00:00:00.000Z", copy.toString()); 
 }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}} 


public void testPropertyGetDifferenceHourOfDay915() {__CLR4_4_1il5il5le6rckpn.R.globalSliceStart(getClass().getName(),24368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cr1urzisw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1il5il5le6rckpn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1il5il5le6rckpn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetDifferenceHourOfDay915",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cr1urzisw(){try{__CLR4_4_1il5il5le6rckpn.R.inc(24368); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24369);DateTime test1 = new DateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24370);DateTime test2 = new DateTime(2004, 6, 9, 15, 30, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24371);assertEquals(-2, test1.hourOfDay().getDifference(test2)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24372);assertEquals(2, test2.hourOfDay().getDifference(test1)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24373);assertEquals(-2L, test1.hourOfDay().getDifferenceAsLong(test2)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24374);assertEquals(2L, test2.hourOfDay().getDifferenceAsLong(test1)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24375);DateTime test = new DateTime(TEST_TIME_NOW + (13L * DateTimeConstants.MILLIS_PER_HOUR)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24376);assertEquals(13, test.hourOfDay().getDifference(null)); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24377);assertEquals(13L, test.hourOfDay().getDifferenceAsLong(null)); 
 }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}} 


public void testPropertyLeapMonthOfYear916() {__CLR4_4_1il5il5le6rckpn.R.globalSliceStart(getClass().getName(),24378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hqxj4wit6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1il5il5le6rckpn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1il5il5le6rckpn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyLeapMonthOfYear916",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hqxj4wit6(){try{__CLR4_4_1il5il5le6rckpn.R.inc(24378); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24379);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24380);assertEquals(false, test.monthOfYear().isLeap()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24381);assertEquals(0, test.monthOfYear().getLeapAmount()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24382);assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24383);test = new DateTime(2004, 2, 9, 0, 0, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24384);assertEquals(true, test.monthOfYear().isLeap()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24385);assertEquals(1, test.monthOfYear().getLeapAmount()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24386);assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24387);test = new DateTime(2003, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24388);assertEquals(false, test.monthOfYear().isLeap()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24389);assertEquals(0, test.monthOfYear().getLeapAmount()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24390);assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24391);test = new DateTime(2003, 2, 9, 0, 0, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24392);assertEquals(false, test.monthOfYear().isLeap()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24393);assertEquals(0, test.monthOfYear().getLeapAmount()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24394);assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField()); 
 }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}} 


public void testPropertyGetMaxMinValuesDayOfYear917() {__CLR4_4_1il5il5le6rckpn.R.globalSliceStart(getClass().getName(),24395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ekph63itn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1il5il5le6rckpn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1il5il5le6rckpn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMaxMinValuesDayOfYear917",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ekph63itn(){try{__CLR4_4_1il5il5le6rckpn.R.inc(24395); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24396);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24397);assertEquals(1, test.dayOfYear().getMinimumValue()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24398);assertEquals(1, test.dayOfYear().getMinimumValueOverall()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24399);assertEquals(366, test.dayOfYear().getMaximumValue()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24400);assertEquals(366, test.dayOfYear().getMaximumValueOverall()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24401);test = new DateTime(2002, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24402);assertEquals(365, test.dayOfYear().getMaximumValue()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24403);assertEquals(366, test.dayOfYear().getMaximumValueOverall()); 
 }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}} 


public void testPropertyWithMaximumValueDayOfMonth918() {__CLR4_4_1il5il5le6rckpn.R.globalSliceStart(getClass().getName(),24404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j5x0dgitw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1il5il5le6rckpn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1il5il5le6rckpn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyWithMaximumValueDayOfMonth918",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j5x0dgitw(){try{__CLR4_4_1il5il5le6rckpn.R.inc(24404); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24405);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24406);DateTime copy = test.dayOfMonth().withMaximumValue(); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24407);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24408);assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}} 


public void testPropertyToIntervalMillisOfSecond935() {__CLR4_4_1il5il5le6rckpn.R.globalSliceStart(getClass().getName(),24409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j6kuieiu1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1il5il5le6rckpn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1il5il5le6rckpn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalMillisOfSecond935",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j6kuieiu1(){try{__CLR4_4_1il5il5le6rckpn.R.inc(24409); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24410);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24411);Interval testInterval = test.millisOfSecond().toInterval(); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24412);assertEquals(new DateTime(2004, 6, 9, 13, 23, 43, 53), testInterval.getStart()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24413);assertEquals(new DateTime(2004, 6, 9, 13, 23, 43, 54), testInterval.getEnd()); 
 }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}} 


public void testPropertyLeapYear937() {__CLR4_4_1il5il5le6rckpn.R.globalSliceStart(getClass().getName(),24414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fbw1i0iu6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1il5il5le6rckpn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1il5il5le6rckpn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyLeapYear937",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fbw1i0iu6(){try{__CLR4_4_1il5il5le6rckpn.R.inc(24414); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24415);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24416);assertEquals(true, test.year().isLeap()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24417);assertEquals(1, test.year().getLeapAmount()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24418);assertEquals(test.getChronology().days(), test.year().getLeapDurationField()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24419);test = new DateTime(2003, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24420);assertEquals(false, test.year().isLeap()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24421);assertEquals(0, test.year().getLeapAmount()); 
     __CLR4_4_1il5il5le6rckpn.R.inc(24422);assertEquals(test.getChronology().days(), test.year().getLeapDurationField()); 
 }finally{__CLR4_4_1il5il5le6rckpn.R.flushNeeded();}} 

    

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
