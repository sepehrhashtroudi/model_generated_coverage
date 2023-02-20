/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2006 Stephen Colebourne
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

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 * This class is a Junit unit test for ISODateTimeFormat parsing.
 *
 * @author Stephen Colebourne
 */
public class TestISODateTimeFormatParsing extends TestCase {static class __CLR4_4_1tfktfkle6rcn3u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,38486,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1tfktfkle6rcn3u.R.inc(38144);
        __CLR4_4_1tfktfkle6rcn3u.R.inc(38145);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1tfktfkle6rcn3u.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1tfktfkle6rcn3u.R.inc(38146);
        __CLR4_4_1tfktfkle6rcn3u.R.inc(38147);return new TestSuite(TestISODateTimeFormatParsing.class);
    }finally{__CLR4_4_1tfktfkle6rcn3u.R.flushNeeded();}}

    public TestISODateTimeFormatParsing(String name) {
        super(name);__CLR4_4_1tfktfkle6rcn3u.R.inc(38149);try{__CLR4_4_1tfktfkle6rcn3u.R.inc(38148);
    }finally{__CLR4_4_1tfktfkle6rcn3u.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1tfktfkle6rcn3u.R.inc(38150);
        __CLR4_4_1tfktfkle6rcn3u.R.inc(38151);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1tfktfkle6rcn3u.R.inc(38152);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1tfktfkle6rcn3u.R.inc(38153);originalLocale = Locale.getDefault();
        __CLR4_4_1tfktfkle6rcn3u.R.inc(38154);DateTimeZone.setDefault(DateTimeZone.forID("Europe/London"));
        __CLR4_4_1tfktfkle6rcn3u.R.inc(38155);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1tfktfkle6rcn3u.R.inc(38156);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1tfktfkle6rcn3u.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1tfktfkle6rcn3u.R.inc(38157);
        __CLR4_4_1tfktfkle6rcn3u.R.inc(38158);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1tfktfkle6rcn3u.R.inc(38159);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1tfktfkle6rcn3u.R.inc(38160);Locale.setDefault(originalLocale);
        __CLR4_4_1tfktfkle6rcn3u.R.inc(38161);originalDateTimeZone = null;
        __CLR4_4_1tfktfkle6rcn3u.R.inc(38162);originalTimeZone = null;
        __CLR4_4_1tfktfkle6rcn3u.R.inc(38163);originalLocale = null;
    }finally{__CLR4_4_1tfktfkle6rcn3u.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_dateElementParser195() {__CLR4_4_1tfktfkle6rcn3u.R.globalSliceStart(getClass().getName(),38164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o6o2d0tg4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tfktfkle6rcn3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tfktfkle6rcn3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_dateElementParser195",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o6o2d0tg4(){try{__CLR4_4_1tfktfkle6rcn3u.R.inc(38164); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38165);DateTimeFormatter parser = ISODateTimeFormat.dateElementParser(); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38166);assertParse(parser, "2006-06-09", new DateTime(2006, 6, 9, 0, 0, 0, 0)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38167);assertParse(parser, "2006-06-9", new DateTime(2006, 6, 9, 0, 0, 0, 0)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38168);assertParse(parser, "2006-6-09", new DateTime(2006, 6, 9, 0, 0, 0, 0)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38169);assertParse(parser, "2006-6-9", new DateTime(2006, 6, 9, 0, 0, 0, 0)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38170);assertParse(parser, true, "2006-W27-3"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38171);assertParse(parser, true, "2006-123"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38172);assertParse(parser, false, "2006-06-09T+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38173);assertParse(parser, false, "2006-W27-3T+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38174);assertParse(parser, false, "2006-123T+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38175);assertParse(parser, false, "2006-06-09T10:20:30.040"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38176);assertParse(parser, false, "2006-W27-3T10:20:30.040"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38177);assertParse(parser, false, "2006-123T10:20:30.040"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38178);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38179);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38180);assertParse(parser, false, "2006-123T10:20:30.040+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38181);assertParse(parser, false, "T10:20:30.040"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38182);assertParse(parser, false, "T10.5"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38183);assertParse(parser, false, "T10:20:30.040+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38184);assertParse(parser, false, "T10.5+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38185);assertParse(parser, false, "10:20:30.040"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38186);assertParse(parser, false, "10.5"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38187);assertParse(parser, false, "10:20:30.040+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38188);assertParse(parser, false, "10.5+02:00"); 
 }finally{__CLR4_4_1tfktfkle6rcn3u.R.flushNeeded();}} 


