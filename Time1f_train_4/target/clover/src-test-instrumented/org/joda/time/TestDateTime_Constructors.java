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
public class TestDateTime_Constructors extends TestCase {static class __CLR4_4_1in1in1le6rjca4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,24229,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1in1in1le6rjca4.R.inc(24157);
        __CLR4_4_1in1in1le6rjca4.R.inc(24158);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1in1in1le6rjca4.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1in1in1le6rjca4.R.inc(24159);
        __CLR4_4_1in1in1le6rjca4.R.inc(24160);return new TestSuite(TestDateTime_Constructors.class);
    }finally{__CLR4_4_1in1in1le6rjca4.R.flushNeeded();}}

    public TestDateTime_Constructors(String name) {
        super(name);__CLR4_4_1in1in1le6rjca4.R.inc(24162);try{__CLR4_4_1in1in1le6rjca4.R.inc(24161);
    }finally{__CLR4_4_1in1in1le6rjca4.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1in1in1le6rjca4.R.inc(24163);
        __CLR4_4_1in1in1le6rjca4.R.inc(24164);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1in1in1le6rjca4.R.inc(24165);zone = DateTimeZone.getDefault();
        __CLR4_4_1in1in1le6rjca4.R.inc(24166);locale = Locale.getDefault();
        __CLR4_4_1in1in1le6rjca4.R.inc(24167);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1in1in1le6rjca4.R.inc(24168);java.util.TimeZone.setDefault(LONDON.toTimeZone());
        __CLR4_4_1in1in1le6rjca4.R.inc(24169);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1in1in1le6rjca4.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1in1in1le6rjca4.R.inc(24170);
        __CLR4_4_1in1in1le6rjca4.R.inc(24171);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1in1in1le6rjca4.R.inc(24172);DateTimeZone.setDefault(zone);
        __CLR4_4_1in1in1le6rjca4.R.inc(24173);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1in1in1le6rjca4.R.inc(24174);Locale.setDefault(locale);
        __CLR4_4_1in1in1le6rjca4.R.inc(24175);zone = null;
    }finally{__CLR4_4_1in1in1le6rjca4.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_now564() throws Throwable {__CLR4_4_1in1in1le6rjca4.R.globalSliceStart(getClass().getName(),24176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yyy6b5ink();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1in1in1le6rjca4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1in1in1le6rjca4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.test_now564",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yyy6b5ink() throws Throwable{try{__CLR4_4_1in1in1le6rjca4.R.inc(24176); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24177);DateTime test = DateTime.now(); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24178);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24179);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1in1in1le6rjca4.R.flushNeeded();}} 


public void test_now_nullDateTimeZone565() throws Throwable {__CLR4_4_1in1in1le6rjca4.R.globalSliceStart(getClass().getName(),24180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xhnq7dino();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1in1in1le6rjca4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1in1in1le6rjca4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.test_now_nullDateTimeZone565",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xhnq7dino() throws Throwable{try{__CLR4_4_1in1in1le6rjca4.R.inc(24180); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24181);try { 
         __CLR4_4_1in1in1le6rjca4.R.inc(24182);DateTime.now((DateTimeZone) null); 
         __CLR4_4_1in1in1le6rjca4.R.inc(24183);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1in1in1le6rjca4.R.flushNeeded();}} 


public void test_now_DateTimeZone566() throws Throwable {__CLR4_4_1in1in1le6rjca4.R.globalSliceStart(getClass().getName(),24184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pukbunins();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1in1in1le6rjca4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1in1in1le6rjca4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.test_now_DateTimeZone566",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pukbunins() throws Throwable{try{__CLR4_4_1in1in1le6rjca4.R.inc(24184); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24185);DateTime test = DateTime.now(PARIS); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24186);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24187);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1in1in1le6rjca4.R.flushNeeded();}} 


public void test_now_Chronology567() throws Throwable {__CLR4_4_1in1in1le6rjca4.R.globalSliceStart(getClass().getName(),24188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t1x14finw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1in1in1le6rjca4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1in1in1le6rjca4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.test_now_Chronology567",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t1x14finw() throws Throwable{try{__CLR4_4_1in1in1le6rjca4.R.inc(24188); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24189);DateTime test = DateTime.now(GregorianChronology.getInstance()); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24190);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24191);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1in1in1le6rjca4.R.flushNeeded();}} 


public void test_now_nullChronology568() throws Throwable {__CLR4_4_1in1in1le6rjca4.R.globalSliceStart(getClass().getName(),24192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11wiirbio0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1in1in1le6rjca4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1in1in1le6rjca4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.test_now_nullChronology568",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11wiirbio0() throws Throwable{try{__CLR4_4_1in1in1le6rjca4.R.inc(24192); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24193);try { 
         __CLR4_4_1in1in1le6rjca4.R.inc(24194);DateTime.now((Chronology) null); 
         __CLR4_4_1in1in1le6rjca4.R.inc(24195);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1in1in1le6rjca4.R.flushNeeded();}} 


public void testParse_formatter570() throws Throwable {__CLR4_4_1in1in1le6rjca4.R.globalSliceStart(getClass().getName(),24196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12utpmfio4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1in1in1le6rjca4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1in1in1le6rjca4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testParse_formatter570",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24196,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12utpmfio4() throws Throwable{try{__CLR4_4_1in1in1le6rjca4.R.inc(24196); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24197);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--dd MM HH").withChronology(ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24198);assertEquals(new DateTime(2010, 6, 30, 13, 0, ISOChronology.getInstance(PARIS)), DateTime.parse("2010--30 06 13", f)); 
 }finally{__CLR4_4_1in1in1le6rjca4.R.flushNeeded();}} 


public void testConstructor571() throws Throwable {__CLR4_4_1in1in1le6rjca4.R.globalSliceStart(getClass().getName(),24199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mzropeio7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1in1in1le6rjca4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1in1in1le6rjca4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor571",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24199,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mzropeio7() throws Throwable{try{__CLR4_4_1in1in1le6rjca4.R.inc(24199); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24200);DateTime test = new DateTime(); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24201);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24202);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1in1in1le6rjca4.R.flushNeeded();}} 


public void testConstructor_DateTimeZone572() throws Throwable {__CLR4_4_1in1in1le6rjca4.R.globalSliceStart(getClass().getName(),24203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hw3a61iob();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1in1in1le6rjca4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1in1in1le6rjca4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_DateTimeZone572",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hw3a61iob() throws Throwable{try{__CLR4_4_1in1in1le6rjca4.R.inc(24203); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24204);DateTime test = new DateTime(PARIS); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24205);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24206);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1in1in1le6rjca4.R.flushNeeded();}} 


public void testConstructor_nullObject573() throws Throwable {__CLR4_4_1in1in1le6rjca4.R.globalSliceStart(getClass().getName(),24207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16uby9niof();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1in1in1le6rjca4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1in1in1le6rjca4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_nullObject573",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16uby9niof() throws Throwable{try{__CLR4_4_1in1in1le6rjca4.R.inc(24207); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24208);DateTime test = new DateTime((Object) null); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24209);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24210);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1in1in1le6rjca4.R.flushNeeded();}} 


public void testConstructor_int_int_int_int_int575() throws Throwable {__CLR4_4_1in1in1le6rjca4.R.globalSliceStart(getClass().getName(),24211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1stmi82ioj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1in1in1le6rjca4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1in1in1le6rjca4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int575",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1stmi82ioj() throws Throwable{try{__CLR4_4_1in1in1le6rjca4.R.inc(24211); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24212);DateTime test = new DateTime(2002, 6, 9, 1, 0); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24213);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24214);assertEquals(LONDON, test.getZone()); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24215);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1in1in1le6rjca4.R.flushNeeded();}} 


public void testConstructor_int_int_int_int_int_Chronology576() throws Throwable {__CLR4_4_1in1in1le6rjca4.R.globalSliceStart(getClass().getName(),24216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13gsi2kioo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1in1in1le6rjca4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1in1in1le6rjca4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_Chronology576",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24216,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13gsi2kioo() throws Throwable{try{__CLR4_4_1in1in1le6rjca4.R.inc(24216); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24217);DateTime test = new DateTime(2002, 6, 9, 1, 0, GregorianChronology.getInstance()); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24218);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24219);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1in1in1le6rjca4.R.flushNeeded();}} 


public void testConstructor_int_int_int_int_int_int577() throws Throwable {__CLR4_4_1in1in1le6rjca4.R.globalSliceStart(getClass().getName(),24220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1633yokios();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1in1in1le6rjca4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1in1in1le6rjca4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_int577",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1633yokios() throws Throwable{try{__CLR4_4_1in1in1le6rjca4.R.inc(24220); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24221);DateTime test = new DateTime(2002, 6, 9, 1, 0, 0); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24222);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24223);assertEquals(LONDON, test.getZone()); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24224);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1in1in1le6rjca4.R.flushNeeded();}} 


public void testConstructor_int_int_int_int_int_int_Chronology579() throws Throwable {__CLR4_4_1in1in1le6rjca4.R.globalSliceStart(getClass().getName(),24225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1igi0mpiox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1in1in1le6rjca4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1in1in1le6rjca4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_int_Chronology579",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1igi0mpiox() throws Throwable{try{__CLR4_4_1in1in1le6rjca4.R.inc(24225); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24226);DateTime test = new DateTime(2002, 6, 9, 1, 0, 0, GregorianChronology.getInstance()); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24227);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1in1in1le6rjca4.R.inc(24228);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1in1in1le6rjca4.R.flushNeeded();}} 

    

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
