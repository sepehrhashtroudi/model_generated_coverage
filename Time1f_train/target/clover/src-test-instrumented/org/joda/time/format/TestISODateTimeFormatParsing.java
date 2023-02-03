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

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 * This class is a Junit unit test for ISODateTimeFormat parsing.
 *
 * @author Stephen Colebourne
 */
public class TestISODateTimeFormatParsing extends TestCase {static class __CLR4_4_1vbovbolc8axf4f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,41065,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1vbovbolc8axf4f.R.inc(40596);
        __CLR4_4_1vbovbolc8axf4f.R.inc(40597);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1vbovbolc8axf4f.R.inc(40598);
        __CLR4_4_1vbovbolc8axf4f.R.inc(40599);return new TestSuite(TestISODateTimeFormatParsing.class);
    }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}}

    public TestISODateTimeFormatParsing(String name) {
        super(name);__CLR4_4_1vbovbolc8axf4f.R.inc(40601);try{__CLR4_4_1vbovbolc8axf4f.R.inc(40600);
    }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1vbovbolc8axf4f.R.inc(40602);
        __CLR4_4_1vbovbolc8axf4f.R.inc(40603);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1vbovbolc8axf4f.R.inc(40604);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1vbovbolc8axf4f.R.inc(40605);originalLocale = Locale.getDefault();
        __CLR4_4_1vbovbolc8axf4f.R.inc(40606);DateTimeZone.setDefault(DateTimeZone.forID("Europe/London"));
        __CLR4_4_1vbovbolc8axf4f.R.inc(40607);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1vbovbolc8axf4f.R.inc(40608);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1vbovbolc8axf4f.R.inc(40609);
        __CLR4_4_1vbovbolc8axf4f.R.inc(40610);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1vbovbolc8axf4f.R.inc(40611);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1vbovbolc8axf4f.R.inc(40612);Locale.setDefault(originalLocale);
        __CLR4_4_1vbovbolc8axf4f.R.inc(40613);originalDateTimeZone = null;
        __CLR4_4_1vbovbolc8axf4f.R.inc(40614);originalTimeZone = null;
        __CLR4_4_1vbovbolc8axf4f.R.inc(40615);originalLocale = null;
    }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_basicTimeNoMillis80() {__CLR4_4_1vbovbolc8axf4f.R.globalSliceStart(getClass().getName(),40616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3p6dwvc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vbovbolc8axf4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vbovbolc8axf4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicTimeNoMillis80",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40616,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3p6dwvc8(){try{__CLR4_4_1vbovbolc8axf4f.R.inc(40616); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40617);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40618);DateTimeFormatter parser = ISODateTimeFormat.basicTimeNoMillis(); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40619);assertParse(parser, "102030Z", new DateTime(1970, 1, 1, 10, 20, 30, 0)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40620);assertParse(parser, false, "10203Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40621);assertParse(parser, false, "1020Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40622);assertParse(parser, false, "102Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40623);assertParse(parser, false, "10Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40624);assertParse(parser, false, "1Z"); 
 }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}} 


public void test_basicWeekDateTime123() {__CLR4_4_1vbovbolc8axf4f.R.globalSliceStart(getClass().getName(),40625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kjb6axvch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vbovbolc8axf4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vbovbolc8axf4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicWeekDateTime123",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40625,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kjb6axvch(){try{__CLR4_4_1vbovbolc8axf4f.R.inc(40625); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40626);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40627);DateTimeFormatter parser = ISODateTimeFormat.basicWeekDateTime(); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40628);assertParse(parser, "2006W273T102030.400999999Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40629);assertParse(parser, "2006W273T102030.400Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40630);assertParse(parser, "2006W273T102030.40Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40631);assertParse(parser, "2006W273T102030.4Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40632);assertParse(parser, false, "2006W27T102030.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40633);assertParse(parser, false, "2006W2T102030.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40634);assertParse(parser, false, "2006W273T10203.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40635);assertParse(parser, false, "2006W273T1020.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40636);assertParse(parser, false, "2006W273T102.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40637);assertParse(parser, false, "2006W273T10.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40638);assertParse(parser, false, "2006W273T1.400Z"); 
 }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}} 


