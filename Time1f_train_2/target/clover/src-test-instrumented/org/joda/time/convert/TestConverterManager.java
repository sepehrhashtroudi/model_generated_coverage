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
public class TestConverterManager extends TestCase {static class __CLR4_4_1r38r38le6qsfi7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,35318,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_1r38r38le6qsfi7.R.inc(35108);
        __CLR4_4_1r38r38le6qsfi7.R.inc(35109);String str = System.getProperty("java.version");
        __CLR4_4_1r38r38le6qsfi7.R.inc(35110);boolean old = true;
        __CLR4_4_1r38r38le6qsfi7.R.inc(35111);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1r38r38le6qsfi7.R.iget(35112)!=0|true))||(__CLR4_4_1r38r38le6qsfi7.R.iget(35113)==0&false))) {{
            __CLR4_4_1r38r38le6qsfi7.R.inc(35114);old = false;
        }
        }__CLR4_4_1r38r38le6qsfi7.R.inc(35115);OLD_JDK = old;
    }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}}

    private static final Policy RESTRICT;
    private static final Policy ALLOW;
    static {try{__CLR4_4_1r38r38le6qsfi7.R.inc(35116);
        // don't call Policy.getPolicy()
        __CLR4_4_1r38r38le6qsfi7.R.inc(35117);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1r38r38le6qsfi7.R.inc(35118);
                __CLR4_4_1r38r38le6qsfi7.R.inc(35119);Permissions p = new Permissions();
                __CLR4_4_1r38r38le6qsfi7.R.inc(35120);p.add(new AllPermission());  // enable everything
                __CLR4_4_1r38r38le6qsfi7.R.inc(35121);return p;
            }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1r38r38le6qsfi7.R.inc(35122);
            }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1r38r38le6qsfi7.R.inc(35123);
                __CLR4_4_1r38r38le6qsfi7.R.inc(35124);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1r38r38le6qsfi7.R.iget(35125)!=0|true))||(__CLR4_4_1r38r38le6qsfi7.R.iget(35126)==0&false))) {{
                    __CLR4_4_1r38r38le6qsfi7.R.inc(35127);return false;
                }
                }__CLR4_4_1r38r38le6qsfi7.R.inc(35128);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}}
        };
        __CLR4_4_1r38r38le6qsfi7.R.inc(35129);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1r38r38le6qsfi7.R.inc(35130);
                __CLR4_4_1r38r38le6qsfi7.R.inc(35131);Permissions p = new Permissions();
                __CLR4_4_1r38r38le6qsfi7.R.inc(35132);p.add(new AllPermission());  // enable everything
                __CLR4_4_1r38r38le6qsfi7.R.inc(35133);return p;
            }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1r38r38le6qsfi7.R.inc(35134);
            }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}}

    public static void main(String[] args) {try{__CLR4_4_1r38r38le6qsfi7.R.inc(35135);
        __CLR4_4_1r38r38le6qsfi7.R.inc(35136);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1r38r38le6qsfi7.R.inc(35137);
        __CLR4_4_1r38r38le6qsfi7.R.inc(35138);return new TestSuite(TestConverterManager.class);
    }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}}

    public TestConverterManager(String name) {
        super(name);__CLR4_4_1r38r38le6qsfi7.R.inc(35140);try{__CLR4_4_1r38r38le6qsfi7.R.inc(35139);
    }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGetPeriodConverter436() {__CLR4_4_1r38r38le6qsfi7.R.globalSliceStart(getClass().getName(),35141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fqkb6rr45();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r38r38le6qsfi7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r38r38le6qsfi7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPeriodConverter436",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fqkb6rr45(){try{__CLR4_4_1r38r38le6qsfi7.R.inc(35141); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35142);PeriodConverter c = ConverterManager.getInstance().getPeriodConverter(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35143);assertEquals(ReadablePeriod.class, c.getSupportedType()); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35144);c = ConverterManager.getInstance().getPeriodConverter(new Duration(123L)); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35145);assertEquals(ReadableDuration.class, c.getSupportedType()); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35146);c = ConverterManager.getInstance().getPeriodConverter(new Interval(0L, 1000L)); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35147);assertEquals(ReadableInterval.class, c.getSupportedType()); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35148);c = ConverterManager.getInstance().getPeriodConverter(""); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35149);assertEquals(String.class, c.getSupportedType()); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35150);c = ConverterManager.getInstance().getPeriodConverter(null); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35151);assertEquals(null, c.getSupportedType()); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35152);try { 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35153);ConverterManager.getInstance().getPeriodConverter(Boolean.TRUE); 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35154);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 


public void testAddInstantConverter4437() {__CLR4_4_1r38r38le6qsfi7.R.globalSliceStart(getClass().getName(),35155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i48vpjr4j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r38r38le6qsfi7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r38r38le6qsfi7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddInstantConverter4437",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i48vpjr4j(){try{__CLR4_4_1r38r38le6qsfi7.R.inc(35155); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35156);InstantConverter removed = ConverterManager.getInstance().addInstantConverter(null); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35157);assertEquals(null, removed); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35158);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 


public void testRemoveInstantConverter3438() {__CLR4_4_1r38r38le6qsfi7.R.globalSliceStart(getClass().getName(),35159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17wigser4n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r38r38le6qsfi7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r38r38le6qsfi7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveInstantConverter3438",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35159,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17wigser4n(){try{__CLR4_4_1r38r38le6qsfi7.R.inc(35159); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35160);InstantConverter removed = ConverterManager.getInstance().removeInstantConverter(null); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35161);assertEquals(null, removed); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35162);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 


public void testAddPartialConverter2439() {__CLR4_4_1r38r38le6qsfi7.R.globalSliceStart(getClass().getName(),35163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k5orhr4r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r38r38le6qsfi7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r38r38le6qsfi7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverter2439",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35163,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k5orhr4r(){try{__CLR4_4_1r38r38le6qsfi7.R.inc(35163); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35164);PartialConverter c = new PartialConverter() { 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono) {try{__CLR4_4_1r38r38le6qsfi7.R.inc(35165); 
             __CLR4_4_1r38r38le6qsfi7.R.inc(35166);return null; 
         }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono, DateTimeFormatter parser) {try{__CLR4_4_1r38r38le6qsfi7.R.inc(35167); 
             __CLR4_4_1r38r38le6qsfi7.R.inc(35168);return null; 
         }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_1r38r38le6qsfi7.R.inc(35169); 
             __CLR4_4_1r38r38le6qsfi7.R.inc(35170);return null; 
         }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_1r38r38le6qsfi7.R.inc(35171); 
             __CLR4_4_1r38r38le6qsfi7.R.inc(35172);return null; 
         }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1r38r38le6qsfi7.R.inc(35173); 
             __CLR4_4_1r38r38le6qsfi7.R.inc(35174);return String.class; 
         }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 
     }; 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35175);try { 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35176);PartialConverter removed = ConverterManager.getInstance().addPartialConverter(c); 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35177);assertEquals(StringConverter.INSTANCE, removed); 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35178);assertEquals(String.class, ConverterManager.getInstance().getPartialConverter("").getSupportedType()); 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35179);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
     } finally { 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35180);ConverterManager.getInstance().addPartialConverter(StringConverter.INSTANCE); 
     } 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35181);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 


