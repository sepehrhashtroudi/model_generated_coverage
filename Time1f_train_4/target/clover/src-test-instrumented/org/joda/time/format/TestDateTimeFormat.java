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
public class TestDateTimeFormat extends TestCase {static class __CLR4_4_1stlstlle6rjdn9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,37666,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1stlstlle6rjdn9.R.inc(37353);
        __CLR4_4_1stlstlle6rjdn9.R.inc(37354);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1stlstlle6rjdn9.R.inc(37355);
        __CLR4_4_1stlstlle6rjdn9.R.inc(37356);return new TestSuite(TestDateTimeFormat.class);
    }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}}

    public TestDateTimeFormat(String name) {
        super(name);__CLR4_4_1stlstlle6rjdn9.R.inc(37358);try{__CLR4_4_1stlstlle6rjdn9.R.inc(37357);
    }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1stlstlle6rjdn9.R.inc(37359);
        __CLR4_4_1stlstlle6rjdn9.R.inc(37360);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1stlstlle6rjdn9.R.inc(37361);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1stlstlle6rjdn9.R.inc(37362);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1stlstlle6rjdn9.R.inc(37363);originalLocale = Locale.getDefault();
        __CLR4_4_1stlstlle6rjdn9.R.inc(37364);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1stlstlle6rjdn9.R.inc(37365);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1stlstlle6rjdn9.R.inc(37366);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1stlstlle6rjdn9.R.inc(37367);
        __CLR4_4_1stlstlle6rjdn9.R.inc(37368);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1stlstlle6rjdn9.R.inc(37369);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1stlstlle6rjdn9.R.inc(37370);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1stlstlle6rjdn9.R.inc(37371);Locale.setDefault(originalLocale);
        __CLR4_4_1stlstlle6rjdn9.R.inc(37372);originalDateTimeZone = null;
        __CLR4_4_1stlstlle6rjdn9.R.inc(37373);originalTimeZone = null;
        __CLR4_4_1stlstlle6rjdn9.R.inc(37374);originalLocale = null;
    }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFormat_minute196() {__CLR4_4_1stlstlle6rjdn9.R.globalSliceStart(getClass().getName(),37375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jxew5xsu7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1stlstlle6rjdn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1stlstlle6rjdn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_minute196",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37375,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jxew5xsu7(){try{__CLR4_4_1stlstlle6rjdn9.R.inc(37375); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37376);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37377);DateTimeFormatter f = DateTimeFormat.forPattern("m").withLocale(Locale.UK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37378);assertEquals(dt.toString(), "20", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37379);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37380);assertEquals(dt.toString(), "20", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37381);dt = dt.withZone(TOKYO); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37382);assertEquals(dt.toString(), "20", f.print(dt)); 
 }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}} 


public void testSubclassableConstructor204() {__CLR4_4_1stlstlle6rjdn9.R.globalSliceStart(getClass().getName(),37383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k8mme1suf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1stlstlle6rjdn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1stlstlle6rjdn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testSubclassableConstructor204",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k8mme1suf(){try{__CLR4_4_1stlstlle6rjdn9.R.inc(37383); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37384);DateTimeFormat f = new DateTimeFormat() { 
     }; 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37385);assertNotNull(f); 
 }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}} 


public void testFormat_era205() {__CLR4_4_1stlstlle6rjdn9.R.globalSliceStart(getClass().getName(),37386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j6x2aosui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1stlstlle6rjdn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1stlstlle6rjdn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_era205",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37386,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j6x2aosui(){try{__CLR4_4_1stlstlle6rjdn9.R.inc(37386); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37387);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37388);DateTimeFormatter f = DateTimeFormat.forPattern("G").withLocale(Locale.UK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37389);assertEquals(dt.toString(), "AD", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37390);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37391);assertEquals(dt.toString(), "AD", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37392);dt = dt.withZone(PARIS); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37393);assertEquals(dt.toString(), "AD", f.print(dt)); 
 }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}} 


