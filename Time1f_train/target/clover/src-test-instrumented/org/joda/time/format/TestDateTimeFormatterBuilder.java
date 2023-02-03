/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2011 Stephen Colebourne
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
package org.joda.time.format;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;

/**
 * This class is a Junit unit test for DateTimeFormatterBuilder.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 */
public class TestDateTimeFormatterBuilder extends TestCase {static class __CLR4_4_1v0vv0vlc8axf2s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,40390,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    private static final DateTimeZone LOS_ANGELES = DateTimeZone.forID("America/Los_Angeles");

    public static void main(String[] args) {try{__CLR4_4_1v0vv0vlc8axf2s.R.inc(40207);
        __CLR4_4_1v0vv0vlc8axf2s.R.inc(40208);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1v0vv0vlc8axf2s.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1v0vv0vlc8axf2s.R.inc(40209);
        __CLR4_4_1v0vv0vlc8axf2s.R.inc(40210);return new TestSuite(TestDateTimeFormatterBuilder.class);
    }finally{__CLR4_4_1v0vv0vlc8axf2s.R.flushNeeded();}}

    public TestDateTimeFormatterBuilder(String name) {
        super(name);__CLR4_4_1v0vv0vlc8axf2s.R.inc(40212);try{__CLR4_4_1v0vv0vlc8axf2s.R.inc(40211);
    }finally{__CLR4_4_1v0vv0vlc8axf2s.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1v0vv0vlc8axf2s.R.inc(40213);
    }finally{__CLR4_4_1v0vv0vlc8axf2s.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1v0vv0vlc8axf2s.R.inc(40214);
    }finally{__CLR4_4_1v0vv0vlc8axf2s.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_parseWrongOffset6() {__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceStart(getClass().getName(),40215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18suk71v13();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0vv0vlc8axf2s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_parseWrongOffset6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40215,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18suk71v13(){try{__CLR4_4_1v0vv0vlc8axf2s.R.inc(40215); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40216);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40217);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40218);DateTime expected = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forOffsetHours(7)); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40219);assertEquals(expected.withZone(TOKYO), f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +07:00")); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40220);assertEquals(expected, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +07:00")); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40221);assertEquals(expected.withZone(DateTimeZone.getDefault()), f.parseDateTime("2007-03-04 12:30 +07:00")); 
 }finally{__CLR4_4_1v0vv0vlc8axf2s.R.flushNeeded();}} 


public void test_printParseOffset49() {__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceStart(getClass().getName(),40222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nx9a6mv1a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0vv0vlc8axf2s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseOffset49",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40222,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nx9a6mv1a(){try{__CLR4_4_1v0vv0vlc8axf2s.R.inc(40222); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40223);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40224);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40225);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40226);assertEquals("2007-03-04 12:30 +09:00", f.print(dt)); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40227);assertEquals(dt.withZone(DateTimeZone.getDefault()), f.parseDateTime("2007-03-04 12:30 +09:00")); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40228);assertEquals(dt, f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +09:00")); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40229);assertEquals(dt.withZone(DateTimeZone.forOffsetHours(9)), f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +09:00")); 
 }finally{__CLR4_4_1v0vv0vlc8axf2s.R.flushNeeded();}} 


public void test_appendFixedDecimal158() {__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceStart(getClass().getName(),40230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eez089v1i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0vv0vlc8axf2s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendFixedDecimal158",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eez089v1i(){try{__CLR4_4_1v0vv0vlc8axf2s.R.inc(40230); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40231);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40232);bld.appendFixedDecimal(DateTimeFieldType.year(), 4); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40233);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40234);assertEquals("2007", f.print(new DateTime("2007-01-01"))); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40235);assertEquals("0123", f.print(new DateTime("123-01-01"))); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40236);assertEquals("0001", f.print(new DateTime("1-2-3"))); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40237);assertEquals("99999", f.print(new DateTime("99999-2-3"))); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40238);assertEquals("-0099", f.print(new DateTime("-99-2-3"))); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40239);assertEquals("0000", f.print(new DateTime("0-2-3"))); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40240);assertEquals(2001, f.parseDateTime("2001").getYear()); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40241);try { 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40242);f.parseDateTime("-2001"); 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40243);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40244);try { 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40245);f.parseDateTime("200"); 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40246);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40247);try { 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40248);f.parseDateTime("20016"); 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40249);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40250);bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40251);bld.appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40252);bld.appendLiteral(':'); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40253);bld.appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40254);bld.appendLiteral(':'); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40255);bld.appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40256);f = bld.toFormatter(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40257);assertEquals("01:02:34", f.print(new DateTime("T1:2:34"))); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40258);DateTime dt = f.parseDateTime("01:02:34"); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40259);assertEquals(1, dt.getHourOfDay()); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40260);assertEquals(2, dt.getMinuteOfHour()); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40261);assertEquals(34, dt.getSecondOfMinute()); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40262);try { 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40263);f.parseDateTime("0145:02:34"); 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40264);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40265);try { 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40266);f.parseDateTime("01:0:34"); 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40267);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
 }finally{__CLR4_4_1v0vv0vlc8axf2s.R.flushNeeded();}} 


