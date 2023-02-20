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
public class TestDateTimeFormatStyle extends TestCase {static class __CLR4_4_1sursurle6qsfms{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,37522,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1sursurle6qsfms.R.inc(37395);
        __CLR4_4_1sursurle6qsfms.R.inc(37396);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1sursurle6qsfms.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1sursurle6qsfms.R.inc(37397);
        __CLR4_4_1sursurle6qsfms.R.inc(37398);return new TestSuite(TestDateTimeFormatStyle.class);
    }finally{__CLR4_4_1sursurle6qsfms.R.flushNeeded();}}

    public TestDateTimeFormatStyle(String name) {
        super(name);__CLR4_4_1sursurle6qsfms.R.inc(37400);try{__CLR4_4_1sursurle6qsfms.R.inc(37399);
    }finally{__CLR4_4_1sursurle6qsfms.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1sursurle6qsfms.R.inc(37401);
        __CLR4_4_1sursurle6qsfms.R.inc(37402);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1sursurle6qsfms.R.inc(37403);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1sursurle6qsfms.R.inc(37404);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1sursurle6qsfms.R.inc(37405);originalLocale = Locale.getDefault();
        __CLR4_4_1sursurle6qsfms.R.inc(37406);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1sursurle6qsfms.R.inc(37407);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1sursurle6qsfms.R.inc(37408);Locale.setDefault(UK);
    }finally{__CLR4_4_1sursurle6qsfms.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1sursurle6qsfms.R.inc(37409);
        __CLR4_4_1sursurle6qsfms.R.inc(37410);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1sursurle6qsfms.R.inc(37411);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1sursurle6qsfms.R.inc(37412);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1sursurle6qsfms.R.inc(37413);Locale.setDefault(originalLocale);
        __CLR4_4_1sursurle6qsfms.R.inc(37414);originalDateTimeZone = null;
        __CLR4_4_1sursurle6qsfms.R.inc(37415);originalTimeZone = null;
        __CLR4_4_1sursurle6qsfms.R.inc(37416);originalLocale = null;
    }finally{__CLR4_4_1sursurle6qsfms.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testForStyle_shortDateTime176() throws Exception {__CLR4_4_1sursurle6qsfms.R.globalSliceStart(getClass().getName(),37417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_148kchxsvd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sursurle6qsfms.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sursurle6qsfms.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortDateTime176",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_148kchxsvd() throws Exception{try{__CLR4_4_1sursurle6qsfms.R.inc(37417); 
     __CLR4_4_1sursurle6qsfms.R.inc(37418);DateTimeFormatter f = DateTimeFormat.shortDateTime(); 
     __CLR4_4_1sursurle6qsfms.R.inc(37419);DateTimeFormatter g = DateTimeFormat.forStyle("SS"); 
     __CLR4_4_1sursurle6qsfms.R.inc(37420);assertSame(g, f); 
     __CLR4_4_1sursurle6qsfms.R.inc(37421);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1sursurle6qsfms.R.inc(37422);String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, UK).format(dt.toDate()); 
     __CLR4_4_1sursurle6qsfms.R.inc(37423);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1sursurle6qsfms.R.inc(37424);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, US).format(dt.toDate()); 
     __CLR4_4_1sursurle6qsfms.R.inc(37425);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1sursurle6qsfms.R.inc(37426);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, FRANCE).format(dt.toDate()); 
     __CLR4_4_1sursurle6qsfms.R.inc(37427);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
     __CLR4_4_1sursurle6qsfms.R.inc(37428);DateTime date = new DateTime(DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, FRANCE).parse(expect)); 
     __CLR4_4_1sursurle6qsfms.R.inc(37429);assertEquals(date, f.withLocale(FRANCE).parseDateTime(expect)); 
 }finally{__CLR4_4_1sursurle6qsfms.R.flushNeeded();}} 


