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
public class TestFixedDateTimeZone extends TestCase {static class __CLR4_4_1ut8ut8le6qeawd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,39984,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1ut8ut8le6qeawd.R.inc(39932);
        __CLR4_4_1ut8ut8le6qeawd.R.inc(39933);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ut8ut8le6qeawd.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ut8ut8le6qeawd.R.inc(39934);
        __CLR4_4_1ut8ut8le6qeawd.R.inc(39935);return new TestSuite(TestFixedDateTimeZone.class);
    }finally{__CLR4_4_1ut8ut8le6qeawd.R.flushNeeded();}}

    private DateTimeZone originalDateTimeZone = null;

    public TestFixedDateTimeZone(String name) {
        super(name);__CLR4_4_1ut8ut8le6qeawd.R.inc(39937);try{__CLR4_4_1ut8ut8le6qeawd.R.inc(39936);
    }finally{__CLR4_4_1ut8ut8le6qeawd.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ut8ut8le6qeawd.R.inc(39938);
        __CLR4_4_1ut8ut8le6qeawd.R.inc(39939);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1ut8ut8le6qeawd.R.inc(39940);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_1ut8ut8le6qeawd.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ut8ut8le6qeawd.R.inc(39941);
        __CLR4_4_1ut8ut8le6qeawd.R.inc(39942);DateTimeZone.setDefault(originalDateTimeZone);
    }finally{__CLR4_4_1ut8ut8le6qeawd.R.flushNeeded();}}


public void testHashCode914() throws Exception {__CLR4_4_1ut8ut8le6qeawd.R.globalSliceStart(getClass().getName(),39943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k2p09iutj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ut8ut8le6qeawd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ut8ut8le6qeawd.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestFixedDateTimeZone.testHashCode914",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39943,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k2p09iutj() throws Exception{try{__CLR4_4_1ut8ut8le6qeawd.R.inc(39943); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39944);FixedDateTimeZone zone1 = new FixedDateTimeZone("A", "B", 1, 5); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39945);FixedDateTimeZone zone1b = new FixedDateTimeZone("A", "B", 1, 5); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39946);FixedDateTimeZone zone2 = new FixedDateTimeZone("A", "C", 1, 5); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39947);FixedDateTimeZone zone3 = new FixedDateTimeZone("A", "B", 2, 5); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39948);FixedDateTimeZone zone4 = new FixedDateTimeZone("A", "B", 1, 6); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39949);assertEquals(true, zone1.hashCode() == zone1.hashCode()); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39950);assertEquals(true, zone1.hashCode() == zone1b.hashCode()); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39951);assertEquals(true, zone1.hashCode() == zone2.hashCode()); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39952);assertEquals(false, zone1.hashCode() == zone3.hashCode()); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39953);assertEquals(false, zone1.hashCode() == zone4.hashCode()); 
 }finally{__CLR4_4_1ut8ut8le6qeawd.R.flushNeeded();}} 


public void testToTimeZone2916() throws Exception {__CLR4_4_1ut8ut8le6qeawd.R.globalSliceStart(getClass().getName(),39954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g7u5wnutu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ut8ut8le6qeawd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ut8ut8le6qeawd.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestFixedDateTimeZone.testToTimeZone2916",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g7u5wnutu() throws Exception{try{__CLR4_4_1ut8ut8le6qeawd.R.inc(39954); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39955);FixedDateTimeZone zone = new FixedDateTimeZone("A", "B", 1, 5); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39956);java.util.TimeZone tz = zone.toTimeZone(); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39957);assertEquals(1, tz.getRawOffset()); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39958);assertEquals(1, getOffset(tz, 1167638400000L)); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39959);assertEquals(1, getOffset(tz, 1185951600000L)); 
 }finally{__CLR4_4_1ut8ut8le6qeawd.R.flushNeeded();}} 


public void testToTimeZone1917() throws Exception {__CLR4_4_1ut8ut8le6qeawd.R.globalSliceStart(getClass().getName(),39960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1htiubpuu0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ut8ut8le6qeawd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ut8ut8le6qeawd.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestFixedDateTimeZone.testToTimeZone1917",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39960,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1htiubpuu0() throws Exception{try{__CLR4_4_1ut8ut8le6qeawd.R.inc(39960); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39961);FixedDateTimeZone zone = new FixedDateTimeZone("+00:01", "+00:01", 60000, 60000); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39962);java.util.TimeZone tz = zone.toTimeZone(); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39963);assertEquals(60000, tz.getRawOffset()); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39964);assertEquals(60000, getOffset(tz, 1167638400000L)); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39965);assertEquals(60000, getOffset(tz, 1185951600000L)); 
 }finally{__CLR4_4_1ut8ut8le6qeawd.R.flushNeeded();}} 


public void testEquals918() throws Exception {__CLR4_4_1ut8ut8le6qeawd.R.globalSliceStart(getClass().getName(),39966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ewturauu6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ut8ut8le6qeawd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ut8ut8le6qeawd.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestFixedDateTimeZone.testEquals918",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ewturauu6() throws Exception{try{__CLR4_4_1ut8ut8le6qeawd.R.inc(39966); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39967);FixedDateTimeZone zone1 = new FixedDateTimeZone("A", "B", 1, 5); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39968);FixedDateTimeZone zone1b = new FixedDateTimeZone("A", "B", 1, 5); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39969);FixedDateTimeZone zone2 = new FixedDateTimeZone("A", "C", 1, 5); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39970);FixedDateTimeZone zone3 = new FixedDateTimeZone("A", "B", 2, 5); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39971);FixedDateTimeZone zone4 = new FixedDateTimeZone("A", "B", 1, 6); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39972);assertEquals(true, zone1.equals(zone1)); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39973);assertEquals(true, zone1.equals(zone1b)); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39974);assertEquals(true, zone1.equals(zone2)); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39975);assertEquals(false, zone1.equals(zone3)); 
     __CLR4_4_1ut8ut8le6qeawd.R.inc(39976);assertEquals(false, zone1.equals(zone4)); 
 }finally{__CLR4_4_1ut8ut8le6qeawd.R.flushNeeded();}} 

    

    

    

    

    /** Make test compile on JDK 1.3. */
    private int getOffset(TimeZone zone, long millis) {try{__CLR4_4_1ut8ut8le6qeawd.R.inc(39977);
        __CLR4_4_1ut8ut8le6qeawd.R.inc(39978);Date date = new Date(millis);
        __CLR4_4_1ut8ut8le6qeawd.R.inc(39979);if ((((zone.inDaylightTime(date))&&(__CLR4_4_1ut8ut8le6qeawd.R.iget(39980)!=0|true))||(__CLR4_4_1ut8ut8le6qeawd.R.iget(39981)==0&false))) {{
            __CLR4_4_1ut8ut8le6qeawd.R.inc(39982);return zone.getRawOffset() + 3600000;
        }
        }__CLR4_4_1ut8ut8le6qeawd.R.inc(39983);return zone.getRawOffset();
    }finally{__CLR4_4_1ut8ut8le6qeawd.R.flushNeeded();}}

}