public void test_weekDateTime612() {__CLR4_4_1tfktfkle6rcn3u.R.globalSliceStart(getClass().getName(),38189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1id8b26tgt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tfktfkle6rcn3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tfktfkle6rcn3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_weekDateTime612",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1id8b26tgt(){try{__CLR4_4_1tfktfkle6rcn3u.R.inc(38189); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38190);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38191);DateTimeFormatter parser = ISODateTimeFormat.weekDateTime(); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38192);assertParse(parser, "2006-W27-3T10:20:30.400999999Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38193);assertParse(parser, "2006-W27-3T10:20:30.400Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38194);assertParse(parser, "2006-W27-3T10:20:30.40Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38195);assertParse(parser, "2006-W27-3T10:20:30.4Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38196);assertParse(parser, "2006-W2-3T10:20:30.400Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(2).withDayOfWeek(3)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38197);assertParse(parser, "2006-W27-3T5:6:7.800Z", new DateTime(2006, 6, 1, 5, 6, 7, 800).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38198);assertParse(parser, false, "2006-W27-T10:20:30.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38199);assertParse(parser, false, "2006-W27T10:20:30.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38200);assertParse(parser, false, "2006-W2T10:20:30.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38201);assertParse(parser, false, "2006-W-3T10:20:30.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38202);assertParse(parser, false, "2006-W27-3T10:20.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38203);assertParse(parser, false, "2006-W27-3T10:2.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38204);assertParse(parser, false, "2006-W27-3T10.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38205);assertParse(parser, false, "2006-W27-3T1.400Z"); 
 }finally{__CLR4_4_1tfktfkle6rcn3u.R.flushNeeded();}} 


public void test_basicOrdinalDateTime613() {__CLR4_4_1tfktfkle6rcn3u.R.globalSliceStart(getClass().getName(),38206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uxycc4tha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tfktfkle6rcn3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tfktfkle6rcn3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicOrdinalDateTime613",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38206,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uxycc4tha(){try{__CLR4_4_1tfktfkle6rcn3u.R.inc(38206); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38207);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38208);DateTimeFormatter parser = ISODateTimeFormat.basicOrdinalDateTime(); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38209);assertParse(parser, "2006123T102030.400999999Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38210);assertParse(parser, "2006123T102030.400Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38211);assertParse(parser, "2006123T102030.40Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38212);assertParse(parser, "2006123T102030.4Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38213);assertParse(parser, false, "200612T102030.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38214);assertParse(parser, false, "20061T102030.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38215);assertParse(parser, false, "2006T102030.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38216);assertParse(parser, false, "200T102030.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38217);assertParse(parser, false, "20T102030.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38218);assertParse(parser, false, "2T102030.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38219);assertParse(parser, false, "2006123T10203.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38220);assertParse(parser, false, "2006123T1020.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38221);assertParse(parser, false, "2006123T102.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38222);assertParse(parser, false, "2006123T10.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38223);assertParse(parser, false, "2006123T1.400Z"); 
 }finally{__CLR4_4_1tfktfkle6rcn3u.R.flushNeeded();}} 


