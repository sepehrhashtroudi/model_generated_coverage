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
public class TestConverterManager extends TestCase {static class __CLR4_4_1r4br4ble6rcmsf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,35428,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35147);
        __CLR4_4_1r4br4ble6rcmsf.R.inc(35148);String str = System.getProperty("java.version");
        __CLR4_4_1r4br4ble6rcmsf.R.inc(35149);boolean old = true;
        __CLR4_4_1r4br4ble6rcmsf.R.inc(35150);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1r4br4ble6rcmsf.R.iget(35151)!=0|true))||(__CLR4_4_1r4br4ble6rcmsf.R.iget(35152)==0&false))) {{
            __CLR4_4_1r4br4ble6rcmsf.R.inc(35153);old = false;
        }
        }__CLR4_4_1r4br4ble6rcmsf.R.inc(35154);OLD_JDK = old;
    }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}}

    private static final Policy RESTRICT;
    private static final Policy ALLOW;
    static {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35155);
        // don't call Policy.getPolicy()
        __CLR4_4_1r4br4ble6rcmsf.R.inc(35156);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35157);
                __CLR4_4_1r4br4ble6rcmsf.R.inc(35158);Permissions p = new Permissions();
                __CLR4_4_1r4br4ble6rcmsf.R.inc(35159);p.add(new AllPermission());  // enable everything
                __CLR4_4_1r4br4ble6rcmsf.R.inc(35160);return p;
            }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35161);
            }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35162);
                __CLR4_4_1r4br4ble6rcmsf.R.inc(35163);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1r4br4ble6rcmsf.R.iget(35164)!=0|true))||(__CLR4_4_1r4br4ble6rcmsf.R.iget(35165)==0&false))) {{
                    __CLR4_4_1r4br4ble6rcmsf.R.inc(35166);return false;
                }
                }__CLR4_4_1r4br4ble6rcmsf.R.inc(35167);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}}
        };
        __CLR4_4_1r4br4ble6rcmsf.R.inc(35168);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35169);
                __CLR4_4_1r4br4ble6rcmsf.R.inc(35170);Permissions p = new Permissions();
                __CLR4_4_1r4br4ble6rcmsf.R.inc(35171);p.add(new AllPermission());  // enable everything
                __CLR4_4_1r4br4ble6rcmsf.R.inc(35172);return p;
            }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35173);
            }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}}

    public static void main(String[] args) {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35174);
        __CLR4_4_1r4br4ble6rcmsf.R.inc(35175);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35176);
        __CLR4_4_1r4br4ble6rcmsf.R.inc(35177);return new TestSuite(TestConverterManager.class);
    }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}}

    public TestConverterManager(String name) {
        super(name);__CLR4_4_1r4br4ble6rcmsf.R.inc(35179);try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35178);
    }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGetPeriodConverter469() {__CLR4_4_1r4br4ble6rcmsf.R.globalSliceStart(getClass().getName(),35180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rf36rhr58();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r4br4ble6rcmsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r4br4ble6rcmsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPeriodConverter469",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rf36rhr58(){try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35180); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35181);PeriodConverter c = ConverterManager.getInstance().getPeriodConverter(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35182);assertEquals(ReadablePeriod.class, c.getSupportedType()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35183);c = ConverterManager.getInstance().getPeriodConverter(new Duration(123L)); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35184);assertEquals(ReadableDuration.class, c.getSupportedType()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35185);c = ConverterManager.getInstance().getPeriodConverter(new Interval(0L, 1000L)); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35186);assertEquals(ReadableInterval.class, c.getSupportedType()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35187);c = ConverterManager.getInstance().getPeriodConverter(""); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35188);assertEquals(String.class, c.getSupportedType()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35189);c = ConverterManager.getInstance().getPeriodConverter(null); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35190);assertEquals(null, c.getSupportedType()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35191);try { 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35192);ConverterManager.getInstance().getPeriodConverter(Boolean.TRUE); 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35193);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 


public void testGetInstantConverter470() {__CLR4_4_1r4br4ble6rcmsf.R.globalSliceStart(getClass().getName(),35194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k1jmz3r5m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r4br4ble6rcmsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r4br4ble6rcmsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverter470",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k1jmz3r5m(){try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35194); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35195);InstantConverter c = ConverterManager.getInstance().getInstantConverter(new Long(0L)); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35196);assertEquals(Long.class, c.getSupportedType()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35197);c = ConverterManager.getInstance().getInstantConverter(new DateTime()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35198);assertEquals(ReadableInstant.class, c.getSupportedType()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35199);c = ConverterManager.getInstance().getInstantConverter(""); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35200);assertEquals(String.class, c.getSupportedType()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35201);c = ConverterManager.getInstance().getInstantConverter(new Date()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35202);assertEquals(Date.class, c.getSupportedType()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35203);c = ConverterManager.getInstance().getInstantConverter(new GregorianCalendar()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35204);assertEquals(Calendar.class, c.getSupportedType()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35205);c = ConverterManager.getInstance().getInstantConverter(null); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35206);assertEquals(null, c.getSupportedType()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35207);try { 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35208);ConverterManager.getInstance().getInstantConverter(Boolean.TRUE); 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35209);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 


public void testGetInstantConverterRemovedNull471() {__CLR4_4_1r4br4ble6rcmsf.R.globalSliceStart(getClass().getName(),35210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zbh49dr62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r4br4ble6rcmsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r4br4ble6rcmsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverterRemovedNull471",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zbh49dr62(){try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35210); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35211);try { 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35212);ConverterManager.getInstance().removeInstantConverter(NullConverter.INSTANCE); 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35213);try { 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35214);ConverterManager.getInstance().getInstantConverter(null); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35215);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35216);ConverterManager.getInstance().addInstantConverter(NullConverter.INSTANCE); 
     } 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35217);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 


public void testGetInstantConverterOKMultipleMatches472() {__CLR4_4_1r4br4ble6rcmsf.R.globalSliceStart(getClass().getName(),35218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fruqsur6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r4br4ble6rcmsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r4br4ble6rcmsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverterOKMultipleMatches472",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35218,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fruqsur6a(){try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35218); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35219);InstantConverter c = new InstantConverter() { 
  
         public long getInstantMillis(Object object, Chronology chrono) {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35220); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35221);return 0; 
         }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35222); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35223);return null; 
         }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35224); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35225);return null; 
         }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35226); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35227);return ReadableDateTime.class; 
         }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 
     }; 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35228);try { 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35229);ConverterManager.getInstance().addInstantConverter(c); 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35230);InstantConverter ok = ConverterManager.getInstance().getInstantConverter(new DateTime()); 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35231);assertEquals(ReadableDateTime.class, ok.getSupportedType()); 
     } finally { 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35232);ConverterManager.getInstance().removeInstantConverter(c); 
     } 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35233);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 


