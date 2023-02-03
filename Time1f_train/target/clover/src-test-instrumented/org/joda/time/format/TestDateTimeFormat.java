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
public class TestDateTimeFormat extends TestCase {static class __CLR4_4_1udvudvlc8axf17{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,39776,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1udvudvlc8axf17.R.inc(39379);
        __CLR4_4_1udvudvlc8axf17.R.inc(39380);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1udvudvlc8axf17.R.inc(39381);
        __CLR4_4_1udvudvlc8axf17.R.inc(39382);return new TestSuite(TestDateTimeFormat.class);
    }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}}

    public TestDateTimeFormat(String name) {
        super(name);__CLR4_4_1udvudvlc8axf17.R.inc(39384);try{__CLR4_4_1udvudvlc8axf17.R.inc(39383);
    }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1udvudvlc8axf17.R.inc(39385);
        __CLR4_4_1udvudvlc8axf17.R.inc(39386);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1udvudvlc8axf17.R.inc(39387);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1udvudvlc8axf17.R.inc(39388);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1udvudvlc8axf17.R.inc(39389);originalLocale = Locale.getDefault();
        __CLR4_4_1udvudvlc8axf17.R.inc(39390);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1udvudvlc8axf17.R.inc(39391);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1udvudvlc8axf17.R.inc(39392);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1udvudvlc8axf17.R.inc(39393);
        __CLR4_4_1udvudvlc8axf17.R.inc(39394);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1udvudvlc8axf17.R.inc(39395);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1udvudvlc8axf17.R.inc(39396);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1udvudvlc8axf17.R.inc(39397);Locale.setDefault(originalLocale);
        __CLR4_4_1udvudvlc8axf17.R.inc(39398);originalDateTimeZone = null;
        __CLR4_4_1udvudvlc8axf17.R.inc(39399);originalTimeZone = null;
        __CLR4_4_1udvudvlc8axf17.R.inc(39400);originalLocale = null;
    }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFormat_weekyear7() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fjj295ueh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_weekyear7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39401,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fjj295ueh(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39401); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39402);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39403);DateTimeFormatter f = DateTimeFormat.forPattern("x").withLocale(Locale.UK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39404);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39405);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39406);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39407);dt = dt.withZone(TOKYO); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39408);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39409);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39410);assertEquals(dt.toString(), "-123", f.print(dt)); 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormat_era14() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_141nwfsuer();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_era14",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39411,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_141nwfsuer(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39411); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39412);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39413);DateTimeFormatter f = DateTimeFormat.forPattern("G").withLocale(Locale.UK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39414);assertEquals(dt.toString(), "AD", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39415);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39416);assertEquals(dt.toString(), "AD", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39417);dt = dt.withZone(PARIS); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39418);assertEquals(dt.toString(), "AD", f.print(dt)); 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormatParse_textYear_UK30() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zeyl8muez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textYear_UK30",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zeyl8muez(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39419); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39420);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().appendLiteral('$').appendText(DateTimeFieldType.year()).toFormatter().withLocale(Locale.UK).withZoneUTC(); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39421);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39422);assertEquals("$2007", str); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39423);try { 
         __CLR4_4_1udvudvlc8axf17.R.inc(39424);dateFormatter.parseDateTime(str); 
         __CLR4_4_1udvudvlc8axf17.R.inc(39425);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormat_invalid188() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z858zbuf6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_invalid188",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z858zbuf6(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39426); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39427);try { 
         __CLR4_4_1udvudvlc8axf17.R.inc(39428);DateTimeFormat.forPattern(null); 
         __CLR4_4_1udvudvlc8axf17.R.inc(39429);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1udvudvlc8axf17.R.inc(39430);try { 
         __CLR4_4_1udvudvlc8axf17.R.inc(39431);DateTimeFormat.forPattern(""); 
         __CLR4_4_1udvudvlc8axf17.R.inc(39432);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1udvudvlc8axf17.R.inc(39433);try { 
         __CLR4_4_1udvudvlc8axf17.R.inc(39434);DateTimeFormat.forPattern("A"); 
         __CLR4_4_1udvudvlc8axf17.R.inc(39435);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1udvudvlc8axf17.R.inc(39436);try { 
         __CLR4_4_1udvudvlc8axf17.R.inc(39437);DateTimeFormat.forPattern("dd/mm/AA"); 
         __CLR4_4_1udvudvlc8axf17.R.inc(39438);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testSubclassableConstructor195() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vii1r6ufj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testSubclassableConstructor195",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39439,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vii1r6ufj(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39439); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39440);DateTimeFormat f = new DateTimeFormat() { 
     }; 
     __CLR4_4_1udvudvlc8axf17.R.inc(39441);assertNotNull(f); 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormat_other304() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rrxhlwufm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_other304",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rrxhlwufm(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39442); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39443);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39444);DateTimeFormatter f = DateTimeFormat.forPattern("'Hello' ''"); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39445);assertEquals("Hello '", f.print(dt)); 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormat_fractionOfSecondLong395() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16iyi0nufq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_fractionOfSecondLong395",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39446,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16iyi0nufq(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39446); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39447);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39448);DateTimeFormatter f = DateTimeFormat.forPattern("SSSSSS").withLocale(Locale.UK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39449);assertEquals(dt.toString(), "040000", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39450);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39451);assertEquals(dt.toString(), "040000", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39452);dt = dt.withZone(TOKYO); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39453);assertEquals(dt.toString(), "040000", f.print(dt)); 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormat_hourOfHalfday408() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bz97dhufy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_hourOfHalfday408",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39454,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bz97dhufy(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39454); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39455);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39456);DateTimeFormatter f = DateTimeFormat.forPattern("K").withLocale(Locale.UK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39457);assertEquals(dt.toString(), "10", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39458);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39459);assertEquals(dt.toString(), "6", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39460);dt = dt.withZone(TOKYO); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39461);assertEquals(dt.toString(), "7", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39462);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39463);assertEquals(dt.toString(), "0", f.print(dt)); 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormat_weekyearOfEra_twoDigit436() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kq6atwug8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_weekyearOfEra_twoDigit436",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39464,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kq6atwug8(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39464); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39465);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39466);DateTimeFormatter f = DateTimeFormat.forPattern("xx").withLocale(Locale.UK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39467);assertEquals(dt.toString(), "04", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39468);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39469);assertEquals(dt.toString(), "23", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39470);f = f.withZoneUTC(); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39471);DateTime expect = null; 
     __CLR4_4_1udvudvlc8axf17.R.inc(39472);expect = new DateTime(2003, 12, 29, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39473);assertEquals(expect, f.parseDateTime("04")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39474);expect = new DateTime(1922, 1, 2, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39475);assertEquals(expect, f.parseDateTime("22")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39476);expect = new DateTime(2021, 1, 4, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39477);assertEquals(expect, f.parseDateTime("21")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39478);try { 
         __CLR4_4_1udvudvlc8axf17.R.inc(39479);f.parseDateTime("-"); 
         __CLR4_4_1udvudvlc8axf17.R.inc(39480);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1udvudvlc8axf17.R.inc(39481);try { 
         __CLR4_4_1udvudvlc8axf17.R.inc(39482);f.parseDateTime("+"); 
         __CLR4_4_1udvudvlc8axf17.R.inc(39483);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1udvudvlc8axf17.R.inc(39484);f = f.withPivotYear(new Integer(2050)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39485);expect = new DateTime(2000, 1, 3, 0, 0, 0, 0, DateTimeZone.UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39486);assertEquals(expect, f.parseDateTime("00")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39487);expect = new DateTime(2098, 12, 29, 0, 0, 0, 0, DateTimeZone.UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39488);assertEquals(expect, f.parseDateTime("99")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39489);f = new DateTimeFormatterBuilder().appendTwoDigitWeekyear(2000).toFormatter(); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39490);f = f.withZoneUTC(); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39491);try { 
         __CLR4_4_1udvudvlc8axf17.R.inc(39492);f.parseDateTime("5"); 
         __CLR4_4_1udvudvlc8axf17.R.inc(39493);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1udvudvlc8axf17.R.inc(39494);try { 
         __CLR4_4_1udvudvlc8axf17.R.inc(39495);f.parseDateTime("005"); 
         __CLR4_4_1udvudvlc8axf17.R.inc(39496);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1udvudvlc8axf17.R.inc(39497);try { 
         __CLR4_4_1udvudvlc8axf17.R.inc(39498);f.parseDateTime("+50"); 
         __CLR4_4_1udvudvlc8axf17.R.inc(39499);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1udvudvlc8axf17.R.inc(39500);try { 
         __CLR4_4_1udvudvlc8axf17.R.inc(39501);f.parseDateTime("-50"); 
         __CLR4_4_1udvudvlc8axf17.R.inc(39502);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1udvudvlc8axf17.R.inc(39503);f = DateTimeFormat.forPattern("xx").withLocale(Locale.UK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39504);f = f.withZoneUTC(); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39505);f.parseDateTime("5"); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39506);f.parseDateTime("005"); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39507);f.parseDateTime("+50"); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39508);f.parseDateTime("-50"); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39509);f = new DateTimeFormatterBuilder().appendTwoDigitWeekyear(2000, true).toFormatter(); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39510);f = f.withZoneUTC(); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39511);expect = new DateTime(2003, 12, 29, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39512);assertEquals(expect, f.parseDateTime("04")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39513);expect = new DateTime(3, 12, 29, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39514);assertEquals(expect, f.parseDateTime("+04")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39515);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39516);assertEquals(expect, f.parseDateTime("-04")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39517);expect = new DateTime(3, 12, 29, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39518);assertEquals(expect, f.parseDateTime("4")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39519);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39520);assertEquals(expect, f.parseDateTime("-4")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39521);expect = new DateTime(3, 12, 29, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39522);assertEquals(expect, f.parseDateTime("004")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39523);expect = new DateTime(3, 12, 29, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39524);assertEquals(expect, f.parseDateTime("+004")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39525);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39526);assertEquals(expect, f.parseDateTime("-004")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39527);expect = new DateTime(3004, 1, 2, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39528);assertEquals(expect, f.parseDateTime("3004")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39529);expect = new DateTime(3004, 1, 2, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39530);assertEquals(expect, f.parseDateTime("+3004")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39531);expect = new DateTime(-3004, 1, 4, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39532);assertEquals(expect, f.parseDateTime("-3004")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39533);try { 
         __CLR4_4_1udvudvlc8axf17.R.inc(39534);f.parseDateTime("-"); 
         __CLR4_4_1udvudvlc8axf17.R.inc(39535);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1udvudvlc8axf17.R.inc(39536);try { 
         __CLR4_4_1udvudvlc8axf17.R.inc(39537);f.parseDateTime("+"); 
         __CLR4_4_1udvudvlc8axf17.R.inc(39538);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormat_yearOfEra502() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1su916cuib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_yearOfEra502",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1su916cuib(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39539); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39540);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39541);DateTimeFormatter f = DateTimeFormat.forPattern("Y").withLocale(Locale.UK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39542);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39543);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39544);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39545);dt = dt.withZone(TOKYO); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39546);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39547);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39548);assertEquals(dt.toString(), "124", f.print(dt)); 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormatParse_textMonthAtEnd_France_withSpecifiedDefault528() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dl3xlwuil();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthAtEnd_France_withSpecifiedDefault528",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39549,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dl3xlwuil(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39549); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39550);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM").withLocale(Locale.FRANCE).withZoneUTC().withDefaultYear(1980); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39551);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39552);assertEquals("23 juin", str); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39553);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39554);check(date, 1980, 6, 23); 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormat_centuryOfEra672() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d1eisnuir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_centuryOfEra672",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d1eisnuir(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39555); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39556);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39557);DateTimeFormatter f = DateTimeFormat.forPattern("C").withLocale(Locale.UK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39558);assertEquals(dt.toString(), "20", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39559);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39560);assertEquals(dt.toString(), "20", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39561);dt = dt.withZone(TOKYO); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39562);assertEquals(dt.toString(), "20", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39563);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39564);assertEquals(dt.toString(), "1", f.print(dt)); 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormat_zoneAmount737() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rvt2rcuj1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_zoneAmount737",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rvt2rcuj1(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39565); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39566);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39567);DateTimeFormatter f = DateTimeFormat.forPattern("Z").withLocale(Locale.UK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39568);assertEquals(dt.toString(), "+0000", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39569);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39570);assertEquals(dt.toString(), "-0400", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39571);dt = dt.withZone(TOKYO); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39572);assertEquals(dt.toString(), "+0900", f.print(dt)); 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormatParse_textHalfdayAM_France828() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13rwan2uj9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textHalfdayAM_France828",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13rwan2uj9(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39573); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39574);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().appendLiteral('$').appendClockhourOfHalfday(2).appendLiteral('-').appendHalfdayOfDayText().appendLiteral('-').appendYear(4, 4).toFormatter().withLocale(Locale.FRANCE).withZoneUTC(); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39575);String str = new DateTime(2007, 6, 23, 18, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39576);assertEquals("$06-PM-2007", str); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39577);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39578);check(date, 2007, 1, 1); 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormat_second846() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16p5d2vujf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_second846",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39579,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16p5d2vujf(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39579); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39580);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39581);DateTimeFormatter f = DateTimeFormat.forPattern("s").withLocale(Locale.UK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39582);assertEquals(dt.toString(), "30", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39583);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39584);assertEquals(dt.toString(), "30", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39585);dt = dt.withZone(TOKYO); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39586);assertEquals(dt.toString(), "30", f.print(dt)); 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormatParse_textHalfdayAM_UK989() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cizmddujn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textHalfdayAM_UK989",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39587,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cizmddujn(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39587); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39588);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().appendLiteral('$').appendClockhourOfHalfday(2).appendLiteral('-').appendHalfdayOfDayText().appendLiteral('-').appendYear(4, 4).toFormatter().withLocale(Locale.UK).withZoneUTC(); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39589);String str = new DateTime(2007, 6, 23, 18, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39590);assertEquals("$06-PM-2007", str); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39591);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39592);check(date, 2007, 1, 1); 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormatParse_textEraAD_France1035() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ii9smlujt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textEraAD_France1035",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39593,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ii9smlujt(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39593); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39594);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().appendLiteral('$').appendEraText().appendYear(4, 4).toFormatter().withLocale(Locale.FRANCE).withZoneUTC(); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39595);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39596);assertEquals("$ap. J.-C.2007", str); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39597);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39598);check(date, 2007, 1, 1); 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormat_dayOfWeekShortText1072() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19i2d8nujz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfWeekShortText1072",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19i2d8nujz(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39599); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39600);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39601);DateTimeFormatter f = DateTimeFormat.forPattern("E").withLocale(Locale.UK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39602);assertEquals(dt.toString(), "Wed", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39603);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39604);assertEquals(dt.toString(), "Wed", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39605);dt = dt.withZone(TOKYO); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39606);assertEquals(dt.toString(), "Wed", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39607);f = f.withLocale(Locale.FRENCH); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39608);assertEquals(dt.toString(), "mer.", f.print(dt)); 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormat_dayOfWeekText1217() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_126zjzouk9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfWeekText1217",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39609,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_126zjzouk9(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39609); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39610);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39611);DateTimeFormatter f = DateTimeFormat.forPattern("EEEE").withLocale(Locale.UK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39612);assertEquals(dt.toString(), "Wednesday", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39613);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39614);assertEquals(dt.toString(), "Wednesday", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39615);dt = dt.withZone(TOKYO); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39616);assertEquals(dt.toString(), "Wednesday", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39617);f = f.withLocale(Locale.FRENCH); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39618);assertEquals(dt.toString(), "mercredi", f.print(dt)); 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormatParse_textMonthJanShort_France1271() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ib8gdjukj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthJanShort_France1271",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ib8gdjukj(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39619); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39620);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM yyyy").withLocale(Locale.FRANCE).withZoneUTC(); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39621);String str = new DateTime(2007, 1, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39622);assertEquals("23 janv. 2007", str); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39623);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39624);check(date, 2007, 1, 23); 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormat_dayOfWeek1295() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bt0sr9ukp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfWeek1295",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39625,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bt0sr9ukp(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39625); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39626);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39627);DateTimeFormatter f = DateTimeFormat.forPattern("e").withLocale(Locale.UK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39628);assertEquals(dt.toString(), "3", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39629);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39630);assertEquals(dt.toString(), "3", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39631);dt = dt.withZone(TOKYO); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39632);assertEquals(dt.toString(), "3", f.print(dt)); 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormatParse_zoneId_colon1350() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vsdke8ukx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_zoneId_colon1350",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vsdke8ukx(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39633); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39634);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("HH:mm ZZ").withZoneUTC(); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39635);String str = new DateTime(2007, 6, 23, 1, 2, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39636);assertEquals("01:02 +00:00", str); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39637);DateTime parsed = dateFormatter.parseDateTime(str); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39638);assertEquals(1, parsed.getHourOfDay()); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39639);assertEquals(2, parsed.getMinuteOfHour()); 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormat_zoneAmountID1409() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kg1vooul4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_zoneAmountID1409",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39640,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kg1vooul4(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39640); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39641);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39642);DateTimeFormatter f = DateTimeFormat.forPattern("ZZZ").withLocale(Locale.UK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39643);assertEquals(dt.toString(), "UTC", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39644);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39645);assertEquals(dt.toString(), "America/New_York", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39646);dt = dt.withZone(TOKYO); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39647);assertEquals(dt.toString(), "Asia/Tokyo", f.print(dt)); 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormatParse_textEraAD_UK1419() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pd40tuulc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textEraAD_UK1419",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39648,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pd40tuulc(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39648); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39649);DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().appendLiteral('$').appendEraText().appendYear(4, 4).toFormatter().withLocale(Locale.UK).withZoneUTC(); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39650);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39651);assertEquals("$AD2007", str); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39652);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39653);check(date, 2007, 1, 1); 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormatParse_zoneId_noColon1515() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18iqe6iuli();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_zoneId_noColon1515",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18iqe6iuli(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39654); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39655);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("HH:mm Z").withZoneUTC(); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39656);String str = new DateTime(2007, 6, 23, 1, 2, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39657);assertEquals("01:02 +0000", str); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39658);DateTime parsed = dateFormatter.parseDateTime(str); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39659);assertEquals(1, parsed.getHourOfDay()); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39660);assertEquals(2, parsed.getMinuteOfHour()); 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormat_year_twoDigit1517() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ms76qulp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_year_twoDigit1517",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39661,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ms76qulp(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39661); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39662);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39663);DateTimeFormatter f = DateTimeFormat.forPattern("yy").withLocale(Locale.UK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39664);assertEquals(dt.toString(), "04", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39665);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39666);assertEquals(dt.toString(), "23", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39667);f = f.withZoneUTC(); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39668);DateTime expect = null; 
     __CLR4_4_1udvudvlc8axf17.R.inc(39669);expect = new DateTime(2004, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39670);assertEquals(expect, f.parseDateTime("04")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39671);expect = new DateTime(1922, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39672);assertEquals(expect, f.parseDateTime("22")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39673);expect = new DateTime(2021, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39674);assertEquals(expect, f.parseDateTime("21")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39675);try { 
         __CLR4_4_1udvudvlc8axf17.R.inc(39676);f.parseDateTime("-"); 
         __CLR4_4_1udvudvlc8axf17.R.inc(39677);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1udvudvlc8axf17.R.inc(39678);try { 
         __CLR4_4_1udvudvlc8axf17.R.inc(39679);f.parseDateTime("+"); 
         __CLR4_4_1udvudvlc8axf17.R.inc(39680);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1udvudvlc8axf17.R.inc(39681);f = f.withPivotYear(new Integer(2050)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39682);expect = new DateTime(2000, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39683);assertEquals(expect, f.parseDateTime("00")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39684);expect = new DateTime(2099, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39685);assertEquals(expect, f.parseDateTime("99")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39686);f = new DateTimeFormatterBuilder().appendTwoDigitYear(2000).toFormatter(); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39687);f = f.withZoneUTC(); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39688);try { 
         __CLR4_4_1udvudvlc8axf17.R.inc(39689);f.parseDateTime("5"); 
         __CLR4_4_1udvudvlc8axf17.R.inc(39690);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1udvudvlc8axf17.R.inc(39691);try { 
         __CLR4_4_1udvudvlc8axf17.R.inc(39692);f.parseDateTime("005"); 
         __CLR4_4_1udvudvlc8axf17.R.inc(39693);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1udvudvlc8axf17.R.inc(39694);try { 
         __CLR4_4_1udvudvlc8axf17.R.inc(39695);f.parseDateTime("+50"); 
         __CLR4_4_1udvudvlc8axf17.R.inc(39696);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1udvudvlc8axf17.R.inc(39697);try { 
         __CLR4_4_1udvudvlc8axf17.R.inc(39698);f.parseDateTime("-50"); 
         __CLR4_4_1udvudvlc8axf17.R.inc(39699);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1udvudvlc8axf17.R.inc(39700);f = DateTimeFormat.forPattern("yy").withLocale(Locale.UK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39701);f = f.withZoneUTC(); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39702);f.parseDateTime("5"); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39703);f.parseDateTime("005"); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39704);f.parseDateTime("+50"); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39705);f.parseDateTime("-50"); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39706);f = new DateTimeFormatterBuilder().appendTwoDigitYear(2000, true).toFormatter(); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39707);f = f.withZoneUTC(); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39708);expect = new DateTime(2004, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39709);assertEquals(expect, f.parseDateTime("04")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39710);expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39711);assertEquals(expect, f.parseDateTime("+04")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39712);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39713);assertEquals(expect, f.parseDateTime("-04")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39714);expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39715);assertEquals(expect, f.parseDateTime("4")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39716);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39717);assertEquals(expect, f.parseDateTime("-4")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39718);expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39719);assertEquals(expect, f.parseDateTime("004")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39720);expect = new DateTime(4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39721);assertEquals(expect, f.parseDateTime("+004")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39722);expect = new DateTime(-4, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39723);assertEquals(expect, f.parseDateTime("-004")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39724);expect = new DateTime(3004, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39725);assertEquals(expect, f.parseDateTime("3004")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39726);expect = new DateTime(3004, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39727);assertEquals(expect, f.parseDateTime("+3004")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39728);expect = new DateTime(-3004, 1, 1, 0, 0, 0, 0, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39729);assertEquals(expect, f.parseDateTime("-3004")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39730);try { 
         __CLR4_4_1udvudvlc8axf17.R.inc(39731);f.parseDateTime("-"); 
         __CLR4_4_1udvudvlc8axf17.R.inc(39732);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1udvudvlc8axf17.R.inc(39733);try { 
         __CLR4_4_1udvudvlc8axf17.R.inc(39734);f.parseDateTime("+"); 
         __CLR4_4_1udvudvlc8axf17.R.inc(39735);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormat_shortBasicParse1581() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1810cj5uns();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_shortBasicParse1581",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39736,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1810cj5uns(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39736); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39737);DateTime dt = new DateTime(2004, 3, 9, 0, 0, 0, 0); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39738);DateTimeFormatter f = DateTimeFormat.forPattern("yyMMdd"); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39739);assertEquals(dt, f.parseDateTime("040309")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39740);try { 
         __CLR4_4_1udvudvlc8axf17.R.inc(39741);assertEquals(dt, f.parseDateTime("20040309")); 
         __CLR4_4_1udvudvlc8axf17.R.inc(39742);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1udvudvlc8axf17.R.inc(39743);f = DateTimeFormat.forPattern("yy/MM/dd"); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39744);assertEquals(dt, f.parseDateTime("04/03/09")); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39745);assertEquals(dt, f.parseDateTime("2004/03/09")); 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormat_dayOfYearText1642() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rbebjjuo2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfYearText1642",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39746,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rbebjjuo2(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39746); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39747);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39748);DateTimeFormatter f = DateTimeFormat.forPattern("D").withLocale(Locale.UK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39749);assertEquals(dt.toString(), "161", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39750);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39751);assertEquals(dt.toString(), "161", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39752);dt = dt.withZone(TOKYO); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39753);assertEquals(dt.toString(), "161", f.print(dt)); 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormat_year_long1669() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ofoa5luoa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_year_long1669",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39754,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ofoa5luoa(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39754); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39755);DateTime dt = new DateTime(278004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39756);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy"); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39757);assertEquals(dt.toString(), "278004", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39758);f = DateTimeFormat.forPattern("yyyyMMdd"); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39759);assertEquals(dt.toString(), "2780040609", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39760);f = DateTimeFormat.forPattern("yyyyddMM"); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39761);assertEquals(dt.toString(), "2780040906", f.print(dt)); 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 