public void testForStyle_shortTime177() throws Exception {__CLR4_4_1sursurle6qsfms.R.globalSliceStart(getClass().getName(),37430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o82mpgsvq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sursurle6qsfms.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sursurle6qsfms.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortTime177",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o82mpgsvq() throws Exception{try{__CLR4_4_1sursurle6qsfms.R.inc(37430); 
     __CLR4_4_1sursurle6qsfms.R.inc(37431);DateTimeFormatter f = DateTimeFormat.shortTime(); 
     __CLR4_4_1sursurle6qsfms.R.inc(37432);DateTimeFormatter g = DateTimeFormat.forStyle("-S"); 
     __CLR4_4_1sursurle6qsfms.R.inc(37433);assertSame(g, f); 
     __CLR4_4_1sursurle6qsfms.R.inc(37434);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1sursurle6qsfms.R.inc(37435);String expect = DateFormat.getTimeInstance(DateFormat.SHORT, UK).format(dt.toDate()); 
     __CLR4_4_1sursurle6qsfms.R.inc(37436);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1sursurle6qsfms.R.inc(37437);expect = DateFormat.getTimeInstance(DateFormat.SHORT, US).format(dt.toDate()); 
     __CLR4_4_1sursurle6qsfms.R.inc(37438);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1sursurle6qsfms.R.inc(37439);expect = DateFormat.getTimeInstance(DateFormat.SHORT, FRANCE).format(dt.toDate()); 
     __CLR4_4_1sursurle6qsfms.R.inc(37440);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
     __CLR4_4_1sursurle6qsfms.R.inc(37441);if ((((TimeZone.getDefault() instanceof SimpleTimeZone)&&(__CLR4_4_1sursurle6qsfms.R.iget(37442)!=0|true))||(__CLR4_4_1sursurle6qsfms.R.iget(37443)==0&false))) {{ 
     } }else {{ 
         __CLR4_4_1sursurle6qsfms.R.inc(37444);DateTime date = new DateTime(DateFormat.getTimeInstance(DateFormat.SHORT, FRANCE).parse(expect)); 
         __CLR4_4_1sursurle6qsfms.R.inc(37445);assertEquals(date, f.withLocale(FRANCE).parseDateTime(expect)); 
     } 
 }}finally{__CLR4_4_1sursurle6qsfms.R.flushNeeded();}} 


public void testForStyle_mediumDate178() throws Exception {__CLR4_4_1sursurle6qsfms.R.globalSliceStart(getClass().getName(),37446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1seqrlbsw6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sursurle6qsfms.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sursurle6qsfms.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumDate178",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37446,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1seqrlbsw6() throws Exception{try{__CLR4_4_1sursurle6qsfms.R.inc(37446); 
     __CLR4_4_1sursurle6qsfms.R.inc(37447);DateTimeFormatter f = DateTimeFormat.mediumDate(); 
     __CLR4_4_1sursurle6qsfms.R.inc(37448);DateTimeFormatter g = DateTimeFormat.forStyle("M-"); 
     __CLR4_4_1sursurle6qsfms.R.inc(37449);assertSame(g, f); 
     __CLR4_4_1sursurle6qsfms.R.inc(37450);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1sursurle6qsfms.R.inc(37451);String expect = DateFormat.getDateInstance(DateFormat.MEDIUM, UK).format(dt.toDate()); 
     __CLR4_4_1sursurle6qsfms.R.inc(37452);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1sursurle6qsfms.R.inc(37453);expect = DateFormat.getDateInstance(DateFormat.MEDIUM, US).format(dt.toDate()); 
     __CLR4_4_1sursurle6qsfms.R.inc(37454);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1sursurle6qsfms.R.inc(37455);expect = DateFormat.getDateInstance(DateFormat.MEDIUM, FRANCE).format(dt.toDate()); 
     __CLR4_4_1sursurle6qsfms.R.inc(37456);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1sursurle6qsfms.R.flushNeeded();}} 


