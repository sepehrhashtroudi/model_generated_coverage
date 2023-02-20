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
public class TestDateTimeFormatterBuilder extends TestCase {static class __CLR4_4_1te8te8le6qear1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,38266,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    private static final DateTimeZone LOS_ANGELES = DateTimeZone.forID("America/Los_Angeles");

    public static void main(String[] args) {try{__CLR4_4_1te8te8le6qear1.R.inc(38096);
        __CLR4_4_1te8te8le6qear1.R.inc(38097);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1te8te8le6qear1.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1te8te8le6qear1.R.inc(38098);
        __CLR4_4_1te8te8le6qear1.R.inc(38099);return new TestSuite(TestDateTimeFormatterBuilder.class);
    }finally{__CLR4_4_1te8te8le6qear1.R.flushNeeded();}}

    public TestDateTimeFormatterBuilder(String name) {
        super(name);__CLR4_4_1te8te8le6qear1.R.inc(38101);try{__CLR4_4_1te8te8le6qear1.R.inc(38100);
    }finally{__CLR4_4_1te8te8le6qear1.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1te8te8le6qear1.R.inc(38102);
    }finally{__CLR4_4_1te8te8le6qear1.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1te8te8le6qear1.R.inc(38103);
    }finally{__CLR4_4_1te8te8le6qear1.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_parseWrongOffset205() {__CLR4_4_1te8te8le6qear1.R.globalSliceStart(getClass().getName(),38104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qvf3ksteg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1te8te8le6qear1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1te8te8le6qear1.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_parseWrongOffset205",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38104,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qvf3ksteg(){try{__CLR4_4_1te8te8le6qear1.R.inc(38104); 
     __CLR4_4_1te8te8le6qear1.R.inc(38105);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2); 
     __CLR4_4_1te8te8le6qear1.R.inc(38106);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38107);DateTime expected = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forOffsetHours(7)); 
     __CLR4_4_1te8te8le6qear1.R.inc(38108);assertEquals(expected.withZone(TOKYO), f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +07:00")); 
     __CLR4_4_1te8te8le6qear1.R.inc(38109);assertEquals(expected, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +07:00")); 
     __CLR4_4_1te8te8le6qear1.R.inc(38110);assertEquals(expected.withZone(DateTimeZone.getDefault()), f.parseDateTime("2007-03-04 12:30 +07:00")); 
 }finally{__CLR4_4_1te8te8le6qear1.R.flushNeeded();}} 


public void test_appendFixedDecimal403() {__CLR4_4_1te8te8le6qear1.R.globalSliceStart(getClass().getName(),38111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rfiqfuten();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1te8te8le6qear1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1te8te8le6qear1.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendFixedDecimal403",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rfiqfuten(){try{__CLR4_4_1te8te8le6qear1.R.inc(38111); 
     __CLR4_4_1te8te8le6qear1.R.inc(38112);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38113);bld.appendFixedDecimal(DateTimeFieldType.year(), 4); 
     __CLR4_4_1te8te8le6qear1.R.inc(38114);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38115);assertEquals("2007", f.print(new DateTime("2007-01-01"))); 
     __CLR4_4_1te8te8le6qear1.R.inc(38116);assertEquals("0123", f.print(new DateTime("123-01-01"))); 
     __CLR4_4_1te8te8le6qear1.R.inc(38117);assertEquals("0001", f.print(new DateTime("1-2-3"))); 
     __CLR4_4_1te8te8le6qear1.R.inc(38118);assertEquals("99999", f.print(new DateTime("99999-2-3"))); 
     __CLR4_4_1te8te8le6qear1.R.inc(38119);assertEquals("-0099", f.print(new DateTime("-99-2-3"))); 
     __CLR4_4_1te8te8le6qear1.R.inc(38120);assertEquals("0000", f.print(new DateTime("0-2-3"))); 
     __CLR4_4_1te8te8le6qear1.R.inc(38121);assertEquals(2001, f.parseDateTime("2001").getYear()); 
     __CLR4_4_1te8te8le6qear1.R.inc(38122);try { 
         __CLR4_4_1te8te8le6qear1.R.inc(38123);f.parseDateTime("-2001"); 
         __CLR4_4_1te8te8le6qear1.R.inc(38124);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     __CLR4_4_1te8te8le6qear1.R.inc(38125);try { 
         __CLR4_4_1te8te8le6qear1.R.inc(38126);f.parseDateTime("200"); 
         __CLR4_4_1te8te8le6qear1.R.inc(38127);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     __CLR4_4_1te8te8le6qear1.R.inc(38128);try { 
         __CLR4_4_1te8te8le6qear1.R.inc(38129);f.parseDateTime("20016"); 
         __CLR4_4_1te8te8le6qear1.R.inc(38130);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     __CLR4_4_1te8te8le6qear1.R.inc(38131);bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38132);bld.appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2); 
     __CLR4_4_1te8te8le6qear1.R.inc(38133);bld.appendLiteral(':'); 
     __CLR4_4_1te8te8le6qear1.R.inc(38134);bld.appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2); 
     __CLR4_4_1te8te8le6qear1.R.inc(38135);bld.appendLiteral(':'); 
     __CLR4_4_1te8te8le6qear1.R.inc(38136);bld.appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2); 
     __CLR4_4_1te8te8le6qear1.R.inc(38137);f = bld.toFormatter(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38138);assertEquals("01:02:34", f.print(new DateTime("T1:2:34"))); 
     __CLR4_4_1te8te8le6qear1.R.inc(38139);DateTime dt = f.parseDateTime("01:02:34"); 
     __CLR4_4_1te8te8le6qear1.R.inc(38140);assertEquals(1, dt.getHourOfDay()); 
     __CLR4_4_1te8te8le6qear1.R.inc(38141);assertEquals(2, dt.getMinuteOfHour()); 
     __CLR4_4_1te8te8le6qear1.R.inc(38142);assertEquals(34, dt.getSecondOfMinute()); 
     __CLR4_4_1te8te8le6qear1.R.inc(38143);try { 
         __CLR4_4_1te8te8le6qear1.R.inc(38144);f.parseDateTime("0145:02:34"); 
         __CLR4_4_1te8te8le6qear1.R.inc(38145);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     __CLR4_4_1te8te8le6qear1.R.inc(38146);try { 
         __CLR4_4_1te8te8le6qear1.R.inc(38147);f.parseDateTime("01:0:34"); 
         __CLR4_4_1te8te8le6qear1.R.inc(38148);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
 }finally{__CLR4_4_1te8te8le6qear1.R.flushNeeded();}} 


public void test_toFormatter1103() {__CLR4_4_1te8te8le6qear1.R.globalSliceStart(getClass().getName(),38149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yo3yz8tfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1te8te8le6qear1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1te8te8le6qear1.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_toFormatter1103",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38149,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yo3yz8tfp(){try{__CLR4_4_1te8te8le6qear1.R.inc(38149); 
     __CLR4_4_1te8te8le6qear1.R.inc(38150);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38151);try { 
         __CLR4_4_1te8te8le6qear1.R.inc(38152);bld.toFormatter(); 
         __CLR4_4_1te8te8le6qear1.R.inc(38153);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1te8te8le6qear1.R.inc(38154);bld.appendLiteral('X'); 
     __CLR4_4_1te8te8le6qear1.R.inc(38155);assertNotNull(bld.toFormatter()); 
 }finally{__CLR4_4_1te8te8le6qear1.R.flushNeeded();}} 


public void test_append_nullPrinter_Parser1104() {__CLR4_4_1te8te8le6qear1.R.globalSliceStart(getClass().getName(),38156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g799yqtfw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1te8te8le6qear1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1te8te8le6qear1.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_nullPrinter_Parser1104",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38156,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g799yqtfw(){try{__CLR4_4_1te8te8le6qear1.R.inc(38156); 
     __CLR4_4_1te8te8le6qear1.R.inc(38157);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38158);bld.appendLiteral('Y'); 
     __CLR4_4_1te8te8le6qear1.R.inc(38159);DateTimeParser p = bld.toParser(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38160);try { 
         __CLR4_4_1te8te8le6qear1.R.inc(38161);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
         __CLR4_4_1te8te8le6qear1.R.inc(38162);bld2.append((DateTimePrinter) null, p); 
         __CLR4_4_1te8te8le6qear1.R.inc(38163);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1te8te8le6qear1.R.flushNeeded();}} 


public void test_toParser1105() {__CLR4_4_1te8te8le6qear1.R.globalSliceStart(getClass().getName(),38164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o9vtaltg4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1te8te8le6qear1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1te8te8le6qear1.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_toParser1105",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o9vtaltg4(){try{__CLR4_4_1te8te8le6qear1.R.inc(38164); 
     __CLR4_4_1te8te8le6qear1.R.inc(38165);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38166);try { 
         __CLR4_4_1te8te8le6qear1.R.inc(38167);bld.toParser(); 
         __CLR4_4_1te8te8le6qear1.R.inc(38168);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1te8te8le6qear1.R.inc(38169);bld.appendLiteral('X'); 
     __CLR4_4_1te8te8le6qear1.R.inc(38170);assertNotNull(bld.toParser()); 
 }finally{__CLR4_4_1te8te8le6qear1.R.flushNeeded();}} 


public void test_canBuildFormatter1106() {__CLR4_4_1te8te8le6qear1.R.globalSliceStart(getClass().getName(),38171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19g3emktgb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1te8te8le6qear1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1te8te8le6qear1.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_canBuildFormatter1106",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38171,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19g3emktgb(){try{__CLR4_4_1te8te8le6qear1.R.inc(38171); 
     __CLR4_4_1te8te8le6qear1.R.inc(38172);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38173);assertEquals(false, bld.canBuildFormatter()); 
     __CLR4_4_1te8te8le6qear1.R.inc(38174);bld.appendLiteral('X'); 
     __CLR4_4_1te8te8le6qear1.R.inc(38175);assertEquals(true, bld.canBuildFormatter()); 
 }finally{__CLR4_4_1te8te8le6qear1.R.flushNeeded();}} 


