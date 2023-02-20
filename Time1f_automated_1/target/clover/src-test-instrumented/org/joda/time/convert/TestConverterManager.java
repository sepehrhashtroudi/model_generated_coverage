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
public class TestConverterManager extends TestCase {static class __CLR4_4_1lixlixle6ndq0t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,28020,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_1lixlixle6ndq0t.R.inc(27897);
        __CLR4_4_1lixlixle6ndq0t.R.inc(27898);String str = System.getProperty("java.version");
        __CLR4_4_1lixlixle6ndq0t.R.inc(27899);boolean old = true;
        __CLR4_4_1lixlixle6ndq0t.R.inc(27900);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1lixlixle6ndq0t.R.iget(27901)!=0|true))||(__CLR4_4_1lixlixle6ndq0t.R.iget(27902)==0&false))) {{
            __CLR4_4_1lixlixle6ndq0t.R.inc(27903);old = false;
        }
        }__CLR4_4_1lixlixle6ndq0t.R.inc(27904);OLD_JDK = old;
    }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}}

    private static final Policy RESTRICT;
    private static final Policy ALLOW;
    static {try{__CLR4_4_1lixlixle6ndq0t.R.inc(27905);
        // don't call Policy.getPolicy()
        __CLR4_4_1lixlixle6ndq0t.R.inc(27906);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1lixlixle6ndq0t.R.inc(27907);
                __CLR4_4_1lixlixle6ndq0t.R.inc(27908);Permissions p = new Permissions();
                __CLR4_4_1lixlixle6ndq0t.R.inc(27909);p.add(new AllPermission());  // enable everything
                __CLR4_4_1lixlixle6ndq0t.R.inc(27910);return p;
            }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1lixlixle6ndq0t.R.inc(27911);
            }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1lixlixle6ndq0t.R.inc(27912);
                __CLR4_4_1lixlixle6ndq0t.R.inc(27913);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1lixlixle6ndq0t.R.iget(27914)!=0|true))||(__CLR4_4_1lixlixle6ndq0t.R.iget(27915)==0&false))) {{
                    __CLR4_4_1lixlixle6ndq0t.R.inc(27916);return false;
                }
                }__CLR4_4_1lixlixle6ndq0t.R.inc(27917);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}}
        };
        __CLR4_4_1lixlixle6ndq0t.R.inc(27918);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1lixlixle6ndq0t.R.inc(27919);
                __CLR4_4_1lixlixle6ndq0t.R.inc(27920);Permissions p = new Permissions();
                __CLR4_4_1lixlixle6ndq0t.R.inc(27921);p.add(new AllPermission());  // enable everything
                __CLR4_4_1lixlixle6ndq0t.R.inc(27922);return p;
            }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1lixlixle6ndq0t.R.inc(27923);
            }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}}

    public static void main(String[] args) {try{__CLR4_4_1lixlixle6ndq0t.R.inc(27924);
        __CLR4_4_1lixlixle6ndq0t.R.inc(27925);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lixlixle6ndq0t.R.inc(27926);
        __CLR4_4_1lixlixle6ndq0t.R.inc(27927);return new TestSuite(TestConverterManager.class);
    }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}}

    public TestConverterManager(String name) {
        super(name);__CLR4_4_1lixlixle6ndq0t.R.inc(27929);try{__CLR4_4_1lixlixle6ndq0t.R.inc(27928);
    }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testRemoveInstantConverter3176() {__CLR4_4_1lixlixle6ndq0t.R.globalSliceStart(getClass().getName(),27930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v6qtk7lju();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lixlixle6ndq0t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lixlixle6ndq0t.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveInstantConverter3176",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v6qtk7lju(){try{__CLR4_4_1lixlixle6ndq0t.R.inc(27930); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27931);InstantConverter removed = ConverterManager.getInstance().removeInstantConverter(null); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27932);assertEquals(null, removed); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27933);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}}
public void testGetPartialConverter177() {__CLR4_4_1lixlixle6ndq0t.R.globalSliceStart(getClass().getName(),27934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vfcv8rljy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lixlixle6ndq0t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lixlixle6ndq0t.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPartialConverter177",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vfcv8rljy(){try{__CLR4_4_1lixlixle6ndq0t.R.inc(27934); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27935);PartialConverter c = ConverterManager.getInstance().getPartialConverter(new Long(0L)); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27936);assertEquals(Long.class, c.getSupportedType()); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27937);c = ConverterManager.getInstance().getPartialConverter(new TimeOfDay()); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27938);assertEquals(ReadablePartial.class, c.getSupportedType()); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27939);c = ConverterManager.getInstance().getPartialConverter(new DateTime()); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27940);assertEquals(ReadableInstant.class, c.getSupportedType()); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27941);c = ConverterManager.getInstance().getPartialConverter(""); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27942);assertEquals(String.class, c.getSupportedType()); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27943);c = ConverterManager.getInstance().getPartialConverter(new Date()); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27944);assertEquals(Date.class, c.getSupportedType()); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27945);c = ConverterManager.getInstance().getPartialConverter(new GregorianCalendar()); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27946);assertEquals(Calendar.class, c.getSupportedType()); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27947);c = ConverterManager.getInstance().getPartialConverter(null); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27948);assertEquals(null, c.getSupportedType()); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27949);try { 
         __CLR4_4_1lixlixle6ndq0t.R.inc(27950);ConverterManager.getInstance().getPartialConverter(Boolean.TRUE); 
         __CLR4_4_1lixlixle6ndq0t.R.inc(27951);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}}
public void testAddPartialConverter4178() {__CLR4_4_1lixlixle6ndq0t.R.globalSliceStart(getClass().getName(),27952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19rpestlkg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lixlixle6ndq0t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lixlixle6ndq0t.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverter4178",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19rpestlkg(){try{__CLR4_4_1lixlixle6ndq0t.R.inc(27952); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27953);PartialConverter removed = ConverterManager.getInstance().addPartialConverter(null); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27954);assertEquals(null, removed); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27955);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}}
public void testGetDurationConverterRemovedNull179() {__CLR4_4_1lixlixle6ndq0t.R.globalSliceStart(getClass().getName(),27956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kp8nd1lkk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lixlixle6ndq0t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lixlixle6ndq0t.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetDurationConverterRemovedNull179",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kp8nd1lkk(){try{__CLR4_4_1lixlixle6ndq0t.R.inc(27956); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27957);try { 
         __CLR4_4_1lixlixle6ndq0t.R.inc(27958);ConverterManager.getInstance().removeDurationConverter(NullConverter.INSTANCE); 
         __CLR4_4_1lixlixle6ndq0t.R.inc(27959);try { 
             __CLR4_4_1lixlixle6ndq0t.R.inc(27960);ConverterManager.getInstance().getDurationConverter(null); 
             __CLR4_4_1lixlixle6ndq0t.R.inc(27961);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         __CLR4_4_1lixlixle6ndq0t.R.inc(27962);ConverterManager.getInstance().addDurationConverter(NullConverter.INSTANCE); 
     } 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27963);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
 }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}}
public void testAddDurationConverter3180() {__CLR4_4_1lixlixle6ndq0t.R.globalSliceStart(getClass().getName(),27964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16pennqlks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lixlixle6ndq0t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lixlixle6ndq0t.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddDurationConverter3180",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16pennqlks(){try{__CLR4_4_1lixlixle6ndq0t.R.inc(27964); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27965);DurationConverter removed = ConverterManager.getInstance().addDurationConverter(null); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27966);assertEquals(null, removed); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27967);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
 }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}}
public void testRemovePeriodConverter3181() {__CLR4_4_1lixlixle6ndq0t.R.globalSliceStart(getClass().getName(),27968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ukzfmvlkw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lixlixle6ndq0t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lixlixle6ndq0t.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePeriodConverter3181",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27968,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ukzfmvlkw(){try{__CLR4_4_1lixlixle6ndq0t.R.inc(27968); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27969);PeriodConverter removed = ConverterManager.getInstance().removePeriodConverter(null); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27970);assertEquals(null, removed); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27971);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length); 
 }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}}
public void testAddIntervalConverter1182() {__CLR4_4_1lixlixle6ndq0t.R.globalSliceStart(getClass().getName(),27972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19qhek3ll0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lixlixle6ndq0t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lixlixle6ndq0t.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddIntervalConverter1182",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27972,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19qhek3ll0(){try{__CLR4_4_1lixlixle6ndq0t.R.inc(27972); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27973);IntervalConverter c = new IntervalConverter() { 
  
         public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1lixlixle6ndq0t.R.inc(27974); 
             __CLR4_4_1lixlixle6ndq0t.R.inc(27975);return false; 
         }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}} 
  
         public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1lixlixle6ndq0t.R.inc(27976); 
         }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1lixlixle6ndq0t.R.inc(27977); 
             __CLR4_4_1lixlixle6ndq0t.R.inc(27978);return Boolean.class; 
         }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}} 
     }; 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27979);try { 
         __CLR4_4_1lixlixle6ndq0t.R.inc(27980);IntervalConverter removed = ConverterManager.getInstance().addIntervalConverter(c); 
         __CLR4_4_1lixlixle6ndq0t.R.inc(27981);assertEquals(null, removed); 
         __CLR4_4_1lixlixle6ndq0t.R.inc(27982);assertEquals(Boolean.class, ConverterManager.getInstance().getIntervalConverter(Boolean.TRUE).getSupportedType()); 
         __CLR4_4_1lixlixle6ndq0t.R.inc(27983);assertEquals(INTERVAL_SIZE + 1, ConverterManager.getInstance().getIntervalConverters().length); 
     } finally { 
         __CLR4_4_1lixlixle6ndq0t.R.inc(27984);ConverterManager.getInstance().removeIntervalConverter(c); 
     } 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27985);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}}
