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
public class TestBaseDateTimeField extends TestCase {static class __CLR4_4_1rlnrlnle6qsfk2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,36060,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35771);
        __CLR4_4_1rlnrlnle6qsfk2.R.inc(35772);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35773);
        __CLR4_4_1rlnrlnle6qsfk2.R.inc(35774);return new TestSuite(TestBaseDateTimeField.class);
    }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}

    public TestBaseDateTimeField(String name) {
        super(name);__CLR4_4_1rlnrlnle6qsfk2.R.inc(35776);try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35775);
    }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35777);
    }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35778);
    }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_getMaximumValue_long346() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ygl3lxrlv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumValue_long346",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35779,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ygl3lxrlv(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35779); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35780);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35781);assertEquals(59, field.getMaximumValue(0L)); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_constructor347() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fzpfbkrly();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_constructor347",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35782,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fzpfbkrly(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35782); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35783);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35784);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType()); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35785);try { 
         __CLR4_4_1rlnrlnle6qsfk2.R.inc(35786);field = new MockBaseDateTimeField(null); 
         __CLR4_4_1rlnrlnle6qsfk2.R.inc(35787);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_convertText348() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ano2h7rm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_convertText348",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35788,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ano2h7rm4(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35788); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35789);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35790);assertEquals(0, field.convertText("0", null)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35791);assertEquals(29, field.convertText("29", null)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35792);try { 
         __CLR4_4_1rlnrlnle6qsfk2.R.inc(35793);field.convertText("2A", null); 
         __CLR4_4_1rlnrlnle6qsfk2.R.inc(35794);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35795);try { 
         __CLR4_4_1rlnrlnle6qsfk2.R.inc(35796);field.convertText(null, null); 
         __CLR4_4_1rlnrlnle6qsfk2.R.inc(35797);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_toString349() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17bayurme();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_toString349",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35798,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17bayurme(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35798); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35799);BaseDateTimeField field = new MockBaseDateTimeField(DateTimeFieldType.secondOfDay()); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35800);assertEquals("DateTimeField[secondOfDay]", field.toString()); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_getAsText_long350() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_162nwourmh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_long350",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35801,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_162nwourmh(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35801); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35802);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35803);assertEquals("29", field.getAsText(60L * 29)); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_getAsText_RP_Locale351() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oixb9urmk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_RP_Locale351",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35804,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oixb9urmk(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35804); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35805);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35806);assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35807);assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), null)); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_getAsText_int_Locale352() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p9i00armo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_int_Locale352",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35808,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p9i00armo(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35808); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35809);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35810);assertEquals("80", field.getAsText(80, Locale.ENGLISH)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35811);assertEquals("80", field.getAsText(80, null)); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_getAsShortText_long_Locale353() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k9tzm4rms();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_long_Locale353",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k9tzm4rms(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35812); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35813);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35814);assertEquals("29", field.getAsShortText(60L * 29, Locale.ENGLISH)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35815);assertEquals("29", field.getAsShortText(60L * 29, null)); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_getAsShortText_long354() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115428crmw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_long354",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35816,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115428crmw(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35816); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35817);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35818);assertEquals("29", field.getAsShortText(60L * 29)); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_getAsShortText_RP_Locale355() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12xv5v4rmz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_RP_Locale355",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12xv5v4rmz(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35819); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35820);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35821);assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35822);assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), null)); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_roundCeiling_long356() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pfnh3wrn3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundCeiling_long356",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35823,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pfnh3wrn3(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35823); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35824);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35825);assertEquals(0L, field.roundCeiling(0L)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35826);assertEquals(60L, field.roundCeiling(29L)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35827);assertEquals(60L, field.roundCeiling(30L)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35828);assertEquals(60L, field.roundCeiling(31L)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35829);assertEquals(60L, field.roundCeiling(60L)); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_add_long_long357() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dsjlgorna();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_add_long_long357",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dsjlgorna(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35830); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35831);MockCountingDurationField.add_long = 0; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35832);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35833);assertEquals(61, field.add(1L, 1L)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35834);assertEquals(1, MockCountingDurationField.add_long); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_add_RP_int_intarray_int358() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fyfyo3rnf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_add_RP_int_intarray_int358",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35835,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fyfyo3rnf(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35835); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35836);int[] values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35837);int[] expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35838);BaseDateTimeField field = new MockStandardBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35839);int[] result = field.add(new TimeOfDay(), 2, values, 0); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35840);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35841);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35842);expected = new int[] { 10, 20, 31, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35843);result = field.add(new TimeOfDay(), 2, values, 1); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35844);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35845);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35846);expected = new int[] { 10, 21, 0, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35847);result = field.add(new TimeOfDay(), 2, values, 30); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35848);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35849);values = new int[] { 23, 59, 30, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35850);try { 
         __CLR4_4_1rlnrlnle6qsfk2.R.inc(35851);field.add(new TimeOfDay(), 2, values, 30); 
         __CLR4_4_1rlnrlnle6qsfk2.R.inc(35852);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35853);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35854);expected = new int[] { 10, 20, 29, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35855);result = field.add(new TimeOfDay(), 2, values, -1); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35856);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35857);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35858);expected = new int[] { 10, 19, 59, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35859);result = field.add(new TimeOfDay(), 2, values, -31); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35860);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35861);values = new int[] { 0, 0, 30, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35862);try { 
         __CLR4_4_1rlnrlnle6qsfk2.R.inc(35863);field.add(new TimeOfDay(), 2, values, -31); 
         __CLR4_4_1rlnrlnle6qsfk2.R.inc(35864);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35865);values = new int[] { 0, 0 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35866);try { 
         __CLR4_4_1rlnrlnle6qsfk2.R.inc(35867);field.add(new MockPartial(), 0, values, 1000); 
         __CLR4_4_1rlnrlnle6qsfk2.R.inc(35868);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35869);values = new int[] { 1, 0 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35870);try { 
         __CLR4_4_1rlnrlnle6qsfk2.R.inc(35871);field.add(new MockPartial(), 0, values, -1000); 
         __CLR4_4_1rlnrlnle6qsfk2.R.inc(35872);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_addWrapField_long_int360() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16538fvroh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_addWrapField_long_int360",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16538fvroh(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35873); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35874);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35875);assertEquals(1029, field.addWrapField(60L * 29, 0)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35876);assertEquals(1059, field.addWrapField(60L * 29, 30)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35877);assertEquals(1000, field.addWrapField(60L * 29, 31)); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_addWrapField_RP_int_intarray_int361() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ut1jt9rom();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_addWrapField_RP_int_intarray_int361",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35878,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ut1jt9rom(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35878); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35879);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35880);int[] values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35881);int[] expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35882);int[] result = field.addWrapField(new TimeOfDay(), 2, values, 0); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35883);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35884);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35885);expected = new int[] { 10, 20, 59, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35886);result = field.addWrapField(new TimeOfDay(), 2, values, 29); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35887);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35888);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35889);expected = new int[] { 10, 20, 0, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35890);result = field.addWrapField(new TimeOfDay(), 2, values, 30); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35891);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35892);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35893);expected = new int[] { 10, 20, 1, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35894);result = field.addWrapField(new TimeOfDay(), 2, values, 31); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35895);assertEquals(true, Arrays.equals(result, expected)); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_getDifference_long_long362() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dkoogrp4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getDifference_long_long362",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35896,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dkoogrp4(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35896); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35897);MockCountingDurationField.difference_long = 0; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35898);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35899);assertEquals(30, field.getDifference(0L, 0L)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35900);assertEquals(1, MockCountingDurationField.difference_long); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_getDifferenceAsLong_long_long363() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1thhd0drp9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getDifferenceAsLong_long_long363",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35901,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1thhd0drp9(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35901); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35902);MockCountingDurationField.difference_long = 0; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35903);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35904);assertEquals(30, field.getDifferenceAsLong(0L, 0L)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35905);assertEquals(1, MockCountingDurationField.difference_long); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_set_RP_int_intarray_String_Locale364() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w9mrvmrpe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_set_RP_int_intarray_String_Locale364",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w9mrvmrpe(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35906); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35907);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35908);int[] values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35909);int[] expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35910);int[] result = field.set(new TimeOfDay(), 2, values, "30", null); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35911);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35912);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35913);expected = new int[] { 10, 20, 29, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35914);result = field.set(new TimeOfDay(), 2, values, "29", Locale.ENGLISH); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35915);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35916);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35917);expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35918);try { 
         __CLR4_4_1rlnrlnle6qsfk2.R.inc(35919);field.set(new TimeOfDay(), 2, values, "60", null); 
         __CLR4_4_1rlnrlnle6qsfk2.R.inc(35920);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35921);assertEquals(true, Arrays.equals(values, expected)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35922);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35923);expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35924);try { 
         __CLR4_4_1rlnrlnle6qsfk2.R.inc(35925);field.set(new TimeOfDay(), 2, values, "-1", null); 
         __CLR4_4_1rlnrlnle6qsfk2.R.inc(35926);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35927);assertEquals(true, Arrays.equals(values, expected)); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_set_long_String_Locale365() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o3er3erq0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_set_long_String_Locale365",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35928,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o3er3erq0(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35928); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35929);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35930);assertEquals(1000, field.set(0L, "0", null)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35931);assertEquals(1029, field.set(0L, "29", Locale.ENGLISH)); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_set_long_String366() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mm99zkrq4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_set_long_String366",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35932,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mm99zkrq4(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35932); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35933);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35934);assertEquals(1000, field.set(0L, "0")); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35935);assertEquals(1029, field.set(0L, "29")); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_isLeap_long367() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ea51vlrq8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_isLeap_long367",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ea51vlrq8(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35936); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35937);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35938);assertEquals(false, field.isLeap(0L)); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_getLeapAmount_long368() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pogeyyrqb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getLeapAmount_long368",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35939,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pogeyyrqb(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35939); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35940);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35941);assertEquals(0, field.getLeapAmount(0L)); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_getLeapDurationField369() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eqh1rcrqe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getLeapDurationField369",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35942,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eqh1rcrqe(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35942); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35943);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35944);assertEquals(null, field.getLeapDurationField()); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_getMinimumValue_long370() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eu60ecrqh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMinimumValue_long370",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eu60ecrqh(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35945); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35946);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35947);assertEquals(0, field.getMinimumValue(0L)); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_getMaximumTextLength_Locale371() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yk7k4lrqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumTextLength_Locale371",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35948,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yk7k4lrqk(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35948); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35949);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35950);assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35951);field = new MockBaseDateTimeField() { 
  
         public int getMaximumValue() {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35952); 
             __CLR4_4_1rlnrlnle6qsfk2.R.inc(35953);return 5; 
         }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 
     }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35954);assertEquals(1, field.getMaximumTextLength(Locale.ENGLISH)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35955);field = new MockBaseDateTimeField() { 
  
         public int getMaximumValue() {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35956); 
             __CLR4_4_1rlnrlnle6qsfk2.R.inc(35957);return 555; 
         }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 
     }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35958);assertEquals(3, field.getMaximumTextLength(Locale.ENGLISH)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35959);field = new MockBaseDateTimeField() { 
  
         public int getMaximumValue() {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35960); 
             __CLR4_4_1rlnrlnle6qsfk2.R.inc(35961);return 5555; 
         }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 
     }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35962);assertEquals(4, field.getMaximumTextLength(Locale.ENGLISH)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35963);field = new MockBaseDateTimeField() { 
  
         public int getMaximumValue() {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35964); 
             __CLR4_4_1rlnrlnle6qsfk2.R.inc(35965);return -1; 
         }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 
     }; 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35966);assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH)); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_getMaximumShortTextLength_Locale372() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x7ii24rr3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumShortTextLength_Locale372",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x7ii24rr3(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35967); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35968);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35969);assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH)); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_roundHalfFloor_long373() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35970);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1to5yctrr6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundHalfFloor_long373",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35970,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1to5yctrr6(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35970); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35971);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35972);assertEquals(0L, field.roundHalfFloor(0L)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35973);assertEquals(0L, field.roundHalfFloor(29L)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35974);assertEquals(0L, field.roundHalfFloor(30L)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35975);assertEquals(60L, field.roundHalfFloor(31L)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35976);assertEquals(60L, field.roundHalfFloor(60L)); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_roundHalfCeiling_long374() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wv2e6drrd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundHalfCeiling_long374",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wv2e6drrd(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35977); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35978);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35979);assertEquals(0L, field.roundHalfCeiling(0L)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35980);assertEquals(0L, field.roundHalfCeiling(29L)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35981);assertEquals(60L, field.roundHalfCeiling(30L)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35982);assertEquals(60L, field.roundHalfCeiling(31L)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35983);assertEquals(60L, field.roundHalfCeiling(60L)); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_roundHalfEven_long375() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ohhmyzrrk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundHalfEven_long375",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35984,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ohhmyzrrk(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35984); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35985);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35986);assertEquals(0L, field.roundHalfEven(0L)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35987);assertEquals(0L, field.roundHalfEven(29L)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35988);assertEquals(0L, field.roundHalfEven(30L)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35989);assertEquals(60L, field.roundHalfEven(31L)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35990);assertEquals(60L, field.roundHalfEven(60L)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35991);assertEquals(60L, field.roundHalfEven(89L)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35992);assertEquals(120L, field.roundHalfEven(90L)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35993);assertEquals(120L, field.roundHalfEven(91L)); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 


