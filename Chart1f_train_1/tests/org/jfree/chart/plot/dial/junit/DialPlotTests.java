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
 * ------------------
 * DialPlotTests.java
 * ------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 03-Nov-2006 : Version 1 (DG);
 *
 */

package org.jfree.chart.plot.dial.junit;

import java.awt.Color;
import java.awt.GradientPaint;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.plot.dial.ArcDialFrame;
import org.jfree.chart.plot.dial.DialBackground;
import org.jfree.chart.plot.dial.DialCap;
import org.jfree.chart.plot.dial.DialPlot;
import org.jfree.chart.plot.dial.StandardDialFrame;
import org.jfree.chart.plot.dial.StandardDialScale;

/**
 * Tests for the {@link DialPlot} class.
 */
public class DialPlotTests extends TestCase implements PlotChangeListener {

    /** The last plot change event received. */
    private PlotChangeEvent lastEvent;

    /**
     * Records the last plot change event received.
     *
     * @param event  the event.
     */
    public void plotChanged(PlotChangeEvent event) {
        this.lastEvent = event;
    }


    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DialPlotTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DialPlotTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */

public void testLayerListener36() { 
     DialPlot p = new DialPlot(); 
     DialBackground b1 = new DialBackground(Color.red); 
     p.addLayer(b1); 
     p.addChangeListener(this); 
     this.lastEvent = null; 
     b1.setPaint(Color.blue); 
     assertNotNull(this.lastEvent); 
     DialBackground b2 = new DialBackground(Color.green); 
     p.addLayer(b2); 
     this.lastEvent = null; 
     b1.setPaint(Color.red); 
     assertNotNull(this.lastEvent); 
     b2.setPaint(Color.green); 
     assertNotNull(this.lastEvent); 
     p.removeLayer(b2); 
     this.lastEvent = null; 
     b2.setPaint(Color.red); 
     assertNull(this.lastEvent); 
 } 


public void testEquals136() { 
     DialPlot p1 = new DialPlot(); 
     DialPlot p2 = new DialPlot(); 
     assertTrue(p1.equals(p2)); 
     p1.setBackground(new DialBackground(Color.green)); 
     assertFalse(p1.equals(p2)); 
     p2.setBackground(new DialBackground(Color.green)); 
     assertTrue(p1.equals(p2)); 
     p1.setBackground(null); 
     assertFalse(p1.equals(p2)); 
     p2.setBackground(null); 
     assertTrue(p1.equals(p2)); 
     DialCap cap1 = new DialCap(); 
     cap1.setFillPaint(Color.red); 
     p1.setCap(cap1); 
     assertFalse(p1.equals(p2)); 
     DialCap cap2 = new DialCap(); 
     cap2.setFillPaint(Color.red); 
     p2.setCap(cap2); 
     assertTrue(p1.equals(p2)); 
     p1.setCap(null); 
     assertFalse(p1.equals(p2)); 
     p2.setCap(null); 
     assertTrue(p1.equals(p2)); 
     StandardDialFrame f1 = new StandardDialFrame(); 
     f1.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.white)); 
     p1.setDialFrame(f1); 
     assertFalse(p1.equals(p2)); 
     StandardDialFrame f2 = new StandardDialFrame(); 
     f2.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.white)); 
     p2.setDialFrame(f2); 
     assertTrue(p1.equals(p2)); 
     p1.setView(0.2, 0.0, 0.8, 1.0); 
     assertFalse(p1.equals(p2)); 
     p2.setView(0.2, 0.0, 0.8, 1.0); 
     assertTrue(p1.equals(p2)); 
     p1.addLayer(new StandardDialScale()); 
     assertFalse(p1.equals(p2)); 
     p2.addLayer(new StandardDialScale()); 
     assertTrue(p1.equals(p2)); 
 } 


public void testScaleListener278() { 
     DialPlot p = new DialPlot(); 
     StandardDialScale s1 = new StandardDialScale(); 
     p.addScale(0, s1); 
     p.addChangeListener(this); 
     this.lastEvent = null; 
     s1.setStartAngle(22.0); 
     assertNotNull(this.lastEvent); 
     StandardDialScale s2 = new StandardDialScale(); 
     p.addScale(0, s2); 
     this.lastEvent = null; 
     s1.setStartAngle(33.0); 
     assertNull(this.lastEvent); 
     s2.setStartAngle(33.0); 
     assertNotNull(this.lastEvent); 
 } 


public void testBackgroundListener387() { 
     DialPlot p = new DialPlot(); 
     DialBackground b1 = new DialBackground(Color.red); 
     p.setBackground(b1); 
     p.addChangeListener(this); 
     this.lastEvent = null; 
     b1.setPaint(Color.blue); 
     assertNotNull(this.lastEvent); 
     DialBackground b2 = new DialBackground(Color.green); 
     p.setBackground(b2); 
     this.lastEvent = null; 
     b1.setPaint(Color.red); 
     assertNull(this.lastEvent); 
     b2.setPaint(Color.red); 
     assertNotNull(this.lastEvent); 
 } 


public void testCapListener388() { 
     DialPlot p = new DialPlot(); 
     DialCap c1 = new DialCap(); 
     p.setCap(c1); 
     p.addChangeListener(this); 
     this.lastEvent = null; 
     c1.setFillPaint(Color.red); 
     assertNotNull(this.lastEvent); 
     DialCap c2 = new DialCap(); 
     p.setCap(c2); 
     this.lastEvent = null; 
     c1.setFillPaint(Color.blue); 
     assertNull(this.lastEvent); 
     c2.setFillPaint(Color.green); 
     assertNotNull(this.lastEvent); 
 } 


public void testCloning389() { 
     DialPlot p1 = new DialPlot(); 
     DialPlot p2 = null; 
     try { 
         p2 = (DialPlot) p1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(p1 != p2); 
     assertTrue(p1.getClass() == p2.getClass()); 
     assertTrue(p1.equals(p2)); 
 } 

    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Confirm that cloning works.
     */
    


    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Check the notification event mechanism for the dial background.
     */
    

    /**
     * Check the notification event mechanism for the dial cap.
     */
    

    /**
     * Check the notification event mechanism for the dial frame.
     */
    

    /**
     * Check the notification event mechanism for the dial scales.
     */
    

    /**
     * Check the notification event mechanism for a layer.
     */
    

}
