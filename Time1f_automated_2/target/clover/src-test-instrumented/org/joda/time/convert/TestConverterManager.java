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
public class TestConverterManager extends TestCase {static class __CLR4_4_1lb9lb9le6nl8nq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,27726,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27621);
        __CLR4_4_1lb9lb9le6nl8nq.R.inc(27622);String str = System.getProperty("java.version");
        __CLR4_4_1lb9lb9le6nl8nq.R.inc(27623);boolean old = true;
        __CLR4_4_1lb9lb9le6nl8nq.R.inc(27624);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1lb9lb9le6nl8nq.R.iget(27625)!=0|true))||(__CLR4_4_1lb9lb9le6nl8nq.R.iget(27626)==0&false))) {{
            __CLR4_4_1lb9lb9le6nl8nq.R.inc(27627);old = false;
        }
        }__CLR4_4_1lb9lb9le6nl8nq.R.inc(27628);OLD_JDK = old;
    }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}}

    private static final Policy RESTRICT;
    private static final Policy ALLOW;
    static {try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27629);
        // don't call Policy.getPolicy()
        __CLR4_4_1lb9lb9le6nl8nq.R.inc(27630);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27631);
                __CLR4_4_1lb9lb9le6nl8nq.R.inc(27632);Permissions p = new Permissions();
                __CLR4_4_1lb9lb9le6nl8nq.R.inc(27633);p.add(new AllPermission());  // enable everything
                __CLR4_4_1lb9lb9le6nl8nq.R.inc(27634);return p;
            }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27635);
            }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27636);
                __CLR4_4_1lb9lb9le6nl8nq.R.inc(27637);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1lb9lb9le6nl8nq.R.iget(27638)!=0|true))||(__CLR4_4_1lb9lb9le6nl8nq.R.iget(27639)==0&false))) {{
                    __CLR4_4_1lb9lb9le6nl8nq.R.inc(27640);return false;
                }
                }__CLR4_4_1lb9lb9le6nl8nq.R.inc(27641);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}}
        };
        __CLR4_4_1lb9lb9le6nl8nq.R.inc(27642);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27643);
                __CLR4_4_1lb9lb9le6nl8nq.R.inc(27644);Permissions p = new Permissions();
                __CLR4_4_1lb9lb9le6nl8nq.R.inc(27645);p.add(new AllPermission());  // enable everything
                __CLR4_4_1lb9lb9le6nl8nq.R.inc(27646);return p;
            }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27647);
            }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}}

    public static void main(String[] args) {try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27648);
        __CLR4_4_1lb9lb9le6nl8nq.R.inc(27649);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27650);
        __CLR4_4_1lb9lb9le6nl8nq.R.inc(27651);return new TestSuite(TestConverterManager.class);
    }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}}

    public TestConverterManager(String name) {
        super(name);__CLR4_4_1lb9lb9le6nl8nq.R.inc(27653);try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27652);
    }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testAddInstantConverter4210() {__CLR4_4_1lb9lb9le6nl8nq.R.globalSliceStart(getClass().getName(),27654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p050mmlc6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb9lb9le6nl8nq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb9lb9le6nl8nq.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddInstantConverter4210",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p050mmlc6(){try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27654); 
     __CLR4_4_1lb9lb9le6nl8nq.R.inc(27655);InstantConverter removed = ConverterManager.getInstance().addInstantConverter(null); 
     __CLR4_4_1lb9lb9le6nl8nq.R.inc(27656);assertEquals(null, removed); 
     __CLR4_4_1lb9lb9le6nl8nq.R.inc(27657);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}}