public void testGetPartialConverter440() {__CLR4_4_1r38r38le6qsfi7.R.globalSliceStart(getClass().getName(),35182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17o9b1or5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r38r38le6qsfi7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r38r38le6qsfi7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPartialConverter440",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17o9b1or5a(){try{__CLR4_4_1r38r38le6qsfi7.R.inc(35182); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35183);PartialConverter c = ConverterManager.getInstance().getPartialConverter(new Long(0L)); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35184);assertEquals(Long.class, c.getSupportedType()); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35185);c = ConverterManager.getInstance().getPartialConverter(new TimeOfDay()); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35186);assertEquals(ReadablePartial.class, c.getSupportedType()); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35187);c = ConverterManager.getInstance().getPartialConverter(new DateTime()); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35188);assertEquals(ReadableInstant.class, c.getSupportedType()); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35189);c = ConverterManager.getInstance().getPartialConverter(""); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35190);assertEquals(String.class, c.getSupportedType()); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35191);c = ConverterManager.getInstance().getPartialConverter(new Date()); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35192);assertEquals(Date.class, c.getSupportedType()); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35193);c = ConverterManager.getInstance().getPartialConverter(new GregorianCalendar()); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35194);assertEquals(Calendar.class, c.getSupportedType()); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35195);c = ConverterManager.getInstance().getPartialConverter(null); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35196);assertEquals(null, c.getSupportedType()); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35197);try { 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35198);ConverterManager.getInstance().getPartialConverter(Boolean.TRUE); 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35199);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 


public void testAddPartialConverter4441() {__CLR4_4_1r38r38le6qsfi7.R.globalSliceStart(getClass().getName(),35200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dze5ear5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r38r38le6qsfi7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r38r38le6qsfi7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverter4441",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35200,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dze5ear5s(){try{__CLR4_4_1r38r38le6qsfi7.R.inc(35200); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35201);PartialConverter removed = ConverterManager.getInstance().addPartialConverter(null); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35202);assertEquals(null, removed); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35203);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 


public void testGetDurationConverter442() {__CLR4_4_1r38r38le6qsfi7.R.globalSliceStart(getClass().getName(),35204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_171l6q9r5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r38r38le6qsfi7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r38r38le6qsfi7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetDurationConverter442",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35204,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_171l6q9r5w(){try{__CLR4_4_1r38r38le6qsfi7.R.inc(35204); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35205);DurationConverter c = ConverterManager.getInstance().getDurationConverter(new Long(0L)); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35206);assertEquals(Long.class, c.getSupportedType()); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35207);c = ConverterManager.getInstance().getDurationConverter(new Duration(123L)); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35208);assertEquals(ReadableDuration.class, c.getSupportedType()); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35209);c = ConverterManager.getInstance().getDurationConverter(new Interval(0L, 1000L)); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35210);assertEquals(ReadableInterval.class, c.getSupportedType()); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35211);c = ConverterManager.getInstance().getDurationConverter(""); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35212);assertEquals(String.class, c.getSupportedType()); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35213);c = ConverterManager.getInstance().getDurationConverter(null); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35214);assertEquals(null, c.getSupportedType()); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35215);try { 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35216);ConverterManager.getInstance().getDurationConverter(Boolean.TRUE); 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35217);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 


public void testGetDurationConverterRemovedNull443() {__CLR4_4_1r38r38le6qsfi7.R.globalSliceStart(getClass().getName(),35218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16auvmjr6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r38r38le6qsfi7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r38r38le6qsfi7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetDurationConverterRemovedNull443",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35218,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16auvmjr6a(){try{__CLR4_4_1r38r38le6qsfi7.R.inc(35218); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35219);try { 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35220);ConverterManager.getInstance().removeDurationConverter(NullConverter.INSTANCE); 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35221);try { 
             __CLR4_4_1r38r38le6qsfi7.R.inc(35222);ConverterManager.getInstance().getDurationConverter(null); 
             __CLR4_4_1r38r38le6qsfi7.R.inc(35223);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35224);ConverterManager.getInstance().addDurationConverter(NullConverter.INSTANCE); 
     } 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35225);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
 }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 


public void testAddDurationConverter2444() {__CLR4_4_1r38r38le6qsfi7.R.globalSliceStart(getClass().getName(),35226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i84zhir6i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r38r38le6qsfi7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r38r38le6qsfi7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddDurationConverter2444",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i84zhir6i(){try{__CLR4_4_1r38r38le6qsfi7.R.inc(35226); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35227);DurationConverter c = new DurationConverter() { 
  
         public long getDurationMillis(Object object) {try{__CLR4_4_1r38r38le6qsfi7.R.inc(35228); 
             __CLR4_4_1r38r38le6qsfi7.R.inc(35229);return 0; 
         }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1r38r38le6qsfi7.R.inc(35230); 
             __CLR4_4_1r38r38le6qsfi7.R.inc(35231);return String.class; 
         }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 
     }; 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35232);try { 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35233);DurationConverter removed = ConverterManager.getInstance().addDurationConverter(c); 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35234);assertEquals(StringConverter.INSTANCE, removed); 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35235);assertEquals(String.class, ConverterManager.getInstance().getDurationConverter("").getSupportedType()); 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35236);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
     } finally { 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35237);ConverterManager.getInstance().addDurationConverter(StringConverter.INSTANCE); 
     } 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35238);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
 }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 


