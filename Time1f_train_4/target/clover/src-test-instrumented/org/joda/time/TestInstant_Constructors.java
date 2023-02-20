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
package org.joda.time;

import java.util.Date;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.MockZeroNullIntegerConverter;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestInstant_Constructors extends TestCase {static class __CLR4_4_1jr6jr6le6rjceq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,25635,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    // 1970-06-09
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 1970-04-05
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 1971-05-06
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) {try{__CLR4_4_1jr6jr6le6rjceq.R.inc(25602);
        __CLR4_4_1jr6jr6le6rjceq.R.inc(25603);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jr6jr6le6rjceq.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jr6jr6le6rjceq.R.inc(25604);
        __CLR4_4_1jr6jr6le6rjceq.R.inc(25605);return new TestSuite(TestInstant_Constructors.class);
    }finally{__CLR4_4_1jr6jr6le6rjceq.R.flushNeeded();}}

    public TestInstant_Constructors(String name) {
        super(name);__CLR4_4_1jr6jr6le6rjceq.R.inc(25607);try{__CLR4_4_1jr6jr6le6rjceq.R.inc(25606);
    }finally{__CLR4_4_1jr6jr6le6rjceq.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jr6jr6le6rjceq.R.inc(25608);
        __CLR4_4_1jr6jr6le6rjceq.R.inc(25609);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jr6jr6le6rjceq.R.inc(25610);zone = DateTimeZone.getDefault();
        __CLR4_4_1jr6jr6le6rjceq.R.inc(25611);locale = Locale.getDefault();
        __CLR4_4_1jr6jr6le6rjceq.R.inc(25612);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1jr6jr6le6rjceq.R.inc(25613);java.util.TimeZone.setDefault(LONDON.toTimeZone());
        __CLR4_4_1jr6jr6le6rjceq.R.inc(25614);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1jr6jr6le6rjceq.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jr6jr6le6rjceq.R.inc(25615);
        __CLR4_4_1jr6jr6le6rjceq.R.inc(25616);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jr6jr6le6rjceq.R.inc(25617);DateTimeZone.setDefault(zone);
        __CLR4_4_1jr6jr6le6rjceq.R.inc(25618);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1jr6jr6le6rjceq.R.inc(25619);Locale.setDefault(locale);
        __CLR4_4_1jr6jr6le6rjceq.R.inc(25620);zone = null;
    }finally{__CLR4_4_1jr6jr6le6rjceq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test now ()
     */

public void testConstructor_badconverterObject52() throws Throwable {__CLR4_4_1jr6jr6le6rjceq.R.globalSliceStart(getClass().getName(),25621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bmsx5hjrp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr6jr6le6rjceq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr6jr6le6rjceq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.testConstructor_badconverterObject52",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bmsx5hjrp() throws Throwable{try{__CLR4_4_1jr6jr6le6rjceq.R.inc(25621); 
     __CLR4_4_1jr6jr6le6rjceq.R.inc(25622);try { 
         __CLR4_4_1jr6jr6le6rjceq.R.inc(25623);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE); 
         __CLR4_4_1jr6jr6le6rjceq.R.inc(25624);Instant test = new Instant(new Integer(0)); 
         __CLR4_4_1jr6jr6le6rjceq.R.inc(25625);assertEquals(ISOChronology.getInstanceUTC(), test.getChronology()); 
         __CLR4_4_1jr6jr6le6rjceq.R.inc(25626);assertEquals(0L, test.getMillis()); 
     } finally { 
         __CLR4_4_1jr6jr6le6rjceq.R.inc(25627);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE); 
     } 
 }finally{__CLR4_4_1jr6jr6le6rjceq.R.flushNeeded();}} 


public void testParse_noFormatter703() throws Throwable {__CLR4_4_1jr6jr6le6rjceq.R.globalSliceStart(getClass().getName(),25628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19mjunqjrw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr6jr6le6rjceq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr6jr6le6rjceq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.testParse_noFormatter703",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25628,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19mjunqjrw() throws Throwable{try{__CLR4_4_1jr6jr6le6rjceq.R.inc(25628); 
     __CLR4_4_1jr6jr6le6rjceq.R.inc(25629);assertEquals(new DateTime(2010, 6, 30, 0, 20, ISOChronology.getInstance(LONDON)).toInstant(), Instant.parse("2010-06-30T01:20+02:00")); 
     __CLR4_4_1jr6jr6le6rjceq.R.inc(25630);assertEquals(new DateTime(2010, 1, 2, 14, 50, ISOChronology.getInstance(LONDON)).toInstant(), Instant.parse("2010-002T14:50")); 
 }finally{__CLR4_4_1jr6jr6le6rjceq.R.flushNeeded();}} 


public void testConstructor_nullObject705() throws Throwable {__CLR4_4_1jr6jr6le6rjceq.R.globalSliceStart(getClass().getName(),25631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e4yc92jrz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jr6jr6le6rjceq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jr6jr6le6rjceq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.testConstructor_nullObject705",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e4yc92jrz() throws Throwable{try{__CLR4_4_1jr6jr6le6rjceq.R.inc(25631); 
     __CLR4_4_1jr6jr6le6rjceq.R.inc(25632);Instant test = new Instant((Object) null); 
     __CLR4_4_1jr6jr6le6rjceq.R.inc(25633);assertEquals(ISOChronology.getInstanceUTC(), test.getChronology()); 
     __CLR4_4_1jr6jr6le6rjceq.R.inc(25634);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1jr6jr6le6rjceq.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (long)
     */
    

    /**
     * Test constructor (long)
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
    

}
