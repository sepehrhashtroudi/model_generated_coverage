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
public class TestDateTimeFormat extends TestCase {static class __CLR4_4_1srgsrgle6qeaoy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,37700,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37276);
        __CLR4_4_1srgsrgle6qeaoy.R.inc(37277);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37278);
        __CLR4_4_1srgsrgle6qeaoy.R.inc(37279);return new TestSuite(TestDateTimeFormat.class);
    }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}}

    public TestDateTimeFormat(String name) {
        super(name);__CLR4_4_1srgsrgle6qeaoy.R.inc(37281);try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37280);
    }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37282);
        __CLR4_4_1srgsrgle6qeaoy.R.inc(37283);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1srgsrgle6qeaoy.R.inc(37284);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1srgsrgle6qeaoy.R.inc(37285);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1srgsrgle6qeaoy.R.inc(37286);originalLocale = Locale.getDefault();
        __CLR4_4_1srgsrgle6qeaoy.R.inc(37287);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1srgsrgle6qeaoy.R.inc(37288);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1srgsrgle6qeaoy.R.inc(37289);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37290);
        __CLR4_4_1srgsrgle6qeaoy.R.inc(37291);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1srgsrgle6qeaoy.R.inc(37292);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1srgsrgle6qeaoy.R.inc(37293);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1srgsrgle6qeaoy.R.inc(37294);Locale.setDefault(originalLocale);
        __CLR4_4_1srgsrgle6qeaoy.R.inc(37295);originalDateTimeZone = null;
        __CLR4_4_1srgsrgle6qeaoy.R.inc(37296);originalTimeZone = null;
        __CLR4_4_1srgsrgle6qeaoy.R.inc(37297);originalLocale = null;
    }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFormat_minute197() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1goexdgss2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_minute197",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37298,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1goexdgss2(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37298); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37299);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37300);DateTimeFormatter f = DateTimeFormat.forPattern("m").withLocale(Locale.UK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37301);assertEquals(dt.toString(), "20", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37302);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37303);assertEquals(dt.toString(), "20", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37304);dt = dt.withZone(TOKYO); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37305);assertEquals(dt.toString(), "20", f.print(dt)); 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormat_era206() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mfx135ssa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_era206",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mfx135ssa(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37306); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37307);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37308);DateTimeFormatter f = DateTimeFormat.forPattern("G").withLocale(Locale.UK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37309);assertEquals(dt.toString(), "AD", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37310);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37311);assertEquals(dt.toString(), "AD", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37312);dt = dt.withZone(PARIS); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37313);assertEquals(dt.toString(), "AD", f.print(dt)); 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormat_centuryOfEra207() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gtbwqpssi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_centuryOfEra207",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gtbwqpssi(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37314); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37315);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37316);DateTimeFormatter f = DateTimeFormat.forPattern("C").withLocale(Locale.UK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37317);assertEquals(dt.toString(), "20", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37318);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37319);assertEquals(dt.toString(), "20", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37320);dt = dt.withZone(TOKYO); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37321);assertEquals(dt.toString(), "20", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37322);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37323);assertEquals(dt.toString(), "1", f.print(dt)); 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormat_weekyear208() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tedkxysss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_weekyear208",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tedkxysss(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37324); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37325);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37326);DateTimeFormatter f = DateTimeFormat.forPattern("x").withLocale(Locale.UK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37327);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37328);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37329);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37330);dt = dt.withZone(TOKYO); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37331);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37332);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37333);assertEquals(dt.toString(), "-123", f.print(dt)); 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormat_yearOfEra_twoDigit209() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ksnf1ost2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_yearOfEra_twoDigit209",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37334,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ksnf1ost2(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37334); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37335);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37336);DateTimeFormatter f = DateTimeFormat.forPattern("YY").withLocale(Locale.UK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37337);assertEquals(dt.toString(), "04", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37338);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37339);assertEquals(dt.toString(), "23", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37340);f = f.withZoneUTC(); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37341);DateTime expect = null; 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37342);expect = new DateTime(2004, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37343);assertEquals(expect, f.parseDateTime("04")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37344);expect = new DateTime(1922, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37345);assertEquals(expect, f.parseDateTime("22")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37346);expect = new DateTime(2021, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37347);assertEquals(expect, f.parseDateTime("21")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37348);try { 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37349);f.parseDateTime("-"); 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37350);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37351);try { 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37352);f.parseDateTime("+"); 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37353);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37354);f = f.withPivotYear(new Integer(2050)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37355);expect = new DateTime(2000, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37356);assertEquals(expect, f.parseDateTime("00")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37357);expect = new DateTime(2099, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37358);assertEquals(expect, f.parseDateTime("99")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37359);f = DateTimeFormat.forPattern("YY").withLocale(Locale.UK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37360);f = f.withZoneUTC(); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37361);f.parseDateTime("5"); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37362);f.parseDateTime("005"); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37363);f.parseDateTime("+50"); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37364);f.parseDateTime("-50"); 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormat_shortBasicParse210() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hxqcdvstx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_shortBasicParse210",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hxqcdvstx(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37365); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37366);DateTime dt = new DateTime(2004, 3, 9, 0, 0, 0, 0); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37367);DateTimeFormatter f = DateTimeFormat.forPattern("yyMMdd"); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37368);assertEquals(dt, f.parseDateTime("040309")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37369);try { 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37370);assertEquals(dt, f.parseDateTime("20040309")); 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37371);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37372);f = DateTimeFormat.forPattern("yy/MM/dd"); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37373);assertEquals(dt, f.parseDateTime("04/03/09")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37374);assertEquals(dt, f.parseDateTime("2004/03/09")); 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormat_weekyearOfEra_twoDigit211() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kca3hrsu7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_weekyearOfEra_twoDigit211",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37375,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kca3hrsu7(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37375); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37376);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37377);DateTimeFormatter f = DateTimeFormat.forPattern("xx").withLocale(Locale.UK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37378);assertEquals(dt.toString(), "04", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37379);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37380);assertEquals(dt.toString(), "23", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37381);f = f.withZoneUTC(); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37382);DateTime expect = null; 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37383);expect = new DateTime(2003, 12, 29, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37384);assertEquals(expect, f.parseDateTime("04")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37385);expect = new DateTime(1922, 1, 2, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37386);assertEquals(expect, f.parseDateTime("22")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37387);expect = new DateTime(2021, 1, 4, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37388);assertEquals(expect, f.parseDateTime("21")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37389);try { 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37390);f.parseDateTime("-"); 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37391);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37392);try { 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37393);f.parseDateTime("+"); 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37394);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37395);f = f.withPivotYear(new Integer(2050)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37396);expect = new DateTime(2000, 1, 3, 0, 0, 0, 0, DateTimeZone.UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37397);assertEquals(expect, f.parseDateTime("00")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37398);expect = new DateTime(2098, 12, 29, 0, 0, 0, 0, DateTimeZone.UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37399);assertEquals(expect, f.parseDateTime("99")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37400);f = new DateTimeFormatterBuilder().appendTwoDigitWeekyear(2000).toFormatter(); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37401);f = f.withZoneUTC(); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37402);try { 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37403);f.parseDateTime("5"); 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37404);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37405);try { 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37406);f.parseDateTime("005"); 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37407);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37408);try { 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37409);f.parseDateTime("+50"); 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37410);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37411);try { 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37412);f.parseDateTime("-50"); 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37413);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37414);f = DateTimeFormat.forPattern("xx").withLocale(Locale.UK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37415);f = f.withZoneUTC(); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37416);f.parseDateTime("5"); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37417);f.parseDateTime("005"); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37418);f.parseDateTime("+50"); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37419);f.parseDateTime("-50"); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37420);f = new DateTimeFormatterBuilder().appendTwoDigitWeekyear(2000, true).toFormatter(); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37421);f = f.withZoneUTC(); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37422);expect = new DateTime(2003, 12, 29, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37423);assertEquals(expect, f.parseDateTime("04")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37424);expect = new DateTime(3, 12, 29, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37425);assertEquals(expect, f.parseDateTime("+04")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37426);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37427);assertEquals(expect, f.parseDateTime("-04")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37428);expect = new DateTime(3, 12, 29, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37429);assertEquals(expect, f.parseDateTime("4")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37430);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37431);assertEquals(expect, f.parseDateTime("-4")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37432);expect = new DateTime(3, 12, 29, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37433);assertEquals(expect, f.parseDateTime("004")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37434);expect = new DateTime(3, 12, 29, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37435);assertEquals(expect, f.parseDateTime("+004")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37436);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37437);assertEquals(expect, f.parseDateTime("-004")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37438);expect = new DateTime(3004, 1, 2, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37439);assertEquals(expect, f.parseDateTime("3004")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37440);expect = new DateTime(3004, 1, 2, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37441);assertEquals(expect, f.parseDateTime("+3004")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37442);expect = new DateTime(-3004, 1, 4, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37443);assertEquals(expect, f.parseDateTime("-3004")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37444);try { 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37445);f.parseDateTime("-"); 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37446);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37447);try { 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37448);f.parseDateTime("+"); 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37449);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormat_year_long212() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fegbn2swa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_year_long212",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37450,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fegbn2swa(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37450); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37451);DateTime dt = new DateTime(278004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37452);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy"); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37453);assertEquals(dt.toString(), "278004", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37454);f = DateTimeFormat.forPattern("yyyyMMdd"); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37455);assertEquals(dt.toString(), "2780040609", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37456);f = DateTimeFormat.forPattern("yyyyddMM"); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37457);assertEquals(dt.toString(), "2780040906", f.print(dt)); 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormat_yearOfEra213() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12tg2vjswi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_yearOfEra213",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37458,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12tg2vjswi(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37458); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37459);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37460);DateTimeFormatter f = DateTimeFormat.forPattern("Y").withLocale(Locale.UK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37461);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37462);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37463);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37464);dt = dt.withZone(TOKYO); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37465);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37466);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37467);assertEquals(dt.toString(), "124", f.print(dt)); 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormatParse_textMonthApr_Korean214() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dvgk02sws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthApr_Korean214",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dvgk02sws(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37468); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37469);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("EEEE, d MMMM yyyy HH:mm").withLocale(Locale.KOREAN).withZoneUTC(); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37470);String str = new DateTime(2007, 3, 8, 22, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37471);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37472);assertEquals(new DateTime(2007, 3, 8, 22, 0, 0, 0, UTC), date); 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormat_monthOfYearShortText215() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d7stouswx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_monthOfYearShortText215",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d7stouswx(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37473); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37474);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37475);DateTimeFormatter f = DateTimeFormat.forPattern("MMM").withLocale(Locale.UK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37476);assertEquals(dt.toString(), "Jun", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37477);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37478);assertEquals(dt.toString(), "Jun", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37479);dt = dt.withZone(TOKYO); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37480);assertEquals(dt.toString(), "Jun", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37481);f = f.withLocale(Locale.FRENCH); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37482);assertEquals(dt.toString(), "juin", f.print(dt)); 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormat_clockhourOfDay216() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d6tqidsx7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_clockhourOfDay216",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d6tqidsx7(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37483); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37484);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37485);DateTimeFormatter f = DateTimeFormat.forPattern("k").withLocale(Locale.UK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37486);assertEquals(dt.toString(), "10", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37487);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37488);assertEquals(dt.toString(), "6", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37489);dt = dt.withZone(TOKYO); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37490);assertEquals(dt.toString(), "19", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37491);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37492);assertEquals(dt.toString(), "24", f.print(dt)); 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormat_hourOfHalfday217() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1irb43rsxh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_hourOfHalfday217",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37493,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1irb43rsxh(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37493); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37494);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37495);DateTimeFormatter f = DateTimeFormat.forPattern("K").withLocale(Locale.UK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37496);assertEquals(dt.toString(), "10", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37497);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37498);assertEquals(dt.toString(), "6", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37499);dt = dt.withZone(TOKYO); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37500);assertEquals(dt.toString(), "7", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37501);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37502);assertEquals(dt.toString(), "0", f.print(dt)); 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormat_second218() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17vss6usxr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_second218",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17vss6usxr(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37503); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37504);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37505);DateTimeFormatter f = DateTimeFormat.forPattern("s").withLocale(Locale.UK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37506);assertEquals(dt.toString(), "30", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37507);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37508);assertEquals(dt.toString(), "30", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37509);dt = dt.withZone(TOKYO); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37510);assertEquals(dt.toString(), "30", f.print(dt)); 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormat_fractionOfSecondLong219() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12zq0dasxz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_fractionOfSecondLong219",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37511,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12zq0dasxz(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37511); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37512);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37513);DateTimeFormatter f = DateTimeFormat.forPattern("SSSSSS").withLocale(Locale.UK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37514);assertEquals(dt.toString(), "040000", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37515);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37516);assertEquals(dt.toString(), "040000", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37517);dt = dt.withZone(TOKYO); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37518);assertEquals(dt.toString(), "040000", f.print(dt)); 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormat_dayOfYearText220() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h4chgwsy7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfYearText220",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h4chgwsy7(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37519); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37520);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37521);DateTimeFormatter f = DateTimeFormat.forPattern("D").withLocale(Locale.UK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37522);assertEquals(dt.toString(), "161", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37523);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37524);assertEquals(dt.toString(), "161", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37525);dt = dt.withZone(TOKYO); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37526);assertEquals(dt.toString(), "161", f.print(dt)); 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormat_zoneAmount222() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17upp1bsyf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_zoneAmount222",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37527,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17upp1bsyf(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37527); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37528);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37529);DateTimeFormatter f = DateTimeFormat.forPattern("Z").withLocale(Locale.UK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37530);assertEquals(dt.toString(), "+0000", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37531);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37532);assertEquals(dt.toString(), "-0400", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37533);dt = dt.withZone(TOKYO); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37534);assertEquals(dt.toString(), "+0900", f.print(dt)); 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormatParse_zoneId_colon223() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_144mhqasyn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_zoneId_colon223",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37535,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_144mhqasyn(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37535); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37536);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("HH:mm ZZ").withZoneUTC(); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37537);String str = new DateTime(2007, 6, 23, 1, 2, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37538);assertEquals("01:02 +00:00", str); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37539);DateTime parsed = dateFormatter.parseDateTime(str); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37540);assertEquals(1, parsed.getHourOfDay()); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37541);assertEquals(2, parsed.getMinuteOfHour()); 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormat_zoneAmountID224() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vp1gm2syu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_zoneAmountID224",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vp1gm2syu(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37542); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37543);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37544);DateTimeFormatter f = DateTimeFormat.forPattern("ZZZ").withLocale(Locale.UK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37545);assertEquals(dt.toString(), "UTC", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37546);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37547);assertEquals(dt.toString(), "America/New_York", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37548);dt = dt.withZone(TOKYO); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37549);assertEquals(dt.toString(), "Asia/Tokyo", f.print(dt)); 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormat_invalid225() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cwmnk5sz2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_invalid225",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cwmnk5sz2(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37550); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37551);try { 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37552);DateTimeFormat.forPattern(null); 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37553);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37554);try { 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37555);DateTimeFormat.forPattern(""); 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37556);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37557);try { 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37558);DateTimeFormat.forPattern("A"); 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37559);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37560);try { 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37561);DateTimeFormat.forPattern("dd/mm/AA"); 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37562);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormat_other226() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1otdv5vszf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_other226",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37563,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1otdv5vszf(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37563); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37564);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37565);DateTimeFormatter f = DateTimeFormat.forPattern("'Hello' ''"); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37566);assertEquals("Hello '", f.print(dt)); 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormatParse_textHalfdayAM_France254() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lph8b5szj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textHalfdayAM_France254",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lph8b5szj(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37567); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37568);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().appendLiteral('$').appendClockhourOfHalfday(2).appendLiteral('-').appendHalfdayOfDayText().appendLiteral('-').appendYear(4, 4).toFormatter().withLocale(Locale.FRANCE).withZoneUTC(); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37569);String str = new DateTime(2007, 6, 23, 18, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37570);assertEquals("$06-PM-2007", str); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37571);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37572);check(date, 2007, 1, 1); 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormatParse_textYear_UK407() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ohhwx8szp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textYear_UK407",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ohhwx8szp(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37573); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37574);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().appendLiteral('$').appendText(DateTimeFieldType.year()).toFormatter().withLocale(Locale.UK).withZoneUTC(); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37575);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37576);assertEquals("$2007", str); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37577);try { 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37578);dateFormatter.parseDateTime(str); 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37579);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormatParse_textMonthAtEnd_France_withSpecifiedDefault551() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7n1hqszw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthAtEnd_France_withSpecifiedDefault551",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37580,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7n1hqszw(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37580); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37581);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM").withLocale(Locale.FRANCE).withZoneUTC().withDefaultYear(1980); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37582);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37583);assertEquals("23 juin", str); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37584);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37585);check(date, 1980, 6, 23); 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormatParse_textMonthJanShort_France790() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sjhpdqt02();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthJanShort_France790",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37586,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sjhpdqt02(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37586); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37587);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM yyyy").withLocale(Locale.FRANCE).withZoneUTC(); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37588);String str = new DateTime(2007, 1, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37589);assertEquals("23 janv. 2007", str); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37590);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37591);check(date, 2007, 1, 23); 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormatParse_textHalfdayAM_UK823() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14w20f2t08();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textHalfdayAM_UK823",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14w20f2t08(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37592); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37593);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().appendLiteral('$').appendClockhourOfHalfday(2).appendLiteral('-').appendHalfdayOfDayText().appendLiteral('-').appendYear(4, 4).toFormatter().withLocale(Locale.UK).withZoneUTC(); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37594);String str = new DateTime(2007, 6, 23, 18, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37595);assertEquals("$06-PM-2007", str); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37596);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37597);check(date, 2007, 1, 1); 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormat_year_twoDigit1116() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11cdeivt0e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_year_twoDigit1116",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37598,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11cdeivt0e(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37598); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37599);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37600);DateTimeFormatter f = DateTimeFormat.forPattern("yy").withLocale(Locale.UK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37601);assertEquals(dt.toString(), "04", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37602);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37603);assertEquals(dt.toString(), "23", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37604);f = f.withZoneUTC(); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37605);DateTime expect = null; 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37606);expect = new DateTime(2004, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37607);assertEquals(expect, f.parseDateTime("04")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37608);expect = new DateTime(1922, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37609);assertEquals(expect, f.parseDateTime("22")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37610);expect = new DateTime(2021, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37611);assertEquals(expect, f.parseDateTime("21")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37612);try { 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37613);f.parseDateTime("-"); 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37614);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37615);try { 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37616);f.parseDateTime("+"); 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37617);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37618);f = f.withPivotYear(new Integer(2050)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37619);expect = new DateTime(2000, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37620);assertEquals(expect, f.parseDateTime("00")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37621);expect = new DateTime(2099, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37622);assertEquals(expect, f.parseDateTime("99")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37623);f = new DateTimeFormatterBuilder().appendTwoDigitYear(2000).toFormatter(); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37624);f = f.withZoneUTC(); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37625);try { 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37626);f.parseDateTime("5"); 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37627);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37628);try { 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37629);f.parseDateTime("005"); 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37630);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37631);try { 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37632);f.parseDateTime("+50"); 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37633);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37634);try { 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37635);f.parseDateTime("-50"); 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37636);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37637);f = DateTimeFormat.forPattern("yy").withLocale(Locale.UK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37638);f = f.withZoneUTC(); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37639);f.parseDateTime("5"); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37640);f.parseDateTime("005"); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37641);f.parseDateTime("+50"); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37642);f.parseDateTime("-50"); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37643);f = new DateTimeFormatterBuilder().appendTwoDigitYear(2000, true).toFormatter(); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37644);f = f.withZoneUTC(); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37645);expect = new DateTime(2004, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37646);assertEquals(expect, f.parseDateTime("04")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37647);expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37648);assertEquals(expect, f.parseDateTime("+04")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37649);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37650);assertEquals(expect, f.parseDateTime("-04")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37651);expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37652);assertEquals(expect, f.parseDateTime("4")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37653);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37654);assertEquals(expect, f.parseDateTime("-4")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37655);expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37656);assertEquals(expect, f.parseDateTime("004")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37657);expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37658);assertEquals(expect, f.parseDateTime("+004")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37659);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37660);assertEquals(expect, f.parseDateTime("-004")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37661);expect = new DateTime(3004, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37662);assertEquals(expect, f.parseDateTime("3004")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37663);expect = new DateTime(3004, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37664);assertEquals(expect, f.parseDateTime("+3004")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37665);expect = new DateTime(-3004, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37666);assertEquals(expect, f.parseDateTime("-3004")); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37667);try { 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37668);f.parseDateTime("-"); 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37669);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37670);try { 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37671);f.parseDateTime("+"); 
         __CLR4_4_1srgsrgle6qeaoy.R.inc(37672);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormat_dayOfWeekText1117() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_124v4lt2h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfWeekText1117",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37673,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_124v4lt2h(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37673); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37674);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37675);DateTimeFormatter f = DateTimeFormat.forPattern("EEEE").withLocale(Locale.UK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37676);assertEquals(dt.toString(), "Wednesday", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37677);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37678);assertEquals(dt.toString(), "Wednesday", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37679);dt = dt.withZone(TOKYO); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37680);assertEquals(dt.toString(), "Wednesday", f.print(dt)); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37681);f = f.withLocale(Locale.FRENCH); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37682);assertEquals(dt.toString(), "mercredi", f.print(dt)); 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormatParse_textEraAD_UK1118() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sio4mmt2r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textEraAD_UK1118",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37683,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sio4mmt2r(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37683); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37684);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().appendLiteral('$').appendEraText().appendYear(4, 4).toFormatter().withLocale(Locale.UK).withZoneUTC(); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37685);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37686);assertEquals("$AD2007", str); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37687);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37688);check(date, 2007, 1, 1); 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 


public void testFormatParse_zoneId_noColon1127() {__CLR4_4_1srgsrgle6qeaoy.R.globalSliceStart(getClass().getName(),37689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hr427tt2x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1srgsrgle6qeaoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1srgsrgle6qeaoy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_zoneId_noColon1127",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hr427tt2x(){try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37689); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37690);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("HH:mm Z").withZoneUTC(); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37691);String str = new DateTime(2007, 6, 23, 1, 2, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37692);assertEquals("01:02 +0000", str); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37693);DateTime parsed = dateFormatter.parseDateTime(str); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37694);assertEquals(1, parsed.getHourOfDay()); 
     __CLR4_4_1srgsrgle6qeaoy.R.inc(37695);assertEquals(2, parsed.getMinuteOfHour()); 
 }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}} 

    

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
    private void check(DateTime test, int hour, int min, int sec) {try{__CLR4_4_1srgsrgle6qeaoy.R.inc(37696);
        __CLR4_4_1srgsrgle6qeaoy.R.inc(37697);assertEquals(hour, test.getYear());
        __CLR4_4_1srgsrgle6qeaoy.R.inc(37698);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1srgsrgle6qeaoy.R.inc(37699);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1srgsrgle6qeaoy.R.flushNeeded();}}

}
