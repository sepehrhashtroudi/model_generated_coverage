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
public class TestConverterManager extends TestCase {static class __CLR4_4_1sr7sr7lc8axevc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,37568,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37267);
        __CLR4_4_1sr7sr7lc8axevc.R.inc(37268);String str = System.getProperty("java.version");
        __CLR4_4_1sr7sr7lc8axevc.R.inc(37269);boolean old = true;
        __CLR4_4_1sr7sr7lc8axevc.R.inc(37270);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1sr7sr7lc8axevc.R.iget(37271)!=0|true))||(__CLR4_4_1sr7sr7lc8axevc.R.iget(37272)==0&false))) {{
            __CLR4_4_1sr7sr7lc8axevc.R.inc(37273);old = false;
        }
        }__CLR4_4_1sr7sr7lc8axevc.R.inc(37274);OLD_JDK = old;
    }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}}

    private static final Policy RESTRICT;
    private static final Policy ALLOW;
    static {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37275);
        // don't call Policy.getPolicy()
        __CLR4_4_1sr7sr7lc8axevc.R.inc(37276);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37277);
                __CLR4_4_1sr7sr7lc8axevc.R.inc(37278);Permissions p = new Permissions();
                __CLR4_4_1sr7sr7lc8axevc.R.inc(37279);p.add(new AllPermission());  // enable everything
                __CLR4_4_1sr7sr7lc8axevc.R.inc(37280);return p;
            }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37281);
            }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37282);
                __CLR4_4_1sr7sr7lc8axevc.R.inc(37283);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1sr7sr7lc8axevc.R.iget(37284)!=0|true))||(__CLR4_4_1sr7sr7lc8axevc.R.iget(37285)==0&false))) {{
                    __CLR4_4_1sr7sr7lc8axevc.R.inc(37286);return false;
                }
                }__CLR4_4_1sr7sr7lc8axevc.R.inc(37287);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}}
        };
        __CLR4_4_1sr7sr7lc8axevc.R.inc(37288);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37289);
                __CLR4_4_1sr7sr7lc8axevc.R.inc(37290);Permissions p = new Permissions();
                __CLR4_4_1sr7sr7lc8axevc.R.inc(37291);p.add(new AllPermission());  // enable everything
                __CLR4_4_1sr7sr7lc8axevc.R.inc(37292);return p;
            }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37293);
            }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}}

    public static void main(String[] args) {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37294);
        __CLR4_4_1sr7sr7lc8axevc.R.inc(37295);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37296);
        __CLR4_4_1sr7sr7lc8axevc.R.inc(37297);return new TestSuite(TestConverterManager.class);
    }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}}

    public TestConverterManager(String name) {
        super(name);__CLR4_4_1sr7sr7lc8axevc.R.inc(37299);try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37298);
    }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testAddDurationConverter22() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_127j4d8ss4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddDurationConverter22",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37300,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_127j4d8ss4(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37300); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37301);DurationConverter c = new DurationConverter() { 
  
         public long getDurationMillis(Object object) {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37302); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37303);return 0; 
         }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37304); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37305);return String.class; 
         }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 
     }; 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37306);try { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37307);DurationConverter removed = ConverterManager.getInstance().addDurationConverter(c); 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37308);assertEquals(StringConverter.INSTANCE, removed); 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37309);assertEquals(String.class, ConverterManager.getInstance().getDurationConverter("").getSupportedType()); 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37310);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
     } finally { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37311);ConverterManager.getInstance().addDurationConverter(StringConverter.INSTANCE); 
     } 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37312);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testGetInstantConverterOKMultipleMatches19() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14tfbmbssh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverterOKMultipleMatches19",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37313,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14tfbmbssh(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37313); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37314);InstantConverter c = new InstantConverter() { 
  
         public long getInstantMillis(Object object, Chronology chrono) {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37315); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37316);return 0; 
         }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37317); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37318);return null; 
         }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37319); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37320);return null; 
         }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37321); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37322);return ReadableDateTime.class; 
         }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 
     }; 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37323);try { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37324);ConverterManager.getInstance().addInstantConverter(c); 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37325);InstantConverter ok = ConverterManager.getInstance().getInstantConverter(new DateTime()); 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37326);assertEquals(ReadableDateTime.class, ok.getSupportedType()); 
     } finally { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37327);ConverterManager.getInstance().removeInstantConverter(c); 
     } 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37328);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testGetPartialConverterOKMultipleMatches36() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz3gfmssx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPartialConverterOKMultipleMatches36",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37329,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz3gfmssx(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37329); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37330);PartialConverter c = new PartialConverter() { 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono) {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37331); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37332);return null; 
         }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono, DateTimeFormatter parser) {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37333); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37334);return null; 
         }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37335); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37336);return null; 
         }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37337); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37338);return null; 
         }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37339); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37340);return ReadableDateTime.class; 
         }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 
     }; 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37341);try { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37342);ConverterManager.getInstance().addPartialConverter(c); 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37343);PartialConverter ok = ConverterManager.getInstance().getPartialConverter(new DateTime()); 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37344);assertEquals(ReadableDateTime.class, ok.getSupportedType()); 
     } finally { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37345);ConverterManager.getInstance().removePartialConverter(c); 
     } 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37346);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testAddInstantConverter4134() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lgophpstf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddInstantConverter4134",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lgophpstf(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37347); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37348);InstantConverter removed = ConverterManager.getInstance().addInstantConverter(null); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37349);assertEquals(null, removed); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37350);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testGetInstantConverterBadMultipleMatches294() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17i6z9vstj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverterBadMultipleMatches294",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37351,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17i6z9vstj(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37351); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37352);InstantConverter c = new InstantConverter() { 
  
         public long getInstantMillis(Object object, Chronology chrono) {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37353); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37354);return 0; 
         }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37355); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37356);return null; 
         }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37357); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37358);return null; 
         }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37359); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37360);return Serializable.class; 
         }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 
     }; 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37361);try { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37362);ConverterManager.getInstance().addInstantConverter(c); 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37363);try { 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37364);ConverterManager.getInstance().getInstantConverter(new DateTime()); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37365);fail(); 
         } catch (IllegalStateException ex) { 
         } 
     } finally { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37366);ConverterManager.getInstance().removeInstantConverter(c); 
     } 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37367);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testGetIntervalConverterRemovedNull347() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12vaqfhsu0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetIntervalConverterRemovedNull347",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12vaqfhsu0(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37368); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37369);try { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37370);ConverterManager.getInstance().removeIntervalConverter(NullConverter.INSTANCE); 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37371);try { 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37372);ConverterManager.getInstance().getIntervalConverter(null); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37373);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37374);ConverterManager.getInstance().addIntervalConverter(NullConverter.INSTANCE); 
     } 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37375);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testRemoveDurationConverter3381() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13gbj12su8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveDurationConverter3381",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37376,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13gbj12su8(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37376); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37377);DurationConverter removed = ConverterManager.getInstance().removeDurationConverter(null); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37378);assertEquals(null, removed); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37379);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testGetPeriodConverterRemovedNull383() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17i1eevsuc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPeriodConverterRemovedNull383",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17i1eevsuc(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37380); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37381);try { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37382);ConverterManager.getInstance().removePeriodConverter(NullConverter.INSTANCE); 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37383);try { 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37384);ConverterManager.getInstance().getPeriodConverter(null); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37385);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37386);ConverterManager.getInstance().addPeriodConverter(NullConverter.INSTANCE); 
     } 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37387);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length); 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testToString441() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h7r5q2suk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testToString441",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h7r5q2suk(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37388); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37389);assertEquals("ConverterManager[6 instant,7 partial,5 duration,5 period,3 interval]", ConverterManager.getInstance().toString()); 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testRemoveIntervalConverter2545() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1up0gz4sum();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveIntervalConverter2545",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37390,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1up0gz4sum(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37390); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37391);IntervalConverter c = new IntervalConverter() { 
  
         public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37392); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37393);return false; 
         }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 
  
         public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37394); 
         }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37395); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37396);return Boolean.class; 
         }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 
     }; 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37397);IntervalConverter removed = ConverterManager.getInstance().removeIntervalConverter(c); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37398);assertEquals(null, removed); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37399);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testAddIntervalConverter1591() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_186yrqnsuw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddIntervalConverter1591",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37400,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_186yrqnsuw(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37400); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37401);IntervalConverter c = new IntervalConverter() { 
  
         public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37402); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37403);return false; 
         }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 
  
         public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37404); 
         }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37405); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37406);return Boolean.class; 
         }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 
     }; 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37407);try { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37408);IntervalConverter removed = ConverterManager.getInstance().addIntervalConverter(c); 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37409);assertEquals(null, removed); 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37410);assertEquals(Boolean.class, ConverterManager.getInstance().getIntervalConverter(Boolean.TRUE).getSupportedType()); 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37411);assertEquals(INTERVAL_SIZE + 1, ConverterManager.getInstance().getIntervalConverters().length); 
     } finally { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37412);ConverterManager.getInstance().removeIntervalConverter(c); 
     } 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37413);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testGetPeriodConverter690() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s7sg0psva();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPeriodConverter690",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s7sg0psva(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37414); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37415);PeriodConverter c = ConverterManager.getInstance().getPeriodConverter(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37416);assertEquals(ReadablePeriod.class, c.getSupportedType()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37417);c = ConverterManager.getInstance().getPeriodConverter(new Duration(123L)); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37418);assertEquals(ReadableDuration.class, c.getSupportedType()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37419);c = ConverterManager.getInstance().getPeriodConverter(new Interval(0L, 1000L)); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37420);assertEquals(ReadableInterval.class, c.getSupportedType()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37421);c = ConverterManager.getInstance().getPeriodConverter(""); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37422);assertEquals(String.class, c.getSupportedType()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37423);c = ConverterManager.getInstance().getPeriodConverter(null); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37424);assertEquals(null, c.getSupportedType()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37425);try { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37426);ConverterManager.getInstance().getPeriodConverter(Boolean.TRUE); 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37427);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testGetDurationConverterRemovedNull727() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ohox38svo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetDurationConverterRemovedNull727",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37428,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ohox38svo(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37428); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37429);try { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37430);ConverterManager.getInstance().removeDurationConverter(NullConverter.INSTANCE); 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37431);try { 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37432);ConverterManager.getInstance().getDurationConverter(null); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37433);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37434);ConverterManager.getInstance().addDurationConverter(NullConverter.INSTANCE); 
     } 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37435);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testGetIntervalConverter824() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ll4yesvw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetIntervalConverter824",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ll4yesvw(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37436); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37437);IntervalConverter c = ConverterManager.getInstance().getIntervalConverter(new Interval(0L, 1000L)); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37438);assertEquals(ReadableInterval.class, c.getSupportedType()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37439);c = ConverterManager.getInstance().getIntervalConverter(""); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37440);assertEquals(String.class, c.getSupportedType()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37441);c = ConverterManager.getInstance().getIntervalConverter(null); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37442);assertEquals(null, c.getSupportedType()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37443);try { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37444);ConverterManager.getInstance().getIntervalConverter(Boolean.TRUE); 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37445);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37446);try { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37447);ConverterManager.getInstance().getIntervalConverter(new Long(0)); 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37448);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testRemoveInstantConverter3861() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l2gc4ksw9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveInstantConverter3861",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37449,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l2gc4ksw9(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37449); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37450);InstantConverter removed = ConverterManager.getInstance().removeInstantConverter(null); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37451);assertEquals(null, removed); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37452);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testGetInstantConverter886() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kmwauyswd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverter886",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kmwauyswd(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37453); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37454);InstantConverter c = ConverterManager.getInstance().getInstantConverter(new Long(0L)); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37455);assertEquals(Long.class, c.getSupportedType()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37456);c = ConverterManager.getInstance().getInstantConverter(new DateTime()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37457);assertEquals(ReadableInstant.class, c.getSupportedType()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37458);c = ConverterManager.getInstance().getInstantConverter(""); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37459);assertEquals(String.class, c.getSupportedType()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37460);c = ConverterManager.getInstance().getInstantConverter(new Date()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37461);assertEquals(Date.class, c.getSupportedType()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37462);c = ConverterManager.getInstance().getInstantConverter(new GregorianCalendar()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37463);assertEquals(Calendar.class, c.getSupportedType()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37464);c = ConverterManager.getInstance().getInstantConverter(null); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37465);assertEquals(null, c.getSupportedType()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37466);try { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37467);ConverterManager.getInstance().getInstantConverter(Boolean.TRUE); 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37468);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testRemoveIntervalConverter31067() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rob64rswt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveIntervalConverter31067",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37469,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rob64rswt(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37469); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37470);IntervalConverter removed = ConverterManager.getInstance().removeIntervalConverter(null); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37471);assertEquals(null, removed); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37472);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testAddPartialConverter41071() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1614ofaswx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverter41071",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1614ofaswx(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37473); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37474);PartialConverter removed = ConverterManager.getInstance().addPartialConverter(null); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37475);assertEquals(null, removed); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37476);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testGetDurationConverter1202() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lnphousx1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetDurationConverter1202",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37477,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lnphousx1(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37477); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37478);DurationConverter c = ConverterManager.getInstance().getDurationConverter(new Long(0L)); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37479);assertEquals(Long.class, c.getSupportedType()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37480);c = ConverterManager.getInstance().getDurationConverter(new Duration(123L)); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37481);assertEquals(ReadableDuration.class, c.getSupportedType()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37482);c = ConverterManager.getInstance().getDurationConverter(new Interval(0L, 1000L)); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37483);assertEquals(ReadableInterval.class, c.getSupportedType()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37484);c = ConverterManager.getInstance().getDurationConverter(""); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37485);assertEquals(String.class, c.getSupportedType()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37486);c = ConverterManager.getInstance().getDurationConverter(null); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37487);assertEquals(null, c.getSupportedType()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37488);try { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37489);ConverterManager.getInstance().getDurationConverter(Boolean.TRUE); 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37490);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testAddPeriodConverter31253() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mipjhzsxf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPeriodConverter31253",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mipjhzsxf(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37491); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37492);PeriodConverter removed = ConverterManager.getInstance().addPeriodConverter(null); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37493);assertEquals(null, removed); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37494);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length); 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testAddPartialConverter21317() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xucnsdsxj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverter21317",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xucnsdsxj(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37495); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37496);PartialConverter c = new PartialConverter() { 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono) {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37497); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37498);return null; 
         }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono, DateTimeFormatter parser) {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37499); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37500);return null; 
         }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37501); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37502);return null; 
         }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37503); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37504);return null; 
         }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37505); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37506);return String.class; 
         }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 
     }; 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37507);try { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37508);PartialConverter removed = ConverterManager.getInstance().addPartialConverter(c); 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37509);assertEquals(StringConverter.INSTANCE, removed); 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37510);assertEquals(String.class, ConverterManager.getInstance().getPartialConverter("").getSupportedType()); 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37511);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
     } finally { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37512);ConverterManager.getInstance().addPartialConverter(StringConverter.INSTANCE); 
     } 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37513);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testRemovePartialConverter31430() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k8y61xsy2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePartialConverter31430",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k8y61xsy2(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37514); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37515);PartialConverter removed = ConverterManager.getInstance().removePartialConverter(null); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37516);assertEquals(null, removed); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37517);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testGetPartialConverterRemovedNull1486() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jythucsy6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPartialConverterRemovedNull1486",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jythucsy6(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37518); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37519);try { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37520);ConverterManager.getInstance().removePartialConverter(NullConverter.INSTANCE); 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37521);try { 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37522);ConverterManager.getInstance().getPartialConverter(null); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37523);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37524);ConverterManager.getInstance().addPartialConverter(NullConverter.INSTANCE); 
     } 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37525);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testGetPartialConverter1512() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v0q65rsye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPartialConverter1512",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v0q65rsye(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37526); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37527);PartialConverter c = ConverterManager.getInstance().getPartialConverter(new Long(0L)); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37528);assertEquals(Long.class, c.getSupportedType()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37529);c = ConverterManager.getInstance().getPartialConverter(new TimeOfDay()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37530);assertEquals(ReadablePartial.class, c.getSupportedType()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37531);c = ConverterManager.getInstance().getPartialConverter(new DateTime()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37532);assertEquals(ReadableInstant.class, c.getSupportedType()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37533);c = ConverterManager.getInstance().getPartialConverter(""); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37534);assertEquals(String.class, c.getSupportedType()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37535);c = ConverterManager.getInstance().getPartialConverter(new Date()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37536);assertEquals(Date.class, c.getSupportedType()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37537);c = ConverterManager.getInstance().getPartialConverter(new GregorianCalendar()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37538);assertEquals(Calendar.class, c.getSupportedType()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37539);c = ConverterManager.getInstance().getPartialConverter(null); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37540);assertEquals(null, c.getSupportedType()); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37541);try { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37542);ConverterManager.getInstance().getPartialConverter(Boolean.TRUE); 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37543);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testAddPartialConverter31558() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lc9d03syw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverter31558",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lc9d03syw(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37544); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37545);PartialConverter removed = ConverterManager.getInstance().addPartialConverter(StringConverter.INSTANCE); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37546);assertEquals(null, removed); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37547);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testRemovePeriodConverter31600() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zicj86sz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePeriodConverter31600",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37548,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zicj86sz0(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37548); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37549);PeriodConverter removed = ConverterManager.getInstance().removePeriodConverter(null); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37550);assertEquals(null, removed); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37551);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length); 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testAddIntervalConverter31696() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gztyxcsz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddIntervalConverter31696",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gztyxcsz4(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37552); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37553);IntervalConverter removed = ConverterManager.getInstance().addIntervalConverter(null); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37554);assertEquals(null, removed); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37555);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testGetInstantConverterRemovedNull1753() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xbgfjlsz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverterRemovedNull1753",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37556,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xbgfjlsz8(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37556); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37557);try { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37558);ConverterManager.getInstance().removeInstantConverter(NullConverter.INSTANCE); 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37559);try { 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37560);ConverterManager.getInstance().getInstantConverter(null); 
             __CLR4_4_1sr7sr7lc8axevc.R.inc(37561);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         __CLR4_4_1sr7sr7lc8axevc.R.inc(37562);ConverterManager.getInstance().addInstantConverter(NullConverter.INSTANCE); 
     } 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37563);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 


public void testAddDurationConverter31762() {__CLR4_4_1sr7sr7lc8axevc.R.globalSliceStart(getClass().getName(),37564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fctzb3szg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sr7sr7lc8axevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sr7sr7lc8axevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddDurationConverter31762",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fctzb3szg(){try{__CLR4_4_1sr7sr7lc8axevc.R.inc(37564); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37565);DurationConverter removed = ConverterManager.getInstance().addDurationConverter(null); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37566);assertEquals(null, removed); 
     __CLR4_4_1sr7sr7lc8axevc.R.inc(37567);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
 }finally{__CLR4_4_1sr7sr7lc8axevc.R.flushNeeded();}} 

    

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
