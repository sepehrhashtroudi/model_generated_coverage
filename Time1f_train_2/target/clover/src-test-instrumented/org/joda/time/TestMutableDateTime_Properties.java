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
public class TestMutableDateTime_Properties extends TestCase {static class __CLR4_4_1m4im4ile6qsf3m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,28830,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1m4im4ile6qsf3m.R.inc(28674);
        __CLR4_4_1m4im4ile6qsf3m.R.inc(28675);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1m4im4ile6qsf3m.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1m4im4ile6qsf3m.R.inc(28676);
        __CLR4_4_1m4im4ile6qsf3m.R.inc(28677);return new TestSuite(TestMutableDateTime_Properties.class);
    }finally{__CLR4_4_1m4im4ile6qsf3m.R.flushNeeded();}}

    public TestMutableDateTime_Properties(String name) {
        super(name);__CLR4_4_1m4im4ile6qsf3m.R.inc(28679);try{__CLR4_4_1m4im4ile6qsf3m.R.inc(28678);
    }finally{__CLR4_4_1m4im4ile6qsf3m.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1m4im4ile6qsf3m.R.inc(28680);
        __CLR4_4_1m4im4ile6qsf3m.R.inc(28681);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1m4im4ile6qsf3m.R.inc(28682);zone = DateTimeZone.getDefault();
        __CLR4_4_1m4im4ile6qsf3m.R.inc(28683);locale = Locale.getDefault();
        __CLR4_4_1m4im4ile6qsf3m.R.inc(28684);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1m4im4ile6qsf3m.R.inc(28685);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1m4im4ile6qsf3m.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1m4im4ile6qsf3m.R.inc(28686);
        __CLR4_4_1m4im4ile6qsf3m.R.inc(28687);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1m4im4ile6qsf3m.R.inc(28688);DateTimeZone.setDefault(zone);
        __CLR4_4_1m4im4ile6qsf3m.R.inc(28689);Locale.setDefault(locale);
        __CLR4_4_1m4im4ile6qsf3m.R.inc(28690);zone = null;
    }finally{__CLR4_4_1m4im4ile6qsf3m.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyRemainderHourOfDay239() {__CLR4_4_1m4im4ile6qsf3m.R.globalSliceStart(getClass().getName(),28691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198jvacm4z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4im4ile6qsf3m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4im4ile6qsf3m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRemainderHourOfDay239",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198jvacm4z(){try{__CLR4_4_1m4im4ile6qsf3m.R.inc(28691); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28692);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28693);assertEquals(30L * DateTimeConstants.MILLIS_PER_MINUTE, test.hourOfDay().remainder()); 
 }finally{__CLR4_4_1m4im4ile6qsf3m.R.flushNeeded();}} 


public void testPropertyToIntervalMonthOfYear416() {__CLR4_4_1m4im4ile6qsf3m.R.globalSliceStart(getClass().getName(),28694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nfq9vxm52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4im4ile6qsf3m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4im4ile6qsf3m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyToIntervalMonthOfYear416",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nfq9vxm52(){try{__CLR4_4_1m4im4ile6qsf3m.R.inc(28694); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28695);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28696);Interval testInterval = test.monthOfYear().toInterval(); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28697);assertEquals(new MutableDateTime(2004, 6, 1, 0, 0, 0, 0), testInterval.getStart()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28698);assertEquals(new MutableDateTime(2004, 7, 1, 0, 0, 0, 0), testInterval.getEnd()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28699);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test); 
 }finally{__CLR4_4_1m4im4ile6qsf3m.R.flushNeeded();}} 


public void testPropertyGetEra1051() {__CLR4_4_1m4im4ile6qsf3m.R.globalSliceStart(getClass().getName(),28700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18bio55m58();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4im4ile6qsf3m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4im4ile6qsf3m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetEra1051",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28700,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18bio55m58(){try{__CLR4_4_1m4im4ile6qsf3m.R.inc(28700); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28701);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28702);assertSame(test.getChronology().era(), test.era().getField()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28703);assertEquals("era", test.era().getName()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28704);assertEquals("Property[era]", test.era().toString()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28705);assertSame(test, test.era().getMutableDateTime()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28706);assertEquals(1, test.era().get()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28707);assertEquals("AD", test.era().getAsText()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28708);assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28709);assertEquals("AD", test.era().getAsShortText()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28710);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28711);assertEquals(test.getChronology().eras(), test.era().getDurationField()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28712);assertEquals(null, test.era().getRangeDurationField()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28713);assertEquals(2, test.era().getMaximumTextLength(null)); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28714);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28715);assertEquals(2, test.era().getMaximumShortTextLength(null)); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28716);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH)); 
 }finally{__CLR4_4_1m4im4ile6qsf3m.R.flushNeeded();}} 


public void testPropertyGetCenturyOfEra1052() {__CLR4_4_1m4im4ile6qsf3m.R.globalSliceStart(getClass().getName(),28717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1des5krm5p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4im4ile6qsf3m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4im4ile6qsf3m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetCenturyOfEra1052",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28717,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1des5krm5p(){try{__CLR4_4_1m4im4ile6qsf3m.R.inc(28717); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28718);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28719);assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28720);assertEquals("centuryOfEra", test.centuryOfEra().getName()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28721);assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28722);assertEquals(20, test.centuryOfEra().get()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28723);assertEquals("20", test.centuryOfEra().getAsText()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28724);assertEquals("20", test.centuryOfEra().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28725);assertEquals("20", test.centuryOfEra().getAsShortText()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28726);assertEquals("20", test.centuryOfEra().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28727);assertEquals(test.getChronology().centuries(), test.centuryOfEra().getDurationField()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28728);assertEquals(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28729);assertEquals(7, test.centuryOfEra().getMaximumTextLength(null)); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28730);assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m4im4ile6qsf3m.R.flushNeeded();}} 


public void testPropertyGetYearOfEra1053() {__CLR4_4_1m4im4ile6qsf3m.R.globalSliceStart(getClass().getName(),28731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ga6aetm63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4im4ile6qsf3m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4im4ile6qsf3m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetYearOfEra1053",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28731,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ga6aetm63(){try{__CLR4_4_1m4im4ile6qsf3m.R.inc(28731); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28732);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28733);assertSame(test.getChronology().yearOfEra(), test.yearOfEra().getField()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28734);assertEquals("yearOfEra", test.yearOfEra().getName()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28735);assertEquals("Property[yearOfEra]", test.yearOfEra().toString()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28736);assertEquals(2004, test.yearOfEra().get()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28737);assertEquals("2004", test.yearOfEra().getAsText()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28738);assertEquals("2004", test.yearOfEra().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28739);assertEquals("2004", test.yearOfEra().getAsShortText()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28740);assertEquals("2004", test.yearOfEra().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28741);assertEquals(test.getChronology().years(), test.yearOfEra().getDurationField()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28742);assertEquals(test.getChronology().eras(), test.yearOfEra().getRangeDurationField()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28743);assertEquals(9, test.yearOfEra().getMaximumTextLength(null)); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28744);assertEquals(9, test.yearOfEra().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m4im4ile6qsf3m.R.flushNeeded();}} 


public void testPropertySetTextYear1054() {__CLR4_4_1m4im4ile6qsf3m.R.globalSliceStart(getClass().getName(),28745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gnw1rem6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4im4ile6qsf3m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4im4ile6qsf3m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetTextYear1054",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gnw1rem6h(){try{__CLR4_4_1m4im4ile6qsf3m.R.inc(28745); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28746);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28747);test.year().set("1960"); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28748);assertEquals("1960-06-09T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m4im4ile6qsf3m.R.flushNeeded();}} 


public void testPropertyGetWeekyear1055() {__CLR4_4_1m4im4ile6qsf3m.R.globalSliceStart(getClass().getName(),28749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12nsykmm6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4im4ile6qsf3m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4im4ile6qsf3m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetWeekyear1055",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28749,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12nsykmm6l(){try{__CLR4_4_1m4im4ile6qsf3m.R.inc(28749); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28750);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28751);assertSame(test.getChronology().weekyear(), test.weekyear().getField()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28752);assertEquals("weekyear", test.weekyear().getName()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28753);assertEquals("Property[weekyear]", test.weekyear().toString()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28754);assertEquals(2004, test.weekyear().get()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28755);assertEquals("2004", test.weekyear().getAsText()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28756);assertEquals("2004", test.weekyear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28757);assertEquals("2004", test.weekyear().getAsShortText()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28758);assertEquals("2004", test.weekyear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28759);assertEquals(test.getChronology().weekyears(), test.weekyear().getDurationField()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28760);assertEquals(null, test.weekyear().getRangeDurationField()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28761);assertEquals(9, test.weekyear().getMaximumTextLength(null)); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28762);assertEquals(9, test.weekyear().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m4im4ile6qsf3m.R.flushNeeded();}} 


public void testPropertyAddWeekOfWeekyear1056() {__CLR4_4_1m4im4ile6qsf3m.R.globalSliceStart(getClass().getName(),28763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16xtji5m6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4im4ile6qsf3m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4im4ile6qsf3m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddWeekOfWeekyear1056",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16xtji5m6z(){try{__CLR4_4_1m4im4ile6qsf3m.R.inc(28763); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28764);MutableDateTime test = new MutableDateTime(2004, 6, 7, 0, 0, 0, 0); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28765);test.weekOfWeekyear().add(1); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28766);assertEquals("2004-06-14T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m4im4ile6qsf3m.R.flushNeeded();}} 


public void testPropertySetDayOfMonth1057() {__CLR4_4_1m4im4ile6qsf3m.R.globalSliceStart(getClass().getName(),28767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s42gswm73();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4im4ile6qsf3m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4im4ile6qsf3m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetDayOfMonth1057",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28767,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s42gswm73(){try{__CLR4_4_1m4im4ile6qsf3m.R.inc(28767); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28768);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28769);test.dayOfMonth().set(12); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28770);assertEquals("2004-06-12T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m4im4ile6qsf3m.R.flushNeeded();}} 


public void testPropertySetDayOfWeek1058() {__CLR4_4_1m4im4ile6qsf3m.R.globalSliceStart(getClass().getName(),28771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z2zfxnm77();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4im4ile6qsf3m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4im4ile6qsf3m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetDayOfWeek1058",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28771,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z2zfxnm77(){try{__CLR4_4_1m4im4ile6qsf3m.R.inc(28771); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28772);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28773);test.dayOfWeek().set(4); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28774);assertEquals("2004-06-10T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m4im4ile6qsf3m.R.flushNeeded();}} 


public void testPropertyGetMillisOfSecond1059() {__CLR4_4_1m4im4ile6qsf3m.R.globalSliceStart(getClass().getName(),28775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k1fcram7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4im4ile6qsf3m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4im4ile6qsf3m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMillisOfSecond1059",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28775,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k1fcram7b(){try{__CLR4_4_1m4im4ile6qsf3m.R.inc(28775); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28776);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28777);assertSame(test.getChronology().millisOfSecond(), test.millisOfSecond().getField()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28778);assertEquals("millisOfSecond", test.millisOfSecond().getName()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28779);assertEquals("Property[millisOfSecond]", test.millisOfSecond().toString()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28780);assertEquals(53, test.millisOfSecond().get()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28781);assertEquals("53", test.millisOfSecond().getAsText()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28782);assertEquals("53", test.millisOfSecond().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28783);assertEquals("53", test.millisOfSecond().getAsShortText()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28784);assertEquals("53", test.millisOfSecond().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28785);assertEquals(test.getChronology().millis(), test.millisOfSecond().getDurationField()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28786);assertEquals(test.getChronology().seconds(), test.millisOfSecond().getRangeDurationField()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28787);assertEquals(3, test.millisOfSecond().getMaximumTextLength(null)); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28788);assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m4im4ile6qsf3m.R.flushNeeded();}} 


public void testPropertyAddLongDayOfWeek1061() {__CLR4_4_1m4im4ile6qsf3m.R.globalSliceStart(getClass().getName(),28789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18qkg0im7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4im4ile6qsf3m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4im4ile6qsf3m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddLongDayOfWeek1061",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28789,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18qkg0im7p(){try{__CLR4_4_1m4im4ile6qsf3m.R.inc(28789); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28790);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28791);test.dayOfWeek().add(1L); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28792);assertEquals("2004-06-10T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m4im4ile6qsf3m.R.flushNeeded();}} 


public void testPropertySetTextMonthOfYear1062() {__CLR4_4_1m4im4ile6qsf3m.R.globalSliceStart(getClass().getName(),28793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ri2xkim7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4im4ile6qsf3m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4im4ile6qsf3m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetTextMonthOfYear1062",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28793,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ri2xkim7t(){try{__CLR4_4_1m4im4ile6qsf3m.R.inc(28793); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28794);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28795);test.monthOfYear().set("12"); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28796);assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28797);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28798);test.monthOfYear().set("December"); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28799);assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28800);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28801);test.monthOfYear().set("Dec"); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28802);assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
 }finally{__CLR4_4_1m4im4ile6qsf3m.R.flushNeeded();}} 


public void testPropertyRoundFloorHourOfDay1063() {__CLR4_4_1m4im4ile6qsf3m.R.globalSliceStart(getClass().getName(),28803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n73wwxm83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4im4ile6qsf3m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4im4ile6qsf3m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundFloorHourOfDay1063",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n73wwxm83(){try{__CLR4_4_1m4im4ile6qsf3m.R.inc(28803); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28804);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28805);test.hourOfDay().roundFloor(); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28806);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m4im4ile6qsf3m.R.flushNeeded();}} 


public void testPropertyRoundHalfCeilingHourOfDay1064() {__CLR4_4_1m4im4ile6qsf3m.R.globalSliceStart(getClass().getName(),28807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dgla6am87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4im4ile6qsf3m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4im4ile6qsf3m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundHalfCeilingHourOfDay1064",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dgla6am87(){try{__CLR4_4_1m4im4ile6qsf3m.R.inc(28807); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28808);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28809);test.hourOfDay().roundHalfCeiling(); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28810);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28811);test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28812);test.hourOfDay().roundHalfCeiling(); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28813);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28814);test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28815);test.hourOfDay().roundHalfCeiling(); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28816);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m4im4ile6qsf3m.R.flushNeeded();}} 


public void testPropertyRoundHalfEvenHourOfDay1065() {__CLR4_4_1m4im4ile6qsf3m.R.globalSliceStart(getClass().getName(),28817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ydxqvmm8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4im4ile6qsf3m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4im4ile6qsf3m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundHalfEvenHourOfDay1065",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28817,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ydxqvmm8h(){try{__CLR4_4_1m4im4ile6qsf3m.R.inc(28817); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28818);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28819);test.hourOfDay().roundHalfEven(); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28820);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28821);test = new MutableDateTime(2004, 6, 9, 14, 30, 0, 0); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28822);test.hourOfDay().roundHalfEven(); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28823);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28824);test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28825);test.hourOfDay().roundHalfEven(); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28826);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28827);test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28828);test.hourOfDay().roundHalfEven(); 
     __CLR4_4_1m4im4ile6qsf3m.R.inc(28829);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m4im4ile6qsf3m.R.flushNeeded();}} 

    

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
