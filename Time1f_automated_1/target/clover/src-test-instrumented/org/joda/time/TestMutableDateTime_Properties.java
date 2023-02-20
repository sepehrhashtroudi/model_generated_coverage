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

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 * @author Mike Schrag
 */
public class TestMutableDateTime_Properties extends TestCase {static class __CLR4_4_1j3nj3nle6ndpo1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,24808,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

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

    public static void main(String[] args) {try{__CLR4_4_1j3nj3nle6ndpo1.R.inc(24755);
        __CLR4_4_1j3nj3nle6ndpo1.R.inc(24756);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1j3nj3nle6ndpo1.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1j3nj3nle6ndpo1.R.inc(24757);
        __CLR4_4_1j3nj3nle6ndpo1.R.inc(24758);return new TestSuite(TestMutableDateTime_Properties.class);
    }finally{__CLR4_4_1j3nj3nle6ndpo1.R.flushNeeded();}}

    public TestMutableDateTime_Properties(String name) {
        super(name);__CLR4_4_1j3nj3nle6ndpo1.R.inc(24760);try{__CLR4_4_1j3nj3nle6ndpo1.R.inc(24759);
    }finally{__CLR4_4_1j3nj3nle6ndpo1.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1j3nj3nle6ndpo1.R.inc(24761);
        __CLR4_4_1j3nj3nle6ndpo1.R.inc(24762);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1j3nj3nle6ndpo1.R.inc(24763);zone = DateTimeZone.getDefault();
        __CLR4_4_1j3nj3nle6ndpo1.R.inc(24764);locale = Locale.getDefault();
        __CLR4_4_1j3nj3nle6ndpo1.R.inc(24765);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1j3nj3nle6ndpo1.R.inc(24766);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1j3nj3nle6ndpo1.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1j3nj3nle6ndpo1.R.inc(24767);
        __CLR4_4_1j3nj3nle6ndpo1.R.inc(24768);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1j3nj3nle6ndpo1.R.inc(24769);DateTimeZone.setDefault(zone);
        __CLR4_4_1j3nj3nle6ndpo1.R.inc(24770);Locale.setDefault(locale);
        __CLR4_4_1j3nj3nle6ndpo1.R.inc(24771);zone = null;
    }finally{__CLR4_4_1j3nj3nle6ndpo1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertyGetCenturyOfEra502() {__CLR4_4_1j3nj3nle6ndpo1.R.globalSliceStart(getClass().getName(),24772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cd29sqj44();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3nj3nle6ndpo1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3nj3nle6ndpo1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetCenturyOfEra502",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cd29sqj44(){try{__CLR4_4_1j3nj3nle6ndpo1.R.inc(24772); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24773);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24774);assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField()); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24775);assertEquals("centuryOfEra", test.centuryOfEra().getName()); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24776);assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString()); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24777);assertEquals(2004, test.centuryOfEra().get()); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24778);assertEquals("2004", test.centuryOfEra().getAsText()); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24779);assertEquals("2004", test.centuryOfEra().getAsText(Locale.FRENCH)); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24780);assertEquals("2004", test.centuryOfEra().getAsShortText()); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24781);assertEquals("2004", test.centuryOfEra().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24782);assertEquals(test.getChronology().centuries(), test.centuryOfEra().getDurationField()); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24783);assertEquals(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField()); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24784);assertEquals(7, test.centuryOfEra().getMaximumTextLength(null)); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24785);assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1j3nj3nle6ndpo1.R.flushNeeded();}}
public void testPropertyGetCenturyOfEra503() {__CLR4_4_1j3nj3nle6ndpo1.R.globalSliceStart(getClass().getName(),24786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1942b09j4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3nj3nle6ndpo1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3nj3nle6ndpo1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetCenturyOfEra503",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1942b09j4i(){try{__CLR4_4_1j3nj3nle6ndpo1.R.inc(24786); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24787);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24788);assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField()); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24789);assertEquals("centuryOfEra", test.centuryOfEra().getName()); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24790);assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString()); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24791);assertEquals(20, test.centuryOfEra().get()); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24792);assertEquals("20", test.centuryOfEra().getAsText()); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24793);assertEquals("20", test.centuryOfEra().getAsText(Locale.FRENCH)); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24794);assertEquals("20", test.centuryOfEra().getAsShortText()); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24795);assertEquals("20", test.centuryOfEra().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24796);assertEquals(test.getChronology().centuries(), test.centuryOfEra().getDurationField()); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24797);assertEquals(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField()); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24798);assertEquals(7, test.centuryOfEra().getMaximumTextLength(null)); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24799);assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1j3nj3nle6ndpo1.R.flushNeeded();}}
public void testPropertyAddWeekyear504() {__CLR4_4_1j3nj3nle6ndpo1.R.globalSliceStart(getClass().getName(),24800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrtcqdj4w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3nj3nle6ndpo1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3nj3nle6ndpo1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddWeekyear504",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrtcqdj4w(){try{__CLR4_4_1j3nj3nle6ndpo1.R.inc(24800); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24801);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24802);test.weekyear().add(1); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24803);assertEquals("2004-06-10T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1j3nj3nle6ndpo1.R.flushNeeded();}}
public void testPropertyAddLongDayOfWeek505() {__CLR4_4_1j3nj3nle6ndpo1.R.globalSliceStart(getClass().getName(),24804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nvmc4wj50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3nj3nle6ndpo1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3nj3nle6ndpo1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddLongDayOfWeek505",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24804,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nvmc4wj50(){try{__CLR4_4_1j3nj3nle6ndpo1.R.inc(24804); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24805);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24806);test.dayOfWeek().add(1L); 
     __CLR4_4_1j3nj3nle6ndpo1.R.inc(24807);assertEquals("2004-06-10T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1j3nj3nle6ndpo1.R.flushNeeded();}}
    

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
