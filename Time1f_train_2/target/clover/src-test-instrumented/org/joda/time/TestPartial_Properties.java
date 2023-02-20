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
package org.joda.time;

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a Junit unit test for Partial.
 *
 * @author Stephen Colebourne
 */
public class TestPartial_Properties extends TestCase {static class __CLR4_4_1naznazle6qsf80{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,30277,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    
    private DateTimeZone zone = null;
    private static final DateTimeFieldType[] TYPES = new DateTimeFieldType[] {
        DateTimeFieldType.hourOfDay(),
        DateTimeFieldType.minuteOfHour(),
        DateTimeFieldType.secondOfMinute(),
        DateTimeFieldType.millisOfSecond()
    };
    private static final int[] VALUES = new int[] {10, 20, 30, 40};
    private static final int[] VALUES1 = new int[] {1, 2, 3, 4};
    private static final int[] VALUES2 = new int[] {5, 6, 7, 8};

//    private long TEST_TIME_NOW =
//        10L * DateTimeConstants.MILLIS_PER_HOUR
//        + 20L * DateTimeConstants.MILLIS_PER_MINUTE
//        + 30L * DateTimeConstants.MILLIS_PER_SECOND
//        + 40L;
//        
    private long TEST_TIME1 =
        1L * DateTimeConstants.MILLIS_PER_HOUR
        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
        + 3L * DateTimeConstants.MILLIS_PER_SECOND
        + 4L;
    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;

    public static void main(String[] args) {try{__CLR4_4_1naznazle6qsf80.R.inc(30203);
        __CLR4_4_1naznazle6qsf80.R.inc(30204);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1naznazle6qsf80.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1naznazle6qsf80.R.inc(30205);
        __CLR4_4_1naznazle6qsf80.R.inc(30206);return new TestSuite(TestPartial_Properties.class);
    }finally{__CLR4_4_1naznazle6qsf80.R.flushNeeded();}}

