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
@SuppressWarnings("deprecation")
public class TestDateMidnight_Properties extends TestCase {static class __CLR4_4_1h11h11le6ndpd9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,22175,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1h11h11le6ndpd9.R.inc(22069);
        __CLR4_4_1h11h11le6ndpd9.R.inc(22070);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1h11h11le6ndpd9.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1h11h11le6ndpd9.R.inc(22071);
        __CLR4_4_1h11h11le6ndpd9.R.inc(22072);return new TestSuite(TestDateMidnight_Properties.class);
    }finally{__CLR4_4_1h11h11le6ndpd9.R.flushNeeded();}}

    public TestDateMidnight_Properties(String name) {
        super(name);__CLR4_4_1h11h11le6ndpd9.R.inc(22074);try{__CLR4_4_1h11h11le6ndpd9.R.inc(22073);
    }finally{__CLR4_4_1h11h11le6ndpd9.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1h11h11le6ndpd9.R.inc(22075);
        __CLR4_4_1h11h11le6ndpd9.R.inc(22076);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1h11h11le6ndpd9.R.inc(22077);zone = DateTimeZone.getDefault();
        __CLR4_4_1h11h11le6ndpd9.R.inc(22078);locale = Locale.getDefault();
        __CLR4_4_1h11h11le6ndpd9.R.inc(22079);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1h11h11le6ndpd9.R.inc(22080);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1h11h11le6ndpd9.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1h11h11le6ndpd9.R.inc(22081);
        __CLR4_4_1h11h11le6ndpd9.R.inc(22082);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1h11h11le6ndpd9.R.inc(22083);DateTimeZone.setDefault(zone);
        __CLR4_4_1h11h11le6ndpd9.R.inc(22084);Locale.setDefault(locale);
        __CLR4_4_1h11h11le6ndpd9.R.inc(22085);zone = null;
    }finally{__CLR4_4_1h11h11le6ndpd9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertyGetEra726() {__CLR4_4_1h11h11le6ndpd9.R.globalSliceStart(getClass().getName(),22086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u04cylh1i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h11h11le6ndpd9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h11h11le6ndpd9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetEra726",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22086,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u04cylh1i(){try{__CLR4_4_1h11h11le6ndpd9.R.inc(22086); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22087);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22088);assertSame(test.getChronology().era(), test.era().getField()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22089);assertEquals("era", test.era().getName()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22090);assertEquals("Property[era]", test.era().toString()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22091);assertSame(test, test.era().getDateMidnight()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22092);assertEquals(1, test.era().get()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22093);assertEquals("1", test.era().getAsText()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22094);assertEquals("AD", test.era().getAsText(Locale.FRENCH)); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22095);assertEquals("AD", test.era().getAsShortText()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22096);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22097);assertEquals(test.getChronology().eras(), test.era().getDurationField()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22098);assertEquals(null, test.era().getRangeDurationField()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22099);assertEquals(2, test.era().getMaximumTextLength(null)); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22100);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22101);assertEquals(2, test.era().getMaximumShortTextLength(null)); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22102);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH)); 
 }finally{__CLR4_4_1h11h11le6ndpd9.R.flushNeeded();}}
public void testPropertySetTextMonthOfYear728() {__CLR4_4_1h11h11le6ndpd9.R.globalSliceStart(getClass().getName(),22103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l2mrfch1z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h11h11le6ndpd9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h11h11le6ndpd9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertySetTextMonthOfYear728",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l2mrfch1z(){try{__CLR4_4_1h11h11le6ndpd9.R.inc(22103); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22104);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22105);DateMidnight copy = test.monthOfYear().setCopy("8"); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22106);assertEquals(2004, copy.getYear()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22107);assertEquals(8, copy.getMonthOfYear()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22108);assertEquals(9, copy.getDayOfMonth()); 
 }finally{__CLR4_4_1h11h11le6ndpd9.R.flushNeeded();}}
public void testPropertySetTextDayOfMonth729() {__CLR4_4_1h11h11le6ndpd9.R.globalSliceStart(getClass().getName(),22109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nizsxch25();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h11h11le6ndpd9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h11h11le6ndpd9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertySetTextDayOfMonth729",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22109,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nizsxch25(){try{__CLR4_4_1h11h11le6ndpd9.R.inc(22109); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22110);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22111);DateMidnight copy = test.dayOfMonth().setCopy("12"); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22112);assertEquals(2004, copy.getYear()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22113);assertEquals(2, copy.getMonthOfYear()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22114);assertEquals(9, copy.getDayOfMonth()); 
 }finally{__CLR4_4_1h11h11le6ndpd9.R.flushNeeded();}}
public void testPropertyGetEra731() {__CLR4_4_1h11h11le6ndpd9.R.globalSliceStart(getClass().getName(),22115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rk4mfdh2b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h11h11le6ndpd9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h11h11le6ndpd9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetEra731",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22115,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rk4mfdh2b(){try{__CLR4_4_1h11h11le6ndpd9.R.inc(22115); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22116);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22117);assertSame(test.getChronology().era(), test.era().getField()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22118);assertEquals("era", test.era().getName()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22119);assertEquals("Property[era]", test.era().toString()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22120);assertSame(test, test.era().getDateMidnight()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22121);assertEquals(1, test.era().get()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22122);assertEquals("1", test.era().getAsString()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22123);assertEquals("AD", test.era().getAsText()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22124);assertEquals("AD", test.era().getField().getAsText(1, Locale.ENGLISH)); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22125);assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH)); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22126);assertEquals("ap. J.-C.", test.era().getField().getAsText(1, Locale.FRENCH)); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22127);assertEquals("AD", test.era().getAsShortText()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22128);assertEquals("AD", test.era().getField().getAsShortText(1, Locale.ENGLISH)); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22129);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22130);assertEquals("ap. J.-C.", test.era().getField().getAsShortText(1, Locale.FRENCH)); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22131);assertEquals(test.getChronology().eras(), test.era().getDurationField()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22132);assertEquals(null, test.era().getRangeDurationField()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22133);assertEquals(2, test.era().getMaximumTextLength(null)); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22134);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22135);assertEquals(2, test.era().getMaximumShortTextLength(null)); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22136);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH)); 
 }finally{__CLR4_4_1h11h11le6ndpd9.R.flushNeeded();}}
public void testPropertyAddMonthOfYear732() {__CLR4_4_1h11h11le6ndpd9.R.globalSliceStart(getClass().getName(),22137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ls5o1ph2x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h11h11le6ndpd9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h11h11le6ndpd9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyAddMonthOfYear732",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22137,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ls5o1ph2x(){try{__CLR4_4_1h11h11le6ndpd9.R.inc(22137); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22138);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22139);DateMidnight copy = test.monthOfYear().addToCopy(8); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22140);assertEquals(2005, copy.getYear()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22141);assertEquals(2, copy.getMonthOfYear()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22142);assertEquals(9, copy.getDayOfMonth()); 
 }finally{__CLR4_4_1h11h11le6ndpd9.R.flushNeeded();}}
public void testPropertyWithMaximumValueMonthOfYear733() {__CLR4_4_1h11h11le6ndpd9.R.globalSliceStart(getClass().getName(),22143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pestiwh33();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h11h11le6ndpd9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h11h11le6ndpd9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyWithMaximumValueMonthOfYear733",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22143,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pestiwh33(){try{__CLR4_4_1h11h11le6ndpd9.R.inc(22143); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22144);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22145);DateMidnight copy = test.monthOfYear().withMaximumValue(); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22146);assertEquals(2004, copy.getYear()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22147);assertEquals(2, copy.getMonthOfYear()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22148);assertEquals(9, copy.getDayOfMonth()); 
 }finally{__CLR4_4_1h11h11le6ndpd9.R.flushNeeded();}}
public void testPropertyWithMinimumValueDayOfMonth734() {__CLR4_4_1h11h11le6ndpd9.R.globalSliceStart(getClass().getName(),22149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bzai0uh39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h11h11le6ndpd9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h11h11le6ndpd9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyWithMinimumValueDayOfMonth734",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22149,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bzai0uh39(){try{__CLR4_4_1h11h11le6ndpd9.R.inc(22149); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22150);DateMidnight test = new DateMidnight(1972, 6, 9); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22151);DateMidnight copy = test.dayOfMonth().withMinimumValue(); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22152);assertEquals(1972, copy.getYear()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22153);assertEquals(2, copy.getMonthOfYear()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22154);assertEquals(9, copy.getDayOfMonth()); 
 }finally{__CLR4_4_1h11h11le6ndpd9.R.flushNeeded();}}
public void testPropertyRoundFloorMonthOfYear735() {__CLR4_4_1h11h11le6ndpd9.R.globalSliceStart(getClass().getName(),22155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gwcq6nh3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h11h11le6ndpd9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h11h11le6ndpd9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundFloorMonthOfYear735",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gwcq6nh3f(){try{__CLR4_4_1h11h11le6ndpd9.R.inc(22155); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22156);DateMidnight test = new DateMidnight(2004, 6, 16); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22157);DateMidnight copy = test.monthOfYear().roundFloorCopy(); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22158);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22159);test = new DateMidnight(2004, 6, 17); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22160);copy = test.monthOfYear().roundFloorCopy(); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22161);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22162);test = new DateMidnight(2004, 6, 15); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22163);copy = test.monthOfYear().roundFloorCopy(); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22164);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1h11h11le6ndpd9.R.flushNeeded();}}
public void testPropertyRoundCeilingMonthOfYear736() {__CLR4_4_1h11h11le6ndpd9.R.globalSliceStart(getClass().getName(),22165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1txmom5h3p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h11h11le6ndpd9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h11h11le6ndpd9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundCeilingMonthOfYear736",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1txmom5h3p(){try{__CLR4_4_1h11h11le6ndpd9.R.inc(22165); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22166);DateMidnight test = new DateMidnight(2004, 6, 16); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22167);DateMidnight copy = test.monthOfYear().roundCeilingCopy(); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22168);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22169);test = new DateMidnight(2004, 6, 17); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22170);copy = test.monthOfYear().roundCeilingCopy(); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22171);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22172);test = new DateMidnight(2004, 6, 15); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22173);copy = test.monthOfYear().roundCeilingCopy(); 
     __CLR4_4_1h11h11le6ndpd9.R.inc(22174);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1h11h11le6ndpd9.R.flushNeeded();}}
    

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
