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
public class TestDateTimeFormatterBuilder extends TestCase {static class __CLR4_4_1t5zt5zle6qsfnn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,37981,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    private static final DateTimeZone LOS_ANGELES = DateTimeZone.forID("America/Los_Angeles");

    public static void main(String[] args) {try{__CLR4_4_1t5zt5zle6qsfnn.R.inc(37799);
        __CLR4_4_1t5zt5zle6qsfnn.R.inc(37800);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1t5zt5zle6qsfnn.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1t5zt5zle6qsfnn.R.inc(37801);
        __CLR4_4_1t5zt5zle6qsfnn.R.inc(37802);return new TestSuite(TestDateTimeFormatterBuilder.class);
    }finally{__CLR4_4_1t5zt5zle6qsfnn.R.flushNeeded();}}

    public TestDateTimeFormatterBuilder(String name) {
        super(name);__CLR4_4_1t5zt5zle6qsfnn.R.inc(37804);try{__CLR4_4_1t5zt5zle6qsfnn.R.inc(37803);
    }finally{__CLR4_4_1t5zt5zle6qsfnn.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1t5zt5zle6qsfnn.R.inc(37805);
    }finally{__CLR4_4_1t5zt5zle6qsfnn.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1t5zt5zle6qsfnn.R.inc(37806);
    }finally{__CLR4_4_1t5zt5zle6qsfnn.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_appendFixedDecimal383() {__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceStart(getClass().getName(),37807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gt7k9bt67();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5zt5zle6qsfnn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendFixedDecimal383",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gt7k9bt67(){try{__CLR4_4_1t5zt5zle6qsfnn.R.inc(37807); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37808);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37809);bld.appendFixedDecimal(DateTimeFieldType.year(), 4); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37810);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37811);assertEquals("2007", f.print(new DateTime("2007-01-01"))); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37812);assertEquals("0123", f.print(new DateTime("123-01-01"))); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37813);assertEquals("0001", f.print(new DateTime("1-2-3"))); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37814);assertEquals("99999", f.print(new DateTime("99999-2-3"))); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37815);assertEquals("-0099", f.print(new DateTime("-99-2-3"))); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37816);assertEquals("0000", f.print(new DateTime("0-2-3"))); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37817);assertEquals(2001, f.parseDateTime("2001").getYear()); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37818);try { 
         __CLR4_4_1t5zt5zle6qsfnn.R.inc(37819);f.parseDateTime("-2001"); 
         __CLR4_4_1t5zt5zle6qsfnn.R.inc(37820);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37821);try { 
         __CLR4_4_1t5zt5zle6qsfnn.R.inc(37822);f.parseDateTime("200"); 
         __CLR4_4_1t5zt5zle6qsfnn.R.inc(37823);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37824);try { 
         __CLR4_4_1t5zt5zle6qsfnn.R.inc(37825);f.parseDateTime("20016"); 
         __CLR4_4_1t5zt5zle6qsfnn.R.inc(37826);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37827);bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37828);bld.appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37829);bld.appendLiteral(':'); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37830);bld.appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37831);bld.appendLiteral(':'); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37832);bld.appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37833);f = bld.toFormatter(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37834);assertEquals("01:02:34", f.print(new DateTime("T1:2:34"))); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37835);DateTime dt = f.parseDateTime("01:02:34"); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37836);assertEquals(1, dt.getHourOfDay()); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37837);assertEquals(2, dt.getMinuteOfHour()); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37838);assertEquals(34, dt.getSecondOfMinute()); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37839);try { 
         __CLR4_4_1t5zt5zle6qsfnn.R.inc(37840);f.parseDateTime("0145:02:34"); 
         __CLR4_4_1t5zt5zle6qsfnn.R.inc(37841);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37842);try { 
         __CLR4_4_1t5zt5zle6qsfnn.R.inc(37843);f.parseDateTime("01:0:34"); 
         __CLR4_4_1t5zt5zle6qsfnn.R.inc(37844);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
 }finally{__CLR4_4_1t5zt5zle6qsfnn.R.flushNeeded();}} 