public void test_localDateParser848() {__CLR4_4_1tfktfkle6rcn3u.R.globalSliceStart(getClass().getName(),38224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aif7goths();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tfktfkle6rcn3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tfktfkle6rcn3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_localDateParser848",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38224,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aif7goths(){try{__CLR4_4_1tfktfkle6rcn3u.R.inc(38224); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38225);DateTimeFormatter parser = ISODateTimeFormat.localDateParser(); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38226);assertEquals(DateTimeZone.UTC, parser.getZone()); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38227);assertParse(parser, true, "2006-06-09"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38228);assertParse(parser, true, "2006-W27-3"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38229);assertParse(parser, true, "2006-123"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38230);assertParse(parser, false, "2006-06-09T+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38231);assertParse(parser, false, "2006-W27-3T+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38232);assertParse(parser, false, "2006-123T+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38233);assertParse(parser, false, "2006-06-09T10:20:30.040"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38234);assertParse(parser, false, "2006-W27-3T10:20:30.040"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38235);assertParse(parser, false, "2006-123T10:20:30.040"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38236);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38237);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38238);assertParse(parser, false, "2006-123T10:20:30.040+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38239);assertParse(parser, false, "T10:20:30.040"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38240);assertParse(parser, false, "T10.5"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38241);assertParse(parser, false, "T10:20:30.040+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38242);assertParse(parser, false, "T10.5+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38243);assertParse(parser, false, "10:20:30.040"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38244);assertParse(parser, false, "10.5"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38245);assertParse(parser, false, "10:20:30.040+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38246);assertParse(parser, false, "10.5+02:00"); 
 }finally{__CLR4_4_1tfktfkle6rcn3u.R.flushNeeded();}} 


public void test_timeParser849() {__CLR4_4_1tfktfkle6rcn3u.R.globalSliceStart(getClass().getName(),38247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_139nx6ztif();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tfktfkle6rcn3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tfktfkle6rcn3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_timeParser849",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_139nx6ztif(){try{__CLR4_4_1tfktfkle6rcn3u.R.inc(38247); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38248);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38249);DateTimeFormatter parser = ISODateTimeFormat.timeParser(); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38250);assertParse(parser, false, "2006-06-09"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38251);assertParse(parser, false, "2006-W27-3"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38252);assertParse(parser, false, "2006-123"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38253);assertParse(parser, false, "2006-06-09T+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38254);assertParse(parser, false, "2006-W27-3T+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38255);assertParse(parser, false, "2006-123T+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38256);assertParse(parser, false, "2006-06-09T10:20:30.040"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38257);assertParse(parser, false, "2006-W27-3T10:20:30.040"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38258);assertParse(parser, false, "2006-123T10:20:30.040"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38259);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38260);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38261);assertParse(parser, false, "2006-123T10:20:30.040+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38262);assertParse(parser, "T10:20:30.040000000", new DateTime(1970, 1, 1, 10, 20, 30, 40)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38263);assertParse(parser, "T10:20:30.004", new DateTime(1970, 1, 1, 10, 20, 30, 4)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38264);assertParse(parser, "T10:20:30.040", new DateTime(1970, 1, 1, 10, 20, 30, 40)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38265);assertParse(parser, "T10:20:30.400", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38266);assertParse(parser, "T10.5", new DateTime(1970, 1, 1, 10, 30, 0, 0)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38267);assertParse(parser, "T10:20:30.040+02:00", new DateTime(1970, 1, 1, 8, 20, 30, 40)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38268);assertParse(parser, "T10.5+02:00", new DateTime(1970, 1, 1, 8, 30, 0, 0)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38269);assertParse(parser, true, "10:20:30.040"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38270);assertParse(parser, true, "10.5"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38271);assertParse(parser, true, "10:20:30.040+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38272);assertParse(parser, true, "10.5+02:00"); 
 }finally{__CLR4_4_1tfktfkle6rcn3u.R.flushNeeded();}} 


