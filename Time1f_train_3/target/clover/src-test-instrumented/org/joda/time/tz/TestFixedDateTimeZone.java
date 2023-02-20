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
public class TestFixedDateTimeZone extends TestCase {static class __CLR4_4_1ullullle6rcn88{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,39686,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1ullullle6rcn88.R.inc(39657);
        __CLR4_4_1ullullle6rcn88.R.inc(39658);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ullullle6rcn88.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ullullle6rcn88.R.inc(39659);
        __CLR4_4_1ullullle6rcn88.R.inc(39660);return new TestSuite(TestFixedDateTimeZone.class);
    }finally{__CLR4_4_1ullullle6rcn88.R.flushNeeded();}}

    private DateTimeZone originalDateTimeZone = null;

    public TestFixedDateTimeZone(String name) {
        super(name);__CLR4_4_1ullullle6rcn88.R.inc(39662);try{__CLR4_4_1ullullle6rcn88.R.inc(39661);
    }finally{__CLR4_4_1ullullle6rcn88.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ullullle6rcn88.R.inc(39663);
        __CLR4_4_1ullullle6rcn88.R.inc(39664);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1ullullle6rcn88.R.inc(39665);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_1ullullle6rcn88.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ullullle6rcn88.R.inc(39666);
        __CLR4_4_1ullullle6rcn88.R.inc(39667);DateTimeZone.setDefault(originalDateTimeZone);
    }finally{__CLR4_4_1ullullle6rcn88.R.flushNeeded();}}


public void testHashCode909() throws Exception {__CLR4_4_1ullullle6rcn88.R.globalSliceStart(getClass().getName(),39668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ltxoculw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ullullle6rcn88.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ullullle6rcn88.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestFixedDateTimeZone.testHashCode909",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39668,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ltxoculw() throws Exception{try{__CLR4_4_1ullullle6rcn88.R.inc(39668); 
     __CLR4_4_1ullullle6rcn88.R.inc(39669);FixedDateTimeZone zone1 = new FixedDateTimeZone("A", "B", 1, 5); 
     __CLR4_4_1ullullle6rcn88.R.inc(39670);FixedDateTimeZone zone1b = new FixedDateTimeZone("A", "B", 1, 5); 
     __CLR4_4_1ullullle6rcn88.R.inc(39671);FixedDateTimeZone zone2 = new FixedDateTimeZone("A", "C", 1, 5); 
     __CLR4_4_1ullullle6rcn88.R.inc(39672);FixedDateTimeZone zone3 = new FixedDateTimeZone("A", "B", 2, 5); 
     __CLR4_4_1ullullle6rcn88.R.inc(39673);FixedDateTimeZone zone4 = new FixedDateTimeZone("A", "B", 1, 6); 
     __CLR4_4_1ullullle6rcn88.R.inc(39674);assertEquals(true, zone1.hashCode() == zone1.hashCode()); 
     __CLR4_4_1ullullle6rcn88.R.inc(39675);assertEquals(true, zone1.hashCode() == zone1b.hashCode()); 
     __CLR4_4_1ullullle6rcn88.R.inc(39676);assertEquals(true, zone1.hashCode() == zone2.hashCode()); 
     __CLR4_4_1ullullle6rcn88.R.inc(39677);assertEquals(false, zone1.hashCode() == zone3.hashCode()); 
     __CLR4_4_1ullullle6rcn88.R.inc(39678);assertEquals(false, zone1.hashCode() == zone4.hashCode()); 
 }finally{__CLR4_4_1ullullle6rcn88.R.flushNeeded();}} 

    

    

    

    

    /** Make test compile on JDK 1.3. */
    private int getOffset(TimeZone zone, long millis) {try{__CLR4_4_1ullullle6rcn88.R.inc(39679);
        __CLR4_4_1ullullle6rcn88.R.inc(39680);Date date = new Date(millis);
        __CLR4_4_1ullullle6rcn88.R.inc(39681);if ((((zone.inDaylightTime(date))&&(__CLR4_4_1ullullle6rcn88.R.iget(39682)!=0|true))||(__CLR4_4_1ullullle6rcn88.R.iget(39683)==0&false))) {{
            __CLR4_4_1ullullle6rcn88.R.inc(39684);return zone.getRawOffset() + 3600000;
        }
        }__CLR4_4_1ullullle6rcn88.R.inc(39685);return zone.getRawOffset();
    }finally{__CLR4_4_1ullullle6rcn88.R.flushNeeded();}}

}