public void testFormat_yearOfEra_twoDigit206() {__CLR4_4_1stlstlle6rjdn9.R.globalSliceStart(getClass().getName(),37394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b1nio9suq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1stlstlle6rjdn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1stlstlle6rjdn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_yearOfEra_twoDigit206",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b1nio9suq(){try{__CLR4_4_1stlstlle6rjdn9.R.inc(37394); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37395);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37396);DateTimeFormatter f = DateTimeFormat.forPattern("YY").withLocale(Locale.UK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37397);assertEquals(dt.toString(), "04", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37398);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37399);assertEquals(dt.toString(), "23", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37400);f = f.withZoneUTC(); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37401);DateTime expect = null; 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37402);expect = new DateTime(2004, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37403);assertEquals(expect, f.parseDateTime("04")); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37404);expect = new DateTime(1922, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37405);assertEquals(expect, f.parseDateTime("22")); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37406);expect = new DateTime(2021, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37407);assertEquals(expect, f.parseDateTime("21")); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37408);try { 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37409);f.parseDateTime("-"); 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37410);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37411);try { 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37412);f.parseDateTime("+"); 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37413);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37414);f = f.withPivotYear(new Integer(2050)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37415);expect = new DateTime(2000, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37416);assertEquals(expect, f.parseDateTime("00")); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37417);expect = new DateTime(2099, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37418);assertEquals(expect, f.parseDateTime("99")); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37419);f = DateTimeFormat.forPattern("YY").withLocale(Locale.UK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37420);f = f.withZoneUTC(); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37421);f.parseDateTime("5"); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37422);f.parseDateTime("005"); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37423);f.parseDateTime("+50"); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37424);f.parseDateTime("-50"); 
 }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}} 


public void testFormat_shortBasicParse207() {__CLR4_4_1stlstlle6rjdn9.R.globalSliceStart(getClass().getName(),37425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1owlhe3svl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1stlstlle6rjdn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1stlstlle6rjdn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_shortBasicParse207",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37425,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1owlhe3svl(){try{__CLR4_4_1stlstlle6rjdn9.R.inc(37425); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37426);DateTime dt = new DateTime(2004, 3, 9, 0, 0, 0, 0); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37427);DateTimeFormatter f = DateTimeFormat.forPattern("yyMMdd"); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37428);assertEquals(dt, f.parseDateTime("040309")); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37429);try { 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37430);assertEquals(dt, f.parseDateTime("20040309")); 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37431);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37432);f = DateTimeFormat.forPattern("yy/MM/dd"); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37433);assertEquals(dt, f.parseDateTime("04/03/09")); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37434);assertEquals(dt, f.parseDateTime("2004/03/09")); 
 }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}} 


