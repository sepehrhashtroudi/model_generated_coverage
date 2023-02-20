/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2010 Stephen Colebourne
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

import java.util.Date;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.MockZeroNullIntegerConverter;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 */
public class TestDateTime_Constructors extends TestCase {static class __CLR4_4_1hdchdcle6o79nr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,22540,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) {try{__CLR4_4_1hdchdcle6o79nr.R.inc(22512);
        __CLR4_4_1hdchdcle6o79nr.R.inc(22513);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hdchdcle6o79nr.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hdchdcle6o79nr.R.inc(22514);
        __CLR4_4_1hdchdcle6o79nr.R.inc(22515);return new TestSuite(TestDateTime_Constructors.class);
    }finally{__CLR4_4_1hdchdcle6o79nr.R.flushNeeded();}}

    public TestDateTime_Constructors(String name) {
        super(name);__CLR4_4_1hdchdcle6o79nr.R.inc(22517);try{__CLR4_4_1hdchdcle6o79nr.R.inc(22516);
    }finally{__CLR4_4_1hdchdcle6o79nr.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hdchdcle6o79nr.R.inc(22518);
        __CLR4_4_1hdchdcle6o79nr.R.inc(22519);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hdchdcle6o79nr.R.inc(22520);zone = DateTimeZone.getDefault();
        __CLR4_4_1hdchdcle6o79nr.R.inc(22521);locale = Locale.getDefault();
        __CLR4_4_1hdchdcle6o79nr.R.inc(22522);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1hdchdcle6o79nr.R.inc(22523);java.util.TimeZone.setDefault(LONDON.toTimeZone());
        __CLR4_4_1hdchdcle6o79nr.R.inc(22524);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1hdchdcle6o79nr.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hdchdcle6o79nr.R.inc(22525);
        __CLR4_4_1hdchdcle6o79nr.R.inc(22526);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hdchdcle6o79nr.R.inc(22527);DateTimeZone.setDefault(zone);
        __CLR4_4_1hdchdcle6o79nr.R.inc(22528);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1hdchdcle6o79nr.R.inc(22529);Locale.setDefault(locale);
        __CLR4_4_1hdchdcle6o79nr.R.inc(22530);zone = null;
    }finally{__CLR4_4_1hdchdcle6o79nr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testConstructor_Chronology221() throws Throwable {__CLR4_4_1hdchdcle6o79nr.R.globalSliceStart(getClass().getName(),22531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12tuoehhdv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdchdcle6o79nr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdchdcle6o79nr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_Chronology221",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22531,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12tuoehhdv() throws Throwable{try{__CLR4_4_1hdchdcle6o79nr.R.inc(22531); 
     __CLR4_4_1hdchdcle6o79nr.R.inc(22532);DateTime test = new DateTime(GregorianChronology.getInstance()); 
     __CLR4_4_1hdchdcle6o79nr.R.inc(22533);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1hdchdcle6o79nr.R.inc(22534);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1hdchdcle6o79nr.R.flushNeeded();}}
public void testConstructor_Object_nullChronology224() throws Throwable {__CLR4_4_1hdchdcle6o79nr.R.globalSliceStart(getClass().getName(),22535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n12j7hdz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdchdcle6o79nr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdchdcle6o79nr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_Object_nullChronology224",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22535,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n12j7hdz() throws Throwable{try{__CLR4_4_1hdchdcle6o79nr.R.inc(22535); 
     __CLR4_4_1hdchdcle6o79nr.R.inc(22536);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1hdchdcle6o79nr.R.inc(22537);DateTime test = new DateTime(date, (Chronology) null); 
     __CLR4_4_1hdchdcle6o79nr.R.inc(22538);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1hdchdcle6o79nr.R.inc(22539);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1hdchdcle6o79nr.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    /**
     * Test now ()
     */
    

    /**
     * Test now (DateTimeZone)
     */
    

    /**
     * Test now (DateTimeZone=null)
     */
    

    /**
     * Test now (Chronology)
     */
    

    /**
     * Test now (Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    

    /**
     * Test constructor (DateTimeZone)
     */
    

    /**
     * Test constructor (DateTimeZone=null)
     */
    

    /**
     * Test constructor (Chronology)
     */
    

    /**
     * Test constructor (Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (long)
     */
    

    /**
     * Test constructor (long)
     */
    

    /**
     * Test constructor (long, DateTimeZone)
     */
    

    /**
     * Test constructor (long, DateTimeZone)
     */
    

    /**
     * Test constructor (long, DateTimeZone=null)
     */
    

    /**
     * Test constructor (long, Chronology)
     */
    

    /**
     * Test constructor (long, Chronology)
     */
    

    /**
     * Test constructor (long, Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    

    /**
     * Test constructor (Object)
     */
    

    /**
     * Test constructor (Object=null)
     */
    

    /**
     * Test constructor (Object=null)
     */
    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object, DateTimeZone)
     */
    

    /**
     * Test constructor (Object, DateTimeZone)
     */
    

    /**
     * Test constructor (Object=null, DateTimeZone)
     */
    

    /**
     * Test constructor (Object, DateTimeZone=null)
     */
    

    /**
     * Test constructor (Object=null, DateTimeZone=null)
     */
    

    /**
     * Test constructor (Object, DateTimeZone)
     */
    

    /**
     * Test constructor (Object, Chronology)
     */
    

    /**
     * Test constructor (Object, Chronology)
     */
    

    /**
     * Test constructor (Object=null, Chronology)
     */
    

    /**
     * Test constructor (Object, Chronology=null)
     */
    

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    

    /**
     * Test constructor (Object, Chronology)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int, int, int, int)
     */
    

    /**
     * Test constructor (int, int, int, int, int, DateTimeZone)
     */
    

    /**
     * Test constructor (int, int, int, int, int, DateTimeZone=null)
     */
    

    /**
     * Test constructor (int, int, int, int, int, Chronology)
     */
    

    /**
     * Test constructor (int, int, int, int, int, Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int, int, int, int, int)
     */
    

    /**
     * Test constructor (int, int, int, int, int, int, DateTimeZone)
     */
    

    /**
     * Test constructor (int, int, int, int, int, int, DateTimeZone=null)
     */
    

    /**
     * Test constructor (int, int, int, int, int, int, Chronology)
     */
    

    /**
     * Test constructor (int, int, int, int, int, int, Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int, int)
     */
    

    /**
     * Test constructor (int, int, int, DateTimeZone)
     */
    

    /**
     * Test constructor (int, int, int, DateTimeZone=null)
     */
    

    /**
     * Test constructor (int, int, int, Chronology)
     */
    

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    

}