public void testRemoveIntervalConverter3183() {__CLR4_4_1lixlixle6ndq0t.R.globalSliceStart(getClass().getName(),27986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eebg9xlle();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lixlixle6ndq0t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lixlixle6ndq0t.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveIntervalConverter3183",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27986,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eebg9xlle(){try{__CLR4_4_1lixlixle6ndq0t.R.inc(27986); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27987);IntervalConverter removed = ConverterManager.getInstance().removeIntervalConverter(null); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27988);assertEquals(null, removed); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27989);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}}
public void testGetPeriodConverter184() {__CLR4_4_1lixlixle6ndq0t.R.globalSliceStart(getClass().getName(),27990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m66uyhlli();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lixlixle6ndq0t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lixlixle6ndq0t.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPeriodConverter184",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27990,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m66uyhlli(){try{__CLR4_4_1lixlixle6ndq0t.R.inc(27990); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27991);PeriodConverter c = ConverterManager.getInstance().getPeriodConverter(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27992);assertEquals(ReadablePeriod.class, c.getSupportedType()); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27993);c = ConverterManager.getInstance().getPeriodConverter(new Duration(123L)); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27994);assertEquals(ReadableDuration.class, c.getSupportedType()); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27995);c = ConverterManager.getInstance().getPeriodConverter(new Interval(0L, 1000L)); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27996);assertEquals(ReadableInterval.class, c.getSupportedType()); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27997);c = ConverterManager.getInstance().getPeriodConverter(""); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27998);assertEquals(String.class, c.getSupportedType()); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(27999);c = ConverterManager.getInstance().getPeriodConverter(null); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(28000);assertEquals(null, c.getSupportedType()); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(28001);try { 
         __CLR4_4_1lixlixle6ndq0t.R.inc(28002);ConverterManager.getInstance().getPeriodConverter(Boolean.TRUE); 
         __CLR4_4_1lixlixle6ndq0t.R.inc(28003);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}}
public void testGetInstantConverterOKMultipleMatches185() {__CLR4_4_1lixlixle6ndq0t.R.globalSliceStart(getClass().getName(),28004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u3k4pdllw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lixlixle6ndq0t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lixlixle6ndq0t.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverterOKMultipleMatches185",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28004,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u3k4pdllw(){try{__CLR4_4_1lixlixle6ndq0t.R.inc(28004); 
     __CLR4_4_1lixlixle6ndq0t.R.inc(28005);InstantConverter c = new InstantConverter() { 
  
         public long getInstantMillis(Object object, Chronology chrono) {try{__CLR4_4_1lixlixle6ndq0t.R.inc(28006); 
             __CLR4_4_1lixlixle6ndq0t.R.inc(28007);return 0; 
         }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_1lixlixle6ndq0t.R.inc(28008); 
             __CLR4_4_1lixlixle6ndq0t.R.inc(28009);return null; 
         }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}} 
  
         public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_1lixlixle6ndq0t.R.inc(28010); 
             __CLR4_4_1lixlixle6ndq0t.R.inc(28011);return null; 
         }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}} 
  
         public Class getSupportedType() {try{__CLR4_4_1lixlixle6ndq0t.R.inc(28012); 
             __CLR4_4_1lixlixle6ndq0t.R.inc(28013);return ReadableDateTime.class; 
         }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}} 
     }; 
     __CLR4_4_1lixlixle6ndq0t.R.inc(28014);try { 
         __CLR4_4_1lixlixle6ndq0t.R.inc(28015);ConverterManager.getInstance().addInstantConverter(c); 
         __CLR4_4_1lixlixle6ndq0t.R.inc(28016);InstantConverter ok = ConverterManager.getInstance().getInstantConverter(new DateTime()); 
         __CLR4_4_1lixlixle6ndq0t.R.inc(28017);assertEquals(ReadableDateTime.class, ok.getSupportedType()); 
     } finally { 
         __CLR4_4_1lixlixle6ndq0t.R.inc(28018);ConverterManager.getInstance().removeInstantConverter(c); 
     } 
     __CLR4_4_1lixlixle6ndq0t.R.inc(28019);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 }finally{__CLR4_4_1lixlixle6ndq0t.R.flushNeeded();}}
    

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