public void testRemoveInstantConverter3473() {__CLR4_4_1r4br4ble6rcmsf.R.globalSliceStart(getClass().getName(),35234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1not9g9r6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r4br4ble6rcmsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r4br4ble6rcmsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveInstantConverter3473",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1not9g9r6q(){try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35234); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35235);InstantConverter removed = ConverterManager.getInstance().removeInstantConverter(null); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35236);assertEquals(null, removed); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35237);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 


public void testAddPartialConverter2474() {__CLR4_4_1r4br4ble6rcmsf.R.globalSliceStart(getClass().getName(),35238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w5hf04r6u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r4br4ble6rcmsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r4br4ble6rcmsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverter2474",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w5hf04r6u(){try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35238); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35239);PartialConverter c = new PartialConverter() { 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono) {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35240); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35241);return null; 
         }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono, DateTimeFormatter parser) {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35242); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35243);return null; 
         }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35244); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35245);return null; 
         }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35246); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35247);return null; 
         }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35248); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35249);return String.class; 
         }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 
     }; 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35250);try { 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35251);PartialConverter removed = ConverterManager.getInstance().addPartialConverter(c); 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35252);assertEquals(StringConverter.INSTANCE, removed); 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35253);assertEquals(String.class, ConverterManager.getInstance().getPartialConverter("").getSupportedType()); 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35254);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
     } finally { 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35255);ConverterManager.getInstance().addPartialConverter(StringConverter.INSTANCE); 
     } 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35256);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 


