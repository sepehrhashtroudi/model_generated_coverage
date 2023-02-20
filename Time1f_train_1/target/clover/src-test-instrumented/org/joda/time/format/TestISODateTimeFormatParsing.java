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
public class TestISODateTimeFormatParsing extends TestCase {static class __CLR4_4_1tn8tn8le6qeasy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,38806,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38420);
        __CLR4_4_1tn8tn8le6qeasy.R.inc(38421);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38422);
        __CLR4_4_1tn8tn8le6qeasy.R.inc(38423);return new TestSuite(TestISODateTimeFormatParsing.class);
    }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}}

    public TestISODateTimeFormatParsing(String name) {
        super(name);__CLR4_4_1tn8tn8le6qeasy.R.inc(38425);try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38424);
    }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38426);
        __CLR4_4_1tn8tn8le6qeasy.R.inc(38427);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1tn8tn8le6qeasy.R.inc(38428);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1tn8tn8le6qeasy.R.inc(38429);originalLocale = Locale.getDefault();
        __CLR4_4_1tn8tn8le6qeasy.R.inc(38430);DateTimeZone.setDefault(DateTimeZone.forID("Europe/London"));
        __CLR4_4_1tn8tn8le6qeasy.R.inc(38431);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1tn8tn8le6qeasy.R.inc(38432);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38433);
        __CLR4_4_1tn8tn8le6qeasy.R.inc(38434);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1tn8tn8le6qeasy.R.inc(38435);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1tn8tn8le6qeasy.R.inc(38436);Locale.setDefault(originalLocale);
        __CLR4_4_1tn8tn8le6qeasy.R.inc(38437);originalDateTimeZone = null;
        __CLR4_4_1tn8tn8le6qeasy.R.inc(38438);originalTimeZone = null;
        __CLR4_4_1tn8tn8le6qeasy.R.inc(38439);originalLocale = null;
    }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_dateElementParser194() {__CLR4_4_1tn8tn8le6qeasy.R.globalSliceStart(getClass().getName(),38440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kxo3kjtns();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tn8tn8le6qeasy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tn8tn8le6qeasy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_dateElementParser194",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kxo3kjtns(){try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38440); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38441);DateTimeFormatter parser = ISODateTimeFormat.dateElementParser(); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38442);assertParse(parser, "2006-06-09", new DateTime(2006, 6, 9, 0, 0, 0, 0)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38443);assertParse(parser, "2006-06-9", new DateTime(2006, 6, 9, 0, 0, 0, 0)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38444);assertParse(parser, "2006-6-09", new DateTime(2006, 6, 9, 0, 0, 0, 0)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38445);assertParse(parser, "2006-6-9", new DateTime(2006, 6, 9, 0, 0, 0, 0)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38446);assertParse(parser, true, "2006-W27-3"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38447);assertParse(parser, true, "2006-123"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38448);assertParse(parser, false, "2006-06-09T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38449);assertParse(parser, false, "2006-W27-3T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38450);assertParse(parser, false, "2006-123T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38451);assertParse(parser, false, "2006-06-09T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38452);assertParse(parser, false, "2006-W27-3T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38453);assertParse(parser, false, "2006-123T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38454);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38455);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38456);assertParse(parser, false, "2006-123T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38457);assertParse(parser, false, "T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38458);assertParse(parser, false, "T10.5"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38459);assertParse(parser, false, "T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38460);assertParse(parser, false, "T10.5+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38461);assertParse(parser, false, "10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38462);assertParse(parser, false, "10.5"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38463);assertParse(parser, false, "10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38464);assertParse(parser, false, "10.5+02:00"); 
 }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}} 


