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
public class TestMutableDateTime_Constructors extends TestCase {static class __CLR4_4_1m3ym3yle6rjcpg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,28712,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1m3ym3yle6rjcpg.R.inc(28654);
        __CLR4_4_1m3ym3yle6rjcpg.R.inc(28655);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1m3ym3yle6rjcpg.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1m3ym3yle6rjcpg.R.inc(28656);
        __CLR4_4_1m3ym3yle6rjcpg.R.inc(28657);return new TestSuite(TestMutableDateTime_Constructors.class);
    }finally{__CLR4_4_1m3ym3yle6rjcpg.R.flushNeeded();}}

    public TestMutableDateTime_Constructors(String name) {
        super(name);__CLR4_4_1m3ym3yle6rjcpg.R.inc(28659);try{__CLR4_4_1m3ym3yle6rjcpg.R.inc(28658);
    }finally{__CLR4_4_1m3ym3yle6rjcpg.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1m3ym3yle6rjcpg.R.inc(28660);
        __CLR4_4_1m3ym3yle6rjcpg.R.inc(28661);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1m3ym3yle6rjcpg.R.inc(28662);zone = DateTimeZone.getDefault();
        __CLR4_4_1m3ym3yle6rjcpg.R.inc(28663);locale = Locale.getDefault();
        __CLR4_4_1m3ym3yle6rjcpg.R.inc(28664);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1m3ym3yle6rjcpg.R.inc(28665);java.util.TimeZone.setDefault(LONDON.toTimeZone());
        __CLR4_4_1m3ym3yle6rjcpg.R.inc(28666);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1m3ym3yle6rjcpg.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1m3ym3yle6rjcpg.R.inc(28667);
        __CLR4_4_1m3ym3yle6rjcpg.R.inc(28668);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1m3ym3yle6rjcpg.R.inc(28669);DateTimeZone.setDefault(zone);
        __CLR4_4_1m3ym3yle6rjcpg.R.inc(28670);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1m3ym3yle6rjcpg.R.inc(28671);Locale.setDefault(locale);
        __CLR4_4_1m3ym3yle6rjcpg.R.inc(28672);zone = null;
    }finally{__CLR4_4_1m3ym3yle6rjcpg.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor_nullObject_nullDateTimeZone136() throws Throwable {__CLR4_4_1m3ym3yle6rjcpg.R.globalSliceStart(getClass().getName(),28673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fvyjlhm4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m3ym3yle6rjcpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m3ym3yle6rjcpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_nullObject_nullDateTimeZone136",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28673,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fvyjlhm4h() throws Throwable{try{__CLR4_4_1m3ym3yle6rjcpg.R.inc(28673); 
     __CLR4_4_1m3ym3yle6rjcpg.R.inc(28674);MutableDateTime test = new MutableDateTime((Object) null, (DateTimeZone) null); 
     __CLR4_4_1m3ym3yle6rjcpg.R.inc(28675);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1m3ym3yle6rjcpg.R.inc(28676);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1m3ym3yle6rjcpg.R.flushNeeded();}} 


public void test_now1024() throws Throwable {__CLR4_4_1m3ym3yle6rjcpg.R.globalSliceStart(getClass().getName(),28677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vujf5m4l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m3ym3yle6rjcpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m3ym3yle6rjcpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.test_now1024",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28677,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vujf5m4l() throws Throwable{try{__CLR4_4_1m3ym3yle6rjcpg.R.inc(28677); 
     __CLR4_4_1m3ym3yle6rjcpg.R.inc(28678);MutableDateTime test = MutableDateTime.now(); 
     __CLR4_4_1m3ym3yle6rjcpg.R.inc(28679);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1m3ym3yle6rjcpg.R.inc(28680);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1m3ym3yle6rjcpg.R.flushNeeded();}} 


public void test_now_DateTimeZone1025() throws Throwable {__CLR4_4_1m3ym3yle6rjcpg.R.globalSliceStart(getClass().getName(),28681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i2rqsmm4p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m3ym3yle6rjcpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m3ym3yle6rjcpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.test_now_DateTimeZone1025",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i2rqsmm4p() throws Throwable{try{__CLR4_4_1m3ym3yle6rjcpg.R.inc(28681); 
     __CLR4_4_1m3ym3yle6rjcpg.R.inc(28682);MutableDateTime test = MutableDateTime.now(PARIS); 
     __CLR4_4_1m3ym3yle6rjcpg.R.inc(28683);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
     __CLR4_4_1m3ym3yle6rjcpg.R.inc(28684);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1m3ym3yle6rjcpg.R.flushNeeded();}} 


public void test_now_nullDateTimeZone1026() throws Throwable {__CLR4_4_1m3ym3yle6rjcpg.R.globalSliceStart(getClass().getName(),28685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cphs7mm4t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m3ym3yle6rjcpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m3ym3yle6rjcpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.test_now_nullDateTimeZone1026",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28685,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cphs7mm4t() throws Throwable{try{__CLR4_4_1m3ym3yle6rjcpg.R.inc(28685); 
     __CLR4_4_1m3ym3yle6rjcpg.R.inc(28686);try { 
         __CLR4_4_1m3ym3yle6rjcpg.R.inc(28687);MutableDateTime.now((DateTimeZone) null); 
         __CLR4_4_1m3ym3yle6rjcpg.R.inc(28688);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1m3ym3yle6rjcpg.R.flushNeeded();}} 


public void test_now_Chronology1027() throws Throwable {__CLR4_4_1m3ym3yle6rjcpg.R.globalSliceStart(getClass().getName(),28689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n5qha1m4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m3ym3yle6rjcpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m3ym3yle6rjcpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.test_now_Chronology1027",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n5qha1m4x() throws Throwable{try{__CLR4_4_1m3ym3yle6rjcpg.R.inc(28689); 
     __CLR4_4_1m3ym3yle6rjcpg.R.inc(28690);MutableDateTime test = MutableDateTime.now(GregorianChronology.getInstance()); 
     __CLR4_4_1m3ym3yle6rjcpg.R.inc(28691);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1m3ym3yle6rjcpg.R.inc(28692);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1m3ym3yle6rjcpg.R.flushNeeded();}} 


public void testConstructor_DateTimeZone1028() throws Throwable {__CLR4_4_1m3ym3yle6rjcpg.R.globalSliceStart(getClass().getName(),28693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qtig0mm51();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m3ym3yle6rjcpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m3ym3yle6rjcpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_DateTimeZone1028",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qtig0mm51() throws Throwable{try{__CLR4_4_1m3ym3yle6rjcpg.R.inc(28693); 
     __CLR4_4_1m3ym3yle6rjcpg.R.inc(28694);MutableDateTime test = new MutableDateTime(PARIS); 
     __CLR4_4_1m3ym3yle6rjcpg.R.inc(28695);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
     __CLR4_4_1m3ym3yle6rjcpg.R.inc(28696);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1m3ym3yle6rjcpg.R.flushNeeded();}} 


public void testConstructor_Chronology1029() throws Throwable {__CLR4_4_1m3ym3yle6rjcpg.R.globalSliceStart(getClass().getName(),28697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1upli90m55();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m3ym3yle6rjcpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m3ym3yle6rjcpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_Chronology1029",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28697,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1upli90m55() throws Throwable{try{__CLR4_4_1m3ym3yle6rjcpg.R.inc(28697); 
     __CLR4_4_1m3ym3yle6rjcpg.R.inc(28698);MutableDateTime test = new MutableDateTime(GregorianChronology.getInstance()); 
     __CLR4_4_1m3ym3yle6rjcpg.R.inc(28699);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1m3ym3yle6rjcpg.R.inc(28700);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1m3ym3yle6rjcpg.R.flushNeeded();}} 


public void testConstructor_nullObject1032() throws Throwable {__CLR4_4_1m3ym3yle6rjcpg.R.globalSliceStart(getClass().getName(),28701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xoh7rym59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m3ym3yle6rjcpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m3ym3yle6rjcpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_nullObject1032",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28701,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xoh7rym59() throws Throwable{try{__CLR4_4_1m3ym3yle6rjcpg.R.inc(28701); 
     __CLR4_4_1m3ym3yle6rjcpg.R.inc(28702);MutableDateTime test = new MutableDateTime((Object) null); 
     __CLR4_4_1m3ym3yle6rjcpg.R.inc(28703);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1m3ym3yle6rjcpg.R.inc(28704);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1m3ym3yle6rjcpg.R.flushNeeded();}} 


public void testConstructor_badconverterObject_DateTimeZone1033() throws Throwable {__CLR4_4_1m3ym3yle6rjcpg.R.globalSliceStart(getClass().getName(),28705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_192i26zm5d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m3ym3yle6rjcpg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m3ym3yle6rjcpg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_badconverterObject_DateTimeZone1033",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_192i26zm5d() throws Throwable{try{__CLR4_4_1m3ym3yle6rjcpg.R.inc(28705); 
     __CLR4_4_1m3ym3yle6rjcpg.R.inc(28706);try { 
         __CLR4_4_1m3ym3yle6rjcpg.R.inc(28707);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE); 
         __CLR4_4_1m3ym3yle6rjcpg.R.inc(28708);MutableDateTime test = new MutableDateTime(new Integer(0), GregorianChronology.getInstance()); 
         __CLR4_4_1m3ym3yle6rjcpg.R.inc(28709);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
         __CLR4_4_1m3ym3yle6rjcpg.R.inc(28710);assertEquals(0L, test.getMillis()); 
     } finally { 
         __CLR4_4_1m3ym3yle6rjcpg.R.inc(28711);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE); 
     } 
 }finally{__CLR4_4_1m3ym3yle6rjcpg.R.flushNeeded();}} 

    

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