public void testGetPartialConverter475() {__CLR4_4_1r4br4ble6rcmsf.R.globalSliceStart(getClass().getName(),35257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qp76k6r7d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r4br4ble6rcmsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r4br4ble6rcmsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPartialConverter475",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35257,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qp76k6r7d(){try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35257); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35258);PartialConverter c = ConverterManager.getInstance().getPartialConverter(new Long(0L)); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35259);assertEquals(Long.class, c.getSupportedType()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35260);c = ConverterManager.getInstance().getPartialConverter(new TimeOfDay()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35261);assertEquals(ReadablePartial.class, c.getSupportedType()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35262);c = ConverterManager.getInstance().getPartialConverter(new DateTime()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35263);assertEquals(ReadableInstant.class, c.getSupportedType()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35264);c = ConverterManager.getInstance().getPartialConverter(""); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35265);assertEquals(String.class, c.getSupportedType()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35266);c = ConverterManager.getInstance().getPartialConverter(new Date()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35267);assertEquals(Date.class, c.getSupportedType()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35268);c = ConverterManager.getInstance().getPartialConverter(new GregorianCalendar()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35269);assertEquals(Calendar.class, c.getSupportedType()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35270);c = ConverterManager.getInstance().getPartialConverter(null); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35271);assertEquals(null, c.getSupportedType()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35272);try { 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35273);ConverterManager.getInstance().getPartialConverter(Boolean.TRUE); 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35274);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 


public void testGetPartialConverterRemovedNull476() {__CLR4_4_1r4br4ble6rcmsf.R.globalSliceStart(getClass().getName(),35275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_152f1xyr7v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r4br4ble6rcmsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r4br4ble6rcmsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPartialConverterRemovedNull476",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35275,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_152f1xyr7v(){try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35275); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35276);try { 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35277);ConverterManager.getInstance().removePartialConverter(NullConverter.INSTANCE); 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35278);try { 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35279);ConverterManager.getInstance().getPartialConverter(null); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35280);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35281);ConverterManager.getInstance().addPartialConverter(NullConverter.INSTANCE); 
     } 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35282);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 


public void testRemovePartialConverter3477() {__CLR4_4_1r4br4ble6rcmsf.R.globalSliceStart(getClass().getName(),35283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cgj01vr83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r4br4ble6rcmsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r4br4ble6rcmsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePartialConverter3477",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35283,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cgj01vr83(){try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35283); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35284);PartialConverter removed = ConverterManager.getInstance().removePartialConverter(null); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35285);assertEquals(null, removed); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35286);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 


public void testGetPartialConverterOKMultipleMatches478() {__CLR4_4_1r4br4ble6rcmsf.R.globalSliceStart(getClass().getName(),35287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_151ecncr87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r4br4ble6rcmsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r4br4ble6rcmsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPartialConverterOKMultipleMatches478",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_151ecncr87(){try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35287); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35288);PartialConverter c = new PartialConverter() { 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono) {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35289); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35290);return null; 
         }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono, DateTimeFormatter parser) {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35291); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35292);return null; 
         }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35293); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35294);return null; 
         }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35295); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35296);return null; 
         }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35297); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35298);return ReadableDateTime.class; 
         }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 
     }; 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35299);try { 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35300);ConverterManager.getInstance().addPartialConverter(c); 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35301);PartialConverter ok = ConverterManager.getInstance().getPartialConverter(new DateTime()); 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35302);assertEquals(ReadableDateTime.class, ok.getSupportedType()); 
     } finally { 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35303);ConverterManager.getInstance().removePartialConverter(c); 
     } 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35304);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 


public void testGetDurationConverter479() {__CLR4_4_1r4br4ble6rcmsf.R.globalSliceStart(getClass().getName(),35305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n42g23r8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r4br4ble6rcmsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r4br4ble6rcmsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetDurationConverter479",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n42g23r8p(){try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35305); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35306);DurationConverter c = ConverterManager.getInstance().getDurationConverter(new Long(0L)); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35307);assertEquals(Long.class, c.getSupportedType()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35308);c = ConverterManager.getInstance().getDurationConverter(new Duration(123L)); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35309);assertEquals(ReadableDuration.class, c.getSupportedType()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35310);c = ConverterManager.getInstance().getDurationConverter(new Interval(0L, 1000L)); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35311);assertEquals(ReadableInterval.class, c.getSupportedType()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35312);c = ConverterManager.getInstance().getDurationConverter(""); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35313);assertEquals(String.class, c.getSupportedType()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35314);c = ConverterManager.getInstance().getDurationConverter(null); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35315);assertEquals(null, c.getSupportedType()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35316);try { 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35317);ConverterManager.getInstance().getDurationConverter(Boolean.TRUE); 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35318);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 


public void testGetDurationConverterRemovedNull480() {__CLR4_4_1r4br4ble6rcmsf.R.globalSliceStart(getClass().getName(),35319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qmxij0r93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r4br4ble6rcmsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r4br4ble6rcmsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetDurationConverterRemovedNull480",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35319,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qmxij0r93(){try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35319); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35320);try { 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35321);ConverterManager.getInstance().removeDurationConverter(NullConverter.INSTANCE); 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35322);try { 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35323);ConverterManager.getInstance().getDurationConverter(null); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35324);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35325);ConverterManager.getInstance().addDurationConverter(NullConverter.INSTANCE); 
     } 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35326);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
 }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 


public void testAddDurationConverter2481() {__CLR4_4_1r4br4ble6rcmsf.R.globalSliceStart(getClass().getName(),35327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1epneo1r9b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r4br4ble6rcmsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r4br4ble6rcmsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddDurationConverter2481",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35327,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1epneo1r9b(){try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35327); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35328);DurationConverter c = new DurationConverter() { 
  
         public long getDurationMillis(Object object) {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35329); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35330);return 0; 
         }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35331); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35332);return String.class; 
         }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 
     }; 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35333);try { 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35334);DurationConverter removed = ConverterManager.getInstance().addDurationConverter(c); 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35335);assertEquals(StringConverter.INSTANCE, removed); 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35336);assertEquals(String.class, ConverterManager.getInstance().getDurationConverter("").getSupportedType()); 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35337);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
     } finally { 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35338);ConverterManager.getInstance().addDurationConverter(StringConverter.INSTANCE); 
     } 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35339);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
 }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 


