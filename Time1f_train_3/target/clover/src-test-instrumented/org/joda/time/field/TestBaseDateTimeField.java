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
package org.joda.time.field;

import java.util.Arrays;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.TimeOfDay;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for BaseDateTimeField.
 *
 * @author Stephen Colebourne
 */
public class TestBaseDateTimeField extends TestCase {static class __CLR4_4_1rogrogle6rcmwf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,36090,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1rogrogle6rcmwf.R.inc(35872);
        __CLR4_4_1rogrogle6rcmwf.R.inc(35873);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1rogrogle6rcmwf.R.inc(35874);
        __CLR4_4_1rogrogle6rcmwf.R.inc(35875);return new TestSuite(TestBaseDateTimeField.class);
    }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}

    public TestBaseDateTimeField(String name) {
        super(name);__CLR4_4_1rogrogle6rcmwf.R.inc(35877);try{__CLR4_4_1rogrogle6rcmwf.R.inc(35876);
    }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1rogrogle6rcmwf.R.inc(35878);
    }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1rogrogle6rcmwf.R.inc(35879);
    }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_getMaximumValue_long383() {__CLR4_4_1rogrogle6rcmwf.R.globalSliceStart(getClass().getName(),35880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13mqk7oroo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rogrogle6rcmwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rogrogle6rcmwf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumValue_long383",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13mqk7oroo(){try{__CLR4_4_1rogrogle6rcmwf.R.inc(35880); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35881);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35882);assertEquals(59, field.getMaximumValue(0L)); 
 }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}} 


public void test_constructor384() {__CLR4_4_1rogrogle6rcmwf.R.globalSliceStart(getClass().getName(),35883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m3m8i1ror();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rogrogle6rcmwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rogrogle6rcmwf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_constructor384",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35883,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m3m8i1ror(){try{__CLR4_4_1rogrogle6rcmwf.R.inc(35883); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35884);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35885);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType()); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35886);try { 
         __CLR4_4_1rogrogle6rcmwf.R.inc(35887);field = new MockBaseDateTimeField(null); 
         __CLR4_4_1rogrogle6rcmwf.R.inc(35888);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}} 


public void test_convertText385() {__CLR4_4_1rogrogle6rcmwf.R.globalSliceStart(getClass().getName(),35889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ma4bocrox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rogrogle6rcmwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rogrogle6rcmwf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_convertText385",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35889,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ma4bocrox(){try{__CLR4_4_1rogrogle6rcmwf.R.inc(35889); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35890);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35891);assertEquals(0, field.convertText("0", null)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35892);assertEquals(29, field.convertText("29", null)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35893);try { 
         __CLR4_4_1rogrogle6rcmwf.R.inc(35894);field.convertText("2A", null); 
         __CLR4_4_1rogrogle6rcmwf.R.inc(35895);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35896);try { 
         __CLR4_4_1rogrogle6rcmwf.R.inc(35897);field.convertText(null, null); 
         __CLR4_4_1rogrogle6rcmwf.R.inc(35898);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}} 


public void test_toString386() {__CLR4_4_1rogrogle6rcmwf.R.globalSliceStart(getClass().getName(),35899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wqh36prp7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rogrogle6rcmwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rogrogle6rcmwf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_toString386",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35899,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wqh36prp7(){try{__CLR4_4_1rogrogle6rcmwf.R.inc(35899); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35900);BaseDateTimeField field = new MockBaseDateTimeField(DateTimeFieldType.secondOfDay()); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35901);assertEquals("DateTimeField[secondOfDay]", field.toString()); 
 }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}} 


public void test_isSupported387() {__CLR4_4_1rogrogle6rcmwf.R.globalSliceStart(getClass().getName(),35902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tjitfmrpa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rogrogle6rcmwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rogrogle6rcmwf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_isSupported387",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35902,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tjitfmrpa(){try{__CLR4_4_1rogrogle6rcmwf.R.inc(35902); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35903);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35904);assertEquals(true, field.isSupported()); 
 }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}} 