public void testFormat_weekyearOfEra_twoDigit208() {__CLR4_4_1stlstlle6rjdn9.R.globalSliceStart(getClass().getName(),37435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ddeyhjsvv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1stlstlle6rjdn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1stlstlle6rjdn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_weekyearOfEra_twoDigit208",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37435,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ddeyhjsvv(){try{__CLR4_4_1stlstlle6rjdn9.R.inc(37435); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37436);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37437);DateTimeFormatter f = DateTimeFormat.forPattern("xx").withLocale(Locale.UK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37438);assertEquals(dt.toString(), "04", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37439);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37440);assertEquals(dt.toString(), "23", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37441);f = f.withZoneUTC(); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37442);DateTime expect = null; 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37443);expect = new DateTime(2003, 12, 29, 0, 0, 0, 0, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37444);assertEquals(expect, f.parseDateTime("04")); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37445);expect = new DateTime(1922, 1, 2, 0, 0, 0, 0, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37446);assertEquals(expect, f.parseDateTime("22")); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37447);expect = new DateTime(2021, 1, 4, 0, 0, 0, 0, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37448);assertEquals(expect, f.parseDateTime("21")); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37449);try { 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37450);f.parseDateTime("-"); 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37451);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37452);try { 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37453);f.parseDateTime("+"); 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37454);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37455);f = f.withPivotYear(new Integer(2050)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37456);expect = new DateTime(2000, 1, 3, 0, 0, 0, 0, DateTimeZone.UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37457);assertEquals(expect, f.parseDateTime("00")); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37458);expect = new DateTime(2098, 12, 29, 0, 0, 0, 0, DateTimeZone.UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37459);assertEquals(expect, f.parseDateTime("99")); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37460);f = new DateTimeFormatterBuilder().appendTwoDigitWeekyear(2000).toFormatter(); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37461);f = f.withZoneUTC(); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37462);try { 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37463);f.parseDateTime("5"); 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37464);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37465);try { 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37466);f.parseDateTime("005"); 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37467);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37468);try { 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37469);f.parseDateTime("+50"); 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37470);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37471);try { 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37472);f.parseDateTime("-50"); 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37473);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37474);f = DateTimeFormat.forPattern("xx").withLocale(Locale.UK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37475);f = f.withZoneUTC(); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37476);f.parseDateTime("5"); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37477);f.parseDateTime("005"); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37478);f.parseDateTime("+50"); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37479);f.parseDateTime("-50"); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37480);f = new DateTimeFormatterBuilder().appendTwoDigitWeekyear(2000, true).toFormatter(); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37481);f = f.withZoneUTC(); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37482);expect = new DateTime(2003, 12, 29, 0, 0, 0, 0, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37483);assertEquals(expect, f.parseDateTime("04")); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37484);expect = new DateTime(3, 12, 29, 0, 0, 0, 0, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37485);assertEquals(expect, f.parseDateTime("+04")); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37486);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37487);assertEquals(expect, f.parseDateTime("-04")); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37488);expect = new DateTime(3, 12, 29, 0, 0, 0, 0, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37489);assertEquals(expect, f.parseDateTime("4")); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37490);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37491);assertEquals(expect, f.parseDateTime("-4")); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37492);expect = new DateTime(3, 12, 29, 0, 0, 0, 0, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37493);assertEquals(expect, f.parseDateTime("004")); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37494);expect = new DateTime(3, 12, 29, 0, 0, 0, 0, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37495);assertEquals(expect, f.parseDateTime("+004")); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37496);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37497);assertEquals(expect, f.parseDateTime("-004")); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37498);expect = new DateTime(3004, 1, 2, 0, 0, 0, 0, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37499);assertEquals(expect, f.parseDateTime("3004")); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37500);expect = new DateTime(3004, 1, 2, 0, 0, 0, 0, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37501);assertEquals(expect, f.parseDateTime("+3004")); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37502);expect = new DateTime(-3004, 1, 4, 0, 0, 0, 0, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37503);assertEquals(expect, f.parseDateTime("-3004")); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37504);try { 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37505);f.parseDateTime("-"); 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37506);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37507);try { 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37508);f.parseDateTime("+"); 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37509);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}} 


public void testFormat_year_long209() {__CLR4_4_1stlstlle6rjdn9.R.globalSliceStart(getClass().getName(),37510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mdbgnasxy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1stlstlle6rjdn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1stlstlle6rjdn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_year_long209",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37510,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mdbgnasxy(){try{__CLR4_4_1stlstlle6rjdn9.R.inc(37510); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37511);DateTime dt = new DateTime(278004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37512);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy"); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37513);assertEquals(dt.toString(), "278004", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37514);f = DateTimeFormat.forPattern("yyyyMMdd"); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37515);assertEquals(dt.toString(), "2780040609", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37516);f = DateTimeFormat.forPattern("yyyyddMM"); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37517);assertEquals(dt.toString(), "2780040906", f.print(dt)); 
 }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}} 


public void testFormat_yearOfEra210() {__CLR4_4_1stlstlle6rjdn9.R.globalSliceStart(getClass().getName(),37518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ckfz8ysy6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1stlstlle6rjdn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1stlstlle6rjdn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_yearOfEra210",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ckfz8ysy6(){try{__CLR4_4_1stlstlle6rjdn9.R.inc(37518); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37519);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37520);DateTimeFormatter f = DateTimeFormat.forPattern("Y").withLocale(Locale.UK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37521);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37522);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37523);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37524);dt = dt.withZone(TOKYO); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37525);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37526);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37527);assertEquals(dt.toString(), "124", f.print(dt)); 
 }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}} 


public void testFormatParse_textMonthApr_Korean211() {__CLR4_4_1stlstlle6rjdn9.R.globalSliceStart(getClass().getName(),37528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nmggdhsyg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1stlstlle6rjdn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1stlstlle6rjdn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthApr_Korean211",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nmggdhsyg(){try{__CLR4_4_1stlstlle6rjdn9.R.inc(37528); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37529);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("EEEE, d MMMM yyyy HH:mm").withLocale(Locale.KOREAN).withZoneUTC(); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37530);String str = new DateTime(2007, 3, 8, 22, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37531);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37532);assertEquals(new DateTime(2007, 3, 8, 22, 0, 0, 0, UTC), date); 
 }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}} 


