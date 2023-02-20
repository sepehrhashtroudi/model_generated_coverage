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
public class TestConverterManager extends TestCase {static class __CLR4_4_1l6el6ele6np4st{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,27518,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_1l6el6ele6np4st.R.inc(27446);
        __CLR4_4_1l6el6ele6np4st.R.inc(27447);String str = System.getProperty("java.version");
        __CLR4_4_1l6el6ele6np4st.R.inc(27448);boolean old = true;
        __CLR4_4_1l6el6ele6np4st.R.inc(27449);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1l6el6ele6np4st.R.iget(27450)!=0|true))||(__CLR4_4_1l6el6ele6np4st.R.iget(27451)==0&false))) {{
            __CLR4_4_1l6el6ele6np4st.R.inc(27452);old = false;
        }
        }__CLR4_4_1l6el6ele6np4st.R.inc(27453);OLD_JDK = old;
    }finally{__CLR4_4_1l6el6ele6np4st.R.flushNeeded();}}

    private static final Policy RESTRICT;
    private static final Policy ALLOW;
    static {try{__CLR4_4_1l6el6ele6np4st.R.inc(27454);
        // don't call Policy.getPolicy()
        __CLR4_4_1l6el6ele6np4st.R.inc(27455);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1l6el6ele6np4st.R.inc(27456);
                __CLR4_4_1l6el6ele6np4st.R.inc(27457);Permissions p = new Permissions();
                __CLR4_4_1l6el6ele6np4st.R.inc(27458);p.add(new AllPermission());  // enable everything
                __CLR4_4_1l6el6ele6np4st.R.inc(27459);return p;
            }finally{__CLR4_4_1l6el6ele6np4st.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1l6el6ele6np4st.R.inc(27460);
            }finally{__CLR4_4_1l6el6ele6np4st.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1l6el6ele6np4st.R.inc(27461);
                __CLR4_4_1l6el6ele6np4st.R.inc(27462);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1l6el6ele6np4st.R.iget(27463)!=0|true))||(__CLR4_4_1l6el6ele6np4st.R.iget(27464)==0&false))) {{
                    __CLR4_4_1l6el6ele6np4st.R.inc(27465);return false;
                }
                }__CLR4_4_1l6el6ele6np4st.R.inc(27466);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1l6el6ele6np4st.R.flushNeeded();}}
        };
        __CLR4_4_1l6el6ele6np4st.R.inc(27467);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1l6el6ele6np4st.R.inc(27468);
                __CLR4_4_1l6el6ele6np4st.R.inc(27469);Permissions p = new Permissions();
                __CLR4_4_1l6el6ele6np4st.R.inc(27470);p.add(new AllPermission());  // enable everything
                __CLR4_4_1l6el6ele6np4st.R.inc(27471);return p;
            }finally{__CLR4_4_1l6el6ele6np4st.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1l6el6ele6np4st.R.inc(27472);
            }finally{__CLR4_4_1l6el6ele6np4st.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1l6el6ele6np4st.R.flushNeeded();}}

    public static void main(String[] args) {try{__CLR4_4_1l6el6ele6np4st.R.inc(27473);
        __CLR4_4_1l6el6ele6np4st.R.inc(27474);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1l6el6ele6np4st.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1l6el6ele6np4st.R.inc(27475);
        __CLR4_4_1l6el6ele6np4st.R.inc(27476);return new TestSuite(TestConverterManager.class);
    }finally{__CLR4_4_1l6el6ele6np4st.R.flushNeeded();}}

    public TestConverterManager(String name) {
        super(name);__CLR4_4_1l6el6ele6np4st.R.inc(27478);try{__CLR4_4_1l6el6ele6np4st.R.inc(27477);
    }finally{__CLR4_4_1l6el6ele6np4st.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testAddPartialConverter2179() {__CLR4_4_1l6el6ele6np4st.R.globalSliceStart(getClass().getName(),27479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g82qfel7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6el6ele6np4st.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6el6ele6np4st.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverter2179",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g82qfel7b(){try{__CLR4_4_1l6el6ele6np4st.R.inc(27479); 
     __CLR4_4_1l6el6ele6np4st.R.inc(27480);PartialConverter c = new PartialConverter() { 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono) {try{__CLR4_4_1l6el6ele6np4st.R.inc(27481); 
             __CLR4_4_1l6el6ele6np4st.R.inc(27482);return null; 
         }finally{__CLR4_4_1l6el6ele6np4st.R.flushNeeded();}} 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono, DateTimeFormatter parser) {try{__CLR4_4_1l6el6ele6np4st.R.inc(27483); 
             __CLR4_4_1l6el6ele6np4st.R.inc(27484);return null; 
         }finally{__CLR4_4_1l6el6ele6np4st.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_1l6el6ele6np4st.R.inc(27485); 
             __CLR4_4_1l6el6ele6np4st.R.inc(27486);return null; 
         }finally{__CLR4_4_1l6el6ele6np4st.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_1l6el6ele6np4st.R.inc(27487); 
             __CLR4_4_1l6el6ele6np4st.R.inc(27488);return null; 
         }finally{__CLR4_4_1l6el6ele6np4st.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1l6el6ele6np4st.R.inc(27489); 
             __CLR4_4_1l6el6ele6np4st.R.inc(27490);return String.class; 
         }finally{__CLR4_4_1l6el6ele6np4st.R.flushNeeded();}} 
     }; 
     __CLR4_4_1l6el6ele6np4st.R.inc(27491);try { 
         __CLR4_4_1l6el6ele6np4st.R.inc(27492);PartialConverter removed = ConverterManager.getInstance().addPartialConverter(c); 
         __CLR4_4_1l6el6ele6np4st.R.inc(27493);assertEquals(StringConverter.INSTANCE, removed); 
         __CLR4_4_1l6el6ele6np4st.R.inc(27494);assertEquals(String.class, ConverterManager.getInstance().getPartialConverter("").getSupportedType()); 
         __CLR4_4_1l6el6ele6np4st.R.inc(27495);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
     } finally { 
         __CLR4_4_1l6el6ele6np4st.R.inc(27496);ConverterManager.getInstance().addPartialConverter(StringConverter.INSTANCE); 
     } 
     __CLR4_4_1l6el6ele6np4st.R.inc(27497);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1l6el6ele6np4st.R.flushNeeded();}}
