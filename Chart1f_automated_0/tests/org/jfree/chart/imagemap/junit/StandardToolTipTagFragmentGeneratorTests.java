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
 * ---------------------------------------------
 * StandardToolTipTagFragmentGeneratorTests.java
 * ---------------------------------------------
 * (C) Copyright 2007, 2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 05-Dec-2007 : Version 1 (DG);
 *
 */

package org.jfree.chart.imagemap.junit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.imagemap.StandardToolTipTagFragmentGenerator;

/**
 * Tests for the {@link StandardToolTipTagFragmentGeneratorTests} class.
 */
public class StandardToolTipTagFragmentGeneratorTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(StandardToolTipTagFragmentGeneratorTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public StandardToolTipTagFragmentGeneratorTests(String name) {
        super(name);
    }

    /**
     * Some checks for the generateURLFragment() method.
     */
public void testGenerateToolTipFragment1027() { 
     StandardToolTipTagFragmentGenerator g = new StandardToolTipTagFragmentGenerator(); 
     assertEquals(" onMouseOver=\"return overlib('abc');\"" + " onMouseOut=\"return nd();\"", g.generateToolTipFragment("abc")); 
     assertEquals(" onMouseOver=\"return overlib(" + "'It\\'s \\\"A\\\", 100.0');\" onMouseOut=\"return nd();\"", g.generateToolTipFragment("It\'s \"A\", 100.0")); 
 }
public void testGenerateToolTipFragment1028() { 
     StandardToolTipTagFragmentGenerator g = new StandardToolTipTagFragmentGenerator(); 
     assertEquals("Title=\"abc\"", g.generateToolTipFragment("abc")); 
     assertEquals("Title=\"images/abc.png\"", g.generateToolTipFragment("images/abc.png")); 
     assertEquals("Title=\"http://www.jfree.org/images/abc.png\"", g.generateToolTipFragment("http://www.jfree.org/images/abc.png")); 
 }
    

}
