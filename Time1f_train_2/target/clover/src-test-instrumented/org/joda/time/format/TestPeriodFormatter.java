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

import java.io.CharArrayWriter;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Period Formating.
 *
 * @author Stephen Colebourne
 */
public class TestPeriodFormatter extends TestCase {static class __CLR4_4_1u47u47le6qsfq8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,39114,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEWYORK = DateTimeZone.forID("America/New_York");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);

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
    private PeriodFormatter f = null;

    public static void main(String[] args) {try{__CLR4_4_1u47u47le6qsfq8.R.inc(39031);
        __CLR4_4_1u47u47le6qsfq8.R.inc(39032);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1u47u47le6qsfq8.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1u47u47le6qsfq8.R.inc(39033);
        __CLR4_4_1u47u47le6qsfq8.R.inc(39034);return new TestSuite(TestPeriodFormatter.class);
    }finally{__CLR4_4_1u47u47le6qsfq8.R.flushNeeded();}}

    public TestPeriodFormatter(String name) {
        super(name);__CLR4_4_1u47u47le6qsfq8.R.inc(39036);try{__CLR4_4_1u47u47le6qsfq8.R.inc(39035);
    }finally{__CLR4_4_1u47u47le6qsfq8.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1u47u47le6qsfq8.R.inc(39037);
        __CLR4_4_1u47u47le6qsfq8.R.inc(39038);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1u47u47le6qsfq8.R.inc(39039);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1u47u47le6qsfq8.R.inc(39040);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1u47u47le6qsfq8.R.inc(39041);originalLocale = Locale.getDefault();
        __CLR4_4_1u47u47le6qsfq8.R.inc(39042);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1u47u47le6qsfq8.R.inc(39043);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1u47u47le6qsfq8.R.inc(39044);Locale.setDefault(Locale.UK);
        __CLR4_4_1u47u47le6qsfq8.R.inc(39045);f = ISOPeriodFormat.standard();
    }finally{__CLR4_4_1u47u47le6qsfq8.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1u47u47le6qsfq8.R.inc(39046);
        __CLR4_4_1u47u47le6qsfq8.R.inc(39047);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1u47u47le6qsfq8.R.inc(39048);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1u47u47le6qsfq8.R.inc(39049);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1u47u47le6qsfq8.R.inc(39050);Locale.setDefault(originalLocale);
        __CLR4_4_1u47u47le6qsfq8.R.inc(39051);originalDateTimeZone = null;
        __CLR4_4_1u47u47le6qsfq8.R.inc(39052);originalTimeZone = null;
        __CLR4_4_1u47u47le6qsfq8.R.inc(39053);originalLocale = null;
        __CLR4_4_1u47u47le6qsfq8.R.inc(39054);f = null;
    }finally{__CLR4_4_1u47u47le6qsfq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPrint_writerMethods161() throws Exception {__CLR4_4_1u47u47le6qsfq8.R.globalSliceStart(getClass().getName(),39055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ujirpku4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u47u47le6qsfq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u47u47le6qsfq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testPrint_writerMethods161",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39055,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ujirpku4v() throws Exception{try{__CLR4_4_1u47u47le6qsfq8.R.inc(39055); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39056);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39057);CharArrayWriter out = new CharArrayWriter(); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39058);f.printTo(out, p); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39059);assertEquals("P1Y2M3W4DT5H6M7.008S", out.toString()); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39060);out = new CharArrayWriter(); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39061);try { 
         __CLR4_4_1u47u47le6qsfq8.R.inc(39062);f.printTo(out, null); 
         __CLR4_4_1u47u47le6qsfq8.R.inc(39063);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1u47u47le6qsfq8.R.flushNeeded();}} 


public void testParsePeriod_simple168() {__CLR4_4_1u47u47le6qsfq8.R.globalSliceStart(getClass().getName(),39064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13kxst1u54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u47u47le6qsfq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u47u47le6qsfq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testParsePeriod_simple168",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39064,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13kxst1u54(){try{__CLR4_4_1u47u47le6qsfq8.R.inc(39064); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39065);Period expect = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39066);assertEquals(expect, f.parsePeriod("P1Y2M3W4DT5H6M7.008S")); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39067);try { 
         __CLR4_4_1u47u47le6qsfq8.R.inc(39068);f.parsePeriod("ABC"); 
         __CLR4_4_1u47u47le6qsfq8.R.inc(39069);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1u47u47le6qsfq8.R.flushNeeded();}} 


public void testWithGetLocaleMethods616() {__CLR4_4_1u47u47le6qsfq8.R.globalSliceStart(getClass().getName(),39070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1donztku5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u47u47le6qsfq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u47u47le6qsfq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testWithGetLocaleMethods616",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39070,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1donztku5a(){try{__CLR4_4_1u47u47le6qsfq8.R.inc(39070); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39071);PeriodFormatter f2 = f.withLocale(Locale.FRENCH); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39072);assertEquals(Locale.FRENCH, f2.getLocale()); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39073);assertSame(f2, f2.withLocale(Locale.FRENCH)); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39074);f2 = f.withLocale(null); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39075);assertEquals(null, f2.getLocale()); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39076);assertSame(f2, f2.withLocale(null)); 
 }finally{__CLR4_4_1u47u47le6qsfq8.R.flushNeeded();}} 


public void testWithGetParseTypeMethods617() {__CLR4_4_1u47u47le6qsfq8.R.globalSliceStart(getClass().getName(),39077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15y7wf4u5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u47u47le6qsfq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u47u47le6qsfq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testWithGetParseTypeMethods617",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39077,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15y7wf4u5h(){try{__CLR4_4_1u47u47le6qsfq8.R.inc(39077); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39078);PeriodFormatter f2 = f.withParseType(PeriodType.dayTime()); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39079);assertEquals(PeriodType.dayTime(), f2.getParseType()); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39080);assertSame(f2, f2.withParseType(PeriodType.dayTime())); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39081);f2 = f.withParseType(null); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39082);assertEquals(null, f2.getParseType()); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39083);assertSame(f2, f2.withParseType(null)); 
 }finally{__CLR4_4_1u47u47le6qsfq8.R.flushNeeded();}} 


public void testPrint_bufferMethods618() throws Exception {__CLR4_4_1u47u47le6qsfq8.R.globalSliceStart(getClass().getName(),39084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gpt51mu5o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u47u47le6qsfq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u47u47le6qsfq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testPrint_bufferMethods618",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39084,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gpt51mu5o() throws Exception{try{__CLR4_4_1u47u47le6qsfq8.R.inc(39084); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39085);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39086);StringBuffer buf = new StringBuffer(); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39087);f.printTo(buf, p); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39088);assertEquals("P1Y2M3W4DT5H6M7.008S", buf.toString()); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39089);buf = new StringBuffer(); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39090);try { 
         __CLR4_4_1u47u47le6qsfq8.R.inc(39091);f.printTo(buf, null); 
         __CLR4_4_1u47u47le6qsfq8.R.inc(39092);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1u47u47le6qsfq8.R.flushNeeded();}} 


public void testParseInto_simple619() {__CLR4_4_1u47u47le6qsfq8.R.globalSliceStart(getClass().getName(),39093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wwau4ru5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u47u47le6qsfq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u47u47le6qsfq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testParseInto_simple619",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39093,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wwau4ru5x(){try{__CLR4_4_1u47u47le6qsfq8.R.inc(39093); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39094);MutablePeriod expect = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39095);MutablePeriod result = new MutablePeriod(); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39096);assertEquals(20, f.parseInto(result, "P1Y2M3W4DT5H6M7.008S", 0)); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39097);assertEquals(expect, result); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39098);try { 
         __CLR4_4_1u47u47le6qsfq8.R.inc(39099);f.parseInto(null, "P1Y2M3W4DT5H6M7.008S", 0); 
         __CLR4_4_1u47u47le6qsfq8.R.inc(39100);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39101);assertEquals(~0, f.parseInto(result, "ABC", 0)); 
 }finally{__CLR4_4_1u47u47le6qsfq8.R.flushNeeded();}} 


public void testParsePeriod_parseType819() {__CLR4_4_1u47u47le6qsfq8.R.globalSliceStart(getClass().getName(),39102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q4xhs9u66();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u47u47le6qsfq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u47u47le6qsfq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testParsePeriod_parseType819",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q4xhs9u66(){try{__CLR4_4_1u47u47le6qsfq8.R.inc(39102); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39103);Period expect = new Period(0, 0, 0, 4, 5, 6, 7, 8, PeriodType.dayTime()); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39104);assertEquals(expect, f.withParseType(PeriodType.dayTime()).parsePeriod("P4DT5H6M7.008S")); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39105);try { 
         __CLR4_4_1u47u47le6qsfq8.R.inc(39106);f.withParseType(PeriodType.dayTime()).parsePeriod("P3W4DT5H6M7.008S"); 
         __CLR4_4_1u47u47le6qsfq8.R.inc(39107);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1u47u47le6qsfq8.R.flushNeeded();}} 


public void testParseMutablePeriod_simple1199() {__CLR4_4_1u47u47le6qsfq8.R.globalSliceStart(getClass().getName(),39108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_125qk1eu6c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u47u47le6qsfq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u47u47le6qsfq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testParseMutablePeriod_simple1199",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39108,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_125qk1eu6c(){try{__CLR4_4_1u47u47le6qsfq8.R.inc(39108); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39109);MutablePeriod expect = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39110);assertEquals(expect, f.parseMutablePeriod("P1Y2M3W4DT5H6M7.008S")); 
     __CLR4_4_1u47u47le6qsfq8.R.inc(39111);try { 
         __CLR4_4_1u47u47le6qsfq8.R.inc(39112);f.parseMutablePeriod("ABC"); 
         __CLR4_4_1u47u47le6qsfq8.R.inc(39113);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1u47u47le6qsfq8.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
