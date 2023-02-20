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

import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Partial;
import org.joda.time.TimeOfDay;
import org.joda.time.YearMonthDay;

/**
 * This class is a Junit unit test for ISOChronology.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestISOChronology extends TestCase {static class __CLR4_4_1khwkhwle6nl8jy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,26608,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1khwkhwle6nl8jy.R.inc(26564);
        __CLR4_4_1khwkhwle6nl8jy.R.inc(26565);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1khwkhwle6nl8jy.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1khwkhwle6nl8jy.R.inc(26566);
        __CLR4_4_1khwkhwle6nl8jy.R.inc(26567);return new TestSuite(TestISOChronology.class);
    }finally{__CLR4_4_1khwkhwle6nl8jy.R.flushNeeded();}}

    public TestISOChronology(String name) {
        super(name);__CLR4_4_1khwkhwle6nl8jy.R.inc(26569);try{__CLR4_4_1khwkhwle6nl8jy.R.inc(26568);
    }finally{__CLR4_4_1khwkhwle6nl8jy.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1khwkhwle6nl8jy.R.inc(26570);
        __CLR4_4_1khwkhwle6nl8jy.R.inc(26571);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1khwkhwle6nl8jy.R.inc(26572);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1khwkhwle6nl8jy.R.inc(26573);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1khwkhwle6nl8jy.R.inc(26574);originalLocale = Locale.getDefault();
        __CLR4_4_1khwkhwle6nl8jy.R.inc(26575);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1khwkhwle6nl8jy.R.inc(26576);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1khwkhwle6nl8jy.R.inc(26577);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1khwkhwle6nl8jy.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1khwkhwle6nl8jy.R.inc(26578);
        __CLR4_4_1khwkhwle6nl8jy.R.inc(26579);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1khwkhwle6nl8jy.R.inc(26580);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1khwkhwle6nl8jy.R.inc(26581);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1khwkhwle6nl8jy.R.inc(26582);Locale.setDefault(originalLocale);
        __CLR4_4_1khwkhwle6nl8jy.R.inc(26583);originalDateTimeZone = null;
        __CLR4_4_1khwkhwle6nl8jy.R.inc(26584);originalTimeZone = null;
        __CLR4_4_1khwkhwle6nl8jy.R.inc(26585);originalLocale = null;
    }finally{__CLR4_4_1khwkhwle6nl8jy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testWithZone131() {__CLR4_4_1khwkhwle6nl8jy.R.globalSliceStart(getClass().getName(),26586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q18ygikii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1khwkhwle6nl8jy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1khwkhwle6nl8jy.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testWithZone131",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26586,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q18ygikii(){try{__CLR4_4_1khwkhwle6nl8jy.R.inc(26586); 
     __CLR4_4_1khwkhwle6nl8jy.R.inc(26587);assertSame(ISOChronology.getInstance(TOKYO), ISOChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1khwkhwle6nl8jy.R.inc(26588);assertSame(ISOChronology.getInstance(LONDON), ISOChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1khwkhwle6nl8jy.R.inc(26589);assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1khwkhwle6nl8jy.R.inc(26590);assertSame(ISOChronology.getInstance(LONDON), ISOChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1khwkhwle6nl8jy.R.inc(26591);assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1khwkhwle6nl8jy.R.inc(26592);assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1khwkhwle6nl8jy.R.flushNeeded();}}
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    private void testAdd(String start, DurationFieldType type, int amt, String end) {try{__CLR4_4_1khwkhwle6nl8jy.R.inc(26593);
        __CLR4_4_1khwkhwle6nl8jy.R.inc(26594);DateTime dtStart = new DateTime(start, ISOChronology.getInstanceUTC());
        __CLR4_4_1khwkhwle6nl8jy.R.inc(26595);DateTime dtEnd = new DateTime(end, ISOChronology.getInstanceUTC());
        __CLR4_4_1khwkhwle6nl8jy.R.inc(26596);assertEquals(dtEnd, dtStart.withFieldAdded(type, amt));
        __CLR4_4_1khwkhwle6nl8jy.R.inc(26597);assertEquals(dtStart, dtEnd.withFieldAdded(type, -amt));

        __CLR4_4_1khwkhwle6nl8jy.R.inc(26598);DurationField field = type.getField(ISOChronology.getInstanceUTC());
        __CLR4_4_1khwkhwle6nl8jy.R.inc(26599);int diff = field.getDifference(dtEnd.getMillis(), dtStart.getMillis());
        __CLR4_4_1khwkhwle6nl8jy.R.inc(26600);assertEquals(amt, diff);
        
        __CLR4_4_1khwkhwle6nl8jy.R.inc(26601);if ((((type == DurationFieldType.years() ||
            type == DurationFieldType.months() ||
            type == DurationFieldType.days())&&(__CLR4_4_1khwkhwle6nl8jy.R.iget(26602)!=0|true))||(__CLR4_4_1khwkhwle6nl8jy.R.iget(26603)==0&false))) {{
            __CLR4_4_1khwkhwle6nl8jy.R.inc(26604);YearMonthDay ymdStart = new YearMonthDay(start, ISOChronology.getInstanceUTC());
            __CLR4_4_1khwkhwle6nl8jy.R.inc(26605);YearMonthDay ymdEnd = new YearMonthDay(end, ISOChronology.getInstanceUTC());
            __CLR4_4_1khwkhwle6nl8jy.R.inc(26606);assertEquals(ymdEnd, ymdStart.withFieldAdded(type, amt));
            __CLR4_4_1khwkhwle6nl8jy.R.inc(26607);assertEquals(ymdStart, ymdEnd.withFieldAdded(type, -amt));
        }
    }}finally{__CLR4_4_1khwkhwle6nl8jy.R.flushNeeded();}}

    

    

    

}