public void test_canBuildParser1107() {__CLR4_4_1te8te8le6qear1.R.globalSliceStart(getClass().getName(),38176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1grd3xktgg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1te8te8le6qear1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1te8te8le6qear1.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_canBuildParser1107",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1grd3xktgg(){try{__CLR4_4_1te8te8le6qear1.R.inc(38176); 
     __CLR4_4_1te8te8le6qear1.R.inc(38177);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38178);assertEquals(false, bld.canBuildParser()); 
     __CLR4_4_1te8te8le6qear1.R.inc(38179);bld.appendLiteral('X'); 
     __CLR4_4_1te8te8le6qear1.R.inc(38180);assertEquals(true, bld.canBuildParser()); 
 }finally{__CLR4_4_1te8te8le6qear1.R.flushNeeded();}} 


public void test_append_Formatter1108() {__CLR4_4_1te8te8le6qear1.R.globalSliceStart(getClass().getName(),38181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q47aprtgl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1te8te8le6qear1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1te8te8le6qear1.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Formatter1108",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38181,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q47aprtgl(){try{__CLR4_4_1te8te8le6qear1.R.inc(38181); 
     __CLR4_4_1te8te8le6qear1.R.inc(38182);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38183);bld.appendLiteral('Y'); 
     __CLR4_4_1te8te8le6qear1.R.inc(38184);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38185);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38186);bld2.appendLiteral('X'); 
     __CLR4_4_1te8te8le6qear1.R.inc(38187);bld2.append(f); 
     __CLR4_4_1te8te8le6qear1.R.inc(38188);bld2.appendLiteral('Z'); 
     __CLR4_4_1te8te8le6qear1.R.inc(38189);assertEquals("XYZ", bld2.toFormatter().print(0L)); 
 }finally{__CLR4_4_1te8te8le6qear1.R.flushNeeded();}} 


