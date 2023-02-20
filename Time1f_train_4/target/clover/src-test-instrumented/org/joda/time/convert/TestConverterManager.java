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
public class TestConverterManager extends TestCase {static class __CLR4_4_1r9tr9tle6rjdh8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,35616,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35345);
        __CLR4_4_1r9tr9tle6rjdh8.R.inc(35346);String str = System.getProperty("java.version");
        __CLR4_4_1r9tr9tle6rjdh8.R.inc(35347);boolean old = true;
        __CLR4_4_1r9tr9tle6rjdh8.R.inc(35348);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1r9tr9tle6rjdh8.R.iget(35349)!=0|true))||(__CLR4_4_1r9tr9tle6rjdh8.R.iget(35350)==0&false))) {{
            __CLR4_4_1r9tr9tle6rjdh8.R.inc(35351);old = false;
        }
        }__CLR4_4_1r9tr9tle6rjdh8.R.inc(35352);OLD_JDK = old;
    }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}}

    private static final Policy RESTRICT;
    private static final Policy ALLOW;
    static {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35353);
        // don't call Policy.getPolicy()
        __CLR4_4_1r9tr9tle6rjdh8.R.inc(35354);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35355);
                __CLR4_4_1r9tr9tle6rjdh8.R.inc(35356);Permissions p = new Permissions();
                __CLR4_4_1r9tr9tle6rjdh8.R.inc(35357);p.add(new AllPermission());  // enable everything
                __CLR4_4_1r9tr9tle6rjdh8.R.inc(35358);return p;
            }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35359);
            }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35360);
                __CLR4_4_1r9tr9tle6rjdh8.R.inc(35361);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1r9tr9tle6rjdh8.R.iget(35362)!=0|true))||(__CLR4_4_1r9tr9tle6rjdh8.R.iget(35363)==0&false))) {{
                    __CLR4_4_1r9tr9tle6rjdh8.R.inc(35364);return false;
                }
                }__CLR4_4_1r9tr9tle6rjdh8.R.inc(35365);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}}
        };
        __CLR4_4_1r9tr9tle6rjdh8.R.inc(35366);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35367);
                __CLR4_4_1r9tr9tle6rjdh8.R.inc(35368);Permissions p = new Permissions();
                __CLR4_4_1r9tr9tle6rjdh8.R.inc(35369);p.add(new AllPermission());  // enable everything
                __CLR4_4_1r9tr9tle6rjdh8.R.inc(35370);return p;
            }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35371);
            }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}}

    public static void main(String[] args) {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35372);
        __CLR4_4_1r9tr9tle6rjdh8.R.inc(35373);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35374);
        __CLR4_4_1r9tr9tle6rjdh8.R.inc(35375);return new TestSuite(TestConverterManager.class);
    }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}}

    public TestConverterManager(String name) {
        super(name);__CLR4_4_1r9tr9tle6rjdh8.R.inc(35377);try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35376);
    }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGetPeriodConverter468() {__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceStart(getClass().getName(),35378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uo35jyraq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9tr9tle6rjdh8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPeriodConverter468",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uo35jyraq(){try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35378); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35379);PeriodConverter c = ConverterManager.getInstance().getPeriodConverter(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35380);assertEquals(ReadablePeriod.class, c.getSupportedType()); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35381);c = ConverterManager.getInstance().getPeriodConverter(new Duration(123L)); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35382);assertEquals(ReadableDuration.class, c.getSupportedType()); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35383);c = ConverterManager.getInstance().getPeriodConverter(new Interval(0L, 1000L)); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35384);assertEquals(ReadableInterval.class, c.getSupportedType()); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35385);c = ConverterManager.getInstance().getPeriodConverter(""); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35386);assertEquals(String.class, c.getSupportedType()); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35387);c = ConverterManager.getInstance().getPeriodConverter(null); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35388);assertEquals(null, c.getSupportedType()); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35389);try { 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35390);ConverterManager.getInstance().getPeriodConverter(Boolean.TRUE); 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35391);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 


public void testGetInstantConverter469() {__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceStart(getClass().getName(),35392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kieuedrb4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9tr9tle6rjdh8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverter469",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35392,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kieuedrb4(){try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35392); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35393);InstantConverter c = ConverterManager.getInstance().getInstantConverter(new Long(0L)); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35394);assertEquals(Long.class, c.getSupportedType()); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35395);c = ConverterManager.getInstance().getInstantConverter(new DateTime()); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35396);assertEquals(ReadableInstant.class, c.getSupportedType()); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35397);c = ConverterManager.getInstance().getInstantConverter(""); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35398);assertEquals(String.class, c.getSupportedType()); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35399);c = ConverterManager.getInstance().getInstantConverter(new Date()); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35400);assertEquals(Date.class, c.getSupportedType()); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35401);c = ConverterManager.getInstance().getInstantConverter(new GregorianCalendar()); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35402);assertEquals(Calendar.class, c.getSupportedType()); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35403);c = ConverterManager.getInstance().getInstantConverter(null); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35404);assertEquals(null, c.getSupportedType()); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35405);try { 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35406);ConverterManager.getInstance().getInstantConverter(Boolean.TRUE); 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35407);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 


public void testGetInstantConverterRemovedNull470() {__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceStart(getClass().getName(),35408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w2h5gwrbk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9tr9tle6rjdh8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverterRemovedNull470",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35408,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w2h5gwrbk(){try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35408); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35409);try { 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35410);ConverterManager.getInstance().removeInstantConverter(NullConverter.INSTANCE); 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35411);try { 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35412);ConverterManager.getInstance().getInstantConverter(null); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35413);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35414);ConverterManager.getInstance().addInstantConverter(NullConverter.INSTANCE); 
     } 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35415);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 


public void testGetInstantConverterOKMultipleMatches471() {__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceStart(getClass().getName(),35416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0uplbrbs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9tr9tle6rjdh8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverterOKMultipleMatches471",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35416,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0uplbrbs(){try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35416); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35417);InstantConverter c = new InstantConverter() { 
  
         public long getInstantMillis(Object object, Chronology chrono) {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35418); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35419);return 0; 
         }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35420); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35421);return null; 
         }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35422); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35423);return null; 
         }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35424); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35425);return ReadableDateTime.class; 
         }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 
     }; 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35426);try { 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35427);ConverterManager.getInstance().addInstantConverter(c); 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35428);InstantConverter ok = ConverterManager.getInstance().getInstantConverter(new DateTime()); 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35429);assertEquals(ReadableDateTime.class, ok.getSupportedType()); 
     } finally { 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35430);ConverterManager.getInstance().removeInstantConverter(c); 
     } 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35431);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 


