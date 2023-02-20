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
public class TestDateTimeFormat extends TestCase {static class __CLR4_4_1slqslqle6rcn0b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,37471,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1slqslqle6rcn0b.R.inc(37070);
        __CLR4_4_1slqslqle6rcn0b.R.inc(37071);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1slqslqle6rcn0b.R.inc(37072);
        __CLR4_4_1slqslqle6rcn0b.R.inc(37073);return new TestSuite(TestDateTimeFormat.class);
    }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}}

    public TestDateTimeFormat(String name) {
        super(name);__CLR4_4_1slqslqle6rcn0b.R.inc(37075);try{__CLR4_4_1slqslqle6rcn0b.R.inc(37074);
    }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1slqslqle6rcn0b.R.inc(37076);
        __CLR4_4_1slqslqle6rcn0b.R.inc(37077);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1slqslqle6rcn0b.R.inc(37078);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1slqslqle6rcn0b.R.inc(37079);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1slqslqle6rcn0b.R.inc(37080);originalLocale = Locale.getDefault();
        __CLR4_4_1slqslqle6rcn0b.R.inc(37081);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1slqslqle6rcn0b.R.inc(37082);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1slqslqle6rcn0b.R.inc(37083);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1slqslqle6rcn0b.R.inc(37084);
        __CLR4_4_1slqslqle6rcn0b.R.inc(37085);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1slqslqle6rcn0b.R.inc(37086);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1slqslqle6rcn0b.R.inc(37087);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1slqslqle6rcn0b.R.inc(37088);Locale.setDefault(originalLocale);
        __CLR4_4_1slqslqle6rcn0b.R.inc(37089);originalDateTimeZone = null;
        __CLR4_4_1slqslqle6rcn0b.R.inc(37090);originalTimeZone = null;
        __CLR4_4_1slqslqle6rcn0b.R.inc(37091);originalLocale = null;
    }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFormat_minute198() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dfeykzsmc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_minute198",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dfeykzsmc(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37092); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37093);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37094);DateTimeFormatter f = DateTimeFormat.forPattern("m").withLocale(Locale.UK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37095);assertEquals(dt.toString(), "20", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37096);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37097);assertEquals(dt.toString(), "20", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37098);dt = dt.withZone(TOKYO); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37099);assertEquals(dt.toString(), "20", f.print(dt)); 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testSubclassableConstructor207() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ahmq0msmk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testSubclassableConstructor207",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37100,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ahmq0msmk(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37100); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37101);DateTimeFormat f = new DateTimeFormat() { 
     }; 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37102);assertNotNull(f); 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testFormat_era208() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sxwyo3smn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_era208",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sxwyo3smn(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37103); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37104);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37105);DateTimeFormatter f = DateTimeFormat.forPattern("G").withLocale(Locale.UK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37106);assertEquals(dt.toString(), "AD", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37107);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37108);assertEquals(dt.toString(), "AD", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37109);dt = dt.withZone(PARIS); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37110);assertEquals(dt.toString(), "AD", f.print(dt)); 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testFormat_centuryOfEra209() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nbbubnsmv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_centuryOfEra209",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nbbubnsmv(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37111); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37112);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37113);DateTimeFormatter f = DateTimeFormat.forPattern("C").withLocale(Locale.UK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37114);assertEquals(dt.toString(), "20", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37115);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37116);assertEquals(dt.toString(), "20", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37117);dt = dt.withZone(TOKYO); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37118);assertEquals(dt.toString(), "20", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37119);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37120);assertEquals(dt.toString(), "1", f.print(dt)); 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testFormat_weekyear210() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1poieq7sn5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_weekyear210",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1poieq7sn5(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37121); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37122);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37123);DateTimeFormatter f = DateTimeFormat.forPattern("x").withLocale(Locale.UK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37124);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37125);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37126);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37127);dt = dt.withZone(TOKYO); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37128);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37129);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37130);assertEquals(dt.toString(), "-123", f.print(dt)); 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testFormat_yearOfEra_twoDigit211() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oiil9fsnf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_yearOfEra_twoDigit211",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37131,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oiil9fsnf(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37131); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37132);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37133);DateTimeFormatter f = DateTimeFormat.forPattern("YY").withLocale(Locale.UK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37134);assertEquals(dt.toString(), "04", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37135);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37136);assertEquals(dt.toString(), "23", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37137);f = f.withZoneUTC(); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37138);DateTime expect = null; 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37139);expect = new DateTime(2004, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37140);assertEquals(expect, f.parseDateTime("04")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37141);expect = new DateTime(1922, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37142);assertEquals(expect, f.parseDateTime("22")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37143);expect = new DateTime(2021, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37144);assertEquals(expect, f.parseDateTime("21")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37145);try { 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37146);f.parseDateTime("-"); 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37147);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37148);try { 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37149);f.parseDateTime("+"); 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37150);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37151);f = f.withPivotYear(new Integer(2050)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37152);expect = new DateTime(2000, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37153);assertEquals(expect, f.parseDateTime("00")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37154);expect = new DateTime(2099, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37155);assertEquals(expect, f.parseDateTime("99")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37156);f = DateTimeFormat.forPattern("YY").withLocale(Locale.UK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37157);f = f.withZoneUTC(); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37158);f.parseDateTime("5"); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37159);f.parseDateTime("005"); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37160);f.parseDateTime("+50"); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37161);f.parseDateTime("-50"); 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testFormat_weekyearOfEra_twoDigit212() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nla2a8soa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_weekyearOfEra_twoDigit212",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nla2a8soa(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37162); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37163);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37164);DateTimeFormatter f = DateTimeFormat.forPattern("xx").withLocale(Locale.UK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37165);assertEquals(dt.toString(), "04", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37166);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37167);assertEquals(dt.toString(), "23", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37168);f = f.withZoneUTC(); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37169);DateTime expect = null; 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37170);expect = new DateTime(2003, 12, 29, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37171);assertEquals(expect, f.parseDateTime("04")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37172);expect = new DateTime(1922, 1, 2, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37173);assertEquals(expect, f.parseDateTime("22")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37174);expect = new DateTime(2021, 1, 4, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37175);assertEquals(expect, f.parseDateTime("21")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37176);try { 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37177);f.parseDateTime("-"); 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37178);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37179);try { 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37180);f.parseDateTime("+"); 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37181);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37182);f = f.withPivotYear(new Integer(2050)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37183);expect = new DateTime(2000, 1, 3, 0, 0, 0, 0, DateTimeZone.UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37184);assertEquals(expect, f.parseDateTime("00")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37185);expect = new DateTime(2098, 12, 29, 0, 0, 0, 0, DateTimeZone.UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37186);assertEquals(expect, f.parseDateTime("99")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37187);f = new DateTimeFormatterBuilder().appendTwoDigitWeekyear(2000).toFormatter(); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37188);f = f.withZoneUTC(); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37189);try { 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37190);f.parseDateTime("5"); 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37191);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37192);try { 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37193);f.parseDateTime("005"); 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37194);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37195);try { 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37196);f.parseDateTime("+50"); 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37197);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37198);try { 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37199);f.parseDateTime("-50"); 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37200);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37201);f = DateTimeFormat.forPattern("xx").withLocale(Locale.UK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37202);f = f.withZoneUTC(); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37203);f.parseDateTime("5"); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37204);f.parseDateTime("005"); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37205);f.parseDateTime("+50"); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37206);f.parseDateTime("-50"); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37207);f = new DateTimeFormatterBuilder().appendTwoDigitWeekyear(2000, true).toFormatter(); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37208);f = f.withZoneUTC(); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37209);expect = new DateTime(2003, 12, 29, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37210);assertEquals(expect, f.parseDateTime("04")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37211);expect = new DateTime(3, 12, 29, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37212);assertEquals(expect, f.parseDateTime("+04")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37213);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37214);assertEquals(expect, f.parseDateTime("-04")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37215);expect = new DateTime(3, 12, 29, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37216);assertEquals(expect, f.parseDateTime("4")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37217);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37218);assertEquals(expect, f.parseDateTime("-4")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37219);expect = new DateTime(3, 12, 29, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37220);assertEquals(expect, f.parseDateTime("004")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37221);expect = new DateTime(3, 12, 29, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37222);assertEquals(expect, f.parseDateTime("+004")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37223);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37224);assertEquals(expect, f.parseDateTime("-004")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37225);expect = new DateTime(3004, 1, 2, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37226);assertEquals(expect, f.parseDateTime("3004")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37227);expect = new DateTime(3004, 1, 2, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37228);assertEquals(expect, f.parseDateTime("+3004")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37229);expect = new DateTime(-3004, 1, 4, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37230);assertEquals(expect, f.parseDateTime("-3004")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37231);try { 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37232);f.parseDateTime("-"); 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37233);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37234);try { 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37235);f.parseDateTime("+"); 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37236);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testFormat_yearOfEra213() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12tg2vjsqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_yearOfEra213",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37237,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12tg2vjsqd(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37237); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37238);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37239);DateTimeFormatter f = DateTimeFormat.forPattern("Y").withLocale(Locale.UK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37240);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37241);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37242);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37243);dt = dt.withZone(TOKYO); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37244);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37245);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37246);assertEquals(dt.toString(), "124", f.print(dt)); 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testFormatParse_textMonthApr_Korean214() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dvgk02sqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthApr_Korean214",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dvgk02sqn(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37247); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37248);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("EEEE, d MMMM yyyy HH:mm").withLocale(Locale.KOREAN).withZoneUTC(); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37249);String str = new DateTime(2007, 3, 8, 22, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37250);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37251);assertEquals(new DateTime(2007, 3, 8, 22, 0, 0, 0, UTC), date); 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testFormat_monthOfYearShortText215() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d7stousqs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_monthOfYearShortText215",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d7stousqs(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37252); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37253);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37254);DateTimeFormatter f = DateTimeFormat.forPattern("MMM").withLocale(Locale.UK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37255);assertEquals(dt.toString(), "Jun", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37256);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37257);assertEquals(dt.toString(), "Jun", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37258);dt = dt.withZone(TOKYO); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37259);assertEquals(dt.toString(), "Jun", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37260);f = f.withLocale(Locale.FRENCH); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37261);assertEquals(dt.toString(), "juin", f.print(dt)); 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testFormat_clockhourOfDay216() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d6tqidsr2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_clockhourOfDay216",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d6tqidsr2(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37262); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37263);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37264);DateTimeFormatter f = DateTimeFormat.forPattern("k").withLocale(Locale.UK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37265);assertEquals(dt.toString(), "10", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37266);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37267);assertEquals(dt.toString(), "6", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37268);dt = dt.withZone(TOKYO); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37269);assertEquals(dt.toString(), "19", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37270);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37271);assertEquals(dt.toString(), "24", f.print(dt)); 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testFormat_hourOfHalfday217() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1irb43rsrc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_hourOfHalfday217",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1irb43rsrc(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37272); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37273);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37274);DateTimeFormatter f = DateTimeFormat.forPattern("K").withLocale(Locale.UK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37275);assertEquals(dt.toString(), "10", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37276);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37277);assertEquals(dt.toString(), "6", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37278);dt = dt.withZone(TOKYO); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37279);assertEquals(dt.toString(), "7", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37280);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37281);assertEquals(dt.toString(), "0", f.print(dt)); 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testFormat_dayOfWeek218() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n5nsofsrm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfWeek218",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n5nsofsrm(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37282); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37283);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37284);DateTimeFormatter f = DateTimeFormat.forPattern("e").withLocale(Locale.UK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37285);assertEquals(dt.toString(), "3", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37286);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37287);assertEquals(dt.toString(), "3", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37288);dt = dt.withZone(TOKYO); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37289);assertEquals(dt.toString(), "3", f.print(dt)); 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testFormat_dayOfWeekShortText219() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mlf7fbsru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfWeekShortText219",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mlf7fbsru(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37290); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37291);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37292);DateTimeFormatter f = DateTimeFormat.forPattern("E").withLocale(Locale.UK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37293);assertEquals(dt.toString(), "Wed", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37294);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37295);assertEquals(dt.toString(), "Wed", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37296);dt = dt.withZone(TOKYO); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37297);assertEquals(dt.toString(), "Wed", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37298);f = f.withLocale(Locale.FRENCH); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37299);assertEquals(dt.toString(), "mer.", f.print(dt)); 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testFormat_dayOfYearText220() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h4chgwss4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfYearText220",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37300,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h4chgwss4(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37300); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37301);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37302);DateTimeFormatter f = DateTimeFormat.forPattern("D").withLocale(Locale.UK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37303);assertEquals(dt.toString(), "161", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37304);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37305);assertEquals(dt.toString(), "161", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37306);dt = dt.withZone(TOKYO); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37307);assertEquals(dt.toString(), "161", f.print(dt)); 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testFormat_zoneAmount221() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14lpq8ussc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_zoneAmount221",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37308,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14lpq8ussc(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37308); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37309);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37310);DateTimeFormatter f = DateTimeFormat.forPattern("Z").withLocale(Locale.UK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37311);assertEquals(dt.toString(), "+0000", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37312);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37313);assertEquals(dt.toString(), "-0400", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37314);dt = dt.withZone(TOKYO); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37315);assertEquals(dt.toString(), "+0900", f.print(dt)); 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testFormatParse_zoneId_colon222() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17dmgirssk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_zoneId_colon222",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37316,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17dmgirssk(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37316); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37317);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("HH:mm ZZ").withZoneUTC(); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37318);String str = new DateTime(2007, 6, 23, 1, 2, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37319);assertEquals("01:02 +00:00", str); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37320);DateTime parsed = dateFormatter.parseDateTime(str); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37321);assertEquals(1, parsed.getHourOfDay()); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37322);assertEquals(2, parsed.getMinuteOfHour()); 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testFormat_zoneAmountID223() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yy1fejssr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_zoneAmountID223",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yy1fejssr(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37323); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37324);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37325);DateTimeFormatter f = DateTimeFormat.forPattern("ZZZ").withLocale(Locale.UK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37326);assertEquals(dt.toString(), "UTC", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37327);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37328);assertEquals(dt.toString(), "America/New_York", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37329);dt = dt.withZone(TOKYO); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37330);assertEquals(dt.toString(), "Asia/Tokyo", f.print(dt)); 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testFormat_invalid224() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g5mmcmssz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_invalid224",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g5mmcmssz(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37331); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37332);try { 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37333);DateTimeFormat.forPattern(null); 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37334);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37335);try { 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37336);DateTimeFormat.forPattern(""); 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37337);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37338);try { 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37339);DateTimeFormat.forPattern("A"); 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37340);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37341);try { 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37342);DateTimeFormat.forPattern("dd/mm/AA"); 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37343);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testFormat_other225() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lkdwdestc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_other225",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lkdwdestc(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37344); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37345);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37346);DateTimeFormatter f = DateTimeFormat.forPattern("'Hello' ''"); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37347);assertEquals("Hello '", f.print(dt)); 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testFormatParse_textHalfdayAM_France262() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q3rupestg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textHalfdayAM_France262",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q3rupestg(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37348); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37349);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().appendLiteral('$').appendClockhourOfHalfday(2).appendLiteral('-').appendHalfdayOfDayText().appendLiteral('-').appendYear(4, 4).toFormatter().withLocale(Locale.FRANCE).withZoneUTC(); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37350);String str = new DateTime(2007, 6, 23, 18, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37351);assertEquals("$06-PM-2007", str); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37352);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37353);check(date, 2007, 1, 1); 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testFormatParse_textYear_UK415() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nbr63bstm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textYear_UK415",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nbr63bstm(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37354); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37355);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().appendLiteral('$').appendText(DateTimeFieldType.year()).toFormatter().withLocale(Locale.UK).withZoneUTC(); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37356);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37357);assertEquals("$2007", str); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37358);try { 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37359);dateFormatter.parseDateTime(str); 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37360);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testFormatParse_textMonthAtEnd_France_withSpecifiedDefault564() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l97rf8stt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthAtEnd_France_withSpecifiedDefault564",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37361,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l97rf8stt(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37361); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37362);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM").withLocale(Locale.FRANCE).withZoneUTC().withDefaultYear(1980); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37363);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37364);assertEquals("23 juin", str); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37365);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37366);check(date, 1980, 6, 23); 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testFormatParse_textEraAD_France756() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14i19qestz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textEraAD_France756",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37367,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14i19qestz(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37367); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37368);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().appendLiteral('$').appendEraText().appendYear(4, 4).toFormatter().withLocale(Locale.FRANCE).withZoneUTC(); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37369);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37370);assertEquals("$ap. J.-C.2007", str); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37371);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37372);check(date, 2007, 1, 1); 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testFormatParse_textMonthJanShort_France788() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1otmj5zsu5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthJanShort_France788",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37373,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1otmj5zsu5(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37373); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37374);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM yyyy").withLocale(Locale.FRANCE).withZoneUTC(); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37375);String str = new DateTime(2007, 1, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37376);assertEquals("23 janv. 2007", str); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37377);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37378);check(date, 2007, 1, 23); 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testFormat_year_twoDigit1108() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ok8dhgsub();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_year_twoDigit1108",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ok8dhgsub(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37379); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37380);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37381);DateTimeFormatter f = DateTimeFormat.forPattern("yy").withLocale(Locale.UK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37382);assertEquals(dt.toString(), "04", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37383);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37384);assertEquals(dt.toString(), "23", f.print(dt)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37385);f = f.withZoneUTC(); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37386);DateTime expect = null; 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37387);expect = new DateTime(2004, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37388);assertEquals(expect, f.parseDateTime("04")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37389);expect = new DateTime(1922, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37390);assertEquals(expect, f.parseDateTime("22")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37391);expect = new DateTime(2021, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37392);assertEquals(expect, f.parseDateTime("21")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37393);try { 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37394);f.parseDateTime("-"); 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37395);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37396);try { 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37397);f.parseDateTime("+"); 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37398);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37399);f = f.withPivotYear(new Integer(2050)); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37400);expect = new DateTime(2000, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37401);assertEquals(expect, f.parseDateTime("00")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37402);expect = new DateTime(2099, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37403);assertEquals(expect, f.parseDateTime("99")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37404);f = new DateTimeFormatterBuilder().appendTwoDigitYear(2000).toFormatter(); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37405);f = f.withZoneUTC(); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37406);try { 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37407);f.parseDateTime("5"); 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37408);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37409);try { 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37410);f.parseDateTime("005"); 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37411);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37412);try { 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37413);f.parseDateTime("+50"); 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37414);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37415);try { 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37416);f.parseDateTime("-50"); 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37417);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37418);f = DateTimeFormat.forPattern("yy").withLocale(Locale.UK); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37419);f = f.withZoneUTC(); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37420);f.parseDateTime("5"); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37421);f.parseDateTime("005"); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37422);f.parseDateTime("+50"); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37423);f.parseDateTime("-50"); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37424);f = new DateTimeFormatterBuilder().appendTwoDigitYear(2000, true).toFormatter(); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37425);f = f.withZoneUTC(); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37426);expect = new DateTime(2004, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37427);assertEquals(expect, f.parseDateTime("04")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37428);expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37429);assertEquals(expect, f.parseDateTime("+04")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37430);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37431);assertEquals(expect, f.parseDateTime("-04")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37432);expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37433);assertEquals(expect, f.parseDateTime("4")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37434);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37435);assertEquals(expect, f.parseDateTime("-4")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37436);expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37437);assertEquals(expect, f.parseDateTime("004")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37438);expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37439);assertEquals(expect, f.parseDateTime("+004")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37440);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37441);assertEquals(expect, f.parseDateTime("-004")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37442);expect = new DateTime(3004, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37443);assertEquals(expect, f.parseDateTime("3004")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37444);expect = new DateTime(3004, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37445);assertEquals(expect, f.parseDateTime("+3004")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37446);expect = new DateTime(-3004, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37447);assertEquals(expect, f.parseDateTime("-3004")); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37448);try { 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37449);f.parseDateTime("-"); 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37450);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37451);try { 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37452);f.parseDateTime("+"); 
         __CLR4_4_1slqslqle6rcn0b.R.inc(37453);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testFormatParse_textEraAD_UK1109() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_121t6vkswe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textEraAD_UK1109",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37454,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_121t6vkswe(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37454); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37455);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().appendLiteral('$').appendEraText().appendYear(4, 4).toFormatter().withLocale(Locale.UK).withZoneUTC(); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37456);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37457);assertEquals("$AD2007", str); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37458);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37459);check(date, 2007, 1, 1); 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 


