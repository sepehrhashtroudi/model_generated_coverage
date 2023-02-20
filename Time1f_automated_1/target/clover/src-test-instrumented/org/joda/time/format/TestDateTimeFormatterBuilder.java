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
public class TestDateTimeFormatterBuilder extends TestCase {static class __CLR4_4_1mcdmcdle6ndq5e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,29031,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    private static final DateTimeZone LOS_ANGELES = DateTimeZone.forID("America/Los_Angeles");

    public static void main(String[] args) {try{__CLR4_4_1mcdmcdle6ndq5e.R.inc(28957);
        __CLR4_4_1mcdmcdle6ndq5e.R.inc(28958);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mcdmcdle6ndq5e.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mcdmcdle6ndq5e.R.inc(28959);
        __CLR4_4_1mcdmcdle6ndq5e.R.inc(28960);return new TestSuite(TestDateTimeFormatterBuilder.class);
    }finally{__CLR4_4_1mcdmcdle6ndq5e.R.flushNeeded();}}

    public TestDateTimeFormatterBuilder(String name) {
        super(name);__CLR4_4_1mcdmcdle6ndq5e.R.inc(28962);try{__CLR4_4_1mcdmcdle6ndq5e.R.inc(28961);
    }finally{__CLR4_4_1mcdmcdle6ndq5e.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mcdmcdle6ndq5e.R.inc(28963);
    }finally{__CLR4_4_1mcdmcdle6ndq5e.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mcdmcdle6ndq5e.R.inc(28964);
    }finally{__CLR4_4_1mcdmcdle6ndq5e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_toFormatter516() {__CLR4_4_1mcdmcdle6ndq5e.R.globalSliceStart(getClass().getName(),28965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1npyv5tmcl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mcdmcdle6ndq5e.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mcdmcdle6ndq5e.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_toFormatter516",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28965,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1npyv5tmcl(){try{__CLR4_4_1mcdmcdle6ndq5e.R.inc(28965); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(28966);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(28967);bld.appendLiteral('Y'); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(28968);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(28969);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(28970);bld2.appendLiteral('X'); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(28971);bld2.append(f); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(28972);bld2.appendLiteral('Z'); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(28973);assertEquals("XYZ", bld2.toFormatter().print(0L)); 
 }finally{__CLR4_4_1mcdmcdle6ndq5e.R.flushNeeded();}}
public void test_append_nullPrinter_Parser517() {__CLR4_4_1mcdmcdle6ndq5e.R.globalSliceStart(getClass().getName(),28974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1atchc1mcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mcdmcdle6ndq5e.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mcdmcdle6ndq5e.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_nullPrinter_Parser517",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1atchc1mcu(){try{__CLR4_4_1mcdmcdle6ndq5e.R.inc(28974); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(28975);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(28976);bld.appendLiteral('Y'); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(28977);DateTimeParser p = bld.toParser(); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(28978);try { 
         __CLR4_4_1mcdmcdle6ndq5e.R.inc(28979);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
         __CLR4_4_1mcdmcdle6ndq5e.R.inc(28980);bld2.append((DateTimePrinter) null, p); 
         __CLR4_4_1mcdmcdle6ndq5e.R.inc(28981);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1mcdmcdle6ndq5e.R.flushNeeded();}}
public void test_toPrinter518() {__CLR4_4_1mcdmcdle6ndq5e.R.globalSliceStart(getClass().getName(),28982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1578pn3md2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mcdmcdle6ndq5e.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mcdmcdle6ndq5e.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_toPrinter518",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1578pn3md2(){try{__CLR4_4_1mcdmcdle6ndq5e.R.inc(28982); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(28983);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(28984);try { 
         __CLR4_4_1mcdmcdle6ndq5e.R.inc(28985);bld.toPrinter(); 
         __CLR4_4_1mcdmcdle6ndq5e.R.inc(28986);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(28987);bld.appendLiteral('X'); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(28988);assertNotNull(bld.toPrinter()); 
 }finally{__CLR4_4_1mcdmcdle6ndq5e.R.flushNeeded();}}
public void test_canBuildPrinter519() {__CLR4_4_1mcdmcdle6ndq5e.R.globalSliceStart(getClass().getName(),28989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xpz2jmd9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mcdmcdle6ndq5e.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mcdmcdle6ndq5e.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_canBuildPrinter519",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28989,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xpz2jmd9(){try{__CLR4_4_1mcdmcdle6ndq5e.R.inc(28989); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(28990);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(28991);assertEquals(false, bld.canBuildPrinter()); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(28992);bld.appendLiteral('X'); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(28993);assertEquals(true, bld.canBuildPrinter()); 
 }finally{__CLR4_4_1mcdmcdle6ndq5e.R.flushNeeded();}}
public void test_appendLiteral521() {__CLR4_4_1mcdmcdle6ndq5e.R.globalSliceStart(getClass().getName(),28994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17dymybmde();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mcdmcdle6ndq5e.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mcdmcdle6ndq5e.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendLiteral521",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28994,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17dymybmde(){try{__CLR4_4_1mcdmcdle6ndq5e.R.inc(28994); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(28995);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(28996);bld.appendLiteral('Y'); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(28997);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(28998);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(28999);bld2.appendLiteral('X'); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29000);bld2.append(f); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29001);bld2.appendLiteral('Z'); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29002);assertEquals("XYZ", bld2.toFormatter().print(0L)); 
 }finally{__CLR4_4_1mcdmcdle6ndq5e.R.flushNeeded();}}
public void testFormat_appendPattern539() {__CLR4_4_1mcdmcdle6ndq5e.R.globalSliceStart(getClass().getName(),29003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_169l1dqmdn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mcdmcdle6ndq5e.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mcdmcdle6ndq5e.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.testFormat_appendPattern539",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29003,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_169l1dqmdn(){try{__CLR4_4_1mcdmcdle6ndq5e.R.inc(29003); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29004);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29005);bld.appendLiteral('Y'); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29006);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29007);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29008);bld2.appendLiteral('X'); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29009);bld2.append(f); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29010);bld2.appendLiteral('Z'); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29011);assertEquals("XYZ", bld2.toFormatter().print(0L)); 
 }finally{__CLR4_4_1mcdmcdle6ndq5e.R.flushNeeded();}}
public void test_canBuildFormatter540() {__CLR4_4_1mcdmcdle6ndq5e.R.globalSliceStart(getClass().getName(),29012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qf4uqhmdw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mcdmcdle6ndq5e.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mcdmcdle6ndq5e.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_canBuildFormatter540",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29012,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qf4uqhmdw(){try{__CLR4_4_1mcdmcdle6ndq5e.R.inc(29012); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29013);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29014);assertEquals(false, bld.canBuildFormatter()); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29015);bld.appendLiteral('X'); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29016);assertEquals(true, bld.canBuildFormatter()); 
 }finally{__CLR4_4_1mcdmcdle6ndq5e.R.flushNeeded();}}
public void test_printParseZoneParis543() {__CLR4_4_1mcdmcdle6ndq5e.R.globalSliceStart(getClass().getName(),29017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11nhvv3me1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mcdmcdle6ndq5e.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mcdmcdle6ndq5e.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneParis543",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29017,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11nhvv3me1(){try{__CLR4_4_1mcdmcdle6ndq5e.R.inc(29017); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29018);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId(); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29019);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29020);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, PARIS); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29021);assertEquals("2007-03-04 12:30 Europe/Paris", f.print(dt)); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29022);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 Europe/Paris")); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29023);assertEquals(dt, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 Europe/Paris")); 
 }finally{__CLR4_4_1mcdmcdle6ndq5e.R.flushNeeded();}}
public void test_parseWrongOffsetAndZone552() {__CLR4_4_1mcdmcdle6ndq5e.R.globalSliceStart(getClass().getName(),29024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hq4lgwme8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mcdmcdle6ndq5e.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mcdmcdle6ndq5e.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_parseWrongOffsetAndZone552",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29024,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hq4lgwme8(){try{__CLR4_4_1mcdmcdle6ndq5e.R.inc(29024); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29025);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2).appendLiteral(' ').appendTimeZoneId(); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29026);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29027);DateTime expected = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forOffsetHours(7)); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29028);assertEquals(expected.withZone(TOKYO), f.parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo")); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29029);assertEquals(expected.withZone(TOKYO), f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo")); 
     __CLR4_4_1mcdmcdle6ndq5e.R.inc(29030);assertEquals(expected, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo")); 
 }finally{__CLR4_4_1mcdmcdle6ndq5e.R.flushNeeded();}}
    

    

    

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