public void test_basicOrdinalDateTime606() {__CLR4_4_1tn8tn8le6qeasy.R.globalSliceStart(getClass().getName(),38465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1az3c60toh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tn8tn8le6qeasy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tn8tn8le6qeasy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicOrdinalDateTime606",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38465,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1az3c60toh(){try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38465); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38466);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38467);DateTimeFormatter parser = ISODateTimeFormat.basicOrdinalDateTime(); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38468);assertParse(parser, "2006123T102030.400999999Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38469);assertParse(parser, "2006123T102030.400Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38470);assertParse(parser, "2006123T102030.40Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38471);assertParse(parser, "2006123T102030.4Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38472);assertParse(parser, false, "200612T102030.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38473);assertParse(parser, false, "20061T102030.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38474);assertParse(parser, false, "2006T102030.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38475);assertParse(parser, false, "200T102030.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38476);assertParse(parser, false, "20T102030.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38477);assertParse(parser, false, "2T102030.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38478);assertParse(parser, false, "2006123T10203.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38479);assertParse(parser, false, "2006123T1020.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38480);assertParse(parser, false, "2006123T102.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38481);assertParse(parser, false, "2006123T10.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38482);assertParse(parser, false, "2006123T1.400Z"); 
 }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}} 


public void test_dateParser854() {__CLR4_4_1tn8tn8le6qeasy.R.globalSliceStart(getClass().getName(),38483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l2t2bgtoz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tn8tn8le6qeasy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tn8tn8le6qeasy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_dateParser854",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l2t2bgtoz(){try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38483); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38484);DateTimeFormatter parser = ISODateTimeFormat.dateParser(); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38485);assertParse(parser, true, "2006-06-09"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38486);assertParse(parser, true, "2006-W27-3"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38487);assertParse(parser, true, "2006-123"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38488);assertParse(parser, true, "2006-06-09T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38489);assertParse(parser, true, "2006-W27-3T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38490);assertParse(parser, true, "2006-123T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38491);assertParse(parser, false, "2006-06-09T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38492);assertParse(parser, false, "2006-W27-3T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38493);assertParse(parser, false, "2006-123T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38494);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38495);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38496);assertParse(parser, false, "2006-123T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38497);assertParse(parser, false, "T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38498);assertParse(parser, false, "T10.5"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38499);assertParse(parser, false, "T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38500);assertParse(parser, false, "T10.5+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38501);assertParse(parser, false, "10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38502);assertParse(parser, false, "10.5"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38503);assertParse(parser, false, "10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38504);assertParse(parser, false, "10.5+02:00"); 
 }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}} 


public void test_localDateParser855() {__CLR4_4_1tn8tn8le6qeasy.R.globalSliceStart(getClass().getName(),38505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19gfspgtpl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tn8tn8le6qeasy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tn8tn8le6qeasy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_localDateParser855",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19gfspgtpl(){try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38505); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38506);DateTimeFormatter parser = ISODateTimeFormat.localDateParser(); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38507);assertEquals(DateTimeZone.UTC, parser.getZone()); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38508);assertParse(parser, true, "2006-06-09"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38509);assertParse(parser, true, "2006-W27-3"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38510);assertParse(parser, true, "2006-123"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38511);assertParse(parser, false, "2006-06-09T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38512);assertParse(parser, false, "2006-W27-3T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38513);assertParse(parser, false, "2006-123T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38514);assertParse(parser, false, "2006-06-09T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38515);assertParse(parser, false, "2006-W27-3T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38516);assertParse(parser, false, "2006-123T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38517);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38518);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38519);assertParse(parser, false, "2006-123T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38520);assertParse(parser, false, "T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38521);assertParse(parser, false, "T10.5"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38522);assertParse(parser, false, "T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38523);assertParse(parser, false, "T10.5+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38524);assertParse(parser, false, "10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38525);assertParse(parser, false, "10.5"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38526);assertParse(parser, false, "10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38527);assertParse(parser, false, "10.5+02:00"); 
 }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}} 


