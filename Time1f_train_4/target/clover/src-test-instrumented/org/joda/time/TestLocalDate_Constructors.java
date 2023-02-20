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

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalDate.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDate_Constructors extends TestCase {static class __CLR4_4_1kwxkwxle6rjck3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,27174,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME1_ROUNDED =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY;
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1kwxkwxle6rjck3.R.inc(27105);
        __CLR4_4_1kwxkwxle6rjck3.R.inc(27106);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kwxkwxle6rjck3.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kwxkwxle6rjck3.R.inc(27107);
        __CLR4_4_1kwxkwxle6rjck3.R.inc(27108);return new TestSuite(TestLocalDate_Constructors.class);
    }finally{__CLR4_4_1kwxkwxle6rjck3.R.flushNeeded();}}

    public TestLocalDate_Constructors(String name) {
        super(name);__CLR4_4_1kwxkwxle6rjck3.R.inc(27110);try{__CLR4_4_1kwxkwxle6rjck3.R.inc(27109);
    }finally{__CLR4_4_1kwxkwxle6rjck3.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kwxkwxle6rjck3.R.inc(27111);
        __CLR4_4_1kwxkwxle6rjck3.R.inc(27112);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kwxkwxle6rjck3.R.inc(27113);zone = DateTimeZone.getDefault();
        __CLR4_4_1kwxkwxle6rjck3.R.inc(27114);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1kwxkwxle6rjck3.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kwxkwxle6rjck3.R.inc(27115);
        __CLR4_4_1kwxkwxle6rjck3.R.inc(27116);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kwxkwxle6rjck3.R.inc(27117);DateTimeZone.setDefault(zone);
        __CLR4_4_1kwxkwxle6rjck3.R.inc(27118);zone = null;
    }finally{__CLR4_4_1kwxkwxle6rjck3.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor_ObjectString2143() throws Throwable {__CLR4_4_1kwxkwxle6rjck3.R.globalSliceStart(getClass().getName(),27119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a1z8zwkxb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwxkwxle6rjck3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwxkwxle6rjck3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectString2143",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27119,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a1z8zwkxb() throws Throwable{try{__CLR4_4_1kwxkwxle6rjck3.R.inc(27119); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27120);LocalDate test = new LocalDate("1972-037"); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27121);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27122);assertEquals(1972, test.getYear()); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27123);assertEquals(2, test.getMonthOfYear()); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27124);assertEquals(6, test.getDayOfMonth()); 
 }finally{__CLR4_4_1kwxkwxle6rjck3.R.flushNeeded();}} 


public void testParse_noFormatter451() throws Throwable {__CLR4_4_1kwxkwxle6rjck3.R.globalSliceStart(getClass().getName(),27125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g26efgkxh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwxkwxle6rjck3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwxkwxle6rjck3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testParse_noFormatter451",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27125,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g26efgkxh() throws Throwable{try{__CLR4_4_1kwxkwxle6rjck3.R.inc(27125); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27126);assertEquals(new LocalDate(2010, 6, 30), LocalDate.parse("2010-06-30")); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27127);assertEquals(new LocalDate(2010, 1, 2), LocalDate.parse("2010-002")); 
 }finally{__CLR4_4_1kwxkwxle6rjck3.R.flushNeeded();}} 


public void testConstructor713() throws Throwable {__CLR4_4_1kwxkwxle6rjck3.R.globalSliceStart(getClass().getName(),27128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e0pltkkxk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwxkwxle6rjck3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwxkwxle6rjck3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor713",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e0pltkkxk() throws Throwable{try{__CLR4_4_1kwxkwxle6rjck3.R.inc(27128); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27129);LocalDate test = new LocalDate(); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27130);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27131);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27132);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27133);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27134);assertEquals(test, LocalDate.now()); 
 }finally{__CLR4_4_1kwxkwxle6rjck3.R.flushNeeded();}} 


public void testConstructor_DateTimeZone714() throws Throwable {__CLR4_4_1kwxkwxle6rjck3.R.globalSliceStart(getClass().getName(),27135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g4jha5kxr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwxkwxle6rjck3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwxkwxle6rjck3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_DateTimeZone714",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27135,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g4jha5kxr() throws Throwable{try{__CLR4_4_1kwxkwxle6rjck3.R.inc(27135); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27136);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27137);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27138);LocalDate test = new LocalDate(LONDON); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27139);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27140);assertEquals(2005, test.getYear()); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27141);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27142);assertEquals(8, test.getDayOfMonth()); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27143);assertEquals(test, LocalDate.now(LONDON)); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27144);test = new LocalDate(PARIS); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27145);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27146);assertEquals(2005, test.getYear()); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27147);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27148);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27149);assertEquals(test, LocalDate.now(PARIS)); 
 }finally{__CLR4_4_1kwxkwxle6rjck3.R.flushNeeded();}} 


public void testConstructor_Chronology715() throws Throwable {__CLR4_4_1kwxkwxle6rjck3.R.globalSliceStart(getClass().getName(),27150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ok9talky6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwxkwxle6rjck3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwxkwxle6rjck3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_Chronology715",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ok9talky6() throws Throwable{try{__CLR4_4_1kwxkwxle6rjck3.R.inc(27150); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27151);LocalDate test = new LocalDate(GREGORIAN_PARIS); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27152);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27153);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27154);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27155);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27156);assertEquals(test, LocalDate.now(GREGORIAN_PARIS)); 
 }finally{__CLR4_4_1kwxkwxle6rjck3.R.flushNeeded();}} 


public void testFactory_fromDateFields_before1970717() throws Exception {__CLR4_4_1kwxkwxle6rjck3.R.globalSliceStart(getClass().getName(),27157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1us7jibkyd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwxkwxle6rjck3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwxkwxle6rjck3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromDateFields_before1970717",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1us7jibkyd() throws Exception{try{__CLR4_4_1kwxkwxle6rjck3.R.inc(27157); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27158);GregorianCalendar cal = new GregorianCalendar(1969, 1, 3, 4, 5, 6); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27159);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27160);LocalDate expected = new LocalDate(1969, 2, 3); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27161);assertEquals(expected, LocalDate.fromDateFields(cal.getTime())); 
 }finally{__CLR4_4_1kwxkwxle6rjck3.R.flushNeeded();}} 


public void testConstructor_long1_Chronology721() throws Throwable {__CLR4_4_1kwxkwxle6rjck3.R.globalSliceStart(getClass().getName(),27162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fjzpp8kyi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwxkwxle6rjck3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwxkwxle6rjck3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_long1_Chronology721",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fjzpp8kyi() throws Throwable{try{__CLR4_4_1kwxkwxle6rjck3.R.inc(27162); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27163);LocalDate test = new LocalDate(TEST_TIME1, GREGORIAN_PARIS); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27164);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27165);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27166);assertEquals(4, test.getMonthOfYear()); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27167);assertEquals(6, test.getDayOfMonth()); 
 }finally{__CLR4_4_1kwxkwxle6rjck3.R.flushNeeded();}} 


public void testConstructor_nullObject_nullDateTimeZone722() throws Throwable {__CLR4_4_1kwxkwxle6rjck3.R.globalSliceStart(getClass().getName(),27168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dteiakyo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kwxkwxle6rjck3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kwxkwxle6rjck3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_nullObject_nullDateTimeZone722",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27168,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dteiakyo() throws Throwable{try{__CLR4_4_1kwxkwxle6rjck3.R.inc(27168); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27169);LocalDate test = new LocalDate((Object) null, (DateTimeZone) null); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27170);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27171);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27172);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kwxkwxle6rjck3.R.inc(27173);assertEquals(9, test.getDayOfMonth()); 
 }finally{__CLR4_4_1kwxkwxle6rjck3.R.flushNeeded();}} 

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

}