public void testAddDurationConverter3482() {__CLR4_4_1r4br4ble6rcmsf.R.globalSliceStart(getClass().getName(),35340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16lyso1r9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r4br4ble6rcmsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r4br4ble6rcmsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddDurationConverter3482",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16lyso1r9o(){try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35340); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35341);DurationConverter removed = ConverterManager.getInstance().addDurationConverter(null); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35342);assertEquals(null, removed); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35343);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
 }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 


public void testRemoveDurationConverter3483() {__CLR4_4_1r4br4ble6rcmsf.R.globalSliceStart(getClass().getName(),35344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17tgrqxr9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r4br4ble6rcmsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r4br4ble6rcmsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveDurationConverter3483",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17tgrqxr9s(){try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35344); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35345);DurationConverter removed = ConverterManager.getInstance().removeDurationConverter(null); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35346);assertEquals(null, removed); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35347);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
 }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 


public void testAddPeriodConverter3484() {__CLR4_4_1r4br4ble6rcmsf.R.globalSliceStart(getClass().getName(),35348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qo8kqcr9w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r4br4ble6rcmsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r4br4ble6rcmsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPeriodConverter3484",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qo8kqcr9w(){try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35348); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35349);PeriodConverter removed = ConverterManager.getInstance().addPeriodConverter(null); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35350);assertEquals(null, removed); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35351);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length); 
 }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 


public void testRemovePeriodConverter3485() {__CLR4_4_1r4br4ble6rcmsf.R.globalSliceStart(getClass().getName(),35352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xuotrmra0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r4br4ble6rcmsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r4br4ble6rcmsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePeriodConverter3485",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xuotrmra0(){try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35352); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35353);PeriodConverter removed = ConverterManager.getInstance().removePeriodConverter(null); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35354);assertEquals(null, removed); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35355);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length); 
 }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 


public void testAddIntervalConverter1486() {__CLR4_4_1r4br4ble6rcmsf.R.globalSliceStart(getClass().getName(),35356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1351lzgra4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r4br4ble6rcmsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r4br4ble6rcmsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddIntervalConverter1486",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1351lzgra4(){try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35356); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35357);IntervalConverter c = new IntervalConverter() { 
  
         public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35358); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35359);return false; 
         }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 
  
         public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35360); 
         }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35361); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35362);return Boolean.class; 
         }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 
     }; 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35363);try { 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35364);IntervalConverter removed = ConverterManager.getInstance().addIntervalConverter(c); 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35365);assertEquals(null, removed); 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35366);assertEquals(Boolean.class, ConverterManager.getInstance().getIntervalConverter(Boolean.TRUE).getSupportedType()); 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35367);assertEquals(INTERVAL_SIZE + 1, ConverterManager.getInstance().getIntervalConverters().length); 
     } finally { 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35368);ConverterManager.getInstance().removeIntervalConverter(c); 
     } 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35369);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 