public void test_append_nullParser1109() {__CLR4_4_1te8te8le6qear1.R.globalSliceStart(getClass().getName(),38190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pcy67itgu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1te8te8le6qear1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1te8te8le6qear1.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_nullParser1109",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pcy67itgu(){try{__CLR4_4_1te8te8le6qear1.R.inc(38190); 
     __CLR4_4_1te8te8le6qear1.R.inc(38191);try { 
         __CLR4_4_1te8te8le6qear1.R.inc(38192);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
         __CLR4_4_1te8te8le6qear1.R.inc(38193);bld2.append((DateTimeParser) null); 
         __CLR4_4_1te8te8le6qear1.R.inc(38194);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1te8te8le6qear1.R.flushNeeded();}} 


public void test_append_Parser1110() {__CLR4_4_1te8te8le6qear1.R.globalSliceStart(getClass().getName(),38195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l8xq3htgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1te8te8le6qear1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1te8te8le6qear1.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Parser1110",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l8xq3htgz(){try{__CLR4_4_1te8te8le6qear1.R.inc(38195); 
     __CLR4_4_1te8te8le6qear1.R.inc(38196);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38197);bld.appendLiteral('Y'); 
     __CLR4_4_1te8te8le6qear1.R.inc(38198);DateTimeParser p = bld.toParser(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38199);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38200);bld2.appendLiteral('X'); 
     __CLR4_4_1te8te8le6qear1.R.inc(38201);bld2.append(p); 
     __CLR4_4_1te8te8le6qear1.R.inc(38202);bld2.appendLiteral('Z'); 
     __CLR4_4_1te8te8le6qear1.R.inc(38203);DateTimeFormatter f = bld2.toFormatter(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38204);assertEquals(false, f.isPrinter()); 
     __CLR4_4_1te8te8le6qear1.R.inc(38205);assertEquals(true, f.isParser()); 
     __CLR4_4_1te8te8le6qear1.R.inc(38206);assertEquals(0, f.withZoneUTC().parseMillis("XYZ")); 
 }finally{__CLR4_4_1te8te8le6qear1.R.flushNeeded();}} 