public void test_timeParser856() {__CLR4_4_1tn8tn8le6qeasy.R.globalSliceStart(getClass().getName(),38528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n8ixd3tq8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tn8tn8le6qeasy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tn8tn8le6qeasy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_timeParser856",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n8ixd3tq8(){try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38528); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38529);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38530);DateTimeFormatter parser = ISODateTimeFormat.timeParser(); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38531);assertParse(parser, false, "2006-06-09"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38532);assertParse(parser, false, "2006-W27-3"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38533);assertParse(parser, false, "2006-123"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38534);assertParse(parser, false, "2006-06-09T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38535);assertParse(parser, false, "2006-W27-3T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38536);assertParse(parser, false, "2006-123T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38537);assertParse(parser, false, "2006-06-09T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38538);assertParse(parser, false, "2006-W27-3T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38539);assertParse(parser, false, "2006-123T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38540);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38541);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38542);assertParse(parser, false, "2006-123T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38543);assertParse(parser, "T10:20:30.040000000", new DateTime(1970, 1, 1, 10, 20, 30, 40)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38544);assertParse(parser, "T10:20:30.004", new DateTime(1970, 1, 1, 10, 20, 30, 4)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38545);assertParse(parser, "T10:20:30.040", new DateTime(1970, 1, 1, 10, 20, 30, 40)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38546);assertParse(parser, "T10:20:30.400", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38547);assertParse(parser, "T10.5", new DateTime(1970, 1, 1, 10, 30, 0, 0)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38548);assertParse(parser, "T10:20:30.040+02:00", new DateTime(1970, 1, 1, 8, 20, 30, 40)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38549);assertParse(parser, "T10.5+02:00", new DateTime(1970, 1, 1, 8, 30, 0, 0)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38550);assertParse(parser, true, "10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38551);assertParse(parser, true, "10.5"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38552);assertParse(parser, true, "10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38553);assertParse(parser, true, "10.5+02:00"); 
 }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}} 


public void test_localTimeParser857() {__CLR4_4_1tn8tn8le6qeasy.R.globalSliceStart(getClass().getName(),38554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h9c9l5tqy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tn8tn8le6qeasy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tn8tn8le6qeasy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_localTimeParser857",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h9c9l5tqy(){try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38554); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38555);DateTimeFormatter parser = ISODateTimeFormat.localTimeParser(); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38556);assertEquals(DateTimeZone.UTC, parser.getZone()); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38557);assertParse(parser, false, "2006-06-09"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38558);assertParse(parser, false, "2006-W27-3"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38559);assertParse(parser, false, "2006-123"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38560);assertParse(parser, false, "2006-06-09T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38561);assertParse(parser, false, "2006-W27-3T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38562);assertParse(parser, false, "2006-123T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38563);assertParse(parser, false, "2006-06-09T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38564);assertParse(parser, false, "2006-W27-3T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38565);assertParse(parser, false, "2006-123T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38566);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38567);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38568);assertParse(parser, false, "2006-123T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38569);assertParse(parser, true, "T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38570);assertParse(parser, true, "T10.5"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38571);assertParse(parser, false, "T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38572);assertParse(parser, false, "T10.5+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38573);assertParse(parser, true, "10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38574);assertParse(parser, true, "10.5"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38575);assertParse(parser, false, "10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38576);assertParse(parser, false, "10.5+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38577);assertParse(parser, true, "00:00:10.512345678"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38578);assertEquals(10512, parser.parseMillis("00:00:10.512345678")); 
 }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}} 


public void test_timeElementParser858() {__CLR4_4_1tn8tn8le6qeasy.R.globalSliceStart(getClass().getName(),38579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13sym2ptrn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tn8tn8le6qeasy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tn8tn8le6qeasy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_timeElementParser858",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38579,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13sym2ptrn(){try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38579); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38580);DateTimeFormatter parser = ISODateTimeFormat.timeElementParser(); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38581);assertParse(parser, false, "2006-06-09"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38582);assertParse(parser, false, "2006-W27-3"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38583);assertParse(parser, false, "2006-123"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38584);assertParse(parser, false, "2006-06-09T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38585);assertParse(parser, false, "2006-W27-3T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38586);assertParse(parser, false, "2006-123T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38587);assertParse(parser, false, "2006-06-09T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38588);assertParse(parser, false, "2006-W27-3T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38589);assertParse(parser, false, "2006-123T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38590);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38591);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38592);assertParse(parser, false, "2006-123T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38593);assertParse(parser, false, "T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38594);assertParse(parser, false, "T10.5"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38595);assertParse(parser, false, "T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38596);assertParse(parser, false, "T10.5+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38597);assertParse(parser, true, "10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38598);assertParse(parser, true, "10.5"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38599);assertParse(parser, false, "10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38600);assertParse(parser, false, "10.5+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38601);assertParse(parser, true, "00:00:10.512345678"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38602);assertEquals(10512, parser.parseMillis("00:00:10.512345678") + DateTimeZone.getDefault().getOffset(0L)); 
 }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}} 


