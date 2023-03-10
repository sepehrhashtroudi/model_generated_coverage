/*
 * Copyright (C) 2010 Google Inc.
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

package com.google.gson;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import junit.framework.TestCase;

public final class MixedStreamTest extends TestCase {

  private static final Car BLUE_MUSTANG = new Car("mustang", 0x0000FF);
  private static final Car BLACK_BMW = new Car("bmw", 0x000000);
  private static final Car RED_MIATA = new Car("miata", 0xFF0000);
  private static final String CARS_JSON = "[\n"
      + "  {\n"
      + "    \"name\": \"mustang\",\n"
      + "    \"color\": 255\n"
      + "  },\n"
      + "  {\n"
      + "    \"name\": \"bmw\",\n"
      + "    \"color\": 0\n"
      + "  },\n"
      + "  {\n"
      + "    \"name\": \"miata\",\n"
      + "    \"color\": 16711680\n"
      + "  }\n"
      + "]";


public void testWriteHtmlSafe31() { 
     List<String> contents = Arrays.asList("<", ">", "&", "=", "'"); 
     Type type = new TypeToken<List<String>>() { 
     }.getType(); 
     StringWriter writer = new StringWriter(); 
     new Gson().toJson(contents, type, new JsonWriter(writer)); 
     assertEquals("[\"\\u003c\",\"\\u003e\",\"\\u0026\",\"\\u003d\",\"\\u0027\"]", writer.toString()); 
     writer = new StringWriter(); 
     new GsonBuilder().disableHtmlEscaping().create().toJson(contents, type, new JsonWriter(writer)); 
     assertEquals("[\"<\",\">\",\"&\",\"=\",\"'\"]", writer.toString()); 
 } 


public void testReaderDoesNotMutateState72() throws IOException { 
     Gson gson = new Gson(); 
     JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON)); 
     jsonReader.beginArray(); 
     jsonReader.setLenient(false); 
     gson.fromJson(jsonReader, Car.class); 
     assertFalse(jsonReader.isLenient()); 
     jsonReader.setLenient(true); 
     gson.fromJson(jsonReader, Car.class); 
     assertTrue(jsonReader.isLenient()); 
 } 


public void testReadInvalidState124() throws IOException { 
     Gson gson = new Gson(); 
     JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON)); 
     jsonReader.beginArray(); 
     jsonReader.beginObject(); 
     try { 
         gson.fromJson(jsonReader, String.class); 
         fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
 } 

  

  
  
  

  

  

  

  

  
  
  
  
  

  
  
  

  static final class Car {
    String name;
    int color;

    Car(String name, int color) {
      this.name = name;
      this.color = color;
    }

    // used by Gson
    Car() {}

    @Override public int hashCode() {
      return name.hashCode() ^ color;
    }

    @Override public boolean equals(Object o) {
      return o instanceof Car
          && ((Car) o).name.equals(name)
          && ((Car) o).color == color;
    }
  }
}
