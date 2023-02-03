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
 * This class is a Junit unit test for MonthDay. Based on {@link TestYearMonth_Constuctors} 
 */
public class TestMonthDay_Constructors extends TestCase {static class __CLR4_4_1mfkmfklc8axe3c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,29149,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1mfkmfklc8axe3c.R.inc(29072);
        __CLR4_4_1mfkmfklc8axe3c.R.inc(29073);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mfkmfklc8axe3c.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mfkmfklc8axe3c.R.inc(29074);
        __CLR4_4_1mfkmfklc8axe3c.R.inc(29075);return new TestSuite(TestMonthDay_Constructors.class);
    }finally{__CLR4_4_1mfkmfklc8axe3c.R.flushNeeded();}}

    public TestMonthDay_Constructors(String name) {
        super(name);__CLR4_4_1mfkmfklc8axe3c.R.inc(29077);try{__CLR4_4_1mfkmfklc8axe3c.R.inc(29076);
    }finally{__CLR4_4_1mfkmfklc8axe3c.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mfkmfklc8axe3c.R.inc(29078);
        __CLR4_4_1mfkmfklc8axe3c.R.inc(29079);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mfkmfklc8axe3c.R.inc(29080);zone = DateTimeZone.getDefault();
        __CLR4_4_1mfkmfklc8axe3c.R.inc(29081);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1mfkmfklc8axe3c.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mfkmfklc8axe3c.R.inc(29082);
        __CLR4_4_1mfkmfklc8axe3c.R.inc(29083);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mfkmfklc8axe3c.R.inc(29084);DateTimeZone.setDefault(zone);
        __CLR4_4_1mfkmfklc8axe3c.R.inc(29085);zone = null;
    }finally{__CLR4_4_1mfkmfklc8axe3c.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactory_FromCalendarFields8() throws Exception {__CLR4_4_1mfkmfklc8axe3c.R.globalSliceStart(getClass().getName(),29086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hjkp9zmfy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mfkmfklc8axe3c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mfkmfklc8axe3c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testFactory_FromCalendarFields8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29086,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hjkp9zmfy() throws Exception{try{__CLR4_4_1mfkmfklc8axe3c.R.inc(29086); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29087);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29088);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29089);MonthDay expected = new MonthDay(2, 3); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29090);assertEquals(expected, MonthDay.fromCalendarFields(cal)); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29091);try { 
         __CLR4_4_1mfkmfklc8axe3c.R.inc(29092);MonthDay.fromCalendarFields(null); 
         __CLR4_4_1mfkmfklc8axe3c.R.inc(29093);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1mfkmfklc8axe3c.R.flushNeeded();}} 


public void testConstructor_Object114() throws Throwable {__CLR4_4_1mfkmfklc8axe3c.R.globalSliceStart(getClass().getName(),29094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112gz1hmg6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mfkmfklc8axe3c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mfkmfklc8axe3c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_Object114",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112gz1hmg6() throws Throwable{try{__CLR4_4_1mfkmfklc8axe3c.R.inc(29094); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29095);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29096);MonthDay test = new MonthDay(date); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29097);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29098);assertEquals(4, test.getMonthOfYear()); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29099);assertEquals(6, test.getDayOfMonth()); 
 }finally{__CLR4_4_1mfkmfklc8axe3c.R.flushNeeded();}} 


public void testConstructor933() throws Throwable {__CLR4_4_1mfkmfklc8axe3c.R.globalSliceStart(getClass().getName(),29100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ue0somgc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mfkmfklc8axe3c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mfkmfklc8axe3c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor933",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29100,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ue0somgc() throws Throwable{try{__CLR4_4_1mfkmfklc8axe3c.R.inc(29100); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29101);MonthDay test = new MonthDay(); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29102);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29103);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29104);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29105);assertEquals(test, MonthDay.now()); 
 }finally{__CLR4_4_1mfkmfklc8axe3c.R.flushNeeded();}} 


public void testConstructor_long_nullChronology1218() throws Throwable {__CLR4_4_1mfkmfklc8axe3c.R.globalSliceStart(getClass().getName(),29106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1om1x96mgi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mfkmfklc8axe3c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mfkmfklc8axe3c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_long_nullChronology1218",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29106,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1om1x96mgi() throws Throwable{try{__CLR4_4_1mfkmfklc8axe3c.R.inc(29106); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29107);MonthDay test = new MonthDay(TEST_TIME1, null); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29108);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29109);assertEquals(4, test.getMonthOfYear()); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29110);assertEquals(6, test.getDayOfMonth()); 
 }finally{__CLR4_4_1mfkmfklc8axe3c.R.flushNeeded();}} 


