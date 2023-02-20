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
public class TestDateTime_Properties extends TestCase {static class __CLR4_4_1ildildle6qe9et{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,24422,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1ildildle6qe9et.R.inc(24097);
        __CLR4_4_1ildildle6qe9et.R.inc(24098);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ildildle6qe9et.R.inc(24099);
        __CLR4_4_1ildildle6qe9et.R.inc(24100);return new TestSuite(TestDateTime_Properties.class);
    }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}}

    public TestDateTime_Properties(String name) {
        super(name);__CLR4_4_1ildildle6qe9et.R.inc(24102);try{__CLR4_4_1ildildle6qe9et.R.inc(24101);
    }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ildildle6qe9et.R.inc(24103);
        __CLR4_4_1ildildle6qe9et.R.inc(24104);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ildildle6qe9et.R.inc(24105);zone = DateTimeZone.getDefault();
        __CLR4_4_1ildildle6qe9et.R.inc(24106);locale = Locale.getDefault();
        __CLR4_4_1ildildle6qe9et.R.inc(24107);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1ildildle6qe9et.R.inc(24108);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ildildle6qe9et.R.inc(24109);
        __CLR4_4_1ildildle6qe9et.R.inc(24110);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ildildle6qe9et.R.inc(24111);DateTimeZone.setDefault(zone);
        __CLR4_4_1ildildle6qe9et.R.inc(24112);Locale.setDefault(locale);
        __CLR4_4_1ildildle6qe9et.R.inc(24113);zone = null;
    }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyEqualsHashCodeLenient192() {__CLR4_4_1ildildle6qe9et.R.globalSliceStart(getClass().getName(),24114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rygmh1ilu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ildildle6qe9et.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ildildle6qe9et.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyEqualsHashCodeLenient192",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rygmh1ilu(){try{__CLR4_4_1ildildle6qe9et.R.inc(24114); 
     __CLR4_4_1ildildle6qe9et.R.inc(24115);DateTime test1 = new DateTime(1970, 6, 9, 0, 0, 0, 0, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24116);DateTime test2 = new DateTime(1970, 6, 9, 0, 0, 0, 0, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24117);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1ildildle6qe9et.R.inc(24118);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1ildildle6qe9et.R.inc(24119);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1ildildle6qe9et.R.inc(24120);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1ildildle6qe9et.R.inc(24121);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24122);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24123);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}} 


public void testPropertyToIntervalYearOfCentury400() {__CLR4_4_1ildildle6qe9et.R.globalSliceStart(getClass().getName(),24124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lcose6im4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ildildle6qe9et.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ildildle6qe9et.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalYearOfCentury400",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lcose6im4(){try{__CLR4_4_1ildildle6qe9et.R.inc(24124); 
     __CLR4_4_1ildildle6qe9et.R.inc(24125);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1ildildle6qe9et.R.inc(24126);Interval testInterval = test.yearOfCentury().toInterval(); 
     __CLR4_4_1ildildle6qe9et.R.inc(24127);assertEquals(new DateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24128);assertEquals(new DateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd()); 
 }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}} 


