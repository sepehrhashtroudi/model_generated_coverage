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
public class TestIllegalFieldValueException extends TestCase {static class __CLR4_4_1jhnjhnle6rckuy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,25441,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) {try{__CLR4_4_1jhnjhnle6rckuy.R.inc(25259);
        __CLR4_4_1jhnjhnle6rckuy.R.inc(25260);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jhnjhnle6rckuy.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jhnjhnle6rckuy.R.inc(25261);
        __CLR4_4_1jhnjhnle6rckuy.R.inc(25262);return new TestSuite(TestIllegalFieldValueException.class);
    }finally{__CLR4_4_1jhnjhnle6rckuy.R.flushNeeded();}}

    public TestIllegalFieldValueException(String name) {
        super(name);__CLR4_4_1jhnjhnle6rckuy.R.inc(25264);try{__CLR4_4_1jhnjhnle6rckuy.R.inc(25263);
    }finally{__CLR4_4_1jhnjhnle6rckuy.R.flushNeeded();}}


public void testVerifyValueBounds462() {__CLR4_4_1jhnjhnle6rckuy.R.globalSliceStart(getClass().getName(),25265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bd6z18jht();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jhnjhnle6rckuy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jhnjhnle6rckuy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testVerifyValueBounds462",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bd6z18jht(){try{__CLR4_4_1jhnjhnle6rckuy.R.inc(25265); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25266);try { 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25267);FieldUtils.verifyValueBounds(ISOChronology.getInstance().monthOfYear(), -5, 1, 31); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25268);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25269);assertEquals(DateTimeFieldType.monthOfYear(), e.getDateTimeFieldType()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25270);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25271);assertEquals("monthOfYear", e.getFieldName()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25272);assertEquals(new Integer(-5), e.getIllegalNumberValue()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25273);assertEquals(null, e.getIllegalStringValue()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25274);assertEquals("-5", e.getIllegalValueAsString()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25275);assertEquals(new Integer(1), e.getLowerBound()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25276);assertEquals(new Integer(31), e.getUpperBound()); 
     } 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25277);try { 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25278);FieldUtils.verifyValueBounds(DateTimeFieldType.hourOfDay(), 27, 0, 23); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25279);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25280);assertEquals(DateTimeFieldType.hourOfDay(), e.getDateTimeFieldType()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25281);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25282);assertEquals("hourOfDay", e.getFieldName()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25283);assertEquals(new Integer(27), e.getIllegalNumberValue()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25284);assertEquals(null, e.getIllegalStringValue()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25285);assertEquals("27", e.getIllegalValueAsString()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25286);assertEquals(new Integer(0), e.getLowerBound()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25287);assertEquals(new Integer(23), e.getUpperBound()); 
     } 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25288);try { 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25289);FieldUtils.verifyValueBounds("foo", 1, 2, 3); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25290);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25291);assertEquals(null, e.getDateTimeFieldType()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25292);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25293);assertEquals("foo", e.getFieldName()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25294);assertEquals(new Integer(1), e.getIllegalNumberValue()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25295);assertEquals(null, e.getIllegalStringValue()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25296);assertEquals("1", e.getIllegalValueAsString()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25297);assertEquals(new Integer(2), e.getLowerBound()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25298);assertEquals(new Integer(3), e.getUpperBound()); 
     } 
 }finally{__CLR4_4_1jhnjhnle6rckuy.R.flushNeeded();}} 