public void testGetPeriodConverterRemovedNull212() {__CLR4_4_1lb9lb9le6nl8nq.R.globalSliceStart(getClass().getName(),27658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13juu7mlca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb9lb9le6nl8nq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb9lb9le6nl8nq.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPeriodConverterRemovedNull212",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27658,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13juu7mlca(){try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27658); 
     __CLR4_4_1lb9lb9le6nl8nq.R.inc(27659);try { 
         __CLR4_4_1lb9lb9le6nl8nq.R.inc(27660);ConverterManager.getInstance().removeInstantConverter(NullConverter.INSTANCE); 
         __CLR4_4_1lb9lb9le6nl8nq.R.inc(27661);try { 
             __CLR4_4_1lb9lb9le6nl8nq.R.inc(27662);ConverterManager.getInstance().getPeriodConverter(null); 
             __CLR4_4_1lb9lb9le6nl8nq.R.inc(27663);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         __CLR4_4_1lb9lb9le6nl8nq.R.inc(27664);ConverterManager.getInstance().addInstantConverter(NullConverter.INSTANCE); 
     } 
     __CLR4_4_1lb9lb9le6nl8nq.R.inc(27665);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length); 
 }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}}
public void testGetPeriodConverterRemovedNull213() {__CLR4_4_1lb9lb9le6nl8nq.R.globalSliceStart(getClass().getName(),27666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1auvf5lci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb9lb9le6nl8nq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb9lb9le6nl8nq.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPeriodConverterRemovedNull213",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1auvf5lci(){try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27666); 
     __CLR4_4_1lb9lb9le6nl8nq.R.inc(27667);try { 
         __CLR4_4_1lb9lb9le6nl8nq.R.inc(27668);ConverterManager.getInstance().removePeriodConverter(NullConverter.INSTANCE); 
         __CLR4_4_1lb9lb9le6nl8nq.R.inc(27669);try { 
             __CLR4_4_1lb9lb9le6nl8nq.R.inc(27670);ConverterManager.getInstance().getPeriodConverter(null); 
             __CLR4_4_1lb9lb9le6nl8nq.R.inc(27671);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         __CLR4_4_1lb9lb9le6nl8nq.R.inc(27672);ConverterManager.getInstance().addPeriodConverter(NullConverter.INSTANCE); 
     } 
     __CLR4_4_1lb9lb9le6nl8nq.R.inc(27673);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length); 
 }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}}
public void testAddPartialConverter2214() {__CLR4_4_1lb9lb9le6nl8nq.R.globalSliceStart(getClass().getName(),27674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_169hfclcq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb9lb9le6nl8nq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb9lb9le6nl8nq.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverter2214",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_169hfclcq(){try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27674); 
     __CLR4_4_1lb9lb9le6nl8nq.R.inc(27675);PartialConverter c = new PartialConverter() { 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono) {try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27676); 
             __CLR4_4_1lb9lb9le6nl8nq.R.inc(27677);return null; 
         }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}} 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono, DateTimeFormatter parser) {try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27678); 
             __CLR4_4_1lb9lb9le6nl8nq.R.inc(27679);return null; 
         }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27680); 
             __CLR4_4_1lb9lb9le6nl8nq.R.inc(27681);return null; 
         }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27682); 
             __CLR4_4_1lb9lb9le6nl8nq.R.inc(27683);return null; 
         }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27684); 
             __CLR4_4_1lb9lb9le6nl8nq.R.inc(27685);return String.class; 
         }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}} 
     }; 
     __CLR4_4_1lb9lb9le6nl8nq.R.inc(27686);try { 
         __CLR4_4_1lb9lb9le6nl8nq.R.inc(27687);PartialConverter removed = ConverterManager.getInstance().addPartialConverter(c); 
         __CLR4_4_1lb9lb9le6nl8nq.R.inc(27688);assertEquals(StringConverter.INSTANCE, removed); 
         __CLR4_4_1lb9lb9le6nl8nq.R.inc(27689);assertEquals(String.class, ConverterManager.getInstance().getPartialConverter("").getSupportedType()); 
         __CLR4_4_1lb9lb9le6nl8nq.R.inc(27690);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
     } finally { 
         __CLR4_4_1lb9lb9le6nl8nq.R.inc(27691);ConverterManager.getInstance().addPartialConverter(StringConverter.INSTANCE); 
     } 
     __CLR4_4_1lb9lb9le6nl8nq.R.inc(27692);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}}
