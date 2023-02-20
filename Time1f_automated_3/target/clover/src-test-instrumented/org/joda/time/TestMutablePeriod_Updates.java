/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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
 * This class is a JUnit test for MutableDuration.
 *
 * @author Stephen Colebourne
 */
public class TestMutablePeriod_Updates extends TestCase {static class __CLR4_4_1j9zj9zle6np4kh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,25131,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1j9zj9zle6np4kh.R.inc(24983);
        __CLR4_4_1j9zj9zle6np4kh.R.inc(24984);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1j9zj9zle6np4kh.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1j9zj9zle6np4kh.R.inc(24985);
        __CLR4_4_1j9zj9zle6np4kh.R.inc(24986);return new TestSuite(TestMutablePeriod_Updates.class);
    }finally{__CLR4_4_1j9zj9zle6np4kh.R.flushNeeded();}}

    public TestMutablePeriod_Updates(String name) {
        super(name);__CLR4_4_1j9zj9zle6np4kh.R.inc(24988);try{__CLR4_4_1j9zj9zle6np4kh.R.inc(24987);
    }finally{__CLR4_4_1j9zj9zle6np4kh.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1j9zj9zle6np4kh.R.inc(24989);
        __CLR4_4_1j9zj9zle6np4kh.R.inc(24990);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1j9zj9zle6np4kh.R.inc(24991);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1j9zj9zle6np4kh.R.inc(24992);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1j9zj9zle6np4kh.R.inc(24993);originalLocale = Locale.getDefault();
        __CLR4_4_1j9zj9zle6np4kh.R.inc(24994);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1j9zj9zle6np4kh.R.inc(24995);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1j9zj9zle6np4kh.R.inc(24996);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1j9zj9zle6np4kh.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1j9zj9zle6np4kh.R.inc(24997);
        __CLR4_4_1j9zj9zle6np4kh.R.inc(24998);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1j9zj9zle6np4kh.R.inc(24999);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1j9zj9zle6np4kh.R.inc(25000);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1j9zj9zle6np4kh.R.inc(25001);Locale.setDefault(originalLocale);
        __CLR4_4_1j9zj9zle6np4kh.R.inc(25002);originalDateTimeZone = null;
        __CLR4_4_1j9zj9zle6np4kh.R.inc(25003);originalTimeZone = null;
        __CLR4_4_1j9zj9zle6np4kh.R.inc(25004);originalLocale = null;
    }finally{__CLR4_4_1j9zj9zle6np4kh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testWithField4354() {__CLR4_4_1j9zj9zle6np4kh.R.globalSliceStart(getClass().getName(),25005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t9w7axjal();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j9zj9zle6np4kh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j9zj9zle6np4kh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testWithField4354",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25005,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t9w7axjal(){try{__CLR4_4_1j9zj9zle6np4kh.R.inc(25005); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25006);Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25007);test.withField(DurationFieldType.years(), 0); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25008);assertEquals(0, test.getYears()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25009);assertEquals(0, test.getMonths()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25010);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25011);assertEquals(0, test.getDays()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25012);assertEquals(5, test.getHours()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25013);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25014);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25015);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1j9zj9zle6np4kh.R.flushNeeded();}}
public void testAddDays355() {__CLR4_4_1j9zj9zle6np4kh.R.globalSliceStart(getClass().getName(),25016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1urjz58jaw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j9zj9zle6np4kh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j9zj9zle6np4kh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddDays355",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25016,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1urjz58jaw(){try{__CLR4_4_1j9zj9zle6np4kh.R.inc(25016); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25017);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25018);test.addDays(10); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25019);assertEquals(14, test.getDays()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25020);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25021);test.addDays(-10); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25022);assertEquals(-6, test.getDays()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25023);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25024);test.addDays(0); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25025);assertEquals(4, test.getDays()); 
 }finally{__CLR4_4_1j9zj9zle6np4kh.R.flushNeeded();}}
public void testConstructor501() throws Throwable {__CLR4_4_1j9zj9zle6np4kh.R.globalSliceStart(getClass().getName(),25026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hxfukrjb6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j9zj9zle6np4kh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j9zj9zle6np4kh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testConstructor501",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25026,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hxfukrjb6() throws Throwable{try{__CLR4_4_1j9zj9zle6np4kh.R.inc(25026); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25027);MutablePeriod test = new MutablePeriod(); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25028);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25029);assertEquals(0, test.getYears()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25030);assertEquals(0, test.getMonths()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25031);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25032);assertEquals(0, test.getDays()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25033);assertEquals(0, test.getHours()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25034);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25035);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25036);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1j9zj9zle6np4kh.R.flushNeeded();}}
public void testSetPeriod_long1503() {__CLR4_4_1j9zj9zle6np4kh.R.globalSliceStart(getClass().getName(),25037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sqvua0jbh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j9zj9zle6np4kh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j9zj9zle6np4kh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long1503",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25037,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sqvua0jbh(){try{__CLR4_4_1j9zj9zle6np4kh.R.inc(25037); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25038);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25039);test.setPeriod(100L); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25040);assertEquals(0, test.getYears()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25041);assertEquals(0, test.getMonths()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25042);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25043);assertEquals(0, test.getDays()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25044);assertEquals(0, test.getHours()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25045);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25046);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25047);assertEquals(100, test.getMillis()); 
 }finally{__CLR4_4_1j9zj9zle6np4kh.R.flushNeeded();}}
public void testSetPeriod_8ints2504() {__CLR4_4_1j9zj9zle6np4kh.R.globalSliceStart(getClass().getName(),25048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v3jpnojbs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j9zj9zle6np4kh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j9zj9zle6np4kh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_8ints2504",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25048,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v3jpnojbs(){try{__CLR4_4_1j9zj9zle6np4kh.R.inc(25048); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25049);MutablePeriod test = new MutablePeriod(100L, PeriodType.millis()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25050);try { 
         __CLR4_4_1j9zj9zle6np4kh.R.inc(25051);test.setPeriod(11, 12, 13, 14, 15, 16, 17, 18); 
         __CLR4_4_1j9zj9zle6np4kh.R.inc(25052);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25053);assertEquals(0, test.getYears()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25054);assertEquals(0, test.getMonths()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25055);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25056);assertEquals(0, test.getDays()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25057);assertEquals(0, test.getHours()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25058);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25059);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25060);assertEquals(100, test.getMillis()); 
 }finally{__CLR4_4_1j9zj9zle6np4kh.R.flushNeeded();}}
public void testSetPeriod_long_long_NoMinutes505() {__CLR4_4_1j9zj9zle6np4kh.R.globalSliceStart(getClass().getName(),25061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fqas4vjc5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j9zj9zle6np4kh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j9zj9zle6np4kh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long_NoMinutes505",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25061,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fqas4vjc5(){try{__CLR4_4_1j9zj9zle6np4kh.R.inc(25061); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25062);MutablePeriod test = new MutablePeriod(PeriodType.standard().withMinutesRemoved()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25063);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25064);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25065);test.setPeriod(dt1.getMillis(), dt2.getMillis()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25066);assertEquals(1, test.getYears()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25067);assertEquals(1, test.getMonths()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25068);assertEquals(1, test.getWeeks()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25069);assertEquals(1, test.getDays()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25070);assertEquals(1, test.getHours()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25071);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25072);assertEquals(61, test.getSeconds()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25073);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1j9zj9zle6np4kh.R.flushNeeded();}}
public void testAdd_8ints1506() {__CLR4_4_1j9zj9zle6np4kh.R.globalSliceStart(getClass().getName(),25074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rfqlvnjci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j9zj9zle6np4kh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j9zj9zle6np4kh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_8ints1506",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25074,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rfqlvnjci(){try{__CLR4_4_1j9zj9zle6np4kh.R.inc(25074); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25075);MutablePeriod test = new MutablePeriod(100L, PeriodType.millis()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25076);test.add(11, 12, 13, 14, 15, 16, 17, 18); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25077);assertEquals(0, test.getYears()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25078);assertEquals(0, test.getMonths()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25079);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25080);assertEquals(0, test.getDays()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25081);assertEquals(0, test.getHours()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25082);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25083);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25084);assertEquals(100, test.getMillis()); 
 }finally{__CLR4_4_1j9zj9zle6np4kh.R.flushNeeded();}}
public void testAdd_long1507() {__CLR4_4_1j9zj9zle6np4kh.R.globalSliceStart(getClass().getName(),25085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ouhzkyjct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j9zj9zle6np4kh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j9zj9zle6np4kh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_long1507",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25085,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ouhzkyjct(){try{__CLR4_4_1j9zj9zle6np4kh.R.inc(25085); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25086);MutablePeriod test = new MutablePeriod(100L); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25087);test.add(0L); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25088);assertEquals(0, test.getYears()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25089);assertEquals(0, test.getMonths()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25090);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25091);assertEquals(0, test.getDays()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25092);assertEquals(0, test.getHours()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25093);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25094);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25095);assertEquals(200, test.getMillis()); 
 }finally{__CLR4_4_1j9zj9zle6np4kh.R.flushNeeded();}}
public void testAdd_long_Chronology2508() {__CLR4_4_1j9zj9zle6np4kh.R.globalSliceStart(getClass().getName(),25096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cqryqljd4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j9zj9zle6np4kh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j9zj9zle6np4kh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_long_Chronology2508",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25096,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cqryqljd4(){try{__CLR4_4_1j9zj9zle6np4kh.R.inc(25096); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25097);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25098);MutablePeriod test = new MutablePeriod(length, ISOChronology.getInstanceUTC()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25099);test.add(0L, ISOChronology.getInstanceUTC()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25100);assertEquals(1, test.getYears()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25101);assertEquals(1, test.getMonths()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25102);assertEquals(1, test.getWeeks()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25103);assertEquals(1, test.getDays()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25104);assertEquals(1, test.getHours()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25105);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25106);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25107);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1j9zj9zle6np4kh.R.flushNeeded();}}
public void testSetWeeks509() {__CLR4_4_1j9zj9zle6np4kh.R.globalSliceStart(getClass().getName(),25108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12bfc6ijdg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j9zj9zle6np4kh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j9zj9zle6np4kh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetWeeks509",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25108,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12bfc6ijdg(){try{__CLR4_4_1j9zj9zle6np4kh.R.inc(25108); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25109);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25110);test.setWeeks(10); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25111);assertEquals(10, test.getWeeks()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25112);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25113);test.setWeeks(-10); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25114);assertEquals(-10, test.getWeeks()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25115);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25116);test.setWeeks(0); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25117);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25118);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25119);test.setWeeks(5); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25120);assertEquals(5, test.getWeeks()); 
 }finally{__CLR4_4_1j9zj9zle6np4kh.R.flushNeeded();}}
public void testAddHours511() {__CLR4_4_1j9zj9zle6np4kh.R.globalSliceStart(getClass().getName(),25121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y7pqlgjdt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j9zj9zle6np4kh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j9zj9zle6np4kh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddHours511",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y7pqlgjdt(){try{__CLR4_4_1j9zj9zle6np4kh.R.inc(25121); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25122);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25123);test.addHours(10); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25124);assertEquals(14, test.getHours()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25125);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25126);test.addHours(-10); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25127);assertEquals(-6, test.getHours()); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25128);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25129);test.addHours(0); 
     __CLR4_4_1j9zj9zle6np4kh.R.inc(25130);assertEquals(4, test.getHours()); 
 }finally{__CLR4_4_1j9zj9zle6np4kh.R.flushNeeded();}}
    

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
    

    

//    public void testSetPeriod_long3() {
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType());
//        test.setPeriod(
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//    }
//
//    public void testSetPeriod_long4() {
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearWeekType());
//        test.setPeriod(
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L);
//        assertEquals(1, test.getYears());
//        assertEquals(0, test.getMonths());
//        assertEquals(12, test.getWeeks());
//        assertEquals(1, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//    }
//
//    public void testSetPeriod_long_NoYears() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withYearsRemoved());
//        test.setPeriod(ms);
//        assertEquals(0, test.getYears());
//        assertEquals(15, test.getMonths()); // totalDays=365+85=450=15*30
//        assertEquals(0, test.getWeeks());
//        assertEquals(0, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoMonths() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withMonthsRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(0, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(85, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoWeeks() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearWeekType().withWeeksRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(0, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(85, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoDays() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withDaysRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(0, test.getDays());
//        assertEquals(5 + 25 * 24, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoHours() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withHoursRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(0, test.getHours());
//        assertEquals(6 + 5 * 60, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoMinutes() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withMinutesRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(0, test.getMinutes());
//        assertEquals(7 + 6 * 60, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoSeconds() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withSecondsRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(0, test.getSeconds());
//        assertEquals(8 + 7 * 1000, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoMillis() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withMillisRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(0, test.getMillis());
//        assertEquals(ms - 8, test.toDurationMillis());
//    }

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

}