public void testSetText757() {__CLR4_4_1jhnjhnle6rckuy.R.globalSliceStart(getClass().getName(),25299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k51v5pjir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jhnjhnle6rckuy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jhnjhnle6rckuy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testSetText757",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k51v5pjir(){try{__CLR4_4_1jhnjhnle6rckuy.R.inc(25299); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25300);try { 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25301);ISOChronology.getInstanceUTC().year().set(0, null, java.util.Locale.US); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25302);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25303);assertEquals(DateTimeFieldType.year(), e.getDateTimeFieldType()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25304);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25305);assertEquals("year", e.getFieldName()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25306);assertEquals(null, e.getIllegalNumberValue()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25307);assertEquals(null, e.getIllegalStringValue()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25308);assertEquals("null", e.getIllegalValueAsString()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25309);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25310);assertEquals(null, e.getUpperBound()); 
     } 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25311);try { 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25312);ISOChronology.getInstanceUTC().year().set(0, "nineteen seventy", java.util.Locale.US); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25313);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25314);assertEquals(DateTimeFieldType.year(), e.getDateTimeFieldType()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25315);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25316);assertEquals("year", e.getFieldName()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25317);assertEquals(null, e.getIllegalNumberValue()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25318);assertEquals("nineteen seventy", e.getIllegalStringValue()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25319);assertEquals("nineteen seventy", e.getIllegalValueAsString()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25320);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25321);assertEquals(null, e.getUpperBound()); 
     } 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25322);try { 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25323);ISOChronology.getInstanceUTC().era().set(0, "long ago", java.util.Locale.US); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25324);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25325);assertEquals(DateTimeFieldType.era(), e.getDateTimeFieldType()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25326);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25327);assertEquals("era", e.getFieldName()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25328);assertEquals(null, e.getIllegalNumberValue()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25329);assertEquals("long ago", e.getIllegalStringValue()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25330);assertEquals("long ago", e.getIllegalValueAsString()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25331);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25332);assertEquals(null, e.getUpperBound()); 
     } 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25333);try { 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25334);ISOChronology.getInstanceUTC().monthOfYear().set(0, "spring", java.util.Locale.US); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25335);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25336);assertEquals(DateTimeFieldType.monthOfYear(), e.getDateTimeFieldType()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25337);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25338);assertEquals("monthOfYear", e.getFieldName()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25339);assertEquals(null, e.getIllegalNumberValue()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25340);assertEquals("spring", e.getIllegalStringValue()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25341);assertEquals("spring", e.getIllegalValueAsString()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25342);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25343);assertEquals(null, e.getUpperBound()); 
     } 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25344);try { 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25345);ISOChronology.getInstanceUTC().dayOfWeek().set(0, "yesterday", java.util.Locale.US); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25346);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25347);assertEquals(DateTimeFieldType.dayOfWeek(), e.getDateTimeFieldType()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25348);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25349);assertEquals("dayOfWeek", e.getFieldName()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25350);assertEquals(null, e.getIllegalNumberValue()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25351);assertEquals("yesterday", e.getIllegalStringValue()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25352);assertEquals("yesterday", e.getIllegalValueAsString()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25353);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25354);assertEquals(null, e.getUpperBound()); 
     } 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25355);try { 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25356);ISOChronology.getInstanceUTC().halfdayOfDay().set(0, "morning", java.util.Locale.US); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25357);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25358);assertEquals(DateTimeFieldType.halfdayOfDay(), e.getDateTimeFieldType()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25359);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25360);assertEquals("halfdayOfDay", e.getFieldName()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25361);assertEquals(null, e.getIllegalNumberValue()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25362);assertEquals("morning", e.getIllegalStringValue()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25363);assertEquals("morning", e.getIllegalValueAsString()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25364);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25365);assertEquals(null, e.getUpperBound()); 
     } 
 }finally{__CLR4_4_1jhnjhnle6rckuy.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testReadablePartialValidate943() {__CLR4_4_1jhnjhnle6rckuy.R.globalSliceStart(getClass().getName(),25366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jy47eyjkm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jhnjhnle6rckuy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jhnjhnle6rckuy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testReadablePartialValidate943",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jy47eyjkm(){try{__CLR4_4_1jhnjhnle6rckuy.R.inc(25366); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25367);try { 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25368);new YearMonthDay(1970, -5, 1); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25369);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25370);assertEquals(DateTimeFieldType.monthOfYear(), e.getDateTimeFieldType()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25371);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25372);assertEquals("monthOfYear", e.getFieldName()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25373);assertEquals(new Integer(-5), e.getIllegalNumberValue()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25374);assertEquals(null, e.getIllegalStringValue()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25375);assertEquals("-5", e.getIllegalValueAsString()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25376);assertEquals(new Integer(1), e.getLowerBound()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25377);assertEquals(null, e.getUpperBound()); 
     } 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25378);try { 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25379);new YearMonthDay(1970, 500, 1); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25380);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25381);assertEquals(DateTimeFieldType.monthOfYear(), e.getDateTimeFieldType()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25382);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25383);assertEquals("monthOfYear", e.getFieldName()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25384);assertEquals(new Integer(500), e.getIllegalNumberValue()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25385);assertEquals(null, e.getIllegalStringValue()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25386);assertEquals("500", e.getIllegalValueAsString()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25387);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25388);assertEquals(new Integer(12), e.getUpperBound()); 
     } 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25389);try { 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25390);new YearMonthDay(1970, 2, 30); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25391);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25392);assertEquals(DateTimeFieldType.dayOfMonth(), e.getDateTimeFieldType()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25393);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25394);assertEquals("dayOfMonth", e.getFieldName()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25395);assertEquals(new Integer(30), e.getIllegalNumberValue()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25396);assertEquals(null, e.getIllegalStringValue()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25397);assertEquals("30", e.getIllegalValueAsString()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25398);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25399);assertEquals(new Integer(28), e.getUpperBound()); 
     } 
 }finally{__CLR4_4_1jhnjhnle6rckuy.R.flushNeeded();}} 


