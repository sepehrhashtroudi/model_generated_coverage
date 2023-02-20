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
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.DateTime.Property;

/**
 * This class is a Junit unit test for CopticChronology.
 *
 * @author Stephen Colebourne
 */
public class TestCopticChronology extends TestCase {static class __CLR4_4_1kbrkbrle6nl8j5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,26402,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int MILLIS_PER_DAY = DateTimeConstants.MILLIS_PER_DAY;

    private static long SKIP = 1 * MILLIS_PER_DAY;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1kbrkbrle6nl8j5.R.inc(26343);
        __CLR4_4_1kbrkbrle6nl8j5.R.inc(26344);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kbrkbrle6nl8j5.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kbrkbrle6nl8j5.R.inc(26345);
        __CLR4_4_1kbrkbrle6nl8j5.R.inc(26346);SKIP = 1 * MILLIS_PER_DAY;
        __CLR4_4_1kbrkbrle6nl8j5.R.inc(26347);return new TestSuite(TestCopticChronology.class);
    }finally{__CLR4_4_1kbrkbrle6nl8j5.R.flushNeeded();}}

    public TestCopticChronology(String name) {
        super(name);__CLR4_4_1kbrkbrle6nl8j5.R.inc(26349);try{__CLR4_4_1kbrkbrle6nl8j5.R.inc(26348);
    }finally{__CLR4_4_1kbrkbrle6nl8j5.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kbrkbrle6nl8j5.R.inc(26350);
        __CLR4_4_1kbrkbrle6nl8j5.R.inc(26351);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kbrkbrle6nl8j5.R.inc(26352);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1kbrkbrle6nl8j5.R.inc(26353);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1kbrkbrle6nl8j5.R.inc(26354);originalLocale = Locale.getDefault();
        __CLR4_4_1kbrkbrle6nl8j5.R.inc(26355);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1kbrkbrle6nl8j5.R.inc(26356);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1kbrkbrle6nl8j5.R.inc(26357);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1kbrkbrle6nl8j5.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kbrkbrle6nl8j5.R.inc(26358);
        __CLR4_4_1kbrkbrle6nl8j5.R.inc(26359);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kbrkbrle6nl8j5.R.inc(26360);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1kbrkbrle6nl8j5.R.inc(26361);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1kbrkbrle6nl8j5.R.inc(26362);Locale.setDefault(originalLocale);
        __CLR4_4_1kbrkbrle6nl8j5.R.inc(26363);originalDateTimeZone = null;
        __CLR4_4_1kbrkbrle6nl8j5.R.inc(26364);originalTimeZone = null;
        __CLR4_4_1kbrkbrle6nl8j5.R.inc(26365);originalLocale = null;
    }finally{__CLR4_4_1kbrkbrle6nl8j5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testWithZone140() {__CLR4_4_1kbrkbrle6nl8j5.R.globalSliceStart(getClass().getName(),26366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ij05rkkce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kbrkbrle6nl8j5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kbrkbrle6nl8j5.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testWithZone140",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ij05rkkce(){try{__CLR4_4_1kbrkbrle6nl8j5.R.inc(26366); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26367);assertSame(CopticChronology.getInstance(TOKYO), CopticChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26368);assertSame(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26369);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26370);assertSame(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26371);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26372);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1kbrkbrle6nl8j5.R.flushNeeded();}}
public void testDurationFields142() {__CLR4_4_1kbrkbrle6nl8j5.R.globalSliceStart(getClass().getName(),26373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jdryh5kcl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kbrkbrle6nl8j5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kbrkbrle6nl8j5.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testDurationFields142",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26373,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jdryh5kcl(){try{__CLR4_4_1kbrkbrle6nl8j5.R.inc(26373); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26374);final CopticChronology coptic = CopticChronology.getInstance(); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26375);assertEquals("eras", coptic.eras().getName()); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26376);assertEquals("centuries", coptic.centuries().getName()); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26377);assertEquals("years", coptic.years().getName()); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26378);assertEquals("weekyears", coptic.weekyears().getName()); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26379);assertEquals("months", coptic.months().getName()); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26380);assertEquals("weeks", coptic.weeks().getName()); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26381);assertEquals("days", coptic.days().getName()); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26382);assertEquals("halfdays", coptic.halfdays().getName()); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26383);assertEquals("hours", coptic.hours().getName()); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26384);assertEquals("minutes", coptic.minutes().getName()); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26385);assertEquals("seconds", coptic.seconds().getName()); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26386);assertEquals("millis", coptic.millis().getName()); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26387);assertEquals(false, coptic.eras().isSupported()); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26388);assertEquals(true, coptic.centuries().isSupported()); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26389);assertEquals(true, coptic.years().isSupported()); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26390);assertEquals(true, coptic.weekyears().isSupported()); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26391);assertEquals(true, coptic.months().isSupported()); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26392);assertEquals(true, coptic.weeks().isSupported()); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26393);assertEquals(true, coptic.days().isSupported()); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26394);assertEquals(true, coptic.halfdays().isSupported()); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26395);assertEquals(true, coptic.hours().isSupported()); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26396);assertEquals(true, coptic.minutes().isSupported()); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26397);assertEquals(true, coptic.seconds().isSupported()); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26398);assertEquals(true, coptic.millis().isSupported()); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26399);assertEquals(false, coptic.centuries().isPrecise()); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26400);assertEquals(false, coptic.years().isPrecise()); 
     __CLR4_4_1kbrkbrle6nl8j5.R.inc(26401);assertEquals(false, coptic.weekyears().isPrecise());
}finally{__CLR4_4_1kbrkbrle6nl8j5.R.flushNeeded();}}

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    

    

    

    

    

}
