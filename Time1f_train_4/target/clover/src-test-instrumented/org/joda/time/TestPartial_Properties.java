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
public class TestPartial_Properties extends TestCase {static class __CLR4_4_1nebneble6rjcys{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,30403,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1nebneble6rjcys.R.inc(30323);
        __CLR4_4_1nebneble6rjcys.R.inc(30324);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1nebneble6rjcys.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1nebneble6rjcys.R.inc(30325);
        __CLR4_4_1nebneble6rjcys.R.inc(30326);return new TestSuite(TestPartial_Properties.class);
    }finally{__CLR4_4_1nebneble6rjcys.R.flushNeeded();}}

    public TestPartial_Properties(String name) {
        super(name);__CLR4_4_1nebneble6rjcys.R.inc(30328);try{__CLR4_4_1nebneble6rjcys.R.inc(30327);
    }finally{__CLR4_4_1nebneble6rjcys.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1nebneble6rjcys.R.inc(30329);
        __CLR4_4_1nebneble6rjcys.R.inc(30330);zone = DateTimeZone.getDefault();
        __CLR4_4_1nebneble6rjcys.R.inc(30331);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_1nebneble6rjcys.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1nebneble6rjcys.R.inc(30332);
        __CLR4_4_1nebneble6rjcys.R.inc(30333);DateTimeZone.setDefault(zone);
        __CLR4_4_1nebneble6rjcys.R.inc(30334);zone = null;
    }finally{__CLR4_4_1nebneble6rjcys.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyWithMinimumValueHour431() {__CLR4_4_1nebneble6rjcys.R.globalSliceStart(getClass().getName(),30335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ppncatnen();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nebneble6rjcys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nebneble6rjcys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyWithMinimumValueHour431",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30335,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ppncatnen(){try{__CLR4_4_1nebneble6rjcys.R.inc(30335); 
     __CLR4_4_1nebneble6rjcys.R.inc(30336);Partial test = new Partial(TYPES, VALUES); 
     __CLR4_4_1nebneble6rjcys.R.inc(30337);Partial copy = test.property(DateTimeFieldType.hourOfDay()).withMinimumValue(); 
     __CLR4_4_1nebneble6rjcys.R.inc(30338);check(test, 10, 20, 30, 40); 
     __CLR4_4_1nebneble6rjcys.R.inc(30339);check(copy, 0, 20, 30, 40); 
 }finally{__CLR4_4_1nebneble6rjcys.R.flushNeeded();}} 


public void testPropertyGetMinute677() {__CLR4_4_1nebneble6rjcys.R.globalSliceStart(getClass().getName(),30340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wu919ines();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nebneble6rjcys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nebneble6rjcys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyGetMinute677",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wu919ines(){try{__CLR4_4_1nebneble6rjcys.R.inc(30340); 
     __CLR4_4_1nebneble6rjcys.R.inc(30341);Partial test = new Partial(TYPES, VALUES); 
     __CLR4_4_1nebneble6rjcys.R.inc(30342);assertSame(test.getChronology().minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour()).getField()); 
     __CLR4_4_1nebneble6rjcys.R.inc(30343);assertEquals("minuteOfHour", test.property(DateTimeFieldType.minuteOfHour()).getName()); 
     __CLR4_4_1nebneble6rjcys.R.inc(30344);assertEquals("Property[minuteOfHour]", test.property(DateTimeFieldType.minuteOfHour()).toString()); 
     __CLR4_4_1nebneble6rjcys.R.inc(30345);assertSame(test, test.property(DateTimeFieldType.minuteOfHour()).getReadablePartial()); 
     __CLR4_4_1nebneble6rjcys.R.inc(30346);assertSame(test, test.property(DateTimeFieldType.minuteOfHour()).getPartial()); 
     __CLR4_4_1nebneble6rjcys.R.inc(30347);assertEquals(20, test.property(DateTimeFieldType.minuteOfHour()).get()); 
     __CLR4_4_1nebneble6rjcys.R.inc(30348);assertEquals("20", test.property(DateTimeFieldType.minuteOfHour()).getAsString()); 
     __CLR4_4_1nebneble6rjcys.R.inc(30349);assertEquals("20", test.property(DateTimeFieldType.minuteOfHour()).getAsText()); 
     __CLR4_4_1nebneble6rjcys.R.inc(30350);assertEquals("20", test.property(DateTimeFieldType.minuteOfHour()).getAsText(Locale.FRENCH)); 
     __CLR4_4_1nebneble6rjcys.R.inc(30351);assertEquals("20", test.property(DateTimeFieldType.minuteOfHour()).getAsShortText()); 
     __CLR4_4_1nebneble6rjcys.R.inc(30352);assertEquals("20", test.property(DateTimeFieldType.minuteOfHour()).getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1nebneble6rjcys.R.inc(30353);assertEquals(test.getChronology().minutes(), test.property(DateTimeFieldType.minuteOfHour()).getDurationField()); 
     __CLR4_4_1nebneble6rjcys.R.inc(30354);assertEquals(test.getChronology().hours(), test.property(DateTimeFieldType.minuteOfHour()).getRangeDurationField()); 
     __CLR4_4_1nebneble6rjcys.R.inc(30355);assertEquals(2, test.property(DateTimeFieldType.minuteOfHour()).getMaximumTextLength(null)); 
     __CLR4_4_1nebneble6rjcys.R.inc(30356);assertEquals(2, test.property(DateTimeFieldType.minuteOfHour()).getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1nebneble6rjcys.R.flushNeeded();}} 


public void testPropertyAddMinute678() {__CLR4_4_1nebneble6rjcys.R.globalSliceStart(getClass().getName(),30357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pqqxjknf9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nebneble6rjcys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nebneble6rjcys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyAddMinute678",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30357,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pqqxjknf9(){try{__CLR4_4_1nebneble6rjcys.R.inc(30357); 
     __CLR4_4_1nebneble6rjcys.R.inc(30358);Partial test = new Partial(TYPES, VALUES); 
     __CLR4_4_1nebneble6rjcys.R.inc(30359);Partial copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(9); 
     __CLR4_4_1nebneble6rjcys.R.inc(30360);check(test, 10, 20, 30, 40); 
     __CLR4_4_1nebneble6rjcys.R.inc(30361);check(copy, 10, 29, 30, 40); 
     __CLR4_4_1nebneble6rjcys.R.inc(30362);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(39); 
     __CLR4_4_1nebneble6rjcys.R.inc(30363);check(copy, 10, 59, 30, 40); 
     __CLR4_4_1nebneble6rjcys.R.inc(30364);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(40); 
     __CLR4_4_1nebneble6rjcys.R.inc(30365);check(copy, 11, 0, 30, 40); 
     __CLR4_4_1nebneble6rjcys.R.inc(30366);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(1 * 60 + 45); 
     __CLR4_4_1nebneble6rjcys.R.inc(30367);check(copy, 12, 5, 30, 40); 
     __CLR4_4_1nebneble6rjcys.R.inc(30368);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(13 * 60 + 39); 
     __CLR4_4_1nebneble6rjcys.R.inc(30369);check(copy, 23, 59, 30, 40); 
     __CLR4_4_1nebneble6rjcys.R.inc(30370);try { 
         __CLR4_4_1nebneble6rjcys.R.inc(30371);test.property(DateTimeFieldType.minuteOfHour()).addToCopy(13 * 60 + 40); 
         __CLR4_4_1nebneble6rjcys.R.inc(30372);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1nebneble6rjcys.R.inc(30373);check(test, 10, 20, 30, 40); 
     __CLR4_4_1nebneble6rjcys.R.inc(30374);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-9); 
     __CLR4_4_1nebneble6rjcys.R.inc(30375);check(copy, 10, 11, 30, 40); 
     __CLR4_4_1nebneble6rjcys.R.inc(30376);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-19); 
     __CLR4_4_1nebneble6rjcys.R.inc(30377);check(copy, 10, 1, 30, 40); 
     __CLR4_4_1nebneble6rjcys.R.inc(30378);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-20); 
     __CLR4_4_1nebneble6rjcys.R.inc(30379);check(copy, 10, 0, 30, 40); 
     __CLR4_4_1nebneble6rjcys.R.inc(30380);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-21); 
     __CLR4_4_1nebneble6rjcys.R.inc(30381);check(copy, 9, 59, 30, 40); 
     __CLR4_4_1nebneble6rjcys.R.inc(30382);copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-(10 * 60 + 20)); 
     __CLR4_4_1nebneble6rjcys.R.inc(30383);check(copy, 0, 0, 30, 40); 
     __CLR4_4_1nebneble6rjcys.R.inc(30384);try { 
         __CLR4_4_1nebneble6rjcys.R.inc(30385);test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-(10 * 60 + 21)); 
         __CLR4_4_1nebneble6rjcys.R.inc(30386);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1nebneble6rjcys.R.inc(30387);check(test, 10, 20, 30, 40); 
 }finally{__CLR4_4_1nebneble6rjcys.R.flushNeeded();}} 


