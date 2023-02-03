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
package org.joda.time.chrono;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.YearMonthDay;

/**
 * This class is a Junit unit test for GregorianChronology.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestGregorianChronology extends TestCase {static class __CLR4_4_1riwriwlc8axeq9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,35728,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1riwriwlc8axeq9.R.inc(35672);
        __CLR4_4_1riwriwlc8axeq9.R.inc(35673);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1riwriwlc8axeq9.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1riwriwlc8axeq9.R.inc(35674);
        __CLR4_4_1riwriwlc8axeq9.R.inc(35675);return new TestSuite(TestGregorianChronology.class);
    }finally{__CLR4_4_1riwriwlc8axeq9.R.flushNeeded();}}

    public TestGregorianChronology(String name) {
        super(name);__CLR4_4_1riwriwlc8axeq9.R.inc(35677);try{__CLR4_4_1riwriwlc8axeq9.R.inc(35676);
    }finally{__CLR4_4_1riwriwlc8axeq9.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1riwriwlc8axeq9.R.inc(35678);
        __CLR4_4_1riwriwlc8axeq9.R.inc(35679);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1riwriwlc8axeq9.R.inc(35680);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1riwriwlc8axeq9.R.inc(35681);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1riwriwlc8axeq9.R.inc(35682);originalLocale = Locale.getDefault();
        __CLR4_4_1riwriwlc8axeq9.R.inc(35683);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1riwriwlc8axeq9.R.inc(35684);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1riwriwlc8axeq9.R.inc(35685);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1riwriwlc8axeq9.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1riwriwlc8axeq9.R.inc(35686);
        __CLR4_4_1riwriwlc8axeq9.R.inc(35687);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1riwriwlc8axeq9.R.inc(35688);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1riwriwlc8axeq9.R.inc(35689);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1riwriwlc8axeq9.R.inc(35690);Locale.setDefault(originalLocale);
        __CLR4_4_1riwriwlc8axeq9.R.inc(35691);originalDateTimeZone = null;
        __CLR4_4_1riwriwlc8axeq9.R.inc(35692);originalTimeZone = null;
        __CLR4_4_1riwriwlc8axeq9.R.inc(35693);originalLocale = null;
    }finally{__CLR4_4_1riwriwlc8axeq9.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactory_Zone_int34() {__CLR4_4_1riwriwlc8axeq9.R.globalSliceStart(getClass().getName(),35694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1neng45rji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1riwriwlc8axeq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1riwriwlc8axeq9.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testFactory_Zone_int34",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1neng45rji(){try{__CLR4_4_1riwriwlc8axeq9.R.inc(35694); 
     __CLR4_4_1riwriwlc8axeq9.R.inc(35695);GregorianChronology chrono = GregorianChronology.getInstance(TOKYO, 2); 
     __CLR4_4_1riwriwlc8axeq9.R.inc(35696);assertEquals(TOKYO, chrono.getZone()); 
     __CLR4_4_1riwriwlc8axeq9.R.inc(35697);assertEquals(2, chrono.getMinimumDaysInFirstWeek()); 
     __CLR4_4_1riwriwlc8axeq9.R.inc(35698);try { 
         __CLR4_4_1riwriwlc8axeq9.R.inc(35699);GregorianChronology.getInstance(TOKYO, 0); 
         __CLR4_4_1riwriwlc8axeq9.R.inc(35700);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1riwriwlc8axeq9.R.inc(35701);try { 
         __CLR4_4_1riwriwlc8axeq9.R.inc(35702);GregorianChronology.getInstance(TOKYO, 8); 
         __CLR4_4_1riwriwlc8axeq9.R.inc(35703);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1riwriwlc8axeq9.R.flushNeeded();}} 


public void testToString387() {__CLR4_4_1riwriwlc8axeq9.R.globalSliceStart(getClass().getName(),35704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fnt5jvrjs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1riwriwlc8axeq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1riwriwlc8axeq9.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testToString387",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35704,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fnt5jvrjs(){try{__CLR4_4_1riwriwlc8axeq9.R.inc(35704); 
     __CLR4_4_1riwriwlc8axeq9.R.inc(35705);assertEquals("GregorianChronology[Europe/London]", GregorianChronology.getInstance(LONDON).toString()); 
     __CLR4_4_1riwriwlc8axeq9.R.inc(35706);assertEquals("GregorianChronology[Asia/Tokyo]", GregorianChronology.getInstance(TOKYO).toString()); 
     __CLR4_4_1riwriwlc8axeq9.R.inc(35707);assertEquals("GregorianChronology[Europe/London]", GregorianChronology.getInstance().toString()); 
     __CLR4_4_1riwriwlc8axeq9.R.inc(35708);assertEquals("GregorianChronology[UTC]", GregorianChronology.getInstanceUTC().toString()); 
     __CLR4_4_1riwriwlc8axeq9.R.inc(35709);assertEquals("GregorianChronology[UTC,mdfw=2]", GregorianChronology.getInstance(DateTimeZone.UTC, 2).toString()); 
 }finally{__CLR4_4_1riwriwlc8axeq9.R.flushNeeded();}} 


public void testWithZone428() {__CLR4_4_1riwriwlc8axeq9.R.globalSliceStart(getClass().getName(),35710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cntqv1rjy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1riwriwlc8axeq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1riwriwlc8axeq9.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testWithZone428",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35710,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cntqv1rjy(){try{__CLR4_4_1riwriwlc8axeq9.R.inc(35710); 
     __CLR4_4_1riwriwlc8axeq9.R.inc(35711);assertSame(GregorianChronology.getInstance(TOKYO), GregorianChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1riwriwlc8axeq9.R.inc(35712);assertSame(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1riwriwlc8axeq9.R.inc(35713);assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1riwriwlc8axeq9.R.inc(35714);assertSame(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1riwriwlc8axeq9.R.inc(35715);assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1riwriwlc8axeq9.R.inc(35716);assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1riwriwlc8axeq9.R.flushNeeded();}} 


public void testEquality470() {__CLR4_4_1riwriwlc8axeq9.R.globalSliceStart(getClass().getName(),35717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y469ywrk5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1riwriwlc8axeq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1riwriwlc8axeq9.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testEquality470",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35717,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y469ywrk5(){try{__CLR4_4_1riwriwlc8axeq9.R.inc(35717); 
     __CLR4_4_1riwriwlc8axeq9.R.inc(35718);assertSame(GregorianChronology.getInstance(TOKYO), GregorianChronology.getInstance(TOKYO)); 
     __CLR4_4_1riwriwlc8axeq9.R.inc(35719);assertSame(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(LONDON)); 
     __CLR4_4_1riwriwlc8axeq9.R.inc(35720);assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1riwriwlc8axeq9.R.inc(35721);assertSame(GregorianChronology.getInstanceUTC(), GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1riwriwlc8axeq9.R.inc(35722);assertSame(GregorianChronology.getInstance(), GregorianChronology.getInstance(LONDON)); 
 }finally{__CLR4_4_1riwriwlc8axeq9.R.flushNeeded();}} 


public void testFactory_Zone819() {__CLR4_4_1riwriwlc8axeq9.R.globalSliceStart(getClass().getName(),35723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18rwq6srkb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1riwriwlc8axeq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1riwriwlc8axeq9.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testFactory_Zone819",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18rwq6srkb(){try{__CLR4_4_1riwriwlc8axeq9.R.inc(35723); 
     __CLR4_4_1riwriwlc8axeq9.R.inc(35724);assertEquals(TOKYO, GregorianChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1riwriwlc8axeq9.R.inc(35725);assertEquals(PARIS, GregorianChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1riwriwlc8axeq9.R.inc(35726);assertEquals(LONDON, GregorianChronology.getInstance(null).getZone()); 
     __CLR4_4_1riwriwlc8axeq9.R.inc(35727);assertSame(GregorianChronology.class, GregorianChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1riwriwlc8axeq9.R.flushNeeded();}} 

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

}