public void test_dateTimeParser850() {__CLR4_4_1tfktfkle6rcn3u.R.globalSliceStart(getClass().getName(),38273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kc3a99tj5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tfktfkle6rcn3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tfktfkle6rcn3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_dateTimeParser850",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38273,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kc3a99tj5(){try{__CLR4_4_1tfktfkle6rcn3u.R.inc(38273); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38274);DateTimeFormatter parser = ISODateTimeFormat.dateTimeParser(); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38275);assertParse(parser, true, "2006-06-09"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38276);assertParse(parser, true, "2006-W27-3"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38277);assertParse(parser, true, "2006-123"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38278);assertParse(parser, true, "2006-06-09T+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38279);assertParse(parser, true, "2006-W27-3T+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38280);assertParse(parser, true, "2006-123T+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38281);assertParse(parser, true, "2006-06-09T10:20:30.040"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38282);assertParse(parser, true, "2006-W27-3T10:20:30.040"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38283);assertParse(parser, true, "2006-123T10:20:30.040"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38284);assertParse(parser, true, "2006-06-09T10:20:30.040+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38285);assertParse(parser, true, "2006-W27-3T10:20:30.040+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38286);assertParse(parser, true, "2006-123T10:20:30.040+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38287);assertParse(parser, true, "T10:20:30.040"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38288);assertParse(parser, true, "T10.5"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38289);assertParse(parser, true, "T10:20:30.040+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38290);assertParse(parser, true, "T10.5+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38291);assertParse(parser, false, "10:20:30.040"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38292);assertParse(parser, false, "10.5"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38293);assertParse(parser, false, "10:20:30.040+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38294);assertParse(parser, false, "10.5+02:00"); 
 }finally{__CLR4_4_1tfktfkle6rcn3u.R.flushNeeded();}} 


public void test_localDateOptionalTimeParser851() {__CLR4_4_1tfktfkle6rcn3u.R.globalSliceStart(getClass().getName(),38295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1psqmhvtjr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tfktfkle6rcn3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tfktfkle6rcn3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_localDateOptionalTimeParser851",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38295,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1psqmhvtjr(){try{__CLR4_4_1tfktfkle6rcn3u.R.inc(38295); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38296);DateTimeFormatter parser = ISODateTimeFormat.localDateOptionalTimeParser(); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38297);assertEquals(DateTimeZone.UTC, parser.getZone()); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38298);assertParse(parser, true, "2006-06-09"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38299);assertParse(parser, true, "2006-W27-3"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38300);assertParse(parser, true, "2006-123"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38301);assertParse(parser, false, "2006-06-09T+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38302);assertParse(parser, false, "2006-W27-3T+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38303);assertParse(parser, false, "2006-123T+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38304);assertParse(parser, true, "2006-06-09T10:20:30.040"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38305);assertParse(parser, true, "2006-W27-3T10:20:30.040"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38306);assertParse(parser, true, "2006-123T10:20:30.040"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38307);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38308);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38309);assertParse(parser, false, "2006-123T10:20:30.040+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38310);assertParse(parser, false, "T10:20:30.040"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38311);assertParse(parser, false, "T10.5"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38312);assertParse(parser, false, "T10:20:30.040+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38313);assertParse(parser, false, "T10.5+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38314);assertParse(parser, false, "10:20:30.040"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38315);assertParse(parser, false, "10.5"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38316);assertParse(parser, false, "10:20:30.040+02:00"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38317);assertParse(parser, false, "10.5+02:00"); 
 }finally{__CLR4_4_1tfktfkle6rcn3u.R.flushNeeded();}} 