public void testFormat_monthOfYearShortText212() {__CLR4_4_1stlstlle6rjdn9.R.globalSliceStart(getClass().getName(),37533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mysq29syl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1stlstlle6rjdn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1stlstlle6rjdn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_monthOfYearShortText212",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37533,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mysq29syl(){try{__CLR4_4_1stlstlle6rjdn9.R.inc(37533); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37534);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37535);DateTimeFormatter f = DateTimeFormat.forPattern("MMM").withLocale(Locale.UK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37536);assertEquals(dt.toString(), "Jun", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37537);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37538);assertEquals(dt.toString(), "Jun", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37539);dt = dt.withZone(TOKYO); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37540);assertEquals(dt.toString(), "Jun", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37541);f = f.withLocale(Locale.FRENCH); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37542);assertEquals(dt.toString(), "juin", f.print(dt)); 
 }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}} 


public void testFormat_clockhourOfDay213() {__CLR4_4_1stlstlle6rjdn9.R.globalSliceStart(getClass().getName(),37543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ftu4ysyv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1stlstlle6rjdn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1stlstlle6rjdn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_clockhourOfDay213",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37543,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ftu4ysyv(){try{__CLR4_4_1stlstlle6rjdn9.R.inc(37543); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37544);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37545);DateTimeFormatter f = DateTimeFormat.forPattern("k").withLocale(Locale.UK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37546);assertEquals(dt.toString(), "10", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37547);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37548);assertEquals(dt.toString(), "6", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37549);dt = dt.withZone(TOKYO); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37550);assertEquals(dt.toString(), "19", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37551);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37552);assertEquals(dt.toString(), "24", f.print(dt)); 
 }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}} 


public void testFormat_second214() {__CLR4_4_1stlstlle6rjdn9.R.globalSliceStart(getClass().getName(),37553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15472z2sz5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1stlstlle6rjdn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1stlstlle6rjdn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_second214",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37553,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15472z2sz5(){try{__CLR4_4_1stlstlle6rjdn9.R.inc(37553); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37554);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37555);DateTimeFormatter f = DateTimeFormat.forPattern("s").withLocale(Locale.UK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37556);assertEquals(dt.toString(), "30", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37557);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37558);assertEquals(dt.toString(), "30", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37559);dt = dt.withZone(TOKYO); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37560);assertEquals(dt.toString(), "30", f.print(dt)); 
 }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}} 


public void testFormat_fractionOfSecondLong215() {__CLR4_4_1stlstlle6rjdn9.R.globalSliceStart(getClass().getName(),37561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fzpvj6szd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1stlstlle6rjdn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1stlstlle6rjdn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_fractionOfSecondLong215",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fzpvj6szd(){try{__CLR4_4_1stlstlle6rjdn9.R.inc(37561); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37562);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37563);DateTimeFormatter f = DateTimeFormat.forPattern("SSSSSS").withLocale(Locale.UK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37564);assertEquals(dt.toString(), "040000", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37565);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37566);assertEquals(dt.toString(), "040000", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37567);dt = dt.withZone(TOKYO); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37568);assertEquals(dt.toString(), "040000", f.print(dt)); 
 }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}} 


public void testFormat_dayOfWeek216() {__CLR4_4_1stlstlle6rjdn9.R.globalSliceStart(getClass().getName(),37569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gnnv3hszl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1stlstlle6rjdn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1stlstlle6rjdn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfWeek216",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gnnv3hszl(){try{__CLR4_4_1stlstlle6rjdn9.R.inc(37569); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37570);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37571);DateTimeFormatter f = DateTimeFormat.forPattern("e").withLocale(Locale.UK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37572);assertEquals(dt.toString(), "3", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37573);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37574);assertEquals(dt.toString(), "3", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37575);dt = dt.withZone(TOKYO); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37576);assertEquals(dt.toString(), "3", f.print(dt)); 
 }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}} 