public void test_getAsText_long388() {__CLR4_4_1rogrogle6rcmwf.R.globalSliceStart(getClass().getName(),35905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wzbkoprpd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rogrogle6rcmwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rogrogle6rcmwf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_long388",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wzbkoprpd(){try{__CLR4_4_1rogrogle6rcmwf.R.inc(35905); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35906);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35907);assertEquals("29", field.getAsText(60L * 29)); 
 }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}} 


public void test_getAsText_RP_int_Locale389() {__CLR4_4_1rogrogle6rcmwf.R.globalSliceStart(getClass().getName(),35908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17s7wzrrpg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rogrogle6rcmwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rogrogle6rcmwf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_RP_int_Locale389",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17s7wzrrpg(){try{__CLR4_4_1rogrogle6rcmwf.R.inc(35908); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35909);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35910);assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, Locale.ENGLISH)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35911);assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, null)); 
 }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}} 


public void test_getAsText_RP_Locale390() {__CLR4_4_1rogrogle6rcmwf.R.globalSliceStart(getClass().getName(),35912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11wv5arrpk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rogrogle6rcmwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rogrogle6rcmwf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_RP_Locale390",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35912,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11wv5arrpk(){try{__CLR4_4_1rogrogle6rcmwf.R.inc(35912); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35913);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35914);assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35915);assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), null)); 
 }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}} 


public void test_getAsText_int_Locale391() {__CLR4_4_1rogrogle6rcmwf.R.globalSliceStart(getClass().getName(),35916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jbtle9rpo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rogrogle6rcmwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rogrogle6rcmwf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_int_Locale391",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35916,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jbtle9rpo(){try{__CLR4_4_1rogrogle6rcmwf.R.inc(35916); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35917);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35918);assertEquals("80", field.getAsText(80, Locale.ENGLISH)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35919);assertEquals("80", field.getAsText(80, null)); 
 }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}} 


public void test_getAsShortText_long392() {__CLR4_4_1rogrogle6rcmwf.R.globalSliceStart(getClass().getName(),35920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sjod4qrps();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rogrogle6rcmwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rogrogle6rcmwf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_long392",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35920,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sjod4qrps(){try{__CLR4_4_1rogrogle6rcmwf.R.inc(35920); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35921);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35922);assertEquals("29", field.getAsShortText(60L * 29)); 
 }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}} 


public void test_getAsShortText_RP_Locale393() {__CLR4_4_1rogrogle6rcmwf.R.globalSliceStart(getClass().getName(),35923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wmnl86rpv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rogrogle6rcmwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rogrogle6rcmwf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_RP_Locale393",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35923,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wmnl86rpv(){try{__CLR4_4_1rogrogle6rcmwf.R.inc(35923); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35924);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35925);assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35926);assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), null)); 
 }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}} 


public void test_add_long_long394() {__CLR4_4_1rogrogle6rcmwf.R.globalSliceStart(getClass().getName(),35927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j58sovrpz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rogrogle6rcmwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rogrogle6rcmwf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_add_long_long394",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j58sovrpz(){try{__CLR4_4_1rogrogle6rcmwf.R.inc(35927); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35928);MockCountingDurationField.add_long = 0; 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35929);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35930);assertEquals(61, field.add(1L, 1L)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35931);assertEquals(1, MockCountingDurationField.add_long); 
 }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}} 


public void test_addWrapField_long_int396() {__CLR4_4_1rogrogle6rcmwf.R.globalSliceStart(getClass().getName(),35932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vhd7ygrq4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rogrogle6rcmwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rogrogle6rcmwf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_addWrapField_long_int396",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35932,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vhd7ygrq4(){try{__CLR4_4_1rogrogle6rcmwf.R.inc(35932); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35933);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35934);assertEquals(1029, field.addWrapField(60L * 29, 0)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35935);assertEquals(1059, field.addWrapField(60L * 29, 30)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35936);assertEquals(1000, field.addWrapField(60L * 29, 31)); 
 }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}} 


