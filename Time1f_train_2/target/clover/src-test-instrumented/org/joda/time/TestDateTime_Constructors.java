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
public class TestDateTime_Constructors extends TestCase {static class __CLR4_4_1ij0ij0le6qses5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,24098,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1ij0ij0le6qses5.R.inc(24012);
        __CLR4_4_1ij0ij0le6qses5.R.inc(24013);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ij0ij0le6qses5.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ij0ij0le6qses5.R.inc(24014);
        __CLR4_4_1ij0ij0le6qses5.R.inc(24015);return new TestSuite(TestDateTime_Constructors.class);
    }finally{__CLR4_4_1ij0ij0le6qses5.R.flushNeeded();}}

    public TestDateTime_Constructors(String name) {
        super(name);__CLR4_4_1ij0ij0le6qses5.R.inc(24017);try{__CLR4_4_1ij0ij0le6qses5.R.inc(24016);
    }finally{__CLR4_4_1ij0ij0le6qses5.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ij0ij0le6qses5.R.inc(24018);
        __CLR4_4_1ij0ij0le6qses5.R.inc(24019);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ij0ij0le6qses5.R.inc(24020);zone = DateTimeZone.getDefault();
        __CLR4_4_1ij0ij0le6qses5.R.inc(24021);locale = Locale.getDefault();
        __CLR4_4_1ij0ij0le6qses5.R.inc(24022);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1ij0ij0le6qses5.R.inc(24023);java.util.TimeZone.setDefault(LONDON.toTimeZone());
        __CLR4_4_1ij0ij0le6qses5.R.inc(24024);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1ij0ij0le6qses5.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ij0ij0le6qses5.R.inc(24025);
        __CLR4_4_1ij0ij0le6qses5.R.inc(24026);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ij0ij0le6qses5.R.inc(24027);DateTimeZone.setDefault(zone);
        __CLR4_4_1ij0ij0le6qses5.R.inc(24028);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1ij0ij0le6qses5.R.inc(24029);Locale.setDefault(locale);
        __CLR4_4_1ij0ij0le6qses5.R.inc(24030);zone = null;
    }finally{__CLR4_4_1ij0ij0le6qses5.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor_Object_Chronology118() throws Throwable {__CLR4_4_1ij0ij0le6qses5.R.globalSliceStart(getClass().getName(),24031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1egjouaijj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ij0ij0le6qses5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ij0ij0le6qses5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_Object_Chronology118",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24031,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1egjouaijj() throws Throwable{try{__CLR4_4_1ij0ij0le6qses5.R.inc(24031); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24032);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24033);DateTime test = new DateTime(date, GregorianChronology.getInstance()); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24034);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24035);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1ij0ij0le6qses5.R.flushNeeded();}} 


public void test_now529() throws Throwable {__CLR4_4_1ij0ij0le6qses5.R.globalSliceStart(getClass().getName(),24036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13dmg2iijo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ij0ij0le6qses5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ij0ij0le6qses5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.test_now529",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24036,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13dmg2iijo() throws Throwable{try{__CLR4_4_1ij0ij0le6qses5.R.inc(24036); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24037);DateTime test = DateTime.now(); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24038);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24039);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1ij0ij0le6qses5.R.flushNeeded();}} 


public void test_now_nullDateTimeZone530() throws Throwable {__CLR4_4_1ij0ij0le6qses5.R.globalSliceStart(getClass().getName(),24040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_135zu5xijs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ij0ij0le6qses5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ij0ij0le6qses5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.test_now_nullDateTimeZone530",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24040,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_135zu5xijs() throws Throwable{try{__CLR4_4_1ij0ij0le6qses5.R.inc(24040); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24041);try { 
         __CLR4_4_1ij0ij0le6qses5.R.inc(24042);DateTime.now((DateTimeZone) null); 
         __CLR4_4_1ij0ij0le6qses5.R.inc(24043);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1ij0ij0le6qses5.R.flushNeeded();}} 


public void test_now_Chronology531() throws Throwable {__CLR4_4_1ij0ij0le6qses5.R.globalSliceStart(getClass().getName(),24044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18kjf9wijw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ij0ij0le6qses5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ij0ij0le6qses5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.test_now_Chronology531",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24044,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18kjf9wijw() throws Throwable{try{__CLR4_4_1ij0ij0le6qses5.R.inc(24044); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24045);DateTime test = DateTime.now(GregorianChronology.getInstance()); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24046);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24047);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1ij0ij0le6qses5.R.flushNeeded();}} 


public void test_now_nullChronology532() throws Throwable {__CLR4_4_1ij0ij0le6qses5.R.globalSliceStart(getClass().getName(),24048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vi52tiik0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ij0ij0le6qses5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ij0ij0le6qses5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.test_now_nullChronology532",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24048,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vi52tiik0() throws Throwable{try{__CLR4_4_1ij0ij0le6qses5.R.inc(24048); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24049);try { 
         __CLR4_4_1ij0ij0le6qses5.R.inc(24050);DateTime.now((Chronology) null); 
         __CLR4_4_1ij0ij0le6qses5.R.inc(24051);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1ij0ij0le6qses5.R.flushNeeded();}} 


public void testParse_formatter534() throws Throwable {__CLR4_4_1ij0ij0le6qses5.R.globalSliceStart(getClass().getName(),24052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xbynblik4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ij0ij0le6qses5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ij0ij0le6qses5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testParse_formatter534",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xbynblik4() throws Throwable{try{__CLR4_4_1ij0ij0le6qses5.R.inc(24052); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24053);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--dd MM HH").withChronology(ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24054);assertEquals(new DateTime(2010, 6, 30, 13, 0, ISOChronology.getInstance(PARIS)), DateTime.parse("2010--30 06 13", f)); 
 }finally{__CLR4_4_1ij0ij0le6qses5.R.flushNeeded();}} 


public void testConstructor535() throws Throwable {__CLR4_4_1ij0ij0le6qses5.R.globalSliceStart(getClass().getName(),24055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d70o8mik7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ij0ij0le6qses5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ij0ij0le6qses5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor535",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24055,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d70o8mik7() throws Throwable{try{__CLR4_4_1ij0ij0le6qses5.R.inc(24055); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24056);DateTime test = new DateTime(); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24057);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24058);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1ij0ij0le6qses5.R.flushNeeded();}} 


public void testConstructor_DateTimeZone536() throws Throwable {__CLR4_4_1ij0ij0le6qses5.R.globalSliceStart(getClass().getName(),24059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gy8ev3ikb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ij0ij0le6qses5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ij0ij0le6qses5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_DateTimeZone536",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24059,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gy8ev3ikb() throws Throwable{try{__CLR4_4_1ij0ij0le6qses5.R.inc(24059); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24060);DateTime test = new DateTime(PARIS); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24061);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24062);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1ij0ij0le6qses5.R.flushNeeded();}} 


public void testConstructor_Chronology537() throws Throwable {__CLR4_4_1ij0ij0le6qses5.R.globalSliceStart(getClass().getName(),24063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pdyqvjikf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ij0ij0le6qses5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ij0ij0le6qses5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_Chronology537",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pdyqvjikf() throws Throwable{try{__CLR4_4_1ij0ij0le6qses5.R.inc(24063); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24064);DateTime test = new DateTime(GregorianChronology.getInstance()); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24065);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24066);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1ij0ij0le6qses5.R.flushNeeded();}} 


public void testConstructor_long_nullDateTimeZone538() throws Throwable {__CLR4_4_1ij0ij0le6qses5.R.globalSliceStart(getClass().getName(),24067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hpvh7rikj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ij0ij0le6qses5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ij0ij0le6qses5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_long_nullDateTimeZone538",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24067,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hpvh7rikj() throws Throwable{try{__CLR4_4_1ij0ij0le6qses5.R.inc(24067); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24068);DateTime test = new DateTime(TEST_TIME1, (DateTimeZone) null); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24069);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24070);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1ij0ij0le6qses5.R.flushNeeded();}} 


public void testConstructor_nullObject539() throws Throwable {__CLR4_4_1ij0ij0le6qses5.R.globalSliceStart(getClass().getName(),24071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lhzt6jikn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ij0ij0le6qses5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ij0ij0le6qses5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_nullObject539",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24071,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lhzt6jikn() throws Throwable{try{__CLR4_4_1ij0ij0le6qses5.R.inc(24071); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24072);DateTime test = new DateTime((Object) null); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24073);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24074);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1ij0ij0le6qses5.R.flushNeeded();}} 


public void testConstructor_Object_nullChronology541() throws Throwable {__CLR4_4_1ij0ij0le6qses5.R.globalSliceStart(getClass().getName(),24075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o3x5bjikr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ij0ij0le6qses5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ij0ij0le6qses5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_Object_nullChronology541",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o3x5bjikr() throws Throwable{try{__CLR4_4_1ij0ij0le6qses5.R.inc(24075); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24076);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24077);DateTime test = new DateTime(date, (Chronology) null); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24078);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24079);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1ij0ij0le6qses5.R.flushNeeded();}} 


public void testConstructor_int_int_int_int_int542() throws Throwable {__CLR4_4_1ij0ij0le6qses5.R.globalSliceStart(getClass().getName(),24080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y5y76ikw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ij0ij0le6qses5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ij0ij0le6qses5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int542",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24080,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y5y76ikw() throws Throwable{try{__CLR4_4_1ij0ij0le6qses5.R.inc(24080); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24081);DateTime test = new DateTime(2002, 6, 9, 1, 0); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24082);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24083);assertEquals(LONDON, test.getZone()); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24084);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1ij0ij0le6qses5.R.flushNeeded();}} 


public void testConstructor_int_int_int_int_int_Chronology543() throws Throwable {__CLR4_4_1ij0ij0le6qses5.R.globalSliceStart(getClass().getName(),24085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oeo1ycil1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ij0ij0le6qses5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ij0ij0le6qses5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_Chronology543",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24085,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oeo1ycil1() throws Throwable{try{__CLR4_4_1ij0ij0le6qses5.R.inc(24085); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24086);DateTime test = new DateTime(2002, 6, 9, 1, 0, GregorianChronology.getInstance()); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24087);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24088);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1ij0ij0le6qses5.R.flushNeeded();}} 


public void testConstructor_int_int_int_int_int_int544() throws Throwable {__CLR4_4_1ij0ij0le6qses5.R.globalSliceStart(getClass().getName(),24089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lsclccil5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ij0ij0le6qses5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ij0ij0le6qses5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_int544",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24089,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lsclccil5() throws Throwable{try{__CLR4_4_1ij0ij0le6qses5.R.inc(24089); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24090);DateTime test = new DateTime(2002, 6, 9, 1, 0, 0); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24091);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24092);assertEquals(LONDON, test.getZone()); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24093);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1ij0ij0le6qses5.R.flushNeeded();}} 


public void testConstructor_int_int_int_int_int_int_Chronology546() throws Throwable {__CLR4_4_1ij0ij0le6qses5.R.globalSliceStart(getClass().getName(),24094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1op5hbjila();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ij0ij0le6qses5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ij0ij0le6qses5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_int_Chronology546",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1op5hbjila() throws Throwable{try{__CLR4_4_1ij0ij0le6qses5.R.inc(24094); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24095);DateTime test = new DateTime(2002, 6, 9, 1, 0, 0, GregorianChronology.getInstance()); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24096);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1ij0ij0le6qses5.R.inc(24097);assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }finally{__CLR4_4_1ij0ij0le6qses5.R.flushNeeded();}} 

    

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
