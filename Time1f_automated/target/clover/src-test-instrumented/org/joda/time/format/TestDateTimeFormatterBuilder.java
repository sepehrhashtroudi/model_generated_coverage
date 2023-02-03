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
public class TestDateTimeFormatterBuilder extends TestCase {static class __CLR4_4_1ki7ki7lccieu2l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672525352587L,8589935092L,26619,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    private static final DateTimeZone LOS_ANGELES = DateTimeZone.forID("America/Los_Angeles");

    public static void main(String[] args) {try{__CLR4_4_1ki7ki7lccieu2l.R.inc(26575);
        __CLR4_4_1ki7ki7lccieu2l.R.inc(26576);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ki7ki7lccieu2l.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ki7ki7lccieu2l.R.inc(26577);
        __CLR4_4_1ki7ki7lccieu2l.R.inc(26578);return new TestSuite(TestDateTimeFormatterBuilder.class);
    }finally{__CLR4_4_1ki7ki7lccieu2l.R.flushNeeded();}}

    public TestDateTimeFormatterBuilder(String name) {
        super(name);__CLR4_4_1ki7ki7lccieu2l.R.inc(26580);try{__CLR4_4_1ki7ki7lccieu2l.R.inc(26579);
    }finally{__CLR4_4_1ki7ki7lccieu2l.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ki7ki7lccieu2l.R.inc(26581);
    }finally{__CLR4_4_1ki7ki7lccieu2l.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ki7ki7lccieu2l.R.inc(26582);
    }finally{__CLR4_4_1ki7ki7lccieu2l.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_parseWrongOffset11() {__CLR4_4_1ki7ki7lccieu2l.R.globalSliceStart(getClass().getName(),26583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qqld27kif();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ki7ki7lccieu2l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ki7ki7lccieu2l.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_parseWrongOffset11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26583,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qqld27kif(){try{__CLR4_4_1ki7ki7lccieu2l.R.inc(26583); 
     __CLR4_4_1ki7ki7lccieu2l.R.inc(26584);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2); 
     __CLR4_4_1ki7ki7lccieu2l.R.inc(26585);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1ki7ki7lccieu2l.R.inc(26586);DateTime expected = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forOffsetHours(7)); 
     __CLR4_4_1ki7ki7lccieu2l.R.inc(26587);assertEquals(expected.withZone(TOKYO), f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +07:00")); 
     __CLR4_4_1ki7ki7lccieu2l.R.inc(26588);assertEquals(expected, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +07:00")); 
     __CLR4_4_1ki7ki7lccieu2l.R.inc(26589);assertEquals(expected.withZone(DateTimeZone.getDefault()), f.parseDateTime("2007-03-04 12:30 +07:00")); 
 }finally{__CLR4_4_1ki7ki7lccieu2l.R.flushNeeded();}}
public void test_append_Formatter18() {__CLR4_4_1ki7ki7lccieu2l.R.globalSliceStart(getClass().getName(),26590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1up1qowkim();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ki7ki7lccieu2l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ki7ki7lccieu2l.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Formatter18",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1up1qowkim(){try{__CLR4_4_1ki7ki7lccieu2l.R.inc(26590); 
     __CLR4_4_1ki7ki7lccieu2l.R.inc(26591);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1ki7ki7lccieu2l.R.inc(26592);bld.appendLiteral('Y'); 
     __CLR4_4_1ki7ki7lccieu2l.R.inc(26593);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1ki7ki7lccieu2l.R.inc(26594);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
     __CLR4_4_1ki7ki7lccieu2l.R.inc(26595);bld2.appendLiteral('X'); 
     __CLR4_4_1ki7ki7lccieu2l.R.inc(26596);bld2.append(f); 
     __CLR4_4_1ki7ki7lccieu2l.R.inc(26597);bld2.appendLiteral('Z'); 
     __CLR4_4_1ki7ki7lccieu2l.R.inc(26598);assertEquals("XYZ", bld2.toFormatter().print(0L)); 
 }finally{__CLR4_4_1ki7ki7lccieu2l.R.flushNeeded();}}
public void test_append_nullParser100() {__CLR4_4_1ki7ki7lccieu2l.R.globalSliceStart(getClass().getName(),26599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1186jwmkiv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ki7ki7lccieu2l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ki7ki7lccieu2l.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_nullParser100",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1186jwmkiv(){try{__CLR4_4_1ki7ki7lccieu2l.R.inc(26599); 
     __CLR4_4_1ki7ki7lccieu2l.R.inc(26600);try { 
         __CLR4_4_1ki7ki7lccieu2l.R.inc(26601);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
         __CLR4_4_1ki7ki7lccieu2l.R.inc(26602);bld2.append((DateTimeParser) null); 
         __CLR4_4_1ki7ki7lccieu2l.R.inc(26603);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ki7ki7lccieu2l.R.flushNeeded();}}
public void test_append_nullPrinter_Parser153() {__CLR4_4_1ki7ki7lccieu2l.R.globalSliceStart(getClass().getName(),26604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wkdz5fkj0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ki7ki7lccieu2l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ki7ki7lccieu2l.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_nullPrinter_Parser153",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26604,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wkdz5fkj0(){try{__CLR4_4_1ki7ki7lccieu2l.R.inc(26604); 
     __CLR4_4_1ki7ki7lccieu2l.R.inc(26605);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1ki7ki7lccieu2l.R.inc(26606);bld.appendLiteral('Y'); 
     __CLR4_4_1ki7ki7lccieu2l.R.inc(26607);DateTimeParser p = bld.toParser(); 
     __CLR4_4_1ki7ki7lccieu2l.R.inc(26608);try { 
         __CLR4_4_1ki7ki7lccieu2l.R.inc(26609);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder(); 
         __CLR4_4_1ki7ki7lccieu2l.R.inc(26610);bld2.append((DateTimePrinter) null, p); 
         __CLR4_4_1ki7ki7lccieu2l.R.inc(26611);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ki7ki7lccieu2l.R.flushNeeded();}}
public void test_toPrinter155() {__CLR4_4_1ki7ki7lccieu2l.R.globalSliceStart(getClass().getName(),26612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tlmccakj8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ki7ki7lccieu2l.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ki7ki7lccieu2l.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_toPrinter155",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tlmccakj8(){try{__CLR4_4_1ki7ki7lccieu2l.R.inc(26612); 
     __CLR4_4_1ki7ki7lccieu2l.R.inc(26613);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     __CLR4_4_1ki7ki7lccieu2l.R.inc(26614);try { 
         __CLR4_4_1ki7ki7lccieu2l.R.inc(26615);bld.toPrinter(); 
         __CLR4_4_1ki7ki7lccieu2l.R.inc(26616);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1ki7ki7lccieu2l.R.inc(26617);bld.appendLiteral('X'); 
     __CLR4_4_1ki7ki7lccieu2l.R.inc(26618);assertNotNull(bld.toPrinter()); 
 }finally{__CLR4_4_1ki7ki7lccieu2l.R.flushNeeded();}}
    

    

    

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
