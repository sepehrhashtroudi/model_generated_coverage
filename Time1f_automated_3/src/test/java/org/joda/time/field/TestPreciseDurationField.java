/*
 *  Copyright 2001-2009 Stephen Colebourne
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
package org.joda.time.field;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for PreciseDurationField.
 *
 * @author Stephen Colebourne
 */
public class TestPreciseDurationField extends TestCase {
    
    private static final long LONG_INTEGER_MAX = Integer.MAX_VALUE;
    private static final int INTEGER_MAX = Integer.MAX_VALUE;
    private static final long LONG_MAX = Long.MAX_VALUE;
    
    private PreciseDurationField iField;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestPreciseDurationField.class);
    }

    public TestPreciseDurationField(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        iField = new PreciseDurationField(DurationFieldType.seconds(), 1000);
    }

    protected void tearDown() throws Exception {
        iField = null;
    }

    //-----------------------------------------------------------------------
public void test_hashCode165() { 
     assertEquals(iField.hashCode(), iField.hashCode()); 
     assertEquals(false, iField.hashCode() == ISOChronology.getInstance().minutes().hashCode()); 
     DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0); 
     assertEquals(false, iField.hashCode() == dummy.hashCode()); 
     dummy = new PreciseDurationField(DurationFieldType.seconds(), 1000); 
     assertEquals(true, iField.hashCode() == dummy.hashCode()); 
     dummy = new PreciseDurationField(DurationFieldType.millis(), 1000); 
     assertEquals(false, iField.hashCode() == dummy.hashCode()); 
 }
    

    //-----------------------------------------------------------------------
    

    
    
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
