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

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.GJChronology;

/**
 * This class is a Junit unit test for DateTime Formating.
 *
 * @author Stephen Colebourne
 * @author Fredrik Borgh
 */
public class TestDateTimeFormat extends TestCase {static class __CLR4_4_1slxslxle6qsfmf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,37395,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEWYORK = DateTimeZone.forID("America/New_York");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1slxslxle6qsfmf.R.inc(37077);
        __CLR4_4_1slxslxle6qsfmf.R.inc(37078);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1slxslxle6qsfmf.R.inc(37079);
        __CLR4_4_1slxslxle6qsfmf.R.inc(37080);return new TestSuite(TestDateTimeFormat.class);
    }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}}

    public TestDateTimeFormat(String name) {
        super(name);__CLR4_4_1slxslxle6qsfmf.R.inc(37082);try{__CLR4_4_1slxslxle6qsfmf.R.inc(37081);
    }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1slxslxle6qsfmf.R.inc(37083);
        __CLR4_4_1slxslxle6qsfmf.R.inc(37084);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1slxslxle6qsfmf.R.inc(37085);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1slxslxle6qsfmf.R.inc(37086);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1slxslxle6qsfmf.R.inc(37087);originalLocale = Locale.getDefault();
        __CLR4_4_1slxslxle6qsfmf.R.inc(37088);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1slxslxle6qsfmf.R.inc(37089);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1slxslxle6qsfmf.R.inc(37090);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1slxslxle6qsfmf.R.inc(37091);
        __CLR4_4_1slxslxle6qsfmf.R.inc(37092);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1slxslxle6qsfmf.R.inc(37093);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1slxslxle6qsfmf.R.inc(37094);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1slxslxle6qsfmf.R.inc(37095);Locale.setDefault(originalLocale);
        __CLR4_4_1slxslxle6qsfmf.R.inc(37096);originalDateTimeZone = null;
        __CLR4_4_1slxslxle6qsfmf.R.inc(37097);originalTimeZone = null;
        __CLR4_4_1slxslxle6qsfmf.R.inc(37098);originalLocale = null;
    }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFormat_minute175() {__CLR4_4_1slxslxle6qsfmf.R.globalSliceStart(getClass().getName(),37099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bl0m2csmj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slxslxle6qsfmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slxslxle6qsfmf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_minute175",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37099,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bl0m2csmj(){try{__CLR4_4_1slxslxle6qsfmf.R.inc(37099); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37100);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37101);DateTimeFormatter f = DateTimeFormat.forPattern("m").withLocale(Locale.UK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37102);assertEquals(dt.toString(), "20", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37103);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37104);assertEquals(dt.toString(), "20", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37105);dt = dt.withZone(TOKYO); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37106);assertEquals(dt.toString(), "20", f.print(dt)); 
 }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}} 


public void testSubclassableConstructor182() {__CLR4_4_1slxslxle6qsfmf.R.globalSliceStart(getClass().getName(),37107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r7b0smr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slxslxle6qsfmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slxslxle6qsfmf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testSubclassableConstructor182",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r7b0smr(){try{__CLR4_4_1slxslxle6qsfmf.R.inc(37107); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37108);DateTimeFormat f = new DateTimeFormat() { 
     }; 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37109);assertNotNull(f); 
 }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}} 


public void testFormat_era183() {__CLR4_4_1slxslxle6qsfmf.R.globalSliceStart(getClass().getName(),37110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vjt5zfsmu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slxslxle6qsfmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slxslxle6qsfmf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_era183",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37110,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vjt5zfsmu(){try{__CLR4_4_1slxslxle6qsfmf.R.inc(37110); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37111);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37112);DateTimeFormatter f = DateTimeFormat.forPattern("G").withLocale(Locale.UK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37113);assertEquals(dt.toString(), "AD", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37114);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37115);assertEquals(dt.toString(), "AD", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37116);dt = dt.withZone(PARIS); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37117);assertEquals(dt.toString(), "AD", f.print(dt)); 
 }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}} 