public void test_dateTimeNoMillis161() {__CLR4_4_1vbovbolc8axf4f.R.globalSliceStart(getClass().getName(),40639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1divvb0vcv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vbovbolc8axf4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vbovbolc8axf4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_dateTimeNoMillis161",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1divvb0vcv(){try{__CLR4_4_1vbovbolc8axf4f.R.inc(40639); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40640);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40641);DateTimeFormatter parser = ISODateTimeFormat.dateTimeNoMillis(); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40642);assertParse(parser, "2006-02-04T10:20:30Z", new DateTime(2006, 2, 4, 10, 20, 30, 0)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40643);assertParse(parser, "2006-02-4T10:20:30Z", new DateTime(2006, 2, 4, 10, 20, 30, 0)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40644);assertParse(parser, "2006-2-04T10:20:30Z", new DateTime(2006, 2, 4, 10, 20, 30, 0)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40645);assertParse(parser, "2006-2-4T10:20:30Z", new DateTime(2006, 2, 4, 10, 20, 30, 0)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40646);assertParse(parser, "2006-02-04T5:6:7Z", new DateTime(2006, 2, 4, 5, 6, 7, 0)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40647);assertParse(parser, false, "2006-02-T10:20:30Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40648);assertParse(parser, false, "2006-12T10:20:30Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40649);assertParse(parser, false, "2006-1T10:20:30Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40650);assertParse(parser, false, "2006T10:20:30Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40651);assertParse(parser, false, "200T10:20:30Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40652);assertParse(parser, false, "20T10:20:30Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40653);assertParse(parser, false, "2T10:20:30Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40654);assertParse(parser, false, "2006-02-04T10:20Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40655);assertParse(parser, false, "2006-02-04T10:2Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40656);assertParse(parser, false, "2006-02-04T10Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40657);assertParse(parser, false, "2006-02-04T1Z"); 
 }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}} 


public void test_weekDateTime447() {__CLR4_4_1vbovbolc8axf4f.R.globalSliceStart(getClass().getName(),40658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k9xk9uvde();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vbovbolc8axf4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vbovbolc8axf4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_weekDateTime447",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40658,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k9xk9uvde(){try{__CLR4_4_1vbovbolc8axf4f.R.inc(40658); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40659);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40660);DateTimeFormatter parser = ISODateTimeFormat.weekDateTime(); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40661);assertParse(parser, "2006-W27-3T10:20:30.400999999Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40662);assertParse(parser, "2006-W27-3T10:20:30.400Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40663);assertParse(parser, "2006-W27-3T10:20:30.40Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40664);assertParse(parser, "2006-W27-3T10:20:30.4Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40665);assertParse(parser, "2006-W2-3T10:20:30.400Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(2).withDayOfWeek(3)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40666);assertParse(parser, "2006-W27-3T5:6:7.800Z", new DateTime(2006, 6, 1, 5, 6, 7, 800).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40667);assertParse(parser, false, "2006-W27-T10:20:30.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40668);assertParse(parser, false, "2006-W27T10:20:30.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40669);assertParse(parser, false, "2006-W2T10:20:30.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40670);assertParse(parser, false, "2006-W-3T10:20:30.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40671);assertParse(parser, false, "2006-W27-3T10:20.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40672);assertParse(parser, false, "2006-W27-3T10:2.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40673);assertParse(parser, false, "2006-W27-3T10.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40674);assertParse(parser, false, "2006-W27-3T1.400Z"); 
 }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}} 


public void test_timeElementParser613() {__CLR4_4_1vbovbolc8axf4f.R.globalSliceStart(getClass().getName(),40675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f0gnmmvdv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vbovbolc8axf4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vbovbolc8axf4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_timeElementParser613",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40675,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f0gnmmvdv(){try{__CLR4_4_1vbovbolc8axf4f.R.inc(40675); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40676);DateTimeFormatter parser = ISODateTimeFormat.timeElementParser(); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40677);assertParse(parser, false, "2006-06-09"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40678);assertParse(parser, false, "2006-W27-3"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40679);assertParse(parser, false, "2006-123"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40680);assertParse(parser, false, "2006-06-09T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40681);assertParse(parser, false, "2006-W27-3T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40682);assertParse(parser, false, "2006-123T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40683);assertParse(parser, false, "2006-06-09T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40684);assertParse(parser, false, "2006-W27-3T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40685);assertParse(parser, false, "2006-123T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40686);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40687);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40688);assertParse(parser, false, "2006-123T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40689);assertParse(parser, false, "T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40690);assertParse(parser, false, "T10.5"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40691);assertParse(parser, false, "T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40692);assertParse(parser, false, "T10.5+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40693);assertParse(parser, true, "10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40694);assertParse(parser, true, "10.5"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40695);assertParse(parser, false, "10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40696);assertParse(parser, false, "10.5+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40697);assertParse(parser, true, "00:00:10.512345678"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40698);assertEquals(10512, parser.parseMillis("00:00:10.512345678") + DateTimeZone.getDefault().getOffset(0L)); 
 }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}} 