    public TestPartial_Properties(String name) {
        super(name);__CLR4_4_1naznazle6qsf80.R.inc(30208);try{__CLR4_4_1naznazle6qsf80.R.inc(30207);
    }finally{__CLR4_4_1naznazle6qsf80.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1naznazle6qsf80.R.inc(30209);
        __CLR4_4_1naznazle6qsf80.R.inc(30210);zone = DateTimeZone.getDefault();
        __CLR4_4_1naznazle6qsf80.R.inc(30211);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_1naznazle6qsf80.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1naznazle6qsf80.R.inc(30212);
        __CLR4_4_1naznazle6qsf80.R.inc(30213);DateTimeZone.setDefault(zone);
        __CLR4_4_1naznazle6qsf80.R.inc(30214);zone = null;
    }finally{__CLR4_4_1naznazle6qsf80.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyWithMinimumValueHour402() {__CLR4_4_1naznazle6qsf80.R.globalSliceStart(getClass().getName(),30215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1au6nftnbb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1naznazle6qsf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1naznazle6qsf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyWithMinimumValueHour402",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30215,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1au6nftnbb(){try{__CLR4_4_1naznazle6qsf80.R.inc(30215); 
     __CLR4_4_1naznazle6qsf80.R.inc(30216);Partial test = new Partial(TYPES, VALUES); 
     __CLR4_4_1naznazle6qsf80.R.inc(30217);Partial copy = test.property(DateTimeFieldType.hourOfDay()).withMinimumValue(); 
     __CLR4_4_1naznazle6qsf80.R.inc(30218);check(test, 10, 20, 30, 40); 
     __CLR4_4_1naznazle6qsf80.R.inc(30219);check(copy, 0, 20, 30, 40); 
 }finally{__CLR4_4_1naznazle6qsf80.R.flushNeeded();}} 


public void testPropertyAddMinute650() {__CLR4_4_1naznazle6qsf80.R.globalSliceStart(getClass().getName(),30220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uvrmzunbg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1naznazle6qsf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1naznazle6qsf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyAddMinute650",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uvrmzunbg(){try{__CLR4_4_1naznazle6qsf80.R.inc(30220); 
     __CLR4_4_1naznazle6qsf80.R.inc(30221);Partial test = new Partial(TYPES, VALUES); 
     __CLR4_4_1naznazle6qsf80.R.inc(30222);Partial copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(9); 
     __CLR4_4_1naznazle6qsf80.R.inc(30223);check(test, 10, 20, 30, 40); 
     __CLR4_4_1naznazle6qsf80.R.inc(30224);check(copy, 10, 29, 30, 40); 
     __CLR4_4_1naznazle6qsf80.R.inc(30225);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(39); 
     __CLR4_4_1naznazle6qsf80.R.inc(30226);check(copy, 10, 59, 30, 40); 
     __CLR4_4_1naznazle6qsf80.R.inc(30227);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(40); 
     __CLR4_4_1naznazle6qsf80.R.inc(30228);check(copy, 11, 0, 30, 40); 
     __CLR4_4_1naznazle6qsf80.R.inc(30229);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(1 * 60 + 45); 
     __CLR4_4_1naznazle6qsf80.R.inc(30230);check(copy, 12, 5, 30, 40); 
     __CLR4_4_1naznazle6qsf80.R.inc(30231);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(13 * 60 + 39); 
     __CLR4_4_1naznazle6qsf80.R.inc(30232);check(copy, 23, 59, 30, 40); 
     __CLR4_4_1naznazle6qsf80.R.inc(30233);try { 
         __CLR4_4_1naznazle6qsf80.R.inc(30234);test.property(DateTimeFieldType.minuteOfHour()).addToCopy(13 * 60 + 40); 
         __CLR4_4_1naznazle6qsf80.R.inc(30235);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1naznazle6qsf80.R.inc(30236);check(test, 10, 20, 30, 40); 
     __CLR4_4_1naznazle6qsf80.R.inc(30237);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-9); 
     __CLR4_4_1naznazle6qsf80.R.inc(30238);check(copy, 10, 11, 30, 40); 
     __CLR4_4_1naznazle6qsf80.R.inc(30239);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-19); 
     __CLR4_4_1naznazle6qsf80.R.inc(30240);check(copy, 10, 1, 30, 40); 
     __CLR4_4_1naznazle6qsf80.R.inc(30241);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-20); 
     __CLR4_4_1naznazle6qsf80.R.inc(30242);check(copy, 10, 0, 30, 40); 
     __CLR4_4_1naznazle6qsf80.R.inc(30243);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-21); 
     __CLR4_4_1naznazle6qsf80.R.inc(30244);check(copy, 9, 59, 30, 40); 
     __CLR4_4_1naznazle6qsf80.R.inc(30245);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-(10 * 60 + 20)); 
     __CLR4_4_1naznazle6qsf80.R.inc(30246);check(copy, 0, 0, 30, 40); 
     __CLR4_4_1naznazle6qsf80.R.inc(30247);try { 
         __CLR4_4_1naznazle6qsf80.R.inc(30248);test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-(10 * 60 + 21)); 
         __CLR4_4_1naznazle6qsf80.R.inc(30249);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1naznazle6qsf80.R.inc(30250);check(test, 10, 20, 30, 40); 
 }finally{__CLR4_4_1naznazle6qsf80.R.flushNeeded();}} 


public void testPropertyAddWrapFieldHour651() {__CLR4_4_1naznazle6qsf80.R.globalSliceStart(getClass().getName(),30251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fhrdhdncb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1naznazle6qsf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1naznazle6qsf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyAddWrapFieldHour651",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30251,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fhrdhdncb(){try{__CLR4_4_1naznazle6qsf80.R.inc(30251); 
     __CLR4_4_1naznazle6qsf80.R.inc(30252);Partial test = new Partial(TYPES, VALUES); 
     __CLR4_4_1naznazle6qsf80.R.inc(30253);Partial copy = test.property(DateTimeFieldType.hourOfDay()).addWrapFieldToCopy(9); 
     __CLR4_4_1naznazle6qsf80.R.inc(30254);check(test, 10, 20, 30, 40); 
     __CLR4_4_1naznazle6qsf80.R.inc(30255);check(copy, 19, 20, 30, 40); 
     __CLR4_4_1naznazle6qsf80.R.inc(30256);copy = test.property(DateTimeFieldType.hourOfDay()).addWrapFieldToCopy(0); 
     __CLR4_4_1naznazle6qsf80.R.inc(30257);check(copy, 10, 20, 30, 40); 
     __CLR4_4_1naznazle6qsf80.R.inc(30258);copy = test.property(DateTimeFieldType.hourOfDay()).addWrapFieldToCopy(18); 
     __CLR4_4_1naznazle6qsf80.R.inc(30259);check(copy, 4, 20, 30, 40); 
     __CLR4_4_1naznazle6qsf80.R.inc(30260);copy = test.property(DateTimeFieldType.hourOfDay()).addWrapFieldToCopy(-15); 
     __CLR4_4_1naznazle6qsf80.R.inc(30261);check(copy, 19, 20, 30, 40); 
 }finally{__CLR4_4_1naznazle6qsf80.R.flushNeeded();}} 


