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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a Junit unit test for Hours.
 *
 * @author Stephen Colebourne
 */
public class TestHours extends TestCase {static class __CLR4_4_1hlthltle6nl882{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,22850,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1hlthltle6nl882.R.inc(22817);
        __CLR4_4_1hlthltle6nl882.R.inc(22818);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hlthltle6nl882.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hlthltle6nl882.R.inc(22819);
        __CLR4_4_1hlthltle6nl882.R.inc(22820);return new TestSuite(TestHours.class);
    }finally{__CLR4_4_1hlthltle6nl882.R.flushNeeded();}}

    public TestHours(String name) {
        super(name);__CLR4_4_1hlthltle6nl882.R.inc(22822);try{__CLR4_4_1hlthltle6nl882.R.inc(22821);
    }finally{__CLR4_4_1hlthltle6nl882.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hlthltle6nl882.R.inc(22823);
    }finally{__CLR4_4_1hlthltle6nl882.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hlthltle6nl882.R.inc(22824);
    }finally{__CLR4_4_1hlthltle6nl882.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFactory_hoursBetween_RPartial454() {__CLR4_4_1hlthltle6nl882.R.globalSliceStart(getClass().getName(),22825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1853ux8hm1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlthltle6nl882.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlthltle6nl882.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testFactory_hoursBetween_RPartial454",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22825,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1853ux8hm1(){try{__CLR4_4_1hlthltle6nl882.R.inc(22825); 
     __CLR4_4_1hlthltle6nl882.R.inc(22826);LocalTime start = new LocalTime(12, 0, 3); 
     __CLR4_4_1hlthltle6nl882.R.inc(22827);LocalTime end1 = new LocalTime(12, 0, 6); 
     __CLR4_4_1hlthltle6nl882.R.inc(22828);@SuppressWarnings("deprecation") 
     TimeOfDay end2 = new TimeOfDay(12, 0, 9); 
     __CLR4_4_1hlthltle6nl882.R.inc(22829);assertEquals(3, Hours.hoursBetween(start, end1).getHours()); 
     __CLR4_4_1hlthltle6nl882.R.inc(22830);assertEquals(0, Hours.hoursBetween(start, start).getHours()); 
     __CLR4_4_1hlthltle6nl882.R.inc(22831);assertEquals(0, Hours.hoursBetween(end1, end1).getHours()); 
     __CLR4_4_1hlthltle6nl882.R.inc(22832);assertEquals(-3, Hours.hoursBetween(end1, start).getHours()); 
     __CLR4_4_1hlthltle6nl882.R.inc(22833);assertEquals(6, Hours.hoursBetween(start, end2).getHours()); 
 }finally{__CLR4_4_1hlthltle6nl882.R.flushNeeded();}}
public void testToStandardDays456() {__CLR4_4_1hlthltle6nl882.R.globalSliceStart(getClass().getName(),22834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1utpr0lhma();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlthltle6nl882.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlthltle6nl882.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardDays456",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22834,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1utpr0lhma(){try{__CLR4_4_1hlthltle6nl882.R.inc(22834); 
     __CLR4_4_1hlthltle6nl882.R.inc(22835);Hours test = Hours.hours(24 * 60 * 60 * 1000); 
     __CLR4_4_1hlthltle6nl882.R.inc(22836);Days expected = Days.days(2); 
     __CLR4_4_1hlthltle6nl882.R.inc(22837);assertEquals(expected, test.toStandardDays()); 
 }finally{__CLR4_4_1hlthltle6nl882.R.flushNeeded();}}
public void testToStandardDuration457() {__CLR4_4_1hlthltle6nl882.R.globalSliceStart(getClass().getName(),22838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1amiz33hme();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlthltle6nl882.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlthltle6nl882.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testToStandardDuration457",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1amiz33hme(){try{__CLR4_4_1hlthltle6nl882.R.inc(22838); 
     __CLR4_4_1hlthltle6nl882.R.inc(22839);Hours test = Hours.hours(20); 
     __CLR4_4_1hlthltle6nl882.R.inc(22840);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_HOUR); 
     __CLR4_4_1hlthltle6nl882.R.inc(22841);assertEquals(expected, test.toStandardDuration()); 
     __CLR4_4_1hlthltle6nl882.R.inc(22842);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_HOUR); 
     __CLR4_4_1hlthltle6nl882.R.inc(22843);assertEquals(expected, Hours.MAX_VALUE.toStandardDuration()); 
 }finally{__CLR4_4_1hlthltle6nl882.R.flushNeeded();}}
public void testIsGreaterThan458() {__CLR4_4_1hlthltle6nl882.R.globalSliceStart(getClass().getName(),22844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mye8ldhmk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlthltle6nl882.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlthltle6nl882.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestHours.testIsGreaterThan458",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22844,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mye8ldhmk(){try{__CLR4_4_1hlthltle6nl882.R.inc(22844); 
     __CLR4_4_1hlthltle6nl882.R.inc(22845);assertEquals(true, Hours.THREE.isGreaterThan(Hours.TWO)); 
     __CLR4_4_1hlthltle6nl882.R.inc(22846);assertEquals(false, Hours.THREE.isGreaterThan(Hours.THREE)); 
     __CLR4_4_1hlthltle6nl882.R.inc(22847);assertEquals(false, Hours.TWO.isGreaterThan(Hours.THREE)); 
     __CLR4_4_1hlthltle6nl882.R.inc(22848);assertEquals(true, Hours.ONE.isGreaterThan(null)); 
     __CLR4_4_1hlthltle6nl882.R.inc(22849);assertEquals(false, Hours.hours(-1).isGreaterThan(null)); 
 }finally{__CLR4_4_1hlthltle6nl882.R.flushNeeded();}}
    

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