public void testFormat_centuryOfEra184() {__CLR4_4_1slxslxle6qsfmf.R.globalSliceStart(getClass().getName(),37118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xuprn9sn2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slxslxle6qsfmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slxslxle6qsfmf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_centuryOfEra184",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xuprn9sn2(){try{__CLR4_4_1slxslxle6qsfmf.R.inc(37118); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37119);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37120);DateTimeFormatter f = DateTimeFormat.forPattern("C").withLocale(Locale.UK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37121);assertEquals(dt.toString(), "20", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37122);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37123);assertEquals(dt.toString(), "20", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37124);dt = dt.withZone(TOKYO); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37125);assertEquals(dt.toString(), "20", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37126);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37127);assertEquals(dt.toString(), "1", f.print(dt)); 
 }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}} 


public void testFormat_weekyear185() {__CLR4_4_1slxslxle6qsfmf.R.globalSliceStart(getClass().getName(),37128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cczq1esnc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slxslxle6qsfmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slxslxle6qsfmf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_weekyear185",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cczq1esnc(){try{__CLR4_4_1slxslxle6qsfmf.R.inc(37128); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37129);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37130);DateTimeFormatter f = DateTimeFormat.forPattern("x").withLocale(Locale.UK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37131);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37132);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37133);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37134);dt = dt.withZone(TOKYO); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37135);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37136);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37137);assertEquals(dt.toString(), "-123", f.print(dt)); 
 }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}} 


public void testFormat_yearOfEra_twoDigit186() {__CLR4_4_1slxslxle6qsfmf.R.globalSliceStart(getClass().getName(),37138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x72s0wsnm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slxslxle6qsfmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slxslxle6qsfmf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_yearOfEra_twoDigit186",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37138,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x72s0wsnm(){try{__CLR4_4_1slxslxle6qsfmf.R.inc(37138); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37139);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37140);DateTimeFormatter f = DateTimeFormat.forPattern("YY").withLocale(Locale.UK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37141);assertEquals(dt.toString(), "04", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37142);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37143);assertEquals(dt.toString(), "23", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37144);f = f.withZoneUTC(); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37145);DateTime expect = null; 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37146);expect = new DateTime(2004, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37147);assertEquals(expect, f.parseDateTime("04")); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37148);expect = new DateTime(1922, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37149);assertEquals(expect, f.parseDateTime("22")); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37150);expect = new DateTime(2021, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37151);assertEquals(expect, f.parseDateTime("21")); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37152);try { 
         __CLR4_4_1slxslxle6qsfmf.R.inc(37153);f.parseDateTime("-"); 
         __CLR4_4_1slxslxle6qsfmf.R.inc(37154);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37155);try { 
         __CLR4_4_1slxslxle6qsfmf.R.inc(37156);f.parseDateTime("+"); 
         __CLR4_4_1slxslxle6qsfmf.R.inc(37157);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37158);f = f.withPivotYear(new Integer(2050)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37159);expect = new DateTime(2000, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37160);assertEquals(expect, f.parseDateTime("00")); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37161);expect = new DateTime(2099, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37162);assertEquals(expect, f.parseDateTime("99")); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37163);f = DateTimeFormat.forPattern("YY").withLocale(Locale.UK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37164);f = f.withZoneUTC(); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37165);f.parseDateTime("5"); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37166);f.parseDateTime("005"); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37167);f.parseDateTime("+50"); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37168);f.parseDateTime("-50"); 
 }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}} 


public void testFormat_shortBasicParse187() {__CLR4_4_1slxslxle6qsfmf.R.globalSliceStart(getClass().getName(),37169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vs9vwsoh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slxslxle6qsfmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slxslxle6qsfmf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_shortBasicParse187",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37169,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vs9vwsoh(){try{__CLR4_4_1slxslxle6qsfmf.R.inc(37169); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37170);DateTime dt = new DateTime(2004, 3, 9, 0, 0, 0, 0); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37171);DateTimeFormatter f = DateTimeFormat.forPattern("yyMMdd"); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37172);assertEquals(dt, f.parseDateTime("040309")); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37173);try { 
         __CLR4_4_1slxslxle6qsfmf.R.inc(37174);assertEquals(dt, f.parseDateTime("20040309")); 
         __CLR4_4_1slxslxle6qsfmf.R.inc(37175);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37176);f = DateTimeFormat.forPattern("yy/MM/dd"); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37177);assertEquals(dt, f.parseDateTime("04/03/09")); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37178);assertEquals(dt, f.parseDateTime("2004/03/09")); 
 }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}} 


