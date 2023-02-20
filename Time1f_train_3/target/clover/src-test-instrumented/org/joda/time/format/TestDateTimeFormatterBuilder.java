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
public class TestDateTimeFormatterBuilder extends TestCase {static class __CLR4_4_1t6it6ile6rcn21{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,37966,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    private static final DateTimeZone LOS_ANGELES = DateTimeZone.forID("America/Los_Angeles");

    public static void main(String[] args) {try{__CLR4_4_1t6it6ile6rcn21.R.inc(37818);
        __CLR4_4_1t6it6ile6rcn21.R.inc(37819);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1t6it6ile6rcn21.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1t6it6ile6rcn21.R.inc(37820);
        __CLR4_4_1t6it6ile6rcn21.R.inc(37821);return new TestSuite(TestDateTimeFormatterBuilder.class);
    }finally{__CLR4_4_1t6it6ile6rcn21.R.flushNeeded();}}

    public TestDateTimeFormatterBuilder(String name) {
        super(name);__CLR4_4_1t6it6ile6rcn21.R.inc(37823);try{__CLR4_4_1t6it6ile6rcn21.R.inc(37822);
    }finally{__CLR4_4_1t6it6ile6rcn21.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1t6it6ile6rcn21.R.inc(37824);
    }finally{__CLR4_4_1t6it6ile6rcn21.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1t6it6ile6rcn21.R.inc(37825);
    }finally{__CLR4_4_1t6it6ile6rcn21.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_parseWrongOffset206() {__CLR4_4_1t6it6ile6rcn21.R.globalSliceStart(getClass().getName(),37826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nmf4sbt6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6it6ile6rcn21.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6it6ile6rcn21.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_parseWrongOffset206",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nmf4sbt6q(){try{__CLR4_4_1t6it6ile6rcn21.R.inc(37826); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37827);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37828);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37829);DateTime expected = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forOffsetHours(7)); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37830);assertEquals(expected.withZone(TOKYO), f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +07:00")); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37831);assertEquals(expected, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +07:00")); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37832);assertEquals(expected.withZone(DateTimeZone.getDefault()), f.parseDateTime("2007-03-04 12:30 +07:00")); 
 }finally{__CLR4_4_1t6it6ile6rcn21.R.flushNeeded();}} 


public void test_printParseOffset577() {__CLR4_4_1t6it6ile6rcn21.R.globalSliceStart(getClass().getName(),37833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xuznbet6x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6it6ile6rcn21.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6it6ile6rcn21.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseOffset577",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xuznbet6x(){try{__CLR4_4_1t6it6ile6rcn21.R.inc(37833); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37834);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37835);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37836);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37837);assertEquals("2007-03-04 12:30 +09:00", f.print(dt)); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37838);assertEquals(dt.withZone(DateTimeZone.getDefault()), f.parseDateTime("2007-03-04 12:30 +09:00")); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37839);assertEquals(dt, f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +09:00")); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37840);assertEquals(dt.withZone(DateTimeZone.forOffsetHours(9)), f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +09:00")); 
 }finally{__CLR4_4_1t6it6ile6rcn21.R.flushNeeded();}} 


public void test_toPrinter1092() {__CLR4_4_1t6it6ile6rcn21.R.globalSliceStart(getClass().getName(),37841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yyyrprt75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6it6ile6rcn21.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6it6ile6rcn21.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_toPrinter1092",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37841,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yyyrprt75(){try{__CLR4_4_1t6it6ile6rcn21.R.inc(37841); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37842);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37843);try { 
         __CLR4_4_1t6it6ile6rcn21.R.inc(37844);bld.toPrinter(); 
         __CLR4_4_1t6it6ile6rcn21.R.inc(37845);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37846);bld.appendLiteral('X'); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37847);assertNotNull(bld.toPrinter()); 
 }finally{__CLR4_4_1t6it6ile6rcn21.R.flushNeeded();}} 