public void test_append_Formatter200() {__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceStart(getClass().getName(),40268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1inypztv2k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0vv0vlc8axf2s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Formatter200",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40268,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1inypztv2k(){try{__CLR4_4_1v0vv0vlc8axf2s.R.inc(40268); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40269);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40270);bld.appendLiteral('Y'); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40271);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40272);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40273);bld2.appendLiteral('X'); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40274);bld2.append(f); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40275);bld2.appendLiteral('Z'); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40276);assertEquals("XYZ", bld2.toFormatter().print(0L)); 
 }finally{__CLR4_4_1v0vv0vlc8axf2s.R.flushNeeded();}} 


public void test_appendFixedSignedDecimal267() {__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceStart(getClass().getName(),40277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19jg1dav2t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0vv0vlc8axf2s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendFixedSignedDecimal267",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40277,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19jg1dav2t(){try{__CLR4_4_1v0vv0vlc8axf2s.R.inc(40277); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40278);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40279);bld.appendFixedSignedDecimal(DateTimeFieldType.year(), 4); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40280);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40281);assertEquals("2007", f.print(new DateTime("2007-01-01"))); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40282);assertEquals("0123", f.print(new DateTime("123-01-01"))); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40283);assertEquals("0001", f.print(new DateTime("1-2-3"))); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40284);assertEquals("99999", f.print(new DateTime("99999-2-3"))); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40285);assertEquals("-0099", f.print(new DateTime("-99-2-3"))); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40286);assertEquals("0000", f.print(new DateTime("0-2-3"))); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40287);assertEquals(2001, f.parseDateTime("2001").getYear()); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40288);assertEquals(-2001, f.parseDateTime("-2001").getYear()); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40289);assertEquals(2001, f.parseDateTime("+2001").getYear()); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40290);try { 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40291);f.parseDateTime("20016"); 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40292);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
 }finally{__CLR4_4_1v0vv0vlc8axf2s.R.flushNeeded();}} 


public void test_printParseZoneParis471() {__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceStart(getClass().getName(),40293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fetaspv39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0vv0vlc8axf2s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneParis471",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fetaspv39(){try{__CLR4_4_1v0vv0vlc8axf2s.R.inc(40293); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40294);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40295);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40296);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, PARIS); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40297);assertEquals("2007-03-04 12:30 Europe/Paris", f.print(dt)); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40298);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 Europe/Paris")); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40299);assertEquals(dt, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 Europe/Paris")); 
 }finally{__CLR4_4_1v0vv0vlc8axf2s.R.flushNeeded();}} 