public void testFormat_year_long188() {__CLR4_4_1slxslxle6qsfmf.R.globalSliceStart(getClass().getName(),37179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1162bu8sor();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slxslxle6qsfmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slxslxle6qsfmf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_year_long188",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1162bu8sor(){try{__CLR4_4_1slxslxle6qsfmf.R.inc(37179); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37180);DateTime dt = new DateTime(278004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37181);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy"); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37182);assertEquals(dt.toString(), "278004", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37183);f = DateTimeFormat.forPattern("yyyyMMdd"); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37184);assertEquals(dt.toString(), "2780040609", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37185);f = DateTimeFormat.forPattern("yyyyddMM"); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37186);assertEquals(dt.toString(), "2780040906", f.print(dt)); 
 }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}} 


public void testFormatParse_textMonthApr_Korean189() {__CLR4_4_1slxslxle6qsfmf.R.globalSliceStart(getClass().getName(),37187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jxvb9soz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slxslxle6qsfmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slxslxle6qsfmf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthApr_Korean189",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jxvb9soz(){try{__CLR4_4_1slxslxle6qsfmf.R.inc(37187); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37188);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("EEEE, d MMMM yyyy HH:mm").withLocale(Locale.KOREAN).withZoneUTC(); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37189);String str = new DateTime(2007, 3, 8, 22, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37190);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37191);assertEquals(new DateTime(2007, 3, 8, 22, 0, 0, 0, UTC), date); 
 }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}} 


public void testFormat_clockhourOfDay190() {__CLR4_4_1slxslxle6qsfmf.R.globalSliceStart(getClass().getName(),37192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kh7p1isp4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slxslxle6qsfmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slxslxle6qsfmf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_clockhourOfDay190",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kh7p1isp4(){try{__CLR4_4_1slxslxle6qsfmf.R.inc(37192); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37193);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37194);DateTimeFormatter f = DateTimeFormat.forPattern("k").withLocale(Locale.UK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37195);assertEquals(dt.toString(), "10", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37196);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37197);assertEquals(dt.toString(), "6", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37198);dt = dt.withZone(TOKYO); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37199);assertEquals(dt.toString(), "19", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37200);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37201);assertEquals(dt.toString(), "24", f.print(dt)); 
 }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}} 


public void testFormat_hourOfHalfday191() {__CLR4_4_1slxslxle6qsfmf.R.globalSliceStart(getClass().getName(),37202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q1p2mwspe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slxslxle6qsfmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slxslxle6qsfmf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_hourOfHalfday191",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q1p2mwspe(){try{__CLR4_4_1slxslxle6qsfmf.R.inc(37202); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37203);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37204);DateTimeFormatter f = DateTimeFormat.forPattern("K").withLocale(Locale.UK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37205);assertEquals(dt.toString(), "10", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37206);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37207);assertEquals(dt.toString(), "6", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37208);dt = dt.withZone(TOKYO); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37209);assertEquals(dt.toString(), "7", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37210);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37211);assertEquals(dt.toString(), "0", f.print(dt)); 
 }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}} 


public void testFormat_second192() {__CLR4_4_1slxslxle6qsfmf.R.globalSliceStart(getClass().getName(),37212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f66qpzspo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slxslxle6qsfmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slxslxle6qsfmf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_second192",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37212,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f66qpzspo(){try{__CLR4_4_1slxslxle6qsfmf.R.inc(37212); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37213);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37214);DateTimeFormatter f = DateTimeFormat.forPattern("s").withLocale(Locale.UK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37215);assertEquals(dt.toString(), "30", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37216);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37217);assertEquals(dt.toString(), "30", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37218);dt = dt.withZone(TOKYO); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37219);assertEquals(dt.toString(), "30", f.print(dt)); 
 }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}} 