public void testFormatParse_zoneId_noColon1116() {__CLR4_4_1slqslqle6rcn0b.R.globalSliceStart(getClass().getName(),37460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kb54fbswk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1slqslqle6rcn0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1slqslqle6rcn0b.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_zoneId_noColon1116",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kb54fbswk(){try{__CLR4_4_1slqslqle6rcn0b.R.inc(37460); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37461);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("HH:mm Z").withZoneUTC(); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37462);String str = new DateTime(2007, 6, 23, 1, 2, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37463);assertEquals("01:02 +0000", str); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37464);DateTime parsed = dateFormatter.parseDateTime(str); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37465);assertEquals(1, parsed.getHourOfDay()); 
     __CLR4_4_1slqslqle6rcn0b.R.inc(37466);assertEquals(2, parsed.getMinuteOfHour()); 
 }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}} 

    

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
    private void check(DateTime test, int hour, int min, int sec) {try{__CLR4_4_1slqslqle6rcn0b.R.inc(37467);
        __CLR4_4_1slqslqle6rcn0b.R.inc(37468);assertEquals(hour, test.getYear());
        __CLR4_4_1slqslqle6rcn0b.R.inc(37469);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1slqslqle6rcn0b.R.inc(37470);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1slqslqle6rcn0b.R.flushNeeded();}}

}
