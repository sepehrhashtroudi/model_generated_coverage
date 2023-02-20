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
public class TestIllegalFieldValueException extends TestCase {static class __CLR4_4_1jh2jh2le6qseuz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,25411,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) {try{__CLR4_4_1jh2jh2le6qseuz.R.inc(25238);
        __CLR4_4_1jh2jh2le6qseuz.R.inc(25239);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jh2jh2le6qseuz.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jh2jh2le6qseuz.R.inc(25240);
        __CLR4_4_1jh2jh2le6qseuz.R.inc(25241);return new TestSuite(TestIllegalFieldValueException.class);
    }finally{__CLR4_4_1jh2jh2le6qseuz.R.flushNeeded();}}

    public TestIllegalFieldValueException(String name) {
        super(name);__CLR4_4_1jh2jh2le6qseuz.R.inc(25243);try{__CLR4_4_1jh2jh2le6qseuz.R.inc(25242);
    }finally{__CLR4_4_1jh2jh2le6qseuz.R.flushNeeded();}}


public void testGJCutover108() {__CLR4_4_1jh2jh2le6qseuz.R.globalSliceStart(getClass().getName(),25244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wliqwxjh8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jh2jh2le6qseuz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jh2jh2le6qseuz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testGJCutover108",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25244,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wliqwxjh8(){try{__CLR4_4_1jh2jh2le6qseuz.R.inc(25244); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25245);DateTime dt = new DateTime("1582-10-04", GJChronology.getInstanceUTC()); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25246);try { 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25247);dt.dayOfMonth().setCopy(5); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25248);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25249);assertEquals(DateTimeFieldType.dayOfMonth(), e.getDateTimeFieldType()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25250);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25251);assertEquals("dayOfMonth", e.getFieldName()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25252);assertEquals(new Integer(5), e.getIllegalNumberValue()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25253);assertEquals(null, e.getIllegalStringValue()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25254);assertEquals("5", e.getIllegalValueAsString()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25255);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25256);assertEquals(null, e.getUpperBound()); 
     } 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25257);dt = new DateTime("1582-10-15", GJChronology.getInstanceUTC()); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25258);try { 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25259);dt.dayOfMonth().setCopy(14); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25260);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25261);assertEquals(DateTimeFieldType.dayOfMonth(), e.getDateTimeFieldType()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25262);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25263);assertEquals("dayOfMonth", e.getFieldName()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25264);assertEquals(new Integer(14), e.getIllegalNumberValue()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25265);assertEquals(null, e.getIllegalStringValue()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25266);assertEquals("14", e.getIllegalValueAsString()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25267);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25268);assertEquals(null, e.getUpperBound()); 
     } 
 }finally{__CLR4_4_1jh2jh2le6qseuz.R.flushNeeded();}} 


public void testVerifyValueBounds427() {__CLR4_4_1jh2jh2le6qseuz.R.globalSliceStart(getClass().getName(),25269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k84r7fjhx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jh2jh2le6qseuz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jh2jh2le6qseuz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testVerifyValueBounds427",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25269,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k84r7fjhx(){try{__CLR4_4_1jh2jh2le6qseuz.R.inc(25269); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25270);try { 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25271);FieldUtils.verifyValueBounds(ISOChronology.getInstance().monthOfYear(), -5, 1, 31); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25272);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25273);assertEquals(DateTimeFieldType.monthOfYear(), e.getDateTimeFieldType()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25274);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25275);assertEquals("monthOfYear", e.getFieldName()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25276);assertEquals(new Integer(-5), e.getIllegalNumberValue()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25277);assertEquals(null, e.getIllegalStringValue()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25278);assertEquals("-5", e.getIllegalValueAsString()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25279);assertEquals(new Integer(1), e.getLowerBound()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25280);assertEquals(new Integer(31), e.getUpperBound()); 
     } 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25281);try { 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25282);FieldUtils.verifyValueBounds(DateTimeFieldType.hourOfDay(), 27, 0, 23); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25283);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25284);assertEquals(DateTimeFieldType.hourOfDay(), e.getDateTimeFieldType()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25285);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25286);assertEquals("hourOfDay", e.getFieldName()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25287);assertEquals(new Integer(27), e.getIllegalNumberValue()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25288);assertEquals(null, e.getIllegalStringValue()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25289);assertEquals("27", e.getIllegalValueAsString()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25290);assertEquals(new Integer(0), e.getLowerBound()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25291);assertEquals(new Integer(23), e.getUpperBound()); 
     } 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25292);try { 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25293);FieldUtils.verifyValueBounds("foo", 1, 2, 3); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25294);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25295);assertEquals(null, e.getDateTimeFieldType()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25296);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25297);assertEquals("foo", e.getFieldName()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25298);assertEquals(new Integer(1), e.getIllegalNumberValue()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25299);assertEquals(null, e.getIllegalStringValue()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25300);assertEquals("1", e.getIllegalValueAsString()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25301);assertEquals(new Integer(2), e.getLowerBound()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25302);assertEquals(new Integer(3), e.getUpperBound()); 
     } 
 }finally{__CLR4_4_1jh2jh2le6qseuz.R.flushNeeded();}} 


