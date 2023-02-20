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
package org.joda.time.convert;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.security.AllPermission;
import java.security.CodeSource;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.security.Policy;
import java.security.ProtectionDomain;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.Interval;
import org.joda.time.JodaTimePermission;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadableDateTime;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.TimeOfDay;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a JUnit test for ConverterManager.
 *
 * @author Stephen Colebourne
 */
public class TestConverterManager extends TestCase {static class __CLR4_4_1l30l30le6o7a8v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,27404,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_1l30l30le6o7a8v.R.inc(27324);
        __CLR4_4_1l30l30le6o7a8v.R.inc(27325);String str = System.getProperty("java.version");
        __CLR4_4_1l30l30le6o7a8v.R.inc(27326);boolean old = true;
        __CLR4_4_1l30l30le6o7a8v.R.inc(27327);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1l30l30le6o7a8v.R.iget(27328)!=0|true))||(__CLR4_4_1l30l30le6o7a8v.R.iget(27329)==0&false))) {{
            __CLR4_4_1l30l30le6o7a8v.R.inc(27330);old = false;
        }
        }__CLR4_4_1l30l30le6o7a8v.R.inc(27331);OLD_JDK = old;
    }finally{__CLR4_4_1l30l30le6o7a8v.R.flushNeeded();}}

    private static final Policy RESTRICT;
    private static final Policy ALLOW;
    static {try{__CLR4_4_1l30l30le6o7a8v.R.inc(27332);
        // don't call Policy.getPolicy()
        __CLR4_4_1l30l30le6o7a8v.R.inc(27333);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1l30l30le6o7a8v.R.inc(27334);
                __CLR4_4_1l30l30le6o7a8v.R.inc(27335);Permissions p = new Permissions();
                __CLR4_4_1l30l30le6o7a8v.R.inc(27336);p.add(new AllPermission());  // enable everything
                __CLR4_4_1l30l30le6o7a8v.R.inc(27337);return p;
            }finally{__CLR4_4_1l30l30le6o7a8v.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1l30l30le6o7a8v.R.inc(27338);
            }finally{__CLR4_4_1l30l30le6o7a8v.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1l30l30le6o7a8v.R.inc(27339);
                __CLR4_4_1l30l30le6o7a8v.R.inc(27340);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1l30l30le6o7a8v.R.iget(27341)!=0|true))||(__CLR4_4_1l30l30le6o7a8v.R.iget(27342)==0&false))) {{
                    __CLR4_4_1l30l30le6o7a8v.R.inc(27343);return false;
                }
                }__CLR4_4_1l30l30le6o7a8v.R.inc(27344);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1l30l30le6o7a8v.R.flushNeeded();}}
        };
        __CLR4_4_1l30l30le6o7a8v.R.inc(27345);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1l30l30le6o7a8v.R.inc(27346);
                __CLR4_4_1l30l30le6o7a8v.R.inc(27347);Permissions p = new Permissions();
                __CLR4_4_1l30l30le6o7a8v.R.inc(27348);p.add(new AllPermission());  // enable everything
                __CLR4_4_1l30l30le6o7a8v.R.inc(27349);return p;
            }finally{__CLR4_4_1l30l30le6o7a8v.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1l30l30le6o7a8v.R.inc(27350);
            }finally{__CLR4_4_1l30l30le6o7a8v.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1l30l30le6o7a8v.R.flushNeeded();}}

    public static void main(String[] args) {try{__CLR4_4_1l30l30le6o7a8v.R.inc(27351);
        __CLR4_4_1l30l30le6o7a8v.R.inc(27352);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1l30l30le6o7a8v.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1l30l30le6o7a8v.R.inc(27353);
        __CLR4_4_1l30l30le6o7a8v.R.inc(27354);return new TestSuite(TestConverterManager.class);
    }finally{__CLR4_4_1l30l30le6o7a8v.R.flushNeeded();}}

    public TestConverterManager(String name) {
        super(name);__CLR4_4_1l30l30le6o7a8v.R.inc(27356);try{__CLR4_4_1l30l30le6o7a8v.R.inc(27355);
    }finally{__CLR4_4_1l30l30le6o7a8v.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testAddPartialConverter2180() {__CLR4_4_1l30l30le6o7a8v.R.globalSliceStart(getClass().getName(),27357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fr7j04l3x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l30l30le6o7a8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l30l30le6o7a8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverter2180",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27357,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fr7j04l3x(){try{__CLR4_4_1l30l30le6o7a8v.R.inc(27357); 
     __CLR4_4_1l30l30le6o7a8v.R.inc(27358);PartialConverter c = new PartialConverter() { 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono) {try{__CLR4_4_1l30l30le6o7a8v.R.inc(27359); 
             __CLR4_4_1l30l30le6o7a8v.R.inc(27360);return null; 
         }finally{__CLR4_4_1l30l30le6o7a8v.R.flushNeeded();}} 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono, DateTimeFormatter parser) {try{__CLR4_4_1l30l30le6o7a8v.R.inc(27361); 
             __CLR4_4_1l30l30le6o7a8v.R.inc(27362);return null; 
         }finally{__CLR4_4_1l30l30le6o7a8v.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_1l30l30le6o7a8v.R.inc(27363); 
             __CLR4_4_1l30l30le6o7a8v.R.inc(27364);return null; 
         }finally{__CLR4_4_1l30l30le6o7a8v.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_1l30l30le6o7a8v.R.inc(27365); 
             __CLR4_4_1l30l30le6o7a8v.R.inc(27366);return null; 
         }finally{__CLR4_4_1l30l30le6o7a8v.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1l30l30le6o7a8v.R.inc(27367); 
             __CLR4_4_1l30l30le6o7a8v.R.inc(27368);return String.class; 
         }finally{__CLR4_4_1l30l30le6o7a8v.R.flushNeeded();}} 
     }; 
     __CLR4_4_1l30l30le6o7a8v.R.inc(27369);try { 
         __CLR4_4_1l30l30le6o7a8v.R.inc(27370);PartialConverter removed = ConverterManager.getInstance().addPartialConverter(c); 
         __CLR4_4_1l30l30le6o7a8v.R.inc(27371);assertEquals(StringConverter.INSTANCE, removed); 
         __CLR4_4_1l30l30le6o7a8v.R.inc(27372);assertEquals(String.class, ConverterManager.getInstance().getPartialConverter("").getSupportedType()); 
         __CLR4_4_1l30l30le6o7a8v.R.inc(27373);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
     } finally { 
         __CLR4_4_1l30l30le6o7a8v.R.inc(27374);ConverterManager.getInstance().addPartialConverter(StringConverter.INSTANCE); 
     } 
     __CLR4_4_1l30l30le6o7a8v.R.inc(27375);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1l30l30le6o7a8v.R.flushNeeded();}}
