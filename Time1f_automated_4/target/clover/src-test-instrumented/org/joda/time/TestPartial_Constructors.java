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

import java.util.Arrays;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Partial.
 *
 * @author Stephen Colebourne
 */
public class TestPartial_Constructors extends TestCase {static class __CLR4_4_1jaqjaqle6o79z7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,25053,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1jaqjaqle6o79z7.R.inc(25010);
        __CLR4_4_1jaqjaqle6o79z7.R.inc(25011);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jaqjaqle6o79z7.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jaqjaqle6o79z7.R.inc(25012);
        __CLR4_4_1jaqjaqle6o79z7.R.inc(25013);return new TestSuite(TestPartial_Constructors.class);
    }finally{__CLR4_4_1jaqjaqle6o79z7.R.flushNeeded();}}

    public TestPartial_Constructors(String name) {
        super(name);__CLR4_4_1jaqjaqle6o79z7.R.inc(25015);try{__CLR4_4_1jaqjaqle6o79z7.R.inc(25014);
    }finally{__CLR4_4_1jaqjaqle6o79z7.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jaqjaqle6o79z7.R.inc(25016);
        __CLR4_4_1jaqjaqle6o79z7.R.inc(25017);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jaqjaqle6o79z7.R.inc(25018);zone = DateTimeZone.getDefault();
        __CLR4_4_1jaqjaqle6o79z7.R.inc(25019);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1jaqjaqle6o79z7.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jaqjaqle6o79z7.R.inc(25020);
        __CLR4_4_1jaqjaqle6o79z7.R.inc(25021);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jaqjaqle6o79z7.R.inc(25022);DateTimeZone.setDefault(zone);
        __CLR4_4_1jaqjaqle6o79z7.R.inc(25023);zone = null;
    }finally{__CLR4_4_1jaqjaqle6o79z7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
public void testMaximumValue175() {__CLR4_4_1jaqjaqle6o79z7.R.globalSliceStart(getClass().getName(),25024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ux0ngzjb4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jaqjaqle6o79z7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jaqjaqle6o79z7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testMaximumValue175",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25024,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ux0ngzjb4(){try{__CLR4_4_1jaqjaqle6o79z7.R.inc(25024); 
     __CLR4_4_1jaqjaqle6o79z7.R.inc(25025);YearMonthDay ymd1 = new YearMonthDay(1999, DateTimeConstants.FEBRUARY, 1); 
     __CLR4_4_1jaqjaqle6o79z7.R.inc(25026);DateMidnight dm1 = new DateMidnight(1999, DateTimeConstants.FEBRUARY, 1); 
     __CLR4_4_1jaqjaqle6o79z7.R.inc(25027);Chronology chrono = GregorianChronology.getInstance(); 
     __CLR4_4_1jaqjaqle6o79z7.R.inc(25028);assertEquals(28, chrono.dayOfMonth().getMaximumValue(ymd1)); 
     __CLR4_4_1jaqjaqle6o79z7.R.inc(25029);assertEquals(28, chrono.dayOfMonth().getMaximumValue(dm1.getMillis())); 
 }finally{__CLR4_4_1jaqjaqle6o79z7.R.flushNeeded();}}
public void testConstructor_Object_Chronology250() throws Throwable {__CLR4_4_1jaqjaqle6o79z7.R.globalSliceStart(getClass().getName(),25030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_158xg5vjba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jaqjaqle6o79z7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jaqjaqle6o79z7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_Object_Chronology250",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25030,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_158xg5vjba() throws Throwable{try{__CLR4_4_1jaqjaqle6o79z7.R.inc(25030); 
     __CLR4_4_1jaqjaqle6o79z7.R.inc(25031);Partial test = new Partial(DateTimeFieldType.era(), 1); 
     __CLR4_4_1jaqjaqle6o79z7.R.inc(25032);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1jaqjaqle6o79z7.R.inc(25033);assertEquals(1, test.size()); 
     __CLR4_4_1jaqjaqle6o79z7.R.inc(25034);assertEquals(1, test.getValue(0)); 
     __CLR4_4_1jaqjaqle6o79z7.R.inc(25035);try { 
         __CLR4_4_1jaqjaqle6o79z7.R.inc(25036);test = new Partial(null, 1); 
         __CLR4_4_1jaqjaqle6o79z7.R.inc(25037);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jaqjaqle6o79z7.R.flushNeeded();}}
public void testConstructorEx3_TypeArray_intArray251() throws Throwable {__CLR4_4_1jaqjaqle6o79z7.R.globalSliceStart(getClass().getName(),25038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13gunj8jbi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jaqjaqle6o79z7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jaqjaqle6o79z7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx3_TypeArray_intArray251",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13gunj8jbi() throws Throwable{try{__CLR4_4_1jaqjaqle6o79z7.R.inc(25038); 
     __CLR4_4_1jaqjaqle6o79z7.R.inc(25039);try { 
         __CLR4_4_1jaqjaqle6o79z7.R.inc(25040);new Partial(new DateTimeFieldType[] { DateTimeFieldType.dayOfYear() }, null); 
         __CLR4_4_1jaqjaqle6o79z7.R.inc(25041);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1jaqjaqle6o79z7.R.inc(25042);assertMessageContains(ex, "must not be null"); 
     } 
 }finally{__CLR4_4_1jaqjaqle6o79z7.R.flushNeeded();}}
public void testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths253() throws Throwable {__CLR4_4_1jaqjaqle6o79z7.R.globalSliceStart(getClass().getName(),25043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15twu02jbn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jaqjaqle6o79z7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jaqjaqle6o79z7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths253",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25043,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15twu02jbn() throws Throwable{try{__CLR4_4_1jaqjaqle6o79z7.R.inc(25043); 
     __CLR4_4_1jaqjaqle6o79z7.R.inc(25044);LocalDate dt1 = new LocalDate(2004, 12, 28); 
     __CLR4_4_1jaqjaqle6o79z7.R.inc(25045);LocalDate dt2 = new LocalDate(2005, 2, 28); 
     __CLR4_4_1jaqjaqle6o79z7.R.inc(25046);Period test = new Period(dt1, dt2); 
     __CLR4_4_1jaqjaqle6o79z7.R.inc(25047);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1jaqjaqle6o79z7.R.inc(25048);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test); 
 }finally{__CLR4_4_1jaqjaqle6o79z7.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    //-----------------------------------------------------------------------
    /**
     * Checks if the exception message is valid.
     * 
     * @param ex  the exception to check
     * @param str  the string to check
     */
    private void assertMessageContains(Exception ex, String str) {try{__CLR4_4_1jaqjaqle6o79z7.R.inc(25049);
        __CLR4_4_1jaqjaqle6o79z7.R.inc(25050);assertEquals(ex.getMessage() + ": " + str, true, ex.getMessage().indexOf(str) >= 0);
    }finally{__CLR4_4_1jaqjaqle6o79z7.R.flushNeeded();}}

    /**
     * Checks if the exception message is valid.
     * 
     * @param ex  the exception to check
     * @param str1  the string to check
     * @param str2  the string to check
     */
    private void assertMessageContains(Exception ex, String str1, String str2) {try{__CLR4_4_1jaqjaqle6o79z7.R.inc(25051);
        __CLR4_4_1jaqjaqle6o79z7.R.inc(25052);assertEquals(ex.getMessage() + ": " + str1 + "/" + str2, true,
            ex.getMessage().indexOf(str1) >= 0 &&
            ex.getMessage().indexOf(str2) >= 0 &&
            ex.getMessage().indexOf(str1) < ex.getMessage().indexOf(str2));
    }finally{__CLR4_4_1jaqjaqle6o79z7.R.flushNeeded();}}

}
