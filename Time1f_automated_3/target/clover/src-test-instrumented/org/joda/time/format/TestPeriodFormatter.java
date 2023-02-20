/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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
package org.joda.time.format;

import java.io.CharArrayWriter;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Period Formating.
 *
 * @author Stephen Colebourne
 */
public class TestPeriodFormatter extends TestCase {static class __CLR4_4_1m50m50le6np4wi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,28722,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEWYORK = DateTimeZone.forID("America/New_York");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);

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
    private PeriodFormatter f = null;

    public static void main(String[] args) {try{__CLR4_4_1m50m50le6np4wi.R.inc(28692);
        __CLR4_4_1m50m50le6np4wi.R.inc(28693);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1m50m50le6np4wi.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1m50m50le6np4wi.R.inc(28694);
        __CLR4_4_1m50m50le6np4wi.R.inc(28695);return new TestSuite(TestPeriodFormatter.class);
    }finally{__CLR4_4_1m50m50le6np4wi.R.flushNeeded();}}

    public TestPeriodFormatter(String name) {
        super(name);__CLR4_4_1m50m50le6np4wi.R.inc(28697);try{__CLR4_4_1m50m50le6np4wi.R.inc(28696);
    }finally{__CLR4_4_1m50m50le6np4wi.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1m50m50le6np4wi.R.inc(28698);
        __CLR4_4_1m50m50le6np4wi.R.inc(28699);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1m50m50le6np4wi.R.inc(28700);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1m50m50le6np4wi.R.inc(28701);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1m50m50le6np4wi.R.inc(28702);originalLocale = Locale.getDefault();
        __CLR4_4_1m50m50le6np4wi.R.inc(28703);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1m50m50le6np4wi.R.inc(28704);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1m50m50le6np4wi.R.inc(28705);Locale.setDefault(Locale.UK);
        __CLR4_4_1m50m50le6np4wi.R.inc(28706);f = ISOPeriodFormat.standard();
    }finally{__CLR4_4_1m50m50le6np4wi.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1m50m50le6np4wi.R.inc(28707);
        __CLR4_4_1m50m50le6np4wi.R.inc(28708);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1m50m50le6np4wi.R.inc(28709);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1m50m50le6np4wi.R.inc(28710);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1m50m50le6np4wi.R.inc(28711);Locale.setDefault(originalLocale);
        __CLR4_4_1m50m50le6np4wi.R.inc(28712);originalDateTimeZone = null;
        __CLR4_4_1m50m50le6np4wi.R.inc(28713);originalTimeZone = null;
        __CLR4_4_1m50m50le6np4wi.R.inc(28714);originalLocale = null;
        __CLR4_4_1m50m50le6np4wi.R.inc(28715);f = null;
    }finally{__CLR4_4_1m50m50le6np4wi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testWithGetParseType250() {__CLR4_4_1m50m50le6np4wi.R.globalSliceStart(getClass().getName(),28716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hlcsudm5o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m50m50le6np4wi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m50m50le6np4wi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testWithGetParseType250",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hlcsudm5o(){try{__CLR4_4_1m50m50le6np4wi.R.inc(28716); 
     __CLR4_4_1m50m50le6np4wi.R.inc(28717);PeriodFormatter f2 = f.withParseType(PeriodType.standard()); 
     __CLR4_4_1m50m50le6np4wi.R.inc(28718);assertEquals(new Period(0, 0, 0, 0, 1, 0, 0, 0), f2); 
     __CLR4_4_1m50m50le6np4wi.R.inc(28719);f2 = f.withParseType(null); 
     __CLR4_4_1m50m50le6np4wi.R.inc(28720);assertEquals(null, f2.getParseType()); 
     __CLR4_4_1m50m50le6np4wi.R.inc(28721);assertSame(f2, f2.withParseType(PeriodType.standard())); 
 }finally{__CLR4_4_1m50m50le6np4wi.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