public void test_addWrapField_RP_int_intarray_int397() {__CLR4_4_1rogrogle6rcmwf.R.globalSliceStart(getClass().getName(),35937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12lm1rkrq9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rogrogle6rcmwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rogrogle6rcmwf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_addWrapField_RP_int_intarray_int397",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35937,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12lm1rkrq9(){try{__CLR4_4_1rogrogle6rcmwf.R.inc(35937); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35938);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35939);int[] values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35940);int[] expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35941);int[] result = field.addWrapField(new TimeOfDay(), 2, values, 0); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35942);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35943);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35944);expected = new int[] { 10, 20, 59, 40 }; 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35945);result = field.addWrapField(new TimeOfDay(), 2, values, 29); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35946);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35947);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35948);expected = new int[] { 10, 20, 0, 40 }; 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35949);result = field.addWrapField(new TimeOfDay(), 2, values, 30); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35950);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35951);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35952);expected = new int[] { 10, 20, 1, 40 }; 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35953);result = field.addWrapField(new TimeOfDay(), 2, values, 31); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35954);assertEquals(true, Arrays.equals(result, expected)); 
 }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}} 


public void test_getDifference_long_long398() {__CLR4_4_1rogrogle6rcmwf.R.globalSliceStart(getClass().getName(),35955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x12wwdrqr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rogrogle6rcmwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rogrogle6rcmwf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getDifference_long_long398",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x12wwdrqr(){try{__CLR4_4_1rogrogle6rcmwf.R.inc(35955); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35956);MockCountingDurationField.difference_long = 0; 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35957);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35958);assertEquals(30, field.getDifference(0L, 0L)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35959);assertEquals(1, MockCountingDurationField.difference_long); 
 }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}} 


public void test_getDifferenceAsLong_long_long399() {__CLR4_4_1rogrogle6rcmwf.R.globalSliceStart(getClass().getName(),35960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_184z3dyrqw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rogrogle6rcmwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rogrogle6rcmwf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getDifferenceAsLong_long_long399",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35960,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_184z3dyrqw(){try{__CLR4_4_1rogrogle6rcmwf.R.inc(35960); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35961);MockCountingDurationField.difference_long = 0; 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35962);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35963);assertEquals(30, field.getDifferenceAsLong(0L, 0L)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35964);assertEquals(1, MockCountingDurationField.difference_long); 
 }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}} 


public void test_set_RP_int_intarray_String_Locale400() {__CLR4_4_1rogrogle6rcmwf.R.globalSliceStart(getClass().getName(),35965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cmal8frr1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rogrogle6rcmwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rogrogle6rcmwf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_set_RP_int_intarray_String_Locale400",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35965,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cmal8frr1(){try{__CLR4_4_1rogrogle6rcmwf.R.inc(35965); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35966);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35967);int[] values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35968);int[] expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35969);int[] result = field.set(new TimeOfDay(), 2, values, "30", null); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35970);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35971);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35972);expected = new int[] { 10, 20, 29, 40 }; 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35973);result = field.set(new TimeOfDay(), 2, values, "29", Locale.ENGLISH); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35974);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35975);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35976);expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35977);try { 
         __CLR4_4_1rogrogle6rcmwf.R.inc(35978);field.set(new TimeOfDay(), 2, values, "60", null); 
         __CLR4_4_1rogrogle6rcmwf.R.inc(35979);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35980);assertEquals(true, Arrays.equals(values, expected)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35981);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35982);expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35983);try { 
         __CLR4_4_1rogrogle6rcmwf.R.inc(35984);field.set(new TimeOfDay(), 2, values, "-1", null); 
         __CLR4_4_1rogrogle6rcmwf.R.inc(35985);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35986);assertEquals(true, Arrays.equals(values, expected)); 
 }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}} 