public void testFormat_dayOfWeekShortText217() {__CLR4_4_1stlstlle6rjdn9.R.globalSliceStart(getClass().getName(),37577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t3f509szt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1stlstlle6rjdn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1stlstlle6rjdn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfWeekShortText217",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37577,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t3f509szt(){try{__CLR4_4_1stlstlle6rjdn9.R.inc(37577); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37578);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37579);DateTimeFormatter f = DateTimeFormat.forPattern("E").withLocale(Locale.UK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37580);assertEquals(dt.toString(), "Wed", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37581);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37582);assertEquals(dt.toString(), "Wed", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37583);dt = dt.withZone(TOKYO); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37584);assertEquals(dt.toString(), "Wed", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37585);f = f.withLocale(Locale.FRENCH); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37586);assertEquals(dt.toString(), "mer.", f.print(dt)); 
 }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}} 


public void testFormat_dayOfYearText218() {__CLR4_4_1stlstlle6rjdn9.R.globalSliceStart(getClass().getName(),37587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ku7nont03();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1stlstlle6rjdn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1stlstlle6rjdn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfYearText218",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37587,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ku7nont03(){try{__CLR4_4_1stlstlle6rjdn9.R.inc(37587); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37588);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37589);DateTimeFormatter f = DateTimeFormat.forPattern("D").withLocale(Locale.UK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37590);assertEquals(dt.toString(), "161", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37591);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37592);assertEquals(dt.toString(), "161", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37593);dt = dt.withZone(TOKYO); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37594);assertEquals(dt.toString(), "161", f.print(dt)); 
 }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}} 


public void testFormatParse_zoneId_colon220() {__CLR4_4_1stlstlle6rjdn9.R.globalSliceStart(getClass().getName(),37595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dvme3pt0b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1stlstlle6rjdn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1stlstlle6rjdn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_zoneId_colon220",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37595,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dvme3pt0b(){try{__CLR4_4_1stlstlle6rjdn9.R.inc(37595); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37596);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("HH:mm ZZ").withZoneUTC(); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37597);String str = new DateTime(2007, 6, 23, 1, 2, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37598);assertEquals("01:02 +00:00", str); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37599);DateTime parsed = dateFormatter.parseDateTime(str); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37600);assertEquals(1, parsed.getHourOfDay()); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37601);assertEquals(2, parsed.getMinuteOfHour()); 
 }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}} 


public void testFormat_zoneAmountID221() {__CLR4_4_1stlstlle6rjdn9.R.globalSliceStart(getClass().getName(),37602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tl2oznt0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1stlstlle6rjdn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1stlstlle6rjdn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_zoneAmountID221",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37602,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tl2oznt0i(){try{__CLR4_4_1stlstlle6rjdn9.R.inc(37602); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37603);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37604);DateTimeFormatter f = DateTimeFormat.forPattern("ZZZ").withLocale(Locale.UK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37605);assertEquals(dt.toString(), "UTC", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37606);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37607);assertEquals(dt.toString(), "America/New_York", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37608);dt = dt.withZone(TOKYO); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37609);assertEquals(dt.toString(), "Asia/Tokyo", f.print(dt)); 
 }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}} 


