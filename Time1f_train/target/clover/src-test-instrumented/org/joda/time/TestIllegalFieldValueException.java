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
public class TestIllegalFieldValueException extends TestCase {static class __CLR4_4_1jykjyklc8axdv8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,26088,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) {try{__CLR4_4_1jykjyklc8axdv8.R.inc(25868);
        __CLR4_4_1jykjyklc8axdv8.R.inc(25869);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jykjyklc8axdv8.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jykjyklc8axdv8.R.inc(25870);
        __CLR4_4_1jykjyklc8axdv8.R.inc(25871);return new TestSuite(TestIllegalFieldValueException.class);
    }finally{__CLR4_4_1jykjyklc8axdv8.R.flushNeeded();}}

    public TestIllegalFieldValueException(String name) {
        super(name);__CLR4_4_1jykjyklc8axdv8.R.inc(25873);try{__CLR4_4_1jykjyklc8axdv8.R.inc(25872);
    }finally{__CLR4_4_1jykjyklc8axdv8.R.flushNeeded();}}


public void testSetText18() {__CLR4_4_1jykjyklc8axdv8.R.globalSliceStart(getClass().getName(),25874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uismsrjyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jykjyklc8axdv8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jykjyklc8axdv8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testSetText18",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uismsrjyq(){try{__CLR4_4_1jykjyklc8axdv8.R.inc(25874); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25875);try { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25876);ISOChronology.getInstanceUTC().year().set(0, null, java.util.Locale.US); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25877);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25878);assertEquals(DateTimeFieldType.year(), e.getDateTimeFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25879);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25880);assertEquals("year", e.getFieldName()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25881);assertEquals(null, e.getIllegalNumberValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25882);assertEquals(null, e.getIllegalStringValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25883);assertEquals("null", e.getIllegalValueAsString()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25884);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25885);assertEquals(null, e.getUpperBound()); 
     } 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25886);try { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25887);ISOChronology.getInstanceUTC().year().set(0, "nineteen seventy", java.util.Locale.US); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25888);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25889);assertEquals(DateTimeFieldType.year(), e.getDateTimeFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25890);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25891);assertEquals("year", e.getFieldName()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25892);assertEquals(null, e.getIllegalNumberValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25893);assertEquals("nineteen seventy", e.getIllegalStringValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25894);assertEquals("nineteen seventy", e.getIllegalValueAsString()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25895);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25896);assertEquals(null, e.getUpperBound()); 
     } 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25897);try { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25898);ISOChronology.getInstanceUTC().era().set(0, "long ago", java.util.Locale.US); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25899);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25900);assertEquals(DateTimeFieldType.era(), e.getDateTimeFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25901);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25902);assertEquals("era", e.getFieldName()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25903);assertEquals(null, e.getIllegalNumberValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25904);assertEquals("long ago", e.getIllegalStringValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25905);assertEquals("long ago", e.getIllegalValueAsString()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25906);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25907);assertEquals(null, e.getUpperBound()); 
     } 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25908);try { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25909);ISOChronology.getInstanceUTC().monthOfYear().set(0, "spring", java.util.Locale.US); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25910);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25911);assertEquals(DateTimeFieldType.monthOfYear(), e.getDateTimeFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25912);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25913);assertEquals("monthOfYear", e.getFieldName()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25914);assertEquals(null, e.getIllegalNumberValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25915);assertEquals("spring", e.getIllegalStringValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25916);assertEquals("spring", e.getIllegalValueAsString()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25917);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25918);assertEquals(null, e.getUpperBound()); 
     } 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25919);try { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25920);ISOChronology.getInstanceUTC().dayOfWeek().set(0, "yesterday", java.util.Locale.US); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25921);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25922);assertEquals(DateTimeFieldType.dayOfWeek(), e.getDateTimeFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25923);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25924);assertEquals("dayOfWeek", e.getFieldName()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25925);assertEquals(null, e.getIllegalNumberValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25926);assertEquals("yesterday", e.getIllegalStringValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25927);assertEquals("yesterday", e.getIllegalValueAsString()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25928);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25929);assertEquals(null, e.getUpperBound()); 
     } 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25930);try { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25931);ISOChronology.getInstanceUTC().halfdayOfDay().set(0, "morning", java.util.Locale.US); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25932);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25933);assertEquals(DateTimeFieldType.halfdayOfDay(), e.getDateTimeFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25934);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25935);assertEquals("halfdayOfDay", e.getFieldName()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25936);assertEquals(null, e.getIllegalNumberValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25937);assertEquals("morning", e.getIllegalStringValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25938);assertEquals("morning", e.getIllegalValueAsString()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25939);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25940);assertEquals(null, e.getUpperBound()); 
     } 
 }finally{__CLR4_4_1jykjyklc8axdv8.R.flushNeeded();}} 


