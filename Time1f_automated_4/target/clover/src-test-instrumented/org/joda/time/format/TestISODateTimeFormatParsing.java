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
public class TestISODateTimeFormatParsing extends TestCase {static class __CLR4_4_1lwvlwvle6o7ag6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,28478,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1lwvlwvle6o7ag6.R.inc(28399);
        __CLR4_4_1lwvlwvle6o7ag6.R.inc(28400);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lwvlwvle6o7ag6.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lwvlwvle6o7ag6.R.inc(28401);
        __CLR4_4_1lwvlwvle6o7ag6.R.inc(28402);return new TestSuite(TestISODateTimeFormatParsing.class);
    }finally{__CLR4_4_1lwvlwvle6o7ag6.R.flushNeeded();}}

    public TestISODateTimeFormatParsing(String name) {
        super(name);__CLR4_4_1lwvlwvle6o7ag6.R.inc(28404);try{__CLR4_4_1lwvlwvle6o7ag6.R.inc(28403);
    }finally{__CLR4_4_1lwvlwvle6o7ag6.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lwvlwvle6o7ag6.R.inc(28405);
        __CLR4_4_1lwvlwvle6o7ag6.R.inc(28406);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1lwvlwvle6o7ag6.R.inc(28407);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1lwvlwvle6o7ag6.R.inc(28408);originalLocale = Locale.getDefault();
        __CLR4_4_1lwvlwvle6o7ag6.R.inc(28409);DateTimeZone.setDefault(DateTimeZone.forID("Europe/London"));
        __CLR4_4_1lwvlwvle6o7ag6.R.inc(28410);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1lwvlwvle6o7ag6.R.inc(28411);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1lwvlwvle6o7ag6.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lwvlwvle6o7ag6.R.inc(28412);
        __CLR4_4_1lwvlwvle6o7ag6.R.inc(28413);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1lwvlwvle6o7ag6.R.inc(28414);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1lwvlwvle6o7ag6.R.inc(28415);Locale.setDefault(originalLocale);
        __CLR4_4_1lwvlwvle6o7ag6.R.inc(28416);originalDateTimeZone = null;
        __CLR4_4_1lwvlwvle6o7ag6.R.inc(28417);originalTimeZone = null;
        __CLR4_4_1lwvlwvle6o7ag6.R.inc(28418);originalLocale = null;
    }finally{__CLR4_4_1lwvlwvle6o7ag6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_ordinalDateTime326() {__CLR4_4_1lwvlwvle6o7ag6.R.globalSliceStart(getClass().getName(),28419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q67i1rlxf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lwvlwvle6o7ag6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lwvlwvle6o7ag6.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_ordinalDateTime326",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q67i1rlxf(){try{__CLR4_4_1lwvlwvle6o7ag6.R.inc(28419); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28420);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28421);DateTimeFormatter parser = ISODateTimeFormat.ordinalDateTime(); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28422);assertParse(parser, "2006-123T10:20:30.400999999Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28423);assertParse(parser, "2006-12T10:20:30.400Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(12)); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28424);assertParse(parser, "2006-1T10:20:30.40Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(1)); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28425);assertParse(parser, "2006-123T10:20:30.4Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28426);assertParse(parser, false, "2006-T10:20:30.400Z"); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28427);assertParse(parser, false, "2006T10:20:30.400Z"); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28428);assertParse(parser, false, "2006-123T10:20:30.400Z"); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28429);assertParse(parser, false, "2006-123T10:2Z"); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28430);assertParse(parser, false, "2006-123T10Z"); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28431);assertParse(parser, false, "2006-123T1Z"); 
 }finally{__CLR4_4_1lwvlwvle6o7ag6.R.flushNeeded();}}
public void test_basicDate327() {__CLR4_4_1lwvlwvle6o7ag6.R.globalSliceStart(getClass().getName(),28432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1amvoxclxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lwvlwvle6o7ag6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lwvlwvle6o7ag6.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicDate327",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1amvoxclxs(){try{__CLR4_4_1lwvlwvle6o7ag6.R.inc(28432); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28433);DateTimeZone.setDefault(DateTimeZone.UTC); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28434);DateTimeFormatter parser = ISODateTimeFormat.basicDate(); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28435);assertParse(parser, "20061204T102030.400999999Z", new DateTime(2006, 12, 4, 10, 20, 30, 400)); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28436);assertParse(parser, "20061204T102030.400Z", new DateTime(2006, 12, 4, 10, 20, 30, 400)); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28437);assertParse(parser, "20061204T102030.40Z", new DateTime(2006, 12, 4, 10, 20, 30, 400)); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28438);assertParse(parser, "20061204T102030.4Z", new DateTime(2006, 12, 4, 10, 20, 30, 400)); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28439);assertParse(parser, false, "2006120T102030.400Z"); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28440);assertParse(parser, false, "200612T102030.400Z"); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28441);assertParse(parser, false, "20061T102030.400Z"); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28442);assertParse(parser, false, "2006T102030.400Z"); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28443);assertParse(parser, false, "200T102030.400Z"); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28444);assertParse(parser, false, "20T102030.400Z"); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28445);assertParse(parser, false, "2T102030.400Z"); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28446);assertParse(parser, false, "20061204T10203.400Z"); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28447);assertParse(parser, false, "20061204T102.400Z"); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28448);assertParse(parser, false, "20061204T10.400Z"); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28449);assertParse(parser, false, "20061204T1.400Z"); 
 }finally{__CLR4_4_1lwvlwvle6o7ag6.R.flushNeeded();}}
public void test_basicDate328() {__CLR4_4_1lwvlwvle6o7ag6.R.globalSliceStart(getClass().getName(),28450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dvvnptlya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lwvlwvle6o7ag6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lwvlwvle6o7ag6.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormatParsing.test_basicDate328",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28450,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dvvnptlya(){try{__CLR4_4_1lwvlwvle6o7ag6.R.inc(28450); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28451);DateTimeFormatter parser = ISODateTimeFormat.basicDate(); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28452);assertParse(parser, "20061204T102030.400999999Z", new DateTime(2006, 12, 4, 10, 20, 30, 400)); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28453);assertParse(parser, "20061204T102030.400Z", new DateTime(2006, 12, 4, 10, 20, 30, 400)); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28454);assertParse(parser, "20061204T102030.40Z", new DateTime(2006, 12, 4, 10, 20, 30, 400)); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28455);assertParse(parser, "20061204T102030.4Z", new DateTime(2006, 12, 4, 10, 20, 30, 400)); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28456);assertParse(parser, false, "2006120T102030.400Z"); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28457);assertParse(parser, false, "200612T102030.400Z"); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28458);assertParse(parser, false, "20061T102030.400Z"); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28459);assertParse(parser, false, "2006T102030.400Z"); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28460);assertParse(parser, false, "200T102030.400Z"); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28461);assertParse(parser, false, "20T102030.400Z"); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28462);assertParse(parser, false, "2T102030.400Z"); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28463);assertParse(parser, false, "20061204T10203.400Z"); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28464);assertParse(parser, false, "20061204T102.400Z"); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28465);assertParse(parser, false, "20061204T10.400Z"); 
     __CLR4_4_1lwvlwvle6o7ag6.R.inc(28466);assertParse(parser, false, "20061204T1.400Z"); 
 }finally{__CLR4_4_1lwvlwvle6o7ag6.R.flushNeeded();}}
    

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
    private void assertParse(DateTimeFormatter parser, boolean expected, String str) {try{__CLR4_4_1lwvlwvle6o7ag6.R.inc(28467);
        __CLR4_4_1lwvlwvle6o7ag6.R.inc(28468);if ((((expected)&&(__CLR4_4_1lwvlwvle6o7ag6.R.iget(28469)!=0|true))||(__CLR4_4_1lwvlwvle6o7ag6.R.iget(28470)==0&false))) {{
            __CLR4_4_1lwvlwvle6o7ag6.R.inc(28471);parser.parseMillis(str);
        } }else {{
            __CLR4_4_1lwvlwvle6o7ag6.R.inc(28472);try {
                __CLR4_4_1lwvlwvle6o7ag6.R.inc(28473);parser.parseMillis(str);
                __CLR4_4_1lwvlwvle6o7ag6.R.inc(28474);fail();
            } catch (IllegalArgumentException ex) {
                // expected
            }
        }
    }}finally{__CLR4_4_1lwvlwvle6o7ag6.R.flushNeeded();}}

    private void assertParse(DateTimeFormatter parser, String str, DateTime expected) {try{__CLR4_4_1lwvlwvle6o7ag6.R.inc(28475);
        __CLR4_4_1lwvlwvle6o7ag6.R.inc(28476);DateTime dt = parser.parseDateTime(str);
        __CLR4_4_1lwvlwvle6o7ag6.R.inc(28477);assertEquals(expected, dt);
    }finally{__CLR4_4_1lwvlwvle6o7ag6.R.flushNeeded();}}

}