public void test_toFormatter1093() {__CLR4_4_1t6it6ile6rcn21.R.globalSliceStart(getClass().getName(),37848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lu4ouat7c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6it6ile6rcn21.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6it6ile6rcn21.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_toFormatter1093",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lu4ouat7c(){try{__CLR4_4_1t6it6ile6rcn21.R.inc(37848); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37849);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37850);try { 
         __CLR4_4_1t6it6ile6rcn21.R.inc(37851);bld.toFormatter(); 
         __CLR4_4_1t6it6ile6rcn21.R.inc(37852);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37853);bld.appendLiteral('X'); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37854);assertNotNull(bld.toFormatter()); 
 }finally{__CLR4_4_1t6it6ile6rcn21.R.flushNeeded();}} 


public void test_append_nullPrinter_Parser1094() {__CLR4_4_1t6it6ile6rcn21.R.globalSliceStart(getClass().getName(),37855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uq4o4ct7j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6it6ile6rcn21.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6it6ile6rcn21.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_nullPrinter_Parser1094",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uq4o4ct7j(){try{__CLR4_4_1t6it6ile6rcn21.R.inc(37855); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37856);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37857);bld.appendLiteral('Y'); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37858);DateTimeParser p = bld.toParser(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37859);try { 
         __CLR4_4_1t6it6ile6rcn21.R.inc(37860);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
         __CLR4_4_1t6it6ile6rcn21.R.inc(37861);bld2.append((DateTimePrinter) null, p); 
         __CLR4_4_1t6it6ile6rcn21.R.inc(37862);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1t6it6ile6rcn21.R.flushNeeded();}} 


public void test_toParser1095() {__CLR4_4_1t6it6ile6rcn21.R.globalSliceStart(getClass().getName(),37863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w8cuixt7r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6it6ile6rcn21.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6it6ile6rcn21.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_toParser1095",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w8cuixt7r(){try{__CLR4_4_1t6it6ile6rcn21.R.inc(37863); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37864);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37865);try { 
         __CLR4_4_1t6it6ile6rcn21.R.inc(37866);bld.toParser(); 
         __CLR4_4_1t6it6ile6rcn21.R.inc(37867);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37868);bld.appendLiteral('X'); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37869);assertNotNull(bld.toParser()); 
 }finally{__CLR4_4_1t6it6ile6rcn21.R.flushNeeded();}} 


public void test_canBuildFormatter1096() {__CLR4_4_1t6it6ile6rcn21.R.globalSliceStart(getClass().getName(),37870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_152rzj2t7y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6it6ile6rcn21.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6it6ile6rcn21.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_canBuildFormatter1096",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_152rzj2t7y(){try{__CLR4_4_1t6it6ile6rcn21.R.inc(37870); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37871);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37872);assertEquals(false, bld.canBuildFormatter()); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37873);bld.appendLiteral('X'); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37874);assertEquals(true, bld.canBuildFormatter()); 
 }finally{__CLR4_4_1t6it6ile6rcn21.R.flushNeeded();}} 


public void test_canBuildPrinter1097() {__CLR4_4_1t6it6ile6rcn21.R.globalSliceStart(getClass().getName(),37875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cq6zf7t83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6it6ile6rcn21.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6it6ile6rcn21.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_canBuildPrinter1097",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37875,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cq6zf7t83(){try{__CLR4_4_1t6it6ile6rcn21.R.inc(37875); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37876);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37877);assertEquals(false, bld.canBuildPrinter()); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37878);bld.appendLiteral('X'); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37879);assertEquals(true, bld.canBuildPrinter()); 
 }finally{__CLR4_4_1t6it6ile6rcn21.R.flushNeeded();}} 


public void test_canBuildParser1098() {__CLR4_4_1t6it6ile6rcn21.R.globalSliceStart(getClass().getName(),37880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s18japt88();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6it6ile6rcn21.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6it6ile6rcn21.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_canBuildParser1098",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s18japt88(){try{__CLR4_4_1t6it6ile6rcn21.R.inc(37880); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37881);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37882);assertEquals(false, bld.canBuildParser()); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37883);bld.appendLiteral('X'); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37884);assertEquals(true, bld.canBuildParser()); 
 }finally{__CLR4_4_1t6it6ile6rcn21.R.flushNeeded();}} 


