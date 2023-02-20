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
package org.joda.time.format;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Partial;

/**
 * This class is a Junit unit test for ISODateTimeFormat.
 *
 * @author Stephen Colebourne
 */
public class TestISODateTimeFormat extends TestCase {static class __CLR4_4_1lxflxfle6np4vi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,28460,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1lxflxfle6np4vi.R.inc(28419);
        __CLR4_4_1lxflxfle6np4vi.R.inc(28420);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lxflxfle6np4vi.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lxflxfle6np4vi.R.inc(28421);
        __CLR4_4_1lxflxfle6np4vi.R.inc(28422);return new TestSuite(TestISODateTimeFormat.class);
    }finally{__CLR4_4_1lxflxfle6np4vi.R.flushNeeded();}}

    public TestISODateTimeFormat(String name) {
        super(name);__CLR4_4_1lxflxfle6np4vi.R.inc(28424);try{__CLR4_4_1lxflxfle6np4vi.R.inc(28423);
    }finally{__CLR4_4_1lxflxfle6np4vi.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lxflxfle6np4vi.R.inc(28425);
        __CLR4_4_1lxflxfle6np4vi.R.inc(28426);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1lxflxfle6np4vi.R.inc(28427);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1lxflxfle6np4vi.R.inc(28428);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1lxflxfle6np4vi.R.inc(28429);originalLocale = Locale.getDefault();
        __CLR4_4_1lxflxfle6np4vi.R.inc(28430);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1lxflxfle6np4vi.R.inc(28431);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1lxflxfle6np4vi.R.inc(28432);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1lxflxfle6np4vi.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lxflxfle6np4vi.R.inc(28433);
        __CLR4_4_1lxflxfle6np4vi.R.inc(28434);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1lxflxfle6np4vi.R.inc(28435);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1lxflxfle6np4vi.R.inc(28436);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1lxflxfle6np4vi.R.inc(28437);Locale.setDefault(originalLocale);
        __CLR4_4_1lxflxfle6np4vi.R.inc(28438);originalDateTimeZone = null;
        __CLR4_4_1lxflxfle6np4vi.R.inc(28439);originalTimeZone = null;
        __CLR4_4_1lxflxfle6np4vi.R.inc(28440);originalLocale = null;
    }finally{__CLR4_4_1lxflxfle6np4vi.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFormat_year375() {__CLR4_4_1lxflxfle6np4vi.R.globalSliceStart(getClass().getName(),28441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cey7vply1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lxflxfle6np4vi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lxflxfle6np4vi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_year375",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28441,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cey7vply1(){try{__CLR4_4_1lxflxfle6np4vi.R.inc(28441); 
     __CLR4_4_1lxflxfle6np4vi.R.inc(28442);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1lxflxfle6np4vi.R.inc(28443);assertEquals("2004", ISODateTimeFormat.year().print(dt)); 
     __CLR4_4_1lxflxfle6np4vi.R.inc(28444);dt = dt.withZone(LONDON); 
     __CLR4_4_1lxflxfle6np4vi.R.inc(28445);assertEquals("2004", ISODateTimeFormat.year().print(dt)); 
     __CLR4_4_1lxflxfle6np4vi.R.inc(28446);dt = dt.withZone(PARIS); 
     __CLR4_4_1lxflxfle6np4vi.R.inc(28447);assertEquals("2004", ISODateTimeFormat.year().print(dt)); 
 }finally{__CLR4_4_1lxflxfle6np4vi.R.flushNeeded();}}
public void testFormat_yearMonth376() {__CLR4_4_1lxflxfle6np4vi.R.globalSliceStart(getClass().getName(),28448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1se4ixgly8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lxflxfle6np4vi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lxflxfle6np4vi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_yearMonth376",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28448,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1se4ixgly8(){try{__CLR4_4_1lxflxfle6np4vi.R.inc(28448); 
     __CLR4_4_1lxflxfle6np4vi.R.inc(28449);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1lxflxfle6np4vi.R.inc(28450);assertEquals("2004-06-09", ISODateTimeFormat.yearMonth().print(dt)); 
     __CLR4_4_1lxflxfle6np4vi.R.inc(28451);dt = dt.withZone(LONDON); 
     __CLR4_4_1lxflxfle6np4vi.R.inc(28452);assertEquals("2004-06-09", ISODateTimeFormat.yearMonth().print(dt)); 
     __CLR4_4_1lxflxfle6np4vi.R.inc(28453);dt = dt.withZone(PARIS); 
     __CLR4_4_1lxflxfle6np4vi.R.inc(28454);assertEquals("2004-06-09", ISODateTimeFormat.yearMonth().print(dt)); 
 }finally{__CLR4_4_1lxflxfle6np4vi.R.flushNeeded();}}
public void test_Amman_2006393() {__CLR4_4_1lxflxfle6np4vi.R.globalSliceStart(getClass().getName(),28455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18bommlyf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lxflxfle6np4vi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lxflxfle6np4vi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.test_Amman_2006393",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18bommlyf(){try{__CLR4_4_1lxflxfle6np4vi.R.inc(28455); 
     __CLR4_4_1lxflxfle6np4vi.R.inc(28456);DateTimeZone zone = DateTimeZone.forID("Asia/Amman"); 
     __CLR4_4_1lxflxfle6np4vi.R.inc(28457);DateTime dt = new DateTime(2006, 3, 1, 0, 0, zone); 
     __CLR4_4_1lxflxfle6np4vi.R.inc(28458);long next = zone.nextTransition(dt.getMillis()); 
     __CLR4_4_1lxflxfle6np4vi.R.inc(28459);assertEquals(next, new DateTime(2006, 3, 31, 0, 0, DateTimeZone.forOffsetHours(2)).getMillis()); 
 }finally{__CLR4_4_1lxflxfle6np4vi.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

}
