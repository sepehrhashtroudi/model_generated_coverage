/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3.mutable;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit tests.
 * 
 * @version $Id$
 * @see MutableLong
 */
public class MutableLongTest {

    // ----------------------------------------------------------------
@Test
public void testSubtractValueObject378() { 
     final MutableLong mutNum = new MutableLong(1); 
     mutNum.subtract(Long.valueOf(1)); 
     assertEquals(0, mutNum.intValue()); 
     assertEquals(0L, mutNum.longValue()); 
 }
@Test
public void testToString379() { 
     assertEquals("0", new MutableLong(0).toString()); 
     assertEquals("10", new MutableLong(10).toString()); 
     assertEquals("-123", new MutableLong(-123).toString()); 
 }
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

}