public void testPropertyGetMonthOfYear501() {__CLR4_4_1ildildle6qe9et.R.globalSliceStart(getClass().getName(),24129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a4apvcim9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ildildle6qe9et.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ildildle6qe9et.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMonthOfYear501",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24129,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a4apvcim9(){try{__CLR4_4_1ildildle6qe9et.R.inc(24129); 
     __CLR4_4_1ildildle6qe9et.R.inc(24130);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24131);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24132);assertEquals("monthOfYear", test.monthOfYear().getName()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24133);assertEquals("Property[monthOfYear]", test.monthOfYear().toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24134);assertSame(test, test.monthOfYear().getDateTime()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24135);assertEquals(6, test.monthOfYear().get()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24136);assertEquals("6", test.monthOfYear().getAsString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24137);assertEquals("June", test.monthOfYear().getAsText()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24138);assertEquals("June", test.monthOfYear().getField().getAsText(6, Locale.ENGLISH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24139);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24140);assertEquals("juin", test.monthOfYear().getField().getAsText(6, Locale.FRENCH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24141);assertEquals("Jun", test.monthOfYear().getAsShortText()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24142);assertEquals("Jun", test.monthOfYear().getField().getAsShortText(6, Locale.ENGLISH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24143);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24144);assertEquals("juin", test.monthOfYear().getField().getAsShortText(6, Locale.FRENCH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24145);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24146);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24147);assertEquals(9, test.monthOfYear().getMaximumTextLength(null)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24148);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24149);test = new DateTime(2004, 7, 9, 0, 0, 0, 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24150);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24151);assertEquals("juillet", test.monthOfYear().getField().getAsText(7, Locale.FRENCH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24152);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24153);assertEquals("juil.", test.monthOfYear().getField().getAsShortText(7, Locale.FRENCH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24154);assertEquals(1, test.monthOfYear().getMinimumValue()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24155);assertEquals(1, test.monthOfYear().getMinimumValueOverall()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24156);assertEquals(12, test.monthOfYear().getMaximumValue()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24157);assertEquals(12, test.monthOfYear().getMaximumValueOverall()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24158);assertEquals(1, test.monthOfYear().getMinimumValue()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24159);assertEquals(1, test.monthOfYear().getMinimumValueOverall()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24160);assertEquals(12, test.monthOfYear().getMaximumValue()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24161);assertEquals(12, test.monthOfYear().getMaximumValueOverall()); 
 }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}} 


public void testPropertyEqualsHashCodeStrict568() {__CLR4_4_1ildildle6qe9et.R.globalSliceStart(getClass().getName(),24162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14wd384in6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ildildle6qe9et.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ildildle6qe9et.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyEqualsHashCodeStrict568",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14wd384in6(){try{__CLR4_4_1ildildle6qe9et.R.inc(24162); 
     __CLR4_4_1ildildle6qe9et.R.inc(24163);DateTime test1 = new DateTime(1970, 6, 9, 0, 0, 0, 0, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24164);DateTime test2 = new DateTime(1970, 6, 9, 0, 0, 0, 0, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24165);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1ildildle6qe9et.R.inc(24166);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1ildildle6qe9et.R.inc(24167);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1ildildle6qe9et.R.inc(24168);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1ildildle6qe9et.R.inc(24169);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24170);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24171);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}} 


public void testPropertyGetEra609() {__CLR4_4_1ildildle6qe9et.R.globalSliceStart(getClass().getName(),24172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hjquvzing();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ildildle6qe9et.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ildildle6qe9et.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetEra609",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24172,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hjquvzing(){try{__CLR4_4_1ildildle6qe9et.R.inc(24172); 
     __CLR4_4_1ildildle6qe9et.R.inc(24173);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24174);assertSame(test.getChronology().era(), test.era().getField()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24175);assertEquals("era", test.era().getName()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24176);assertEquals("Property[era]", test.era().toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24177);assertSame(test, test.era().getDateTime()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24178);assertEquals(1, test.era().get()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24179);assertEquals("1", test.era().getAsString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24180);assertEquals("AD", test.era().getAsText()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24181);assertEquals("AD", test.era().getField().getAsText(1, Locale.ENGLISH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24182);assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24183);assertEquals("ap. J.-C.", test.era().getField().getAsText(1, Locale.FRENCH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24184);assertEquals("AD", test.era().getAsShortText()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24185);assertEquals("AD", test.era().getField().getAsShortText(1, Locale.ENGLISH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24186);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24187);assertEquals("ap. J.-C.", test.era().getField().getAsShortText(1, Locale.FRENCH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24188);assertEquals(test.getChronology().eras(), test.era().getDurationField()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24189);assertEquals(null, test.era().getRangeDurationField()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24190);assertEquals(2, test.era().getMaximumTextLength(null)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24191);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24192);assertEquals(2, test.era().getMaximumShortTextLength(null)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24193);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH)); 
 }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}} 