public void testAddInstantConverter4472() {__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceStart(getClass().getName(),35432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dh2uj4rc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9tr9tle6rjdh8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddInstantConverter4472",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dh2uj4rc8(){try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35432); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35433);InstantConverter removed = ConverterManager.getInstance().addInstantConverter(null); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35434);assertEquals(null, removed); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35435);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 


public void testRemoveInstantConverter3473() {__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceStart(getClass().getName(),35436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1not9g9rcc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9tr9tle6rjdh8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveInstantConverter3473",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1not9g9rcc(){try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35436); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35437);InstantConverter removed = ConverterManager.getInstance().removeInstantConverter(null); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35438);assertEquals(null, removed); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35439);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 


public void testAddPartialConverter2474() {__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceStart(getClass().getName(),35440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w5hf04rcg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9tr9tle6rjdh8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverter2474",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w5hf04rcg(){try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35440); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35441);PartialConverter c = new PartialConverter() { 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono) {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35442); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35443);return null; 
         }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono, DateTimeFormatter parser) {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35444); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35445);return null; 
         }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35446); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35447);return null; 
         }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35448); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35449);return null; 
         }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35450); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35451);return String.class; 
         }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 
     }; 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35452);try { 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35453);PartialConverter removed = ConverterManager.getInstance().addPartialConverter(c); 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35454);assertEquals(StringConverter.INSTANCE, removed); 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35455);assertEquals(String.class, ConverterManager.getInstance().getPartialConverter("").getSupportedType()); 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35456);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
     } finally { 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35457);ConverterManager.getInstance().addPartialConverter(StringConverter.INSTANCE); 
     } 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35458);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 