public void test_dateTime856() {__CLR4_4_1tfktfkle6rcn3u.R.globalSliceStart(getClass().getName(),38318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u6ppawtke();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tfktfkle6rcn3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tfktfkle6rcn3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_dateTime856",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38318,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u6ppawtke(){try{__CLR4_4_1tfktfkle6rcn3u.R.inc(38318); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38319);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38320);DateTimeFormatter parser = ISODateTimeFormat.dateTime(); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38321);assertParse(parser, "2006-02-04T10:20:30.400999999Z", new DateTime(2006, 2, 4, 10, 20, 30, 400)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38322);assertParse(parser, "2006-02-04T10:20:30.400Z", new DateTime(2006, 2, 4, 10, 20, 30, 400)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38323);assertParse(parser, "2006-02-04T10:20:30.40Z", new DateTime(2006, 2, 4, 10, 20, 30, 400)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38324);assertParse(parser, "2006-02-04T10:20:30.4Z", new DateTime(2006, 2, 4, 10, 20, 30, 400)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38325);assertParse(parser, "2006-02-4T10:20:30.400Z", new DateTime(2006, 2, 4, 10, 20, 30, 400)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38326);assertParse(parser, "2006-2-04T10:20:30.400Z", new DateTime(2006, 2, 4, 10, 20, 30, 400)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38327);assertParse(parser, "2006-2-4T10:20:30.400Z", new DateTime(2006, 2, 4, 10, 20, 30, 400)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38328);assertParse(parser, "2006-02-04T5:6:7.800Z", new DateTime(2006, 2, 4, 5, 6, 7, 800)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38329);assertParse(parser, false, "2006-02-T10:20:30.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38330);assertParse(parser, false, "2006-12T10:20:30.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38331);assertParse(parser, false, "2006-1T10:20:30.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38332);assertParse(parser, false, "2006T10:20:30.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38333);assertParse(parser, false, "200T10:20:30.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38334);assertParse(parser, false, "20T10:20:30.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38335);assertParse(parser, false, "2T10:20:30.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38336);assertParse(parser, false, "2006-02-04T10:20.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38337);assertParse(parser, false, "2006-02-04T10:2.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38338);assertParse(parser, false, "2006-02-04T10.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38339);assertParse(parser, false, "2006-02-04T1.400Z"); 
 }finally{__CLR4_4_1tfktfkle6rcn3u.R.flushNeeded();}} 


public void test_dateTimeNoMillis857() {__CLR4_4_1tfktfkle6rcn3u.R.globalSliceStart(getClass().getName(),38340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wce8tutl0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tfktfkle6rcn3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tfktfkle6rcn3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_dateTimeNoMillis857",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wce8tutl0(){try{__CLR4_4_1tfktfkle6rcn3u.R.inc(38340); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38341);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38342);DateTimeFormatter parser = ISODateTimeFormat.dateTimeNoMillis(); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38343);assertParse(parser, "2006-02-04T10:20:30Z", new DateTime(2006, 2, 4, 10, 20, 30, 0)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38344);assertParse(parser, "2006-02-4T10:20:30Z", new DateTime(2006, 2, 4, 10, 20, 30, 0)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38345);assertParse(parser, "2006-2-04T10:20:30Z", new DateTime(2006, 2, 4, 10, 20, 30, 0)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38346);assertParse(parser, "2006-2-4T10:20:30Z", new DateTime(2006, 2, 4, 10, 20, 30, 0)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38347);assertParse(parser, "2006-02-04T5:6:7Z", new DateTime(2006, 2, 4, 5, 6, 7, 0)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38348);assertParse(parser, false, "2006-02-T10:20:30Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38349);assertParse(parser, false, "2006-12T10:20:30Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38350);assertParse(parser, false, "2006-1T10:20:30Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38351);assertParse(parser, false, "2006T10:20:30Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38352);assertParse(parser, false, "200T10:20:30Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38353);assertParse(parser, false, "20T10:20:30Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38354);assertParse(parser, false, "2T10:20:30Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38355);assertParse(parser, false, "2006-02-04T10:20Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38356);assertParse(parser, false, "2006-02-04T10:2Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38357);assertParse(parser, false, "2006-02-04T10Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38358);assertParse(parser, false, "2006-02-04T1Z"); 
 }finally{__CLR4_4_1tfktfkle6rcn3u.R.flushNeeded();}} 


public void test_ordinalDateTime858() {__CLR4_4_1tfktfkle6rcn3u.R.globalSliceStart(getClass().getName(),38359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uwpf0dtlj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tfktfkle6rcn3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tfktfkle6rcn3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_ordinalDateTime858",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uwpf0dtlj(){try{__CLR4_4_1tfktfkle6rcn3u.R.inc(38359); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38360);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38361);DateTimeFormatter parser = ISODateTimeFormat.ordinalDateTime(); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38362);assertParse(parser, "2006-123T10:20:30.400999999Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38363);assertParse(parser, "2006-123T10:20:30.400Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38364);assertParse(parser, "2006-123T10:20:30.40Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38365);assertParse(parser, "2006-123T10:20:30.4Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38366);assertParse(parser, "2006-12T10:20:30.400Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(12)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38367);assertParse(parser, "2006-1T10:20:30.400Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(1)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38368);assertParse(parser, "2006-123T5:6:7.800Z", new DateTime(2006, 1, 1, 5, 6, 7, 800).withDayOfYear(123)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38369);assertParse(parser, false, "2006-T10:20:30.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38370);assertParse(parser, false, "2006T10:20:30.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38371);assertParse(parser, false, "2006-123T10:20.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38372);assertParse(parser, false, "2006-123T10:2.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38373);assertParse(parser, false, "2006-123T10.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38374);assertParse(parser, false, "2006-123T1.400Z"); 
 }finally{__CLR4_4_1tfktfkle6rcn3u.R.flushNeeded();}} 