public void testPropertySetTextMinute679() {__CLR4_4_1nebneble6rjcys.R.globalSliceStart(getClass().getName(),30388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qj7v5vng4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nebneble6rjcys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nebneble6rjcys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertySetTextMinute679",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qj7v5vng4(){try{__CLR4_4_1nebneble6rjcys.R.inc(30388); 
     __CLR4_4_1nebneble6rjcys.R.inc(30389);Partial test = new Partial(TYPES, VALUES); 
     __CLR4_4_1nebneble6rjcys.R.inc(30390);Partial copy = test.property(DateTimeFieldType.minuteOfHour()).setCopy("12"); 
     __CLR4_4_1nebneble6rjcys.R.inc(30391);check(test, 10, 20, 30, 40); 
     __CLR4_4_1nebneble6rjcys.R.inc(30392);check(copy, 10, 12, 30, 40); 
 }finally{__CLR4_4_1nebneble6rjcys.R.flushNeeded();}} 


public void testPropertyWithMaximumValueHour680() {__CLR4_4_1nebneble6rjcys.R.globalSliceStart(getClass().getName(),30393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14r9h83ng9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nebneble6rjcys.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nebneble6rjcys.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Properties.testPropertyWithMaximumValueHour680",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30393,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14r9h83ng9(){try{__CLR4_4_1nebneble6rjcys.R.inc(30393); 
     __CLR4_4_1nebneble6rjcys.R.inc(30394);Partial test = new Partial(TYPES, VALUES); 
     __CLR4_4_1nebneble6rjcys.R.inc(30395);Partial copy = test.property(DateTimeFieldType.hourOfDay()).withMaximumValue(); 
     __CLR4_4_1nebneble6rjcys.R.inc(30396);check(test, 10, 20, 30, 40); 
     __CLR4_4_1nebneble6rjcys.R.inc(30397);check(copy, 23, 20, 30, 40); 
 }finally{__CLR4_4_1nebneble6rjcys.R.flushNeeded();}} 

    

    

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
    private void check(Partial test, int hour, int min, int sec, int milli) {try{__CLR4_4_1nebneble6rjcys.R.inc(30398);
        __CLR4_4_1nebneble6rjcys.R.inc(30399);assertEquals(hour, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1nebneble6rjcys.R.inc(30400);assertEquals(min, test.get(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1nebneble6rjcys.R.inc(30401);assertEquals(sec, test.get(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1nebneble6rjcys.R.inc(30402);assertEquals(milli, test.get(DateTimeFieldType.millisOfSecond()));
    }finally{__CLR4_4_1nebneble6rjcys.R.flushNeeded();}}
}
