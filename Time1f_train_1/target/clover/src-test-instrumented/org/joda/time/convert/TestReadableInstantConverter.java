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
package org.joda.time.convert;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for ReadableInstantConverter.
 *
 * @author Stephen Colebourne
 */
public class TestReadableInstantConverter extends TestCase {static class __CLR4_4_1rk4rk4le6qeajq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,35751,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology JULIAN;
    private static Chronology ISO;
    
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1rk4rk4le6qeajq.R.inc(35716);
        __CLR4_4_1rk4rk4le6qeajq.R.inc(35717);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1rk4rk4le6qeajq.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1rk4rk4le6qeajq.R.inc(35718);
        __CLR4_4_1rk4rk4le6qeajq.R.inc(35719);return new TestSuite(TestReadableInstantConverter.class);
    }finally{__CLR4_4_1rk4rk4le6qeajq.R.flushNeeded();}}

    public TestReadableInstantConverter(String name) {
        super(name);__CLR4_4_1rk4rk4le6qeajq.R.inc(35721);try{__CLR4_4_1rk4rk4le6qeajq.R.inc(35720);
    }finally{__CLR4_4_1rk4rk4le6qeajq.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1rk4rk4le6qeajq.R.inc(35722);
        __CLR4_4_1rk4rk4le6qeajq.R.inc(35723);JULIAN = JulianChronology.getInstance();
        __CLR4_4_1rk4rk4le6qeajq.R.inc(35724);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_1rk4rk4le6qeajq.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGetChronology_Object_Zone414() throws Exception {__CLR4_4_1rk4rk4le6qeajq.R.globalSliceStart(getClass().getName(),35725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14x5ma3rkd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rk4rk4le6qeajq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rk4rk4le6qeajq.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableInstantConverter.testGetChronology_Object_Zone414",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14x5ma3rkd() throws Exception{try{__CLR4_4_1rk4rk4le6qeajq.R.inc(35725); 
     __CLR4_4_1rk4rk4le6qeajq.R.inc(35726);assertEquals(ISO_PARIS, ReadableInstantConverter.INSTANCE.getChronology(new Instant(123L), PARIS)); 
     __CLR4_4_1rk4rk4le6qeajq.R.inc(35727);assertEquals(ISO_PARIS, ReadableInstantConverter.INSTANCE.getChronology(new DateTime(123L), PARIS)); 
     __CLR4_4_1rk4rk4le6qeajq.R.inc(35728);assertEquals(ISO, ReadableInstantConverter.INSTANCE.getChronology(new Instant(123L), DateTimeZone.getDefault())); 
     __CLR4_4_1rk4rk4le6qeajq.R.inc(35729);assertEquals(ISO, ReadableInstantConverter.INSTANCE.getChronology(new DateTime(123L), DateTimeZone.getDefault())); 
     __CLR4_4_1rk4rk4le6qeajq.R.inc(35730);assertEquals(ISO, ReadableInstantConverter.INSTANCE.getChronology(new Instant(123L), (DateTimeZone) null)); 
     __CLR4_4_1rk4rk4le6qeajq.R.inc(35731);assertEquals(ISO, ReadableInstantConverter.INSTANCE.getChronology(new DateTime(123L), (DateTimeZone) null)); 
     __CLR4_4_1rk4rk4le6qeajq.R.inc(35732);assertEquals(ISO_PARIS, ReadableInstantConverter.INSTANCE.getChronology(new DateTime(123L, new MockBadChronology()), PARIS)); 
     __CLR4_4_1rk4rk4le6qeajq.R.inc(35733);MutableDateTime mdt = new MutableDateTime() { 
  
         public Chronology getChronology() {try{__CLR4_4_1rk4rk4le6qeajq.R.inc(35734); 
             __CLR4_4_1rk4rk4le6qeajq.R.inc(35735);return null; 
         }finally{__CLR4_4_1rk4rk4le6qeajq.R.flushNeeded();}} 
     }; 
     __CLR4_4_1rk4rk4le6qeajq.R.inc(35736);assertEquals(ISO_PARIS, ReadableInstantConverter.INSTANCE.getChronology(mdt, PARIS)); 
 }finally{__CLR4_4_1rk4rk4le6qeajq.R.flushNeeded();}} 


public void testGetChronology_Object_nullChronology415() throws Exception {__CLR4_4_1rk4rk4le6qeajq.R.globalSliceStart(getClass().getName(),35737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hpxa5frkp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rk4rk4le6qeajq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rk4rk4le6qeajq.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableInstantConverter.testGetChronology_Object_nullChronology415",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hpxa5frkp() throws Exception{try{__CLR4_4_1rk4rk4le6qeajq.R.inc(35737); 
     __CLR4_4_1rk4rk4le6qeajq.R.inc(35738);assertEquals(ISO.withUTC(), ReadableInstantConverter.INSTANCE.getChronology(new Instant(123L), (Chronology) null)); 
     __CLR4_4_1rk4rk4le6qeajq.R.inc(35739);assertEquals(ISO, ReadableInstantConverter.INSTANCE.getChronology(new DateTime(123L), (Chronology) null)); 
     __CLR4_4_1rk4rk4le6qeajq.R.inc(35740);MutableDateTime mdt = new MutableDateTime() { 
  
         public Chronology getChronology() {try{__CLR4_4_1rk4rk4le6qeajq.R.inc(35741); 
             __CLR4_4_1rk4rk4le6qeajq.R.inc(35742);return null; 
         }finally{__CLR4_4_1rk4rk4le6qeajq.R.flushNeeded();}} 
     }; 
     __CLR4_4_1rk4rk4le6qeajq.R.inc(35743);assertEquals(ISO, ReadableInstantConverter.INSTANCE.getChronology(mdt, (Chronology) null)); 
 }finally{__CLR4_4_1rk4rk4le6qeajq.R.flushNeeded();}} 


public void testGetInstantMillis_Object_Chronology416() throws Exception {__CLR4_4_1rk4rk4le6qeajq.R.globalSliceStart(getClass().getName(),35744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pdgskcrkw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rk4rk4le6qeajq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rk4rk4le6qeajq.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableInstantConverter.testGetInstantMillis_Object_Chronology416",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35744,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pdgskcrkw() throws Exception{try{__CLR4_4_1rk4rk4le6qeajq.R.inc(35744); 
     __CLR4_4_1rk4rk4le6qeajq.R.inc(35745);assertEquals(123L, ReadableInstantConverter.INSTANCE.getInstantMillis(new Instant(123L), JULIAN)); 
     __CLR4_4_1rk4rk4le6qeajq.R.inc(35746);assertEquals(123L, ReadableInstantConverter.INSTANCE.getInstantMillis(new DateTime(123L), JULIAN)); 
     __CLR4_4_1rk4rk4le6qeajq.R.inc(35747);assertEquals(123L, ReadableInstantConverter.INSTANCE.getInstantMillis(new Instant(123L), (Chronology) null)); 
     __CLR4_4_1rk4rk4le6qeajq.R.inc(35748);assertEquals(123L, ReadableInstantConverter.INSTANCE.getInstantMillis(new DateTime(123L), (Chronology) null)); 
 }finally{__CLR4_4_1rk4rk4le6qeajq.R.flushNeeded();}} 


public void testToString417() {__CLR4_4_1rk4rk4le6qeajq.R.globalSliceStart(getClass().getName(),35749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ilaatfrl1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rk4rk4le6qeajq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rk4rk4le6qeajq.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableInstantConverter.testToString417",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35749,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ilaatfrl1(){try{__CLR4_4_1rk4rk4le6qeajq.R.inc(35749); 
     __CLR4_4_1rk4rk4le6qeajq.R.inc(35750);assertEquals("Converter[org.joda.time.ReadableInstant]", ReadableInstantConverter.INSTANCE.toString()); 
 }finally{__CLR4_4_1rk4rk4le6qeajq.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