public void testAddDurationConverter3445() {__CLR4_4_1r38r38le6qsfi7.R.globalSliceStart(getClass().getName(),35239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qbtlhir6v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r38r38le6qsfi7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r38r38le6qsfi7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddDurationConverter3445",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35239,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qbtlhir6v(){try{__CLR4_4_1r38r38le6qsfi7.R.inc(35239); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35240);DurationConverter removed = ConverterManager.getInstance().addDurationConverter(null); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35241);assertEquals(null, removed); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35242);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
 }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 


public void testRemoveDurationConverter3446() {__CLR4_4_1r38r38le6qsfi7.R.globalSliceStart(getClass().getName(),35243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u9uw2or6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r38r38le6qsfi7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r38r38le6qsfi7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveDurationConverter3446",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u9uw2or6z(){try{__CLR4_4_1r38r38le6qsfi7.R.inc(35243); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35244);DurationConverter removed = ConverterManager.getInstance().removeDurationConverter(null); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35245);assertEquals(null, removed); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35246);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
 }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 


public void testGetPeriodConverterRemovedNull447() {__CLR4_4_1r38r38le6qsfi7.R.globalSliceStart(getClass().getName(),35247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qjw9o2r73();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r38r38le6qsfi7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r38r38le6qsfi7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPeriodConverterRemovedNull447",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qjw9o2r73(){try{__CLR4_4_1r38r38le6qsfi7.R.inc(35247); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35248);try { 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35249);ConverterManager.getInstance().removePeriodConverter(NullConverter.INSTANCE); 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35250);try { 
             __CLR4_4_1r38r38le6qsfi7.R.inc(35251);ConverterManager.getInstance().getPeriodConverter(null); 
             __CLR4_4_1r38r38le6qsfi7.R.inc(35252);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35253);ConverterManager.getInstance().addPeriodConverter(NullConverter.INSTANCE); 
     } 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35254);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length); 
 }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 