public void testFormat_fractionOfSecondLong193() {__CLR4_4_1slxslxle6qsfmf.R.globalSliceStart(getClass().getName(),37220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14any5vspw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slxslxle6qsfmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slxslxle6qsfmf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_fractionOfSecondLong193",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14any5vspw(){try{__CLR4_4_1slxslxle6qsfmf.R.inc(37220); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37221);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37222);DateTimeFormatter f = DateTimeFormat.forPattern("SSSSSS").withLocale(Locale.UK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37223);assertEquals(dt.toString(), "040000", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37224);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37225);assertEquals(dt.toString(), "040000", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37226);dt = dt.withZone(TOKYO); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37227);assertEquals(dt.toString(), "040000", f.print(dt)); 
 }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}} 


public void testFormat_dayOfWeek194() {__CLR4_4_1slxslxle6qsfmf.R.globalSliceStart(getClass().getName(),37228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y32d6msq4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slxslxle6qsfmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slxslxle6qsfmf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfWeek194",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y32d6msq4(){try{__CLR4_4_1slxslxle6qsfmf.R.inc(37228); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37229);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37230);DateTimeFormatter f = DateTimeFormat.forPattern("e").withLocale(Locale.UK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37231);assertEquals(dt.toString(), "3", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37232);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37233);assertEquals(dt.toString(), "3", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37234);dt = dt.withZone(TOKYO); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37235);assertEquals(dt.toString(), "3", f.print(dt)); 
 }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}} 


public void testFormat_dayOfWeekShortText195() {__CLR4_4_1slxslxle6qsfmf.R.globalSliceStart(getClass().getName(),37236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18t1bb8sqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slxslxle6qsfmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slxslxle6qsfmf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfWeekShortText195",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37236,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18t1bb8sqc(){try{__CLR4_4_1slxslxle6qsfmf.R.inc(37236); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37237);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37238);DateTimeFormatter f = DateTimeFormat.forPattern("E").withLocale(Locale.UK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37239);assertEquals(dt.toString(), "Wed", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37240);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37241);assertEquals(dt.toString(), "Wed", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37242);dt = dt.withZone(TOKYO); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37243);assertEquals(dt.toString(), "Wed", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37244);f = f.withLocale(Locale.FRENCH); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37245);assertEquals(dt.toString(), "mer.", f.print(dt)); 
 }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}} 


public void testFormat_zoneAmount197() {__CLR4_4_1slxslxle6qsfmf.R.globalSliceStart(getClass().getName(),37246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l68dq4sqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slxslxle6qsfmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slxslxle6qsfmf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_zoneAmount197",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l68dq4sqm(){try{__CLR4_4_1slxslxle6qsfmf.R.inc(37246); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37247);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37248);DateTimeFormatter f = DateTimeFormat.forPattern("Z").withLocale(Locale.UK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37249);assertEquals(dt.toString(), "+0000", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37250);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37251);assertEquals(dt.toString(), "-0400", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37252);dt = dt.withZone(TOKYO); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37253);assertEquals(dt.toString(), "+0900", f.print(dt)); 
 }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}} 


public void testFormatParse_zoneId_colon198() {__CLR4_4_1slxslxle6qsfmf.R.globalSliceStart(getClass().getName(),37254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_196w6yjsqu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slxslxle6qsfmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slxslxle6qsfmf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_zoneId_colon198",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_196w6yjsqu(){try{__CLR4_4_1slxslxle6qsfmf.R.inc(37254); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37255);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("HH:mm ZZ").withZoneUTC(); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37256);String str = new DateTime(2007, 6, 23, 1, 2, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37257);assertEquals("01:02 +00:00", str); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37258);DateTime parsed = dateFormatter.parseDateTime(str); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37259);assertEquals(1, parsed.getHourOfDay()); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37260);assertEquals(2, parsed.getMinuteOfHour()); 
 }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}} 