public void test_set_long_String_Locale401() {__CLR4_4_1rogrogle6rcmwf.R.globalSliceStart(getClass().getName(),35987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rad48jrrn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rogrogle6rcmwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rogrogle6rcmwf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_set_long_String_Locale401",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35987,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rad48jrrn(){try{__CLR4_4_1rogrogle6rcmwf.R.inc(35987); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35988);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35989);assertEquals(1000, field.set(0L, "0", null)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35990);assertEquals(1029, field.set(0L, "29", Locale.ENGLISH)); 
 }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}} 


public void test_set_long_String402() {__CLR4_4_1rogrogle6rcmwf.R.globalSliceStart(getClass().getName(),35991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1srilcdrrr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rogrogle6rcmwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rogrogle6rcmwf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_set_long_String402",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35991,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1srilcdrrr(){try{__CLR4_4_1rogrogle6rcmwf.R.inc(35991); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35992);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35993);assertEquals(1000, field.set(0L, "0")); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35994);assertEquals(1029, field.set(0L, "29")); 
 }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}} 


public void test_isLeap_long403() {__CLR4_4_1rogrogle6rcmwf.R.globalSliceStart(getClass().getName(),35995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15d74rmrrv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rogrogle6rcmwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rogrogle6rcmwf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_isLeap_long403",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35995,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15d74rmrrv(){try{__CLR4_4_1rogrogle6rcmwf.R.inc(35995); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35996);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35997);assertEquals(false, field.isLeap(0L)); 
 }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}} 


public void test_getLeapAmount_long404() {__CLR4_4_1rogrogle6rcmwf.R.globalSliceStart(getClass().getName(),35998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ppbgczrry();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rogrogle6rcmwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rogrogle6rcmwf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getLeapAmount_long404",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35998,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ppbgczrry(){try{__CLR4_4_1rogrogle6rcmwf.R.inc(35998); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(35999);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(36000);assertEquals(0, field.getLeapAmount(0L)); 
 }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}} 


public void test_getMinimumValue_long405() {__CLR4_4_1rogrogle6rcmwf.R.globalSliceStart(getClass().getName(),36001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y0mzm9rs1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rogrogle6rcmwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rogrogle6rcmwf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMinimumValue_long405",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y0mzm9rs1(){try{__CLR4_4_1rogrogle6rcmwf.R.inc(36001); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(36002);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(36003);assertEquals(0, field.getMinimumValue(0L)); 
 }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}} 


public void test_getMaximumShortTextLength_Locale406() {__CLR4_4_1rogrogle6rcmwf.R.globalSliceStart(getClass().getName(),36004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ha1hmors4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rogrogle6rcmwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rogrogle6rcmwf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumShortTextLength_Locale406",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36004,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ha1hmors4(){try{__CLR4_4_1rogrogle6rcmwf.R.inc(36004); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(36005);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(36006);assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH)); 
 }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}} 


public void test_roundHalfCeiling_long407() {__CLR4_4_1rogrogle6rcmwf.R.globalSliceStart(getClass().getName(),36007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1phkm5srs7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rogrogle6rcmwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rogrogle6rcmwf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundHalfCeiling_long407",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36007,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1phkm5srs7(){try{__CLR4_4_1rogrogle6rcmwf.R.inc(36007); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(36008);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(36009);assertEquals(0L, field.roundHalfCeiling(0L)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(36010);assertEquals(0L, field.roundHalfCeiling(29L)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(36011);assertEquals(60L, field.roundHalfCeiling(30L)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(36012);assertEquals(60L, field.roundHalfCeiling(31L)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(36013);assertEquals(60L, field.roundHalfCeiling(60L)); 
 }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}} 