public void test_basicDateTime712() {__CLR4_4_1vbovbolc8axf4f.R.globalSliceStart(getClass().getName(),40699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1581u71vej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vbovbolc8axf4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vbovbolc8axf4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicDateTime712",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40699,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1581u71vej(){try{__CLR4_4_1vbovbolc8axf4f.R.inc(40699); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40700);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40701);DateTimeFormatter parser = ISODateTimeFormat.basicDateTime(); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40702);assertParse(parser, "20061204T102030.400999999Z", new DateTime(2006, 12, 4, 10, 20, 30, 400)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40703);assertParse(parser, "20061204T102030.400Z", new DateTime(2006, 12, 4, 10, 20, 30, 400)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40704);assertParse(parser, "20061204T102030.40Z", new DateTime(2006, 12, 4, 10, 20, 30, 400)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40705);assertParse(parser, "20061204T102030.4Z", new DateTime(2006, 12, 4, 10, 20, 30, 400)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40706);assertParse(parser, false, "2006120T102030.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40707);assertParse(parser, false, "200612T102030.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40708);assertParse(parser, false, "20061T102030.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40709);assertParse(parser, false, "2006T102030.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40710);assertParse(parser, false, "200T102030.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40711);assertParse(parser, false, "20T102030.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40712);assertParse(parser, false, "2T102030.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40713);assertParse(parser, false, "20061204T10203.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40714);assertParse(parser, false, "20061204T1020.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40715);assertParse(parser, false, "20061204T102.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40716);assertParse(parser, false, "20061204T10.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40717);assertParse(parser, false, "20061204T1.400Z"); 
 }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}} 


public void test_basicOrdinalDateTime733() {__CLR4_4_1vbovbolc8axf4f.R.globalSliceStart(getClass().getName(),40718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h7pekzvf2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vbovbolc8axf4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vbovbolc8axf4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicOrdinalDateTime733",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40718,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h7pekzvf2(){try{__CLR4_4_1vbovbolc8axf4f.R.inc(40718); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40719);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40720);DateTimeFormatter parser = ISODateTimeFormat.basicOrdinalDateTime(); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40721);assertParse(parser, "2006123T102030.400999999Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40722);assertParse(parser, "2006123T102030.400Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40723);assertParse(parser, "2006123T102030.40Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40724);assertParse(parser, "2006123T102030.4Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40725);assertParse(parser, false, "200612T102030.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40726);assertParse(parser, false, "20061T102030.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40727);assertParse(parser, false, "2006T102030.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40728);assertParse(parser, false, "200T102030.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40729);assertParse(parser, false, "20T102030.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40730);assertParse(parser, false, "2T102030.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40731);assertParse(parser, false, "2006123T10203.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40732);assertParse(parser, false, "2006123T1020.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40733);assertParse(parser, false, "2006123T102.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40734);assertParse(parser, false, "2006123T10.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40735);assertParse(parser, false, "2006123T1.400Z"); 
 }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}} 


public void test_ordinalDateTimeNoMillis754() {__CLR4_4_1vbovbolc8axf4f.R.globalSliceStart(getClass().getName(),40736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dreg0nvfk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vbovbolc8axf4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vbovbolc8axf4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_ordinalDateTimeNoMillis754",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40736,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dreg0nvfk(){try{__CLR4_4_1vbovbolc8axf4f.R.inc(40736); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40737);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40738);DateTimeFormatter parser = ISODateTimeFormat.ordinalDateTimeNoMillis(); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40739);assertParse(parser, "2006-123T10:20:30Z", new DateTime(2006, 1, 1, 10, 20, 30, 0).withDayOfYear(123)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40740);assertParse(parser, "2006-12T10:20:30Z", new DateTime(2006, 1, 1, 10, 20, 30, 0).withDayOfYear(12)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40741);assertParse(parser, "2006-1T10:20:30Z", new DateTime(2006, 1, 1, 10, 20, 30, 0).withDayOfYear(1)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40742);assertParse(parser, "2006-123T5:6:7Z", new DateTime(2006, 1, 1, 5, 6, 7, 0).withDayOfYear(123)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40743);assertParse(parser, false, "2006-T10:20:30Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40744);assertParse(parser, false, "2006T10:20:30Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40745);assertParse(parser, false, "2006-123T10:20Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40746);assertParse(parser, false, "2006-123T10:2Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40747);assertParse(parser, false, "2006-123T10Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40748);assertParse(parser, false, "2006-123T1Z"); 
 }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}} 


public void test_basicTTimeNoMillis791() {__CLR4_4_1vbovbolc8axf4f.R.globalSliceStart(getClass().getName(),40749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12kbgwfvfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vbovbolc8axf4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vbovbolc8axf4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicTTimeNoMillis791",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40749,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12kbgwfvfx(){try{__CLR4_4_1vbovbolc8axf4f.R.inc(40749); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40750);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40751);DateTimeFormatter parser = ISODateTimeFormat.basicTTimeNoMillis(); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40752);assertParse(parser, "T102030Z", new DateTime(1970, 1, 1, 10, 20, 30, 0)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40753);assertParse(parser, false, "T10203Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40754);assertParse(parser, false, "T1020Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40755);assertParse(parser, false, "T102Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40756);assertParse(parser, false, "T10Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40757);assertParse(parser, false, "T1Z"); 
 }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}} 