public void testSetText745() {__CLR4_4_1jh2jh2le6qseuz.R.globalSliceStart(getClass().getName(),25303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eo7coyjiv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jh2jh2le6qseuz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jh2jh2le6qseuz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testSetText745",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25303,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eo7coyjiv(){try{__CLR4_4_1jh2jh2le6qseuz.R.inc(25303); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25304);try { 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25305);ISOChronology.getInstanceUTC().year().set(0, null, java.util.Locale.US); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25306);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25307);assertEquals(DateTimeFieldType.year(), e.getDateTimeFieldType()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25308);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25309);assertEquals("year", e.getFieldName()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25310);assertEquals(null, e.getIllegalNumberValue()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25311);assertEquals(null, e.getIllegalStringValue()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25312);assertEquals("null", e.getIllegalValueAsString()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25313);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25314);assertEquals(null, e.getUpperBound()); 
     } 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25315);try { 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25316);ISOChronology.getInstanceUTC().year().set(0, "nineteen seventy", java.util.Locale.US); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25317);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25318);assertEquals(DateTimeFieldType.year(), e.getDateTimeFieldType()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25319);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25320);assertEquals("year", e.getFieldName()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25321);assertEquals(null, e.getIllegalNumberValue()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25322);assertEquals("nineteen seventy", e.getIllegalStringValue()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25323);assertEquals("nineteen seventy", e.getIllegalValueAsString()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25324);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25325);assertEquals(null, e.getUpperBound()); 
     } 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25326);try { 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25327);ISOChronology.getInstanceUTC().era().set(0, "long ago", java.util.Locale.US); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25328);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25329);assertEquals(DateTimeFieldType.era(), e.getDateTimeFieldType()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25330);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25331);assertEquals("era", e.getFieldName()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25332);assertEquals(null, e.getIllegalNumberValue()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25333);assertEquals("long ago", e.getIllegalStringValue()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25334);assertEquals("long ago", e.getIllegalValueAsString()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25335);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25336);assertEquals(null, e.getUpperBound()); 
     } 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25337);try { 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25338);ISOChronology.getInstanceUTC().monthOfYear().set(0, "spring", java.util.Locale.US); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25339);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25340);assertEquals(DateTimeFieldType.monthOfYear(), e.getDateTimeFieldType()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25341);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25342);assertEquals("monthOfYear", e.getFieldName()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25343);assertEquals(null, e.getIllegalNumberValue()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25344);assertEquals("spring", e.getIllegalStringValue()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25345);assertEquals("spring", e.getIllegalValueAsString()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25346);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25347);assertEquals(null, e.getUpperBound()); 
     } 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25348);try { 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25349);ISOChronology.getInstanceUTC().dayOfWeek().set(0, "yesterday", java.util.Locale.US); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25350);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25351);assertEquals(DateTimeFieldType.dayOfWeek(), e.getDateTimeFieldType()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25352);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25353);assertEquals("dayOfWeek", e.getFieldName()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25354);assertEquals(null, e.getIllegalNumberValue()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25355);assertEquals("yesterday", e.getIllegalStringValue()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25356);assertEquals("yesterday", e.getIllegalValueAsString()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25357);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25358);assertEquals(null, e.getUpperBound()); 
     } 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25359);try { 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25360);ISOChronology.getInstanceUTC().halfdayOfDay().set(0, "morning", java.util.Locale.US); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25361);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25362);assertEquals(DateTimeFieldType.halfdayOfDay(), e.getDateTimeFieldType()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25363);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25364);assertEquals("halfdayOfDay", e.getFieldName()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25365);assertEquals(null, e.getIllegalNumberValue()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25366);assertEquals("morning", e.getIllegalStringValue()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25367);assertEquals("morning", e.getIllegalValueAsString()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25368);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25369);assertEquals(null, e.getUpperBound()); 
     } 
 }finally{__CLR4_4_1jh2jh2le6qseuz.R.flushNeeded();}} 


