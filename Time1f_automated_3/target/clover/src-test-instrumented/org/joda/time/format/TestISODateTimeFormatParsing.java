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
public class TestISODateTimeFormatParsing extends TestCase {static class __CLR4_4_1lyklykle6np4vm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,28517,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1lyklykle6np4vm.R.inc(28460);
        __CLR4_4_1lyklykle6np4vm.R.inc(28461);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lyklykle6np4vm.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lyklykle6np4vm.R.inc(28462);
        __CLR4_4_1lyklykle6np4vm.R.inc(28463);return new TestSuite(TestISODateTimeFormatParsing.class);
    }finally{__CLR4_4_1lyklykle6np4vm.R.flushNeeded();}}

    public TestISODateTimeFormatParsing(String name) {
        super(name);__CLR4_4_1lyklykle6np4vm.R.inc(28465);try{__CLR4_4_1lyklykle6np4vm.R.inc(28464);
    }finally{__CLR4_4_1lyklykle6np4vm.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lyklykle6np4vm.R.inc(28466);
        __CLR4_4_1lyklykle6np4vm.R.inc(28467);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1lyklykle6np4vm.R.inc(28468);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1lyklykle6np4vm.R.inc(28469);originalLocale = Locale.getDefault();
        __CLR4_4_1lyklykle6np4vm.R.inc(28470);DateTimeZone.setDefault(DateTimeZone.forID("Europe/London"));
        __CLR4_4_1lyklykle6np4vm.R.inc(28471);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1lyklykle6np4vm.R.inc(28472);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1lyklykle6np4vm.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lyklykle6np4vm.R.inc(28473);
        __CLR4_4_1lyklykle6np4vm.R.inc(28474);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1lyklykle6np4vm.R.inc(28475);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1lyklykle6np4vm.R.inc(28476);Locale.setDefault(originalLocale);
        __CLR4_4_1lyklykle6np4vm.R.inc(28477);originalDateTimeZone = null;
        __CLR4_4_1lyklykle6np4vm.R.inc(28478);originalTimeZone = null;
        __CLR4_4_1lyklykle6np4vm.R.inc(28479);originalLocale = null;
    }finally{__CLR4_4_1lyklykle6np4vm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_ordinalDate368() {__CLR4_4_1lyklykle6np4vm.R.globalSliceStart(getClass().getName(),28480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wuhc52lz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lyklykle6np4vm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lyklykle6np4vm.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_ordinalDate368",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wuhc52lz4(){try{__CLR4_4_1lyklykle6np4vm.R.inc(28480); 
     __CLR4_4_1lyklykle6np4vm.R.inc(28481);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1lyklykle6np4vm.R.inc(28482);DateTimeFormatter parser = ISODateTimeFormat.ordinalDate(); 
     __CLR4_4_1lyklykle6np4vm.R.inc(28483);assertParse(parser, "2006-123T10:20:30.400999999Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1lyklykle6np4vm.R.inc(28484);assertParse(parser, "2006-123T10:20:30.400Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1lyklykle6np4vm.R.inc(28485);assertParse(parser, "2006-123T10:20:30.40Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1lyklykle6np4vm.R.inc(28486);assertParse(parser, "2006-123T10:20:30.4Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1lyklykle6np4vm.R.inc(28487);assertParse(parser, false, "2006-T10:20:30.400Z"); 
     __CLR4_4_1lyklykle6np4vm.R.inc(28488);assertParse(parser, false, "2006T10:20:30.400Z"); 
     __CLR4_4_1lyklykle6np4vm.R.inc(28489);assertParse(parser, false, "2006-123T10:20.400Z"); 
     __CLR4_4_1lyklykle6np4vm.R.inc(28490);assertParse(parser, false, "2006-123T10:2.400Z"); 
     __CLR4_4_1lyklykle6np4vm.R.inc(28491);assertParse(parser, false, "2006-123T10.400Z"); 
     __CLR4_4_1lyklykle6np4vm.R.inc(28492);assertParse(parser, false, "2006-123T10.400Z"); 
     __CLR4_4_1lyklykle6np4vm.R.inc(28493);assertParse(parser, false, "2006-123T10.400Z"); 
     __CLR4_4_1lyklykle6np4vm.R.inc(28494);assertParse(parser, false, "2006-123T102.400Z"); 
     __CLR4_4_1lyklykle6np4vm.R.inc(28495);assertParse(parser, false, "2006-123T10.400Z"); 
     __CLR4_4_1lyklykle6np4vm.R.inc(28496);assertParse(parser, false, "2006-123T1.400Z"); 
 }finally{__CLR4_4_1lyklykle6np4vm.R.flushNeeded();}}
public void test_basicTimeNoMillis370() {__CLR4_4_1lyklykle6np4vm.R.globalSliceStart(getClass().getName(),28497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i4pyn6lzl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lyklykle6np4vm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lyklykle6np4vm.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicTimeNoMillis370",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28497,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i4pyn6lzl(){try{__CLR4_4_1lyklykle6np4vm.R.inc(28497); 
     __CLR4_4_1lyklykle6np4vm.R.inc(28498);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1lyklykle6np4vm.R.inc(28499);DateTimeFormatter parser = ISODateTimeFormat.basicTimeNoMillis(); 
     __CLR4_4_1lyklykle6np4vm.R.inc(28500);assertParse(parser, "102030.400999999Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     __CLR4_4_1lyklykle6np4vm.R.inc(28501);assertParse(parser, false, "10203.400Z"); 
     __CLR4_4_1lyklykle6np4vm.R.inc(28502);assertParse(parser, false, "1020.400Z"); 
     __CLR4_4_1lyklykle6np4vm.R.inc(28503);assertParse(parser, false, "102.400Z"); 
     __CLR4_4_1lyklykle6np4vm.R.inc(28504);assertParse(parser, false, "10.400Z"); 
     __CLR4_4_1lyklykle6np4vm.R.inc(28505);assertParse(parser, false, "1.400Z"); 
 }finally{__CLR4_4_1lyklykle6np4vm.R.flushNeeded();}}
    

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
    private void assertParse(DateTimeFormatter parser, boolean expected, String str) {try{__CLR4_4_1lyklykle6np4vm.R.inc(28506);
        __CLR4_4_1lyklykle6np4vm.R.inc(28507);if ((((expected)&&(__CLR4_4_1lyklykle6np4vm.R.iget(28508)!=0|true))||(__CLR4_4_1lyklykle6np4vm.R.iget(28509)==0&false))) {{
            __CLR4_4_1lyklykle6np4vm.R.inc(28510);parser.parseMillis(str);
        } }else {{
            __CLR4_4_1lyklykle6np4vm.R.inc(28511);try {
                __CLR4_4_1lyklykle6np4vm.R.inc(28512);parser.parseMillis(str);
                __CLR4_4_1lyklykle6np4vm.R.inc(28513);fail();
            } catch (IllegalArgumentException ex) {
                // expected
            }
        }
    }}finally{__CLR4_4_1lyklykle6np4vm.R.flushNeeded();}}

    private void assertParse(DateTimeFormatter parser, String str, DateTime expected) {try{__CLR4_4_1lyklykle6np4vm.R.inc(28514);
        __CLR4_4_1lyklykle6np4vm.R.inc(28515);DateTime dt = parser.parseDateTime(str);
        __CLR4_4_1lyklykle6np4vm.R.inc(28516);assertEquals(expected, dt);
    }finally{__CLR4_4_1lyklykle6np4vm.R.flushNeeded();}}

}
