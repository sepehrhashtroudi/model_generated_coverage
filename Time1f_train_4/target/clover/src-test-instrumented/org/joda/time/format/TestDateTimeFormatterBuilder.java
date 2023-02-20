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
public class TestDateTimeFormatterBuilder extends TestCase {static class __CLR4_4_1tc8tc8le6rjdp4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,38189,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    private static final DateTimeZone LOS_ANGELES = DateTimeZone.forID("America/Los_Angeles");

    public static void main(String[] args) {try{__CLR4_4_1tc8tc8le6rjdp4.R.inc(38024);
        __CLR4_4_1tc8tc8le6rjdp4.R.inc(38025);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1tc8tc8le6rjdp4.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1tc8tc8le6rjdp4.R.inc(38026);
        __CLR4_4_1tc8tc8le6rjdp4.R.inc(38027);return new TestSuite(TestDateTimeFormatterBuilder.class);
    }finally{__CLR4_4_1tc8tc8le6rjdp4.R.flushNeeded();}}

    public TestDateTimeFormatterBuilder(String name) {
        super(name);__CLR4_4_1tc8tc8le6rjdp4.R.inc(38029);try{__CLR4_4_1tc8tc8le6rjdp4.R.inc(38028);
    }finally{__CLR4_4_1tc8tc8le6rjdp4.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1tc8tc8le6rjdp4.R.inc(38030);
    }finally{__CLR4_4_1tc8tc8le6rjdp4.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1tc8tc8le6rjdp4.R.inc(38031);
    }finally{__CLR4_4_1tc8tc8le6rjdp4.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_parseWrongOffset203() {__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceStart(getClass().getName(),38032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xdf15qtcg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tc8tc8le6rjdp4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_parseWrongOffset203",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38032,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xdf15qtcg(){try{__CLR4_4_1tc8tc8le6rjdp4.R.inc(38032); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38033);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38034);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38035);DateTime expected = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forOffsetHours(7)); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38036);assertEquals(expected.withZone(TOKYO), f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +07:00")); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38037);assertEquals(expected, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +07:00")); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38038);assertEquals(expected.withZone(DateTimeZone.getDefault()), f.parseDateTime("2007-03-04 12:30 +07:00")); 
 }finally{__CLR4_4_1tc8tc8le6rjdp4.R.flushNeeded();}} 


public void test_appendFixedDecimal412() {__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceStart(getClass().getName(),38039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h4qds8tcn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tc8tc8le6rjdp4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendFixedDecimal412",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h4qds8tcn(){try{__CLR4_4_1tc8tc8le6rjdp4.R.inc(38039); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38040);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38041);bld.appendFixedDecimal(DateTimeFieldType.year(), 4); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38042);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38043);assertEquals("2007", f.print(new DateTime("2007-01-01"))); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38044);assertEquals("0123", f.print(new DateTime("123-01-01"))); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38045);assertEquals("0001", f.print(new DateTime("1-2-3"))); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38046);assertEquals("99999", f.print(new DateTime("99999-2-3"))); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38047);assertEquals("-0099", f.print(new DateTime("-99-2-3"))); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38048);assertEquals("0000", f.print(new DateTime("0-2-3"))); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38049);assertEquals(2001, f.parseDateTime("2001").getYear()); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38050);try { 
         __CLR4_4_1tc8tc8le6rjdp4.R.inc(38051);f.parseDateTime("-2001"); 
         __CLR4_4_1tc8tc8le6rjdp4.R.inc(38052);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38053);try { 
         __CLR4_4_1tc8tc8le6rjdp4.R.inc(38054);f.parseDateTime("200"); 
         __CLR4_4_1tc8tc8le6rjdp4.R.inc(38055);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38056);try { 
         __CLR4_4_1tc8tc8le6rjdp4.R.inc(38057);f.parseDateTime("20016"); 
         __CLR4_4_1tc8tc8le6rjdp4.R.inc(38058);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38059);bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38060);bld.appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38061);bld.appendLiteral(':'); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38062);bld.appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38063);bld.appendLiteral(':'); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38064);bld.appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38065);f = bld.toFormatter(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38066);assertEquals("01:02:34", f.print(new DateTime("T1:2:34"))); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38067);DateTime dt = f.parseDateTime("01:02:34"); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38068);assertEquals(1, dt.getHourOfDay()); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38069);assertEquals(2, dt.getMinuteOfHour()); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38070);assertEquals(34, dt.getSecondOfMinute()); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38071);try { 
         __CLR4_4_1tc8tc8le6rjdp4.R.inc(38072);f.parseDateTime("0145:02:34"); 
         __CLR4_4_1tc8tc8le6rjdp4.R.inc(38073);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38074);try { 
         __CLR4_4_1tc8tc8le6rjdp4.R.inc(38075);f.parseDateTime("01:0:34"); 
         __CLR4_4_1tc8tc8le6rjdp4.R.inc(38076);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
 }finally{__CLR4_4_1tc8tc8le6rjdp4.R.flushNeeded();}} 