public void testOtherConstructors47() {__CLR4_4_1jykjyklc8axdv8.R.globalSliceStart(getClass().getName(),25941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kh7mbjk0l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jykjyklc8axdv8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jykjyklc8axdv8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testOtherConstructors47",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25941,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kh7mbjk0l(){try{__CLR4_4_1jykjyklc8axdv8.R.inc(25941); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25942);IllegalFieldValueException e = new IllegalFieldValueException(DurationFieldType.days(), new Integer(1), new Integer(2), new Integer(3)); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25943);assertEquals(null, e.getDateTimeFieldType()); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25944);assertEquals(DurationFieldType.days(), e.getDurationFieldType()); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25945);assertEquals("days", e.getFieldName()); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25946);assertEquals(new Integer(1), e.getIllegalNumberValue()); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25947);assertEquals(null, e.getIllegalStringValue()); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25948);assertEquals("1", e.getIllegalValueAsString()); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25949);assertEquals(new Integer(2), e.getLowerBound()); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25950);assertEquals(new Integer(3), e.getUpperBound()); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25951);e = new IllegalFieldValueException(DurationFieldType.months(), "five"); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25952);assertEquals(null, e.getDateTimeFieldType()); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25953);assertEquals(DurationFieldType.months(), e.getDurationFieldType()); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25954);assertEquals("months", e.getFieldName()); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25955);assertEquals(null, e.getIllegalNumberValue()); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25956);assertEquals("five", e.getIllegalStringValue()); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25957);assertEquals("five", e.getIllegalValueAsString()); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25958);assertEquals(null, e.getLowerBound()); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25959);assertEquals(null, e.getUpperBound()); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25960);e = new IllegalFieldValueException("months", "five"); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25961);assertEquals(null, e.getDateTimeFieldType()); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25962);assertEquals(null, e.getDurationFieldType()); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25963);assertEquals("months", e.getFieldName()); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25964);assertEquals(null, e.getIllegalNumberValue()); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25965);assertEquals("five", e.getIllegalStringValue()); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25966);assertEquals("five", e.getIllegalValueAsString()); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25967);assertEquals(null, e.getLowerBound()); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25968);assertEquals(null, e.getUpperBound()); 
 }finally{__CLR4_4_1jykjyklc8axdv8.R.flushNeeded();}} 


public void testSkipDateTimeField102() {__CLR4_4_1jykjyklc8axdv8.R.globalSliceStart(getClass().getName(),25969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gp1370k1d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jykjyklc8axdv8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jykjyklc8axdv8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testSkipDateTimeField102",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gp1370k1d(){try{__CLR4_4_1jykjyklc8axdv8.R.inc(25969); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25970);DateTimeField field = new SkipDateTimeField(ISOChronology.getInstanceUTC(), ISOChronology.getInstanceUTC().year(), 1970); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25971);try { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25972);field.set(0, 1970); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25973);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25974);assertEquals(DateTimeFieldType.year(), e.getDateTimeFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25975);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25976);assertEquals("year", e.getFieldName()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25977);assertEquals(new Integer(1970), e.getIllegalNumberValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25978);assertEquals(null, e.getIllegalStringValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25979);assertEquals("1970", e.getIllegalValueAsString()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25980);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25981);assertEquals(null, e.getUpperBound()); 
     } 
 }finally{__CLR4_4_1jykjyklc8axdv8.R.flushNeeded();}} 