public void testGetPartialConverterRemovedNull475() {__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceStart(getClass().getName(),35459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11tf35hrcz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9tr9tle6rjdh8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPartialConverterRemovedNull475",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35459,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11tf35hrcz(){try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35459); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35460);try { 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35461);ConverterManager.getInstance().removePartialConverter(NullConverter.INSTANCE); 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35462);try { 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35463);ConverterManager.getInstance().getPartialConverter(null); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35464);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35465);ConverterManager.getInstance().addPartialConverter(NullConverter.INSTANCE); 
     } 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35466);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 


public void testRemovePartialConverter3476() {__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceStart(getClass().getName(),35467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fpiyucrd7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9tr9tle6rjdh8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePartialConverter3476",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fpiyucrd7(){try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35467); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35468);PartialConverter removed = ConverterManager.getInstance().removePartialConverter(null); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35469);assertEquals(null, removed); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35470);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 


public void testAddPartialConverter4477() {__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceStart(getClass().getName(),35471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jf9g6jrdb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9tr9tle6rjdh8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverter4477",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jf9g6jrdb(){try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35471); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35472);PartialConverter removed = ConverterManager.getInstance().addPartialConverter(null); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35473);assertEquals(null, removed); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35474);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 


public void testGetPartialConverterOKMultipleMatches478() {__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceStart(getClass().getName(),35475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_151ecncrdf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9tr9tle6rjdh8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPartialConverterOKMultipleMatches478",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35475,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_151ecncrdf(){try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35475); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35476);PartialConverter c = new PartialConverter() { 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono) {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35477); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35478);return null; 
         }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono, DateTimeFormatter parser) {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35479); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35480);return null; 
         }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35481); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35482);return null; 
         }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35483); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35484);return null; 
         }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35485); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35486);return ReadableDateTime.class; 
         }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 
     }; 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35487);try { 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35488);ConverterManager.getInstance().addPartialConverter(c); 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35489);PartialConverter ok = ConverterManager.getInstance().getPartialConverter(new DateTime()); 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35490);assertEquals(ReadableDateTime.class, ok.getSupportedType()); 
     } finally { 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35491);ConverterManager.getInstance().removePartialConverter(c); 
     } 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35492);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 


public void testGetDurationConverter479() {__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceStart(getClass().getName(),35493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n42g23rdx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9tr9tle6rjdh8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetDurationConverter479",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35493,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n42g23rdx(){try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35493); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35494);DurationConverter c = ConverterManager.getInstance().getDurationConverter(new Long(0L)); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35495);assertEquals(Long.class, c.getSupportedType()); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35496);c = ConverterManager.getInstance().getDurationConverter(new Duration(123L)); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35497);assertEquals(ReadableDuration.class, c.getSupportedType()); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35498);c = ConverterManager.getInstance().getDurationConverter(new Interval(0L, 1000L)); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35499);assertEquals(ReadableInterval.class, c.getSupportedType()); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35500);c = ConverterManager.getInstance().getDurationConverter(""); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35501);assertEquals(String.class, c.getSupportedType()); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35502);c = ConverterManager.getInstance().getDurationConverter(null); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35503);assertEquals(null, c.getSupportedType()); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35504);try { 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35505);ConverterManager.getInstance().getDurationConverter(Boolean.TRUE); 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35506);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 


public void testGetDurationConverterRemovedNull480() {__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceStart(getClass().getName(),35507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qmxij0reb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9tr9tle6rjdh8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetDurationConverterRemovedNull480",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35507,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qmxij0reb(){try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35507); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35508);try { 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35509);ConverterManager.getInstance().removeDurationConverter(NullConverter.INSTANCE); 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35510);try { 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35511);ConverterManager.getInstance().getDurationConverter(null); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35512);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35513);ConverterManager.getInstance().addDurationConverter(NullConverter.INSTANCE); 
     } 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35514);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
 }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 


public void testAddDurationConverter2481() {__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceStart(getClass().getName(),35515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1epneo1rej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9tr9tle6rjdh8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddDurationConverter2481",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35515,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1epneo1rej(){try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35515); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35516);DurationConverter c = new DurationConverter() { 
  
         public long getDurationMillis(Object object) {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35517); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35518);return 0; 
         }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35519); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35520);return String.class; 
         }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 
     }; 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35521);try { 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35522);DurationConverter removed = ConverterManager.getInstance().addDurationConverter(c); 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35523);assertEquals(StringConverter.INSTANCE, removed); 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35524);assertEquals(String.class, ConverterManager.getInstance().getDurationConverter("").getSupportedType()); 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35525);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
     } finally { 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35526);ConverterManager.getInstance().addDurationConverter(StringConverter.INSTANCE); 
     } 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35527);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
 }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 


