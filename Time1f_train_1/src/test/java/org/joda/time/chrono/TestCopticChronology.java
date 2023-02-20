/*
 *  Copyright 2001-2013 Stephen Colebourne
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
package org.joda.time.chrono;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.DateTime.Property;

/**
 * This class is a Junit unit test for CopticChronology.
 *
 * @author Stephen Colebourne
 */
public class TestCopticChronology extends TestCase {

    private static final int MILLIS_PER_DAY = DateTimeConstants.MILLIS_PER_DAY;

    private static long SKIP = 1 * MILLIS_PER_DAY;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        SKIP = 1 * MILLIS_PER_DAY;
        return new TestSuite(TestCopticChronology.class);
    }

    public TestCopticChronology(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        originalDateTimeZone = DateTimeZone.getDefault();
        originalTimeZone = TimeZone.getDefault();
        originalLocale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        Locale.setDefault(Locale.UK);
    }

    protected void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(originalDateTimeZone);
        TimeZone.setDefault(originalTimeZone);
        Locale.setDefault(originalLocale);
        originalDateTimeZone = null;
        originalTimeZone = null;
        originalLocale = null;
    }

    //-----------------------------------------------------------------------

public void testFactory_Zone297() { 
     assertEquals(TOKYO, CopticChronology.getInstance(TOKYO).getZone()); 
     assertEquals(PARIS, CopticChronology.getInstance(PARIS).getZone()); 
     assertEquals(LONDON, CopticChronology.getInstance(null).getZone()); 
     assertSame(CopticChronology.class, CopticChronology.getInstance(TOKYO).getClass()); 
 } 


public void testDurationFields298() { 
     final CopticChronology coptic = CopticChronology.getInstance(); 
     assertEquals("eras", coptic.eras().getName()); 
     assertEquals("centuries", coptic.centuries().getName()); 
     assertEquals("years", coptic.years().getName()); 
     assertEquals("weekyears", coptic.weekyears().getName()); 
     assertEquals("months", coptic.months().getName()); 
     assertEquals("weeks", coptic.weeks().getName()); 
     assertEquals("days", coptic.days().getName()); 
     assertEquals("halfdays", coptic.halfdays().getName()); 
     assertEquals("hours", coptic.hours().getName()); 
     assertEquals("minutes", coptic.minutes().getName()); 
     assertEquals("seconds", coptic.seconds().getName()); 
     assertEquals("millis", coptic.millis().getName()); 
     assertEquals(false, coptic.eras().isSupported()); 
     assertEquals(true, coptic.centuries().isSupported()); 
     assertEquals(true, coptic.years().isSupported()); 
     assertEquals(true, coptic.weekyears().isSupported()); 
     assertEquals(true, coptic.months().isSupported()); 
     assertEquals(true, coptic.weeks().isSupported()); 
     assertEquals(true, coptic.days().isSupported()); 
     assertEquals(true, coptic.halfdays().isSupported()); 
     assertEquals(true, coptic.hours().isSupported()); 
     assertEquals(true, coptic.minutes().isSupported()); 
     assertEquals(true, coptic.seconds().isSupported()); 
     assertEquals(true, coptic.millis().isSupported()); 
     assertEquals(false, coptic.centuries().isPrecise()); 
     assertEquals(false, coptic.years().isPrecise()); 
     assertEquals(false, coptic.weekyears().isPrecise()); 
     assertEquals(false, coptic.months().isPrecise()); 
     assertEquals(false, coptic.weeks().isPrecise()); 
     assertEquals(false, coptic.days().isPrecise()); 
     assertEquals(false, coptic.halfdays().isPrecise()); 
     assertEquals(true, coptic.hours().isPrecise()); 
     assertEquals(true, coptic.minutes().isPrecise()); 
     assertEquals(true, coptic.seconds().isPrecise()); 
     assertEquals(true, coptic.millis().isPrecise()); 
     final CopticChronology copticUTC = CopticChronology.getInstanceUTC(); 
     assertEquals(false, copticUTC.centuries().isPrecise()); 
     assertEquals(false, copticUTC.years().isPrecise()); 
     assertEquals(false, copticUTC.weekyears().isPrecise()); 
     assertEquals(false, copticUTC.months().isPrecise()); 
     assertEquals(true, copticUTC.weeks().isPrecise()); 
     assertEquals(true, copticUTC.days().isPrecise()); 
     assertEquals(true, copticUTC.halfdays().isPrecise()); 
     assertEquals(true, copticUTC.hours().isPrecise()); 
     assertEquals(true, copticUTC.minutes().isPrecise()); 
     assertEquals(true, copticUTC.seconds().isPrecise()); 
     assertEquals(true, copticUTC.millis().isPrecise()); 
     final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT"); 
     final CopticChronology copticGMT = CopticChronology.getInstance(gmt); 
     assertEquals(false, copticGMT.centuries().isPrecise()); 
     assertEquals(false, copticGMT.years().isPrecise()); 
     assertEquals(false, copticGMT.weekyears().isPrecise()); 
     assertEquals(false, copticGMT.months().isPrecise()); 
     assertEquals(true, copticGMT.weeks().isPrecise()); 
     assertEquals(true, copticGMT.days().isPrecise()); 
     assertEquals(true, copticGMT.halfdays().isPrecise()); 
     assertEquals(true, copticGMT.hours().isPrecise()); 
     assertEquals(true, copticGMT.minutes().isPrecise()); 
     assertEquals(true, copticGMT.seconds().isPrecise()); 
     assertEquals(true, copticGMT.millis().isPrecise()); 
 } 