public void test_printParseOffset578() {__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceStart(getClass().getName(),38077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ulzoixtdp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tc8tc8le6rjdp4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseOffset578",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38077,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ulzoixtdp(){try{__CLR4_4_1tc8tc8le6rjdp4.R.inc(38077); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38078);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38079);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38080);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38081);assertEquals("2007-03-04 12:30 +09:00", f.print(dt)); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38082);assertEquals(dt.withZone(DateTimeZone.getDefault()), f.parseDateTime("2007-03-04 12:30 +09:00")); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38083);assertEquals(dt, f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +09:00")); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38084);assertEquals(dt.withZone(DateTimeZone.forOffsetHours(9)), f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +09:00")); 
 }finally{__CLR4_4_1tc8tc8le6rjdp4.R.flushNeeded();}} 


public void test_toPrinter1123() {__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceStart(getClass().getName(),38085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sshnnqtdx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tc8tc8le6rjdp4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_toPrinter1123",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38085,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sshnnqtdx(){try{__CLR4_4_1tc8tc8le6rjdp4.R.inc(38085); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38086);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38087);try { 
         __CLR4_4_1tc8tc8le6rjdp4.R.inc(38088);bld.toPrinter(); 
         __CLR4_4_1tc8tc8le6rjdp4.R.inc(38089);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38090);bld.appendLiteral('X'); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38091);assertNotNull(bld.toPrinter()); 
 }finally{__CLR4_4_1tc8tc8le6rjdp4.R.flushNeeded();}} 


public void test_append_nullPrinter_Parser1124() {__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceStart(getClass().getName(),38092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rsniuste4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tc8tc8le6rjdp4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_nullPrinter_Parser1124",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rsniuste4(){try{__CLR4_4_1tc8tc8le6rjdp4.R.inc(38092); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38093);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38094);bld.appendLiteral('Y'); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38095);DateTimeParser p = bld.toParser(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38096);try { 
         __CLR4_4_1tc8tc8le6rjdp4.R.inc(38097);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
         __CLR4_4_1tc8tc8le6rjdp4.R.inc(38098);bld2.append((DateTimePrinter) null, p); 
         __CLR4_4_1tc8tc8le6rjdp4.R.inc(38099);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1tc8tc8le6rjdp4.R.flushNeeded();}} 


public void test_toParser1125() {__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceStart(getClass().getName(),38100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5tzshtec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tc8tc8le6rjdp4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_toParser1125",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38100,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5tzshtec(){try{__CLR4_4_1tc8tc8le6rjdp4.R.inc(38100); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38101);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38102);try { 
         __CLR4_4_1tc8tc8le6rjdp4.R.inc(38103);bld.toParser(); 
         __CLR4_4_1tc8tc8le6rjdp4.R.inc(38104);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38105);bld.appendLiteral('X'); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38106);assertNotNull(bld.toParser()); 
 }finally{__CLR4_4_1tc8tc8le6rjdp4.R.flushNeeded();}} 


public void test_canBuildFormatter1126() {__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceStart(getClass().getName(),38107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_125au9itej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tc8tc8le6rjdp4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_canBuildFormatter1126",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_125au9itej(){try{__CLR4_4_1tc8tc8le6rjdp4.R.inc(38107); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38108);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38109);assertEquals(false, bld.canBuildFormatter()); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38110);bld.appendLiteral('X'); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38111);assertEquals(true, bld.canBuildFormatter()); 
 }finally{__CLR4_4_1tc8tc8le6rjdp4.R.flushNeeded();}} 


public void test_canBuildPrinter1127() {__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceStart(getClass().getName(),38112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fno4orteo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tc8tc8le6rjdp4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_canBuildPrinter1127",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fno4orteo(){try{__CLR4_4_1tc8tc8le6rjdp4.R.inc(38112); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38113);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38114);assertEquals(false, bld.canBuildPrinter()); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38115);bld.appendLiteral('X'); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38116);assertEquals(true, bld.canBuildPrinter()); 
 }finally{__CLR4_4_1tc8tc8le6rjdp4.R.flushNeeded();}} 


public void test_canBuildParser1128() {__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceStart(getClass().getName(),38117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p3re15tet();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tc8tc8le6rjdp4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_canBuildParser1128",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p3re15tet(){try{__CLR4_4_1tc8tc8le6rjdp4.R.inc(38117); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38118);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38119);assertEquals(false, bld.canBuildParser()); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38120);bld.appendLiteral('X'); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38121);assertEquals(true, bld.canBuildParser()); 
 }finally{__CLR4_4_1tc8tc8le6rjdp4.R.flushNeeded();}} 


public void test_append_Printer1129() {__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceStart(getClass().getName(),38122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a1e5owtey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tc8tc8le6rjdp4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Printer1129",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a1e5owtey(){try{__CLR4_4_1tc8tc8le6rjdp4.R.inc(38122); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38123);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38124);bld.appendLiteral('Y'); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38125);DateTimePrinter p = bld.toPrinter(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38126);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38127);bld2.appendLiteral('X'); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38128);bld2.append(p); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38129);bld2.appendLiteral('Z'); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38130);DateTimeFormatter f = bld2.toFormatter(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38131);assertEquals(true, f.isPrinter()); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38132);assertEquals(false, f.isParser()); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38133);assertEquals("XYZ", f.print(0L)); 
 }finally{__CLR4_4_1tc8tc8le6rjdp4.R.flushNeeded();}} 