public void test_printParseOffset545() {__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceStart(getClass().getName(),37845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cjntfbt79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5zt5zle6qsfnn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseOffset545",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37845,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cjntfbt79(){try{__CLR4_4_1t5zt5zle6qsfnn.R.inc(37845); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37846);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37847);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37848);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37849);assertEquals("2007-03-04 12:30 +09:00", f.print(dt)); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37850);assertEquals(dt.withZone(DateTimeZone.getDefault()), f.parseDateTime("2007-03-04 12:30 +09:00")); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37851);assertEquals(dt, f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +09:00")); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37852);assertEquals(dt.withZone(DateTimeZone.forOffsetHours(9)), f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +09:00")); 
 }finally{__CLR4_4_1t5zt5zle6qsfnn.R.flushNeeded();}} 


public void test_toPrinter1093() {__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceStart(getClass().getName(),37853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vpysxat7h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5zt5zle6qsfnn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_toPrinter1093",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37853,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vpysxat7h(){try{__CLR4_4_1t5zt5zle6qsfnn.R.inc(37853); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37854);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37855);try { 
         __CLR4_4_1t5zt5zle6qsfnn.R.inc(37856);bld.toPrinter(); 
         __CLR4_4_1t5zt5zle6qsfnn.R.inc(37857);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37858);bld.appendLiteral('X'); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37859);assertNotNull(bld.toPrinter()); 
 }finally{__CLR4_4_1t5zt5zle6qsfnn.R.flushNeeded();}} 


public void test_toFormatter1094() {__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceStart(getClass().getName(),37860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p34nmrt7o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5zt5zle6qsfnn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_toFormatter1094",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37860,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p34nmrt7o(){try{__CLR4_4_1t5zt5zle6qsfnn.R.inc(37860); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37861);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37862);try { 
         __CLR4_4_1t5zt5zle6qsfnn.R.inc(37863);bld.toFormatter(); 
         __CLR4_4_1t5zt5zle6qsfnn.R.inc(37864);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37865);bld.appendLiteral('X'); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37866);assertNotNull(bld.toFormatter()); 
 }finally{__CLR4_4_1t5zt5zle6qsfnn.R.flushNeeded();}} 


public void test_toParser1095() {__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceStart(getClass().getName(),37867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w8cuixt7v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5zt5zle6qsfnn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_toParser1095",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w8cuixt7v(){try{__CLR4_4_1t5zt5zle6qsfnn.R.inc(37867); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37868);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37869);try { 
         __CLR4_4_1t5zt5zle6qsfnn.R.inc(37870);bld.toParser(); 
         __CLR4_4_1t5zt5zle6qsfnn.R.inc(37871);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37872);bld.appendLiteral('X'); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37873);assertNotNull(bld.toParser()); 
 }finally{__CLR4_4_1t5zt5zle6qsfnn.R.flushNeeded();}} 


public void test_canBuildFormatter1096() {__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceStart(getClass().getName(),37874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_152rzj2t82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5zt5zle6qsfnn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_canBuildFormatter1096",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_152rzj2t82(){try{__CLR4_4_1t5zt5zle6qsfnn.R.inc(37874); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37875);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37876);assertEquals(false, bld.canBuildFormatter()); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37877);bld.appendLiteral('X'); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37878);assertEquals(true, bld.canBuildFormatter()); 
 }finally{__CLR4_4_1t5zt5zle6qsfnn.R.flushNeeded();}} 


public void test_canBuildPrinter1097() {__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceStart(getClass().getName(),37879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cq6zf7t87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5zt5zle6qsfnn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_canBuildPrinter1097",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cq6zf7t87(){try{__CLR4_4_1t5zt5zle6qsfnn.R.inc(37879); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37880);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37881);assertEquals(false, bld.canBuildPrinter()); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37882);bld.appendLiteral('X'); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37883);assertEquals(true, bld.canBuildPrinter()); 
 }finally{__CLR4_4_1t5zt5zle6qsfnn.R.flushNeeded();}} 