public void test_append_Printer_nullParser1111() {__CLR4_4_1te8te8le6qear1.R.globalSliceStart(getClass().getName(),38207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_199fywathb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1te8te8le6qear1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1te8te8le6qear1.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Printer_nullParser1111",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_199fywathb(){try{__CLR4_4_1te8te8le6qear1.R.inc(38207); 
     __CLR4_4_1te8te8le6qear1.R.inc(38208);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38209);bld.appendLiteral('Y'); 
     __CLR4_4_1te8te8le6qear1.R.inc(38210);DateTimePrinter p = bld.toPrinter(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38211);try { 
         __CLR4_4_1te8te8le6qear1.R.inc(38212);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
         __CLR4_4_1te8te8le6qear1.R.inc(38213);bld2.append(p, (DateTimeParser) null); 
         __CLR4_4_1te8te8le6qear1.R.inc(38214);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1te8te8le6qear1.R.flushNeeded();}} 


public void test_appendOptional_Parser1112() {__CLR4_4_1te8te8le6qear1.R.globalSliceStart(getClass().getName(),38215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pe56sfthj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1te8te8le6qear1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1te8te8le6qear1.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendOptional_Parser1112",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38215,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pe56sfthj(){try{__CLR4_4_1te8te8le6qear1.R.inc(38215); 
     __CLR4_4_1te8te8le6qear1.R.inc(38216);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38217);bld.appendLiteral('Y'); 
     __CLR4_4_1te8te8le6qear1.R.inc(38218);DateTimeParser p = bld.toParser(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38219);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38220);bld2.appendLiteral('X'); 
     __CLR4_4_1te8te8le6qear1.R.inc(38221);bld2.appendOptional(p); 
     __CLR4_4_1te8te8le6qear1.R.inc(38222);bld2.appendLiteral('Z'); 
     __CLR4_4_1te8te8le6qear1.R.inc(38223);DateTimeFormatter f = bld2.toFormatter(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38224);assertEquals(false, f.isPrinter()); 
     __CLR4_4_1te8te8le6qear1.R.inc(38225);assertEquals(true, f.isParser()); 
     __CLR4_4_1te8te8le6qear1.R.inc(38226);assertEquals(0, f.withZoneUTC().parseMillis("XYZ")); 
 }finally{__CLR4_4_1te8te8le6qear1.R.flushNeeded();}} 