public void test_dateTimeParser859() {__CLR4_4_1tn8tn8le6qeasy.R.globalSliceStart(getClass().getName(),38603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18wwev0tsb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tn8tn8le6qeasy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tn8tn8le6qeasy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_dateTimeParser859",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18wwev0tsb(){try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38603); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38604);DateTimeFormatter parser = ISODateTimeFormat.dateTimeParser(); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38605);assertParse(parser, true, "2006-06-09"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38606);assertParse(parser, true, "2006-W27-3"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38607);assertParse(parser, true, "2006-123"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38608);assertParse(parser, true, "2006-06-09T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38609);assertParse(parser, true, "2006-W27-3T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38610);assertParse(parser, true, "2006-123T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38611);assertParse(parser, true, "2006-06-09T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38612);assertParse(parser, true, "2006-W27-3T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38613);assertParse(parser, true, "2006-123T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38614);assertParse(parser, true, "2006-06-09T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38615);assertParse(parser, true, "2006-W27-3T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38616);assertParse(parser, true, "2006-123T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38617);assertParse(parser, true, "T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38618);assertParse(parser, true, "T10.5"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38619);assertParse(parser, true, "T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38620);assertParse(parser, true, "T10.5+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38621);assertParse(parser, false, "10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38622);assertParse(parser, false, "10.5"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38623);assertParse(parser, false, "10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38624);assertParse(parser, false, "10.5+02:00"); 
 }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}} 


public void test_dateOptionalTimeParser860() {__CLR4_4_1tn8tn8le6qeasy.R.globalSliceStart(getClass().getName(),38625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_190s0lutsx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tn8tn8le6qeasy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tn8tn8le6qeasy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_dateOptionalTimeParser860",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38625,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_190s0lutsx(){try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38625); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38626);DateTimeFormatter parser = ISODateTimeFormat.dateOptionalTimeParser(); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38627);assertParse(parser, true, "2006-06-09"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38628);assertParse(parser, true, "2006-W27-3"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38629);assertParse(parser, true, "2006-123"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38630);assertParse(parser, true, "2006-06-09T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38631);assertParse(parser, true, "2006-W27-3T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38632);assertParse(parser, true, "2006-123T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38633);assertParse(parser, true, "2006-06-09T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38634);assertParse(parser, true, "2006-W27-3T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38635);assertParse(parser, true, "2006-123T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38636);assertParse(parser, true, "2006-06-09T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38637);assertParse(parser, true, "2006-W27-3T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38638);assertParse(parser, true, "2006-123T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38639);assertParse(parser, false, "T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38640);assertParse(parser, false, "T10.5"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38641);assertParse(parser, false, "T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38642);assertParse(parser, false, "T10.5+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38643);assertParse(parser, false, "10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38644);assertParse(parser, false, "10.5"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38645);assertParse(parser, false, "10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38646);assertParse(parser, false, "10.5+02:00"); 
 }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}} 


public void test_localDateOptionalTimeParser861() {__CLR4_4_1tn8tn8le6qeasy.R.globalSliceStart(getClass().getName(),38647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fiiixqttj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tn8tn8le6qeasy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tn8tn8le6qeasy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_localDateOptionalTimeParser861",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fiiixqttj(){try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38647); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38648);DateTimeFormatter parser = ISODateTimeFormat.localDateOptionalTimeParser(); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38649);assertEquals(DateTimeZone.UTC, parser.getZone()); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38650);assertParse(parser, true, "2006-06-09"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38651);assertParse(parser, true, "2006-W27-3"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38652);assertParse(parser, true, "2006-123"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38653);assertParse(parser, false, "2006-06-09T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38654);assertParse(parser, false, "2006-W27-3T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38655);assertParse(parser, false, "2006-123T+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38656);assertParse(parser, true, "2006-06-09T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38657);assertParse(parser, true, "2006-W27-3T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38658);assertParse(parser, true, "2006-123T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38659);assertParse(parser, false, "2006-06-09T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38660);assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38661);assertParse(parser, false, "2006-123T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38662);assertParse(parser, false, "T10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38663);assertParse(parser, false, "T10.5"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38664);assertParse(parser, false, "T10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38665);assertParse(parser, false, "T10.5+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38666);assertParse(parser, false, "10:20:30.040"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38667);assertParse(parser, false, "10.5"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38668);assertParse(parser, false, "10:20:30.040+02:00"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38669);assertParse(parser, false, "10.5+02:00"); 
 }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}} 