public void test_dateElementParser856() {__CLR4_4_1vbovbolc8axf4f.R.globalSliceStart(getClass().getName(),40758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zcmd34vg6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vbovbolc8axf4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vbovbolc8axf4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_dateElementParser856",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zcmd34vg6(){try{__CLR4_4_1vbovbolc8axf4f.R.inc(40758); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40759);DateTimeFormatter parser = ISODateTimeFormat.dateElementParser(); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40760);assertParse(parser, "2006-06-09", new DateTime(2006, 6, 9, 0, 0, 0, 0)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40761);assertParse(parser, "2006-06-9", new DateTime(2006, 6, 9, 0, 0, 0, 0)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40762);assertParse(parser, "2006-6-09", new DateTime(2006, 6, 9, 0, 0, 0, 0)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40763);assertParse(parser, "2006-6-9", new DateTime(2006, 6, 9, 0, 0, 0, 0)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40764);assertParse(parser, true, "2006-W27-3"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40765);assertParse(parser, true, "2006-123"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40766);assertParse(parser, false, "2006-06-09T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40767);assertParse(parser, false, "2006-W27-3T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40768);assertParse(parser, false, "2006-123T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40769);assertParse(parser, false, "2006-06-09T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40770);assertParse(parser, false, "2006-W27-3T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40771);assertParse(parser, false, "2006-123T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40772);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40773);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40774);assertParse(parser, false, "2006-123T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40775);assertParse(parser, false, "T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40776);assertParse(parser, false, "T10.5"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40777);assertParse(parser, false, "T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40778);assertParse(parser, false, "T10.5+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40779);assertParse(parser, false, "10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40780);assertParse(parser, false, "10.5"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40781);assertParse(parser, false, "10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40782);assertParse(parser, false, "10.5+02:00"); 
 }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}} 


public void test_ordinalDate863() {__CLR4_4_1vbovbolc8axf4f.R.globalSliceStart(getClass().getName(),40783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b9dfkavgv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vbovbolc8axf4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vbovbolc8axf4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_ordinalDate863",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b9dfkavgv(){try{__CLR4_4_1vbovbolc8axf4f.R.inc(40783); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40784);DateTimeFormatter parser = ISODateTimeFormat.ordinalDate(); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40785);assertParse(parser, "2006-123", new DateTime(2006, 1, 1, 0, 0, 0, 0).withDayOfYear(123)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40786);assertParse(parser, "2006-12", new DateTime(2006, 1, 1, 0, 0, 0, 0).withDayOfYear(12)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40787);assertParse(parser, "2006-1", new DateTime(2006, 1, 1, 0, 0, 0, 0).withDayOfYear(1)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40788);assertParse(parser, false, "2006-"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40789);assertParse(parser, false, "2006"); 
 }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}} 


public void test_basicOrdinalDate901() {__CLR4_4_1vbovbolc8axf4f.R.globalSliceStart(getClass().getName(),40790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t6xhvhvh2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vbovbolc8axf4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vbovbolc8axf4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicOrdinalDate901",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t6xhvhvh2(){try{__CLR4_4_1vbovbolc8axf4f.R.inc(40790); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40791);DateTimeFormatter parser = ISODateTimeFormat.basicOrdinalDate(); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40792);assertParse(parser, "2006123", new DateTime(2006, 1, 1, 0, 0, 0, 0).withDayOfYear(123)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40793);assertParse(parser, false, "200612"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40794);assertParse(parser, false, "20061"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40795);assertParse(parser, false, "2006"); 
 }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}} 


public void test_dateTimeParser920() {__CLR4_4_1vbovbolc8axf4f.R.globalSliceStart(getClass().getName(),40796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ufpf7bvh8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vbovbolc8axf4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vbovbolc8axf4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_dateTimeParser920",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40796,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ufpf7bvh8(){try{__CLR4_4_1vbovbolc8axf4f.R.inc(40796); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40797);DateTimeFormatter parser = ISODateTimeFormat.dateTimeParser(); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40798);assertParse(parser, true, "2006-06-09"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40799);assertParse(parser, true, "2006-W27-3"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40800);assertParse(parser, true, "2006-123"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40801);assertParse(parser, true, "2006-06-09T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40802);assertParse(parser, true, "2006-W27-3T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40803);assertParse(parser, true, "2006-123T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40804);assertParse(parser, true, "2006-06-09T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40805);assertParse(parser, true, "2006-W27-3T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40806);assertParse(parser, true, "2006-123T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40807);assertParse(parser, true, "2006-06-09T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40808);assertParse(parser, true, "2006-W27-3T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40809);assertParse(parser, true, "2006-123T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40810);assertParse(parser, true, "T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40811);assertParse(parser, true, "T10.5"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40812);assertParse(parser, true, "T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40813);assertParse(parser, true, "T10.5+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40814);assertParse(parser, false, "10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40815);assertParse(parser, false, "10.5"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40816);assertParse(parser, false, "10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40817);assertParse(parser, false, "10.5+02:00"); 
 }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}} 