public void testGetIntervalConverter487() {__CLR4_4_1r4br4ble6rcmsf.R.globalSliceStart(getClass().getName(),35370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p3d7strai();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r4br4ble6rcmsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r4br4ble6rcmsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetIntervalConverter487",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35370,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p3d7strai(){try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35370); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35371);IntervalConverter c = ConverterManager.getInstance().getIntervalConverter(new Interval(0L, 1000L)); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35372);assertEquals(ReadableInterval.class, c.getSupportedType()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35373);c = ConverterManager.getInstance().getIntervalConverter(""); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35374);assertEquals(String.class, c.getSupportedType()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35375);c = ConverterManager.getInstance().getIntervalConverter(null); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35376);assertEquals(null, c.getSupportedType()); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35377);try { 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35378);ConverterManager.getInstance().getIntervalConverter(Boolean.TRUE); 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35379);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35380);try { 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35381);ConverterManager.getInstance().getIntervalConverter(new Long(0)); 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35382);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 


public void testGetIntervalConverterRemovedNull488() {__CLR4_4_1r4br4ble6rcmsf.R.globalSliceStart(getClass().getName(),35383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j7chf9rav();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r4br4ble6rcmsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r4br4ble6rcmsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetIntervalConverterRemovedNull488",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j7chf9rav(){try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35383); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35384);try { 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35385);ConverterManager.getInstance().removeIntervalConverter(NullConverter.INSTANCE); 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35386);try { 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35387);ConverterManager.getInstance().getIntervalConverter(null); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35388);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35389);ConverterManager.getInstance().addIntervalConverter(NullConverter.INSTANCE); 
     } 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35390);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 


public void testRemoveIntervalConverter2489() {__CLR4_4_1r4br4ble6rcmsf.R.globalSliceStart(getClass().getName(),35391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mn2j7zrb3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r4br4ble6rcmsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r4br4ble6rcmsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveIntervalConverter2489",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mn2j7zrb3(){try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35391); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35392);IntervalConverter c = new IntervalConverter() { 
  
         public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35393); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35394);return false; 
         }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 
  
         public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35395); 
         }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35396); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35397);return Boolean.class; 
         }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 
     }; 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35398);IntervalConverter removed = ConverterManager.getInstance().removeIntervalConverter(c); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35399);assertEquals(null, removed); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35400);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 


public void testAddIntervalConverter3490() {__CLR4_4_1r4br4ble6rcmsf.R.globalSliceStart(getClass().getName(),35401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gs6s8brbd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r4br4ble6rcmsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r4br4ble6rcmsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddIntervalConverter3490",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35401,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gs6s8brbd(){try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35401); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35402);IntervalConverter removed = ConverterManager.getInstance().addIntervalConverter(null); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35403);assertEquals(null, removed); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35404);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 


public void testToString491() {__CLR4_4_1r4br4ble6rcmsf.R.globalSliceStart(getClass().getName(),35405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nqtkhhrbh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r4br4ble6rcmsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r4br4ble6rcmsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testToString491",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35405,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nqtkhhrbh(){try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35405); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35406);assertEquals("ConverterManager[6 instant,7 partial,5 duration,5 period,3 interval]", ConverterManager.getInstance().toString()); 
 }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 


public void testAddPartialConverter31088() {__CLR4_4_1r4br4ble6rcmsf.R.globalSliceStart(getClass().getName(),35407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kw4l05rbj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r4br4ble6rcmsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r4br4ble6rcmsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverter31088",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35407,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kw4l05rbj(){try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35407); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35408);PartialConverter removed = ConverterManager.getInstance().addPartialConverter(StringConverter.INSTANCE); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35409);assertEquals(null, removed); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35410);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 


public void testGetInstantConverterBadMultipleMatches1091() {__CLR4_4_1r4br4ble6rcmsf.R.globalSliceStart(getClass().getName(),35411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z2eqnrbn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r4br4ble6rcmsf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r4br4ble6rcmsf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverterBadMultipleMatches1091",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35411,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z2eqnrbn(){try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35411); 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35412);InstantConverter c = new InstantConverter() { 
  
         public long getInstantMillis(Object object, Chronology chrono) {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35413); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35414);return 0; 
         }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35415); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35416);return null; 
         }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35417); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35418);return null; 
         }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1r4br4ble6rcmsf.R.inc(35419); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35420);return Serializable.class; 
         }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 
     }; 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35421);try { 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35422);ConverterManager.getInstance().addInstantConverter(c); 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35423);try { 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35424);ConverterManager.getInstance().getInstantConverter(new DateTime()); 
             __CLR4_4_1r4br4ble6rcmsf.R.inc(35425);fail(); 
         } catch (IllegalStateException ex) { 
         } 
     } finally { 
         __CLR4_4_1r4br4ble6rcmsf.R.inc(35426);ConverterManager.getInstance().removeInstantConverter(c); 
     } 
     __CLR4_4_1r4br4ble6rcmsf.R.inc(35427);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 }finally{__CLR4_4_1r4br4ble6rcmsf.R.flushNeeded();}} 

    

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