public void testSkipDateTimeField940() {__CLR4_4_1jh2jh2le6qseuz.R.globalSliceStart(getClass().getName(),25370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u2kv2qjkq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jh2jh2le6qseuz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jh2jh2le6qseuz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testSkipDateTimeField940",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25370,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u2kv2qjkq(){try{__CLR4_4_1jh2jh2le6qseuz.R.inc(25370); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25371);DateTimeField field = new SkipDateTimeField(ISOChronology.getInstanceUTC(), ISOChronology.getInstanceUTC().year(), 1970); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25372);try { 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25373);field.set(0, 1970); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25374);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25375);assertEquals(DateTimeFieldType.year(), e.getDateTimeFieldType()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25376);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25377);assertEquals("year", e.getFieldName()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25378);assertEquals(new Integer(1970), e.getIllegalNumberValue()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25379);assertEquals(null, e.getIllegalStringValue()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25380);assertEquals("1970", e.getIllegalValueAsString()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25381);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jh2jh2le6qseuz.R.inc(25382);assertEquals(null, e.getUpperBound()); 
     } 
 }finally{__CLR4_4_1jh2jh2le6qseuz.R.flushNeeded();}} 


public void testOtherConstructors941() {__CLR4_4_1jh2jh2le6qseuz.R.globalSliceStart(getClass().getName(),25383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f76fpijl3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jh2jh2le6qseuz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jh2jh2le6qseuz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testOtherConstructors941",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f76fpijl3(){try{__CLR4_4_1jh2jh2le6qseuz.R.inc(25383); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25384);IllegalFieldValueException e = new IllegalFieldValueException(DurationFieldType.days(), new Integer(1), new Integer(2), new Integer(3)); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25385);assertEquals(null, e.getDateTimeFieldType()); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25386);assertEquals(DurationFieldType.days(), e.getDurationFieldType()); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25387);assertEquals("days", e.getFieldName()); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25388);assertEquals(new Integer(1), e.getIllegalNumberValue()); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25389);assertEquals(null, e.getIllegalStringValue()); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25390);assertEquals("1", e.getIllegalValueAsString()); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25391);assertEquals(new Integer(2), e.getLowerBound()); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25392);assertEquals(new Integer(3), e.getUpperBound()); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25393);e = new IllegalFieldValueException(DurationFieldType.months(), "five"); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25394);assertEquals(null, e.getDateTimeFieldType()); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25395);assertEquals(DurationFieldType.months(), e.getDurationFieldType()); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25396);assertEquals("months", e.getFieldName()); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25397);assertEquals(null, e.getIllegalNumberValue()); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25398);assertEquals("five", e.getIllegalStringValue()); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25399);assertEquals("five", e.getIllegalValueAsString()); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25400);assertEquals(null, e.getLowerBound()); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25401);assertEquals(null, e.getUpperBound()); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25402);e = new IllegalFieldValueException("months", "five"); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25403);assertEquals(null, e.getDateTimeFieldType()); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25404);assertEquals(null, e.getDurationFieldType()); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25405);assertEquals("months", e.getFieldName()); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25406);assertEquals(null, e.getIllegalNumberValue()); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25407);assertEquals("five", e.getIllegalStringValue()); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25408);assertEquals("five", e.getIllegalValueAsString()); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25409);assertEquals(null, e.getLowerBound()); 
     __CLR4_4_1jh2jh2le6qseuz.R.inc(25410);assertEquals(null, e.getUpperBound()); 
 }finally{__CLR4_4_1jh2jh2le6qseuz.R.flushNeeded();}} 

    

    

    

    

    

    

    

    // Test extra constructors not currently called by anything
    
}
