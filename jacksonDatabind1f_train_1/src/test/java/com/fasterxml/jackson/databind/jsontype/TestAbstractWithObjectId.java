package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;

import java.util.*;

public class TestAbstractWithObjectId extends BaseMapTest
{
    interface BaseInterface { }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
    static class BaseInterfaceImpl implements BaseInterface {

        @JsonProperty
        private List<BaseInterfaceImpl> myInstances = new ArrayList<BaseInterfaceImpl>();

        void addInstance(BaseInterfaceImpl instance) {
            myInstances.add(instance);
        }
    }

    static class ListWrapper<T extends BaseInterface> {

        @JsonProperty
        private List<T> myList = new ArrayList<T>();

        void add(T t) {
            myList.add(t);
        }

        int size() {
            return myList.size();
        }
    }


public void testIssue877297() throws Exception { 
     BaseInterfaceImpl one = new BaseInterfaceImpl(); 
     BaseInterfaceImpl two = new BaseInterfaceImpl(); 
     one.addInstance(two); 
     two.addInstance(one); 
     ListWrapper<BaseInterfaceImpl> myList = new ListWrapper<BaseInterfaceImpl>(); 
     myList.add(one); 
     myList.add(two); 
     ObjectMapper om = new ObjectMapper(); 
     om.enableDefaultTypingAsProperty(ObjectMapper.DefaultTyping.NON_FINAL, "@class"); 
     String json = om.writerWithDefaultPrettyPrinter().writeValueAsString(myList); 
     ListWrapper<BaseInterfaceImpl> result; 
     result = om.readValue(json, new TypeReference<ListWrapper<BaseInterfaceImpl>>() { 
     }); 
     assertNotNull(result); 
     System.out.println("deserialised list size = " + result.size()); 
 } 

    
}
