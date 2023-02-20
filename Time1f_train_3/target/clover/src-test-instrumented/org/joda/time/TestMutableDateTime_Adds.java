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

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Adds extends TestCase {static class __CLR4_4_1lsjlsjle6rclca{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,28346,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

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
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1lsjlsjle6rclca.R.inc(28243);
        __CLR4_4_1lsjlsjle6rclca.R.inc(28244);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lsjlsjle6rclca.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lsjlsjle6rclca.R.inc(28245);
        __CLR4_4_1lsjlsjle6rclca.R.inc(28246);return new TestSuite(TestMutableDateTime_Adds.class);
    }finally{__CLR4_4_1lsjlsjle6rclca.R.flushNeeded();}}

    public TestMutableDateTime_Adds(String name) {
        super(name);__CLR4_4_1lsjlsjle6rclca.R.inc(28248);try{__CLR4_4_1lsjlsjle6rclca.R.inc(28247);
    }finally{__CLR4_4_1lsjlsjle6rclca.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lsjlsjle6rclca.R.inc(28249);
        __CLR4_4_1lsjlsjle6rclca.R.inc(28250);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1lsjlsjle6rclca.R.inc(28251);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1lsjlsjle6rclca.R.inc(28252);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1lsjlsjle6rclca.R.inc(28253);originalLocale = Locale.getDefault();
        __CLR4_4_1lsjlsjle6rclca.R.inc(28254);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1lsjlsjle6rclca.R.inc(28255);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1lsjlsjle6rclca.R.inc(28256);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1lsjlsjle6rclca.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lsjlsjle6rclca.R.inc(28257);
        __CLR4_4_1lsjlsjle6rclca.R.inc(28258);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1lsjlsjle6rclca.R.inc(28259);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1lsjlsjle6rclca.R.inc(28260);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1lsjlsjle6rclca.R.inc(28261);Locale.setDefault(originalLocale);
        __CLR4_4_1lsjlsjle6rclca.R.inc(28262);originalDateTimeZone = null;
        __CLR4_4_1lsjlsjle6rclca.R.inc(28263);originalTimeZone = null;
        __CLR4_4_1lsjlsjle6rclca.R.inc(28264);originalLocale = null;
    }finally{__CLR4_4_1lsjlsjle6rclca.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testAdd_long11009() {__CLR4_4_1lsjlsjle6rclca.R.globalSliceStart(getClass().getName(),28265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18rbtu4lt5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsjlsjle6rclca.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsjlsjle6rclca.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_long11009",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18rbtu4lt5(){try{__CLR4_4_1lsjlsjle6rclca.R.inc(28265); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28266);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28267);test.add(123456L); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28268);assertEquals(TEST_TIME1 + 123456L, test.getMillis()); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28269);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1lsjlsjle6rclca.R.flushNeeded();}} 


public void testAdd_RD21010() {__CLR4_4_1lsjlsjle6rclca.R.globalSliceStart(getClass().getName(),28270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1632v91lta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsjlsjle6rclca.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsjlsjle6rclca.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RD21010",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28270,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1632v91lta(){try{__CLR4_4_1lsjlsjle6rclca.R.inc(28270); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28271);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28272);test.add((ReadableDuration) null); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28273);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1lsjlsjle6rclca.R.flushNeeded();}} 


public void testAdd_RD_int11011() {__CLR4_4_1lsjlsjle6rclca.R.globalSliceStart(getClass().getName(),28274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wf9dl1lte();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsjlsjle6rclca.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsjlsjle6rclca.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RD_int11011",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28274,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wf9dl1lte(){try{__CLR4_4_1lsjlsjle6rclca.R.inc(28274); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28275);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28276);test.add(new Duration(123456L), -2); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28277);assertEquals(TEST_TIME1 - (2L * 123456L), test.getMillis()); 
 }finally{__CLR4_4_1lsjlsjle6rclca.R.flushNeeded();}} 


public void testAdd_RP21012() {__CLR4_4_1lsjlsjle6rclca.R.globalSliceStart(getClass().getName(),28278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12h5sb9lti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsjlsjle6rclca.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsjlsjle6rclca.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RP21012",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28278,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12h5sb9lti(){try{__CLR4_4_1lsjlsjle6rclca.R.inc(28278); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28279);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28280);test.add((ReadablePeriod) null); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28281);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1lsjlsjle6rclca.R.flushNeeded();}} 


public void testAdd_RP_int11013() {__CLR4_4_1lsjlsjle6rclca.R.globalSliceStart(getClass().getName(),28282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16krarpltm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsjlsjle6rclca.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsjlsjle6rclca.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_RP_int11013",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16krarpltm(){try{__CLR4_4_1lsjlsjle6rclca.R.inc(28282); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28283);Period d = new Period(0, 0, 0, 0, 0, 0, 1, 2); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28284);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28285);test.add(d, -2); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28286);assertEquals(TEST_TIME1 - (2L * 1002L), test.getMillis()); 
 }finally{__CLR4_4_1lsjlsjle6rclca.R.flushNeeded();}} 


public void testAdd_DurationFieldType_int31017() {__CLR4_4_1lsjlsjle6rclca.R.globalSliceStart(getClass().getName(),28287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1psdstdltr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsjlsjle6rclca.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsjlsjle6rclca.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_DurationFieldType_int31017",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1psdstdltr(){try{__CLR4_4_1lsjlsjle6rclca.R.inc(28287); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28288);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28289);try { 
         __CLR4_4_1lsjlsjle6rclca.R.inc(28290);test.add((DurationFieldType) null, 6); 
         __CLR4_4_1lsjlsjle6rclca.R.inc(28291);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28292);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1lsjlsjle6rclca.R.flushNeeded();}} 


public void testAddYears_int11019() {__CLR4_4_1lsjlsjle6rclca.R.globalSliceStart(getClass().getName(),28293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cr90m0ltx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsjlsjle6rclca.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsjlsjle6rclca.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddYears_int11019",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cr90m0ltx(){try{__CLR4_4_1lsjlsjle6rclca.R.inc(28293); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28294);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28295);test.addYears(8); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28296);assertEquals("2010-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1lsjlsjle6rclca.R.flushNeeded();}} 


public void testAddWeekyears_int11021() {__CLR4_4_1lsjlsjle6rclca.R.globalSliceStart(getClass().getName(),28297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bydyctlu1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsjlsjle6rclca.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsjlsjle6rclca.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddWeekyears_int11021",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bydyctlu1(){try{__CLR4_4_1lsjlsjle6rclca.R.inc(28297); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28298);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28299);test.addWeekyears(-1); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28300);assertEquals("2001-06-10T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1lsjlsjle6rclca.R.flushNeeded();}} 


public void testAddMonths_int_dstOverlapSummer_addZero1022() {__CLR4_4_1lsjlsjle6rclca.R.globalSliceStart(getClass().getName(),28301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qmo1g2lu5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsjlsjle6rclca.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsjlsjle6rclca.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMonths_int_dstOverlapSummer_addZero1022",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28301,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qmo1g2lu5(){try{__CLR4_4_1lsjlsjle6rclca.R.inc(28301); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28302);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28303);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28304);test.addMonths(0); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28305);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 }finally{__CLR4_4_1lsjlsjle6rclca.R.flushNeeded();}} 


public void testAddMonths_int11023() {__CLR4_4_1lsjlsjle6rclca.R.globalSliceStart(getClass().getName(),28306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a8g30mlua();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsjlsjle6rclca.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsjlsjle6rclca.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMonths_int11023",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a8g30mlua(){try{__CLR4_4_1lsjlsjle6rclca.R.inc(28306); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28307);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28308);test.addMonths(6); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28309);assertEquals("2002-12-09T05:06:07.008Z", test.toString()); 
 }finally{__CLR4_4_1lsjlsjle6rclca.R.flushNeeded();}} 


public void testAddWeeks_int_dstOverlapSummer_addZero1025() {__CLR4_4_1lsjlsjle6rclca.R.globalSliceStart(getClass().getName(),28310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uyqgqllue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsjlsjle6rclca.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsjlsjle6rclca.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddWeeks_int_dstOverlapSummer_addZero1025",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uyqgqllue(){try{__CLR4_4_1lsjlsjle6rclca.R.inc(28310); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28311);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28312);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28313);test.addWeeks(0); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28314);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 }finally{__CLR4_4_1lsjlsjle6rclca.R.flushNeeded();}} 


public void testAddWeeks_int11026() {__CLR4_4_1lsjlsjle6rclca.R.globalSliceStart(getClass().getName(),28315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxccrpluj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsjlsjle6rclca.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsjlsjle6rclca.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddWeeks_int11026",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28315,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxccrpluj(){try{__CLR4_4_1lsjlsjle6rclca.R.inc(28315); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28316);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28317);test.addWeeks(-21); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28318);assertEquals("2002-01-13T05:06:07.008Z", test.toString()); 
 }finally{__CLR4_4_1lsjlsjle6rclca.R.flushNeeded();}} 


public void testAddDays_int_dstOverlapSummer_addZero1029() {__CLR4_4_1lsjlsjle6rclca.R.globalSliceStart(getClass().getName(),28319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uy253jlun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsjlsjle6rclca.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsjlsjle6rclca.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddDays_int_dstOverlapSummer_addZero1029",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28319,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uy253jlun(){try{__CLR4_4_1lsjlsjle6rclca.R.inc(28319); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28320);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28321);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28322);test.addDays(0); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28323);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 }finally{__CLR4_4_1lsjlsjle6rclca.R.flushNeeded();}} 


public void testAddDays_int11030() {__CLR4_4_1lsjlsjle6rclca.R.globalSliceStart(getClass().getName(),28324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13d15filus();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsjlsjle6rclca.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsjlsjle6rclca.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddDays_int11030",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13d15filus(){try{__CLR4_4_1lsjlsjle6rclca.R.inc(28324); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28325);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28326);test.addDays(17); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28327);assertEquals("2002-06-26T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1lsjlsjle6rclca.R.flushNeeded();}} 


public void testAddMinutes_int11033() {__CLR4_4_1lsjlsjle6rclca.R.globalSliceStart(getClass().getName(),28328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1od8syxluw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsjlsjle6rclca.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsjlsjle6rclca.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMinutes_int11033",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28328,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1od8syxluw(){try{__CLR4_4_1lsjlsjle6rclca.R.inc(28328); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28329);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28330);test.addMinutes(13); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28331);assertEquals("2002-06-09T05:19:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1lsjlsjle6rclca.R.flushNeeded();}} 


public void testAddSeconds_int11035() {__CLR4_4_1lsjlsjle6rclca.R.globalSliceStart(getClass().getName(),28332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_195ek55lv0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsjlsjle6rclca.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsjlsjle6rclca.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddSeconds_int11035",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_195ek55lv0(){try{__CLR4_4_1lsjlsjle6rclca.R.inc(28332); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28333);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28334);test.addSeconds(13); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28335);assertEquals("2002-06-09T05:06:20.008+01:00", test.toString()); 
 }finally{__CLR4_4_1lsjlsjle6rclca.R.flushNeeded();}} 


public void testAddMillis_int_dstOverlapWinter_addZero1038() {__CLR4_4_1lsjlsjle6rclca.R.globalSliceStart(getClass().getName(),28336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qmvt9ylv4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsjlsjle6rclca.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsjlsjle6rclca.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMillis_int_dstOverlapWinter_addZero1038",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qmvt9ylv4(){try{__CLR4_4_1lsjlsjle6rclca.R.inc(28336); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28337);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28338);test.addHours(1); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28339);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28340);test.addMillis(0); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28341);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1lsjlsjle6rclca.R.flushNeeded();}} 


public void testAddMillis_int11039() {__CLR4_4_1lsjlsjle6rclca.R.globalSliceStart(getClass().getName(),28342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_187xkc8lva();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lsjlsjle6rclca.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lsjlsjle6rclca.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMillis_int11039",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28342,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_187xkc8lva(){try{__CLR4_4_1lsjlsjle6rclca.R.inc(28342); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28343);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28344);test.addMillis(13); 
     __CLR4_4_1lsjlsjle6rclca.R.inc(28345);assertEquals("2002-06-09T05:06:07.021+01:00", test.toString()); 
 }finally{__CLR4_4_1lsjlsjle6rclca.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

}
