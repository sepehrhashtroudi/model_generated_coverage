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
 * This class is a Junit unit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Constructors extends TestCase {static class __CLR4_4_1lzelzele6rclde{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,28555,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1lzelzele6rclde.R.inc(28490);
        __CLR4_4_1lzelzele6rclde.R.inc(28491);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lzelzele6rclde.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lzelzele6rclde.R.inc(28492);
        __CLR4_4_1lzelzele6rclde.R.inc(28493);return new TestSuite(TestMutableDateTime_Constructors.class);
    }finally{__CLR4_4_1lzelzele6rclde.R.flushNeeded();}}

    public TestMutableDateTime_Constructors(String name) {
        super(name);__CLR4_4_1lzelzele6rclde.R.inc(28495);try{__CLR4_4_1lzelzele6rclde.R.inc(28494);
    }finally{__CLR4_4_1lzelzele6rclde.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lzelzele6rclde.R.inc(28496);
        __CLR4_4_1lzelzele6rclde.R.inc(28497);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1lzelzele6rclde.R.inc(28498);zone = DateTimeZone.getDefault();
        __CLR4_4_1lzelzele6rclde.R.inc(28499);locale = Locale.getDefault();
        __CLR4_4_1lzelzele6rclde.R.inc(28500);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1lzelzele6rclde.R.inc(28501);java.util.TimeZone.setDefault(LONDON.toTimeZone());
        __CLR4_4_1lzelzele6rclde.R.inc(28502);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1lzelzele6rclde.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lzelzele6rclde.R.inc(28503);
        __CLR4_4_1lzelzele6rclde.R.inc(28504);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1lzelzele6rclde.R.inc(28505);DateTimeZone.setDefault(zone);
        __CLR4_4_1lzelzele6rclde.R.inc(28506);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1lzelzele6rclde.R.inc(28507);Locale.setDefault(locale);
        __CLR4_4_1lzelzele6rclde.R.inc(28508);zone = null;
    }finally{__CLR4_4_1lzelzele6rclde.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor_nullObject_nullDateTimeZone131() throws Throwable {__CLR4_4_1lzelzele6rclde.R.globalSliceStart(getClass().getName(),28509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w4ydjulzx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lzelzele6rclde.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lzelzele6rclde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_nullObject_nullDateTimeZone131",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w4ydjulzx() throws Throwable{try{__CLR4_4_1lzelzele6rclde.R.inc(28509); 
     __CLR4_4_1lzelzele6rclde.R.inc(28510);MutableDateTime test = new MutableDateTime((Object) null, (DateTimeZone) null); 
     __CLR4_4_1lzelzele6rclde.R.inc(28511);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1lzelzele6rclde.R.inc(28512);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1lzelzele6rclde.R.flushNeeded();}} 


public void test_now995() throws Throwable {__CLR4_4_1lzelzele6rclde.R.globalSliceStart(getClass().getName(),28513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n840odm01();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lzelzele6rclde.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lzelzele6rclde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.test_now995",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n840odm01() throws Throwable{try{__CLR4_4_1lzelzele6rclde.R.inc(28513); 
     __CLR4_4_1lzelzele6rclde.R.inc(28514);MutableDateTime test = MutableDateTime.now(); 
     __CLR4_4_1lzelzele6rclde.R.inc(28515);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1lzelzele6rclde.R.inc(28516);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1lzelzele6rclde.R.flushNeeded();}} 


public void test_now_DateTimeZone996() throws Throwable {__CLR4_4_1lzelzele6rclde.R.globalSliceStart(getClass().getName(),28517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zfm81sm05();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lzelzele6rclde.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lzelzele6rclde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.test_now_DateTimeZone996",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28517,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zfm81sm05() throws Throwable{try{__CLR4_4_1lzelzele6rclde.R.inc(28517); 
     __CLR4_4_1lzelzele6rclde.R.inc(28518);MutableDateTime test = MutableDateTime.now(PARIS); 
     __CLR4_4_1lzelzele6rclde.R.inc(28519);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
     __CLR4_4_1lzelzele6rclde.R.inc(28520);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1lzelzele6rclde.R.flushNeeded();}} 


public void test_now_nullChronology997() throws Throwable {__CLR4_4_1lzelzele6rclde.R.globalSliceStart(getClass().getName(),28521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14fjendm09();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lzelzele6rclde.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lzelzele6rclde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.test_now_nullChronology997",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14fjendm09() throws Throwable{try{__CLR4_4_1lzelzele6rclde.R.inc(28521); 
     __CLR4_4_1lzelzele6rclde.R.inc(28522);try { 
         __CLR4_4_1lzelzele6rclde.R.inc(28523);MutableDateTime.now((Chronology) null); 
         __CLR4_4_1lzelzele6rclde.R.inc(28524);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1lzelzele6rclde.R.flushNeeded();}} 


public void test_now_Chronology998() throws Throwable {__CLR4_4_1lzelzele6rclde.R.globalSliceStart(getClass().getName(),28525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t555v3m0d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lzelzele6rclde.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lzelzele6rclde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.test_now_Chronology998",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28525,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t555v3m0d() throws Throwable{try{__CLR4_4_1lzelzele6rclde.R.inc(28525); 
     __CLR4_4_1lzelzele6rclde.R.inc(28526);MutableDateTime test = MutableDateTime.now(GregorianChronology.getInstance()); 
     __CLR4_4_1lzelzele6rclde.R.inc(28527);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1lzelzele6rclde.R.inc(28528);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1lzelzele6rclde.R.flushNeeded();}} 


public void testParse_noFormatter999() throws Throwable {__CLR4_4_1lzelzele6rclde.R.globalSliceStart(getClass().getName(),28529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18746npm0h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lzelzele6rclde.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lzelzele6rclde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testParse_noFormatter999",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28529,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18746npm0h() throws Throwable{try{__CLR4_4_1lzelzele6rclde.R.inc(28529); 
     __CLR4_4_1lzelzele6rclde.R.inc(28530);assertEquals(new MutableDateTime(2010, 6, 30, 1, 20, 0, 0, ISOChronology.getInstance(DateTimeZone.forOffsetHours(2))), MutableDateTime.parse("2010-06-30T01:20+02:00")); 
     __CLR4_4_1lzelzele6rclde.R.inc(28531);assertEquals(new MutableDateTime(2010, 1, 2, 14, 50, 0, 0, ISOChronology.getInstance(LONDON)), MutableDateTime.parse("2010-002T14:50")); 
 }finally{__CLR4_4_1lzelzele6rclde.R.flushNeeded();}} 


public void testConstructor1000() throws Throwable {__CLR4_4_1lzelzele6rclde.R.globalSliceStart(getClass().getName(),28532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dw2eqm0k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lzelzele6rclde.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lzelzele6rclde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor1000",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dw2eqm0k() throws Throwable{try{__CLR4_4_1lzelzele6rclde.R.inc(28532); 
     __CLR4_4_1lzelzele6rclde.R.inc(28533);MutableDateTime test = new MutableDateTime(); 
     __CLR4_4_1lzelzele6rclde.R.inc(28534);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1lzelzele6rclde.R.inc(28535);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1lzelzele6rclde.R.flushNeeded();}} 


public void testConstructor_DateTimeZone1001() throws Throwable {__CLR4_4_1lzelzele6rclde.R.globalSliceStart(getClass().getName(),28536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x203b9m0o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lzelzele6rclde.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lzelzele6rclde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_DateTimeZone1001",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x203b9m0o() throws Throwable{try{__CLR4_4_1lzelzele6rclde.R.inc(28536); 
     __CLR4_4_1lzelzele6rclde.R.inc(28537);MutableDateTime test = new MutableDateTime(PARIS); 
     __CLR4_4_1lzelzele6rclde.R.inc(28538);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
     __CLR4_4_1lzelzele6rclde.R.inc(28539);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1lzelzele6rclde.R.flushNeeded();}} 


public void testConstructor_Chronology1002() throws Throwable {__CLR4_4_1lzelzele6rclde.R.globalSliceStart(getClass().getName(),28540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t5x12vm0s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lzelzele6rclde.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lzelzele6rclde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_Chronology1002",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28540,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t5x12vm0s() throws Throwable{try{__CLR4_4_1lzelzele6rclde.R.inc(28540); 
     __CLR4_4_1lzelzele6rclde.R.inc(28541);MutableDateTime test = new MutableDateTime(GregorianChronology.getInstance()); 
     __CLR4_4_1lzelzele6rclde.R.inc(28542);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1lzelzele6rclde.R.inc(28543);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1lzelzele6rclde.R.flushNeeded();}} 


public void testConstructor_nullObject1005() throws Throwable {__CLR4_4_1lzelzele6rclde.R.globalSliceStart(getClass().getName(),28544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sz62x4m0w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lzelzele6rclde.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lzelzele6rclde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_nullObject1005",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sz62x4m0w() throws Throwable{try{__CLR4_4_1lzelzele6rclde.R.inc(28544); 
     __CLR4_4_1lzelzele6rclde.R.inc(28545);MutableDateTime test = new MutableDateTime((Object) null); 
     __CLR4_4_1lzelzele6rclde.R.inc(28546);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1lzelzele6rclde.R.inc(28547);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1lzelzele6rclde.R.flushNeeded();}} 


public void testConstructor_badconverterObject_DateTimeZone1006() throws Throwable {__CLR4_4_1lzelzele6rclde.R.globalSliceStart(getClass().getName(),28548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p1awxm10();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lzelzele6rclde.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lzelzele6rclde.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_badconverterObject_DateTimeZone1006",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28548,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p1awxm10() throws Throwable{try{__CLR4_4_1lzelzele6rclde.R.inc(28548); 
     __CLR4_4_1lzelzele6rclde.R.inc(28549);try { 
         __CLR4_4_1lzelzele6rclde.R.inc(28550);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE); 
         __CLR4_4_1lzelzele6rclde.R.inc(28551);MutableDateTime test = new MutableDateTime(new Integer(0), GregorianChronology.getInstance()); 
         __CLR4_4_1lzelzele6rclde.R.inc(28552);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
         __CLR4_4_1lzelzele6rclde.R.inc(28553);assertEquals(0L, test.getMillis()); 
     } finally { 
         __CLR4_4_1lzelzele6rclde.R.inc(28554);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE); 
     } 
 }finally{__CLR4_4_1lzelzele6rclde.R.flushNeeded();}} 

    

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