public void test_append_nullPrinter_Parser497() {__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceStart(getClass().getName(),40300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fz19xyv3g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0vv0vlc8axf2s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_nullPrinter_Parser497",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40300,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fz19xyv3g(){try{__CLR4_4_1v0vv0vlc8axf2s.R.inc(40300); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40301);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40302);bld.appendLiteral('Y'); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40303);DateTimeParser p = bld.toParser(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40304);try { 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40305);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40306);bld2.append((DateTimePrinter) null, p); 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40307);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1v0vv0vlc8axf2s.R.flushNeeded();}} 


public void test_canBuildFormatter584() {__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceStart(getClass().getName(),40308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g8c849v3o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0vv0vlc8axf2s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_canBuildFormatter584",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40308,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g8c849v3o(){try{__CLR4_4_1v0vv0vlc8axf2s.R.inc(40308); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40309);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40310);assertEquals(false, bld.canBuildFormatter()); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40311);bld.appendLiteral('X'); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40312);assertEquals(true, bld.canBuildFormatter()); 
 }finally{__CLR4_4_1v0vv0vlc8axf2s.R.flushNeeded();}} 


public void test_canBuildPrinter641() {__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceStart(getClass().getName(),40313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ay3qlxv3t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0vv0vlc8axf2s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_canBuildPrinter641",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40313,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ay3qlxv3t(){try{__CLR4_4_1v0vv0vlc8axf2s.R.inc(40313); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40314);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40315);assertEquals(false, bld.canBuildPrinter()); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40316);bld.appendLiteral('X'); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40317);assertEquals(true, bld.canBuildPrinter()); 
 }finally{__CLR4_4_1v0vv0vlc8axf2s.R.flushNeeded();}} 


public void test_toFormatter699() {__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceStart(getClass().getName(),40318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18jperfv3y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0vv0vlc8axf2s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_toFormatter699",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40318,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18jperfv3y(){try{__CLR4_4_1v0vv0vlc8axf2s.R.inc(40318); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40319);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40320);try { 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40321);bld.toFormatter(); 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40322);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40323);bld.appendLiteral('X'); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40324);assertNotNull(bld.toFormatter()); 
 }finally{__CLR4_4_1v0vv0vlc8axf2s.R.flushNeeded();}} 


public void test_appendOptional_Parser810() {__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceStart(getClass().getName(),40325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nc5849v45();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0vv0vlc8axf2s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendOptional_Parser810",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40325,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nc5849v45(){try{__CLR4_4_1v0vv0vlc8axf2s.R.inc(40325); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40326);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40327);bld.appendLiteral('Y'); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40328);DateTimeParser p = bld.toParser(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40329);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40330);bld2.appendLiteral('X'); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40331);bld2.appendOptional(p); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40332);bld2.appendLiteral('Z'); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40333);DateTimeFormatter f = bld2.toFormatter(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40334);assertEquals(false, f.isPrinter()); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40335);assertEquals(true, f.isParser()); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40336);assertEquals(0, f.withZoneUTC().parseMillis("XYZ")); 
 }finally{__CLR4_4_1v0vv0vlc8axf2s.R.flushNeeded();}} 


public void test_canBuildParser959() {__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceStart(getClass().getName(),40337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y317piv4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0vv0vlc8axf2s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_canBuildParser959",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40337,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y317piv4h(){try{__CLR4_4_1v0vv0vlc8axf2s.R.inc(40337); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40338);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40339);assertEquals(false, bld.canBuildParser()); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40340);bld.appendLiteral('X'); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40341);assertEquals(true, bld.canBuildParser()); 
 }finally{__CLR4_4_1v0vv0vlc8axf2s.R.flushNeeded();}} 


public void test_append_nullParser1091() {__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceStart(getClass().getName(),40342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f5wy9wv4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0vv0vlc8axf2s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_nullParser1091",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40342,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f5wy9wv4m(){try{__CLR4_4_1v0vv0vlc8axf2s.R.inc(40342); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40343);try { 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40344);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40345);bld2.append((DateTimeParser) null); 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40346);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1v0vv0vlc8axf2s.R.flushNeeded();}} 


public void test_append_Printer_nullParser1173() {__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceStart(getClass().getName(),40347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0qu6yv4r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0vv0vlc8axf2s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Printer_nullParser1173",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0qu6yv4r(){try{__CLR4_4_1v0vv0vlc8axf2s.R.inc(40347); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40348);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40349);bld.appendLiteral('Y'); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40350);DateTimePrinter p = bld.toPrinter(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40351);try { 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40352);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40353);bld2.append(p, (DateTimeParser) null); 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40354);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1v0vv0vlc8axf2s.R.flushNeeded();}} 


public void test_parseWrongOffsetAndZone1397() {__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceStart(getClass().getName(),40355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dg32dsv4z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0vv0vlc8axf2s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_parseWrongOffsetAndZone1397",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40355,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dg32dsv4z(){try{__CLR4_4_1v0vv0vlc8axf2s.R.inc(40355); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40356);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2).appendLiteral(' ').appendTimeZoneId(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40357);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40358);DateTime expected = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forOffsetHours(7)); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40359);assertEquals(expected.withZone(TOKYO), f.parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo")); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40360);assertEquals(expected.withZone(TOKYO), f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo")); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40361);assertEquals(expected, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo")); 
 }finally{__CLR4_4_1v0vv0vlc8axf2s.R.flushNeeded();}} 


public void test_appendTimeZoneId1594() {__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceStart(getClass().getName(),40362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1votcv3v56();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0vv0vlc8axf2s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendTimeZoneId1594",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40362,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1votcv3v56(){try{__CLR4_4_1v0vv0vlc8axf2s.R.inc(40362); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40363);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40364);bld.appendTimeZoneId(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40365);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40366);assertEquals("Asia/Tokyo", f.print(new DateTime(2007, 3, 4, 0, 0, 0, TOKYO))); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40367);assertEquals(TOKYO, f.parseDateTime("Asia/Tokyo").getZone()); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40368);try { 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40369);f.parseDateTime("Nonsense"); 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40370);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
 }finally{__CLR4_4_1v0vv0vlc8axf2s.R.flushNeeded();}} 


public void test_append_Printer1687() {__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceStart(getClass().getName(),40371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1919rppv5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0vv0vlc8axf2s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Printer1687",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1919rppv5f(){try{__CLR4_4_1v0vv0vlc8axf2s.R.inc(40371); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40372);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40373);bld.appendLiteral('Y'); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40374);DateTimePrinter p = bld.toPrinter(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40375);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40376);bld2.appendLiteral('X'); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40377);bld2.append(p); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40378);bld2.appendLiteral('Z'); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40379);DateTimeFormatter f = bld2.toFormatter(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40380);assertEquals(true, f.isPrinter()); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40381);assertEquals(false, f.isParser()); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40382);assertEquals("XYZ", f.print(0L)); 
 }finally{__CLR4_4_1v0vv0vlc8axf2s.R.flushNeeded();}} 


public void test_toParser1761() {__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceStart(getClass().getName(),40383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1du2ic1v5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v0vv0vlc8axf2s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v0vv0vlc8axf2s.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_toParser1761",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1du2ic1v5r(){try{__CLR4_4_1v0vv0vlc8axf2s.R.inc(40383); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40384);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40385);try { 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40386);bld.toParser(); 
         __CLR4_4_1v0vv0vlc8axf2s.R.inc(40387);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40388);bld.appendLiteral('X'); 
     __CLR4_4_1v0vv0vlc8axf2s.R.inc(40389);assertNotNull(bld.toParser()); 
 }finally{__CLR4_4_1v0vv0vlc8axf2s.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    
// Defects4J: flaky method
//     public void test_printParseShortName() {
//         DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
//             .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneShortName();
//         DateTimeFormatter f = bld.toFormatter().withLocale(Locale.ENGLISH);
//         
//         assertEquals(true, f.isPrinter());
//         assertEquals(false, f.isParser());
//         DateTime dt1 = new DateTime(2011, 1, 4, 12, 30, 0, LONDON);
//         assertEquals("2011-01-04 12:30 GMT", f.print(dt1));
//         DateTime dt2 = new DateTime(2011, 7, 4, 12, 30, 0, LONDON);
//         assertEquals("2011-07-04 12:30 BST", f.print(dt2));
//         try {
//             f.parseDateTime("2007-03-04 12:30 GMT");
//             fail();
//         } catch (UnsupportedOperationException e) {
//         }
//     }

    
// Defects4J: flaky method
//     public void test_printParseShortNameWithLookup() {
//         Map<String, DateTimeZone> lookup = new LinkedHashMap<String, DateTimeZone>();
//         lookup.put("GMT", LONDON);
//         lookup.put("BST", LONDON);
//         DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
//             .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneShortName(lookup);
//         DateTimeFormatter f = bld.toFormatter().withLocale(Locale.ENGLISH);
//         
//         assertEquals(true, f.isPrinter());
//         assertEquals(true, f.isParser());
//         DateTime dt1 = new DateTime(2011, 1, 4, 12, 30, 0, LONDON);
//         assertEquals("2011-01-04 12:30 GMT", f.print(dt1));
//         DateTime dt2 = new DateTime(2011, 7, 4, 12, 30, 0, LONDON);
//         assertEquals("2011-07-04 12:30 BST", f.print(dt2));
//         
//         assertEquals(dt1, f.parseDateTime("2011-01-04 12:30 GMT"));
//         assertEquals(dt2, f.parseDateTime("2011-07-04 12:30 BST"));
//         try {
//             f.parseDateTime("2007-03-04 12:30 EST");
//             fail();
//         } catch (IllegalArgumentException e) {
//         }
//     }

    
// Defects4J: flaky method
//     public void test_printParseShortNameWithAutoLookup() {
//         DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
//             .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneShortName(null);
//         DateTimeFormatter f = bld.toFormatter().withLocale(Locale.ENGLISH);
//         
//         assertEquals(true, f.isPrinter());
//         assertEquals(true, f.isParser());
//         DateTime dt1 = new DateTime(2011, 1, 4, 12, 30, 0, NEW_YORK);
//         assertEquals("2011-01-04 12:30 EST", f.print(dt1));
//         DateTime dt2 = new DateTime(2011, 7, 4, 12, 30, 0, NEW_YORK);
//         assertEquals("2011-07-04 12:30 EDT", f.print(dt2));
//         DateTime dt3 = new DateTime(2011, 1, 4, 12, 30, 0, LOS_ANGELES);
//         assertEquals("2011-01-04 12:30 PST", f.print(dt3));
//         DateTime dt4 = new DateTime(2011, 7, 4, 12, 30, 0, LOS_ANGELES);
//         assertEquals("2011-07-04 12:30 PDT", f.print(dt4));
//         DateTime dt5 = new DateTime(2011, 7, 4, 12, 30, 0, DateTimeZone.UTC);
//         assertEquals("2011-07-04 12:30 UTC", f.print(dt5));
//         
//         assertEquals(dt1.getZone() + " " + f.parseDateTime("2011-01-04 12:30 EST").getZone(), dt1, f.parseDateTime("2011-01-04 12:30 EST"));
//         assertEquals(dt2, f.parseDateTime("2011-07-04 12:30 EDT"));
//         assertEquals(dt3, f.parseDateTime("2011-01-04 12:30 PST"));
//         assertEquals(dt4, f.parseDateTime("2011-07-04 12:30 PDT"));
//         assertEquals(dt5, f.parseDateTime("2011-07-04 12:30 UT"));
//         assertEquals(dt5, f.parseDateTime("2011-07-04 12:30 UTC"));
//         try {
//             f.parseDateTime("2007-03-04 12:30 PPP");
//             fail();
//         } catch (IllegalArgumentException e) {
//         }
//     }

    //-----------------------------------------------------------------------
    
// Defects4J: flaky method
//     public void test_printParseLongName() {
//         DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
//             .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneName();
//         DateTimeFormatter f = bld.toFormatter().withLocale(Locale.ENGLISH);
//         
//         assertEquals(true, f.isPrinter());
//         assertEquals(false, f.isParser());
//         DateTime dt1 = new DateTime(2011, 1, 4, 12, 30, 0, LONDON);
//         assertEquals("2011-01-04 12:30 Greenwich Mean Time", f.print(dt1));
//         DateTime dt2 = new DateTime(2011, 7, 4, 12, 30, 0, LONDON);
//         assertEquals("2011-07-04 12:30 British Summer Time", f.print(dt2));
//         try {
//             f.parseDateTime("2007-03-04 12:30 GMT");
//             fail();
//         } catch (UnsupportedOperationException e) {
//         }
//     }

    
// Defects4J: flaky method
//     public void test_printParseLongNameWithLookup() {
//         Map<String, DateTimeZone> lookup = new LinkedHashMap<String, DateTimeZone>();
//         lookup.put("Greenwich Mean Time", LONDON);
//         lookup.put("British Summer Time", LONDON);
//         DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
//             .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneName(lookup);
//         DateTimeFormatter f = bld.toFormatter().withLocale(Locale.ENGLISH);
//         
//         assertEquals(true, f.isPrinter());
//         assertEquals(true, f.isParser());
//         DateTime dt1 = new DateTime(2011, 1, 4, 12, 30, 0, LONDON);
//         assertEquals("2011-01-04 12:30 Greenwich Mean Time", f.print(dt1));
//         DateTime dt2 = new DateTime(2011, 7, 4, 12, 30, 0, LONDON);
//         assertEquals("2011-07-04 12:30 British Summer Time", f.print(dt2));
//         
//         assertEquals(dt1, f.parseDateTime("2011-01-04 12:30 Greenwich Mean Time"));
//         assertEquals(dt2, f.parseDateTime("2011-07-04 12:30 British Summer Time"));
//         try {
//             f.parseDateTime("2007-03-04 12:30 EST");
//             fail();
//         } catch (IllegalArgumentException e) {
//         }
//     }

}