public void test_tTime945() {__CLR4_4_1vbovbolc8axf4f.R.globalSliceStart(getClass().getName(),40818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1apxq7nvhu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vbovbolc8axf4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vbovbolc8axf4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_tTime945",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40818,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1apxq7nvhu(){try{__CLR4_4_1vbovbolc8axf4f.R.inc(40818); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40819);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40820);DateTimeFormatter parser = ISODateTimeFormat.tTime(); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40821);assertParse(parser, "T10:20:30.400999999Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40822);assertParse(parser, "T10:20:30.400Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40823);assertParse(parser, "T10:20:30.40Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40824);assertParse(parser, "T10:20:30.4Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40825);assertParse(parser, "T5:6:7.8Z", new DateTime(1970, 1, 1, 5, 6, 7, 800)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40826);assertParse(parser, false, "T10:20.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40827);assertParse(parser, false, "T102.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40828);assertParse(parser, false, "T10.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40829);assertParse(parser, false, "T1.400Z"); 
 }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}} 


public void test_ordinalDateTime951() {__CLR4_4_1vbovbolc8axf4f.R.globalSliceStart(getClass().getName(),40830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f8k6kdvi6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vbovbolc8axf4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vbovbolc8axf4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_ordinalDateTime951",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f8k6kdvi6(){try{__CLR4_4_1vbovbolc8axf4f.R.inc(40830); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40831);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40832);DateTimeFormatter parser = ISODateTimeFormat.ordinalDateTime(); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40833);assertParse(parser, "2006-123T10:20:30.400999999Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40834);assertParse(parser, "2006-123T10:20:30.400Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40835);assertParse(parser, "2006-123T10:20:30.40Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40836);assertParse(parser, "2006-123T10:20:30.4Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40837);assertParse(parser, "2006-12T10:20:30.400Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(12)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40838);assertParse(parser, "2006-1T10:20:30.400Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(1)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40839);assertParse(parser, "2006-123T5:6:7.800Z", new DateTime(2006, 1, 1, 5, 6, 7, 800).withDayOfYear(123)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40840);assertParse(parser, false, "2006-T10:20:30.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40841);assertParse(parser, false, "2006T10:20:30.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40842);assertParse(parser, false, "2006-123T10:20.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40843);assertParse(parser, false, "2006-123T10:2.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40844);assertParse(parser, false, "2006-123T10.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40845);assertParse(parser, false, "2006-123T1.400Z"); 
 }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}} 


public void test_time988() {__CLR4_4_1vbovbolc8axf4f.R.globalSliceStart(getClass().getName(),40846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pauji2vim();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vbovbolc8axf4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vbovbolc8axf4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_time988",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40846,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pauji2vim(){try{__CLR4_4_1vbovbolc8axf4f.R.inc(40846); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40847);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40848);DateTimeFormatter parser = ISODateTimeFormat.time(); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40849);assertParse(parser, "10:20:30.400999999Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40850);assertParse(parser, "10:20:30.400Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40851);assertParse(parser, "10:20:30.40Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40852);assertParse(parser, "10:20:30.4Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40853);assertParse(parser, "5:6:7.8Z", new DateTime(1970, 1, 1, 5, 6, 7, 800)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40854);assertParse(parser, false, "10:20.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40855);assertParse(parser, false, "10:2.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40856);assertParse(parser, false, "10.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40857);assertParse(parser, false, "1.400Z"); 
 }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}} 


public void test_localDateParser1082() {__CLR4_4_1vbovbolc8axf4f.R.globalSliceStart(getClass().getName(),40858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1odkpudviy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vbovbolc8axf4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vbovbolc8axf4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_localDateParser1082",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1odkpudviy(){try{__CLR4_4_1vbovbolc8axf4f.R.inc(40858); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40859);DateTimeFormatter parser = ISODateTimeFormat.localDateParser(); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40860);assertEquals(DateTimeZone.UTC, parser.getZone()); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40861);assertParse(parser, true, "2006-06-09"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40862);assertParse(parser, true, "2006-W27-3"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40863);assertParse(parser, true, "2006-123"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40864);assertParse(parser, false, "2006-06-09T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40865);assertParse(parser, false, "2006-W27-3T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40866);assertParse(parser, false, "2006-123T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40867);assertParse(parser, false, "2006-06-09T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40868);assertParse(parser, false, "2006-W27-3T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40869);assertParse(parser, false, "2006-123T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40870);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40871);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40872);assertParse(parser, false, "2006-123T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40873);assertParse(parser, false, "T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40874);assertParse(parser, false, "T10.5"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40875);assertParse(parser, false, "T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40876);assertParse(parser, false, "T10.5+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40877);assertParse(parser, false, "10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40878);assertParse(parser, false, "10.5"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40879);assertParse(parser, false, "10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40880);assertParse(parser, false, "10.5+02:00"); 
 }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}} 