public void testPropertyGetCenturyOfEra610() {__CLR4_4_1ildildle6qe9et.R.globalSliceStart(getClass().getName(),24194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18py0asio2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ildildle6qe9et.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ildildle6qe9et.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetCenturyOfEra610",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18py0asio2(){try{__CLR4_4_1ildildle6qe9et.R.inc(24194); 
     __CLR4_4_1ildildle6qe9et.R.inc(24195);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24196);assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24197);assertEquals("centuryOfEra", test.centuryOfEra().getName()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24198);assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24199);assertSame(test, test.centuryOfEra().getDateTime()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24200);assertEquals(20, test.centuryOfEra().get()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24201);assertEquals("20", test.centuryOfEra().getAsString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24202);assertEquals("20", test.centuryOfEra().getAsText()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24203);assertEquals("20", test.centuryOfEra().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24204);assertEquals("20", test.centuryOfEra().getAsShortText()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24205);assertEquals("20", test.centuryOfEra().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24206);assertEquals(test.getChronology().centuries(), test.centuryOfEra().getDurationField()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24207);assertEquals(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24208);assertEquals(7, test.centuryOfEra().getMaximumTextLength(null)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24209);assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}} 


public void testPropertyGetYearOfCentury611() {__CLR4_4_1ildildle6qe9et.R.globalSliceStart(getClass().getName(),24210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_178qdskioi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ildildle6qe9et.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ildildle6qe9et.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetYearOfCentury611",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_178qdskioi(){try{__CLR4_4_1ildildle6qe9et.R.inc(24210); 
     __CLR4_4_1ildildle6qe9et.R.inc(24211);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24212);assertSame(test.getChronology().yearOfCentury(), test.yearOfCentury().getField()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24213);assertEquals("yearOfCentury", test.yearOfCentury().getName()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24214);assertEquals("Property[yearOfCentury]", test.yearOfCentury().toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24215);assertSame(test, test.yearOfCentury().getDateTime()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24216);assertEquals(4, test.yearOfCentury().get()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24217);assertEquals("4", test.yearOfCentury().getAsString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24218);assertEquals("4", test.yearOfCentury().getAsText()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24219);assertEquals("4", test.yearOfCentury().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24220);assertEquals("4", test.yearOfCentury().getAsShortText()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24221);assertEquals("4", test.yearOfCentury().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24222);assertEquals(test.getChronology().years(), test.yearOfCentury().getDurationField()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24223);assertEquals(test.getChronology().centuries(), test.yearOfCentury().getRangeDurationField()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24224);assertEquals(2, test.yearOfCentury().getMaximumTextLength(null)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24225);assertEquals(2, test.yearOfCentury().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}} 


public void testPropertyGetWeekyear612() {__CLR4_4_1ildildle6qe9et.R.globalSliceStart(getClass().getName(),24226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z6iw0uioy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ildildle6qe9et.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ildildle6qe9et.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetWeekyear612",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z6iw0uioy(){try{__CLR4_4_1ildildle6qe9et.R.inc(24226); 
     __CLR4_4_1ildildle6qe9et.R.inc(24227);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24228);assertSame(test.getChronology().weekyear(), test.weekyear().getField()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24229);assertEquals("weekyear", test.weekyear().getName()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24230);assertEquals("Property[weekyear]", test.weekyear().toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24231);assertSame(test, test.weekyear().getDateTime()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24232);assertEquals(2004, test.weekyear().get()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24233);assertEquals("2004", test.weekyear().getAsString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24234);assertEquals("2004", test.weekyear().getAsText()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24235);assertEquals("2004", test.weekyear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24236);assertEquals("2004", test.weekyear().getAsShortText()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24237);assertEquals("2004", test.weekyear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24238);assertEquals(test.getChronology().weekyears(), test.weekyear().getDurationField()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24239);assertEquals(null, test.weekyear().getRangeDurationField()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24240);assertEquals(9, test.weekyear().getMaximumTextLength(null)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24241);assertEquals(9, test.weekyear().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}} 