public void testRemovePartialConverter2215() {__CLR4_4_1lb9lb9le6nl8nq.R.globalSliceStart(getClass().getName(),27693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f8ojk0ld9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb9lb9le6nl8nq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb9lb9le6nl8nq.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePartialConverter2215",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f8ojk0ld9(){try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27693); 
     __CLR4_4_1lb9lb9le6nl8nq.R.inc(27694);PartialConverter c = new PartialConverter() { 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono) {try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27695); 
             __CLR4_4_1lb9lb9le6nl8nq.R.inc(27696);return null; 
         }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}} 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono, DateTimeFormatter parser) {try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27697); 
             __CLR4_4_1lb9lb9le6nl8nq.R.inc(27698);return null; 
         }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27699); 
             __CLR4_4_1lb9lb9le6nl8nq.R.inc(27700);return null; 
         }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27701); 
             __CLR4_4_1lb9lb9le6nl8nq.R.inc(27702);return null; 
         }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27703); 
             __CLR4_4_1lb9lb9le6nl8nq.R.inc(27704);return String.class; 
         }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}} 
     }; 
     __CLR4_4_1lb9lb9le6nl8nq.R.inc(27705);try { 
         __CLR4_4_1lb9lb9le6nl8nq.R.inc(27706);PartialConverter removed = ConverterManager.getInstance().removePartialConverter(c); 
         __CLR4_4_1lb9lb9le6nl8nq.R.inc(27707);assertEquals(StringConverter.INSTANCE, removed); 
         __CLR4_4_1lb9lb9le6nl8nq.R.inc(27708);assertEquals(String.class, ConverterManager.getInstance().getPartialConverter("").getSupportedType()); 
         __CLR4_4_1lb9lb9le6nl8nq.R.inc(27709);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
     } finally { 
         __CLR4_4_1lb9lb9le6nl8nq.R.inc(27710);ConverterManager.getInstance().addPartialConverter(StringConverter.INSTANCE); 
     } 
     __CLR4_4_1lb9lb9le6nl8nq.R.inc(27711);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}}
public void testAddIntervalConverter1216() {__CLR4_4_1lb9lb9le6nl8nq.R.globalSliceStart(getClass().getName(),27712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_166zlvdlds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lb9lb9le6nl8nq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lb9lb9le6nl8nq.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddIntervalConverter1216",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27712,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_166zlvdlds(){try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27712); 
     __CLR4_4_1lb9lb9le6nl8nq.R.inc(27713);IntervalConverter c = new IntervalConverter() { 
  
         public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27714); 
             __CLR4_4_1lb9lb9le6nl8nq.R.inc(27715);return false; 
         }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}} 
  
         public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27716); 
         }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1lb9lb9le6nl8nq.R.inc(27717); 
             __CLR4_4_1lb9lb9le6nl8nq.R.inc(27718);return Boolean.class; 
         }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}} 
     }; 
     __CLR4_4_1lb9lb9le6nl8nq.R.inc(27719);try { 
         __CLR4_4_1lb9lb9le6nl8nq.R.inc(27720);IntervalConverter removed = ConverterManager.getInstance().addIntervalConverter(c); 
         __CLR4_4_1lb9lb9le6nl8nq.R.inc(27721);assertEquals(null, removed); 
         __CLR4_4_1lb9lb9le6nl8nq.R.inc(27722);assertEquals(Boolean.class, ConverterManager.getInstance().getIntervalConverter(Boolean.TRUE).getSupportedType()); 
         __CLR4_4_1lb9lb9le6nl8nq.R.inc(27723);assertEquals(INTERVAL_SIZE + 1, ConverterManager.getInstance().getIntervalConverters().length); 
     } finally { 
         __CLR4_4_1lb9lb9le6nl8nq.R.inc(27724);ConverterManager.getInstance().removeIntervalConverter(c); 
     } 
     __CLR4_4_1lb9lb9le6nl8nq.R.inc(27725);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 }finally{__CLR4_4_1lb9lb9le6nl8nq.R.flushNeeded();}}
    

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