public void testGetPartialConverter181() {__CLR4_4_1l30l30le6o7a8v.R.globalSliceStart(getClass().getName(),27376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l7hrg2l4g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l30l30le6o7a8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l30l30le6o7a8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPartialConverter181",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27376,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l7hrg2l4g(){try{__CLR4_4_1l30l30le6o7a8v.R.inc(27376); 
     __CLR4_4_1l30l30le6o7a8v.R.inc(27377);PartialConverter c = ConverterManager.getInstance().getPartialConverter(new Long(0L)); 
     __CLR4_4_1l30l30le6o7a8v.R.inc(27378);assertEquals(Long.class, c.getSupportedType()); 
     __CLR4_4_1l30l30le6o7a8v.R.inc(27379);c = ConverterManager.getInstance().getPartialConverter(new DateTime()); 
     __CLR4_4_1l30l30le6o7a8v.R.inc(27380);assertEquals(ReadableInstant.class, c.getSupportedType()); 
     __CLR4_4_1l30l30le6o7a8v.R.inc(27381);c = ConverterManager.getInstance().getPartialConverter(""); 
     __CLR4_4_1l30l30le6o7a8v.R.inc(27382);assertEquals(String.class, c.getSupportedType()); 
     __CLR4_4_1l30l30le6o7a8v.R.inc(27383);c = ConverterManager.getInstance().getPartialConverter(new Date()); 
     __CLR4_4_1l30l30le6o7a8v.R.inc(27384);assertEquals(Date.class, c.getSupportedType()); 
     __CLR4_4_1l30l30le6o7a8v.R.inc(27385);c = ConverterManager.getInstance().getPartialConverter(new GregorianCalendar()); 
     __CLR4_4_1l30l30le6o7a8v.R.inc(27386);assertEquals(Calendar.class, c.getSupportedType()); 
     __CLR4_4_1l30l30le6o7a8v.R.inc(27387);c = ConverterManager.getInstance().getPartialConverter(null); 
     __CLR4_4_1l30l30le6o7a8v.R.inc(27388);assertEquals(null, c.getSupportedType()); 
     __CLR4_4_1l30l30le6o7a8v.R.inc(27389);try { 
         __CLR4_4_1l30l30le6o7a8v.R.inc(27390);ConverterManager.getInstance().getPartialConverter(Boolean.TRUE); 
         __CLR4_4_1l30l30le6o7a8v.R.inc(27391);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1l30l30le6o7a8v.R.flushNeeded();}}
public void testRemoveDurationConverter3182() {__CLR4_4_1l30l30le6o7a8v.R.globalSliceStart(getClass().getName(),27392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1az0vjpl4w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l30l30le6o7a8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l30l30le6o7a8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveDurationConverter3182",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27392,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1az0vjpl4w(){try{__CLR4_4_1l30l30le6o7a8v.R.inc(27392); 
     __CLR4_4_1l30l30le6o7a8v.R.inc(27393);DurationConverter removed = ConverterManager.getInstance().removeDurationConverter(null); 
     __CLR4_4_1l30l30le6o7a8v.R.inc(27394);assertEquals(null, removed); 
     __CLR4_4_1l30l30le6o7a8v.R.inc(27395);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
 }finally{__CLR4_4_1l30l30le6o7a8v.R.flushNeeded();}}
public void testGetIntervalConverterRemovedNull183() {__CLR4_4_1l30l30le6o7a8v.R.globalSliceStart(getClass().getName(),27396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t1s8sdl50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l30l30le6o7a8v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l30l30le6o7a8v.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetIntervalConverterRemovedNull183",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27396,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t1s8sdl50(){try{__CLR4_4_1l30l30le6o7a8v.R.inc(27396); 
     __CLR4_4_1l30l30le6o7a8v.R.inc(27397);try { 
         __CLR4_4_1l30l30le6o7a8v.R.inc(27398);ConverterManager.getInstance().removeIntervalConverter(NullConverter.INSTANCE); 
         __CLR4_4_1l30l30le6o7a8v.R.inc(27399);try { 
             __CLR4_4_1l30l30le6o7a8v.R.inc(27400);ConverterManager.getInstance().getIntervalConverter(null); 
             __CLR4_4_1l30l30le6o7a8v.R.inc(27401);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         __CLR4_4_1l30l30le6o7a8v.R.inc(27402);ConverterManager.getInstance().addIntervalConverter(NullConverter.INSTANCE); 
     } 
     __CLR4_4_1l30l30le6o7a8v.R.inc(27403);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 }finally{__CLR4_4_1l30l30le6o7a8v.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    private static final int PARTIAL_SIZE = 7;
    
    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    private static int DURATION_SIZE = 5;
    
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    private static int PERIOD_SIZE = 5;
    
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    private static int INTERVAL_SIZE = 3;

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

}