public void testAddDurationConverter3482() {__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceStart(getClass().getName(),35528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16lyso1rew();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9tr9tle6rjdh8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddDurationConverter3482",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16lyso1rew(){try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35528); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35529);DurationConverter removed = ConverterManager.getInstance().addDurationConverter(null); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35530);assertEquals(null, removed); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35531);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
 }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 


public void testGetPeriodConverterRemovedNull483() {__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceStart(getClass().getName(),35532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19mw39yrf0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9tr9tle6rjdh8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPeriodConverterRemovedNull483",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19mw39yrf0(){try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35532); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35533);try { 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35534);ConverterManager.getInstance().removePeriodConverter(NullConverter.INSTANCE); 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35535);try { 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35536);ConverterManager.getInstance().getPeriodConverter(null); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35537);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35538);ConverterManager.getInstance().addPeriodConverter(NullConverter.INSTANCE); 
     } 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35539);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length); 
 }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 


public void testAddPeriodConverter3484() {__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceStart(getClass().getName(),35540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qo8kqcrf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9tr9tle6rjdh8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPeriodConverter3484",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35540,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qo8kqcrf8(){try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35540); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35541);PeriodConverter removed = ConverterManager.getInstance().addPeriodConverter(null); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35542);assertEquals(null, removed); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35543);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length); 
 }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 


public void testRemovePeriodConverter3485() {__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceStart(getClass().getName(),35544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xuotrmrfc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9tr9tle6rjdh8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePeriodConverter3485",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xuotrmrfc(){try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35544); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35545);PeriodConverter removed = ConverterManager.getInstance().removePeriodConverter(null); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35546);assertEquals(null, removed); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35547);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length); 
 }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 


public void testAddIntervalConverter1486() {__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceStart(getClass().getName(),35548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1351lzgrfg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9tr9tle6rjdh8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddIntervalConverter1486",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35548,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1351lzgrfg(){try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35548); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35549);IntervalConverter c = new IntervalConverter() { 
  
         public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35550); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35551);return false; 
         }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 
  
         public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35552); 
         }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35553); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35554);return Boolean.class; 
         }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 
     }; 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35555);try { 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35556);IntervalConverter removed = ConverterManager.getInstance().addIntervalConverter(c); 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35557);assertEquals(null, removed); 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35558);assertEquals(Boolean.class, ConverterManager.getInstance().getIntervalConverter(Boolean.TRUE).getSupportedType()); 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35559);assertEquals(INTERVAL_SIZE + 1, ConverterManager.getInstance().getIntervalConverters().length); 
     } finally { 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35560);ConverterManager.getInstance().removeIntervalConverter(c); 
     } 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35561);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 


