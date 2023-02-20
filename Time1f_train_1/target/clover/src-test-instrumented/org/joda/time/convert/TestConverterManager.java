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
public class TestConverterManager extends TestCase {static class __CLR4_4_1r8mr8mle6qeaip{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,35547,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35302);
        __CLR4_4_1r8mr8mle6qeaip.R.inc(35303);String str = System.getProperty("java.version");
        __CLR4_4_1r8mr8mle6qeaip.R.inc(35304);boolean old = true;
        __CLR4_4_1r8mr8mle6qeaip.R.inc(35305);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1r8mr8mle6qeaip.R.iget(35306)!=0|true))||(__CLR4_4_1r8mr8mle6qeaip.R.iget(35307)==0&false))) {{
            __CLR4_4_1r8mr8mle6qeaip.R.inc(35308);old = false;
        }
        }__CLR4_4_1r8mr8mle6qeaip.R.inc(35309);OLD_JDK = old;
    }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}}

    private static final Policy RESTRICT;
    private static final Policy ALLOW;
    static {try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35310);
        // don't call Policy.getPolicy()
        __CLR4_4_1r8mr8mle6qeaip.R.inc(35311);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35312);
                __CLR4_4_1r8mr8mle6qeaip.R.inc(35313);Permissions p = new Permissions();
                __CLR4_4_1r8mr8mle6qeaip.R.inc(35314);p.add(new AllPermission());  // enable everything
                __CLR4_4_1r8mr8mle6qeaip.R.inc(35315);return p;
            }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35316);
            }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35317);
                __CLR4_4_1r8mr8mle6qeaip.R.inc(35318);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1r8mr8mle6qeaip.R.iget(35319)!=0|true))||(__CLR4_4_1r8mr8mle6qeaip.R.iget(35320)==0&false))) {{
                    __CLR4_4_1r8mr8mle6qeaip.R.inc(35321);return false;
                }
                }__CLR4_4_1r8mr8mle6qeaip.R.inc(35322);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}}
        };
        __CLR4_4_1r8mr8mle6qeaip.R.inc(35323);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35324);
                __CLR4_4_1r8mr8mle6qeaip.R.inc(35325);Permissions p = new Permissions();
                __CLR4_4_1r8mr8mle6qeaip.R.inc(35326);p.add(new AllPermission());  // enable everything
                __CLR4_4_1r8mr8mle6qeaip.R.inc(35327);return p;
            }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35328);
            }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}}

    public static void main(String[] args) {try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35329);
        __CLR4_4_1r8mr8mle6qeaip.R.inc(35330);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35331);
        __CLR4_4_1r8mr8mle6qeaip.R.inc(35332);return new TestSuite(TestConverterManager.class);
    }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}}

    public TestConverterManager(String name) {
        super(name);__CLR4_4_1r8mr8mle6qeaip.R.inc(35334);try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35333);
    }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGetPeriodConverter460() {__CLR4_4_1r8mr8mle6qeaip.R.globalSliceStart(getClass().getName(),35335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ed163er9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r8mr8mle6qeaip.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r8mr8mle6qeaip.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPeriodConverter460",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35335,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ed163er9j(){try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35335); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35336);PeriodConverter c = ConverterManager.getInstance().getPeriodConverter(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35337);assertEquals(ReadablePeriod.class, c.getSupportedType()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35338);c = ConverterManager.getInstance().getPeriodConverter(new Duration(123L)); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35339);assertEquals(ReadableDuration.class, c.getSupportedType()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35340);c = ConverterManager.getInstance().getPeriodConverter(new Interval(0L, 1000L)); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35341);assertEquals(ReadableInterval.class, c.getSupportedType()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35342);c = ConverterManager.getInstance().getPeriodConverter(""); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35343);assertEquals(String.class, c.getSupportedType()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35344);c = ConverterManager.getInstance().getPeriodConverter(null); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35345);assertEquals(null, c.getSupportedType()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35346);try { 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35347);ConverterManager.getInstance().getPeriodConverter(Boolean.TRUE); 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35348);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 


public void testGetInstantConverter461() {__CLR4_4_1r8mr8mle6qeaip.R.globalSliceStart(getClass().getName(),35349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oiph8zr9x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r8mr8mle6qeaip.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r8mr8mle6qeaip.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverter461",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oiph8zr9x(){try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35349); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35350);InstantConverter c = ConverterManager.getInstance().getInstantConverter(new Long(0L)); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35351);assertEquals(Long.class, c.getSupportedType()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35352);c = ConverterManager.getInstance().getInstantConverter(new DateTime()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35353);assertEquals(ReadableInstant.class, c.getSupportedType()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35354);c = ConverterManager.getInstance().getInstantConverter(""); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35355);assertEquals(String.class, c.getSupportedType()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35356);c = ConverterManager.getInstance().getInstantConverter(new Date()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35357);assertEquals(Date.class, c.getSupportedType()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35358);c = ConverterManager.getInstance().getInstantConverter(new GregorianCalendar()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35359);assertEquals(Calendar.class, c.getSupportedType()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35360);c = ConverterManager.getInstance().getInstantConverter(null); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35361);assertEquals(null, c.getSupportedType()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35362);try { 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35363);ConverterManager.getInstance().getInstantConverter(Boolean.TRUE); 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35364);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 


public void testGetInstantConverterRemovedNull462() {__CLR4_4_1r8mr8mle6qeaip.R.globalSliceStart(getClass().getName(),35365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18um6ibrad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r8mr8mle6qeaip.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r8mr8mle6qeaip.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverterRemovedNull462",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18um6ibrad(){try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35365); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35366);try { 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35367);ConverterManager.getInstance().removeInstantConverter(NullConverter.INSTANCE); 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35368);try { 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35369);ConverterManager.getInstance().getInstantConverter(null); 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35370);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35371);ConverterManager.getInstance().addInstantConverter(NullConverter.INSTANCE); 
     } 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35372);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 


public void testGetInstantConverterOKMultipleMatches463() {__CLR4_4_1r8mr8mle6qeaip.R.globalSliceStart(getClass().getName(),35373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ssedf8ral();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r8mr8mle6qeaip.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r8mr8mle6qeaip.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverterOKMultipleMatches463",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35373,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ssedf8ral(){try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35373); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35374);InstantConverter c = new InstantConverter() { 
  
         public long getInstantMillis(Object object, Chronology chrono) {try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35375); 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35376);return 0; 
         }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35377); 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35378);return null; 
         }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35379); 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35380);return null; 
         }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35381); 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35382);return ReadableDateTime.class; 
         }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 
     }; 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35383);try { 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35384);ConverterManager.getInstance().addInstantConverter(c); 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35385);InstantConverter ok = ConverterManager.getInstance().getInstantConverter(new DateTime()); 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35386);assertEquals(ReadableDateTime.class, ok.getSupportedType()); 
     } finally { 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35387);ConverterManager.getInstance().removeInstantConverter(c); 
     } 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35388);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 


