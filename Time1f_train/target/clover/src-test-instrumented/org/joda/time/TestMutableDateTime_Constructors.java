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
public class TestMutableDateTime_Constructors extends TestCase {static class __CLR4_4_1mwgmwglc8axe55{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,29749,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1mwgmwglc8axe55.R.inc(29680);
        __CLR4_4_1mwgmwglc8axe55.R.inc(29681);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mwgmwglc8axe55.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mwgmwglc8axe55.R.inc(29682);
        __CLR4_4_1mwgmwglc8axe55.R.inc(29683);return new TestSuite(TestMutableDateTime_Constructors.class);
    }finally{__CLR4_4_1mwgmwglc8axe55.R.flushNeeded();}}

    public TestMutableDateTime_Constructors(String name) {
        super(name);__CLR4_4_1mwgmwglc8axe55.R.inc(29685);try{__CLR4_4_1mwgmwglc8axe55.R.inc(29684);
    }finally{__CLR4_4_1mwgmwglc8axe55.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mwgmwglc8axe55.R.inc(29686);
        __CLR4_4_1mwgmwglc8axe55.R.inc(29687);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mwgmwglc8axe55.R.inc(29688);zone = DateTimeZone.getDefault();
        __CLR4_4_1mwgmwglc8axe55.R.inc(29689);locale = Locale.getDefault();
        __CLR4_4_1mwgmwglc8axe55.R.inc(29690);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1mwgmwglc8axe55.R.inc(29691);java.util.TimeZone.setDefault(LONDON.toTimeZone());
        __CLR4_4_1mwgmwglc8axe55.R.inc(29692);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1mwgmwglc8axe55.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mwgmwglc8axe55.R.inc(29693);
        __CLR4_4_1mwgmwglc8axe55.R.inc(29694);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mwgmwglc8axe55.R.inc(29695);DateTimeZone.setDefault(zone);
        __CLR4_4_1mwgmwglc8axe55.R.inc(29696);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1mwgmwglc8axe55.R.inc(29697);Locale.setDefault(locale);
        __CLR4_4_1mwgmwglc8axe55.R.inc(29698);zone = null;
    }finally{__CLR4_4_1mwgmwglc8axe55.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor_nullObject_nullDateTimeZone557() throws Throwable {__CLR4_4_1mwgmwglc8axe55.R.globalSliceStart(getClass().getName(),29699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wrrl5emwz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwgmwglc8axe55.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwgmwglc8axe55.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_nullObject_nullDateTimeZone557",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29699,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wrrl5emwz() throws Throwable{try{__CLR4_4_1mwgmwglc8axe55.R.inc(29699); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29700);MutableDateTime test = new MutableDateTime((Object) null, (DateTimeZone) null); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29701);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29702);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1mwgmwglc8axe55.R.flushNeeded();}} 


public void testConstructor_DateTimeZone639() throws Throwable {__CLR4_4_1mwgmwglc8axe55.R.globalSliceStart(getClass().getName(),29703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19c37crmx3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwgmwglc8axe55.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwgmwglc8axe55.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_DateTimeZone639",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29703,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19c37crmx3() throws Throwable{try{__CLR4_4_1mwgmwglc8axe55.R.inc(29703); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29704);MutableDateTime test = new MutableDateTime(PARIS); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29705);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29706);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1mwgmwglc8axe55.R.flushNeeded();}} 


public void testParse_noFormatter673() throws Throwable {__CLR4_4_1mwgmwglc8axe55.R.globalSliceStart(getClass().getName(),29707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16p2pe6mx7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwgmwglc8axe55.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwgmwglc8axe55.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testParse_noFormatter673",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29707,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16p2pe6mx7() throws Throwable{try{__CLR4_4_1mwgmwglc8axe55.R.inc(29707); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29708);assertEquals(new MutableDateTime(2010, 6, 30, 1, 20, 0, 0, ISOChronology.getInstance(DateTimeZone.forOffsetHours(2))), MutableDateTime.parse("2010-06-30T01:20+02:00")); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29709);assertEquals(new MutableDateTime(2010, 1, 2, 14, 50, 0, 0, ISOChronology.getInstance(LONDON)), MutableDateTime.parse("2010-002T14:50")); 
 }finally{__CLR4_4_1mwgmwglc8axe55.R.flushNeeded();}} 


public void test_now_nullChronology903() throws Throwable {__CLR4_4_1mwgmwglc8axe55.R.globalSliceStart(getClass().getName(),29710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1839mi6mxa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwgmwglc8axe55.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwgmwglc8axe55.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.test_now_nullChronology903",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29710,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1839mi6mxa() throws Throwable{try{__CLR4_4_1mwgmwglc8axe55.R.inc(29710); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29711);try { 
         __CLR4_4_1mwgmwglc8axe55.R.inc(29712);MutableDateTime.now((Chronology) null); 
         __CLR4_4_1mwgmwglc8axe55.R.inc(29713);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1mwgmwglc8axe55.R.flushNeeded();}} 


public void test_now923() throws Throwable {__CLR4_4_1mwgmwglc8axe55.R.globalSliceStart(getClass().getName(),29714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ons44omxe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwgmwglc8axe55.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwgmwglc8axe55.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.test_now923",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29714,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ons44omxe() throws Throwable{try{__CLR4_4_1mwgmwglc8axe55.R.inc(29714); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29715);MutableDateTime test = MutableDateTime.now(); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29716);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29717);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1mwgmwglc8axe55.R.flushNeeded();}} 


public void testConstructor_Chronology1012() throws Throwable {__CLR4_4_1mwgmwglc8axe55.R.globalSliceStart(getClass().getName(),29718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c5c4cqmxi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwgmwglc8axe55.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwgmwglc8axe55.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_Chronology1012",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29718,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c5c4cqmxi() throws Throwable{try{__CLR4_4_1mwgmwglc8axe55.R.inc(29718); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29719);MutableDateTime test = new MutableDateTime(GregorianChronology.getInstance()); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29720);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29721);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1mwgmwglc8axe55.R.flushNeeded();}} 


public void testConstructor_nullObject1013() throws Throwable {__CLR4_4_1mwgmwglc8axe55.R.globalSliceStart(getClass().getName(),29722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iu303fmxm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwgmwglc8axe55.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwgmwglc8axe55.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_nullObject1013",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29722,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iu303fmxm() throws Throwable{try{__CLR4_4_1mwgmwglc8axe55.R.inc(29722); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29723);MutableDateTime test = new MutableDateTime((Object) null); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29724);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29725);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1mwgmwglc8axe55.R.flushNeeded();}} 


public void test_now_DateTimeZone1079() throws Throwable {__CLR4_4_1mwgmwglc8axe55.R.globalSliceStart(getClass().getName(),29726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xfa197mxq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwgmwglc8axe55.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwgmwglc8axe55.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.test_now_DateTimeZone1079",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xfa197mxq() throws Throwable{try{__CLR4_4_1mwgmwglc8axe55.R.inc(29726); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29727);MutableDateTime test = MutableDateTime.now(PARIS); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29728);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29729);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1mwgmwglc8axe55.R.flushNeeded();}} 


public void testConstructor_badconverterObject_DateTimeZone1101() throws Throwable {__CLR4_4_1mwgmwglc8axe55.R.globalSliceStart(getClass().getName(),29730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hot7wjmxu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwgmwglc8axe55.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwgmwglc8axe55.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_badconverterObject_DateTimeZone1101",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hot7wjmxu() throws Throwable{try{__CLR4_4_1mwgmwglc8axe55.R.inc(29730); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29731);try { 
         __CLR4_4_1mwgmwglc8axe55.R.inc(29732);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE); 
         __CLR4_4_1mwgmwglc8axe55.R.inc(29733);MutableDateTime test = new MutableDateTime(new Integer(0), GregorianChronology.getInstance()); 
         __CLR4_4_1mwgmwglc8axe55.R.inc(29734);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
         __CLR4_4_1mwgmwglc8axe55.R.inc(29735);assertEquals(0L, test.getMillis()); 
     } finally { 
         __CLR4_4_1mwgmwglc8axe55.R.inc(29736);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE); 
     } 
 }finally{__CLR4_4_1mwgmwglc8axe55.R.flushNeeded();}} 


public void test_now_Chronology1312() throws Throwable {__CLR4_4_1mwgmwglc8axe55.R.globalSliceStart(getClass().getName(),29737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t7obt4my1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwgmwglc8axe55.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwgmwglc8axe55.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.test_now_Chronology1312",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t7obt4my1() throws Throwable{try{__CLR4_4_1mwgmwglc8axe55.R.inc(29737); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29738);MutableDateTime test = MutableDateTime.now(GregorianChronology.getInstance()); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29739);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29740);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1mwgmwglc8axe55.R.flushNeeded();}} 


public void test_now_nullDateTimeZone1403() throws Throwable {__CLR4_4_1mwgmwglc8axe55.R.globalSliceStart(getClass().getName(),29741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jei75bmy5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwgmwglc8axe55.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwgmwglc8axe55.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.test_now_nullDateTimeZone1403",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29741,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jei75bmy5() throws Throwable{try{__CLR4_4_1mwgmwglc8axe55.R.inc(29741); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29742);try { 
         __CLR4_4_1mwgmwglc8axe55.R.inc(29743);MutableDateTime.now((DateTimeZone) null); 
         __CLR4_4_1mwgmwglc8axe55.R.inc(29744);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1mwgmwglc8axe55.R.flushNeeded();}} 


public void testConstructor1725() throws Throwable {__CLR4_4_1mwgmwglc8axe55.R.globalSliceStart(getClass().getName(),29745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ao9be0my9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mwgmwglc8axe55.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mwgmwglc8axe55.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor1725",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ao9be0my9() throws Throwable{try{__CLR4_4_1mwgmwglc8axe55.R.inc(29745); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29746);MutableDateTime test = new MutableDateTime(); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29747);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1mwgmwglc8axe55.R.inc(29748);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1mwgmwglc8axe55.R.flushNeeded();}} 

    

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