public void testForStyle_mediumTime179() throws Exception {__CLR4_4_1sursurle6qsfms.R.globalSliceStart(getClass().getName(),37457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15zm1v1swh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sursurle6qsfms.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sursurle6qsfms.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumTime179",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37457,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15zm1v1swh() throws Exception{try{__CLR4_4_1sursurle6qsfms.R.inc(37457); 
     __CLR4_4_1sursurle6qsfms.R.inc(37458);DateTimeFormatter f = DateTimeFormat.mediumTime(); 
     __CLR4_4_1sursurle6qsfms.R.inc(37459);DateTimeFormatter g = DateTimeFormat.forStyle("-M"); 
     __CLR4_4_1sursurle6qsfms.R.inc(37460);assertSame(g, f); 
     __CLR4_4_1sursurle6qsfms.R.inc(37461);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1sursurle6qsfms.R.inc(37462);String expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, UK).format(dt.toDate()); 
     __CLR4_4_1sursurle6qsfms.R.inc(37463);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1sursurle6qsfms.R.inc(37464);expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, US).format(dt.toDate()); 
     __CLR4_4_1sursurle6qsfms.R.inc(37465);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1sursurle6qsfms.R.inc(37466);expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, FRANCE).format(dt.toDate()); 
     __CLR4_4_1sursurle6qsfms.R.inc(37467);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1sursurle6qsfms.R.flushNeeded();}} 


public void testForStyle_mediumDateTime180() throws Exception {__CLR4_4_1sursurle6qsfms.R.globalSliceStart(getClass().getName(),37468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17gn3hhsws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sursurle6qsfms.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sursurle6qsfms.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumDateTime180",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17gn3hhsws() throws Exception{try{__CLR4_4_1sursurle6qsfms.R.inc(37468); 
     __CLR4_4_1sursurle6qsfms.R.inc(37469);DateTimeFormatter f = DateTimeFormat.mediumDateTime(); 
     __CLR4_4_1sursurle6qsfms.R.inc(37470);DateTimeFormatter g = DateTimeFormat.forStyle("MM"); 
     __CLR4_4_1sursurle6qsfms.R.inc(37471);assertSame(g, f); 
     __CLR4_4_1sursurle6qsfms.R.inc(37472);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1sursurle6qsfms.R.inc(37473);String expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, UK).format(dt.toDate()); 
     __CLR4_4_1sursurle6qsfms.R.inc(37474);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1sursurle6qsfms.R.inc(37475);expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, US).format(dt.toDate()); 
     __CLR4_4_1sursurle6qsfms.R.inc(37476);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1sursurle6qsfms.R.inc(37477);expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, FRANCE).format(dt.toDate()); 
     __CLR4_4_1sursurle6qsfms.R.inc(37478);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1sursurle6qsfms.R.flushNeeded();}} 


public void testForStyle_longDate181() throws Exception {__CLR4_4_1sursurle6qsfms.R.globalSliceStart(getClass().getName(),37479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cwvbrysx3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sursurle6qsfms.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sursurle6qsfms.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_longDate181",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cwvbrysx3() throws Exception{try{__CLR4_4_1sursurle6qsfms.R.inc(37479); 
     __CLR4_4_1sursurle6qsfms.R.inc(37480);DateTimeFormatter f = DateTimeFormat.longDate(); 
     __CLR4_4_1sursurle6qsfms.R.inc(37481);DateTimeFormatter g = DateTimeFormat.forStyle("L-"); 
     __CLR4_4_1sursurle6qsfms.R.inc(37482);assertSame(g, f); 
     __CLR4_4_1sursurle6qsfms.R.inc(37483);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1sursurle6qsfms.R.inc(37484);String expect = DateFormat.getDateInstance(DateFormat.LONG, UK).format(dt.toDate()); 
     __CLR4_4_1sursurle6qsfms.R.inc(37485);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1sursurle6qsfms.R.inc(37486);expect = DateFormat.getDateInstance(DateFormat.LONG, US).format(dt.toDate()); 
     __CLR4_4_1sursurle6qsfms.R.inc(37487);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1sursurle6qsfms.R.inc(37488);expect = DateFormat.getDateInstance(DateFormat.LONG, FRANCE).format(dt.toDate()); 
     __CLR4_4_1sursurle6qsfms.R.inc(37489);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1sursurle6qsfms.R.flushNeeded();}} 