public void test_localTimeParser1118() {__CLR4_4_1vbovbolc8axf4f.R.globalSliceStart(getClass().getName(),40881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xth5ncvjl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vbovbolc8axf4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vbovbolc8axf4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_localTimeParser1118",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40881,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xth5ncvjl(){try{__CLR4_4_1vbovbolc8axf4f.R.inc(40881); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40882);DateTimeFormatter parser = ISODateTimeFormat.localTimeParser(); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40883);assertEquals(DateTimeZone.UTC, parser.getZone()); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40884);assertParse(parser, false, "2006-06-09"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40885);assertParse(parser, false, "2006-W27-3"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40886);assertParse(parser, false, "2006-123"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40887);assertParse(parser, false, "2006-06-09T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40888);assertParse(parser, false, "2006-W27-3T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40889);assertParse(parser, false, "2006-123T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40890);assertParse(parser, false, "2006-06-09T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40891);assertParse(parser, false, "2006-W27-3T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40892);assertParse(parser, false, "2006-123T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40893);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40894);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40895);assertParse(parser, false, "2006-123T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40896);assertParse(parser, true, "T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40897);assertParse(parser, true, "T10.5"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40898);assertParse(parser, false, "T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40899);assertParse(parser, false, "T10.5+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40900);assertParse(parser, true, "10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40901);assertParse(parser, true, "10.5"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40902);assertParse(parser, false, "10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40903);assertParse(parser, false, "10.5+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40904);assertParse(parser, true, "00:00:10.512345678"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40905);assertEquals(10512, parser.parseMillis("00:00:10.512345678")); 
 }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}} 


public void test_dateOptionalTimeParser1142() {__CLR4_4_1vbovbolc8axf4f.R.globalSliceStart(getClass().getName(),40906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18570esvka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vbovbolc8axf4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vbovbolc8axf4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_dateOptionalTimeParser1142",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18570esvka(){try{__CLR4_4_1vbovbolc8axf4f.R.inc(40906); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40907);DateTimeFormatter parser = ISODateTimeFormat.dateOptionalTimeParser(); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40908);assertParse(parser, true, "2006-06-09"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40909);assertParse(parser, true, "2006-W27-3"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40910);assertParse(parser, true, "2006-123"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40911);assertParse(parser, true, "2006-06-09T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40912);assertParse(parser, true, "2006-W27-3T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40913);assertParse(parser, true, "2006-123T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40914);assertParse(parser, true, "2006-06-09T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40915);assertParse(parser, true, "2006-W27-3T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40916);assertParse(parser, true, "2006-123T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40917);assertParse(parser, true, "2006-06-09T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40918);assertParse(parser, true, "2006-W27-3T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40919);assertParse(parser, true, "2006-123T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40920);assertParse(parser, false, "T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40921);assertParse(parser, false, "T10.5"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40922);assertParse(parser, false, "T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40923);assertParse(parser, false, "T10.5+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40924);assertParse(parser, false, "10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40925);assertParse(parser, false, "10.5"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40926);assertParse(parser, false, "10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40927);assertParse(parser, false, "10.5+02:00"); 
 }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}} 


public void test_basicTime1184() {__CLR4_4_1vbovbolc8axf4f.R.globalSliceStart(getClass().getName(),40928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zldchvkw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vbovbolc8axf4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vbovbolc8axf4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicTime1184",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40928,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zldchvkw(){try{__CLR4_4_1vbovbolc8axf4f.R.inc(40928); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40929);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40930);DateTimeFormatter parser = ISODateTimeFormat.basicTime(); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40931);assertParse(parser, "102030.400999999Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40932);assertParse(parser, "102030.400Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40933);assertParse(parser, "102030.40Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40934);assertParse(parser, "102030.4Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40935);assertParse(parser, false, "10203.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40936);assertParse(parser, false, "1020.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40937);assertParse(parser, false, "102.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40938);assertParse(parser, false, "10.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40939);assertParse(parser, false, "1.400Z"); 
 }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}} 


public void test_dateTime1316() {__CLR4_4_1vbovbolc8axf4f.R.globalSliceStart(getClass().getName(),40940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vxymzavl8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vbovbolc8axf4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vbovbolc8axf4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_dateTime1316",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vxymzavl8(){try{__CLR4_4_1vbovbolc8axf4f.R.inc(40940); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40941);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40942);DateTimeFormatter parser = ISODateTimeFormat.dateTime(); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40943);assertParse(parser, "2006-02-04T10:20:30.400999999Z", new DateTime(2006, 2, 4, 10, 20, 30, 400)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40944);assertParse(parser, "2006-02-04T10:20:30.400Z", new DateTime(2006, 2, 4, 10, 20, 30, 400)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40945);assertParse(parser, "2006-02-04T10:20:30.40Z", new DateTime(2006, 2, 4, 10, 20, 30, 400)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40946);assertParse(parser, "2006-02-04T10:20:30.4Z", new DateTime(2006, 2, 4, 10, 20, 30, 400)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40947);assertParse(parser, "2006-02-4T10:20:30.400Z", new DateTime(2006, 2, 4, 10, 20, 30, 400)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40948);assertParse(parser, "2006-2-04T10:20:30.400Z", new DateTime(2006, 2, 4, 10, 20, 30, 400)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40949);assertParse(parser, "2006-2-4T10:20:30.400Z", new DateTime(2006, 2, 4, 10, 20, 30, 400)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40950);assertParse(parser, "2006-02-04T5:6:7.800Z", new DateTime(2006, 2, 4, 5, 6, 7, 800)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40951);assertParse(parser, false, "2006-02-T10:20:30.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40952);assertParse(parser, false, "2006-12T10:20:30.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40953);assertParse(parser, false, "2006-1T10:20:30.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40954);assertParse(parser, false, "2006T10:20:30.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40955);assertParse(parser, false, "200T10:20:30.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40956);assertParse(parser, false, "20T10:20:30.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40957);assertParse(parser, false, "2T10:20:30.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40958);assertParse(parser, false, "2006-02-04T10:20.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40959);assertParse(parser, false, "2006-02-04T10:2.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40960);assertParse(parser, false, "2006-02-04T10.400Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40961);assertParse(parser, false, "2006-02-04T1.400Z"); 
 }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}} 


