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
public class TestDateTime_Constructors extends TestCase {static class __CLR4_4_1iugiuglc8axdrr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,24514,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1iugiuglc8axdrr.R.inc(24424);
        __CLR4_4_1iugiuglc8axdrr.R.inc(24425);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1iugiuglc8axdrr.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1iugiuglc8axdrr.R.inc(24426);
        __CLR4_4_1iugiuglc8axdrr.R.inc(24427);return new TestSuite(TestDateTime_Constructors.class);
    }finally{__CLR4_4_1iugiuglc8axdrr.R.flushNeeded();}}

    public TestDateTime_Constructors(String name) {
        super(name);__CLR4_4_1iugiuglc8axdrr.R.inc(24429);try{__CLR4_4_1iugiuglc8axdrr.R.inc(24428);
    }finally{__CLR4_4_1iugiuglc8axdrr.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1iugiuglc8axdrr.R.inc(24430);
        __CLR4_4_1iugiuglc8axdrr.R.inc(24431);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1iugiuglc8axdrr.R.inc(24432);zone = DateTimeZone.getDefault();
        __CLR4_4_1iugiuglc8axdrr.R.inc(24433);locale = Locale.getDefault();
        __CLR4_4_1iugiuglc8axdrr.R.inc(24434);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1iugiuglc8axdrr.R.inc(24435);java.util.TimeZone.setDefault(LONDON.toTimeZone());
        __CLR4_4_1iugiuglc8axdrr.R.inc(24436);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1iugiuglc8axdrr.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1iugiuglc8axdrr.R.inc(24437);
        __CLR4_4_1iugiuglc8axdrr.R.inc(24438);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1iugiuglc8axdrr.R.inc(24439);DateTimeZone.setDefault(zone);
        __CLR4_4_1iugiuglc8axdrr.R.inc(24440);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1iugiuglc8axdrr.R.inc(24441);Locale.setDefault(locale);
        __CLR4_4_1iugiuglc8axdrr.R.inc(24442);zone = null;
    }finally{__CLR4_4_1iugiuglc8axdrr.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor_nullObject249() throws Throwable {__CLR4_4_1iugiuglc8axdrr.R.globalSliceStart(getClass().getName(),24443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1emf5y9iuz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iugiuglc8axdrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iugiuglc8axdrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_nullObject249",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24443,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1emf5y9iuz() throws Throwable{try{__CLR4_4_1iugiuglc8axdrr.R.inc(24443); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24444);DateTime test = new DateTime((Object) null); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24445);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24446);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1iugiuglc8axdrr.R.flushNeeded();}} 


public void testConstructor273() throws Throwable {__CLR4_4_1iugiuglc8axdrr.R.globalSliceStart(getClass().getName(),24447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a37oj7iv3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iugiuglc8axdrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iugiuglc8axdrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor273",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a37oj7iv3() throws Throwable{try{__CLR4_4_1iugiuglc8axdrr.R.inc(24447); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24448);DateTime test = new DateTime(); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24449);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24450);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1iugiuglc8axdrr.R.flushNeeded();}} 


public void testConstructor_DateTimeZone390() throws Throwable {__CLR4_4_1iugiuglc8axdrr.R.globalSliceStart(getClass().getName(),24451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_142ehf7iv7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iugiuglc8axdrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iugiuglc8axdrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_DateTimeZone390",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_142ehf7iv7() throws Throwable{try{__CLR4_4_1iugiuglc8axdrr.R.inc(24451); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24452);DateTime test = new DateTime(PARIS); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24453);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24454);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1iugiuglc8axdrr.R.flushNeeded();}} 


public void testConstructor_int_int_int_int_int_int607() throws Throwable {__CLR4_4_1iugiuglc8axdrr.R.globalSliceStart(getClass().getName(),24455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_190l3y4ivb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iugiuglc8axdrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iugiuglc8axdrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_int607",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_190l3y4ivb() throws Throwable{try{__CLR4_4_1iugiuglc8axdrr.R.inc(24455); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24456);DateTime test = new DateTime(2002, 6, 9, 1, 0, 0); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24457);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24458);assertEquals(LONDON, test.getZone()); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24459);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1iugiuglc8axdrr.R.flushNeeded();}} 


public void testConstructor_Chronology696() throws Throwable {__CLR4_4_1iugiuglc8axdrr.R.globalSliceStart(getClass().getName(),24460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15h3wrvivg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iugiuglc8axdrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iugiuglc8axdrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_Chronology696",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15h3wrvivg() throws Throwable{try{__CLR4_4_1iugiuglc8axdrr.R.inc(24460); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24461);DateTime test = new DateTime(GregorianChronology.getInstance()); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24462);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24463);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1iugiuglc8axdrr.R.flushNeeded();}} 


public void test_now_nullDateTimeZone719() throws Throwable {__CLR4_4_1iugiuglc8axdrr.R.globalSliceStart(getClass().getName(),24464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vafnj2ivk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iugiuglc8axdrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iugiuglc8axdrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.test_now_nullDateTimeZone719",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24464,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vafnj2ivk() throws Throwable{try{__CLR4_4_1iugiuglc8axdrr.R.inc(24464); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24465);try { 
         __CLR4_4_1iugiuglc8axdrr.R.inc(24466);DateTime.now((DateTimeZone) null); 
         __CLR4_4_1iugiuglc8axdrr.R.inc(24467);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1iugiuglc8axdrr.R.flushNeeded();}} 


public void testConstructor_int_int_int_int_int_Chronology982() throws Throwable {__CLR4_4_1iugiuglc8axdrr.R.globalSliceStart(getClass().getName(),24468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bn8rzvivo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iugiuglc8axdrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iugiuglc8axdrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_Chronology982",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bn8rzvivo() throws Throwable{try{__CLR4_4_1iugiuglc8axdrr.R.inc(24468); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24469);DateTime test = new DateTime(2002, 6, 9, 1, 0, GregorianChronology.getInstance()); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24470);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24471);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1iugiuglc8axdrr.R.flushNeeded();}} 


public void testConstructor_int_int_int_int_int_int_Chronology1086() throws Throwable {__CLR4_4_1iugiuglc8axdrr.R.globalSliceStart(getClass().getName(),24472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hn7cpfivs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iugiuglc8axdrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iugiuglc8axdrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_int_Chronology1086",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hn7cpfivs() throws Throwable{try{__CLR4_4_1iugiuglc8axdrr.R.inc(24472); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24473);DateTime test = new DateTime(2002, 6, 9, 1, 0, 0, GregorianChronology.getInstance()); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24474);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24475);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1iugiuglc8axdrr.R.flushNeeded();}} 


public void testConstructor_long_nullDateTimeZone1222() throws Throwable {__CLR4_4_1iugiuglc8axdrr.R.globalSliceStart(getClass().getName(),24476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tp5kseivw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iugiuglc8axdrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iugiuglc8axdrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_long_nullDateTimeZone1222",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24476,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tp5kseivw() throws Throwable{try{__CLR4_4_1iugiuglc8axdrr.R.inc(24476); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24477);DateTime test = new DateTime(TEST_TIME1, (DateTimeZone) null); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24478);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24479);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1iugiuglc8axdrr.R.flushNeeded();}} 


public void test_now1279() throws Throwable {__CLR4_4_1iugiuglc8axdrr.R.globalSliceStart(getClass().getName(),24480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ke7eeriw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iugiuglc8axdrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iugiuglc8axdrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.test_now1279",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ke7eeriw0() throws Throwable{try{__CLR4_4_1iugiuglc8axdrr.R.inc(24480); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24481);DateTime test = DateTime.now(); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24482);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24483);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1iugiuglc8axdrr.R.flushNeeded();}} 


public void testConstructor_Object_Chronology1308() throws Throwable {__CLR4_4_1iugiuglc8axdrr.R.globalSliceStart(getClass().getName(),24484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1baxj02iw4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iugiuglc8axdrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iugiuglc8axdrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_Object_Chronology1308",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1baxj02iw4() throws Throwable{try{__CLR4_4_1iugiuglc8axdrr.R.inc(24484); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24485);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24486);DateTime test = new DateTime(date, GregorianChronology.getInstance()); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24487);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24488);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1iugiuglc8axdrr.R.flushNeeded();}} 


public void test_now_Chronology1367() throws Throwable {__CLR4_4_1iugiuglc8axdrr.R.globalSliceStart(getClass().getName(),24489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16fm33ciw9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iugiuglc8axdrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iugiuglc8axdrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.test_now_Chronology1367",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24489,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16fm33ciw9() throws Throwable{try{__CLR4_4_1iugiuglc8axdrr.R.inc(24489); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24490);DateTime test = DateTime.now(GregorianChronology.getInstance()); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24491);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24492);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1iugiuglc8axdrr.R.flushNeeded();}} 


public void testParse_formatter1386() throws Throwable {__CLR4_4_1iugiuglc8axdrr.R.globalSliceStart(getClass().getName(),24493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iyxphpiwd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iugiuglc8axdrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iugiuglc8axdrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testParse_formatter1386",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24493,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iyxphpiwd() throws Throwable{try{__CLR4_4_1iugiuglc8axdrr.R.inc(24493); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24494);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--dd MM HH").withChronology(ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24495);assertEquals(new DateTime(2010, 6, 30, 13, 0, ISOChronology.getInstance(PARIS)), DateTime.parse("2010--30 06 13", f)); 
 }finally{__CLR4_4_1iugiuglc8axdrr.R.flushNeeded();}} 


public void test_now_DateTimeZone1571() throws Throwable {__CLR4_4_1iugiuglc8axdrr.R.globalSliceStart(getClass().getName(),24496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xku2qiwg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iugiuglc8axdrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iugiuglc8axdrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.test_now_DateTimeZone1571",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24496,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xku2qiwg() throws Throwable{try{__CLR4_4_1iugiuglc8axdrr.R.inc(24496); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24497);DateTime test = DateTime.now(PARIS); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24498);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24499);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1iugiuglc8axdrr.R.flushNeeded();}} 


public void testConstructor_Object_nullChronology1577() throws Throwable {__CLR4_4_1iugiuglc8axdrr.R.globalSliceStart(getClass().getName(),24500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ycqyz1iwk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iugiuglc8axdrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iugiuglc8axdrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_Object_nullChronology1577",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ycqyz1iwk() throws Throwable{try{__CLR4_4_1iugiuglc8axdrr.R.inc(24500); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24501);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24502);DateTime test = new DateTime(date, (Chronology) null); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24503);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24504);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1iugiuglc8axdrr.R.flushNeeded();}} 


public void test_now_nullChronology1617() throws Throwable {__CLR4_4_1iugiuglc8axdrr.R.globalSliceStart(getClass().getName(),24505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eawtndiwp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iugiuglc8axdrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iugiuglc8axdrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.test_now_nullChronology1617",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eawtndiwp() throws Throwable{try{__CLR4_4_1iugiuglc8axdrr.R.inc(24505); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24506);try { 
         __CLR4_4_1iugiuglc8axdrr.R.inc(24507);DateTime.now((Chronology) null); 
         __CLR4_4_1iugiuglc8axdrr.R.inc(24508);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1iugiuglc8axdrr.R.flushNeeded();}} 


public void testConstructor_int_int_int_int_int1713() throws Throwable {__CLR4_4_1iugiuglc8axdrr.R.globalSliceStart(getClass().getName(),24509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jxf3lziwt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iugiuglc8axdrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iugiuglc8axdrr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int1713",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jxf3lziwt() throws Throwable{try{__CLR4_4_1iugiuglc8axdrr.R.inc(24509); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24510);DateTime test = new DateTime(2002, 6, 9, 1, 0); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24511);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24512);assertEquals(LONDON, test.getZone()); 
     __CLR4_4_1iugiuglc8axdrr.R.inc(24513);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1iugiuglc8axdrr.R.flushNeeded();}} 

    

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
