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
public class TestDateTimeFormatStyle extends TestCase {static class __CLR4_4_1t2at2ale6rjdnv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,37793,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1t2at2ale6rjdnv.R.inc(37666);
        __CLR4_4_1t2at2ale6rjdnv.R.inc(37667);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1t2at2ale6rjdnv.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1t2at2ale6rjdnv.R.inc(37668);
        __CLR4_4_1t2at2ale6rjdnv.R.inc(37669);return new TestSuite(TestDateTimeFormatStyle.class);
    }finally{__CLR4_4_1t2at2ale6rjdnv.R.flushNeeded();}}

    public TestDateTimeFormatStyle(String name) {
        super(name);__CLR4_4_1t2at2ale6rjdnv.R.inc(37671);try{__CLR4_4_1t2at2ale6rjdnv.R.inc(37670);
    }finally{__CLR4_4_1t2at2ale6rjdnv.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1t2at2ale6rjdnv.R.inc(37672);
        __CLR4_4_1t2at2ale6rjdnv.R.inc(37673);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1t2at2ale6rjdnv.R.inc(37674);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1t2at2ale6rjdnv.R.inc(37675);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1t2at2ale6rjdnv.R.inc(37676);originalLocale = Locale.getDefault();
        __CLR4_4_1t2at2ale6rjdnv.R.inc(37677);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1t2at2ale6rjdnv.R.inc(37678);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1t2at2ale6rjdnv.R.inc(37679);Locale.setDefault(UK);
    }finally{__CLR4_4_1t2at2ale6rjdnv.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1t2at2ale6rjdnv.R.inc(37680);
        __CLR4_4_1t2at2ale6rjdnv.R.inc(37681);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1t2at2ale6rjdnv.R.inc(37682);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1t2at2ale6rjdnv.R.inc(37683);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1t2at2ale6rjdnv.R.inc(37684);Locale.setDefault(originalLocale);
        __CLR4_4_1t2at2ale6rjdnv.R.inc(37685);originalDateTimeZone = null;
        __CLR4_4_1t2at2ale6rjdnv.R.inc(37686);originalTimeZone = null;
        __CLR4_4_1t2at2ale6rjdnv.R.inc(37687);originalLocale = null;
    }finally{__CLR4_4_1t2at2ale6rjdnv.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testForStyle_shortDate197() throws Exception {__CLR4_4_1t2at2ale6rjdnv.R.globalSliceStart(getClass().getName(),37688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16jgd4ft2w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t2at2ale6rjdnv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t2at2ale6rjdnv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortDate197",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37688,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16jgd4ft2w() throws Exception{try{__CLR4_4_1t2at2ale6rjdnv.R.inc(37688); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37689);DateTimeFormatter f = DateTimeFormat.shortDate(); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37690);DateTimeFormatter g = DateTimeFormat.forStyle("S-"); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37691);assertSame(g, f); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37692);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37693);String expect = DateFormat.getDateInstance(DateFormat.SHORT, UK).format(dt.toDate()); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37694);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37695);expect = DateFormat.getDateInstance(DateFormat.SHORT, US).format(dt.toDate()); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37696);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37697);expect = DateFormat.getDateInstance(DateFormat.SHORT, FRANCE).format(dt.toDate()); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37698);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37699);DateTime date = new DateTime(DateFormat.getDateInstance(DateFormat.SHORT, FRANCE).parse(expect)); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37700);assertEquals(date, f.withLocale(FRANCE).parseDateTime(expect)); 
 }finally{__CLR4_4_1t2at2ale6rjdnv.R.flushNeeded();}} 


public void testForStyle_shortTime198() throws Exception {__CLR4_4_1t2at2ale6rjdnv.R.globalSliceStart(getClass().getName(),37701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fvoclvt39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t2at2ale6rjdnv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t2at2ale6rjdnv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortTime198",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37701,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fvoclvt39() throws Exception{try{__CLR4_4_1t2at2ale6rjdnv.R.inc(37701); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37702);DateTimeFormatter f = DateTimeFormat.shortTime(); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37703);DateTimeFormatter g = DateTimeFormat.forStyle("-S"); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37704);assertSame(g, f); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37705);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37706);String expect = DateFormat.getTimeInstance(DateFormat.SHORT, UK).format(dt.toDate()); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37707);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37708);expect = DateFormat.getTimeInstance(DateFormat.SHORT, US).format(dt.toDate()); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37709);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37710);expect = DateFormat.getTimeInstance(DateFormat.SHORT, FRANCE).format(dt.toDate()); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37711);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37712);if ((((TimeZone.getDefault() instanceof SimpleTimeZone)&&(__CLR4_4_1t2at2ale6rjdnv.R.iget(37713)!=0|true))||(__CLR4_4_1t2at2ale6rjdnv.R.iget(37714)==0&false))) {{ 
     } }else {{ 
         __CLR4_4_1t2at2ale6rjdnv.R.inc(37715);DateTime date = new DateTime(DateFormat.getTimeInstance(DateFormat.SHORT, FRANCE).parse(expect)); 
         __CLR4_4_1t2at2ale6rjdnv.R.inc(37716);assertEquals(date, f.withLocale(FRANCE).parseDateTime(expect)); 
     } 
 }}finally{__CLR4_4_1t2at2ale6rjdnv.R.flushNeeded();}} 