public void test_ordinalDateTimeNoMillis859() {__CLR4_4_1tfktfkle6rcn3u.R.globalSliceStart(getClass().getName(),38375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rvjl3xtlz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tfktfkle6rcn3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tfktfkle6rcn3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_ordinalDateTimeNoMillis859",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38375,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rvjl3xtlz(){try{__CLR4_4_1tfktfkle6rcn3u.R.inc(38375); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38376);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38377);DateTimeFormatter parser = ISODateTimeFormat.ordinalDateTimeNoMillis(); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38378);assertParse(parser, "2006-123T10:20:30Z", new DateTime(2006, 1, 1, 10, 20, 30, 0).withDayOfYear(123)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38379);assertParse(parser, "2006-12T10:20:30Z", new DateTime(2006, 1, 1, 10, 20, 30, 0).withDayOfYear(12)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38380);assertParse(parser, "2006-1T10:20:30Z", new DateTime(2006, 1, 1, 10, 20, 30, 0).withDayOfYear(1)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38381);assertParse(parser, "2006-123T5:6:7Z", new DateTime(2006, 1, 1, 5, 6, 7, 0).withDayOfYear(123)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38382);assertParse(parser, false, "2006-T10:20:30Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38383);assertParse(parser, false, "2006T10:20:30Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38384);assertParse(parser, false, "2006-123T10:20Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38385);assertParse(parser, false, "2006-123T10:2Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38386);assertParse(parser, false, "2006-123T10Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38387);assertParse(parser, false, "2006-123T1Z"); 
 }finally{__CLR4_4_1tfktfkle6rcn3u.R.flushNeeded();}} 


public void test_weekDateTimeNoMillis861() {__CLR4_4_1tfktfkle6rcn3u.R.globalSliceStart(getClass().getName(),38388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11zrgrbtmc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tfktfkle6rcn3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tfktfkle6rcn3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_weekDateTimeNoMillis861",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11zrgrbtmc(){try{__CLR4_4_1tfktfkle6rcn3u.R.inc(38388); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38389);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38390);DateTimeFormatter parser = ISODateTimeFormat.weekDateTimeNoMillis(); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38391);assertParse(parser, "2006-W27-3T10:20:30Z", new DateTime(2006, 6, 1, 10, 20, 30, 0).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38392);assertParse(parser, "2006-W2-3T10:20:30Z", new DateTime(2006, 6, 1, 10, 20, 30, 0).withWeekOfWeekyear(2).withDayOfWeek(3)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38393);assertParse(parser, "2006-W27-3T5:6:7Z", new DateTime(2006, 6, 1, 5, 6, 7, 0).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38394);assertParse(parser, false, "2006-W27-T10:20:30Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38395);assertParse(parser, false, "2006-W27T10:20:30Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38396);assertParse(parser, false, "2006-W2T10:20:30Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38397);assertParse(parser, false, "2006-W-3T10:20:30Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38398);assertParse(parser, false, "2006-W27-3T10:20Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38399);assertParse(parser, false, "2006-W27-3T10:2Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38400);assertParse(parser, false, "2006-W27-3T10Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38401);assertParse(parser, false, "2006-W27-3T1Z"); 
 }finally{__CLR4_4_1tfktfkle6rcn3u.R.flushNeeded();}} 