public void test_tTime863() {__CLR4_4_1tn8tn8le6qeasy.R.globalSliceStart(getClass().getName(),38670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qoh7tktu6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tn8tn8le6qeasy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tn8tn8le6qeasy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_tTime863",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qoh7tktu6(){try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38670); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38671);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38672);DateTimeFormatter parser = ISODateTimeFormat.tTime(); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38673);assertParse(parser, "T10:20:30.400999999Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38674);assertParse(parser, "T10:20:30.400Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38675);assertParse(parser, "T10:20:30.40Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38676);assertParse(parser, "T10:20:30.4Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38677);assertParse(parser, "T5:6:7.8Z", new DateTime(1970, 1, 1, 5, 6, 7, 800)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38678);assertParse(parser, false, "T10:20.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38679);assertParse(parser, false, "T102.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38680);assertParse(parser, false, "T10.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38681);assertParse(parser, false, "T1.400Z"); 
 }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}} 


public void test_ordinalDate865() {__CLR4_4_1tn8tn8le6qeasy.R.globalSliceStart(getClass().getName(),38682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrdd58tui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tn8tn8le6qeasy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tn8tn8le6qeasy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_ordinalDate865",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38682,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrdd58tui(){try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38682); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38683);DateTimeFormatter parser = ISODateTimeFormat.ordinalDate(); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38684);assertParse(parser, "2006-123", new DateTime(2006, 1, 1, 0, 0, 0, 0).withDayOfYear(123)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38685);assertParse(parser, "2006-12", new DateTime(2006, 1, 1, 0, 0, 0, 0).withDayOfYear(12)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38686);assertParse(parser, "2006-1", new DateTime(2006, 1, 1, 0, 0, 0, 0).withDayOfYear(1)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38687);assertParse(parser, false, "2006-"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38688);assertParse(parser, false, "2006"); 
 }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}} 


public void test_ordinalDateTime866() {__CLR4_4_1tn8tn8le6qeasy.R.globalSliceStart(getClass().getName(),38689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17oug1stup();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tn8tn8le6qeasy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tn8tn8le6qeasy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_ordinalDateTime866",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17oug1stup(){try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38689); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38690);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38691);DateTimeFormatter parser = ISODateTimeFormat.ordinalDateTime(); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38692);assertParse(parser, "2006-123T10:20:30.400999999Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38693);assertParse(parser, "2006-123T10:20:30.400Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38694);assertParse(parser, "2006-123T10:20:30.40Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38695);assertParse(parser, "2006-123T10:20:30.4Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38696);assertParse(parser, "2006-12T10:20:30.400Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(12)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38697);assertParse(parser, "2006-1T10:20:30.400Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(1)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38698);assertParse(parser, "2006-123T5:6:7.800Z", new DateTime(2006, 1, 1, 5, 6, 7, 800).withDayOfYear(123)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38699);assertParse(parser, false, "2006-T10:20:30.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38700);assertParse(parser, false, "2006T10:20:30.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38701);assertParse(parser, false, "2006-123T10:20.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38702);assertParse(parser, false, "2006-123T10:2.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38703);assertParse(parser, false, "2006-123T10.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38704);assertParse(parser, false, "2006-123T1.400Z"); 
 }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}} 


public void test_weekDateTimeNoMillis867() {__CLR4_4_1tn8tn8le6qeasy.R.globalSliceStart(getClass().getName(),38705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lhr9i5tv5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tn8tn8le6qeasy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tn8tn8le6qeasy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_weekDateTimeNoMillis867",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lhr9i5tv5(){try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38705); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38706);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38707);DateTimeFormatter parser = ISODateTimeFormat.weekDateTimeNoMillis(); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38708);assertParse(parser, "2006-W27-3T10:20:30Z", new DateTime(2006, 6, 1, 10, 20, 30, 0).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38709);assertParse(parser, "2006-W2-3T10:20:30Z", new DateTime(2006, 6, 1, 10, 20, 30, 0).withWeekOfWeekyear(2).withDayOfWeek(3)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38710);assertParse(parser, "2006-W27-3T5:6:7Z", new DateTime(2006, 6, 1, 5, 6, 7, 0).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38711);assertParse(parser, false, "2006-W27-T10:20:30Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38712);assertParse(parser, false, "2006-W27T10:20:30Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38713);assertParse(parser, false, "2006-W2T10:20:30Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38714);assertParse(parser, false, "2006-W-3T10:20:30Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38715);assertParse(parser, false, "2006-W27-3T10:20Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38716);assertParse(parser, false, "2006-W27-3T10:2Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38717);assertParse(parser, false, "2006-W27-3T10Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38718);assertParse(parser, false, "2006-W27-3T1Z"); 
 }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}} 