public void testForStyle_mediumDate199() throws Exception {__CLR4_4_1t2at2ale6rjdnv.R.globalSliceStart(getClass().getName(),37717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y9z0a8t3p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t2at2ale6rjdnv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t2at2ale6rjdnv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumDate199",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37717,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y9z0a8t3p() throws Exception{try{__CLR4_4_1t2at2ale6rjdnv.R.inc(37717); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37718);DateTimeFormatter f = DateTimeFormat.mediumDate(); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37719);DateTimeFormatter g = DateTimeFormat.forStyle("M-"); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37720);assertSame(g, f); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37721);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37722);String expect = DateFormat.getDateInstance(DateFormat.MEDIUM, UK).format(dt.toDate()); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37723);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37724);expect = DateFormat.getDateInstance(DateFormat.MEDIUM, US).format(dt.toDate()); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37725);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37726);expect = DateFormat.getDateInstance(DateFormat.MEDIUM, FRANCE).format(dt.toDate()); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37727);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1t2at2ale6rjdnv.R.flushNeeded();}} 


public void testForStyle_mediumTime200() throws Exception {__CLR4_4_1t2at2ale6rjdnv.R.globalSliceStart(getClass().getName(),37728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wb4lpqt40();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t2at2ale6rjdnv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t2at2ale6rjdnv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumTime200",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37728,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wb4lpqt40() throws Exception{try{__CLR4_4_1t2at2ale6rjdnv.R.inc(37728); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37729);DateTimeFormatter f = DateTimeFormat.mediumTime(); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37730);DateTimeFormatter g = DateTimeFormat.forStyle("-M"); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37731);assertSame(g, f); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37732);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37733);String expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, UK).format(dt.toDate()); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37734);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37735);expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, US).format(dt.toDate()); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37736);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37737);expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, FRANCE).format(dt.toDate()); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37738);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1t2at2ale6rjdnv.R.flushNeeded();}} 


public void testForStyle_longDate201() throws Exception {__CLR4_4_1t2at2ale6rjdnv.R.globalSliceStart(getClass().getName(),37739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vbuyx7t4b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t2at2ale6rjdnv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t2at2ale6rjdnv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_longDate201",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37739,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vbuyx7t4b() throws Exception{try{__CLR4_4_1t2at2ale6rjdnv.R.inc(37739); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37740);DateTimeFormatter f = DateTimeFormat.longDate(); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37741);DateTimeFormatter g = DateTimeFormat.forStyle("L-"); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37742);assertSame(g, f); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37743);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37744);String expect = DateFormat.getDateInstance(DateFormat.LONG, UK).format(dt.toDate()); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37745);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37746);expect = DateFormat.getDateInstance(DateFormat.LONG, US).format(dt.toDate()); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37747);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37748);expect = DateFormat.getDateInstance(DateFormat.LONG, FRANCE).format(dt.toDate()); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37749);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1t2at2ale6rjdnv.R.flushNeeded();}} 


public void testForStyle_fullDate202() throws Exception {__CLR4_4_1t2at2ale6rjdnv.R.globalSliceStart(getClass().getName(),37750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ybkt5t4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t2at2ale6rjdnv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t2at2ale6rjdnv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_fullDate202",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ybkt5t4m() throws Exception{try{__CLR4_4_1t2at2ale6rjdnv.R.inc(37750); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37751);DateTimeFormatter f = DateTimeFormat.fullDate(); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37752);DateTimeFormatter g = DateTimeFormat.forStyle("F-"); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37753);assertSame(g, f); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37754);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37755);String expect = DateFormat.getDateInstance(DateFormat.FULL, UK).format(dt.toDate()); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37756);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37757);expect = DateFormat.getDateInstance(DateFormat.FULL, US).format(dt.toDate()); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37758);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37759);expect = DateFormat.getDateInstance(DateFormat.FULL, FRANCE).format(dt.toDate()); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37760);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1t2at2ale6rjdnv.R.flushNeeded();}} 


public void testForStyle_stringLengths224() {__CLR4_4_1t2at2ale6rjdnv.R.globalSliceStart(getClass().getName(),37761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bhmdekt4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t2at2ale6rjdnv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t2at2ale6rjdnv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_stringLengths224",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37761,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bhmdekt4x(){try{__CLR4_4_1t2at2ale6rjdnv.R.inc(37761); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37762);try { 
         __CLR4_4_1t2at2ale6rjdnv.R.inc(37763);DateTimeFormat.forStyle(null); 
         __CLR4_4_1t2at2ale6rjdnv.R.inc(37764);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37765);try { 
         __CLR4_4_1t2at2ale6rjdnv.R.inc(37766);DateTimeFormat.forStyle(""); 
         __CLR4_4_1t2at2ale6rjdnv.R.inc(37767);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37768);try { 
         __CLR4_4_1t2at2ale6rjdnv.R.inc(37769);DateTimeFormat.forStyle("S"); 
         __CLR4_4_1t2at2ale6rjdnv.R.inc(37770);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37771);try { 
         __CLR4_4_1t2at2ale6rjdnv.R.inc(37772);DateTimeFormat.forStyle("SSS"); 
         __CLR4_4_1t2at2ale6rjdnv.R.inc(37773);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1t2at2ale6rjdnv.R.flushNeeded();}} 


public void testForStyle_invalidStrings225() {__CLR4_4_1t2at2ale6rjdnv.R.globalSliceStart(getClass().getName(),37774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1msywmst5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t2at2ale6rjdnv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t2at2ale6rjdnv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_invalidStrings225",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37774,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1msywmst5a(){try{__CLR4_4_1t2at2ale6rjdnv.R.inc(37774); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37775);try { 
         __CLR4_4_1t2at2ale6rjdnv.R.inc(37776);DateTimeFormat.forStyle("AA"); 
         __CLR4_4_1t2at2ale6rjdnv.R.inc(37777);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37778);try { 
         __CLR4_4_1t2at2ale6rjdnv.R.inc(37779);DateTimeFormat.forStyle("--"); 
         __CLR4_4_1t2at2ale6rjdnv.R.inc(37780);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37781);try { 
         __CLR4_4_1t2at2ale6rjdnv.R.inc(37782);DateTimeFormat.forStyle("ss"); 
         __CLR4_4_1t2at2ale6rjdnv.R.inc(37783);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1t2at2ale6rjdnv.R.flushNeeded();}} 


public void testForStyle_shortMediumDateTime1140() throws Exception {__CLR4_4_1t2at2ale6rjdnv.R.globalSliceStart(getClass().getName(),37784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ye65smt5k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t2at2ale6rjdnv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t2at2ale6rjdnv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortMediumDateTime1140",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ye65smt5k() throws Exception{try{__CLR4_4_1t2at2ale6rjdnv.R.inc(37784); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37785);DateTimeFormatter f = DateTimeFormat.forStyle("SM"); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37786);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37787);String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM, UK).format(dt.toDate()); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37788);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37789);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM, US).format(dt.toDate()); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37790);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37791);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM, FRANCE).format(dt.toDate()); 
     __CLR4_4_1t2at2ale6rjdnv.R.inc(37792);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1t2at2ale6rjdnv.R.flushNeeded();}} 

    

    

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