public void test_append_Formatter1099() {__CLR4_4_1t6it6ile6rcn21.R.globalSliceStart(getClass().getName(),37885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xn1bw8t8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6it6ile6rcn21.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6it6ile6rcn21.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Formatter1099",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xn1bw8t8d(){try{__CLR4_4_1t6it6ile6rcn21.R.inc(37885); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37886);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37887);bld.appendLiteral('Y'); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37888);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37889);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37890);bld2.appendLiteral('X'); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37891);bld2.append(f); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37892);bld2.appendLiteral('Z'); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37893);assertEquals("XYZ", bld2.toFormatter().print(0L)); 
 }finally{__CLR4_4_1t6it6ile6rcn21.R.flushNeeded();}} 


public void test_append_Printer1100() {__CLR4_4_1t6it6ile6rcn21.R.globalSliceStart(getClass().getName(),37894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rozlx3t8m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6it6ile6rcn21.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6it6ile6rcn21.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Printer1100",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rozlx3t8m(){try{__CLR4_4_1t6it6ile6rcn21.R.inc(37894); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37895);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37896);bld.appendLiteral('Y'); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37897);DateTimePrinter p = bld.toPrinter(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37898);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37899);bld2.appendLiteral('X'); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37900);bld2.append(p); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37901);bld2.appendLiteral('Z'); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37902);DateTimeFormatter f = bld2.toFormatter(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37903);assertEquals(true, f.isPrinter()); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37904);assertEquals(false, f.isParser()); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37905);assertEquals("XYZ", f.print(0L)); 
 }finally{__CLR4_4_1t6it6ile6rcn21.R.flushNeeded();}} 


public void test_append_nullParser1101() {__CLR4_4_1t6it6ile6rcn21.R.globalSliceStart(getClass().getName(),37906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n1k4at8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6it6ile6rcn21.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6it6ile6rcn21.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_nullParser1101",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n1k4at8y(){try{__CLR4_4_1t6it6ile6rcn21.R.inc(37906); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37907);try { 
         __CLR4_4_1t6it6ile6rcn21.R.inc(37908);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
         __CLR4_4_1t6it6ile6rcn21.R.inc(37909);bld2.append((DateTimeParser) null); 
         __CLR4_4_1t6it6ile6rcn21.R.inc(37910);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1t6it6ile6rcn21.R.flushNeeded();}} 


public void test_append_Parser1102() {__CLR4_4_1t6it6ile6rcn21.R.globalSliceStart(getClass().getName(),37911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11yx8v4t93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6it6ile6rcn21.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6it6ile6rcn21.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Parser1102",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37911,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11yx8v4t93(){try{__CLR4_4_1t6it6ile6rcn21.R.inc(37911); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37912);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37913);bld.appendLiteral('Y'); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37914);DateTimeParser p = bld.toParser(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37915);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37916);bld2.appendLiteral('X'); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37917);bld2.append(p); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37918);bld2.appendLiteral('Z'); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37919);DateTimeFormatter f = bld2.toFormatter(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37920);assertEquals(false, f.isPrinter()); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37921);assertEquals(true, f.isParser()); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37922);assertEquals(0, f.withZoneUTC().parseMillis("XYZ")); 
 }finally{__CLR4_4_1t6it6ile6rcn21.R.flushNeeded();}} 


public void test_append_Printer_nullParser1103() {__CLR4_4_1t6it6ile6rcn21.R.globalSliceStart(getClass().getName(),37923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dyf02bt9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6it6ile6rcn21.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6it6ile6rcn21.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Printer_nullParser1103",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37923,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dyf02bt9f(){try{__CLR4_4_1t6it6ile6rcn21.R.inc(37923); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37924);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37925);bld.appendLiteral('Y'); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37926);DateTimePrinter p = bld.toPrinter(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37927);try { 
         __CLR4_4_1t6it6ile6rcn21.R.inc(37928);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
         __CLR4_4_1t6it6ile6rcn21.R.inc(37929);bld2.append(p, (DateTimeParser) null); 
         __CLR4_4_1t6it6ile6rcn21.R.inc(37930);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1t6it6ile6rcn21.R.flushNeeded();}} 