public void testFormat_zoneAmountID199() {__CLR4_4_1slxslxle6qsfmf.R.globalSliceStart(getClass().getName(),37261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1idirx9sr1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slxslxle6qsfmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slxslxle6qsfmf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_zoneAmountID199",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1idirx9sr1(){try{__CLR4_4_1slxslxle6qsfmf.R.inc(37261); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37262);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37263);DateTimeFormatter f = DateTimeFormat.forPattern("ZZZ").withLocale(Locale.UK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37264);assertEquals(dt.toString(), "UTC", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37265);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37266);assertEquals(dt.toString(), "America/New_York", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37267);dt = dt.withZone(TOKYO); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37268);assertEquals(dt.toString(), "Asia/Tokyo", f.print(dt)); 
 }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}} 


public void testFormatParse_textHalfdayAM_France233() {__CLR4_4_1slxslxle6qsfmf.R.globalSliceStart(getClass().getName(),37269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u1vieqsr9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slxslxle6qsfmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slxslxle6qsfmf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textHalfdayAM_France233",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37269,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u1vieqsr9(){try{__CLR4_4_1slxslxle6qsfmf.R.inc(37269); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37270);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().appendLiteral('$').appendClockhourOfHalfday(2).appendLiteral('-').appendHalfdayOfDayText().appendLiteral('-').appendYear(4, 4).toFormatter().withLocale(Locale.FRANCE).withZoneUTC(); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37271);String str = new DateTime(2007, 6, 23, 18, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37272);assertEquals("$06-PM-2007", str); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37273);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37274);check(date, 2007, 1, 1); 
 }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}} 


public void testFormatParse_textMonthAtEnd_France_withSpecifiedDefault527() {__CLR4_4_1slxslxle6qsfmf.R.globalSliceStart(getClass().getName(),37275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gu3wedsrf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slxslxle6qsfmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slxslxle6qsfmf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthAtEnd_France_withSpecifiedDefault527",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37275,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gu3wedsrf(){try{__CLR4_4_1slxslxle6qsfmf.R.inc(37275); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37276);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM").withLocale(Locale.FRANCE).withZoneUTC().withDefaultYear(1980); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37277);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37278);assertEquals("23 juin", str); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37279);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37280);check(date, 1980, 6, 23); 
 }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}} 


public void testFormatParse_textEraAD_France744() {__CLR4_4_1slxslxle6qsfmf.R.globalSliceStart(getClass().getName(),37281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ub7y49srl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slxslxle6qsfmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slxslxle6qsfmf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textEraAD_France744",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37281,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ub7y49srl(){try{__CLR4_4_1slxslxle6qsfmf.R.inc(37281); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37282);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().appendLiteral('$').appendEraText().appendYear(4, 4).toFormatter().withLocale(Locale.FRANCE).withZoneUTC(); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37283);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37284);assertEquals("$ap. J.-C.2007", str); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37285);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37286);check(date, 2007, 1, 1); 
 }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}} 


public void testFormatParse_textHalfdayAM_UK813() {__CLR4_4_1slxslxle6qsfmf.R.globalSliceStart(getClass().getName(),37287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1otsw4hsrr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slxslxle6qsfmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slxslxle6qsfmf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textHalfdayAM_UK813",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1otsw4hsrr(){try{__CLR4_4_1slxslxle6qsfmf.R.inc(37287); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37288);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().appendLiteral('$').appendClockhourOfHalfday(2).appendLiteral('-').appendHalfdayOfDayText().appendLiteral('-').appendYear(4, 4).toFormatter().withLocale(Locale.UK).withZoneUTC(); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37289);String str = new DateTime(2007, 6, 23, 18, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37290);assertEquals("$06-PM-2007", str); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37291);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37292);check(date, 2007, 1, 1); 
 }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}} 