public void test_localDateOptionalTimeParser1340() {__CLR4_4_1vbovbolc8axf4f.R.globalSliceStart(getClass().getName(),40962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rwlgdfvlu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vbovbolc8axf4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vbovbolc8axf4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_localDateOptionalTimeParser1340",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40962,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rwlgdfvlu(){try{__CLR4_4_1vbovbolc8axf4f.R.inc(40962); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40963);DateTimeFormatter parser = ISODateTimeFormat.localDateOptionalTimeParser(); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40964);assertEquals(DateTimeZone.UTC, parser.getZone()); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40965);assertParse(parser, true, "2006-06-09"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40966);assertParse(parser, true, "2006-W27-3"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40967);assertParse(parser, true, "2006-123"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40968);assertParse(parser, false, "2006-06-09T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40969);assertParse(parser, false, "2006-W27-3T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40970);assertParse(parser, false, "2006-123T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40971);assertParse(parser, true, "2006-06-09T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40972);assertParse(parser, true, "2006-W27-3T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40973);assertParse(parser, true, "2006-123T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40974);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40975);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40976);assertParse(parser, false, "2006-123T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40977);assertParse(parser, false, "T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40978);assertParse(parser, false, "T10.5"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40979);assertParse(parser, false, "T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40980);assertParse(parser, false, "T10.5+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40981);assertParse(parser, false, "10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40982);assertParse(parser, false, "10.5"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40983);assertParse(parser, false, "10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40984);assertParse(parser, false, "10.5+02:00"); 
 }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}} 


public void test_timeParser1362() {__CLR4_4_1vbovbolc8axf4f.R.globalSliceStart(getClass().getName(),40985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n4jae6vmh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vbovbolc8axf4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vbovbolc8axf4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_timeParser1362",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40985,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n4jae6vmh(){try{__CLR4_4_1vbovbolc8axf4f.R.inc(40985); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40986);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40987);DateTimeFormatter parser = ISODateTimeFormat.timeParser(); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40988);assertParse(parser, false, "2006-06-09"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40989);assertParse(parser, false, "2006-W27-3"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40990);assertParse(parser, false, "2006-123"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40991);assertParse(parser, false, "2006-06-09T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40992);assertParse(parser, false, "2006-W27-3T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40993);assertParse(parser, false, "2006-123T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40994);assertParse(parser, false, "2006-06-09T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40995);assertParse(parser, false, "2006-W27-3T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40996);assertParse(parser, false, "2006-123T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40997);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40998);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(40999);assertParse(parser, false, "2006-123T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41000);assertParse(parser, "T10:20:30.040000000", new DateTime(1970, 1, 1, 10, 20, 30, 40)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41001);assertParse(parser, "T10:20:30.004", new DateTime(1970, 1, 1, 10, 20, 30, 4)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41002);assertParse(parser, "T10:20:30.040", new DateTime(1970, 1, 1, 10, 20, 30, 40)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41003);assertParse(parser, "T10:20:30.400", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41004);assertParse(parser, "T10.5", new DateTime(1970, 1, 1, 10, 30, 0, 0)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41005);assertParse(parser, "T10:20:30.040+02:00", new DateTime(1970, 1, 1, 8, 20, 30, 40)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41006);assertParse(parser, "T10.5+02:00", new DateTime(1970, 1, 1, 8, 30, 0, 0)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41007);assertParse(parser, true, "10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41008);assertParse(parser, true, "10.5"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41009);assertParse(parser, true, "10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41010);assertParse(parser, true, "10.5+02:00"); 
 }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}} 