public void testZoneTransition456() {__CLR4_4_1jykjyklc8axdv8.R.globalSliceStart(getClass().getName(),25982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ggky3tk1q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jykjyklc8axdv8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jykjyklc8axdv8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testZoneTransition456",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ggky3tk1q(){try{__CLR4_4_1jykjyklc8axdv8.R.inc(25982); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25983);DateTime dt = new DateTime(2005, 4, 3, 1, 0, 0, 0, DateTimeZone.forID("America/Los_Angeles")); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25984);try { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25985);dt.hourOfDay().setCopy(2); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25986);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25987);assertEquals(DateTimeFieldType.hourOfDay(), e.getDateTimeFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25988);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25989);assertEquals("hourOfDay", e.getFieldName()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25990);assertEquals(new Integer(2), e.getIllegalNumberValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25991);assertEquals(null, e.getIllegalStringValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25992);assertEquals("2", e.getIllegalValueAsString()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25993);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25994);assertEquals(null, e.getUpperBound()); 
     } 
 }finally{__CLR4_4_1jykjyklc8axdv8.R.flushNeeded();}} 


public void testVerifyValueBounds532() {__CLR4_4_1jykjyklc8axdv8.R.globalSliceStart(getClass().getName(),25995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18w4dhck23();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jykjyklc8axdv8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jykjyklc8axdv8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testVerifyValueBounds532",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25995,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18w4dhck23(){try{__CLR4_4_1jykjyklc8axdv8.R.inc(25995); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(25996);try { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25997);FieldUtils.verifyValueBounds(ISOChronology.getInstance().monthOfYear(), -5, 1, 31); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25998);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(25999);assertEquals(DateTimeFieldType.monthOfYear(), e.getDateTimeFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26000);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26001);assertEquals("monthOfYear", e.getFieldName()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26002);assertEquals(new Integer(-5), e.getIllegalNumberValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26003);assertEquals(null, e.getIllegalStringValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26004);assertEquals("-5", e.getIllegalValueAsString()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26005);assertEquals(new Integer(1), e.getLowerBound()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26006);assertEquals(new Integer(31), e.getUpperBound()); 
     } 
     __CLR4_4_1jykjyklc8axdv8.R.inc(26007);try { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26008);FieldUtils.verifyValueBounds(DateTimeFieldType.hourOfDay(), 27, 0, 23); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26009);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26010);assertEquals(DateTimeFieldType.hourOfDay(), e.getDateTimeFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26011);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26012);assertEquals("hourOfDay", e.getFieldName()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26013);assertEquals(new Integer(27), e.getIllegalNumberValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26014);assertEquals(null, e.getIllegalStringValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26015);assertEquals("27", e.getIllegalValueAsString()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26016);assertEquals(new Integer(0), e.getLowerBound()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26017);assertEquals(new Integer(23), e.getUpperBound()); 
     } 
     __CLR4_4_1jykjyklc8axdv8.R.inc(26018);try { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26019);FieldUtils.verifyValueBounds("foo", 1, 2, 3); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26020);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26021);assertEquals(null, e.getDateTimeFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26022);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26023);assertEquals("foo", e.getFieldName()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26024);assertEquals(new Integer(1), e.getIllegalNumberValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26025);assertEquals(null, e.getIllegalStringValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26026);assertEquals("1", e.getIllegalValueAsString()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26027);assertEquals(new Integer(2), e.getLowerBound()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26028);assertEquals(new Integer(3), e.getUpperBound()); 
     } 
 }finally{__CLR4_4_1jykjyklc8axdv8.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testReadablePartialValidate1237() {__CLR4_4_1jykjyklc8axdv8.R.globalSliceStart(getClass().getName(),26029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13la6ptk31();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jykjyklc8axdv8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jykjyklc8axdv8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testReadablePartialValidate1237",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26029,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13la6ptk31(){try{__CLR4_4_1jykjyklc8axdv8.R.inc(26029); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(26030);try { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26031);new YearMonthDay(1970, -5, 1); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26032);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26033);assertEquals(DateTimeFieldType.monthOfYear(), e.getDateTimeFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26034);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26035);assertEquals("monthOfYear", e.getFieldName()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26036);assertEquals(new Integer(-5), e.getIllegalNumberValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26037);assertEquals(null, e.getIllegalStringValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26038);assertEquals("-5", e.getIllegalValueAsString()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26039);assertEquals(new Integer(1), e.getLowerBound()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26040);assertEquals(null, e.getUpperBound()); 
     } 
     __CLR4_4_1jykjyklc8axdv8.R.inc(26041);try { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26042);new YearMonthDay(1970, 500, 1); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26043);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26044);assertEquals(DateTimeFieldType.monthOfYear(), e.getDateTimeFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26045);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26046);assertEquals("monthOfYear", e.getFieldName()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26047);assertEquals(new Integer(500), e.getIllegalNumberValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26048);assertEquals(null, e.getIllegalStringValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26049);assertEquals("500", e.getIllegalValueAsString()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26050);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26051);assertEquals(new Integer(12), e.getUpperBound()); 
     } 
     __CLR4_4_1jykjyklc8axdv8.R.inc(26052);try { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26053);new YearMonthDay(1970, 2, 30); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26054);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26055);assertEquals(DateTimeFieldType.dayOfMonth(), e.getDateTimeFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26056);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26057);assertEquals("dayOfMonth", e.getFieldName()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26058);assertEquals(new Integer(30), e.getIllegalNumberValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26059);assertEquals(null, e.getIllegalStringValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26060);assertEquals("30", e.getIllegalValueAsString()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26061);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26062);assertEquals(new Integer(28), e.getUpperBound()); 
     } 
 }finally{__CLR4_4_1jykjyklc8axdv8.R.flushNeeded();}} 