public void testAddPeriodConverter3448() {__CLR4_4_1r38r38le6qsfi7.R.globalSliceStart(getClass().getName(),35255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18634asr7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r38r38le6qsfi7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r38r38le6qsfi7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPeriodConverter3448",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35255,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18634asr7b(){try{__CLR4_4_1r38r38le6qsfi7.R.inc(35255); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35256);PeriodConverter removed = ConverterManager.getInstance().addPeriodConverter(null); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35257);assertEquals(null, removed); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35258);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length); 
 }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 


public void testRemovePeriodConverter3449() {__CLR4_4_1r38r38le6qsfi7.R.globalSliceStart(getClass().getName(),35259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12c3j6er7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r38r38le6qsfi7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r38r38le6qsfi7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePeriodConverter3449",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35259,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12c3j6er7f(){try{__CLR4_4_1r38r38le6qsfi7.R.inc(35259); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35260);PeriodConverter removed = ConverterManager.getInstance().removePeriodConverter(null); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35261);assertEquals(null, removed); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35262);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length); 
 }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 


public void testAddIntervalConverter1450() {__CLR4_4_1r38r38le6qsfi7.R.globalSliceStart(getClass().getName(),35263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u9lzldr7j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r38r38le6qsfi7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r38r38le6qsfi7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddIntervalConverter1450",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u9lzldr7j(){try{__CLR4_4_1r38r38le6qsfi7.R.inc(35263); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35264);IntervalConverter c = new IntervalConverter() { 
  
         public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1r38r38le6qsfi7.R.inc(35265); 
             __CLR4_4_1r38r38le6qsfi7.R.inc(35266);return false; 
         }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 
  
         public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1r38r38le6qsfi7.R.inc(35267); 
         }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1r38r38le6qsfi7.R.inc(35268); 
             __CLR4_4_1r38r38le6qsfi7.R.inc(35269);return Boolean.class; 
         }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 
     }; 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35270);try { 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35271);IntervalConverter removed = ConverterManager.getInstance().addIntervalConverter(c); 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35272);assertEquals(null, removed); 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35273);assertEquals(Boolean.class, ConverterManager.getInstance().getIntervalConverter(Boolean.TRUE).getSupportedType()); 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35274);assertEquals(INTERVAL_SIZE + 1, ConverterManager.getInstance().getIntervalConverters().length); 
     } finally { 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35275);ConverterManager.getInstance().removeIntervalConverter(c); 
     } 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35276);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 