public void testFactory_FromDateFields1230() throws Exception {__CLR4_4_1mfkmfklc8axe3c.R.globalSliceStart(getClass().getName(),29111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qk2725mgn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mfkmfklc8axe3c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mfkmfklc8axe3c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testFactory_FromDateFields1230",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qk2725mgn() throws Exception{try{__CLR4_4_1mfkmfklc8axe3c.R.inc(29111); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29112);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29113);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29114);MonthDay expected = new MonthDay(2, 3); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29115);assertEquals(expected, MonthDay.fromDateFields(cal.getTime())); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29116);try { 
         __CLR4_4_1mfkmfklc8axe3c.R.inc(29117);MonthDay.fromDateFields(null); 
         __CLR4_4_1mfkmfklc8axe3c.R.inc(29118);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1mfkmfklc8axe3c.R.flushNeeded();}} 


public void testConstructor_DateTimeZone1461() throws Throwable {__CLR4_4_1mfkmfklc8axe3c.R.globalSliceStart(getClass().getName(),29119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a9let9mgv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mfkmfklc8axe3c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mfkmfklc8axe3c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_DateTimeZone1461",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29119,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a9let9mgv() throws Throwable{try{__CLR4_4_1mfkmfklc8axe3c.R.inc(29119); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29120);DateTime dt = new DateTime(2005, 6, 30, 23, 59, 0, 0, LONDON); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29121);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29122);MonthDay test = new MonthDay(LONDON); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29123);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29124);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29125);assertEquals(30, test.getDayOfMonth()); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29126);assertEquals(test, MonthDay.now(LONDON)); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29127);test = new MonthDay(PARIS); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29128);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29129);assertEquals(7, test.getMonthOfYear()); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29130);assertEquals(1, test.getDayOfMonth()); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29131);assertEquals(test, MonthDay.now(PARIS)); 
 }finally{__CLR4_4_1mfkmfklc8axe3c.R.flushNeeded();}} 


public void testConstructor_int_int_nullChronology1503() throws Throwable {__CLR4_4_1mfkmfklc8axe3c.R.globalSliceStart(getClass().getName(),29132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1182i0smh8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mfkmfklc8axe3c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mfkmfklc8axe3c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_int_int_nullChronology1503",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1182i0smh8() throws Throwable{try{__CLR4_4_1mfkmfklc8axe3c.R.inc(29132); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29133);MonthDay test = new MonthDay(6, 30, null); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29134);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29135);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29136);assertEquals(30, test.getDayOfMonth()); 
 }finally{__CLR4_4_1mfkmfklc8axe3c.R.flushNeeded();}} 


public void testConstructor_Chronology1627() throws Throwable {__CLR4_4_1mfkmfklc8axe3c.R.globalSliceStart(getClass().getName(),29137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l0egyomhd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mfkmfklc8axe3c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mfkmfklc8axe3c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_Chronology1627",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29137,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l0egyomhd() throws Throwable{try{__CLR4_4_1mfkmfklc8axe3c.R.inc(29137); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29138);MonthDay test = new MonthDay(GREGORIAN_PARIS); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29139);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29140);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29141);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29142);assertEquals(test, MonthDay.now(GREGORIAN_PARIS)); 
 }finally{__CLR4_4_1mfkmfklc8axe3c.R.flushNeeded();}} 


public void testConstructor_Object_Chronology1630() throws Throwable {__CLR4_4_1mfkmfklc8axe3c.R.globalSliceStart(getClass().getName(),29143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12z5m9imhj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mfkmfklc8axe3c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mfkmfklc8axe3c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_Object_Chronology1630",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29143,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12z5m9imhj() throws Throwable{try{__CLR4_4_1mfkmfklc8axe3c.R.inc(29143); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29144);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29145);MonthDay test = new MonthDay(date, GREGORIAN_PARIS); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29146);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29147);assertEquals(4, test.getMonthOfYear()); 
     __CLR4_4_1mfkmfklc8axe3c.R.inc(29148);assertEquals(6, test.getDayOfMonth()); 
 }finally{__CLR4_4_1mfkmfklc8axe3c.R.flushNeeded();}} 

    

    

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