public void test_basicDate862() {__CLR4_4_1tfktfkle6rcn3u.R.globalSliceStart(getClass().getName(),38402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vjxyuktmq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tfktfkle6rcn3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tfktfkle6rcn3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicDate862",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38402,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vjxyuktmq(){try{__CLR4_4_1tfktfkle6rcn3u.R.inc(38402); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38403);DateTimeFormatter parser = ISODateTimeFormat.basicDate(); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38404);assertParse(parser, "20060204", new DateTime(2006, 2, 4, 0, 0, 0, 0)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38405);assertParse(parser, false, "2006024"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38406);assertParse(parser, false, "200602"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38407);assertParse(parser, false, "20061"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38408);assertParse(parser, false, "2006"); 
 }finally{__CLR4_4_1tfktfkle6rcn3u.R.flushNeeded();}} 


public void test_basicTime863() {__CLR4_4_1tfktfkle6rcn3u.R.globalSliceStart(getClass().getName(),38409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h21deatmx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tfktfkle6rcn3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tfktfkle6rcn3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicTime863",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h21deatmx(){try{__CLR4_4_1tfktfkle6rcn3u.R.inc(38409); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38410);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38411);DateTimeFormatter parser = ISODateTimeFormat.basicTime(); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38412);assertParse(parser, "102030.400999999Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38413);assertParse(parser, "102030.400Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38414);assertParse(parser, "102030.40Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38415);assertParse(parser, "102030.4Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38416);assertParse(parser, false, "10203.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38417);assertParse(parser, false, "1020.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38418);assertParse(parser, false, "102.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38419);assertParse(parser, false, "10.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38420);assertParse(parser, false, "1.400Z"); 
 }finally{__CLR4_4_1tfktfkle6rcn3u.R.flushNeeded();}} 


public void test_basicTTimeNoMillis865() {__CLR4_4_1tfktfkle6rcn3u.R.globalSliceStart(getClass().getName(),38421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14p00g9tn9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tfktfkle6rcn3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tfktfkle6rcn3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicTTimeNoMillis865",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14p00g9tn9(){try{__CLR4_4_1tfktfkle6rcn3u.R.inc(38421); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38422);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38423);DateTimeFormatter parser = ISODateTimeFormat.basicTTimeNoMillis(); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38424);assertParse(parser, "T102030Z", new DateTime(1970, 1, 1, 10, 20, 30, 0)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38425);assertParse(parser, false, "T10203Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38426);assertParse(parser, false, "T1020Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38427);assertParse(parser, false, "T102Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38428);assertParse(parser, false, "T10Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38429);assertParse(parser, false, "T1Z"); 
 }finally{__CLR4_4_1tfktfkle6rcn3u.R.flushNeeded();}} 


public void test_basicDateTime866() {__CLR4_4_1tfktfkle6rcn3u.R.globalSliceStart(getClass().getName(),38430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c65qv7tni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tfktfkle6rcn3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tfktfkle6rcn3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicDateTime866",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c65qv7tni(){try{__CLR4_4_1tfktfkle6rcn3u.R.inc(38430); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38431);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38432);DateTimeFormatter parser = ISODateTimeFormat.basicDateTime(); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38433);assertParse(parser, "20061204T102030.400999999Z", new DateTime(2006, 12, 4, 10, 20, 30, 400)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38434);assertParse(parser, "20061204T102030.400Z", new DateTime(2006, 12, 4, 10, 20, 30, 400)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38435);assertParse(parser, "20061204T102030.40Z", new DateTime(2006, 12, 4, 10, 20, 30, 400)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38436);assertParse(parser, "20061204T102030.4Z", new DateTime(2006, 12, 4, 10, 20, 30, 400)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38437);assertParse(parser, false, "2006120T102030.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38438);assertParse(parser, false, "200612T102030.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38439);assertParse(parser, false, "20061T102030.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38440);assertParse(parser, false, "2006T102030.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38441);assertParse(parser, false, "200T102030.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38442);assertParse(parser, false, "20T102030.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38443);assertParse(parser, false, "2T102030.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38444);assertParse(parser, false, "20061204T10203.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38445);assertParse(parser, false, "20061204T1020.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38446);assertParse(parser, false, "20061204T102.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38447);assertParse(parser, false, "20061204T10.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38448);assertParse(parser, false, "20061204T1.400Z"); 
 }finally{__CLR4_4_1tfktfkle6rcn3u.R.flushNeeded();}} 