public void test_roundHalfEven_long408() {__CLR4_4_1rogrogle6rcmwf.R.globalSliceStart(getClass().getName(),36014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xv5dd6rse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rogrogle6rcmwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rogrogle6rcmwf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundHalfEven_long408",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36014,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xv5dd6rse(){try{__CLR4_4_1rogrogle6rcmwf.R.inc(36014); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(36015);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(36016);assertEquals(0L, field.roundHalfEven(0L)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(36017);assertEquals(0L, field.roundHalfEven(29L)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(36018);assertEquals(0L, field.roundHalfEven(30L)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(36019);assertEquals(60L, field.roundHalfEven(31L)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(36020);assertEquals(60L, field.roundHalfEven(60L)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(36021);assertEquals(60L, field.roundHalfEven(89L)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(36022);assertEquals(120L, field.roundHalfEven(90L)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(36023);assertEquals(120L, field.roundHalfEven(91L)); 
 }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}} 


public void test_remainder_long409() {__CLR4_4_1rogrogle6rcmwf.R.globalSliceStart(getClass().getName(),36024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1txw1c1rso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rogrogle6rcmwf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rogrogle6rcmwf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_remainder_long409",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36024,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1txw1c1rso(){try{__CLR4_4_1rogrogle6rcmwf.R.inc(36024); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(36025);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(36026);assertEquals(0L, field.remainder(0L)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(36027);assertEquals(29L, field.remainder(29L)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(36028);assertEquals(30L, field.remainder(30L)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(36029);assertEquals(31L, field.remainder(31L)); 
     __CLR4_4_1rogrogle6rcmwf.R.inc(36030);assertEquals(0L, field.remainder(60L)); 
 }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}} 

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //------------------------------------------------------------------------
//    public abstract DurationField getDurationField();
//
//    public abstract DurationField getRangeDurationField();

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //------------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    static class MockBaseDateTimeField extends BaseDateTimeField {
        protected MockBaseDateTimeField() {
            super(DateTimeFieldType.secondOfMinute());__CLR4_4_1rogrogle6rcmwf.R.inc(36032);try{__CLR4_4_1rogrogle6rcmwf.R.inc(36031);
        }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}
        protected MockBaseDateTimeField(DateTimeFieldType type) {
            super(type);__CLR4_4_1rogrogle6rcmwf.R.inc(36034);try{__CLR4_4_1rogrogle6rcmwf.R.inc(36033);
        }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}
        public int get(long instant) {try{__CLR4_4_1rogrogle6rcmwf.R.inc(36035);
            __CLR4_4_1rogrogle6rcmwf.R.inc(36036);return (int) (instant / 60L);
        }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}
        public long set(long instant, int value) {try{__CLR4_4_1rogrogle6rcmwf.R.inc(36037);
            __CLR4_4_1rogrogle6rcmwf.R.inc(36038);return 1000 + value;
        }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1rogrogle6rcmwf.R.inc(36039);
            __CLR4_4_1rogrogle6rcmwf.R.inc(36040);return new MockCountingDurationField(DurationFieldType.seconds());
        }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1rogrogle6rcmwf.R.inc(36041);
            __CLR4_4_1rogrogle6rcmwf.R.inc(36042);return new MockCountingDurationField(DurationFieldType.minutes());
        }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}
        public int getMinimumValue() {try{__CLR4_4_1rogrogle6rcmwf.R.inc(36043);
            __CLR4_4_1rogrogle6rcmwf.R.inc(36044);return 0;
        }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}
        public int getMaximumValue() {try{__CLR4_4_1rogrogle6rcmwf.R.inc(36045);
            __CLR4_4_1rogrogle6rcmwf.R.inc(36046);return 59;
        }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}
        public long roundFloor(long instant) {try{__CLR4_4_1rogrogle6rcmwf.R.inc(36047);
            __CLR4_4_1rogrogle6rcmwf.R.inc(36048);return (instant / 60L) * 60L;
        }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}
        public boolean isLenient() {try{__CLR4_4_1rogrogle6rcmwf.R.inc(36049);
            __CLR4_4_1rogrogle6rcmwf.R.inc(36050);return false;
        }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}
    }

    static class MockStandardBaseDateTimeField extends MockBaseDateTimeField {
        protected MockStandardBaseDateTimeField() {
            super();__CLR4_4_1rogrogle6rcmwf.R.inc(36052);try{__CLR4_4_1rogrogle6rcmwf.R.inc(36051);
        }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1rogrogle6rcmwf.R.inc(36053);
            __CLR4_4_1rogrogle6rcmwf.R.inc(36054);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1rogrogle6rcmwf.R.inc(36055);
            __CLR4_4_1rogrogle6rcmwf.R.inc(36056);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        
        protected MockCountingDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1rogrogle6rcmwf.R.inc(36058);try{__CLR4_4_1rogrogle6rcmwf.R.inc(36057);
        }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1rogrogle6rcmwf.R.inc(36059);
            __CLR4_4_1rogrogle6rcmwf.R.inc(36060);return false;
        }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1rogrogle6rcmwf.R.inc(36061);
            __CLR4_4_1rogrogle6rcmwf.R.inc(36062);return 0;
        }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1rogrogle6rcmwf.R.inc(36063);
            __CLR4_4_1rogrogle6rcmwf.R.inc(36064);return 0;
        }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1rogrogle6rcmwf.R.inc(36065);
            __CLR4_4_1rogrogle6rcmwf.R.inc(36066);return 0;
        }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1rogrogle6rcmwf.R.inc(36067);
            __CLR4_4_1rogrogle6rcmwf.R.inc(36068);return 0;
        }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1rogrogle6rcmwf.R.inc(36069);
            __CLR4_4_1rogrogle6rcmwf.R.inc(36070);add_int++;
            __CLR4_4_1rogrogle6rcmwf.R.inc(36071);return instant + (value * 60L);
        }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1rogrogle6rcmwf.R.inc(36072);
            __CLR4_4_1rogrogle6rcmwf.R.inc(36073);add_long++;
            __CLR4_4_1rogrogle6rcmwf.R.inc(36074);return instant + (value * 60L);
        }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1rogrogle6rcmwf.R.inc(36075);
            __CLR4_4_1rogrogle6rcmwf.R.inc(36076);difference_long++;
            __CLR4_4_1rogrogle6rcmwf.R.inc(36077);return 30;
        }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}
    }

    static class MockPartial extends BasePartial {
        protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_1rogrogle6rcmwf.R.inc(36078);
            __CLR4_4_1rogrogle6rcmwf.R.inc(36079);if ((((index == 0)&&(__CLR4_4_1rogrogle6rcmwf.R.iget(36080)!=0|true))||(__CLR4_4_1rogrogle6rcmwf.R.iget(36081)==0&false))) {{
                __CLR4_4_1rogrogle6rcmwf.R.inc(36082);return ISOChronology.getInstanceUTC().minuteOfHour();
            }
            }__CLR4_4_1rogrogle6rcmwf.R.inc(36083);if ((((index == 1)&&(__CLR4_4_1rogrogle6rcmwf.R.iget(36084)!=0|true))||(__CLR4_4_1rogrogle6rcmwf.R.iget(36085)==0&false))) {{
                __CLR4_4_1rogrogle6rcmwf.R.inc(36086);return ISOChronology.getInstanceUTC().millisOfSecond();
            }
            }__CLR4_4_1rogrogle6rcmwf.R.inc(36087);return null;
        }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}
        public int size() {try{__CLR4_4_1rogrogle6rcmwf.R.inc(36088);
            __CLR4_4_1rogrogle6rcmwf.R.inc(36089);return 2;
        }finally{__CLR4_4_1rogrogle6rcmwf.R.flushNeeded();}}
        
    }
}