public void testAddInstantConverter4464() {__CLR4_4_1r8mr8mle6qeaip.R.globalSliceStart(getClass().getName(),35389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19qs4fhrb1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r8mr8mle6qeaip.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r8mr8mle6qeaip.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddInstantConverter4464",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35389,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19qs4fhrb1(){try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35389); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35390);InstantConverter removed = ConverterManager.getInstance().addInstantConverter(null); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35391);assertEquals(null, removed); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35392);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 


public void testGetPartialConverter465() {__CLR4_4_1r8mr8mle6qeaip.R.globalSliceStart(getClass().getName(),35393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_130npzdrb5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r8mr8mle6qeaip.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r8mr8mle6qeaip.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPartialConverter465",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35393,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_130npzdrb5(){try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35393); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35394);PartialConverter c = ConverterManager.getInstance().getPartialConverter(new Long(0L)); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35395);assertEquals(Long.class, c.getSupportedType()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35396);c = ConverterManager.getInstance().getPartialConverter(new TimeOfDay()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35397);assertEquals(ReadablePartial.class, c.getSupportedType()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35398);c = ConverterManager.getInstance().getPartialConverter(new DateTime()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35399);assertEquals(ReadableInstant.class, c.getSupportedType()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35400);c = ConverterManager.getInstance().getPartialConverter(""); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35401);assertEquals(String.class, c.getSupportedType()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35402);c = ConverterManager.getInstance().getPartialConverter(new Date()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35403);assertEquals(Date.class, c.getSupportedType()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35404);c = ConverterManager.getInstance().getPartialConverter(new GregorianCalendar()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35405);assertEquals(Calendar.class, c.getSupportedType()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35406);c = ConverterManager.getInstance().getPartialConverter(null); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35407);assertEquals(null, c.getSupportedType()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35408);try { 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35409);ConverterManager.getInstance().getPartialConverter(Boolean.TRUE); 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35410);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 


public void testGetPartialConverterRemovedNull466() {__CLR4_4_1r8mr8mle6qeaip.R.globalSliceStart(getClass().getName(),35411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1onfullrbn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r8mr8mle6qeaip.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r8mr8mle6qeaip.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPartialConverterRemovedNull466",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35411,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1onfullrbn(){try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35411); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35412);try { 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35413);ConverterManager.getInstance().removePartialConverter(NullConverter.INSTANCE); 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35414);try { 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35415);ConverterManager.getInstance().getPartialConverter(null); 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35416);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35417);ConverterManager.getInstance().addPartialConverter(NullConverter.INSTANCE); 
     } 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35418);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 


public void testRemovePartialConverter3467() {__CLR4_4_1r8mr8mle6qeaip.R.globalSliceStart(getClass().getName(),35419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1suq5dqrbv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r8mr8mle6qeaip.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r8mr8mle6qeaip.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePartialConverter3467",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1suq5dqrbv(){try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35419); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35420);PartialConverter removed = ConverterManager.getInstance().removePartialConverter(null); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35421);assertEquals(null, removed); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35422);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 


public void testAddPartialConverter4468() {__CLR4_4_1r8mr8mle6qeaip.R.globalSliceStart(getClass().getName(),35423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p4zo1jrbz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r8mr8mle6qeaip.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r8mr8mle6qeaip.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverter4468",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35423,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p4zo1jrbz(){try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35423); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35424);PartialConverter removed = ConverterManager.getInstance().addPartialConverter(null); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35425);assertEquals(null, removed); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35426);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 


public void testGetPartialConverterOKMultipleMatches469() {__CLR4_4_1r8mr8mle6qeaip.R.globalSliceStart(getClass().getName(),35427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vi9aeerc3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r8mr8mle6qeaip.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r8mr8mle6qeaip.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPartialConverterOKMultipleMatches469",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vi9aeerc3(){try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35427); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35428);PartialConverter c = new PartialConverter() { 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono) {try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35429); 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35430);return null; 
         }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono, DateTimeFormatter parser) {try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35431); 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35432);return null; 
         }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35433); 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35434);return null; 
         }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35435); 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35436);return null; 
         }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35437); 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35438);return ReadableDateTime.class; 
         }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 
     }; 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35439);try { 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35440);ConverterManager.getInstance().addPartialConverter(c); 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35441);PartialConverter ok = ConverterManager.getInstance().getPartialConverter(new DateTime()); 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35442);assertEquals(ReadableDateTime.class, ok.getSupportedType()); 
     } finally { 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35443);ConverterManager.getInstance().removePartialConverter(c); 
     } 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35444);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 


