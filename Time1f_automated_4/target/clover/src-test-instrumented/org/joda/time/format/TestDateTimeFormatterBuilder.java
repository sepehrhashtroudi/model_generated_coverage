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
public class TestDateTimeFormatterBuilder extends TestCase {static class __CLR4_4_1luqluqle6o7afo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,28356,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    private static final DateTimeZone LOS_ANGELES = DateTimeZone.forID("America/Los_Angeles");

    public static void main(String[] args) {try{__CLR4_4_1luqluqle6o7afo.R.inc(28322);
        __CLR4_4_1luqluqle6o7afo.R.inc(28323);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1luqluqle6o7afo.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1luqluqle6o7afo.R.inc(28324);
        __CLR4_4_1luqluqle6o7afo.R.inc(28325);return new TestSuite(TestDateTimeFormatterBuilder.class);
    }finally{__CLR4_4_1luqluqle6o7afo.R.flushNeeded();}}

    public TestDateTimeFormatterBuilder(String name) {
        super(name);__CLR4_4_1luqluqle6o7afo.R.inc(28327);try{__CLR4_4_1luqluqle6o7afo.R.inc(28326);
    }finally{__CLR4_4_1luqluqle6o7afo.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1luqluqle6o7afo.R.inc(28328);
    }finally{__CLR4_4_1luqluqle6o7afo.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1luqluqle6o7afo.R.inc(28329);
    }finally{__CLR4_4_1luqluqle6o7afo.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_append_Parser438() {__CLR4_4_1luqluqle6o7afo.R.globalSliceStart(getClass().getName(),28330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19hcpnbluy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1luqluqle6o7afo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1luqluqle6o7afo.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Parser438",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19hcpnbluy(){try{__CLR4_4_1luqluqle6o7afo.R.inc(28330); 
     __CLR4_4_1luqluqle6o7afo.R.inc(28331);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1luqluqle6o7afo.R.inc(28332);bld.appendLiteral('Y'); 
     __CLR4_4_1luqluqle6o7afo.R.inc(28333);DateTimeParser p = bld.toParser(); 
     __CLR4_4_1luqluqle6o7afo.R.inc(28334);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
     __CLR4_4_1luqluqle6o7afo.R.inc(28335);bld2.appendLiteral('X'); 
     __CLR4_4_1luqluqle6o7afo.R.inc(28336);bld2.append(p); 
     __CLR4_4_1luqluqle6o7afo.R.inc(28337);bld2.appendLiteral('Z'); 
     __CLR4_4_1luqluqle6o7afo.R.inc(28338);DateTimeFormatter f = bld2.toFormatter(); 
     __CLR4_4_1luqluqle6o7afo.R.inc(28339);assertEquals(false, f.isPrinter()); 
     __CLR4_4_1luqluqle6o7afo.R.inc(28340);assertEquals(true, f.isParser()); 
     __CLR4_4_1luqluqle6o7afo.R.inc(28341);assertEquals(0, f.withZoneUTC().parseMillis("XYZ")); 
 }finally{__CLR4_4_1luqluqle6o7afo.R.flushNeeded();}}
public void test_toPrinter439() {__CLR4_4_1luqluqle6o7afo.R.globalSliceStart(getClass().getName(),28342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1besavllva();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1luqluqle6o7afo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1luqluqle6o7afo.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_toPrinter439",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28342,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1besavllva(){try{__CLR4_4_1luqluqle6o7afo.R.inc(28342); 
     __CLR4_4_1luqluqle6o7afo.R.inc(28343);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1luqluqle6o7afo.R.inc(28344);try { 
         __CLR4_4_1luqluqle6o7afo.R.inc(28345);bld.toPrinter(); 
         __CLR4_4_1luqluqle6o7afo.R.inc(28346);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1luqluqle6o7afo.R.inc(28347);bld.appendLiteral('X'); 
     __CLR4_4_1luqluqle6o7afo.R.inc(28348);assertNotNull(bld.toPrinter()); 
 }finally{__CLR4_4_1luqluqle6o7afo.R.flushNeeded();}}
public void testForOffsetMillis_int448() {__CLR4_4_1luqluqle6o7afo.R.globalSliceStart(getClass().getName(),28349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1saa5b5lvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1luqluqle6o7afo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1luqluqle6o7afo.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.testForOffsetMillis_int448",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1saa5b5lvh(){try{__CLR4_4_1luqluqle6o7afo.R.inc(28349); 
     __CLR4_4_1luqluqle6o7afo.R.inc(28350);assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0)); 
     __CLR4_4_1luqluqle6o7afo.R.inc(28351);assertEquals(DateTimeZone.forID("+23:59:59.999"), DateTimeZone.forOffsetMillis((24 * 60 * 60 * 1000) - 1)); 
     __CLR4_4_1luqluqle6o7afo.R.inc(28352);assertEquals(DateTimeZone.forID("+03:00"), DateTimeZone.forOffsetMillis(3 * 60 * 60 * 1000)); 
     __CLR4_4_1luqluqle6o7afo.R.inc(28353);assertEquals(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetMillis(-2 * 60 * 60 * 1000)); 
     __CLR4_4_1luqluqle6o7afo.R.inc(28354);assertEquals(DateTimeZone.forID("-23:59:59.999"), DateTimeZone.forOffsetMillis((-24 * 60 * 60 * 1000) + 1)); 
     __CLR4_4_1luqluqle6o7afo.R.inc(28355);assertEquals(DateTimeZone.forID("+04:45:17.045"), DateTimeZone.forOffsetMillis(4 * 60 * 60 * 1000 + 45 * 60 * 1000 + 17 * 1000 + 45)); 
 }finally{__CLR4_4_1luqluqle6o7afo.R.flushNeeded();}}
    

    

    

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