public void testGetIntervalConverter487() {__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceStart(getClass().getName(),35562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p3d7strfu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9tr9tle6rjdh8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetIntervalConverter487",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35562,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p3d7strfu(){try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35562); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35563);IntervalConverter c = ConverterManager.getInstance().getIntervalConverter(new Interval(0L, 1000L)); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35564);assertEquals(ReadableInterval.class, c.getSupportedType()); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35565);c = ConverterManager.getInstance().getIntervalConverter(""); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35566);assertEquals(String.class, c.getSupportedType()); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35567);c = ConverterManager.getInstance().getIntervalConverter(null); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35568);assertEquals(null, c.getSupportedType()); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35569);try { 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35570);ConverterManager.getInstance().getIntervalConverter(Boolean.TRUE); 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35571);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35572);try { 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35573);ConverterManager.getInstance().getIntervalConverter(new Long(0)); 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35574);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 


public void testRemoveIntervalConverter2488() {__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceStart(getClass().getName(),35575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1je2kfirg7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9tr9tle6rjdh8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveIntervalConverter2488",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35575,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1je2kfirg7(){try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35575); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35576);IntervalConverter c = new IntervalConverter() { 
  
         public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35577); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35578);return false; 
         }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 
  
         public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35579); 
         }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35580); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35581);return Boolean.class; 
         }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 
     }; 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35582);IntervalConverter removed = ConverterManager.getInstance().removeIntervalConverter(c); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35583);assertEquals(null, removed); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35584);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 


public void testAddIntervalConverter3489() {__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceStart(getClass().getName(),35585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gbbkt1rgh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9tr9tle6rjdh8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddIntervalConverter3489",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35585,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gbbkt1rgh(){try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35585); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35586);IntervalConverter removed = ConverterManager.getInstance().addIntervalConverter(null); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35587);assertEquals(null, removed); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35588);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 


public void testRemoveIntervalConverter3490() {__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceStart(getClass().getName(),35589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rymdusrgl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9tr9tle6rjdh8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveIntervalConverter3490",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35589,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rymdusrgl(){try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35589); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35590);IntervalConverter removed = ConverterManager.getInstance().removeIntervalConverter(null); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35591);assertEquals(null, removed); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35592);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 


public void testToString491() {__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceStart(getClass().getName(),35593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nqtkhhrgp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9tr9tle6rjdh8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testToString491",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35593,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nqtkhhrgp(){try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35593); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35594);assertEquals("ConverterManager[6 instant,7 partial,5 duration,5 period,3 interval]", ConverterManager.getInstance().toString()); 
 }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 


public void testAddPartialConverter31117() {__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceStart(getClass().getName(),35595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l7nej2rgr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9tr9tle6rjdh8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverter31117",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35595,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l7nej2rgr(){try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35595); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35596);PartialConverter removed = ConverterManager.getInstance().addPartialConverter(StringConverter.INSTANCE); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35597);assertEquals(null, removed); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35598);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 


public void testGetInstantConverterBadMultipleMatches1122() {__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceStart(getClass().getName(),35599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f5jisorgv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r9tr9tle6rjdh8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r9tr9tle6rjdh8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverterBadMultipleMatches1122",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f5jisorgv(){try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35599); 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35600);InstantConverter c = new InstantConverter() { 
  
         public long getInstantMillis(Object object, Chronology chrono) {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35601); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35602);return 0; 
         }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35603); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35604);return null; 
         }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35605); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35606);return null; 
         }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1r9tr9tle6rjdh8.R.inc(35607); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35608);return Serializable.class; 
         }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 
     }; 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35609);try { 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35610);ConverterManager.getInstance().addInstantConverter(c); 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35611);try { 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35612);ConverterManager.getInstance().getInstantConverter(new DateTime()); 
             __CLR4_4_1r9tr9tle6rjdh8.R.inc(35613);fail(); 
         } catch (IllegalStateException ex) { 
         } 
     } finally { 
         __CLR4_4_1r9tr9tle6rjdh8.R.inc(35614);ConverterManager.getInstance().removeInstantConverter(c); 
     } 
     __CLR4_4_1r9tr9tle6rjdh8.R.inc(35615);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 }finally{__CLR4_4_1r9tr9tle6rjdh8.R.flushNeeded();}} 

    

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