public void testAddPartialConverter3180() {__CLR4_4_1l6el6ele6np4st.R.globalSliceStart(getClass().getName(),27498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1awivsll7u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6el6ele6np4st.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6el6ele6np4st.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverter3180",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1awivsll7u(){try{__CLR4_4_1l6el6ele6np4st.R.inc(27498); 
     __CLR4_4_1l6el6ele6np4st.R.inc(27499);PartialConverter removed = ConverterManager.getInstance().addPartialConverter(null); 
     __CLR4_4_1l6el6ele6np4st.R.inc(27500);assertEquals(null, removed); 
     __CLR4_4_1l6el6ele6np4st.R.inc(27501);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1l6el6ele6np4st.R.flushNeeded();}}
public void testGetPeriodConverterRemovedNull181() {__CLR4_4_1l6el6ele6np4st.R.globalSliceStart(getClass().getName(),27502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19qby9nl7y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6el6ele6np4st.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6el6ele6np4st.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPeriodConverterRemovedNull181",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27502,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19qby9nl7y(){try{__CLR4_4_1l6el6ele6np4st.R.inc(27502); 
     __CLR4_4_1l6el6ele6np4st.R.inc(27503);try { 
         __CLR4_4_1l6el6ele6np4st.R.inc(27504);ConverterManager.getInstance().removePeriodConverter(NullConverter.INSTANCE); 
         __CLR4_4_1l6el6ele6np4st.R.inc(27505);try { 
             __CLR4_4_1l6el6ele6np4st.R.inc(27506);ConverterManager.getInstance().getPeriodConverter(null); 
             __CLR4_4_1l6el6ele6np4st.R.inc(27507);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         __CLR4_4_1l6el6ele6np4st.R.inc(27508);ConverterManager.getInstance().addPeriodConverter(NullConverter.INSTANCE); 
     } 
     __CLR4_4_1l6el6ele6np4st.R.inc(27509);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length); 
 }finally{__CLR4_4_1l6el6ele6np4st.R.flushNeeded();}}
public void testRemovePeriodConverter3182() {__CLR4_4_1l6el6ele6np4st.R.globalSliceStart(getClass().getName(),27510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xtzefcl86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6el6ele6np4st.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6el6ele6np4st.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePeriodConverter3182",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27510,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xtzefcl86(){try{__CLR4_4_1l6el6ele6np4st.R.inc(27510); 
     __CLR4_4_1l6el6ele6np4st.R.inc(27511);PeriodConverter removed = ConverterManager.getInstance().removePeriodConverter(null); 
     __CLR4_4_1l6el6ele6np4st.R.inc(27512);assertEquals(null, removed); 
     __CLR4_4_1l6el6ele6np4st.R.inc(27513);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length); 
 }finally{__CLR4_4_1l6el6ele6np4st.R.flushNeeded();}}
public void testAddPeriodConverter3183() {__CLR4_4_1l6el6ele6np4st.R.globalSliceStart(getClass().getName(),27514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ttsoj4l8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1l6el6ele6np4st.R.rethrow($CLV_t2$);}finally{__CLR4_4_1l6el6ele6np4st.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPeriodConverter3183",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ttsoj4l8a(){try{__CLR4_4_1l6el6ele6np4st.R.inc(27514); 
     __CLR4_4_1l6el6ele6np4st.R.inc(27515);PeriodConverter removed = ConverterManager.getInstance().addPeriodConverter(null); 
     __CLR4_4_1l6el6ele6np4st.R.inc(27516);assertEquals(null, removed); 
     __CLR4_4_1l6el6ele6np4st.R.inc(27517);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length); 
 }finally{__CLR4_4_1l6el6ele6np4st.R.flushNeeded();}}
    

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
