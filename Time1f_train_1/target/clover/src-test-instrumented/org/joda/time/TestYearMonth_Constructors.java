/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
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

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for YearMonth.
 *
 * @author Stephen Colebourne
 */
public class TestYearMonth_Constructors extends TestCase {static class __CLR4_4_1pbkpbkle6qeaak{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,32887,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1pbkpbkle6qeaak.R.inc(32816);
        __CLR4_4_1pbkpbkle6qeaak.R.inc(32817);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1pbkpbkle6qeaak.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1pbkpbkle6qeaak.R.inc(32818);
        __CLR4_4_1pbkpbkle6qeaak.R.inc(32819);return new TestSuite(TestYearMonth_Constructors.class);
    }finally{__CLR4_4_1pbkpbkle6qeaak.R.flushNeeded();}}

    public TestYearMonth_Constructors(String name) {
        super(name);__CLR4_4_1pbkpbkle6qeaak.R.inc(32821);try{__CLR4_4_1pbkpbkle6qeaak.R.inc(32820);
    }finally{__CLR4_4_1pbkpbkle6qeaak.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1pbkpbkle6qeaak.R.inc(32822);
        __CLR4_4_1pbkpbkle6qeaak.R.inc(32823);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1pbkpbkle6qeaak.R.inc(32824);zone = DateTimeZone.getDefault();
        __CLR4_4_1pbkpbkle6qeaak.R.inc(32825);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1pbkpbkle6qeaak.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1pbkpbkle6qeaak.R.inc(32826);
        __CLR4_4_1pbkpbkle6qeaak.R.inc(32827);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1pbkpbkle6qeaak.R.inc(32828);DateTimeZone.setDefault(zone);
        __CLR4_4_1pbkpbkle6qeaak.R.inc(32829);zone = null;
    }finally{__CLR4_4_1pbkpbkle6qeaak.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor_DateTimeZone346() throws Throwable {__CLR4_4_1pbkpbkle6qeaak.R.globalSliceStart(getClass().getName(),32830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h1bvempby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pbkpbkle6qeaak.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pbkpbkle6qeaak.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_DateTimeZone346",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h1bvempby() throws Throwable{try{__CLR4_4_1pbkpbkle6qeaak.R.inc(32830); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32831);DateTime dt = new DateTime(2005, 6, 30, 23, 59, 0, 0, LONDON); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32832);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32833);YearMonth test = new YearMonth(LONDON); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32834);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32835);assertEquals(2005, test.getYear()); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32836);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32837);assertEquals(test, YearMonth.now(LONDON)); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32838);test = new YearMonth(PARIS); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32839);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32840);assertEquals(2005, test.getYear()); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32841);assertEquals(7, test.getMonthOfYear()); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32842);assertEquals(test, YearMonth.now(PARIS)); 
 }finally{__CLR4_4_1pbkpbkle6qeaak.R.flushNeeded();}} 


public void testParse_noFormatter347() throws Throwable {__CLR4_4_1pbkpbkle6qeaak.R.globalSliceStart(getClass().getName(),32843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17z5zhupcb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pbkpbkle6qeaak.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pbkpbkle6qeaak.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testParse_noFormatter347",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17z5zhupcb() throws Throwable{try{__CLR4_4_1pbkpbkle6qeaak.R.inc(32843); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32844);assertEquals(new YearMonth(2010, 6), YearMonth.parse("2010-06-30")); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32845);assertEquals(new YearMonth(2010, 1), YearMonth.parse("2010-002")); 
 }finally{__CLR4_4_1pbkpbkle6qeaak.R.flushNeeded();}} 


public void testFactory_FromDateFields348() throws Exception {__CLR4_4_1pbkpbkle6qeaak.R.globalSliceStart(getClass().getName(),32846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12d2uhypce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pbkpbkle6qeaak.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pbkpbkle6qeaak.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testFactory_FromDateFields348",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32846,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12d2uhypce() throws Exception{try{__CLR4_4_1pbkpbkle6qeaak.R.inc(32846); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32847);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32848);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32849);YearMonth expected = new YearMonth(1970, 2); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32850);assertEquals(expected, YearMonth.fromDateFields(cal.getTime())); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32851);try { 
         __CLR4_4_1pbkpbkle6qeaak.R.inc(32852);YearMonth.fromDateFields(null); 
         __CLR4_4_1pbkpbkle6qeaak.R.inc(32853);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1pbkpbkle6qeaak.R.flushNeeded();}} 


public void testConstructor_nullChronology349() throws Throwable {__CLR4_4_1pbkpbkle6qeaak.R.globalSliceStart(getClass().getName(),32854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rwlnc9pcm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pbkpbkle6qeaak.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pbkpbkle6qeaak.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_nullChronology349",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rwlnc9pcm() throws Throwable{try{__CLR4_4_1pbkpbkle6qeaak.R.inc(32854); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32855);YearMonth test = new YearMonth((Chronology) null); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32856);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32857);assertEquals(1970, test.getYear()); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32858);assertEquals(6, test.getMonthOfYear()); 
 }finally{__CLR4_4_1pbkpbkle6qeaak.R.flushNeeded();}} 


public void testConstructor_long1_Chronology350() throws Throwable {__CLR4_4_1pbkpbkle6qeaak.R.globalSliceStart(getClass().getName(),32859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17uvqm4pcr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pbkpbkle6qeaak.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pbkpbkle6qeaak.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_long1_Chronology350",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17uvqm4pcr() throws Throwable{try{__CLR4_4_1pbkpbkle6qeaak.R.inc(32859); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32860);YearMonth test = new YearMonth(TEST_TIME1, GREGORIAN_PARIS); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32861);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32862);assertEquals(1970, test.getYear()); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32863);assertEquals(4, test.getMonthOfYear()); 
 }finally{__CLR4_4_1pbkpbkle6qeaak.R.flushNeeded();}} 


public void testConstructor_Object351() throws Throwable {__CLR4_4_1pbkpbkle6qeaak.R.globalSliceStart(getClass().getName(),32864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yw394wpcw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pbkpbkle6qeaak.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pbkpbkle6qeaak.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_Object351",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yw394wpcw() throws Throwable{try{__CLR4_4_1pbkpbkle6qeaak.R.inc(32864); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32865);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32866);YearMonth test = new YearMonth(date); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32867);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32868);assertEquals(1970, test.getYear()); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32869);assertEquals(4, test.getMonthOfYear()); 
 }finally{__CLR4_4_1pbkpbkle6qeaak.R.flushNeeded();}} 


public void testConstructor_int_int_Chronology1355() throws Throwable {__CLR4_4_1pbkpbkle6qeaak.R.globalSliceStart(getClass().getName(),32870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xon3fcpd2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pbkpbkle6qeaak.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pbkpbkle6qeaak.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_int_int_Chronology1355",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xon3fcpd2() throws Throwable{try{__CLR4_4_1pbkpbkle6qeaak.R.inc(32870); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32871);YearMonth test = new YearMonth(1970, 6, GREGORIAN_PARIS); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32872);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32873);assertEquals(1970, test.getYear()); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32874);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32875);try { 
         __CLR4_4_1pbkpbkle6qeaak.R.inc(32876);new YearMonth(Integer.MIN_VALUE, 6, GREGORIAN_PARIS); 
         __CLR4_4_1pbkpbkle6qeaak.R.inc(32877);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32878);try { 
         __CLR4_4_1pbkpbkle6qeaak.R.inc(32879);new YearMonth(Integer.MAX_VALUE, 6, GREGORIAN_PARIS); 
         __CLR4_4_1pbkpbkle6qeaak.R.inc(32880);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32881);try { 
         __CLR4_4_1pbkpbkle6qeaak.R.inc(32882);new YearMonth(1970, 0, GREGORIAN_PARIS); 
         __CLR4_4_1pbkpbkle6qeaak.R.inc(32883);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1pbkpbkle6qeaak.R.inc(32884);try { 
         __CLR4_4_1pbkpbkle6qeaak.R.inc(32885);new YearMonth(1970, 13, GREGORIAN_PARIS); 
         __CLR4_4_1pbkpbkle6qeaak.R.inc(32886);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1pbkpbkle6qeaak.R.flushNeeded();}} 

    

    

    //-----------------------------------------------------------------------
    

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
     * Test constructor (long, Chronology)
     */
    

    /**
     * Test constructor (long, Chronology)
     */
    

    /**
     * Test constructor (long, Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
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
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int)
     */
    

    /**
     * Test constructor (int, int, Chronology)
     */
    

    /**
     * Test constructor (int, int, Chronology=null)
     */
    

}