public void testPropertySetWeekOfWeekyear614() {__CLR4_4_1ildildle6qe9et.R.globalSliceStart(getClass().getName(),24242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yhsxknipe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ildildle6qe9et.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ildildle6qe9et.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetWeekOfWeekyear614",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24242,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yhsxknipe(){try{__CLR4_4_1ildildle6qe9et.R.inc(24242); 
     __CLR4_4_1ildildle6qe9et.R.inc(24243);DateTime test = new DateTime(2004, 6, 7, 0, 0, 0, 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24244);DateTime copy = test.weekOfWeekyear().setCopy(4); 
     __CLR4_4_1ildildle6qe9et.R.inc(24245);assertEquals("2004-06-07T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24246);assertEquals("2004-01-19T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24247);try { 
         __CLR4_4_1ildildle6qe9et.R.inc(24248);test.weekOfWeekyear().setCopy(54); 
         __CLR4_4_1ildildle6qe9et.R.inc(24249);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ildildle6qe9et.R.inc(24250);try { 
         __CLR4_4_1ildildle6qe9et.R.inc(24251);test.weekOfWeekyear().setCopy(0); 
         __CLR4_4_1ildildle6qe9et.R.inc(24252);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}} 


public void testPropertyCompareToDayOfYear615() {__CLR4_4_1ildildle6qe9et.R.globalSliceStart(getClass().getName(),24253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11e868mipp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ildildle6qe9et.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ildildle6qe9et.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyCompareToDayOfYear615",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11e868mipp(){try{__CLR4_4_1ildildle6qe9et.R.inc(24253); 
     __CLR4_4_1ildildle6qe9et.R.inc(24254);DateTime test1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1ildildle6qe9et.R.inc(24255);DateTime test2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1ildildle6qe9et.R.inc(24256);assertEquals(true, test1.dayOfYear().compareTo(test2) < 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24257);assertEquals(true, test2.dayOfYear().compareTo(test1) > 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24258);assertEquals(true, test1.dayOfYear().compareTo(test1) == 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24259);try { 
         __CLR4_4_1ildildle6qe9et.R.inc(24260);test1.dayOfYear().compareTo((ReadableInstant) null); 
         __CLR4_4_1ildildle6qe9et.R.inc(24261);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ildildle6qe9et.R.inc(24262);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1ildildle6qe9et.R.inc(24263);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1ildildle6qe9et.R.inc(24264);assertEquals(true, test1.dayOfYear().compareTo(dt2) < 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24265);assertEquals(true, test2.dayOfYear().compareTo(dt1) > 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24266);assertEquals(true, test1.dayOfYear().compareTo(dt1) == 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24267);try { 
         __CLR4_4_1ildildle6qe9et.R.inc(24268);test1.dayOfYear().compareTo((ReadableInstant) null); 
         __CLR4_4_1ildildle6qe9et.R.inc(24269);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}} 


public void testPropertyAddLongDayOfWeek616() {__CLR4_4_1ildildle6qe9et.R.globalSliceStart(getClass().getName(),24270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gbhjdbiq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ildildle6qe9et.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ildildle6qe9et.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddLongDayOfWeek616",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24270,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gbhjdbiq6(){try{__CLR4_4_1ildildle6qe9et.R.inc(24270); 
     __CLR4_4_1ildildle6qe9et.R.inc(24271);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24272);DateTime copy = test.dayOfWeek().addToCopy(1L); 
     __CLR4_4_1ildildle6qe9et.R.inc(24273);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24274);assertEquals("2004-06-10T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}} 


public void testPropertyGetSecondOfDay617() {__CLR4_4_1ildildle6qe9et.R.globalSliceStart(getClass().getName(),24275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kyo3epiqb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ildildle6qe9et.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ildildle6qe9et.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetSecondOfDay617",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24275,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kyo3epiqb(){try{__CLR4_4_1ildildle6qe9et.R.inc(24275); 
     __CLR4_4_1ildildle6qe9et.R.inc(24276);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1ildildle6qe9et.R.inc(24277);assertSame(test.getChronology().secondOfDay(), test.secondOfDay().getField()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24278);assertEquals("secondOfDay", test.secondOfDay().getName()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24279);assertEquals("Property[secondOfDay]", test.secondOfDay().toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24280);assertSame(test, test.secondOfDay().getDateTime()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24281);assertEquals(48223, test.secondOfDay().get()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24282);assertEquals("48223", test.secondOfDay().getAsString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24283);assertEquals("48223", test.secondOfDay().getAsText()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24284);assertEquals("48223", test.secondOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24285);assertEquals("48223", test.secondOfDay().getAsShortText()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24286);assertEquals("48223", test.secondOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24287);assertEquals(test.getChronology().seconds(), test.secondOfDay().getDurationField()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24288);assertEquals(test.getChronology().days(), test.secondOfDay().getRangeDurationField()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24289);assertEquals(5, test.secondOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24290);assertEquals(5, test.secondOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}} 


public void testPropertyWithMinimumValueMillisOfDayDSTGap618() {__CLR4_4_1ildildle6qe9et.R.globalSliceStart(getClass().getName(),24291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s68v8ciqr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ildildle6qe9et.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ildildle6qe9et.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyWithMinimumValueMillisOfDayDSTGap618",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s68v8ciqr(){try{__CLR4_4_1ildildle6qe9et.R.inc(24291); 
     __CLR4_4_1ildildle6qe9et.R.inc(24292);DateTimeZone gaza = DateTimeZone.forID("Asia/Gaza"); 
     __CLR4_4_1ildildle6qe9et.R.inc(24293);DateTime dt = new DateTime(2001, 4, 20, 18, 0, 0, 0, gaza); 
     __CLR4_4_1ildildle6qe9et.R.inc(24294);DateTime test = dt.millisOfDay().withMinimumValue(); 
     __CLR4_4_1ildildle6qe9et.R.inc(24295);assertEquals("2001-04-20T01:00:00.000+03:00", test.toString()); 
 }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}} 


public void testPropertyGetHourOfDay619() {__CLR4_4_1ildildle6qe9et.R.globalSliceStart(getClass().getName(),24296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jo2z3niqw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ildildle6qe9et.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ildildle6qe9et.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetHourOfDay619",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24296,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jo2z3niqw(){try{__CLR4_4_1ildildle6qe9et.R.inc(24296); 
     __CLR4_4_1ildildle6qe9et.R.inc(24297);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1ildildle6qe9et.R.inc(24298);assertSame(test.getChronology().hourOfDay(), test.hourOfDay().getField()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24299);assertEquals("hourOfDay", test.hourOfDay().getName()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24300);assertEquals("Property[hourOfDay]", test.hourOfDay().toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24301);assertSame(test, test.hourOfDay().getDateTime()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24302);assertEquals(13, test.hourOfDay().get()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24303);assertEquals("13", test.hourOfDay().getAsString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24304);assertEquals("13", test.hourOfDay().getAsText()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24305);assertEquals("13", test.hourOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24306);assertEquals("13", test.hourOfDay().getAsShortText()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24307);assertEquals("13", test.hourOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24308);assertEquals(test.getChronology().hours(), test.hourOfDay().getDurationField()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24309);assertEquals(test.getChronology().days(), test.hourOfDay().getRangeDurationField()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24310);assertEquals(2, test.hourOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1ildildle6qe9et.R.inc(24311);assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}} 


public void testPropertyAddMonthOfYear620() {__CLR4_4_1ildildle6qe9et.R.globalSliceStart(getClass().getName(),24312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f5y8o1irc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ildildle6qe9et.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ildildle6qe9et.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddMonthOfYear620",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24312,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f5y8o1irc(){try{__CLR4_4_1ildildle6qe9et.R.inc(24312); 
     __CLR4_4_1ildildle6qe9et.R.inc(24313);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24314);DateTime copy = test.monthOfYear().addToCopy(6); 
     __CLR4_4_1ildildle6qe9et.R.inc(24315);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24316);assertEquals("2004-12-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24317);copy = test.monthOfYear().addToCopy(7); 
     __CLR4_4_1ildildle6qe9et.R.inc(24318);assertEquals("2005-01-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24319);copy = test.monthOfYear().addToCopy(-5); 
     __CLR4_4_1ildildle6qe9et.R.inc(24320);assertEquals("2004-01-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24321);copy = test.monthOfYear().addToCopy(-6); 
     __CLR4_4_1ildildle6qe9et.R.inc(24322);assertEquals("2003-12-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24323);test = new DateTime(2004, 1, 31, 0, 0, 0, 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24324);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1ildildle6qe9et.R.inc(24325);assertEquals("2004-01-31T00:00:00.000Z", test.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24326);assertEquals("2004-02-29T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24327);copy = test.monthOfYear().addToCopy(2); 
     __CLR4_4_1ildildle6qe9et.R.inc(24328);assertEquals("2004-03-31T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24329);copy = test.monthOfYear().addToCopy(3); 
     __CLR4_4_1ildildle6qe9et.R.inc(24330);assertEquals("2004-04-30T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24331);test = new DateTime(2003, 1, 31, 0, 0, 0, 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24332);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1ildildle6qe9et.R.inc(24333);assertEquals("2003-02-28T00:00:00.000Z", copy.toString()); 
 }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}} 


public void testPropertyWithMaximumValueMillisOfDayDSTGap621() {__CLR4_4_1ildildle6qe9et.R.globalSliceStart(getClass().getName(),24334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ue1192iry();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ildildle6qe9et.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ildildle6qe9et.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyWithMaximumValueMillisOfDayDSTGap621",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24334,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ue1192iry(){try{__CLR4_4_1ildildle6qe9et.R.inc(24334); 
     __CLR4_4_1ildildle6qe9et.R.inc(24335);DateTimeZone paris = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1ildildle6qe9et.R.inc(24336);DateTime dt = new DateTime(1926, 4, 17, 18, 0, 0, 0, paris); 
     __CLR4_4_1ildildle6qe9et.R.inc(24337);DateTime test = dt.millisOfDay().withMaximumValue(); 
     __CLR4_4_1ildildle6qe9et.R.inc(24338);assertEquals("1926-04-17T22:59:59.999Z", test.toString()); 
 }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}} 


public void testPropertyRoundHalfEvenHourOfDay623() {__CLR4_4_1ildildle6qe9et.R.globalSliceStart(getClass().getName(),24339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yw82cvis3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ildildle6qe9et.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ildildle6qe9et.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRoundHalfEvenHourOfDay623",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yw82cvis3(){try{__CLR4_4_1ildildle6qe9et.R.inc(24339); 
     __CLR4_4_1ildildle6qe9et.R.inc(24340);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24341);DateTime copy = test.hourOfDay().roundHalfEvenCopy(); 
     __CLR4_4_1ildildle6qe9et.R.inc(24342);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24343);test = new DateTime(2004, 6, 9, 14, 30, 0, 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24344);copy = test.hourOfDay().roundHalfEvenCopy(); 
     __CLR4_4_1ildildle6qe9et.R.inc(24345);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24346);test = new DateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1ildildle6qe9et.R.inc(24347);copy = test.hourOfDay().roundHalfEvenCopy(); 
     __CLR4_4_1ildildle6qe9et.R.inc(24348);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24349);test = new DateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1ildildle6qe9et.R.inc(24350);copy = test.hourOfDay().roundHalfEvenCopy(); 
     __CLR4_4_1ildildle6qe9et.R.inc(24351);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}} 


public void testPropertyAddDayOfMonth822() {__CLR4_4_1ildildle6qe9et.R.globalSliceStart(getClass().getName(),24352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ox4148isg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ildildle6qe9et.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ildildle6qe9et.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddDayOfMonth822",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ox4148isg(){try{__CLR4_4_1ildildle6qe9et.R.inc(24352); 
     __CLR4_4_1ildildle6qe9et.R.inc(24353);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24354);DateTime copy = test.dayOfMonth().addToCopy(9); 
     __CLR4_4_1ildildle6qe9et.R.inc(24355);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24356);assertEquals("2004-06-18T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24357);copy = test.dayOfMonth().addToCopy(21); 
     __CLR4_4_1ildildle6qe9et.R.inc(24358);assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24359);copy = test.dayOfMonth().addToCopy(22); 
     __CLR4_4_1ildildle6qe9et.R.inc(24360);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24361);copy = test.dayOfMonth().addToCopy(22 + 30); 
     __CLR4_4_1ildildle6qe9et.R.inc(24362);assertEquals("2004-07-31T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24363);copy = test.dayOfMonth().addToCopy(22 + 31); 
     __CLR4_4_1ildildle6qe9et.R.inc(24364);assertEquals("2004-08-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24365);copy = test.dayOfMonth().addToCopy(21 + 31 + 31 + 30 + 31 + 30 + 31); 
     __CLR4_4_1ildildle6qe9et.R.inc(24366);assertEquals("2004-12-31T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24367);copy = test.dayOfMonth().addToCopy(22 + 31 + 31 + 30 + 31 + 30 + 31); 
     __CLR4_4_1ildildle6qe9et.R.inc(24368);assertEquals("2005-01-01T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24369);copy = test.dayOfMonth().addToCopy(-8); 
     __CLR4_4_1ildildle6qe9et.R.inc(24370);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24371);copy = test.dayOfMonth().addToCopy(-9); 
     __CLR4_4_1ildildle6qe9et.R.inc(24372);assertEquals("2004-05-31T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24373);copy = test.dayOfMonth().addToCopy(-8 - 31 - 30 - 31 - 29 - 31); 
     __CLR4_4_1ildildle6qe9et.R.inc(24374);assertEquals("2004-01-01T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24375);copy = test.dayOfMonth().addToCopy(-9 - 31 - 30 - 31 - 29 - 31); 
     __CLR4_4_1ildildle6qe9et.R.inc(24376);assertEquals("2003-12-31T00:00:00.000Z", copy.toString()); 
 }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}} 


public void testPropertyLeapMonthOfYear925() {__CLR4_4_1ildildle6qe9et.R.globalSliceStart(getClass().getName(),24377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18pxem6it5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ildildle6qe9et.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ildildle6qe9et.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyLeapMonthOfYear925",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24377,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18pxem6it5(){try{__CLR4_4_1ildildle6qe9et.R.inc(24377); 
     __CLR4_4_1ildildle6qe9et.R.inc(24378);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24379);assertEquals(false, test.monthOfYear().isLeap()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24380);assertEquals(0, test.monthOfYear().getLeapAmount()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24381);assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24382);test = new DateTime(2004, 2, 9, 0, 0, 0, 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24383);assertEquals(true, test.monthOfYear().isLeap()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24384);assertEquals(1, test.monthOfYear().getLeapAmount()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24385);assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24386);test = new DateTime(2003, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24387);assertEquals(false, test.monthOfYear().isLeap()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24388);assertEquals(0, test.monthOfYear().getLeapAmount()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24389);assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24390);test = new DateTime(2003, 2, 9, 0, 0, 0, 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24391);assertEquals(false, test.monthOfYear().isLeap()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24392);assertEquals(0, test.monthOfYear().getLeapAmount()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24393);assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField()); 
 }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}} 


