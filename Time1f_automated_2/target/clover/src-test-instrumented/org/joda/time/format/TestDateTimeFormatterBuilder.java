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
public class TestDateTimeFormatterBuilder extends TestCase {static class __CLR4_4_1lzrlzrle6nl8q8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,28567,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    private static final DateTimeZone LOS_ANGELES = DateTimeZone.forID("America/Los_Angeles");

    public static void main(String[] args) {try{__CLR4_4_1lzrlzrle6nl8q8.R.inc(28503);
        __CLR4_4_1lzrlzrle6nl8q8.R.inc(28504);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lzrlzrle6nl8q8.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lzrlzrle6nl8q8.R.inc(28505);
        __CLR4_4_1lzrlzrle6nl8q8.R.inc(28506);return new TestSuite(TestDateTimeFormatterBuilder.class);
    }finally{__CLR4_4_1lzrlzrle6nl8q8.R.flushNeeded();}}

    public TestDateTimeFormatterBuilder(String name) {
        super(name);__CLR4_4_1lzrlzrle6nl8q8.R.inc(28508);try{__CLR4_4_1lzrlzrle6nl8q8.R.inc(28507);
    }finally{__CLR4_4_1lzrlzrle6nl8q8.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lzrlzrle6nl8q8.R.inc(28509);
    }finally{__CLR4_4_1lzrlzrle6nl8q8.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lzrlzrle6nl8q8.R.inc(28510);
    }finally{__CLR4_4_1lzrlzrle6nl8q8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_canBuildParser461() {__CLR4_4_1lzrlzrle6nl8q8.R.globalSliceStart(getClass().getName(),28511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jowl6clzz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lzrlzrle6nl8q8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lzrlzrle6nl8q8.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_canBuildParser461",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28511,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jowl6clzz(){try{__CLR4_4_1lzrlzrle6nl8q8.R.inc(28511); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28512);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28513);assertEquals(false, bld.canBuildParser()); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28514);bld.appendLiteral('X'); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28515);assertEquals(true, bld.canBuildParser()); 
 }finally{__CLR4_4_1lzrlzrle6nl8q8.R.flushNeeded();}}
public void test_append_Printer_nullParser462() {__CLR4_4_1lzrlzrle6nl8q8.R.globalSliceStart(getClass().getName(),28516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_126mm18m04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lzrlzrle6nl8q8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lzrlzrle6nl8q8.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Printer_nullParser462",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_126mm18m04(){try{__CLR4_4_1lzrlzrle6nl8q8.R.inc(28516); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28517);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28518);bld.appendLiteral('Y'); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28519);DateTimePrinter p = bld.toPrinter(); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28520);try { 
         __CLR4_4_1lzrlzrle6nl8q8.R.inc(28521);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
         __CLR4_4_1lzrlzrle6nl8q8.R.inc(28522);bld2.append(p, (DateTimeParser) null); 
         __CLR4_4_1lzrlzrle6nl8q8.R.inc(28523);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lzrlzrle6nl8q8.R.flushNeeded();}}
public void test_append_Printer463() {__CLR4_4_1lzrlzrle6nl8q8.R.globalSliceStart(getClass().getName(),28524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j9n0tym0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lzrlzrle6nl8q8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lzrlzrle6nl8q8.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Printer463",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j9n0tym0c(){try{__CLR4_4_1lzrlzrle6nl8q8.R.inc(28524); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28525);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28526);bld.appendLiteral('Y'); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28527);DateTimePrinter p = bld.toPrinter(); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28528);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28529);bld2.appendLiteral('X'); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28530);bld2.append(p); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28531);bld2.appendLiteral('Z'); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28532);DateTimeFormatter f = bld2.toFormatter(); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28533);assertEquals(true, f.isPrinter()); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28534);assertEquals(false, f.isParser()); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28535);assertEquals("XYZ", f.print(0L)); 
 }finally{__CLR4_4_1lzrlzrle6nl8q8.R.flushNeeded();}}
public void test_append_Printer464() {__CLR4_4_1lzrlzrle6nl8q8.R.globalSliceStart(getClass().getName(),28536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mimzmfm0o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lzrlzrle6nl8q8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lzrlzrle6nl8q8.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Printer464",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mimzmfm0o(){try{__CLR4_4_1lzrlzrle6nl8q8.R.inc(28536); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28537);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28538);bld.appendLiteral('Y'); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28539);DateTimePrinter p = bld.toPrinter(); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28540);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28541);bld2.appendLiteral('X'); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28542);bld2.append(p); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28543);bld2.appendLiteral('Z'); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28544);DateTimeFormatter f = bld2.toFormatter(); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28545);assertEquals(false, f.isPrinter()); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28546);assertEquals(true, f.isParser()); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28547);assertEquals("XYZ", f.print(0L)); 
 }finally{__CLR4_4_1lzrlzrle6nl8q8.R.flushNeeded();}}
public void test_printParseZoneParis509() {__CLR4_4_1lzrlzrle6nl8q8.R.globalSliceStart(getClass().getName(),28548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qotvl3m10();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lzrlzrle6nl8q8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lzrlzrle6nl8q8.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneParis509",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28548,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qotvl3m10(){try{__CLR4_4_1lzrlzrle6nl8q8.R.inc(28548); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28549);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId(); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28550);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28551);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, PARIS); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28552);assertEquals("2007-03-04 12:30 Europe/Paris", f.print(dt)); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28553);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 Europe/Paris")); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28554);assertEquals(dt, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 Europe/Paris")); 
 }finally{__CLR4_4_1lzrlzrle6nl8q8.R.flushNeeded();}}
public void test_append_Parser511() {__CLR4_4_1lzrlzrle6nl8q8.R.globalSliceStart(getClass().getName(),28555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mrsx5nm17();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lzrlzrle6nl8q8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lzrlzrle6nl8q8.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Parser511",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mrsx5nm17(){try{__CLR4_4_1lzrlzrle6nl8q8.R.inc(28555); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28556);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28557);bld.appendLiteral('Y'); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28558);DateTimeParser p = bld.toParser(); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28559);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28560);bld2.appendLiteral('X'); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28561);bld2.append(p); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28562);bld2.appendLiteral('Z'); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28563);DateTimeFormatter f = bld2.toFormatter(); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28564);assertEquals(false, f.isPrinter()); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28565);assertEquals(true, f.isParser()); 
     __CLR4_4_1lzrlzrle6nl8q8.R.inc(28566);assertEquals(0, f.withZoneUTC().parseMillis("XYZ")); 
 }finally{__CLR4_4_1lzrlzrle6nl8q8.R.flushNeeded();}}
    

    

    

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