public void testWithZone300() { 
     assertSame(CopticChronology.getInstance(TOKYO), CopticChronology.getInstance(TOKYO).withZone(TOKYO)); 
     assertSame(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(TOKYO).withZone(LONDON)); 
     assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstance(TOKYO).withZone(PARIS)); 
     assertSame(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(TOKYO).withZone(null)); 
     assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstance().withZone(PARIS)); 
     assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstanceUTC().withZone(PARIS)); 
 } 


public void testEra301() { 
     assertEquals(1, CopticChronology.AM); 
     try { 
         new DateTime(-1, 13, 5, 0, 0, 0, 0, COPTIC_UTC); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testDurationMonth521() { 
     DateTime dt11 = new DateTime(1723, 11, 2, 0, 0, 0, 0, COPTIC_UTC); 
     DateTime dt12 = new DateTime(1723, 12, 2, 0, 0, 0, 0, COPTIC_UTC); 
     DateTime dt13 = new DateTime(1723, 13, 2, 0, 0, 0, 0, COPTIC_UTC); 
     DateTime dt01 = new DateTime(1724, 1, 2, 0, 0, 0, 0, COPTIC_UTC); 
     DurationField fld = dt11.monthOfYear().getDurationField(); 
     assertEquals(COPTIC_UTC.months(), fld); 
     assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1, dt11.getMillis())); 
     assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2, dt11.getMillis())); 
     assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3, dt11.getMillis())); 
     assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4, dt11.getMillis())); 
     assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1)); 
     assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2)); 
     assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13)); 
     assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L, dt11.getMillis())); 
     assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L, dt11.getMillis())); 
     assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3L, dt11.getMillis())); 
     assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4L, dt11.getMillis())); 
     assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L)); 
     assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L)); 
     assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13L)); 
     assertEquals(0, fld.getValue(1L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY, dt11.getMillis())); 
     assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     assertEquals(1, fld.getValue(2L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY, dt11.getMillis())); 
     assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     assertEquals(2, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis())); 
     assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     assertEquals(3, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis())); 
     assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1)); 
     assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2)); 
     assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3)); 
     assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1L)); 
     assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2L)); 
     assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3L)); 
 } 