public void testPropertyGetMaxMinValuesDayOfYear926() {__CLR4_4_1ildildle6qe9et.R.globalSliceStart(getClass().getName(),24394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bw5gkzitm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ildildle6qe9et.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ildildle6qe9et.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMaxMinValuesDayOfYear926",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bw5gkzitm(){try{__CLR4_4_1ildildle6qe9et.R.inc(24394); 
     __CLR4_4_1ildildle6qe9et.R.inc(24395);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24396);assertEquals(1, test.dayOfYear().getMinimumValue()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24397);assertEquals(1, test.dayOfYear().getMinimumValueOverall()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24398);assertEquals(366, test.dayOfYear().getMaximumValue()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24399);assertEquals(366, test.dayOfYear().getMaximumValueOverall()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24400);test = new DateTime(2002, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24401);assertEquals(365, test.dayOfYear().getMaximumValue()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24402);assertEquals(366, test.dayOfYear().getMaximumValueOverall()); 
 }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}} 


public void testPropertyWithMaximumValueDayOfMonth927() {__CLR4_4_1ildildle6qe9et.R.globalSliceStart(getClass().getName(),24403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17axxdmitv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ildildle6qe9et.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ildildle6qe9et.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyWithMaximumValueDayOfMonth927",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24403,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17axxdmitv(){try{__CLR4_4_1ildildle6qe9et.R.inc(24403); 
     __CLR4_4_1ildildle6qe9et.R.inc(24404);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24405);DateTime copy = test.dayOfMonth().withMaximumValue(); 
     __CLR4_4_1ildildle6qe9et.R.inc(24406);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24407);assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}} 