public void testFormat_year_twoDigit1108() {__CLR4_4_1slxslxle6qsfmf.R.globalSliceStart(getClass().getName(),37293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ok8dhgsrx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slxslxle6qsfmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slxslxle6qsfmf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_year_twoDigit1108",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ok8dhgsrx(){try{__CLR4_4_1slxslxle6qsfmf.R.inc(37293); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37294);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37295);DateTimeFormatter f = DateTimeFormat.forPattern("yy").withLocale(Locale.UK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37296);assertEquals(dt.toString(), "04", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37297);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37298);assertEquals(dt.toString(), "23", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37299);f = f.withZoneUTC(); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37300);DateTime expect = null; 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37301);expect = new DateTime(2004, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37302);assertEquals(expect, f.parseDateTime("04")); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37303);expect = new DateTime(1922, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37304);assertEquals(expect, f.parseDateTime("22")); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37305);expect = new DateTime(2021, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37306);assertEquals(expect, f.parseDateTime("21")); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37307);try { 
         __CLR4_4_1slxslxle6qsfmf.R.inc(37308);f.parseDateTime("-"); 
         __CLR4_4_1slxslxle6qsfmf.R.inc(37309);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37310);try { 
         __CLR4_4_1slxslxle6qsfmf.R.inc(37311);f.parseDateTime("+"); 
         __CLR4_4_1slxslxle6qsfmf.R.inc(37312);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37313);f = f.withPivotYear(new Integer(2050)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37314);expect = new DateTime(2000, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37315);assertEquals(expect, f.parseDateTime("00")); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37316);expect = new DateTime(2099, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37317);assertEquals(expect, f.parseDateTime("99")); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37318);f = new DateTimeFormatterBuilder().appendTwoDigitYear(2000).toFormatter(); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37319);f = f.withZoneUTC(); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37320);try { 
         __CLR4_4_1slxslxle6qsfmf.R.inc(37321);f.parseDateTime("5"); 
         __CLR4_4_1slxslxle6qsfmf.R.inc(37322);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37323);try { 
         __CLR4_4_1slxslxle6qsfmf.R.inc(37324);f.parseDateTime("005"); 
         __CLR4_4_1slxslxle6qsfmf.R.inc(37325);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37326);try { 
         __CLR4_4_1slxslxle6qsfmf.R.inc(37327);f.parseDateTime("+50"); 
         __CLR4_4_1slxslxle6qsfmf.R.inc(37328);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37329);try { 
         __CLR4_4_1slxslxle6qsfmf.R.inc(37330);f.parseDateTime("-50"); 
         __CLR4_4_1slxslxle6qsfmf.R.inc(37331);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37332);f = DateTimeFormat.forPattern("yy").withLocale(Locale.UK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37333);f = f.withZoneUTC(); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37334);f.parseDateTime("5"); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37335);f.parseDateTime("005"); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37336);f.parseDateTime("+50"); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37337);f.parseDateTime("-50"); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37338);f = new DateTimeFormatterBuilder().appendTwoDigitYear(2000, true).toFormatter(); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37339);f = f.withZoneUTC(); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37340);expect = new DateTime(2004, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37341);assertEquals(expect, f.parseDateTime("04")); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37342);expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37343);assertEquals(expect, f.parseDateTime("+04")); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37344);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37345);assertEquals(expect, f.parseDateTime("-04")); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37346);expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37347);assertEquals(expect, f.parseDateTime("4")); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37348);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37349);assertEquals(expect, f.parseDateTime("-4")); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37350);expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37351);assertEquals(expect, f.parseDateTime("004")); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37352);expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37353);assertEquals(expect, f.parseDateTime("+004")); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37354);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37355);assertEquals(expect, f.parseDateTime("-004")); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37356);expect = new DateTime(3004, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37357);assertEquals(expect, f.parseDateTime("3004")); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37358);expect = new DateTime(3004, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37359);assertEquals(expect, f.parseDateTime("+3004")); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37360);expect = new DateTime(-3004, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37361);assertEquals(expect, f.parseDateTime("-3004")); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37362);try { 
         __CLR4_4_1slxslxle6qsfmf.R.inc(37363);f.parseDateTime("-"); 
         __CLR4_4_1slxslxle6qsfmf.R.inc(37364);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37365);try { 
         __CLR4_4_1slxslxle6qsfmf.R.inc(37366);f.parseDateTime("+"); 
         __CLR4_4_1slxslxle6qsfmf.R.inc(37367);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}} 