public void test_appendFixedSignedDecimal1113() {__CLR4_4_1te8te8le6qear1.R.globalSliceStart(getClass().getName(),38227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zqqohthv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1te8te8le6qear1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1te8te8le6qear1.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendFixedSignedDecimal1113",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38227,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zqqohthv(){try{__CLR4_4_1te8te8le6qear1.R.inc(38227); 
     __CLR4_4_1te8te8le6qear1.R.inc(38228);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38229);bld.appendFixedSignedDecimal(DateTimeFieldType.year(), 4); 
     __CLR4_4_1te8te8le6qear1.R.inc(38230);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38231);assertEquals("2007", f.print(new DateTime("2007-01-01"))); 
     __CLR4_4_1te8te8le6qear1.R.inc(38232);assertEquals("0123", f.print(new DateTime("123-01-01"))); 
     __CLR4_4_1te8te8le6qear1.R.inc(38233);assertEquals("0001", f.print(new DateTime("1-2-3"))); 
     __CLR4_4_1te8te8le6qear1.R.inc(38234);assertEquals("99999", f.print(new DateTime("99999-2-3"))); 
     __CLR4_4_1te8te8le6qear1.R.inc(38235);assertEquals("-0099", f.print(new DateTime("-99-2-3"))); 
     __CLR4_4_1te8te8le6qear1.R.inc(38236);assertEquals("0000", f.print(new DateTime("0-2-3"))); 
     __CLR4_4_1te8te8le6qear1.R.inc(38237);assertEquals(2001, f.parseDateTime("2001").getYear()); 
     __CLR4_4_1te8te8le6qear1.R.inc(38238);assertEquals(-2001, f.parseDateTime("-2001").getYear()); 
     __CLR4_4_1te8te8le6qear1.R.inc(38239);assertEquals(2001, f.parseDateTime("+2001").getYear()); 
     __CLR4_4_1te8te8le6qear1.R.inc(38240);try { 
         __CLR4_4_1te8te8le6qear1.R.inc(38241);f.parseDateTime("20016"); 
         __CLR4_4_1te8te8le6qear1.R.inc(38242);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
 }finally{__CLR4_4_1te8te8le6qear1.R.flushNeeded();}} 


public void test_printParseZoneParis1119() {__CLR4_4_1te8te8le6qear1.R.globalSliceStart(getClass().getName(),38243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qp5xdxtib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1te8te8le6qear1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1te8te8le6qear1.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneParis1119",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qp5xdxtib(){try{__CLR4_4_1te8te8le6qear1.R.inc(38243); 
     __CLR4_4_1te8te8le6qear1.R.inc(38244);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38245);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38246);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, PARIS); 
     __CLR4_4_1te8te8le6qear1.R.inc(38247);assertEquals("2007-03-04 12:30 Europe/Paris", f.print(dt)); 
     __CLR4_4_1te8te8le6qear1.R.inc(38248);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 Europe/Paris")); 
     __CLR4_4_1te8te8le6qear1.R.inc(38249);assertEquals(dt, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 Europe/Paris")); 
 }finally{__CLR4_4_1te8te8le6qear1.R.flushNeeded();}} 


public void test_parseWrongOffsetAndZone1128() {__CLR4_4_1te8te8le6qear1.R.globalSliceStart(getClass().getName(),38250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v1vqitii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1te8te8le6qear1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1te8te8le6qear1.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_parseWrongOffsetAndZone1128",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38250,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v1vqitii(){try{__CLR4_4_1te8te8le6qear1.R.inc(38250); 
     __CLR4_4_1te8te8le6qear1.R.inc(38251);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2).appendLiteral(' ').appendTimeZoneId(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38252);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38253);DateTime expected = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forOffsetHours(7)); 
     __CLR4_4_1te8te8le6qear1.R.inc(38254);assertEquals(expected.withZone(TOKYO), f.parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo")); 
     __CLR4_4_1te8te8le6qear1.R.inc(38255);assertEquals(expected.withZone(TOKYO), f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo")); 
     __CLR4_4_1te8te8le6qear1.R.inc(38256);assertEquals(expected, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo")); 
 }finally{__CLR4_4_1te8te8le6qear1.R.flushNeeded();}} 


public void test_appendTimeZoneId1129() {__CLR4_4_1te8te8le6qear1.R.globalSliceStart(getClass().getName(),38257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11u2xbrtip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1te8te8le6qear1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1te8te8le6qear1.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendTimeZoneId1129",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38257,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11u2xbrtip(){try{__CLR4_4_1te8te8le6qear1.R.inc(38257); 
     __CLR4_4_1te8te8le6qear1.R.inc(38258);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38259);bld.appendTimeZoneId(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38260);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1te8te8le6qear1.R.inc(38261);assertEquals("Asia/Tokyo", f.print(new DateTime(2007, 3, 4, 0, 0, 0, TOKYO))); 
     __CLR4_4_1te8te8le6qear1.R.inc(38262);assertEquals(TOKYO, f.parseDateTime("Asia/Tokyo").getZone()); 
     __CLR4_4_1te8te8le6qear1.R.inc(38263);try { 
         __CLR4_4_1te8te8le6qear1.R.inc(38264);f.parseDateTime("Nonsense"); 
         __CLR4_4_1te8te8le6qear1.R.inc(38265);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
 }finally{__CLR4_4_1te8te8le6qear1.R.flushNeeded();}} 

    

    

    

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