public void testPropertyToIntervalMillisOfSecond947() {__CLR4_4_1ildildle6qe9et.R.globalSliceStart(getClass().getName(),24408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h19zm3iu0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ildildle6qe9et.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ildildle6qe9et.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalMillisOfSecond947",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24408,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h19zm3iu0(){try{__CLR4_4_1ildildle6qe9et.R.inc(24408); 
     __CLR4_4_1ildildle6qe9et.R.inc(24409);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1ildildle6qe9et.R.inc(24410);Interval testInterval = test.millisOfSecond().toInterval(); 
     __CLR4_4_1ildildle6qe9et.R.inc(24411);assertEquals(new DateTime(2004, 6, 9, 13, 23, 43, 53), testInterval.getStart()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24412);assertEquals(new DateTime(2004, 6, 9, 13, 23, 43, 54), testInterval.getEnd()); 
 }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}} 


public void testPropertyLeapYear949() {__CLR4_4_1ildildle6qe9et.R.globalSliceStart(getClass().getName(),24413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jhd6cniu5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ildildle6qe9et.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ildildle6qe9et.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyLeapYear949",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24413,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jhd6cniu5(){try{__CLR4_4_1ildildle6qe9et.R.inc(24413); 
     __CLR4_4_1ildildle6qe9et.R.inc(24414);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24415);assertEquals(true, test.year().isLeap()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24416);assertEquals(1, test.year().getLeapAmount()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24417);assertEquals(test.getChronology().days(), test.year().getLeapDurationField()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24418);test = new DateTime(2003, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ildildle6qe9et.R.inc(24419);assertEquals(false, test.year().isLeap()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24420);assertEquals(0, test.year().getLeapAmount()); 
     __CLR4_4_1ildildle6qe9et.R.inc(24421);assertEquals(test.getChronology().days(), test.year().getLeapDurationField()); 
 }finally{__CLR4_4_1ildildle6qe9et.R.flushNeeded();}} 

    

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