public void test_append_Formatter1098() {__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceStart(getClass().getName(),37884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ue1d3rt8c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5zt5zle6qsfnn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Formatter1098",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37884,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ue1d3rt8c(){try{__CLR4_4_1t5zt5zle6qsfnn.R.inc(37884); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37885);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37886);bld.appendLiteral('Y'); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37887);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37888);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37889);bld2.appendLiteral('X'); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37890);bld2.append(f); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37891);bld2.appendLiteral('Z'); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37892);assertEquals("XYZ", bld2.toFormatter().print(0L)); 
 }finally{__CLR4_4_1t5zt5zle6qsfnn.R.flushNeeded();}} 


public void test_append_Printer1099() {__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceStart(getClass().getName(),37893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyvaygt8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5zt5zle6qsfnn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Printer1099",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37893,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyvaygt8l(){try{__CLR4_4_1t5zt5zle6qsfnn.R.inc(37893); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37894);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37895);bld.appendLiteral('Y'); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37896);DateTimePrinter p = bld.toPrinter(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37897);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37898);bld2.appendLiteral('X'); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37899);bld2.append(p); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37900);bld2.appendLiteral('Z'); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37901);DateTimeFormatter f = bld2.toFormatter(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37902);assertEquals(true, f.isPrinter()); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37903);assertEquals(false, f.isParser()); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37904);assertEquals("XYZ", f.print(0L)); 
 }finally{__CLR4_4_1t5zt5zle6qsfnn.R.flushNeeded();}} 


public void test_append_nullParser1100() {__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceStart(getClass().getName(),37905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13w1iwrt8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5zt5zle6qsfnn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_nullParser1100",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13w1iwrt8x(){try{__CLR4_4_1t5zt5zle6qsfnn.R.inc(37905); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37906);try { 
         __CLR4_4_1t5zt5zle6qsfnn.R.inc(37907);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
         __CLR4_4_1t5zt5zle6qsfnn.R.inc(37908);bld2.append((DateTimeParser) null); 
         __CLR4_4_1t5zt5zle6qsfnn.R.inc(37909);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1t5zt5zle6qsfnn.R.flushNeeded();}} 


public void test_append_Parser1101() {__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceStart(getClass().getName(),37910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_157x7nlt92();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5zt5zle6qsfnn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Parser1101",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37910,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_157x7nlt92(){try{__CLR4_4_1t5zt5zle6qsfnn.R.inc(37910); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37911);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37912);bld.appendLiteral('Y'); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37913);DateTimeParser p = bld.toParser(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37914);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37915);bld2.appendLiteral('X'); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37916);bld2.append(p); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37917);bld2.appendLiteral('Z'); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37918);DateTimeFormatter f = bld2.toFormatter(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37919);assertEquals(false, f.isPrinter()); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37920);assertEquals(true, f.isParser()); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37921);assertEquals(0, f.withZoneUTC().parseMillis("XYZ")); 
 }finally{__CLR4_4_1t5zt5zle6qsfnn.R.flushNeeded();}} 


public void test_append_Printer_nullParser1102() {__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceStart(getClass().getName(),37922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h7eyust9e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5zt5zle6qsfnn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Printer_nullParser1102",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h7eyust9e(){try{__CLR4_4_1t5zt5zle6qsfnn.R.inc(37922); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37923);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37924);bld.appendLiteral('Y'); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37925);DateTimePrinter p = bld.toPrinter(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37926);try { 
         __CLR4_4_1t5zt5zle6qsfnn.R.inc(37927);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
         __CLR4_4_1t5zt5zle6qsfnn.R.inc(37928);bld2.append(p, (DateTimeParser) null); 
         __CLR4_4_1t5zt5zle6qsfnn.R.inc(37929);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1t5zt5zle6qsfnn.R.flushNeeded();}} 


public void test_appendOptional_Parser1103() {__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceStart(getClass().getName(),37930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112pqynt9m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5zt5zle6qsfnn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendOptional_Parser1103",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112pqynt9m(){try{__CLR4_4_1t5zt5zle6qsfnn.R.inc(37930); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37931);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37932);bld.appendLiteral('Y'); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37933);DateTimeParser p = bld.toParser(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37934);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37935);bld2.appendLiteral('X'); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37936);bld2.appendOptional(p); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37937);bld2.appendLiteral('Z'); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37938);DateTimeFormatter f = bld2.toFormatter(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37939);assertEquals(false, f.isPrinter()); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37940);assertEquals(true, f.isParser()); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37941);assertEquals(0, f.withZoneUTC().parseMillis("XYZ")); 
 }finally{__CLR4_4_1t5zt5zle6qsfnn.R.flushNeeded();}} 