public void testPropertySetTextMinute652() {__CLR4_4_1naznazle6qsf80.R.globalSliceStart(getClass().getName(),30262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fdmcimncm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1naznazle6qsf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1naznazle6qsf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertySetTextMinute652",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fdmcimncm(){try{__CLR4_4_1naznazle6qsf80.R.inc(30262); 
     __CLR4_4_1naznazle6qsf80.R.inc(30263);Partial test = new Partial(TYPES, VALUES); 
     __CLR4_4_1naznazle6qsf80.R.inc(30264);Partial copy = test.property(DateTimeFieldType.minuteOfHour()).setCopy("12"); 
     __CLR4_4_1naznazle6qsf80.R.inc(30265);check(test, 10, 20, 30, 40); 
     __CLR4_4_1naznazle6qsf80.R.inc(30266);check(copy, 10, 12, 30, 40); 
 }finally{__CLR4_4_1naznazle6qsf80.R.flushNeeded();}} 


public void testPropertyWithMaximumValueHour653() {__CLR4_4_1naznazle6qsf80.R.globalSliceStart(getClass().getName(),30267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13m7a1zncr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1naznazle6qsf80.R.rethrow($CLV_t2$);}finally{__CLR4_4_1naznazle6qsf80.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyWithMaximumValueHour653",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13m7a1zncr(){try{__CLR4_4_1naznazle6qsf80.R.inc(30267); 
     __CLR4_4_1naznazle6qsf80.R.inc(30268);Partial test = new Partial(TYPES, VALUES); 
     __CLR4_4_1naznazle6qsf80.R.inc(30269);Partial copy = test.property(DateTimeFieldType.hourOfDay()).withMaximumValue(); 
     __CLR4_4_1naznazle6qsf80.R.inc(30270);check(test, 10, 20, 30, 40); 
     __CLR4_4_1naznazle6qsf80.R.inc(30271);check(copy, 23, 20, 30, 40); 
 }finally{__CLR4_4_1naznazle6qsf80.R.flushNeeded();}} 

    

    

//    public void testPropertyAddHour() {
//        Partial test = new Partial(TYPES, VALUES);
//        Partial copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(9);
//        check(test, 10, 20, 30, 40);
//        check(copy, 19, 20, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(0);
//        check(copy, 10, 20, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(13);
//        check(copy, 23, 20, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(14);
//        check(copy, 0, 20, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(-10);
//        check(copy, 0, 20, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(-11);
//        check(copy, 23, 20, 30, 40);
//    }
//
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

//    public void testPropertyAddMinute() {
//        Partial test = new Partial(TYPES, VALUES);
//        Partial copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(9);
//        check(test, 10, 20, 30, 40);
//        check(copy, 10, 29, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(39);
//        check(copy, 10, 59, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(40);
//        check(copy, 11, 0, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(1 * 60 + 45);
//        check(copy, 12, 5, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(13 * 60 + 39);
//        check(copy, 23, 59, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(13 * 60 + 40);
//        check(copy, 0, 0, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-9);
//        check(copy, 10, 11, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-19);
//        check(copy, 10, 1, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-20);
//        check(copy, 10, 0, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-21);
//        check(copy, 9, 59, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-(10 * 60 + 20));
//        check(copy, 0, 0, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-(10 * 60 + 21));
//        check(copy, 23, 59, 30, 40);
//    }

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(Partial test, int hour, int min, int sec, int milli) {try{__CLR4_4_1naznazle6qsf80.R.inc(30272);
        __CLR4_4_1naznazle6qsf80.R.inc(30273);assertEquals(hour, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1naznazle6qsf80.R.inc(30274);assertEquals(min, test.get(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1naznazle6qsf80.R.inc(30275);assertEquals(sec, test.get(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1naznazle6qsf80.R.inc(30276);assertEquals(milli, test.get(DateTimeFieldType.millisOfSecond()));
    }finally{__CLR4_4_1naznazle6qsf80.R.flushNeeded();}}
}
