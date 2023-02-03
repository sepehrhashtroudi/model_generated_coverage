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
package org.joda.time.tz;

import java.util.Date;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeZone;

/**
 * Test cases for FixedDateTimeZone.
 *
 * @author Stephen Colebourne
 */
public class TestFixedDateTimeZone extends TestCase {static class __CLR4_4_1wnlwnllc8axf97{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,42373,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1wnlwnllc8axf97.R.inc(42321);
        __CLR4_4_1wnlwnllc8axf97.R.inc(42322);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1wnlwnllc8axf97.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1wnlwnllc8axf97.R.inc(42323);
        __CLR4_4_1wnlwnllc8axf97.R.inc(42324);return new TestSuite(TestFixedDateTimeZone.class);
    }finally{__CLR4_4_1wnlwnllc8axf97.R.flushNeeded();}}

    private DateTimeZone originalDateTimeZone = null;

    public TestFixedDateTimeZone(String name) {
        super(name);__CLR4_4_1wnlwnllc8axf97.R.inc(42326);try{__CLR4_4_1wnlwnllc8axf97.R.inc(42325);
    }finally{__CLR4_4_1wnlwnllc8axf97.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1wnlwnllc8axf97.R.inc(42327);
        __CLR4_4_1wnlwnllc8axf97.R.inc(42328);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1wnlwnllc8axf97.R.inc(42329);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_1wnlwnllc8axf97.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1wnlwnllc8axf97.R.inc(42330);
        __CLR4_4_1wnlwnllc8axf97.R.inc(42331);DateTimeZone.setDefault(originalDateTimeZone);
    }finally{__CLR4_4_1wnlwnllc8axf97.R.flushNeeded();}}


public void testHashCode239() throws Exception {__CLR4_4_1wnlwnllc8axf97.R.globalSliceStart(getClass().getName(),42332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vcumlqwnw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wnlwnllc8axf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wnlwnllc8axf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestFixedDateTimeZone.testHashCode239",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vcumlqwnw() throws Exception{try{__CLR4_4_1wnlwnllc8axf97.R.inc(42332); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42333);FixedDateTimeZone zone1 = new FixedDateTimeZone("A", "B", 1, 5); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42334);FixedDateTimeZone zone1b = new FixedDateTimeZone("A", "B", 1, 5); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42335);FixedDateTimeZone zone2 = new FixedDateTimeZone("A", "C", 1, 5); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42336);FixedDateTimeZone zone3 = new FixedDateTimeZone("A", "B", 2, 5); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42337);FixedDateTimeZone zone4 = new FixedDateTimeZone("A", "B", 1, 6); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42338);assertEquals(true, zone1.hashCode() == zone1.hashCode()); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42339);assertEquals(true, zone1.hashCode() == zone1b.hashCode()); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42340);assertEquals(true, zone1.hashCode() == zone2.hashCode()); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42341);assertEquals(false, zone1.hashCode() == zone3.hashCode()); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42342);assertEquals(false, zone1.hashCode() == zone4.hashCode()); 
 }finally{__CLR4_4_1wnlwnllc8axf97.R.flushNeeded();}} 


public void testEquals1214() throws Exception {__CLR4_4_1wnlwnllc8axf97.R.globalSliceStart(getClass().getName(),42343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ljmqjowo7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wnlwnllc8axf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wnlwnllc8axf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestFixedDateTimeZone.testEquals1214",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ljmqjowo7() throws Exception{try{__CLR4_4_1wnlwnllc8axf97.R.inc(42343); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42344);FixedDateTimeZone zone1 = new FixedDateTimeZone("A", "B", 1, 5); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42345);FixedDateTimeZone zone1b = new FixedDateTimeZone("A", "B", 1, 5); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42346);FixedDateTimeZone zone2 = new FixedDateTimeZone("A", "C", 1, 5); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42347);FixedDateTimeZone zone3 = new FixedDateTimeZone("A", "B", 2, 5); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42348);FixedDateTimeZone zone4 = new FixedDateTimeZone("A", "B", 1, 6); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42349);assertEquals(true, zone1.equals(zone1)); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42350);assertEquals(true, zone1.equals(zone1b)); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42351);assertEquals(true, zone1.equals(zone2)); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42352);assertEquals(false, zone1.equals(zone3)); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42353);assertEquals(false, zone1.equals(zone4)); 
 }finally{__CLR4_4_1wnlwnllc8axf97.R.flushNeeded();}} 


public void testToTimeZone21623() throws Exception {__CLR4_4_1wnlwnllc8axf97.R.globalSliceStart(getClass().getName(),42354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e7bdx5woi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wnlwnllc8axf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wnlwnllc8axf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestFixedDateTimeZone.testToTimeZone21623",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e7bdx5woi() throws Exception{try{__CLR4_4_1wnlwnllc8axf97.R.inc(42354); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42355);FixedDateTimeZone zone = new FixedDateTimeZone("A", "B", 1, 5); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42356);java.util.TimeZone tz = zone.toTimeZone(); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42357);assertEquals(1, tz.getRawOffset()); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42358);assertEquals(1, getOffset(tz, 1167638400000L)); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42359);assertEquals(1, getOffset(tz, 1185951600000L)); 
 }finally{__CLR4_4_1wnlwnllc8axf97.R.flushNeeded();}} 


public void testToTimeZone11723() throws Exception {__CLR4_4_1wnlwnllc8axf97.R.globalSliceStart(getClass().getName(),42360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13pgtixwoo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wnlwnllc8axf97.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wnlwnllc8axf97.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestFixedDateTimeZone.testToTimeZone11723",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42360,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13pgtixwoo() throws Exception{try{__CLR4_4_1wnlwnllc8axf97.R.inc(42360); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42361);FixedDateTimeZone zone = new FixedDateTimeZone("+00:01", "+00:01", 60000, 60000); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42362);java.util.TimeZone tz = zone.toTimeZone(); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42363);assertEquals(60000, tz.getRawOffset()); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42364);assertEquals(60000, getOffset(tz, 1167638400000L)); 
     __CLR4_4_1wnlwnllc8axf97.R.inc(42365);assertEquals(60000, getOffset(tz, 1185951600000L)); 
 }finally{__CLR4_4_1wnlwnllc8axf97.R.flushNeeded();}} 

    

    

    

    

    /** Make test compile on JDK 1.3. */
    private int getOffset(TimeZone zone, long millis) {try{__CLR4_4_1wnlwnllc8axf97.R.inc(42366);
        __CLR4_4_1wnlwnllc8axf97.R.inc(42367);Date date = new Date(millis);
        __CLR4_4_1wnlwnllc8axf97.R.inc(42368);if ((((zone.inDaylightTime(date))&&(__CLR4_4_1wnlwnllc8axf97.R.iget(42369)!=0|true))||(__CLR4_4_1wnlwnllc8axf97.R.iget(42370)==0&false))) {{
            __CLR4_4_1wnlwnllc8axf97.R.inc(42371);return zone.getRawOffset() + 3600000;
        }
        }__CLR4_4_1wnlwnllc8axf97.R.inc(42372);return zone.getRawOffset();
    }finally{__CLR4_4_1wnlwnllc8axf97.R.flushNeeded();}}

}