public void testForStyle_stringLengths200() {__CLR4_4_1sursurle6qsfms.R.globalSliceStart(getClass().getName(),37490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cw7zoesxe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sursurle6qsfms.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sursurle6qsfms.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_stringLengths200",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37490,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cw7zoesxe(){try{__CLR4_4_1sursurle6qsfms.R.inc(37490); 
     __CLR4_4_1sursurle6qsfms.R.inc(37491);try { 
         __CLR4_4_1sursurle6qsfms.R.inc(37492);DateTimeFormat.forStyle(null); 
         __CLR4_4_1sursurle6qsfms.R.inc(37493);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1sursurle6qsfms.R.inc(37494);try { 
         __CLR4_4_1sursurle6qsfms.R.inc(37495);DateTimeFormat.forStyle(""); 
         __CLR4_4_1sursurle6qsfms.R.inc(37496);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1sursurle6qsfms.R.inc(37497);try { 
         __CLR4_4_1sursurle6qsfms.R.inc(37498);DateTimeFormat.forStyle("S"); 
         __CLR4_4_1sursurle6qsfms.R.inc(37499);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1sursurle6qsfms.R.inc(37500);try { 
         __CLR4_4_1sursurle6qsfms.R.inc(37501);DateTimeFormat.forStyle("SSS"); 
         __CLR4_4_1sursurle6qsfms.R.inc(37502);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1sursurle6qsfms.R.flushNeeded();}} 


public void testForStyle_invalidStrings201() {__CLR4_4_1sursurle6qsfms.R.globalSliceStart(getClass().getName(),37503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o7kiwmsxr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sursurle6qsfms.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sursurle6qsfms.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_invalidStrings201",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o7kiwmsxr(){try{__CLR4_4_1sursurle6qsfms.R.inc(37503); 
     __CLR4_4_1sursurle6qsfms.R.inc(37504);try { 
         __CLR4_4_1sursurle6qsfms.R.inc(37505);DateTimeFormat.forStyle("AA"); 
         __CLR4_4_1sursurle6qsfms.R.inc(37506);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1sursurle6qsfms.R.inc(37507);try { 
         __CLR4_4_1sursurle6qsfms.R.inc(37508);DateTimeFormat.forStyle("--"); 
         __CLR4_4_1sursurle6qsfms.R.inc(37509);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1sursurle6qsfms.R.inc(37510);try { 
         __CLR4_4_1sursurle6qsfms.R.inc(37511);DateTimeFormat.forStyle("ss"); 
         __CLR4_4_1sursurle6qsfms.R.inc(37512);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1sursurle6qsfms.R.flushNeeded();}} 


public void testForStyle_shortMediumDateTime1114() throws Exception {__CLR4_4_1sursurle6qsfms.R.globalSliceStart(getClass().getName(),37513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vih3oxsy1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sursurle6qsfms.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sursurle6qsfms.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortMediumDateTime1114",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vih3oxsy1() throws Exception{try{__CLR4_4_1sursurle6qsfms.R.inc(37513); 
     __CLR4_4_1sursurle6qsfms.R.inc(37514);DateTimeFormatter f = DateTimeFormat.forStyle("SM"); 
     __CLR4_4_1sursurle6qsfms.R.inc(37515);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1sursurle6qsfms.R.inc(37516);String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM, UK).format(dt.toDate()); 
     __CLR4_4_1sursurle6qsfms.R.inc(37517);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1sursurle6qsfms.R.inc(37518);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM, US).format(dt.toDate()); 
     __CLR4_4_1sursurle6qsfms.R.inc(37519);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1sursurle6qsfms.R.inc(37520);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM, FRANCE).format(dt.toDate()); 
     __CLR4_4_1sursurle6qsfms.R.inc(37521);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1sursurle6qsfms.R.flushNeeded();}} 

    

    

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