public void testGetDurationConverter470() {__CLR4_4_1r8mr8mle6qeaip.R.globalSliceStart(getClass().getName(),35445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1io1wssrcl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r8mr8mle6qeaip.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r8mr8mle6qeaip.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetDurationConverter470",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1io1wssrcl(){try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35445); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35446);DurationConverter c = ConverterManager.getInstance().getDurationConverter(new Long(0L)); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35447);assertEquals(Long.class, c.getSupportedType()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35448);c = ConverterManager.getInstance().getDurationConverter(new Duration(123L)); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35449);assertEquals(ReadableDuration.class, c.getSupportedType()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35450);c = ConverterManager.getInstance().getDurationConverter(new Interval(0L, 1000L)); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35451);assertEquals(ReadableInterval.class, c.getSupportedType()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35452);c = ConverterManager.getInstance().getDurationConverter(""); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35453);assertEquals(String.class, c.getSupportedType()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35454);c = ConverterManager.getInstance().getDurationConverter(null); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35455);assertEquals(null, c.getSupportedType()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35456);try { 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35457);ConverterManager.getInstance().getDurationConverter(Boolean.TRUE); 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35458);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 


public void testGetDurationConverterRemovedNull471() {__CLR4_4_1r8mr8mle6qeaip.R.globalSliceStart(getClass().getName(),35459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hxblp2rcz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r8mr8mle6qeaip.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r8mr8mle6qeaip.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetDurationConverterRemovedNull471",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35459,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hxblp2rcz(){try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35459); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35460);try { 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35461);ConverterManager.getInstance().removeDurationConverter(NullConverter.INSTANCE); 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35462);try { 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35463);ConverterManager.getInstance().getDurationConverter(null); 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35464);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35465);ConverterManager.getInstance().addDurationConverter(NullConverter.INSTANCE); 
     } 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35466);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
 }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 


public void testAddDurationConverter3472() {__CLR4_4_1r8mr8mle6qeaip.R.globalSliceStart(getClass().getName(),35467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ypacrkrd7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r8mr8mle6qeaip.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r8mr8mle6qeaip.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddDurationConverter3472",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ypacrkrd7(){try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35467); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35468);DurationConverter removed = ConverterManager.getInstance().addDurationConverter(null); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35469);assertEquals(null, removed); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35470);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
 }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 


public void testRemoveDurationConverter3473() {__CLR4_4_1r8mr8mle6qeaip.R.globalSliceStart(getClass().getName(),35471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lwe4smrdb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r8mr8mle6qeaip.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r8mr8mle6qeaip.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveDurationConverter3473",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lwe4smrdb(){try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35471); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35472);DurationConverter removed = ConverterManager.getInstance().removeDurationConverter(null); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35473);assertEquals(null, removed); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35474);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
 }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 


public void testGetPeriodConverterRemovedNull474() {__CLR4_4_1r8mr8mle6qeaip.R.globalSliceStart(getClass().getName(),35475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yxd0y4rdf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r8mr8mle6qeaip.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r8mr8mle6qeaip.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPeriodConverterRemovedNull474",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35475,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yxd0y4rdf(){try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35475); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35476);try { 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35477);ConverterManager.getInstance().removePeriodConverter(NullConverter.INSTANCE); 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35478);try { 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35479);ConverterManager.getInstance().getPeriodConverter(null); 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35480);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35481);ConverterManager.getInstance().addPeriodConverter(NullConverter.INSTANCE); 
     } 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35482);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length); 
 }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 


public void testAddPeriodConverter3475() {__CLR4_4_1r8mr8mle6qeaip.R.globalSliceStart(getClass().getName(),35483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17dmzardn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r8mr8mle6qeaip.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r8mr8mle6qeaip.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPeriodConverter3475",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17dmzardn(){try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35483); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35484);PeriodConverter removed = ConverterManager.getInstance().addPeriodConverter(null); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35485);assertEquals(null, removed); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35486);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length); 
 }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 


public void testAddIntervalConverter1476() {__CLR4_4_1r8mr8mle6qeaip.R.globalSliceStart(getClass().getName(),35487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wuwiizrdr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r8mr8mle6qeaip.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r8mr8mle6qeaip.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddIntervalConverter1476",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wuwiizrdr(){try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35487); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35488);IntervalConverter c = new IntervalConverter() { 
  
         public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35489); 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35490);return false; 
         }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 
  
         public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35491); 
         }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35492); 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35493);return Boolean.class; 
         }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 
     }; 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35494);try { 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35495);IntervalConverter removed = ConverterManager.getInstance().addIntervalConverter(c); 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35496);assertEquals(null, removed); 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35497);assertEquals(Boolean.class, ConverterManager.getInstance().getIntervalConverter(Boolean.TRUE).getSupportedType()); 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35498);assertEquals(INTERVAL_SIZE + 1, ConverterManager.getInstance().getIntervalConverters().length); 
     } finally { 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35499);ConverterManager.getInstance().removeIntervalConverter(c); 
     } 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35500);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 