public void testGetIntervalConverter451() {__CLR4_4_1r38r38le6qsfi7.R.globalSliceStart(getClass().getName(),35277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18bads0r7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r38r38le6qsfi7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r38r38le6qsfi7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetIntervalConverter451",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35277,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18bads0r7x(){try{__CLR4_4_1r38r38le6qsfi7.R.inc(35277); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35278);IntervalConverter c = ConverterManager.getInstance().getIntervalConverter(new Interval(0L, 1000L)); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35279);assertEquals(ReadableInterval.class, c.getSupportedType()); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35280);c = ConverterManager.getInstance().getIntervalConverter(""); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35281);assertEquals(String.class, c.getSupportedType()); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35282);c = ConverterManager.getInstance().getIntervalConverter(null); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35283);assertEquals(null, c.getSupportedType()); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35284);try { 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35285);ConverterManager.getInstance().getIntervalConverter(Boolean.TRUE); 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35286);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35287);try { 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35288);ConverterManager.getInstance().getIntervalConverter(new Long(0)); 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35289);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 


public void testGetIntervalConverterRemovedNull452() {__CLR4_4_1r38r38le6qsfi7.R.globalSliceStart(getClass().getName(),35290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e7b45kr8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r38r38le6qsfi7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r38r38le6qsfi7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetIntervalConverterRemovedNull452",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e7b45kr8a(){try{__CLR4_4_1r38r38le6qsfi7.R.inc(35290); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35291);try { 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35292);ConverterManager.getInstance().removeIntervalConverter(NullConverter.INSTANCE); 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35293);try { 
             __CLR4_4_1r38r38le6qsfi7.R.inc(35294);ConverterManager.getInstance().getIntervalConverter(null); 
             __CLR4_4_1r38r38le6qsfi7.R.inc(35295);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         __CLR4_4_1r38r38le6qsfi7.R.inc(35296);ConverterManager.getInstance().addIntervalConverter(NullConverter.INSTANCE); 
     } 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35297);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 


public void testRemoveIntervalConverter2453() {__CLR4_4_1r38r38le6qsfi7.R.globalSliceStart(getClass().getName(),35298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ezdx6cr8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r38r38le6qsfi7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r38r38le6qsfi7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveIntervalConverter2453",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35298,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ezdx6cr8i(){try{__CLR4_4_1r38r38le6qsfi7.R.inc(35298); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35299);IntervalConverter c = new IntervalConverter() { 
  
         public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1r38r38le6qsfi7.R.inc(35300); 
             __CLR4_4_1r38r38le6qsfi7.R.inc(35301);return false; 
         }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 
  
         public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1r38r38le6qsfi7.R.inc(35302); 
         }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1r38r38le6qsfi7.R.inc(35303); 
             __CLR4_4_1r38r38le6qsfi7.R.inc(35304);return Boolean.class; 
         }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 
     }; 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35305);IntervalConverter removed = ConverterManager.getInstance().removeIntervalConverter(c); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35306);assertEquals(null, removed); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35307);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 


public void testRemoveIntervalConverter3454() {__CLR4_4_1r38r38le6qsfi7.R.globalSliceStart(getClass().getName(),35308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vpb6cr8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r38r38le6qsfi7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r38r38le6qsfi7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveIntervalConverter3454",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35308,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vpb6cr8s(){try{__CLR4_4_1r38r38le6qsfi7.R.inc(35308); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35309);IntervalConverter removed = ConverterManager.getInstance().removeIntervalConverter(null); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35310);assertEquals(null, removed); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35311);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 


public void testToString455() {__CLR4_4_1r38r38le6qsfi7.R.globalSliceStart(getClass().getName(),35312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b3i4jnr8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r38r38le6qsfi7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r38r38le6qsfi7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testToString455",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35312,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b3i4jnr8w(){try{__CLR4_4_1r38r38le6qsfi7.R.inc(35312); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35313);assertEquals("ConverterManager[6 instant,7 partial,5 duration,5 period,3 interval]", ConverterManager.getInstance().toString()); 
 }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 


public void testAddPartialConverter31089() {__CLR4_4_1r38r38le6qsfi7.R.globalSliceStart(getClass().getName(),35314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hn4m7or8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r38r38le6qsfi7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r38r38le6qsfi7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverter31089",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hn4m7or8y(){try{__CLR4_4_1r38r38le6qsfi7.R.inc(35314); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35315);PartialConverter removed = ConverterManager.getInstance().addPartialConverter(StringConverter.INSTANCE); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35316);assertEquals(null, removed); 
     __CLR4_4_1r38r38le6qsfi7.R.inc(35317);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1r38r38le6qsfi7.R.flushNeeded();}} 

    

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