public void test_basicWeekDateTime869() {__CLR4_4_1tfktfkle6rcn3u.R.globalSliceStart(getClass().getName(),38449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11wjn82to1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tfktfkle6rcn3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tfktfkle6rcn3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicWeekDateTime869",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38449,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11wjn82to1(){try{__CLR4_4_1tfktfkle6rcn3u.R.inc(38449); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38450);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38451);DateTimeFormatter parser = ISODateTimeFormat.basicWeekDateTime(); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38452);assertParse(parser, "2006W273T102030.400999999Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38453);assertParse(parser, "2006W273T102030.400Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38454);assertParse(parser, "2006W273T102030.40Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38455);assertParse(parser, "2006W273T102030.4Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38456);assertParse(parser, false, "2006W27T102030.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38457);assertParse(parser, false, "2006W2T102030.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38458);assertParse(parser, false, "2006W273T10203.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38459);assertParse(parser, false, "2006W273T1020.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38460);assertParse(parser, false, "2006W273T102.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38461);assertParse(parser, false, "2006W273T10.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38462);assertParse(parser, false, "2006W273T1.400Z"); 
 }finally{__CLR4_4_1tfktfkle6rcn3u.R.flushNeeded();}} 


public void test_time1219() {__CLR4_4_1tfktfkle6rcn3u.R.globalSliceStart(getClass().getName(),38463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tfrf06tof();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tfktfkle6rcn3u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tfktfkle6rcn3u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_time1219",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tfrf06tof(){try{__CLR4_4_1tfktfkle6rcn3u.R.inc(38463); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38464);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38465);DateTimeFormatter parser = ISODateTimeFormat.time(); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38466);assertParse(parser, "10:20:30.400999999Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38467);assertParse(parser, "10:20:30.400Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38468);assertParse(parser, "10:20:30.40Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38469);assertParse(parser, "10:20:30.4Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38470);assertParse(parser, "5:6:7.8Z", new DateTime(1970, 1, 1, 5, 6, 7, 800)); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38471);assertParse(parser, false, "10:20.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38472);assertParse(parser, false, "10:2.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38473);assertParse(parser, false, "10.400Z"); 
     __CLR4_4_1tfktfkle6rcn3u.R.inc(38474);assertParse(parser, false, "1.400Z"); 
 }finally{__CLR4_4_1tfktfkle6rcn3u.R.flushNeeded();}} 

    

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
    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    private void assertParse(DateTimeFormatter parser, boolean expected, String str) {try{__CLR4_4_1tfktfkle6rcn3u.R.inc(38475);
        __CLR4_4_1tfktfkle6rcn3u.R.inc(38476);if ((((expected)&&(__CLR4_4_1tfktfkle6rcn3u.R.iget(38477)!=0|true))||(__CLR4_4_1tfktfkle6rcn3u.R.iget(38478)==0&false))) {{
            __CLR4_4_1tfktfkle6rcn3u.R.inc(38479);parser.parseMillis(str);
        } }else {{
            __CLR4_4_1tfktfkle6rcn3u.R.inc(38480);try {
                __CLR4_4_1tfktfkle6rcn3u.R.inc(38481);parser.parseMillis(str);
                __CLR4_4_1tfktfkle6rcn3u.R.inc(38482);fail();
            } catch (IllegalArgumentException ex) {
                // expected
            }
        }
    }}finally{__CLR4_4_1tfktfkle6rcn3u.R.flushNeeded();}}

    private void assertParse(DateTimeFormatter parser, String str, DateTime expected) {try{__CLR4_4_1tfktfkle6rcn3u.R.inc(38483);
        __CLR4_4_1tfktfkle6rcn3u.R.inc(38484);DateTime dt = parser.parseDateTime(str);
        __CLR4_4_1tfktfkle6rcn3u.R.inc(38485);assertEquals(expected, dt);
    }finally{__CLR4_4_1tfktfkle6rcn3u.R.flushNeeded();}}

}
