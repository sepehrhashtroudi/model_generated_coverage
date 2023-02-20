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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;

/**
 * This class is a Junit unit test for DurationFieldType.
 *
 * @author Stephen Colebourne
 */
public class TestDurationFieldType extends TestCase {static class __CLR4_4_1j2ej2ele6rjcbv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,24780,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1j2ej2ele6rjcbv.R.inc(24710);
        __CLR4_4_1j2ej2ele6rjcbv.R.inc(24711);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1j2ej2ele6rjcbv.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1j2ej2ele6rjcbv.R.inc(24712);
        __CLR4_4_1j2ej2ele6rjcbv.R.inc(24713);return new TestSuite(TestDurationFieldType.class);
    }finally{__CLR4_4_1j2ej2ele6rjcbv.R.flushNeeded();}}

    public TestDurationFieldType(String name) {
        super(name);__CLR4_4_1j2ej2ele6rjcbv.R.inc(24715);try{__CLR4_4_1j2ej2ele6rjcbv.R.inc(24714);
    }finally{__CLR4_4_1j2ej2ele6rjcbv.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1j2ej2ele6rjcbv.R.inc(24716);
    }finally{__CLR4_4_1j2ej2ele6rjcbv.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1j2ej2ele6rjcbv.R.inc(24717);
    }finally{__CLR4_4_1j2ej2ele6rjcbv.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_weeks1016() throws Exception {__CLR4_4_1j2ej2ele6rjcbv.R.globalSliceStart(getClass().getName(),24718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fppee5j2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j2ej2ele6rjcbv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j2ej2ele6rjcbv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_weeks1016",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24718,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fppee5j2m() throws Exception{try{__CLR4_4_1j2ej2ele6rjcbv.R.inc(24718); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24719);assertEquals(DurationFieldType.weeks(), DurationFieldType.weeks()); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24720);assertEquals("weeks", DurationFieldType.weeks().getName()); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24721);assertEquals(CopticChronology.getInstanceUTC().weeks(), DurationFieldType.weeks().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24722);assertEquals(CopticChronology.getInstanceUTC().weeks().isSupported(), DurationFieldType.weeks().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24723);assertSerialization(DurationFieldType.weeks()); 
 }finally{__CLR4_4_1j2ej2ele6rjcbv.R.flushNeeded();}} 


public void test_eras1017() throws Exception {__CLR4_4_1j2ej2ele6rjcbv.R.globalSliceStart(getClass().getName(),24724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1exv0t4j2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j2ej2ele6rjcbv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j2ej2ele6rjcbv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_eras1017",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24724,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1exv0t4j2s() throws Exception{try{__CLR4_4_1j2ej2ele6rjcbv.R.inc(24724); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24725);assertEquals(DurationFieldType.eras(), DurationFieldType.eras()); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24726);assertEquals("eras", DurationFieldType.eras().getName()); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24727);assertEquals(CopticChronology.getInstanceUTC().eras(), DurationFieldType.eras().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24728);assertEquals(CopticChronology.getInstanceUTC().eras().isSupported(), DurationFieldType.eras().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24729);assertSerialization(DurationFieldType.eras()); 
 }finally{__CLR4_4_1j2ej2ele6rjcbv.R.flushNeeded();}} 


public void test_weekyears1018() throws Exception {__CLR4_4_1j2ej2ele6rjcbv.R.globalSliceStart(getClass().getName(),24730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cszg9qj2y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j2ej2ele6rjcbv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j2ej2ele6rjcbv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_weekyears1018",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cszg9qj2y() throws Exception{try{__CLR4_4_1j2ej2ele6rjcbv.R.inc(24730); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24731);assertEquals(DurationFieldType.weekyears(), DurationFieldType.weekyears()); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24732);assertEquals("weekyears", DurationFieldType.weekyears().getName()); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24733);assertEquals(CopticChronology.getInstanceUTC().weekyears(), DurationFieldType.weekyears().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24734);assertEquals(CopticChronology.getInstanceUTC().weekyears().isSupported(), DurationFieldType.weekyears().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24735);assertSerialization(DurationFieldType.weekyears()); 
 }finally{__CLR4_4_1j2ej2ele6rjcbv.R.flushNeeded();}} 


public void test_years1019() throws Exception {__CLR4_4_1j2ej2ele6rjcbv.R.globalSliceStart(getClass().getName(),24736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17sjp3dj34();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j2ej2ele6rjcbv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j2ej2ele6rjcbv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_years1019",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24736,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17sjp3dj34() throws Exception{try{__CLR4_4_1j2ej2ele6rjcbv.R.inc(24736); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24737);assertEquals(DurationFieldType.years(), DurationFieldType.years()); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24738);assertEquals("years", DurationFieldType.years().getName()); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24739);assertEquals(CopticChronology.getInstanceUTC().years(), DurationFieldType.years().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24740);assertEquals(CopticChronology.getInstanceUTC().years().isSupported(), DurationFieldType.years().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24741);assertSerialization(DurationFieldType.years()); 
 }finally{__CLR4_4_1j2ej2ele6rjcbv.R.flushNeeded();}} 


public void test_days1020() throws Exception {__CLR4_4_1j2ej2ele6rjcbv.R.globalSliceStart(getClass().getName(),24742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cowe5kj3a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j2ej2ele6rjcbv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j2ej2ele6rjcbv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_days1020",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cowe5kj3a() throws Exception{try{__CLR4_4_1j2ej2ele6rjcbv.R.inc(24742); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24743);assertEquals(DurationFieldType.days(), DurationFieldType.days()); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24744);assertEquals("days", DurationFieldType.days().getName()); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24745);assertEquals(CopticChronology.getInstanceUTC().days(), DurationFieldType.days().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24746);assertEquals(CopticChronology.getInstanceUTC().days().isSupported(), DurationFieldType.days().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24747);assertSerialization(DurationFieldType.days()); 
 }finally{__CLR4_4_1j2ej2ele6rjcbv.R.flushNeeded();}} 


public void test_minutes1021() throws Exception {__CLR4_4_1j2ej2ele6rjcbv.R.globalSliceStart(getClass().getName(),24748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ws2hntj3g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j2ej2ele6rjcbv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j2ej2ele6rjcbv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_minutes1021",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24748,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ws2hntj3g() throws Exception{try{__CLR4_4_1j2ej2ele6rjcbv.R.inc(24748); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24749);assertEquals(DurationFieldType.minutes(), DurationFieldType.minutes()); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24750);assertEquals("minutes", DurationFieldType.minutes().getName()); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24751);assertEquals(CopticChronology.getInstanceUTC().minutes(), DurationFieldType.minutes().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24752);assertEquals(CopticChronology.getInstanceUTC().minutes().isSupported(), DurationFieldType.minutes().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24753);assertSerialization(DurationFieldType.minutes()); 
 }finally{__CLR4_4_1j2ej2ele6rjcbv.R.flushNeeded();}} 


public void test_seconds1022() throws Exception {__CLR4_4_1j2ej2ele6rjcbv.R.globalSliceStart(getClass().getName(),24754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oeommwj3m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j2ej2ele6rjcbv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j2ej2ele6rjcbv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_seconds1022",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24754,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oeommwj3m() throws Exception{try{__CLR4_4_1j2ej2ele6rjcbv.R.inc(24754); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24755);assertEquals(DurationFieldType.seconds(), DurationFieldType.seconds()); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24756);assertEquals("seconds", DurationFieldType.seconds().getName()); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24757);assertEquals(CopticChronology.getInstanceUTC().seconds(), DurationFieldType.seconds().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24758);assertEquals(CopticChronology.getInstanceUTC().seconds().isSupported(), DurationFieldType.seconds().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24759);assertSerialization(DurationFieldType.seconds()); 
 }finally{__CLR4_4_1j2ej2ele6rjcbv.R.flushNeeded();}} 


public void test_millis1023() throws Exception {__CLR4_4_1j2ej2ele6rjcbv.R.globalSliceStart(getClass().getName(),24760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_162txuij3s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j2ej2ele6rjcbv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j2ej2ele6rjcbv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_millis1023",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24760,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_162txuij3s() throws Exception{try{__CLR4_4_1j2ej2ele6rjcbv.R.inc(24760); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24761);assertEquals(DurationFieldType.millis(), DurationFieldType.millis()); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24762);assertEquals("millis", DurationFieldType.millis().getName()); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24763);assertEquals(CopticChronology.getInstanceUTC().millis(), DurationFieldType.millis().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24764);assertEquals(CopticChronology.getInstanceUTC().millis().isSupported(), DurationFieldType.millis().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1j2ej2ele6rjcbv.R.inc(24765);assertSerialization(DurationFieldType.millis()); 
 }finally{__CLR4_4_1j2ej2ele6rjcbv.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void assertSerialization(DurationFieldType type) throws Exception {try{__CLR4_4_1j2ej2ele6rjcbv.R.inc(24766);
        __CLR4_4_1j2ej2ele6rjcbv.R.inc(24767);DurationFieldType result = doSerialization(type);
        __CLR4_4_1j2ej2ele6rjcbv.R.inc(24768);assertSame(type, result);
    }finally{__CLR4_4_1j2ej2ele6rjcbv.R.flushNeeded();}}

    private DurationFieldType doSerialization(DurationFieldType type) throws Exception {try{__CLR4_4_1j2ej2ele6rjcbv.R.inc(24769);
        __CLR4_4_1j2ej2ele6rjcbv.R.inc(24770);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1j2ej2ele6rjcbv.R.inc(24771);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1j2ej2ele6rjcbv.R.inc(24772);oos.writeObject(type);
        __CLR4_4_1j2ej2ele6rjcbv.R.inc(24773);byte[] bytes = baos.toByteArray();
        __CLR4_4_1j2ej2ele6rjcbv.R.inc(24774);oos.close();
        
        __CLR4_4_1j2ej2ele6rjcbv.R.inc(24775);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1j2ej2ele6rjcbv.R.inc(24776);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1j2ej2ele6rjcbv.R.inc(24777);DurationFieldType result = (DurationFieldType) ois.readObject();
        __CLR4_4_1j2ej2ele6rjcbv.R.inc(24778);ois.close();
        __CLR4_4_1j2ej2ele6rjcbv.R.inc(24779);return result;
    }finally{__CLR4_4_1j2ej2ele6rjcbv.R.flushNeeded();}}

}
