package com.fasterxml.jackson.databind.deser;

import java.util.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@SuppressWarnings("serial")
public class TestGenericCollectionDeser
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Test classes, enums
    /**********************************************************
     */

    static class ListSubClass extends ArrayList<StringWrapper> { }

    /**
     * Map class that should behave like {@link ListSubClass}, but by
     * using annotations.
     */
    @JsonDeserialize(contentAs=StringWrapper.class)
    static class AnnotatedStringList extends ArrayList<Object> { }

    @JsonDeserialize(contentAs=BooleanWrapper.class)
    static class AnnotatedBooleanList extends ArrayList<Object> { }

    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */

    /*
    /**********************************************************
    /* Tests for sub-classing
    /**********************************************************
     */

    /**
     * Verifying that sub-classing works ok wrt generics information
     */

public void testAnnotatedBooleanList506() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     AnnotatedBooleanList result = mapper.readValue("[ false ]", AnnotatedBooleanList.class); 
     assertEquals(1, result.size()); 
     Object ob = result.get(0); 
     assertEquals(BooleanWrapper.class, ob.getClass()); 
     assertFalse(((BooleanWrapper) ob).b); 
 } 

    

    /*
    /**********************************************************
    /* Tests for annotations
    /**********************************************************
     */

    // Verifying that sub-classing works ok wrt generics information
    

    
}
