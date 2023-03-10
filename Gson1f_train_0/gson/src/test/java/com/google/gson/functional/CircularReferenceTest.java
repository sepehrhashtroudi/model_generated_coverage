/*
 * Copyright (C) 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.gson.functional;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

import junit.framework.TestCase;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.common.TestTypes.ClassOverridingEquals;

/**
 * Functional tests related to circular reference detection and error reporting.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class CircularReferenceTest extends TestCase {
  private Gson gson;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    gson = new Gson();
  }


public void testCircularSerialization7() throws Exception { 
     ContainsReferenceToSelfType a = new ContainsReferenceToSelfType(); 
     ContainsReferenceToSelfType b = new ContainsReferenceToSelfType(); 
     a.children.add(b); 
     b.children.add(a); 
     try { 
         gson.toJson(a); 
         fail("Circular types should not get printed!"); 
     } catch (IllegalStateException expected) { 
         assertTrue(expected.getMessage().contains("children")); 
     } 
 } 


public void testSelfReferenceArrayFieldSerialization10() throws Exception { 
     ClassWithSelfReferenceArray objA = new ClassWithSelfReferenceArray(); 
     objA.children = new ClassWithSelfReferenceArray[] { objA }; 
     try { 
         gson.toJson(objA); 
         fail("Circular reference to self can not be serialized!"); 
     } catch (IllegalStateException expected) { 
         assertTrue(expected.getMessage().contains("children")); 
     } 
 } 


public void testSelfReferenceSerialization12() throws Exception { 
     ClassOverridingEquals objA = new ClassOverridingEquals(); 
     objA.ref = objA; 
     try { 
         gson.toJson(objA); 
         fail("Circular reference to self can not be serialized!"); 
     } catch (IllegalStateException expected) { 
     } 
 } 

  

  

  

  

  

  

  private static class ContainsReferenceToSelfType {
    Collection<ContainsReferenceToSelfType> children = new ArrayList<ContainsReferenceToSelfType>();
  }
  
  private static class ClassWithSelfReference {
    ClassWithSelfReference child;
  }

  private static class ClassWithSelfReferenceArray {
    @SuppressWarnings("unused")
    ClassWithSelfReferenceArray[] children;
  }
}