public void test_dateParser1398() {__CLR4_4_1vbovbolc8axf4f.R.globalSliceStart(getClass().getName(),41011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ozetb6vn7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vbovbolc8axf4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vbovbolc8axf4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_dateParser1398",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41011,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ozetb6vn7(){try{__CLR4_4_1vbovbolc8axf4f.R.inc(41011); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41012);DateTimeFormatter parser = ISODateTimeFormat.dateParser(); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41013);assertParse(parser, true, "2006-06-09"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41014);assertParse(parser, true, "2006-W27-3"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41015);assertParse(parser, true, "2006-123"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41016);assertParse(parser, true, "2006-06-09T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41017);assertParse(parser, true, "2006-W27-3T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41018);assertParse(parser, true, "2006-123T+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41019);assertParse(parser, false, "2006-06-09T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41020);assertParse(parser, false, "2006-W27-3T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41021);assertParse(parser, false, "2006-123T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41022);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41023);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41024);assertParse(parser, false, "2006-123T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41025);assertParse(parser, false, "T10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41026);assertParse(parser, false, "T10.5"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41027);assertParse(parser, false, "T10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41028);assertParse(parser, false, "T10.5+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41029);assertParse(parser, false, "10:20:30.040"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41030);assertParse(parser, false, "10.5"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41031);assertParse(parser, false, "10:20:30.040+02:00"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41032);assertParse(parser, false, "10.5+02:00"); 
 }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}} 


public void test_weekDateTimeNoMillis1415() {__CLR4_4_1vbovbolc8axf4f.R.globalSliceStart(getClass().getName(),41033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dlwdshvnt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vbovbolc8axf4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vbovbolc8axf4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_weekDateTimeNoMillis1415",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41033,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dlwdshvnt(){try{__CLR4_4_1vbovbolc8axf4f.R.inc(41033); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41034);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41035);DateTimeFormatter parser = ISODateTimeFormat.weekDateTimeNoMillis(); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41036);assertParse(parser, "2006-W27-3T10:20:30Z", new DateTime(2006, 6, 1, 10, 20, 30, 0).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41037);assertParse(parser, "2006-W2-3T10:20:30Z", new DateTime(2006, 6, 1, 10, 20, 30, 0).withWeekOfWeekyear(2).withDayOfWeek(3)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41038);assertParse(parser, "2006-W27-3T5:6:7Z", new DateTime(2006, 6, 1, 5, 6, 7, 0).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41039);assertParse(parser, false, "2006-W27-T10:20:30Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41040);assertParse(parser, false, "2006-W27T10:20:30Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41041);assertParse(parser, false, "2006-W2T10:20:30Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41042);assertParse(parser, false, "2006-W-3T10:20:30Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41043);assertParse(parser, false, "2006-W27-3T10:20Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41044);assertParse(parser, false, "2006-W27-3T10:2Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41045);assertParse(parser, false, "2006-W27-3T10Z"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41046);assertParse(parser, false, "2006-W27-3T1Z"); 
 }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}} 


public void test_basicDate1489() {__CLR4_4_1vbovbolc8axf4f.R.globalSliceStart(getClass().getName(),41047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f75mlivo7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vbovbolc8axf4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vbovbolc8axf4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicDate1489",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41047,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f75mlivo7(){try{__CLR4_4_1vbovbolc8axf4f.R.inc(41047); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41048);DateTimeFormatter parser = ISODateTimeFormat.basicDate(); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41049);assertParse(parser, "20060204", new DateTime(2006, 2, 4, 0, 0, 0, 0)); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41050);assertParse(parser, false, "2006024"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41051);assertParse(parser, false, "200602"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41052);assertParse(parser, false, "20061"); 
     __CLR4_4_1vbovbolc8axf4f.R.inc(41053);assertParse(parser, false, "2006"); 
 }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}} 

    

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
    private void assertParse(DateTimeFormatter parser, boolean expected, String str) {try{__CLR4_4_1vbovbolc8axf4f.R.inc(41054);
        __CLR4_4_1vbovbolc8axf4f.R.inc(41055);if ((((expected)&&(__CLR4_4_1vbovbolc8axf4f.R.iget(41056)!=0|true))||(__CLR4_4_1vbovbolc8axf4f.R.iget(41057)==0&false))) {{
            __CLR4_4_1vbovbolc8axf4f.R.inc(41058);parser.parseMillis(str);
        } }else {{
            __CLR4_4_1vbovbolc8axf4f.R.inc(41059);try {
                __CLR4_4_1vbovbolc8axf4f.R.inc(41060);parser.parseMillis(str);
                __CLR4_4_1vbovbolc8axf4f.R.inc(41061);fail();
            } catch (IllegalArgumentException ex) {
                // expected
            }
        }
    }}finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}}

    private void assertParse(DateTimeFormatter parser, String str, DateTime expected) {try{__CLR4_4_1vbovbolc8axf4f.R.inc(41062);
        __CLR4_4_1vbovbolc8axf4f.R.inc(41063);DateTime dt = parser.parseDateTime(str);
        __CLR4_4_1vbovbolc8axf4f.R.inc(41064);assertEquals(expected, dt);
    }finally{__CLR4_4_1vbovbolc8axf4f.R.flushNeeded();}}

}