public void testGJCutover1732() {__CLR4_4_1jykjyklc8axdv8.R.globalSliceStart(getClass().getName(),26063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_157ul4dk3z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jykjyklc8axdv8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jykjyklc8axdv8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testGJCutover1732",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_157ul4dk3z(){try{__CLR4_4_1jykjyklc8axdv8.R.inc(26063); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(26064);DateTime dt = new DateTime("1582-10-04", GJChronology.getInstanceUTC()); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(26065);try { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26066);dt.dayOfMonth().setCopy(5); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26067);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26068);assertEquals(DateTimeFieldType.dayOfMonth(), e.getDateTimeFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26069);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26070);assertEquals("dayOfMonth", e.getFieldName()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26071);assertEquals(new Integer(5), e.getIllegalNumberValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26072);assertEquals(null, e.getIllegalStringValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26073);assertEquals("5", e.getIllegalValueAsString()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26074);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26075);assertEquals(null, e.getUpperBound()); 
     } 
     __CLR4_4_1jykjyklc8axdv8.R.inc(26076);dt = new DateTime("1582-10-15", GJChronology.getInstanceUTC()); 
     __CLR4_4_1jykjyklc8axdv8.R.inc(26077);try { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26078);dt.dayOfMonth().setCopy(14); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26079);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26080);assertEquals(DateTimeFieldType.dayOfMonth(), e.getDateTimeFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26081);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26082);assertEquals("dayOfMonth", e.getFieldName()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26083);assertEquals(new Integer(14), e.getIllegalNumberValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26084);assertEquals(null, e.getIllegalStringValue()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26085);assertEquals("14", e.getIllegalValueAsString()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26086);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jykjyklc8axdv8.R.inc(26087);assertEquals(null, e.getUpperBound()); 
     } 
 }finally{__CLR4_4_1jykjyklc8axdv8.R.flushNeeded();}} 

    

    

    

    

    

    

    

    // Test extra constructors not currently called by anything
    
}