public void testFormat_invalid222() {__CLR4_4_1stlstlle6rjdn9.R.globalSliceStart(getClass().getName(),37610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mnmjxkt0q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1stlstlle6rjdn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1stlstlle6rjdn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_invalid222",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37610,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mnmjxkt0q(){try{__CLR4_4_1stlstlle6rjdn9.R.inc(37610); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37611);try { 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37612);DateTimeFormat.forPattern(null); 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37613);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37614);try { 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37615);DateTimeFormat.forPattern(""); 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37616);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37617);try { 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37618);DateTimeFormat.forPattern("A"); 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37619);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37620);try { 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37621);DateTimeFormat.forPattern("dd/mm/AA"); 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37622);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}} 


public void testFormat_other223() {__CLR4_4_1stlstlle6rjdn9.R.globalSliceStart(getClass().getName(),37623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2dysgt13();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1stlstlle6rjdn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1stlstlle6rjdn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_other223",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2dysgt13(){try{__CLR4_4_1stlstlle6rjdn9.R.inc(37623); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37624);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37625);DateTimeFormatter f = DateTimeFormat.forPattern("'Hello' ''"); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37626);assertEquals("Hello '", f.print(dt)); 
 }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}} 


public void testFormatParse_textYear_UK415() {__CLR4_4_1stlstlle6rjdn9.R.globalSliceStart(getClass().getName(),37627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nbr63bt17();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1stlstlle6rjdn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1stlstlle6rjdn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textYear_UK415",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nbr63bt17(){try{__CLR4_4_1stlstlle6rjdn9.R.inc(37627); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37628);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().appendLiteral('$').appendText(DateTimeFieldType.year()).toFormatter().withLocale(Locale.UK).withZoneUTC(); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37629);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37630);assertEquals("$2007", str); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37631);try { 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37632);dateFormatter.parseDateTime(str); 
         __CLR4_4_1stlstlle6rjdn9.R.inc(37633);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}} 


public void testFormatParse_textEraAD_France777() {__CLR4_4_1stlstlle6rjdn9.R.globalSliceStart(getClass().getName(),37634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cufjtzt1e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1stlstlle6rjdn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1stlstlle6rjdn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textEraAD_France777",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37634,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cufjtzt1e(){try{__CLR4_4_1stlstlle6rjdn9.R.inc(37634); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37635);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().appendLiteral('$').appendEraText().appendYear(4, 4).toFormatter().withLocale(Locale.FRANCE).withZoneUTC(); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37636);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37637);assertEquals("$ap. J.-C.2007", str); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37638);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37639);check(date, 2007, 1, 1); 
 }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}} 


public void testFormatParse_textMonthJanShort_France808() {__CLR4_4_1stlstlle6rjdn9.R.globalSliceStart(getClass().getName(),37640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11yr840t1k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1stlstlle6rjdn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1stlstlle6rjdn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthJanShort_France808",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37640,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11yr840t1k(){try{__CLR4_4_1stlstlle6rjdn9.R.inc(37640); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37641);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM yyyy").withLocale(Locale.FRANCE).withZoneUTC(); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37642);String str = new DateTime(2007, 1, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37643);assertEquals("23 janv. 2007", str); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37644);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37645);check(date, 2007, 1, 23); 
 }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}} 


public void testFormatParse_textHalfdayAM_UK840() {__CLR4_4_1stlstlle6rjdn9.R.globalSliceStart(getClass().getName(),37646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ggc4uft1q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1stlstlle6rjdn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1stlstlle6rjdn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textHalfdayAM_UK840",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37646,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ggc4uft1q(){try{__CLR4_4_1stlstlle6rjdn9.R.inc(37646); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37647);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().appendLiteral('$').appendClockhourOfHalfday(2).appendLiteral('-').appendHalfdayOfDayText().appendLiteral('-').appendYear(4, 4).toFormatter().withLocale(Locale.UK).withZoneUTC(); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37648);String str = new DateTime(2007, 6, 23, 18, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37649);assertEquals("$06-PM-2007", str); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37650);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37651);check(date, 2007, 1, 1); 
 }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}} 


public void testFormat_dayOfWeekText1135() {__CLR4_4_1stlstlle6rjdn9.R.globalSliceStart(getClass().getName(),37652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i5j1llt1w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1stlstlle6rjdn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1stlstlle6rjdn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfWeekText1135",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37652,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i5j1llt1w(){try{__CLR4_4_1stlstlle6rjdn9.R.inc(37652); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37653);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37654);DateTimeFormatter f = DateTimeFormat.forPattern("EEEE").withLocale(Locale.UK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37655);assertEquals(dt.toString(), "Wednesday", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37656);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37657);assertEquals(dt.toString(), "Wednesday", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37658);dt = dt.withZone(TOKYO); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37659);assertEquals(dt.toString(), "Wednesday", f.print(dt)); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37660);f = f.withLocale(Locale.FRENCH); 
     __CLR4_4_1stlstlle6rjdn9.R.inc(37661);assertEquals(dt.toString(), "mercredi", f.print(dt)); 
 }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}} 

    

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
    private void check(DateTime test, int hour, int min, int sec) {try{__CLR4_4_1stlstlle6rjdn9.R.inc(37662);
        __CLR4_4_1stlstlle6rjdn9.R.inc(37663);assertEquals(hour, test.getYear());
        __CLR4_4_1stlstlle6rjdn9.R.inc(37664);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1stlstlle6rjdn9.R.inc(37665);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1stlstlle6rjdn9.R.flushNeeded();}}

}
