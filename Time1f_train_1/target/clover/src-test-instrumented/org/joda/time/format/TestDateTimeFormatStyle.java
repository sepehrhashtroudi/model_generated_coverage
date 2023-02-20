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
public class TestDateTimeFormatStyle extends TestCase {static class __CLR4_4_1t38t38le6qeapi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,37822,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1t38t38le6qeapi.R.inc(37700);
        __CLR4_4_1t38t38le6qeapi.R.inc(37701);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1t38t38le6qeapi.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1t38t38le6qeapi.R.inc(37702);
        __CLR4_4_1t38t38le6qeapi.R.inc(37703);return new TestSuite(TestDateTimeFormatStyle.class);
    }finally{__CLR4_4_1t38t38le6qeapi.R.flushNeeded();}}

    public TestDateTimeFormatStyle(String name) {
        super(name);__CLR4_4_1t38t38le6qeapi.R.inc(37705);try{__CLR4_4_1t38t38le6qeapi.R.inc(37704);
    }finally{__CLR4_4_1t38t38le6qeapi.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1t38t38le6qeapi.R.inc(37706);
        __CLR4_4_1t38t38le6qeapi.R.inc(37707);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1t38t38le6qeapi.R.inc(37708);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1t38t38le6qeapi.R.inc(37709);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1t38t38le6qeapi.R.inc(37710);originalLocale = Locale.getDefault();
        __CLR4_4_1t38t38le6qeapi.R.inc(37711);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1t38t38le6qeapi.R.inc(37712);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1t38t38le6qeapi.R.inc(37713);Locale.setDefault(UK);
    }finally{__CLR4_4_1t38t38le6qeapi.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1t38t38le6qeapi.R.inc(37714);
        __CLR4_4_1t38t38le6qeapi.R.inc(37715);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1t38t38le6qeapi.R.inc(37716);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1t38t38le6qeapi.R.inc(37717);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1t38t38le6qeapi.R.inc(37718);Locale.setDefault(originalLocale);
        __CLR4_4_1t38t38le6qeapi.R.inc(37719);originalDateTimeZone = null;
        __CLR4_4_1t38t38le6qeapi.R.inc(37720);originalTimeZone = null;
        __CLR4_4_1t38t38le6qeapi.R.inc(37721);originalLocale = null;
    }finally{__CLR4_4_1t38t38le6qeapi.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testForStyle_shortDateTime198() throws Exception {__CLR4_4_1t38t38le6qeapi.R.globalSliceStart(getClass().getName(),37722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1utyt7t3u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t38t38le6qeapi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t38t38le6qeapi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortDateTime198",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37722,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1utyt7t3u() throws Exception{try{__CLR4_4_1t38t38le6qeapi.R.inc(37722); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37723);DateTimeFormatter f = DateTimeFormat.shortDateTime(); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37724);DateTimeFormatter g = DateTimeFormat.forStyle("SS"); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37725);assertSame(g, f); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37726);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37727);String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, UK).format(dt.toDate()); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37728);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37729);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, US).format(dt.toDate()); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37730);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37731);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, FRANCE).format(dt.toDate()); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37732);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37733);DateTime date = new DateTime(DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, FRANCE).parse(expect)); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37734);assertEquals(date, f.withLocale(FRANCE).parseDateTime(expect)); 
 }finally{__CLR4_4_1t38t38le6qeapi.R.flushNeeded();}} 


public void testForStyle_shortDate199() throws Exception {__CLR4_4_1t38t38le6qeapi.R.globalSliceStart(getClass().getName(),37735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11gfjht47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t38t38le6qeapi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t38t38le6qeapi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortDate199",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11gfjht47() throws Exception{try{__CLR4_4_1t38t38le6qeapi.R.inc(37735); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37736);DateTimeFormatter f = DateTimeFormat.shortDate(); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37737);DateTimeFormatter g = DateTimeFormat.forStyle("S-"); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37738);assertSame(g, f); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37739);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37740);String expect = DateFormat.getDateInstance(DateFormat.SHORT, UK).format(dt.toDate()); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37741);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37742);expect = DateFormat.getDateInstance(DateFormat.SHORT, US).format(dt.toDate()); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37743);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37744);expect = DateFormat.getDateInstance(DateFormat.SHORT, FRANCE).format(dt.toDate()); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37745);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37746);DateTime date = new DateTime(DateFormat.getDateInstance(DateFormat.SHORT, FRANCE).parse(expect)); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37747);assertEquals(date, f.withLocale(FRANCE).parseDateTime(expect)); 
 }finally{__CLR4_4_1t38t38le6qeapi.R.flushNeeded();}} 


public void testForStyle_mediumDate200() throws Exception {__CLR4_4_1t38t38le6qeapi.R.globalSliceStart(getClass().getName(),37748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jjupblt4k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t38t38le6qeapi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t38t38le6qeapi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumDate200",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37748,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jjupblt4k() throws Exception{try{__CLR4_4_1t38t38le6qeapi.R.inc(37748); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37749);DateTimeFormatter f = DateTimeFormat.mediumDate(); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37750);DateTimeFormatter g = DateTimeFormat.forStyle("M-"); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37751);assertSame(g, f); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37752);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37753);String expect = DateFormat.getDateInstance(DateFormat.MEDIUM, UK).format(dt.toDate()); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37754);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37755);expect = DateFormat.getDateInstance(DateFormat.MEDIUM, US).format(dt.toDate()); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37756);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37757);expect = DateFormat.getDateInstance(DateFormat.MEDIUM, FRANCE).format(dt.toDate()); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37758);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1t38t38le6qeapi.R.flushNeeded();}} 


public void testForStyle_mediumTime201() throws Exception {__CLR4_4_1t38t38le6qeapi.R.globalSliceStart(getClass().getName(),37759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t24mx9t4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t38t38le6qeapi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t38t38le6qeapi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumTime201",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t24mx9t4v() throws Exception{try{__CLR4_4_1t38t38le6qeapi.R.inc(37759); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37760);DateTimeFormatter f = DateTimeFormat.mediumTime(); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37761);DateTimeFormatter g = DateTimeFormat.forStyle("-M"); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37762);assertSame(g, f); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37763);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37764);String expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, UK).format(dt.toDate()); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37765);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37766);expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, US).format(dt.toDate()); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37767);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37768);expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, FRANCE).format(dt.toDate()); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37769);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1t38t38le6qeapi.R.flushNeeded();}} 


public void testForStyle_mediumDateTime202() throws Exception {__CLR4_4_1t38t38le6qeapi.R.globalSliceStart(getClass().getName(),37770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rr0x6it56();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t38t38le6qeapi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t38t38le6qeapi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumDateTime202",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rr0x6it56() throws Exception{try{__CLR4_4_1t38t38le6qeapi.R.inc(37770); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37771);DateTimeFormatter f = DateTimeFormat.mediumDateTime(); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37772);DateTimeFormatter g = DateTimeFormat.forStyle("MM"); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37773);assertSame(g, f); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37774);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37775);String expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, UK).format(dt.toDate()); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37776);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37777);expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, US).format(dt.toDate()); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37778);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37779);expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, FRANCE).format(dt.toDate()); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37780);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1t38t38le6qeapi.R.flushNeeded();}} 


public void testForStyle_longDate203() throws Exception {__CLR4_4_1t38t38le6qeapi.R.globalSliceStart(getClass().getName(),37781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x795gzt5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t38t38le6qeapi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t38t38le6qeapi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_longDate203",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37781,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x795gzt5h() throws Exception{try{__CLR4_4_1t38t38le6qeapi.R.inc(37781); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37782);DateTimeFormatter f = DateTimeFormat.longDate(); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37783);DateTimeFormatter g = DateTimeFormat.forStyle("L-"); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37784);assertSame(g, f); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37785);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37786);String expect = DateFormat.getDateInstance(DateFormat.LONG, UK).format(dt.toDate()); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37787);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37788);expect = DateFormat.getDateInstance(DateFormat.LONG, US).format(dt.toDate()); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37789);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37790);expect = DateFormat.getDateInstance(DateFormat.LONG, FRANCE).format(dt.toDate()); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37791);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1t38t38le6qeapi.R.flushNeeded();}} 


public void testForStyle_fullDate204() throws Exception {__CLR4_4_1t38t38le6qeapi.R.globalSliceStart(getClass().getName(),37792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1agbie3t5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t38t38le6qeapi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t38t38le6qeapi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_fullDate204",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37792,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1agbie3t5s() throws Exception{try{__CLR4_4_1t38t38le6qeapi.R.inc(37792); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37793);DateTimeFormatter f = DateTimeFormat.fullDate(); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37794);DateTimeFormatter g = DateTimeFormat.forStyle("F-"); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37795);assertSame(g, f); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37796);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37797);String expect = DateFormat.getDateInstance(DateFormat.FULL, UK).format(dt.toDate()); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37798);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37799);expect = DateFormat.getDateInstance(DateFormat.FULL, US).format(dt.toDate()); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37800);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37801);expect = DateFormat.getDateInstance(DateFormat.FULL, FRANCE).format(dt.toDate()); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37802);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1t38t38le6qeapi.R.flushNeeded();}} 


public void testForStyle_invalidStrings227() {__CLR4_4_1t38t38le6qeapi.R.globalSliceStart(getClass().getName(),37803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gayz1ut63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t38t38le6qeapi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t38t38le6qeapi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_invalidStrings227",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gayz1ut63(){try{__CLR4_4_1t38t38le6qeapi.R.inc(37803); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37804);try { 
         __CLR4_4_1t38t38le6qeapi.R.inc(37805);DateTimeFormat.forStyle("AA"); 
         __CLR4_4_1t38t38le6qeapi.R.inc(37806);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1t38t38le6qeapi.R.inc(37807);try { 
         __CLR4_4_1t38t38le6qeapi.R.inc(37808);DateTimeFormat.forStyle("--"); 
         __CLR4_4_1t38t38le6qeapi.R.inc(37809);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1t38t38le6qeapi.R.inc(37810);try { 
         __CLR4_4_1t38t38le6qeapi.R.inc(37811);DateTimeFormat.forStyle("ss"); 
         __CLR4_4_1t38t38le6qeapi.R.inc(37812);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1t38t38le6qeapi.R.flushNeeded();}} 


public void testForStyle_shortMediumDateTime1123() throws Exception {__CLR4_4_1t38t38le6qeapi.R.globalSliceStart(getClass().getName(),37813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d1s0j5t6d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t38t38le6qeapi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t38t38le6qeapi.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortMediumDateTime1123",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37813,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d1s0j5t6d() throws Exception{try{__CLR4_4_1t38t38le6qeapi.R.inc(37813); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37814);DateTimeFormatter f = DateTimeFormat.forStyle("SM"); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37815);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37816);String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM, UK).format(dt.toDate()); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37817);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37818);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM, US).format(dt.toDate()); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37819);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37820);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM, FRANCE).format(dt.toDate()); 
     __CLR4_4_1t38t38le6qeapi.R.inc(37821);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1t38t38le6qeapi.R.flushNeeded();}} 

    

    

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