public void testFormat_monthOfYearShortText1709() {__CLR4_4_1udvudvlc8axf17.R.globalSliceStart(getClass().getName(),39762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d7ohi7uoi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udvudvlc8axf17.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udvudvlc8axf17.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_monthOfYearShortText1709",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39762,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d7ohi7uoi(){try{__CLR4_4_1udvudvlc8axf17.R.inc(39762); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39763);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39764);DateTimeFormatter f = DateTimeFormat.forPattern("MMM").withLocale(Locale.UK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39765);assertEquals(dt.toString(), "Jun", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39766);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39767);assertEquals(dt.toString(), "Jun", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39768);dt = dt.withZone(TOKYO); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39769);assertEquals(dt.toString(), "Jun", f.print(dt)); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39770);f = f.withLocale(Locale.FRENCH); 
     __CLR4_4_1udvudvlc8axf17.R.inc(39771);assertEquals(dt.toString(), "juin", f.print(dt)); 
 }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}} 

    

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
    private void check(DateTime test, int hour, int min, int sec) {try{__CLR4_4_1udvudvlc8axf17.R.inc(39772);
        __CLR4_4_1udvudvlc8axf17.R.inc(39773);assertEquals(hour, test.getYear());
        __CLR4_4_1udvudvlc8axf17.R.inc(39774);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1udvudvlc8axf17.R.inc(39775);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1udvudvlc8axf17.R.flushNeeded();}}

}