public void testDurationYear531() { 
     DateTime dt20 = new DateTime(1720, 10, 2, 0, 0, 0, 0, COPTIC_UTC); 
     DateTime dt21 = new DateTime(1721, 10, 2, 0, 0, 0, 0, COPTIC_UTC); 
     DateTime dt22 = new DateTime(1722, 10, 2, 0, 0, 0, 0, COPTIC_UTC); 
     DateTime dt23 = new DateTime(1723, 10, 2, 0, 0, 0, 0, COPTIC_UTC); 
     DateTime dt24 = new DateTime(1724, 10, 2, 0, 0, 0, 0, COPTIC_UTC); 
     DurationField fld = dt20.year().getDurationField(); 
     assertEquals(COPTIC_UTC.years(), fld); 
     assertEquals(1L * 365L * MILLIS_PER_DAY, fld.getMillis(1, dt20.getMillis())); 
     assertEquals(2L * 365L * MILLIS_PER_DAY, fld.getMillis(2, dt20.getMillis())); 
     assertEquals(3L * 365L * MILLIS_PER_DAY, fld.getMillis(3, dt20.getMillis())); 
     assertEquals((4L * 365L + 1L) * MILLIS_PER_DAY, fld.getMillis(4, dt20.getMillis())); 
     assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getMillis(1)); 
     assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 2, fld.getMillis(2)); 
     assertEquals(1L * 365L * MILLIS_PER_DAY, fld.getMillis(1L, dt20.getMillis())); 
     assertEquals(2L * 365L * MILLIS_PER_DAY, fld.getMillis(2L, dt20.getMillis())); 
     assertEquals(3L * 365L * MILLIS_PER_DAY, fld.getMillis(3L, dt20.getMillis())); 
     assertEquals((4L * 365L + 1L) * MILLIS_PER_DAY, fld.getMillis(4L, dt20.getMillis())); 
     assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getMillis(1L)); 
     assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 2, fld.getMillis(2L)); 
     assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getUnitMillis()); 
     assertEquals(0, fld.getValue(1L * 365L * MILLIS_PER_DAY - 1L, dt20.getMillis())); 
     assertEquals(1, fld.getValue(1L * 365L * MILLIS_PER_DAY, dt20.getMillis())); 
     assertEquals(1, fld.getValue(1L * 365L * MILLIS_PER_DAY + 1L, dt20.getMillis())); 
     assertEquals(1, fld.getValue(2L * 365L * MILLIS_PER_DAY - 1L, dt20.getMillis())); 
     assertEquals(2, fld.getValue(2L * 365L * MILLIS_PER_DAY, dt20.getMillis())); 
     assertEquals(2, fld.getValue(2L * 365L * MILLIS_PER_DAY + 1L, dt20.getMillis())); 
     assertEquals(2, fld.getValue(3L * 365L * MILLIS_PER_DAY - 1L, dt20.getMillis())); 
     assertEquals(3, fld.getValue(3L * 365L * MILLIS_PER_DAY, dt20.getMillis())); 
     assertEquals(3, fld.getValue(3L * 365L * MILLIS_PER_DAY + 1L, dt20.getMillis())); 
     assertEquals(3, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY - 1L, dt20.getMillis())); 
     assertEquals(4, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY, dt20.getMillis())); 
     assertEquals(4, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY + 1L, dt20.getMillis())); 
     assertEquals(dt21.getMillis(), fld.add(dt20.getMillis(), 1)); 
     assertEquals(dt22.getMillis(), fld.add(dt20.getMillis(), 2)); 
     assertEquals(dt23.getMillis(), fld.add(dt20.getMillis(), 3)); 
     assertEquals(dt24.getMillis(), fld.add(dt20.getMillis(), 4)); 
     assertEquals(dt21.getMillis(), fld.add(dt20.getMillis(), 1L)); 
     assertEquals(dt22.getMillis(), fld.add(dt20.getMillis(), 2L)); 
     assertEquals(dt23.getMillis(), fld.add(dt20.getMillis(), 3L)); 
     assertEquals(dt24.getMillis(), fld.add(dt20.getMillis(), 4L)); 
 } 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    

    

    

    

    

}