public void test_remainder_long376() {__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceStart(getClass().getName(),35994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h9ezp2rru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rlnrlnle6qsfk2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rlnrlnle6qsfk2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_remainder_long376",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35994,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h9ezp2rru(){try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(35994); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35995);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35996);assertEquals(0L, field.remainder(0L)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35997);assertEquals(29L, field.remainder(29L)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35998);assertEquals(30L, field.remainder(30L)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(35999);assertEquals(31L, field.remainder(31L)); 
     __CLR4_4_1rlnrlnle6qsfk2.R.inc(36000);assertEquals(0L, field.remainder(60L)); 
 }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}} 

    

    

    

    

    

    

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
            super(DateTimeFieldType.secondOfMinute());__CLR4_4_1rlnrlnle6qsfk2.R.inc(36002);try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(36001);
        }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}
        protected MockBaseDateTimeField(DateTimeFieldType type) {
            super(type);__CLR4_4_1rlnrlnle6qsfk2.R.inc(36004);try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(36003);
        }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}
        public int get(long instant) {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(36005);
            __CLR4_4_1rlnrlnle6qsfk2.R.inc(36006);return (int) (instant / 60L);
        }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}
        public long set(long instant, int value) {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(36007);
            __CLR4_4_1rlnrlnle6qsfk2.R.inc(36008);return 1000 + value;
        }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(36009);
            __CLR4_4_1rlnrlnle6qsfk2.R.inc(36010);return new MockCountingDurationField(DurationFieldType.seconds());
        }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(36011);
            __CLR4_4_1rlnrlnle6qsfk2.R.inc(36012);return new MockCountingDurationField(DurationFieldType.minutes());
        }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}
        public int getMinimumValue() {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(36013);
            __CLR4_4_1rlnrlnle6qsfk2.R.inc(36014);return 0;
        }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}
        public int getMaximumValue() {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(36015);
            __CLR4_4_1rlnrlnle6qsfk2.R.inc(36016);return 59;
        }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}
        public long roundFloor(long instant) {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(36017);
            __CLR4_4_1rlnrlnle6qsfk2.R.inc(36018);return (instant / 60L) * 60L;
        }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}
        public boolean isLenient() {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(36019);
            __CLR4_4_1rlnrlnle6qsfk2.R.inc(36020);return false;
        }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}
    }

    static class MockStandardBaseDateTimeField extends MockBaseDateTimeField {
        protected MockStandardBaseDateTimeField() {
            super();__CLR4_4_1rlnrlnle6qsfk2.R.inc(36022);try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(36021);
        }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(36023);
            __CLR4_4_1rlnrlnle6qsfk2.R.inc(36024);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(36025);
            __CLR4_4_1rlnrlnle6qsfk2.R.inc(36026);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        
        protected MockCountingDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1rlnrlnle6qsfk2.R.inc(36028);try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(36027);
        }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(36029);
            __CLR4_4_1rlnrlnle6qsfk2.R.inc(36030);return false;
        }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(36031);
            __CLR4_4_1rlnrlnle6qsfk2.R.inc(36032);return 0;
        }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(36033);
            __CLR4_4_1rlnrlnle6qsfk2.R.inc(36034);return 0;
        }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(36035);
            __CLR4_4_1rlnrlnle6qsfk2.R.inc(36036);return 0;
        }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(36037);
            __CLR4_4_1rlnrlnle6qsfk2.R.inc(36038);return 0;
        }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(36039);
            __CLR4_4_1rlnrlnle6qsfk2.R.inc(36040);add_int++;
            __CLR4_4_1rlnrlnle6qsfk2.R.inc(36041);return instant + (value * 60L);
        }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(36042);
            __CLR4_4_1rlnrlnle6qsfk2.R.inc(36043);add_long++;
            __CLR4_4_1rlnrlnle6qsfk2.R.inc(36044);return instant + (value * 60L);
        }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(36045);
            __CLR4_4_1rlnrlnle6qsfk2.R.inc(36046);difference_long++;
            __CLR4_4_1rlnrlnle6qsfk2.R.inc(36047);return 30;
        }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}
    }

    static class MockPartial extends BasePartial {
        protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(36048);
            __CLR4_4_1rlnrlnle6qsfk2.R.inc(36049);if ((((index == 0)&&(__CLR4_4_1rlnrlnle6qsfk2.R.iget(36050)!=0|true))||(__CLR4_4_1rlnrlnle6qsfk2.R.iget(36051)==0&false))) {{
                __CLR4_4_1rlnrlnle6qsfk2.R.inc(36052);return ISOChronology.getInstanceUTC().minuteOfHour();
            }
            }__CLR4_4_1rlnrlnle6qsfk2.R.inc(36053);if ((((index == 1)&&(__CLR4_4_1rlnrlnle6qsfk2.R.iget(36054)!=0|true))||(__CLR4_4_1rlnrlnle6qsfk2.R.iget(36055)==0&false))) {{
                __CLR4_4_1rlnrlnle6qsfk2.R.inc(36056);return ISOChronology.getInstanceUTC().millisOfSecond();
            }
            }__CLR4_4_1rlnrlnle6qsfk2.R.inc(36057);return null;
        }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}
        public int size() {try{__CLR4_4_1rlnrlnle6qsfk2.R.inc(36058);
            __CLR4_4_1rlnrlnle6qsfk2.R.inc(36059);return 2;
        }finally{__CLR4_4_1rlnrlnle6qsfk2.R.flushNeeded();}}
        
    }
}