public void test_basicDate868() {__CLR4_4_1tn8tn8le6qeasy.R.globalSliceStart(getClass().getName(),38719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jz6adqtvj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tn8tn8le6qeasy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tn8tn8le6qeasy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicDate868",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jz6adqtvj(){try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38719); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38720);DateTimeFormatter parser = ISODateTimeFormat.basicDate(); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38721);assertParse(parser, "20060204", new DateTime(2006, 2, 4, 0, 0, 0, 0)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38722);assertParse(parser, false, "2006024"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38723);assertParse(parser, false, "200602"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38724);assertParse(parser, false, "20061"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38725);assertParse(parser, false, "2006"); 
 }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}} 


public void test_basicTimeNoMillis869() {__CLR4_4_1tn8tn8le6qeasy.R.globalSliceStart(getClass().getName(),38726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t9umdvtvq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tn8tn8le6qeasy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tn8tn8le6qeasy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicTimeNoMillis869",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t9umdvtvq(){try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38726); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38727);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38728);DateTimeFormatter parser = ISODateTimeFormat.basicTimeNoMillis(); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38729);assertParse(parser, "102030Z", new DateTime(1970, 1, 1, 10, 20, 30, 0)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38730);assertParse(parser, false, "10203Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38731);assertParse(parser, false, "1020Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38732);assertParse(parser, false, "102Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38733);assertParse(parser, false, "10Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38734);assertParse(parser, false, "1Z"); 
 }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}} 


public void test_basicTTimeNoMillis871() {__CLR4_4_1tn8tn8le6qeasy.R.globalSliceStart(getClass().getName(),38735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c0v0xetvz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tn8tn8le6qeasy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tn8tn8le6qeasy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicTTimeNoMillis871",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c0v0xetvz(){try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38735); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38736);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38737);DateTimeFormatter parser = ISODateTimeFormat.basicTTimeNoMillis(); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38738);assertParse(parser, "T102030Z", new DateTime(1970, 1, 1, 10, 20, 30, 0)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38739);assertParse(parser, false, "T10203Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38740);assertParse(parser, false, "T1020Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38741);assertParse(parser, false, "T102Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38742);assertParse(parser, false, "T10Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38743);assertParse(parser, false, "T1Z"); 
 }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}} 


public void test_basicDateTime872() {__CLR4_4_1tn8tn8le6qeasy.R.globalSliceStart(getClass().getName(),38744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sw0s8utw8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tn8tn8le6qeasy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tn8tn8le6qeasy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicDateTime872",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38744,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sw0s8utw8(){try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38744); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38745);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38746);DateTimeFormatter parser = ISODateTimeFormat.basicDateTime(); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38747);assertParse(parser, "20061204T102030.400999999Z", new DateTime(2006, 12, 4, 10, 20, 30, 400)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38748);assertParse(parser, "20061204T102030.400Z", new DateTime(2006, 12, 4, 10, 20, 30, 400)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38749);assertParse(parser, "20061204T102030.40Z", new DateTime(2006, 12, 4, 10, 20, 30, 400)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38750);assertParse(parser, "20061204T102030.4Z", new DateTime(2006, 12, 4, 10, 20, 30, 400)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38751);assertParse(parser, false, "2006120T102030.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38752);assertParse(parser, false, "200612T102030.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38753);assertParse(parser, false, "20061T102030.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38754);assertParse(parser, false, "2006T102030.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38755);assertParse(parser, false, "200T102030.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38756);assertParse(parser, false, "20T102030.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38757);assertParse(parser, false, "2T102030.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38758);assertParse(parser, false, "20061204T10203.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38759);assertParse(parser, false, "20061204T1020.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38760);assertParse(parser, false, "20061204T102.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38761);assertParse(parser, false, "20061204T10.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38762);assertParse(parser, false, "20061204T1.400Z"); 
 }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}} 


