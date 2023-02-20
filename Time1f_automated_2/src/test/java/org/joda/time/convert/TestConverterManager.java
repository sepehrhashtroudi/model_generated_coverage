/*
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
public class TestConverterManager extends TestCase {
    private static final boolean OLD_JDK;
    static {
        String str = System.getProperty("java.version");
        boolean old = true;
        if (str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6')) {
            old = false;
        }
        OLD_JDK = old;
    }

    private static final Policy RESTRICT;
    private static final Policy ALLOW;
    static {
        // don't call Policy.getPolicy()
        RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {
                Permissions p = new Permissions();
                p.add(new AllPermission());  // enable everything
                return p;
            }
            public void refresh() {
            }
            public boolean implies(ProtectionDomain domain, Permission permission) {
                if (permission instanceof JodaTimePermission) {
                    return false;
                }
                return true;
//                return super.implies(domain, permission);
            }
        };
        ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {
                Permissions p = new Permissions();
                p.add(new AllPermission());  // enable everything
                return p;
            }
            public void refresh() {
            }
        };
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestConverterManager.class);
    }

    public TestConverterManager(String name) {
        super(name);
    }

    //-----------------------------------------------------------------------
public void testAddInstantConverter4210() { 
     InstantConverter removed = ConverterManager.getInstance().addInstantConverter(null); 
     assertEquals(null, removed); 
     assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 }
public void testGetPeriodConverterRemovedNull212() { 
     try { 
         ConverterManager.getInstance().removeInstantConverter(NullConverter.INSTANCE); 
         try { 
             ConverterManager.getInstance().getPeriodConverter(null); 
             fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         ConverterManager.getInstance().addInstantConverter(NullConverter.INSTANCE); 
     } 
     assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length); 
 }
public void testGetPeriodConverterRemovedNull213() { 
     try { 
         ConverterManager.getInstance().removePeriodConverter(NullConverter.INSTANCE); 
         try { 
             ConverterManager.getInstance().getPeriodConverter(null); 
             fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         ConverterManager.getInstance().addPeriodConverter(NullConverter.INSTANCE); 
     } 
     assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length); 
 }
public void testAddPartialConverter2214() { 
     PartialConverter c = new PartialConverter() { 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono) { 
             return null; 
         } 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono, DateTimeFormatter parser) { 
             return null; 
         } 
  
         public Chronology getChronology(Object object, DateTimeZone zone) { 
             return null; 
         } 
  
         public Chronology getChronology(Object object, Chronology chrono) { 
             return null; 
         } 
  
         public Class getSupportedType() { 
             return String.class; 
         } 
     }; 
     try { 
         PartialConverter removed = ConverterManager.getInstance().addPartialConverter(c); 
         assertEquals(StringConverter.INSTANCE, removed); 
         assertEquals(String.class, ConverterManager.getInstance().getPartialConverter("").getSupportedType()); 
         assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
     } finally { 
         ConverterManager.getInstance().addPartialConverter(StringConverter.INSTANCE); 
     } 
     assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }
public void testRemovePartialConverter2215() { 
     PartialConverter c = new PartialConverter() { 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono) { 
             return null; 
         } 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono, DateTimeFormatter parser) { 
             return null; 
         } 
  
         public Chronology getChronology(Object object, DateTimeZone zone) { 
             return null; 
         } 
  
         public Chronology getChronology(Object object, Chronology chrono) { 
             return null; 
         } 
  
         public Class getSupportedType() { 
             return String.class; 
         } 
     }; 
     try { 
         PartialConverter removed = ConverterManager.getInstance().removePartialConverter(c); 
         assertEquals(StringConverter.INSTANCE, removed); 
         assertEquals(String.class, ConverterManager.getInstance().getPartialConverter("").getSupportedType()); 
         assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
     } finally { 
         ConverterManager.getInstance().addPartialConverter(StringConverter.INSTANCE); 
     } 
     assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 }
public void testAddIntervalConverter1216() { 
     IntervalConverter c = new IntervalConverter() { 
  
         public boolean isReadableInterval(Object object, Chronology chrono) { 
             return false; 
         } 
  
         public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) { 
         } 
  
         public Class getSupportedType() { 
             return Boolean.class; 
         } 
     }; 
     try { 
         IntervalConverter removed = ConverterManager.getInstance().addIntervalConverter(c); 
         assertEquals(null, removed); 
         assertEquals(Boolean.class, ConverterManager.getInstance().getIntervalConverter(Boolean.TRUE).getSupportedType()); 
         assertEquals(INTERVAL_SIZE + 1, ConverterManager.getInstance().getIntervalConverters().length); 
     } finally { 
         ConverterManager.getInstance().removeIntervalConverter(c); 
     } 
     assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 }
    

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