public void test_appendFixedSignedDecimal1105() {__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceStart(getClass().getName(),37942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j848a4t9y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5zt5zle6qsfnn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendFixedSignedDecimal1105",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37942,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j848a4t9y(){try{__CLR4_4_1t5zt5zle6qsfnn.R.inc(37942); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37943);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37944);bld.appendFixedSignedDecimal(DateTimeFieldType.year(), 4); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37945);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37946);assertEquals("2007", f.print(new DateTime("2007-01-01"))); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37947);assertEquals("0123", f.print(new DateTime("123-01-01"))); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37948);assertEquals("0001", f.print(new DateTime("1-2-3"))); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37949);assertEquals("99999", f.print(new DateTime("99999-2-3"))); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37950);assertEquals("-0099", f.print(new DateTime("-99-2-3"))); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37951);assertEquals("0000", f.print(new DateTime("0-2-3"))); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37952);assertEquals(2001, f.parseDateTime("2001").getYear()); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37953);assertEquals(-2001, f.parseDateTime("-2001").getYear()); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37954);assertEquals(2001, f.parseDateTime("+2001").getYear()); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37955);try { 
         __CLR4_4_1t5zt5zle6qsfnn.R.inc(37956);f.parseDateTime("20016"); 
         __CLR4_4_1t5zt5zle6qsfnn.R.inc(37957);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
 }finally{__CLR4_4_1t5zt5zle6qsfnn.R.flushNeeded();}} 


public void test_printParseZoneParis1111() {__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceStart(getClass().getName(),37958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ibye9ftae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5zt5zle6qsfnn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneParis1111",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ibye9ftae(){try{__CLR4_4_1t5zt5zle6qsfnn.R.inc(37958); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37959);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37960);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37961);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, PARIS); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37962);assertEquals("2007-03-04 12:30 Europe/Paris", f.print(dt)); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37963);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 Europe/Paris")); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37964);assertEquals(dt, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 Europe/Paris")); 
 }finally{__CLR4_4_1t5zt5zle6qsfnn.R.flushNeeded();}} 


public void test_parseWrongOffsetAndZone1118() {__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceStart(getClass().getName(),37965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ukwsa1tal();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5zt5zle6qsfnn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_parseWrongOffsetAndZone1118",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37965,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ukwsa1tal(){try{__CLR4_4_1t5zt5zle6qsfnn.R.inc(37965); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37966);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2).appendLiteral(' ').appendTimeZoneId(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37967);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37968);DateTime expected = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forOffsetHours(7)); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37969);assertEquals(expected.withZone(TOKYO), f.parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo")); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37970);assertEquals(expected.withZone(TOKYO), f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo")); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37971);assertEquals(expected, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo")); 
 }finally{__CLR4_4_1t5zt5zle6qsfnn.R.flushNeeded();}} 


public void test_appendTimeZoneId1119() {__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceStart(getClass().getName(),37972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vjxtvatas();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t5zt5zle6qsfnn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t5zt5zle6qsfnn.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendTimeZoneId1119",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37972,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vjxtvatas(){try{__CLR4_4_1t5zt5zle6qsfnn.R.inc(37972); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37973);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37974);bld.appendTimeZoneId(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37975);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37976);assertEquals("Asia/Tokyo", f.print(new DateTime(2007, 3, 4, 0, 0, 0, TOKYO))); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37977);assertEquals(TOKYO, f.parseDateTime("Asia/Tokyo").getZone()); 
     __CLR4_4_1t5zt5zle6qsfnn.R.inc(37978);try { 
         __CLR4_4_1t5zt5zle6qsfnn.R.inc(37979);f.parseDateTime("Nonsense"); 
         __CLR4_4_1t5zt5zle6qsfnn.R.inc(37980);fail(); 
     } catch (IllegalArgumentException e) { 
     } 
 }finally{__CLR4_4_1t5zt5zle6qsfnn.R.flushNeeded();}} 

    

    

    

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