public void test_appendOptional_Parser1104() {__CLR4_4_1t6it6ile6rcn21.R.globalSliceStart(getClass().getName(),37931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_126a7tut9n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6it6ile6rcn21.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6it6ile6rcn21.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendOptional_Parser1104",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37931,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_126a7tut9n(){try{__CLR4_4_1t6it6ile6rcn21.R.inc(37931); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37932);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37933);bld.appendLiteral('Y'); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37934);DateTimeParser p = bld.toParser(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37935);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37936);bld2.appendLiteral('X'); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37937);bld2.appendOptional(p); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37938);bld2.appendLiteral('Z'); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37939);DateTimeFormatter f = bld2.toFormatter(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37940);assertEquals(false, f.isPrinter()); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37941);assertEquals(true, f.isParser()); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37942);assertEquals(0, f.withZoneUTC().parseMillis("XYZ")); 
 }finally{__CLR4_4_1t6it6ile6rcn21.R.flushNeeded();}} 


public void test_printParseZoneParis1110() {__CLR4_4_1t6it6ile6rcn21.R.globalSliceStart(getClass().getName(),37943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2yfgyt9z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6it6ile6rcn21.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6it6ile6rcn21.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneParis1110",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37943,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2yfgyt9z(){try{__CLR4_4_1t6it6ile6rcn21.R.inc(37943); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37944);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37945);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37946);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, PARIS); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37947);assertEquals("2007-03-04 12:30 Europe/Paris", f.print(dt)); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37948);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 Europe/Paris")); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37949);assertEquals(dt, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 Europe/Paris")); 
 }finally{__CLR4_4_1t6it6ile6rcn21.R.flushNeeded();}} 


public void test_parseWrongOffsetAndZone1117() {__CLR4_4_1t6it6ile6rcn21.R.globalSliceStart(getClass().getName(),37950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xtwr2ita6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6it6ile6rcn21.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6it6ile6rcn21.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_parseWrongOffsetAndZone1117",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37950,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xtwr2ita6(){try{__CLR4_4_1t6it6ile6rcn21.R.inc(37950); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37951);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2).appendLiteral(' ').appendTimeZoneId(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37952);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37953);DateTime expected = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forOffsetHours(7)); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37954);assertEquals(expected.withZone(TOKYO), f.parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo")); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37955);assertEquals(expected.withZone(TOKYO), f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo")); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37956);assertEquals(expected, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo")); 
 }finally{__CLR4_4_1t6it6ile6rcn21.R.flushNeeded();}} 


public void test_appendTimeZoneId1118() {__CLR4_4_1t6it6ile6rcn21.R.globalSliceStart(getClass().getName(),37957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ysxsnrtad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6it6ile6rcn21.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6it6ile6rcn21.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendTimeZoneId1118",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37957,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ysxsnrtad(){try{__CLR4_4_1t6it6ile6rcn21.R.inc(37957); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37958);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37959);bld.appendTimeZoneId(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37960);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37961);assertEquals("Asia/Tokyo", f.print(new DateTime(2007, 3, 4, 0, 0, 0, TOKYO))); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37962);assertEquals(TOKYO, f.parseDateTime("Asia/Tokyo").getZone()); 
     __CLR4_4_1t6it6ile6rcn21.R.inc(37963);try { 
         __CLR4_4_1t6it6ile6rcn21.R.inc(37964);f.parseDateTime("Nonsense"); 
         __CLR4_4_1t6it6ile6rcn21.R.inc(37965);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
 }finally{__CLR4_4_1t6it6ile6rcn21.R.flushNeeded();}} 

    

    

    

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