public void testFormat_dayOfWeekText1109() {__CLR4_4_1slxslxle6qsfmf.R.globalSliceStart(getClass().getName(),37368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n9zu36su0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slxslxle6qsfmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slxslxle6qsfmf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfWeekText1109",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n9zu36su0(){try{__CLR4_4_1slxslxle6qsfmf.R.inc(37368); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37369);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37370);DateTimeFormatter f = DateTimeFormat.forPattern("EEEE").withLocale(Locale.UK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37371);assertEquals(dt.toString(), "Wednesday", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37372);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37373);assertEquals(dt.toString(), "Wednesday", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37374);dt = dt.withZone(TOKYO); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37375);assertEquals(dt.toString(), "Wednesday", f.print(dt)); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37376);f = f.withLocale(Locale.FRENCH); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37377);assertEquals(dt.toString(), "mercredi", f.print(dt)); 
 }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}} 


public void testFormatParse_textEraAD_UK1110() {__CLR4_4_1slxslxle6qsfmf.R.globalSliceStart(getClass().getName(),37378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ioeausua();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slxslxle6qsfmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slxslxle6qsfmf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textEraAD_UK1110",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ioeausua(){try{__CLR4_4_1slxslxle6qsfmf.R.inc(37378); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37379);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().appendLiteral('$').appendEraText().appendYear(4, 4).toFormatter().withLocale(Locale.UK).withZoneUTC(); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37380);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37381);assertEquals("$AD2007", str); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37382);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37383);check(date, 2007, 1, 1); 
 }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}} 


public void testFormatParse_zoneId_noColon1117() {__CLR4_4_1slxslxle6qsfmf.R.globalSliceStart(getClass().getName(),37384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nk537ssug();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slxslxle6qsfmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slxslxle6qsfmf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_zoneId_noColon1117",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37384,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nk537ssug(){try{__CLR4_4_1slxslxle6qsfmf.R.inc(37384); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37385);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("HH:mm Z").withZoneUTC(); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37386);String str = new DateTime(2007, 6, 23, 1, 2, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37387);assertEquals("01:02 +0000", str); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37388);DateTime parsed = dateFormatter.parseDateTime(str); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37389);assertEquals(1, parsed.getHourOfDay()); 
     __CLR4_4_1slxslxle6qsfmf.R.inc(37390);assertEquals(2, parsed.getMinuteOfHour()); 
 }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}} 

    

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
    
// Defects4J: flaky method
//     public void testFormat_zoneText() {
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
//         DateTimeFormatter f = DateTimeFormat.forPattern("z").withLocale(Locale.UK);
//         assertEquals(dt.toString(), "UTC", f.print(dt));
//         
//         dt = dt.withZone(NEWYORK);
//         assertEquals(dt.toString(), "EDT", f.print(dt));
//         
//         dt = dt.withZone(TOKYO);
//         assertEquals(dt.toString(), "JST", f.print(dt));
//     }

    
// Defects4J: flaky method
//     public void testFormat_zoneLongText() {
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
//         DateTimeFormatter f = DateTimeFormat.forPattern("zzzz").withLocale(Locale.UK);
//         assertEquals(dt.toString(), "Coordinated Universal Time", f.print(dt));
//         
//         dt = dt.withZone(NEWYORK);
//         assertEquals(dt.toString(), "Eastern Daylight Time", f.print(dt));
//         
//         dt = dt.withZone(TOKYO);
//         assertEquals(dt.toString(), "Japan Standard Time", f.print(dt));
//     }

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
    private void check(DateTime test, int hour, int min, int sec) {try{__CLR4_4_1slxslxle6qsfmf.R.inc(37391);
        __CLR4_4_1slxslxle6qsfmf.R.inc(37392);assertEquals(hour, test.getYear());
        __CLR4_4_1slxslxle6qsfmf.R.inc(37393);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1slxslxle6qsfmf.R.inc(37394);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1slxslxle6qsfmf.R.flushNeeded();}}

}