public void test_basicOrdinalDate874() {__CLR4_4_1tn8tn8le6qeasy.R.globalSliceStart(getClass().getName(),38763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mdeqrmtwr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tn8tn8le6qeasy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tn8tn8le6qeasy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicOrdinalDate874",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mdeqrmtwr(){try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38763); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38764);DateTimeFormatter parser = ISODateTimeFormat.basicOrdinalDate(); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38765);assertParse(parser, "2006123", new DateTime(2006, 1, 1, 0, 0, 0, 0).withDayOfYear(123)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38766);assertParse(parser, false, "200612"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38767);assertParse(parser, false, "20061"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38768);assertParse(parser, false, "2006"); 
 }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}} 


public void test_basicWeekDateTime877() {__CLR4_4_1tn8tn8le6qeasy.R.globalSliceStart(getClass().getName(),38769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p4em6ntwx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tn8tn8le6qeasy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tn8tn8le6qeasy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicWeekDateTime877",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p4em6ntwx(){try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38769); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38770);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38771);DateTimeFormatter parser = ISODateTimeFormat.basicWeekDateTime(); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38772);assertParse(parser, "2006W273T102030.400999999Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38773);assertParse(parser, "2006W273T102030.400Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38774);assertParse(parser, "2006W273T102030.40Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38775);assertParse(parser, "2006W273T102030.4Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38776);assertParse(parser, false, "2006W27T102030.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38777);assertParse(parser, false, "2006W2T102030.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38778);assertParse(parser, false, "2006W273T10203.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38779);assertParse(parser, false, "2006W273T1020.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38780);assertParse(parser, false, "2006W273T102.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38781);assertParse(parser, false, "2006W273T10.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38782);assertParse(parser, false, "2006W273T1.400Z"); 
 }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}} 


public void test_time1216() {__CLR4_4_1tn8tn8le6qeasy.R.globalSliceStart(getClass().getName(),38783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vucqljtxb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tn8tn8le6qeasy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tn8tn8le6qeasy.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_time1216",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vucqljtxb(){try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38783); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38784);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38785);DateTimeFormatter parser = ISODateTimeFormat.time(); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38786);assertParse(parser, "10:20:30.400999999Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38787);assertParse(parser, "10:20:30.400Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38788);assertParse(parser, "10:20:30.40Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38789);assertParse(parser, "10:20:30.4Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38790);assertParse(parser, "5:6:7.8Z", new DateTime(1970, 1, 1, 5, 6, 7, 800)); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38791);assertParse(parser, false, "10:20.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38792);assertParse(parser, false, "10:2.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38793);assertParse(parser, false, "10.400Z"); 
     __CLR4_4_1tn8tn8le6qeasy.R.inc(38794);assertParse(parser, false, "1.400Z"); 
 }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}} 

    

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
    private void assertParse(DateTimeFormatter parser, boolean expected, String str) {try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38795);
        __CLR4_4_1tn8tn8le6qeasy.R.inc(38796);if ((((expected)&&(__CLR4_4_1tn8tn8le6qeasy.R.iget(38797)!=0|true))||(__CLR4_4_1tn8tn8le6qeasy.R.iget(38798)==0&false))) {{
            __CLR4_4_1tn8tn8le6qeasy.R.inc(38799);parser.parseMillis(str);
        } }else {{
            __CLR4_4_1tn8tn8le6qeasy.R.inc(38800);try {
                __CLR4_4_1tn8tn8le6qeasy.R.inc(38801);parser.parseMillis(str);
                __CLR4_4_1tn8tn8le6qeasy.R.inc(38802);fail();
            } catch (IllegalArgumentException ex) {
                // expected
            }
        }
    }}finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}}

    private void assertParse(DateTimeFormatter parser, String str, DateTime expected) {try{__CLR4_4_1tn8tn8le6qeasy.R.inc(38803);
        __CLR4_4_1tn8tn8le6qeasy.R.inc(38804);DateTime dt = parser.parseDateTime(str);
        __CLR4_4_1tn8tn8le6qeasy.R.inc(38805);assertEquals(expected, dt);
    }finally{__CLR4_4_1tn8tn8le6qeasy.R.flushNeeded();}}

}