public void test_append_Parser1130() {__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceStart(getClass().getName(),38134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19njh7ftfa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tc8tc8le6rjdp4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Parser1130",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38134,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19njh7ftfa(){try{__CLR4_4_1tc8tc8le6rjdp4.R.inc(38134); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38135);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38136);bld.appendLiteral('Y'); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38137);DateTimeParser p = bld.toParser(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38138);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38139);bld2.appendLiteral('X'); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38140);bld2.append(p); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38141);bld2.appendLiteral('Z'); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38142);DateTimeFormatter f = bld2.toFormatter(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38143);assertEquals(false, f.isPrinter()); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38144);assertEquals(true, f.isParser()); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38145);assertEquals(0, f.withZoneUTC().parseMillis("XYZ")); 
 }finally{__CLR4_4_1tc8tc8le6rjdp4.R.flushNeeded();}} 


public void test_append_Printer_nullParser1131() {__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceStart(getClass().getName(),38146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12by9zstfm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tc8tc8le6rjdp4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Printer_nullParser1131",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38146,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12by9zstfm(){try{__CLR4_4_1tc8tc8le6rjdp4.R.inc(38146); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38147);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38148);bld.appendLiteral('Y'); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38149);DateTimePrinter p = bld.toPrinter(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38150);try { 
         __CLR4_4_1tc8tc8le6rjdp4.R.inc(38151);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
         __CLR4_4_1tc8tc8le6rjdp4.R.inc(38152);bld2.append(p, (DateTimeParser) null); 
         __CLR4_4_1tc8tc8le6rjdp4.R.inc(38153);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1tc8tc8le6rjdp4.R.flushNeeded();}} 


public void test_appendOptional_Parser1132() {__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceStart(getClass().getName(),38154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dsqxwdtfu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tc8tc8le6rjdp4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendOptional_Parser1132",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38154,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dsqxwdtfu(){try{__CLR4_4_1tc8tc8le6rjdp4.R.inc(38154); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38155);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38156);bld.appendLiteral('Y'); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38157);DateTimeParser p = bld.toParser(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38158);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38159);bld2.appendLiteral('X'); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38160);bld2.appendOptional(p); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38161);bld2.appendLiteral('Z'); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38162);DateTimeFormatter f = bld2.toFormatter(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38163);assertEquals(false, f.isPrinter()); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38164);assertEquals(true, f.isParser()); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38165);assertEquals(0, f.withZoneUTC().parseMillis("XYZ")); 
 }finally{__CLR4_4_1tc8tc8le6rjdp4.R.flushNeeded();}} 


public void test_appendFixedSignedDecimal1134() {__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceStart(getClass().getName(),38166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14cnjf4tg6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tc8tc8le6rjdp4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendFixedSignedDecimal1134",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14cnjf4tg6(){try{__CLR4_4_1tc8tc8le6rjdp4.R.inc(38166); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38167);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38168);bld.appendFixedSignedDecimal(DateTimeFieldType.year(), 4); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38169);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38170);assertEquals("2007", f.print(new DateTime("2007-01-01"))); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38171);assertEquals("0123", f.print(new DateTime("123-01-01"))); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38172);assertEquals("0001", f.print(new DateTime("1-2-3"))); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38173);assertEquals("99999", f.print(new DateTime("99999-2-3"))); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38174);assertEquals("-0099", f.print(new DateTime("-99-2-3"))); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38175);assertEquals("0000", f.print(new DateTime("0-2-3"))); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38176);assertEquals(2001, f.parseDateTime("2001").getYear()); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38177);assertEquals(-2001, f.parseDateTime("-2001").getYear()); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38178);assertEquals(2001, f.parseDateTime("+2001").getYear()); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38179);try { 
         __CLR4_4_1tc8tc8le6rjdp4.R.inc(38180);f.parseDateTime("20016"); 
         __CLR4_4_1tc8tc8le6rjdp4.R.inc(38181);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
 }finally{__CLR4_4_1tc8tc8le6rjdp4.R.flushNeeded();}} 


public void test_printParseZoneParis1136() {__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceStart(getClass().getName(),38182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mzjzbqtgm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tc8tc8le6rjdp4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tc8tc8le6rjdp4.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneParis1136",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mzjzbqtgm(){try{__CLR4_4_1tc8tc8le6rjdp4.R.inc(38182); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38183);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38184);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38185);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, PARIS); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38186);assertEquals("2007-03-04 12:30 Europe/Paris", f.print(dt)); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38187);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 Europe/Paris")); 
     __CLR4_4_1tc8tc8le6rjdp4.R.inc(38188);assertEquals(dt, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 Europe/Paris")); 
 }finally{__CLR4_4_1tc8tc8le6rjdp4.R.flushNeeded();}} 

    

    

    

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
