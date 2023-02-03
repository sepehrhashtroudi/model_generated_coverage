/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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

import java.text.DateFormat;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;

/**
 * This class is a Junit unit test for DateTimeFormat styles.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeFormatStyle extends TestCase {static class __CLR4_4_1uowuowlc8axf1o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,39914,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Locale UK = Locale.UK;
    private static final Locale US = Locale.US;
    private static final Locale FRANCE = Locale.FRANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1uowuowlc8axf1o.R.inc(39776);
        __CLR4_4_1uowuowlc8axf1o.R.inc(39777);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1uowuowlc8axf1o.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1uowuowlc8axf1o.R.inc(39778);
        __CLR4_4_1uowuowlc8axf1o.R.inc(39779);return new TestSuite(TestDateTimeFormatStyle.class);
    }finally{__CLR4_4_1uowuowlc8axf1o.R.flushNeeded();}}

    public TestDateTimeFormatStyle(String name) {
        super(name);__CLR4_4_1uowuowlc8axf1o.R.inc(39781);try{__CLR4_4_1uowuowlc8axf1o.R.inc(39780);
    }finally{__CLR4_4_1uowuowlc8axf1o.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1uowuowlc8axf1o.R.inc(39782);
        __CLR4_4_1uowuowlc8axf1o.R.inc(39783);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1uowuowlc8axf1o.R.inc(39784);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1uowuowlc8axf1o.R.inc(39785);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1uowuowlc8axf1o.R.inc(39786);originalLocale = Locale.getDefault();
        __CLR4_4_1uowuowlc8axf1o.R.inc(39787);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1uowuowlc8axf1o.R.inc(39788);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1uowuowlc8axf1o.R.inc(39789);Locale.setDefault(UK);
    }finally{__CLR4_4_1uowuowlc8axf1o.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1uowuowlc8axf1o.R.inc(39790);
        __CLR4_4_1uowuowlc8axf1o.R.inc(39791);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1uowuowlc8axf1o.R.inc(39792);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1uowuowlc8axf1o.R.inc(39793);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1uowuowlc8axf1o.R.inc(39794);Locale.setDefault(originalLocale);
        __CLR4_4_1uowuowlc8axf1o.R.inc(39795);originalDateTimeZone = null;
        __CLR4_4_1uowuowlc8axf1o.R.inc(39796);originalTimeZone = null;
        __CLR4_4_1uowuowlc8axf1o.R.inc(39797);originalLocale = null;
    }finally{__CLR4_4_1uowuowlc8axf1o.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testForStyle_longDate110() throws Exception {__CLR4_4_1uowuowlc8axf1o.R.globalSliceStart(getClass().getName(),39798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b3jgfsupi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uowuowlc8axf1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uowuowlc8axf1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_longDate110",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39798,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b3jgfsupi() throws Exception{try{__CLR4_4_1uowuowlc8axf1o.R.inc(39798); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39799);DateTimeFormatter f = DateTimeFormat.longDate(); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39800);DateTimeFormatter g = DateTimeFormat.forStyle("L-"); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39801);assertSame(g, f); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39802);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39803);String expect = DateFormat.getDateInstance(DateFormat.LONG, UK).format(dt.toDate()); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39804);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39805);expect = DateFormat.getDateInstance(DateFormat.LONG, US).format(dt.toDate()); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39806);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39807);expect = DateFormat.getDateInstance(DateFormat.LONG, FRANCE).format(dt.toDate()); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39808);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1uowuowlc8axf1o.R.flushNeeded();}} 


public void testForStyle_invalidStrings283() {__CLR4_4_1uowuowlc8axf1o.R.globalSliceStart(getClass().getName(),39809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16xyh38upt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uowuowlc8axf1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uowuowlc8axf1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_invalidStrings283",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39809,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16xyh38upt(){try{__CLR4_4_1uowuowlc8axf1o.R.inc(39809); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39810);try { 
         __CLR4_4_1uowuowlc8axf1o.R.inc(39811);DateTimeFormat.forStyle("AA"); 
         __CLR4_4_1uowuowlc8axf1o.R.inc(39812);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39813);try { 
         __CLR4_4_1uowuowlc8axf1o.R.inc(39814);DateTimeFormat.forStyle("--"); 
         __CLR4_4_1uowuowlc8axf1o.R.inc(39815);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39816);try { 
         __CLR4_4_1uowuowlc8axf1o.R.inc(39817);DateTimeFormat.forStyle("ss"); 
         __CLR4_4_1uowuowlc8axf1o.R.inc(39818);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1uowuowlc8axf1o.R.flushNeeded();}} 


public void testForStyle_mediumDateTime316() throws Exception {__CLR4_4_1uowuowlc8axf1o.R.globalSliceStart(getClass().getName(),39819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ctz5nuuq3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uowuowlc8axf1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uowuowlc8axf1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumDateTime316",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ctz5nuuq3() throws Exception{try{__CLR4_4_1uowuowlc8axf1o.R.inc(39819); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39820);DateTimeFormatter f = DateTimeFormat.mediumDateTime(); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39821);DateTimeFormatter g = DateTimeFormat.forStyle("MM"); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39822);assertSame(g, f); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39823);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39824);String expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, UK).format(dt.toDate()); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39825);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39826);expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, US).format(dt.toDate()); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39827);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39828);expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, FRANCE).format(dt.toDate()); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39829);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1uowuowlc8axf1o.R.flushNeeded();}} 


public void testForStyle_mediumTime972() throws Exception {__CLR4_4_1uowuowlc8axf1o.R.globalSliceStart(getClass().getName(),39830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p7opo4uqe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uowuowlc8axf1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uowuowlc8axf1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumTime972",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p7opo4uqe() throws Exception{try{__CLR4_4_1uowuowlc8axf1o.R.inc(39830); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39831);DateTimeFormatter f = DateTimeFormat.mediumTime(); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39832);DateTimeFormatter g = DateTimeFormat.forStyle("-M"); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39833);assertSame(g, f); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39834);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39835);String expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, UK).format(dt.toDate()); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39836);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39837);expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, US).format(dt.toDate()); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39838);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39839);expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, FRANCE).format(dt.toDate()); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39840);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1uowuowlc8axf1o.R.flushNeeded();}} 


public void testForStyle_fullDate1130() throws Exception {__CLR4_4_1uowuowlc8axf1o.R.globalSliceStart(getClass().getName(),39841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vildbuuqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uowuowlc8axf1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uowuowlc8axf1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_fullDate1130",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39841,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vildbuuqp() throws Exception{try{__CLR4_4_1uowuowlc8axf1o.R.inc(39841); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39842);DateTimeFormatter f = DateTimeFormat.fullDate(); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39843);DateTimeFormatter g = DateTimeFormat.forStyle("F-"); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39844);assertSame(g, f); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39845);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39846);String expect = DateFormat.getDateInstance(DateFormat.FULL, UK).format(dt.toDate()); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39847);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39848);expect = DateFormat.getDateInstance(DateFormat.FULL, US).format(dt.toDate()); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39849);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39850);expect = DateFormat.getDateInstance(DateFormat.FULL, FRANCE).format(dt.toDate()); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39851);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1uowuowlc8axf1o.R.flushNeeded();}} 


public void testForStyle_shortMediumDateTime1206() throws Exception {__CLR4_4_1uowuowlc8axf1o.R.globalSliceStart(getClass().getName(),39852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_165rfv9ur0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uowuowlc8axf1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uowuowlc8axf1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortMediumDateTime1206",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_165rfv9ur0() throws Exception{try{__CLR4_4_1uowuowlc8axf1o.R.inc(39852); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39853);DateTimeFormatter f = DateTimeFormat.forStyle("SM"); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39854);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39855);String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM, UK).format(dt.toDate()); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39856);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39857);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM, US).format(dt.toDate()); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39858);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39859);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM, FRANCE).format(dt.toDate()); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39860);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1uowuowlc8axf1o.R.flushNeeded();}} 


public void testForStyle_stringLengths1387() {__CLR4_4_1uowuowlc8axf1o.R.globalSliceStart(getClass().getName(),39861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ruez27ur9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uowuowlc8axf1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uowuowlc8axf1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_stringLengths1387",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ruez27ur9(){try{__CLR4_4_1uowuowlc8axf1o.R.inc(39861); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39862);try { 
         __CLR4_4_1uowuowlc8axf1o.R.inc(39863);DateTimeFormat.forStyle(null); 
         __CLR4_4_1uowuowlc8axf1o.R.inc(39864);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39865);try { 
         __CLR4_4_1uowuowlc8axf1o.R.inc(39866);DateTimeFormat.forStyle(""); 
         __CLR4_4_1uowuowlc8axf1o.R.inc(39867);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39868);try { 
         __CLR4_4_1uowuowlc8axf1o.R.inc(39869);DateTimeFormat.forStyle("S"); 
         __CLR4_4_1uowuowlc8axf1o.R.inc(39870);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39871);try { 
         __CLR4_4_1uowuowlc8axf1o.R.inc(39872);DateTimeFormat.forStyle("SSS"); 
         __CLR4_4_1uowuowlc8axf1o.R.inc(39873);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1uowuowlc8axf1o.R.flushNeeded();}} 


public void testForStyle_shortTime1469() throws Exception {__CLR4_4_1uowuowlc8axf1o.R.globalSliceStart(getClass().getName(),39874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bu64dturm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uowuowlc8axf1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uowuowlc8axf1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortTime1469",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bu64dturm() throws Exception{try{__CLR4_4_1uowuowlc8axf1o.R.inc(39874); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39875);DateTimeFormatter f = DateTimeFormat.shortTime(); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39876);DateTimeFormatter g = DateTimeFormat.forStyle("-S"); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39877);assertSame(g, f); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39878);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39879);String expect = DateFormat.getTimeInstance(DateFormat.SHORT, UK).format(dt.toDate()); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39880);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39881);expect = DateFormat.getTimeInstance(DateFormat.SHORT, US).format(dt.toDate()); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39882);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39883);expect = DateFormat.getTimeInstance(DateFormat.SHORT, FRANCE).format(dt.toDate()); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39884);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39885);if ((((TimeZone.getDefault() instanceof SimpleTimeZone)&&(__CLR4_4_1uowuowlc8axf1o.R.iget(39886)!=0|true))||(__CLR4_4_1uowuowlc8axf1o.R.iget(39887)==0&false))) {{ 
     } }else {{ 
         __CLR4_4_1uowuowlc8axf1o.R.inc(39888);DateTime date = new DateTime(DateFormat.getTimeInstance(DateFormat.SHORT, FRANCE).parse(expect)); 
         __CLR4_4_1uowuowlc8axf1o.R.inc(39889);assertEquals(date, f.withLocale(FRANCE).parseDateTime(expect)); 
     } 
 }}finally{__CLR4_4_1uowuowlc8axf1o.R.flushNeeded();}} 


public void testForStyle_mediumDate1611() throws Exception {__CLR4_4_1uowuowlc8axf1o.R.globalSliceStart(getClass().getName(),39890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iexp6cus2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uowuowlc8axf1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uowuowlc8axf1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumDate1611",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39890,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iexp6cus2() throws Exception{try{__CLR4_4_1uowuowlc8axf1o.R.inc(39890); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39891);DateTimeFormatter f = DateTimeFormat.mediumDate(); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39892);DateTimeFormatter g = DateTimeFormat.forStyle("M-"); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39893);assertSame(g, f); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39894);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39895);String expect = DateFormat.getDateInstance(DateFormat.MEDIUM, UK).format(dt.toDate()); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39896);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39897);expect = DateFormat.getDateInstance(DateFormat.MEDIUM, US).format(dt.toDate()); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39898);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39899);expect = DateFormat.getDateInstance(DateFormat.MEDIUM, FRANCE).format(dt.toDate()); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39900);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1uowuowlc8axf1o.R.flushNeeded();}} 


public void testForStyle_shortDate1664() throws Exception {__CLR4_4_1uowuowlc8axf1o.R.globalSliceStart(getClass().getName(),39901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yppultusd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uowuowlc8axf1o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uowuowlc8axf1o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortDate1664",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39901,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yppultusd() throws Exception{try{__CLR4_4_1uowuowlc8axf1o.R.inc(39901); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39902);DateTimeFormatter f = DateTimeFormat.shortDate(); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39903);DateTimeFormatter g = DateTimeFormat.forStyle("S-"); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39904);assertSame(g, f); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39905);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39906);String expect = DateFormat.getDateInstance(DateFormat.SHORT, UK).format(dt.toDate()); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39907);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39908);expect = DateFormat.getDateInstance(DateFormat.SHORT, US).format(dt.toDate()); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39909);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39910);expect = DateFormat.getDateInstance(DateFormat.SHORT, FRANCE).format(dt.toDate()); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39911);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39912);DateTime date = new DateTime(DateFormat.getDateInstance(DateFormat.SHORT, FRANCE).parse(expect)); 
     __CLR4_4_1uowuowlc8axf1o.R.inc(39913);assertEquals(date, f.withLocale(FRANCE).parseDateTime(expect)); 
 }finally{__CLR4_4_1uowuowlc8axf1o.R.flushNeeded();}} 

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    
// Defects4J: flaky method
//     public void testForStyle_longTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.longTime();
//         DateTimeFormatter g = DateTimeFormat.forStyle("-L");
//         assertSame(g, f);
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getTimeInstance(DateFormat.LONG, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getTimeInstance(DateFormat.LONG, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getTimeInstance(DateFormat.LONG, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    
// Defects4J: flaky method
//     public void testForStyle_longDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.longDateTime();
//         DateTimeFormatter g = DateTimeFormat.forStyle("LL");
//         assertSame(g, f);
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    //-----------------------------------------------------------------------
    

    
// Defects4J: flaky method
//     public void testForStyle_fullTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.fullTime();
//         DateTimeFormatter g = DateTimeFormat.forStyle("-F");
//         assertSame(g, f);
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getTimeInstance(DateFormat.FULL, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getTimeInstance(DateFormat.FULL, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getTimeInstance(DateFormat.FULL, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    
// Defects4J: flaky method
//     public void testForStyle_fullDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.fullDateTime();
//         DateTimeFormatter g = DateTimeFormat.forStyle("FF");
//         assertSame(g, f);
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    //-----------------------------------------------------------------------
    

    
// Defects4J: flaky method
//     public void testForStyle_shortLongDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.forStyle("SL");
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    
// Defects4J: flaky method
//     public void testForStyle_shortFullDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.forStyle("SF");
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    //-----------------------------------------------------------------------
    

    
// Defects4J: flaky method
//     public void testForStyle_mediumLongDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.forStyle("ML");
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    
// Defects4J: flaky method
//     public void testForStyle_mediumFullDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.forStyle("MF");
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

}