public void testZoneTransition944() {__CLR4_4_1jhnjhnle6rckuy.R.globalSliceStart(getClass().getName(),25400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ufjcc3jlk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jhnjhnle6rckuy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jhnjhnle6rckuy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testZoneTransition944",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25400,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ufjcc3jlk(){try{__CLR4_4_1jhnjhnle6rckuy.R.inc(25400); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25401);DateTime dt = new DateTime(2005, 4, 3, 1, 0, 0, 0, DateTimeZone.forID("America/Los_Angeles")); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25402);try { 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25403);dt.hourOfDay().setCopy(2); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25404);fail(); 
     } catch (IllegalFieldValueException e) { 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25405);assertEquals(DateTimeFieldType.hourOfDay(), e.getDateTimeFieldType()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25406);assertEquals(null, e.getDurationFieldType()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25407);assertEquals("hourOfDay", e.getFieldName()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25408);assertEquals(new Integer(2), e.getIllegalNumberValue()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25409);assertEquals(null, e.getIllegalStringValue()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25410);assertEquals("2", e.getIllegalValueAsString()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25411);assertEquals(null, e.getLowerBound()); 
         __CLR4_4_1jhnjhnle6rckuy.R.inc(25412);assertEquals(null, e.getUpperBound()); 
     } 
 }finally{__CLR4_4_1jhnjhnle6rckuy.R.flushNeeded();}} 


public void testOtherConstructors945() {__CLR4_4_1jhnjhnle6rckuy.R.globalSliceStart(getClass().getName(),25413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s76avejlx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jhnjhnle6rckuy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jhnjhnle6rckuy.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testOtherConstructors945",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25413,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s76avejlx(){try{__CLR4_4_1jhnjhnle6rckuy.R.inc(25413); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25414);IllegalFieldValueException e = new IllegalFieldValueException(DurationFieldType.days(), new Integer(1), new Integer(2), new Integer(3)); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25415);assertEquals(null, e.getDateTimeFieldType()); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25416);assertEquals(DurationFieldType.days(), e.getDurationFieldType()); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25417);assertEquals("days", e.getFieldName()); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25418);assertEquals(new Integer(1), e.getIllegalNumberValue()); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25419);assertEquals(null, e.getIllegalStringValue()); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25420);assertEquals("1", e.getIllegalValueAsString()); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25421);assertEquals(new Integer(2), e.getLowerBound()); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25422);assertEquals(new Integer(3), e.getUpperBound()); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25423);e = new IllegalFieldValueException(DurationFieldType.months(), "five"); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25424);assertEquals(null, e.getDateTimeFieldType()); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25425);assertEquals(DurationFieldType.months(), e.getDurationFieldType()); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25426);assertEquals("months", e.getFieldName()); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25427);assertEquals(null, e.getIllegalNumberValue()); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25428);assertEquals("five", e.getIllegalStringValue()); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25429);assertEquals("five", e.getIllegalValueAsString()); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25430);assertEquals(null, e.getLowerBound()); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25431);assertEquals(null, e.getUpperBound()); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25432);e = new IllegalFieldValueException("months", "five"); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25433);assertEquals(null, e.getDateTimeFieldType()); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25434);assertEquals(null, e.getDurationFieldType()); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25435);assertEquals("months", e.getFieldName()); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25436);assertEquals(null, e.getIllegalNumberValue()); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25437);assertEquals("five", e.getIllegalStringValue()); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25438);assertEquals("five", e.getIllegalValueAsString()); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25439);assertEquals(null, e.getLowerBound()); 
     __CLR4_4_1jhnjhnle6rckuy.R.inc(25440);assertEquals(null, e.getUpperBound()); 
 }finally{__CLR4_4_1jhnjhnle6rckuy.R.flushNeeded();}} 

    

    

    

    

    

    

    

    // Test extra constructors not currently called by anything
    
}
