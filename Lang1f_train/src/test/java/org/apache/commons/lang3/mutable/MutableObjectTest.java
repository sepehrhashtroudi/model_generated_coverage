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
 * @see MutableShort
 */
public class MutableObjectTest {

    // ----------------------------------------------------------------
@Test
public void testHashCode294() { 
     final MutableObject<String> mutNumA = new MutableObject<String>("ALPHA"); 
     final MutableObject<String> mutNumB = new MutableObject<String>("ALPHA"); 
     final MutableObject<String> mutNumC = new MutableObject<String>("BETA"); 
     final MutableObject<String> mutNumD = new MutableObject<String>(null); 
     assertTrue(mutNumA.hashCode() == mutNumA.hashCode()); 
     assertTrue(mutNumA.hashCode() == mutNumB.hashCode()); 
     assertFalse(mutNumA.hashCode() == mutNumC.hashCode()); 
     assertFalse(mutNumA.hashCode() == mutNumD.hashCode()); 
     assertTrue(mutNumA.hashCode() == "ALPHA".hashCode()); 
     assertEquals(0, mutNumD.hashCode()); 
 }
@Test
public void testConstructors373() { 
     assertEquals(null, new MutableObject<String>().getValue()); 
     final Integer i = Integer.valueOf(6); 
     assertSame(i, new MutableObject<Integer>(i).getValue()); 
     assertSame("HI", new MutableObject<String>("HI").getValue()); 
     assertSame(null, new MutableObject<Object>(null).getValue()); 
 }
@Test
public void testGetSet616() { 
     final MutableObject<String> mutNum = new MutableObject<String>(); 
     assertEquals(null, new MutableObject<Object>().getValue()); 
     mutNum.setValue("HELLO"); 
     assertSame("HELLO", mutNum.getValue()); 
     mutNum.setValue(null); 
     assertSame(null, mutNum.getValue()); 
 }
@Test
public void testToString1261() { 
     assertEquals("HI", new MutableObject<String>("HI").toString()); 
     assertEquals("10.0", new MutableObject<Double>(Double.valueOf(10)).toString()); 
     assertEquals("null", new MutableObject<Object>(null).toString()); 
 }
    

    

    

    

    

}