public void testGetIntervalConverter477() {__CLR4_4_1r8mr8mle6qeaip.R.globalSliceStart(getClass().getName(),35501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g7vxmsre5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r8mr8mle6qeaip.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r8mr8mle6qeaip.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetIntervalConverter477",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35501,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g7vxmsre5(){try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35501); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35502);IntervalConverter c = ConverterManager.getInstance().getIntervalConverter(new Interval(0L, 1000L)); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35503);assertEquals(ReadableInterval.class, c.getSupportedType()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35504);c = ConverterManager.getInstance().getIntervalConverter(""); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35505);assertEquals(String.class, c.getSupportedType()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35506);c = ConverterManager.getInstance().getIntervalConverter(null); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35507);assertEquals(null, c.getSupportedType()); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35508);try { 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35509);ConverterManager.getInstance().getIntervalConverter(Boolean.TRUE); 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35510);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35511);try { 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35512);ConverterManager.getInstance().getIntervalConverter(new Long(0)); 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35513);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 


public void testGetIntervalConverterRemovedNull478() {__CLR4_4_1r8mr8mle6qeaip.R.globalSliceStart(getClass().getName(),35514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m3wo0crei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r8mr8mle6qeaip.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r8mr8mle6qeaip.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetIntervalConverterRemovedNull478",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m3wo0crei(){try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35514); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35515);try { 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35516);ConverterManager.getInstance().removeIntervalConverter(NullConverter.INSTANCE); 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35517);try { 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35518);ConverterManager.getInstance().getIntervalConverter(null); 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35519);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35520);ConverterManager.getInstance().addIntervalConverter(NullConverter.INSTANCE); 
     } 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35521);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 


public void testAddIntervalConverter3479() {__CLR4_4_1r8mr8mle6qeaip.R.globalSliceStart(getClass().getName(),35522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dejbqireq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r8mr8mle6qeaip.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r8mr8mle6qeaip.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddIntervalConverter3479",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35522,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dejbqireq(){try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35522); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35523);IntervalConverter removed = ConverterManager.getInstance().addIntervalConverter(null); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35524);assertEquals(null, removed); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35525);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 


public void testRemoveIntervalConverter3480() {__CLR4_4_1r8mr8mle6qeaip.R.globalSliceStart(getClass().getName(),35526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r8iorreu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r8mr8mle6qeaip.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r8mr8mle6qeaip.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveIntervalConverter3480",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r8iorreu(){try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35526); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35527);IntervalConverter removed = ConverterManager.getInstance().removeIntervalConverter(null); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35528);assertEquals(null, removed); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35529);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 


public void testGetInstantConverterBadMultipleMatches1102() {__CLR4_4_1r8mr8mle6qeaip.R.globalSliceStart(getClass().getName(),35530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qqxroqrey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r8mr8mle6qeaip.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r8mr8mle6qeaip.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverterBadMultipleMatches1102",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35530,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qqxroqrey(){try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35530); 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35531);InstantConverter c = new InstantConverter() { 
  
         public long getInstantMillis(Object object, Chronology chrono) {try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35532); 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35533);return 0; 
         }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35534); 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35535);return null; 
         }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35536); 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35537);return null; 
         }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1r8mr8mle6qeaip.R.inc(35538); 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35539);return Serializable.class; 
         }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 
     }; 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35540);try { 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35541);ConverterManager.getInstance().addInstantConverter(c); 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35542);try { 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35543);ConverterManager.getInstance().getInstantConverter(new DateTime()); 
             __CLR4_4_1r8mr8mle6qeaip.R.inc(35544);fail(); 
         } catch (IllegalStateException ex) { 
         } 
     } finally { 
         __CLR4_4_1r8mr8mle6qeaip.R.inc(35545);ConverterManager.getInstance().removeInstantConverter(c); 
     } 
     __CLR4_4_1r8mr8mle6qeaip.R.inc(35546);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 }finally{__CLR4_4_1r8mr8mle6qeaip.R.flushNeeded();}} 

    

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
