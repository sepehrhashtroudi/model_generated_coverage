/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2008, by Object Refinery Limited and Contributors.
 *
 * Project Info:  http://www.jfree.org/jfreechart/index.html
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 * [Java is a trademark or registered trademark of Sun Microsystems, Inc.
 * in the United States and other countries.]
 *
 * ----------------------------
 * SegmentedTimelineTests2.java
 * ----------------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 02-Aug-2004 : Added standard header (DG);
 * 02-Feb-2007 : Removed author tags all over JFreeChart sources (DG);
 *
 */

package org.jfree.chart.axis.junit;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;

import org.jfree.chart.axis.SegmentedTimeline;

/**
 * Some tests for the {@link SegmentedTimeline} class.
 */
public class SegmentedTimelineTests2 extends TestCase {

    /**
     * Constructor
     */
    public SegmentedTimelineTests2() {
        super();
    }

    /**
     * Test 1 checks 9am Friday 26 March 2004 converts to a timeline value and
     * back again correctly.  This is prior to Daylight Saving.
     */
    

    /**
     * Test 2 checks 9.15am Friday 26 March 2004 converts to a timeline value
     * and back again correctly.  This is prior to Daylight Saving.
     */
    

    /**
     * Test 3 checks 9.30am Friday 26 March 2004 converts to a timeline value
     * and back again correctly.  This is prior to Daylight Saving.
     */
    

    /**
     * Test 4 checks 9.30am Friday 26 March 2004 (+ 1 millisecond) converts to
     * a timeline value and back again correctly.  This is prior to Daylight
     * Saving.
     */
    

    /**
     * Test 5 checks 5.30pm Thursday 25 March 2004 converts to a timeline
     * value and back again correctly.  As it is in the excluded segment, we
     * expect it to map to 9am, Friday 26 March 2004.  This is prior to
     * Daylight Saving.
     */
    

    /**
     * Test 6 checks that 9am on Sunday 28 March 2004 converts to the timeline
     * value and back again correctly.  Note that Saturday and Sunday are
     * excluded from the timeline, so we expect the value to map to 9am on
     * Monday 29 March 2004. This is during daylight saving.
     */
    

    /**
     * Test 7 checks 9am Monday 29 March 2004 converts to a timeline value and
     * back again correctly.  This is during Daylight Saving.
     */
    

    /**
     * Test 8.
     */
    

    /**
     * Creates a timeline from 9am on Thursday 25 March 2004 to 5pm on
     * Tuesday 30 March 2004, for the UK locale.
     *
     * @return A timeline.
     */
    private SegmentedTimeline getTimeline() {
        Calendar cal = Calendar.getInstance(Locale.UK);
        cal.set(Calendar.YEAR, 2004);
        cal.set(Calendar.MONTH, Calendar.MARCH);
        cal.set(Calendar.DAY_OF_MONTH, 25);
        cal.set(Calendar.HOUR_OF_DAY, 9);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date from = cal.getTime();

        cal = Calendar.getInstance(Locale.UK);
        cal.set(Calendar.YEAR, 2004);
        cal.set(Calendar.MONTH, Calendar.MARCH);
        cal.set(Calendar.DAY_OF_MONTH, 30);
        cal.set(Calendar.HOUR_OF_DAY, 17);
        cal.set(Calendar.MINUTE, 30);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date to = cal.getTime();

        return getTimeline(from, to);
    }

    /**
     * Returns a segmented timeline for 15 minute segments, Monday to Friday
     * only, between 9am and 5pm.  The UK locale is used.
     *
     * @param start  the start date.
     * @param end  the end date.
     *
     * @return The timeline.
     */
    private SegmentedTimeline getTimeline(Date start, Date end) {

        Calendar cal = Calendar.getInstance(Locale.UK);
        cal.set(Calendar.YEAR, 1970);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 9);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date open = cal.getTime();

        cal = Calendar.getInstance(Locale.UK);
        cal.set(Calendar.YEAR, 1970);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 17);
        cal.set(Calendar.MINUTE, 30);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date close = cal.getTime();

        SegmentedTimeline result = null;
        // Create a segmented time line (segment size : 15 minutes)
        long quarterHourCount = (close.getTime() - open.getTime())
            / SegmentedTimeline.FIFTEEN_MINUTE_SEGMENT_SIZE;
        long totalQuarterHourCount = SegmentedTimeline.DAY_SEGMENT_SIZE
            / SegmentedTimeline.FIFTEEN_MINUTE_SEGMENT_SIZE;
        result = new SegmentedTimeline(
            SegmentedTimeline.FIFTEEN_MINUTE_SEGMENT_SIZE,
            (int) quarterHourCount,
            (int) (totalQuarterHourCount - quarterHourCount)
        );
        result.setAdjustForDaylightSaving(true);
        // Set start time
        result.setStartTime(start.getTime());
        // Saturday and Sundays are non business hours
        result.setBaseTimeline(
            SegmentedTimeline.newMondayThroughFridayTimeline()
        );
        /* PUT exclusions in test */
        if (start != null && end != null) {
            result.addBaseTimelineExclusions(start.getTime(), end.getTime());
        }

        return result;
    }


}
