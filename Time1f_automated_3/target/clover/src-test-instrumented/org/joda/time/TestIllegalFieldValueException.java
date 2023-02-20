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

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.SkipDateTimeField;

/**
 * Tests IllegalFieldValueException by triggering it from other methods.
 *
 * @author Brian S O'Neill
 */
public class TestIllegalFieldValueException extends TestCase {static class __CLR4_4_1hrwhrwle6np4ed{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,23126,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) {try{__CLR4_4_1hrwhrwle6np4ed.R.inc(23036);
        __CLR4_4_1hrwhrwle6np4ed.R.inc(23037);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hrwhrwle6np4ed.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hrwhrwle6np4ed.R.inc(23038);
        __CLR4_4_1hrwhrwle6np4ed.R.inc(23039);return new TestSuite(TestIllegalFieldValueException.class);
    }finally{__CLR4_4_1hrwhrwle6np4ed.R.flushNeeded();}}

    public TestIllegalFieldValueException(String name) {
        super(name);__CLR4_4_1hrwhrwle6np4ed.R.inc(23041);try{__CLR4_4_1hrwhrwle6np4ed.R.inc(23040);
    }finally{__CLR4_4_1hrwhrwle6np4ed.R.flushNeeded();}}

public void testOtherConstructors414() {__CLR4_4_1hrwhrwle6np4ed.R.globalSliceStart(getClass().getName(),23042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hhz4qvhs2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hrwhrwle6np4ed.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hrwhrwle6np4ed.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testOtherConstructors414",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23042,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hhz4qvhs2(){try{__CLR4_4_1hrwhrwle6np4ed.R.inc(23042); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23043);IllegalFieldValueException e = new IllegalFieldValueException(DurationFieldType.days(), new Integer(1), new Integer(2), new Integer(3)); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23044);assertEquals(null, e.getDateTimeFieldType()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23045);assertEquals(DurationFieldType.days(), e.getDurationFieldType()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23046);assertEquals("days", e.getFieldName()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23047);assertEquals(new Integer(1), e.getIllegalNumberValue()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23048);assertEquals(null, e.getIllegalStringValue()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23049);assertEquals("1", e.getIllegalValueAsString()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23050);assertEquals(new Integer(2), e.getLowerBound()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23051);assertEquals(new Integer(3), e.getUpperBound()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23052);e = new IllegalFieldValueException(DurationFieldType.months(), "five"); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23053);assertEquals(null, e.getDateTimeFieldType()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23054);assertEquals(DurationFieldType.months(), e.getDurationFieldType()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23055);assertEquals("months", e.getFieldName()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23056);assertEquals(null, e.getIllegalNumberValue()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23057);assertEquals("five", e.getIllegalStringValue()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23058);assertEquals("five", e.getIllegalValueAsString()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23059);assertEquals(null, e.getLowerBound()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23060);assertEquals(null, e.getUpperBound()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23061);e = new IllegalFieldValueException("months", "five"); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23062);assertEquals(null, e.getDateTimeFieldType()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23063);assertEquals(null, e.getDurationFieldType()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23064);assertEquals("months", e.getFieldName()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23065);assertEquals(null, e.getIllegalNumberValue()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23066);assertEquals("five", e.getIllegalStringValue()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23067);assertEquals("five", e.getIllegalValueAsString()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23068);assertEquals(null, e.getLowerBound()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23069);assertEquals(null, e.getUpperBound()); 
 }finally{__CLR4_4_1hrwhrwle6np4ed.R.flushNeeded();}}
public void testFieldName416() {__CLR4_4_1hrwhrwle6np4ed.R.globalSliceStart(getClass().getName(),23070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15w7fhvhsu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hrwhrwle6np4ed.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hrwhrwle6np4ed.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testFieldName416",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23070,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15w7fhvhsu(){try{__CLR4_4_1hrwhrwle6np4ed.R.inc(23070); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23071);IllegalFieldValueException e = new IllegalFieldValueException(DurationFieldType.days(), new Integer(1), new Integer(2), new Integer(3)); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23072);assertEquals(null, e.getDateTimeFieldType()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23073);assertEquals(DurationFieldType.days(), e.getDurationFieldType()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23074);assertEquals("days", e.getFieldName()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23075);assertEquals(new Integer(1), e.getIllegalNumberValue()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23076);assertEquals(null, e.getIllegalStringValue()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23077);assertEquals("1", e.getIllegalValueAsString()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23078);assertEquals(new Integer(2), e.getLowerBound()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23079);assertEquals(new Integer(3), e.getUpperBound()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23080);e = new IllegalFieldValueException(DurationFieldType.months(), "five"); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23081);assertEquals(null, e.getDateTimeFieldType()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23082);assertEquals(DurationFieldType.months(), e.getDurationFieldType()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23083);assertEquals("months", e.getFieldName()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23084);assertEquals(null, e.getIllegalNumberValue()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23085);assertEquals("five", e.getIllegalStringValue()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23086);assertEquals("five", e.getIllegalValueAsString()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23087);assertEquals(null, e.getLowerBound()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23088);assertEquals(null, e.getUpperBound()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23089);e = new IllegalFieldValueException("months", "five"); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23090);assertEquals(null, e.getDateTimeFieldType()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23091);assertEquals(null, e.getDurationFieldType()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23092);assertEquals("months", e.getFieldName()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23093);assertEquals(null, e.getIllegalNumberValue()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23094);assertEquals("five", e.getIllegalStringValue()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23095);assertEquals("five", e.getIllegalValueAsString()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23096);assertEquals(null, e.getLowerBound()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23097);assertEquals(null, e.getUpperBound()); 
 }finally{__CLR4_4_1hrwhrwle6np4ed.R.flushNeeded();}}
public void testNumberValue417() {__CLR4_4_1hrwhrwle6np4ed.R.globalSliceStart(getClass().getName(),23098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ghv5udhtm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hrwhrwle6np4ed.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hrwhrwle6np4ed.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testNumberValue417",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23098,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ghv5udhtm(){try{__CLR4_4_1hrwhrwle6np4ed.R.inc(23098); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23099);IllegalFieldValueException e = new IllegalFieldValueException(DurationFieldType.days(), new Integer(1), new Integer(2), new Integer(3)); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23100);assertEquals(null, e.getDateTimeFieldType()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23101);assertEquals(DurationFieldType.days(), e.getDurationFieldType()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23102);assertEquals("days", e.getFieldName()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23103);assertEquals(new Integer(1), e.getIllegalNumberValue()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23104);assertEquals(null, e.getIllegalStringValue()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23105);assertEquals("1", e.getIllegalValueAsString()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23106);assertEquals(new Integer(2), e.getLowerBound()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23107);assertEquals(new Integer(3), e.getUpperBound()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23108);e = new IllegalFieldValueException(DurationFieldType.months(), "five"); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23109);assertEquals(null, e.getDateTimeFieldType()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23110);assertEquals(DurationFieldType.months(), e.getDurationFieldType()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23111);assertEquals("months", e.getFieldName()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23112);assertEquals(null, e.getIllegalNumberValue()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23113);assertEquals("five", e.getIllegalStringValue()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23114);assertEquals("five", e.getIllegalValueAsString()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23115);assertEquals(null, e.getLowerBound()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23116);assertEquals(null, e.getUpperBound()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23117);e = new IllegalFieldValueException("months", "five"); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23118);assertEquals(null, e.getDateTimeFieldType()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23119);assertEquals(null, e.getDurationFieldType()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23120);assertEquals("months", e.getFieldName()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23121);assertEquals(null, e.getIllegalNumberValue()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23122);assertEquals("five", e.getIllegalStringValue()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23123);assertEquals("five", e.getIllegalValueAsString()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23124);assertEquals(null, e.getLowerBound()); 
     __CLR4_4_1hrwhrwle6np4ed.R.inc(23125);assertEquals(null, e.getUpperBound()); 
 }finally{__CLR4_4_1hrwhrwle6np4ed.R.flushNeeded();}}
    

    

    

    

    

    

    

    // Test extra constructors not currently called by anything
    
}
