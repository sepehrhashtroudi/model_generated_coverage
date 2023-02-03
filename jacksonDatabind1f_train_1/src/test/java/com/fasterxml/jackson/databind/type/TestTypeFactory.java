package com.fasterxml.jackson.databind.type;

import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.HierarchicType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.test.BaseTest;

/**
 * Simple tests to verify that the {@link TypeFactory} constructs
 * type information as expected.
 */
public class TestTypeFactory
    extends BaseTest
{    
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */

    enum EnumForCanonical { YES, NO; }

    static class SingleArgGeneric<X> { }

    abstract static class MyMap extends IntermediateMap<String,Long> { }
    abstract static class IntermediateMap<K,V> implements Map<K,V> { }

    abstract static class MyList extends IntermediateList<Long> { }
    abstract static class IntermediateList<E> implements List<E> { }

    @SuppressWarnings("serial")
    static class GenericList<T> extends ArrayList<T> { }
    
    interface MapInterface extends Cloneable, IntermediateInterfaceMap<String> { }
    interface IntermediateInterfaceMap<FOO> extends Map<FOO, Integer> { }

    @SuppressWarnings("serial")
    static class MyStringIntMap extends MyStringXMap<Integer> { }
    @SuppressWarnings("serial")
    static class MyStringXMap<V> extends HashMap<String,V> { }

    // And one more, now with obfuscated type names; essentially it's just Map<Int,Long>
    static abstract class IntLongMap extends XLongMap<Integer> { }
    // trick here is that V now refers to key type, not value type
    static abstract class XLongMap<V> extends XXMap<V,Long> { }
    static abstract class XXMap<K,V> implements Map<K,V> { }

    static class SneakyBean {
        public IntLongMap intMap;
        public MyList longList;
    }

    static class SneakyBean2 {
        // self-reference; should be resolved as "Comparable<Object>"
        public <T extends Comparable<T>> T getFoobar() { return null; }
    }
    
    @SuppressWarnings("serial")
    public static class LongValuedMap<K> extends HashMap<K, Long> { }

    static class StringLongMapBean {
        public LongValuedMap<String> value;
    }

    static class StringListBean {
        public GenericList<String> value;
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */
    

public void testCanonicalNames152() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     JavaType t = tf.constructType(java.util.Calendar.class); 
     String can = t.toCanonical(); 
     assertEquals("java.util.Calendar", can); 
     assertEquals(t, tf.constructFromCanonical(can)); 
     t = tf.constructType(java.util.ArrayList.class); 
     can = t.toCanonical(); 
     assertEquals("java.util.ArrayList<java.lang.Object>", can); 
     assertEquals(t, tf.constructFromCanonical(can)); 
     t = tf.constructType(java.util.TreeMap.class); 
     can = t.toCanonical(); 
     assertEquals("java.util.TreeMap<java.lang.Object,java.lang.Object>", can); 
     assertEquals(t, tf.constructFromCanonical(can)); 
     t = tf.constructMapType(EnumMap.class, EnumForCanonical.class, String.class); 
     can = t.toCanonical(); 
     assertEquals("java.util.EnumMap<com.fasterxml.jackson.databind.type.TestTypeFactory$EnumForCanonical,java.lang.String>", can); 
     assertEquals(t, tf.constructFromCanonical(can)); 
 } 


public void testParametricTypes228() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     JavaType t = tf.constructParametricType(ArrayList.class, String.class); 
     assertEquals(CollectionType.class, t.getClass()); 
     JavaType strC = tf.constructType(String.class); 
     assertEquals(1, t.containedTypeCount()); 
     assertEquals(strC, t.containedType(0)); 
     assertNull(t.containedType(1)); 
     JavaType t2 = tf.constructParametricType(Map.class, strC, t); 
     assertEquals(MapType.class, t2.getClass()); 
     assertEquals(2, t2.containedTypeCount()); 
     assertEquals(strC, t2.containedType(0)); 
     assertEquals(t, t2.containedType(1)); 
     assertNull(t2.containedType(2)); 
     JavaType custom = tf.constructParametricType(SingleArgGeneric.class, String.class); 
     assertEquals(SimpleType.class, custom.getClass()); 
     assertEquals(1, custom.containedTypeCount()); 
     assertEquals(strC, custom.containedType(0)); 
     assertNull(custom.containedType(1)); 
     assertEquals("X", custom.containedTypeName(0)); 
     try { 
         tf.constructParametricType(Map.class, strC); 
     } catch (IllegalArgumentException e) { 
         verifyException(e, "Need exactly 2 parameter types for Map types"); 
     } 
     try { 
         tf.constructParametricType(SingleArgGeneric.class, strC, strC); 
     } catch (IllegalArgumentException e) { 
         verifyException(e, "expected 1 parameters, was given 2"); 
     } 
 } 


public void testAtomicArrayRefParameters243() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     JavaType type = tf.constructType(new TypeReference<AtomicReference<long[]>>() { 
     }); 
     JavaType[] params = tf.findTypeParameters(type, AtomicReference.class); 
     assertNotNull(params); 
     assertEquals(1, params.length); 
     assertEquals(tf.constructType(long[].class), params[0]); 
 } 


public void testMapTypesRaw244() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     JavaType type = tf.constructType(HashMap.class); 
     MapType mapType = (MapType) type; 
     assertEquals(tf.constructType(Object.class), mapType.getKeyType()); 
     assertEquals(tf.constructType(Object.class), mapType.getContentType()); 
 } 


public void testCollections245() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     JavaType t = tf.constructType(ArrayList.class); 
     assertEquals(CollectionType.class, t.getClass()); 
     assertSame(ArrayList.class, t.getRawClass()); 
     t = tf.constructType(new TypeReference<ArrayList<String>>() { 
     }); 
     assertEquals(CollectionType.class, t.getClass()); 
     assertSame(ArrayList.class, t.getRawClass()); 
     JavaType elemType = ((CollectionType) t).getContentType(); 
     assertNotNull(elemType); 
     assertSame(SimpleType.class, elemType.getClass()); 
     assertSame(String.class, elemType.getRawClass()); 
     t = tf.constructCollectionType(ArrayList.class, String.class); 
     assertEquals(CollectionType.class, t.getClass()); 
     assertSame(String.class, ((CollectionType) t).getContentType().getRawClass()); 
 } 


public void testMoreSpecificType246() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     JavaType t1 = tf.constructCollectionType(Collection.class, Object.class); 
     JavaType t2 = tf.constructCollectionType(List.class, Object.class); 
     assertSame(t2, tf.moreSpecificType(t1, t2)); 
     assertSame(t2, tf.moreSpecificType(t2, t1)); 
     t1 = tf.constructType(Double.class); 
     t2 = tf.constructType(Number.class); 
     assertSame(t1, tf.moreSpecificType(t1, t2)); 
     assertSame(t1, tf.moreSpecificType(t2, t1)); 
     t1 = tf.constructType(Double.class); 
     t2 = tf.constructType(String.class); 
     assertSame(t1, tf.moreSpecificType(t1, t2)); 
     assertSame(t2, tf.moreSpecificType(t2, t1)); 
 } 


public void testSneakySelfRefs247() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     String json = mapper.writeValueAsString(new SneakyBean2()); 
     assertEquals("{\"foobar\":null}", json); 
 } 


public void testArrays249() { 
     Class<?>[] classes = new Class<?>[] { boolean[].class, byte[].class, char[].class, short[].class, int[].class, long[].class, float[].class, double[].class, String[].class, Object[].class, Calendar[].class }; 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     for (Class<?> clz : classes) { 
         assertSame(clz, tf.constructType(clz).getRawClass()); 
         Class<?> elemType = clz.getComponentType(); 
         assertSame(clz, tf.constructArrayType(elemType).getRawClass()); 
     } 
 } 


public void testRawCollections251() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     JavaType type = tf.constructRawCollectionType(ArrayList.class); 
     assertTrue(type.isContainerType()); 
     assertEquals(TypeFactory.unknownType(), type.getContentType()); 
     type = tf.constructRawCollectionLikeType(String.class); 
     assertTrue(type.isCollectionLikeType()); 
     assertEquals(TypeFactory.unknownType(), type.getContentType()); 
 } 


public void testMapTypesSimple253() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     JavaType type = tf.constructType(new TypeReference<Map<String, Boolean>>() { 
     }); 
     MapType mapType = (MapType) type; 
     assertEquals(tf.constructType(String.class), mapType.getKeyType()); 
     assertEquals(tf.constructType(Boolean.class), mapType.getContentType()); 
 } 


public void testSuperTypeDetectionClass254() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     HierarchicType sub = tf._findSuperTypeChain(MyStringIntMap.class, HashMap.class); 
     assertNotNull(sub); 
     assertEquals(2, _countSupers(sub)); 
     assertSame(MyStringIntMap.class, sub.getRawClass()); 
     HierarchicType sup = sub.getSuperType(); 
     assertSame(MyStringXMap.class, sup.getRawClass()); 
     HierarchicType sup2 = sup.getSuperType(); 
     assertSame(HashMap.class, sup2.getRawClass()); 
     assertNull(sup2.getSuperType()); 
 } 


public void testSuperTypeDetectionInterface255() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     HierarchicType sub = tf._findSuperTypeChain(MyList.class, List.class); 
     assertNotNull(sub); 
     assertEquals(2, _countSupers(sub)); 
     assertSame(MyList.class, sub.getRawClass()); 
     HierarchicType sup = sub.getSuperType(); 
     assertSame(IntermediateList.class, sup.getRawClass()); 
     HierarchicType sup2 = sup.getSuperType(); 
     assertSame(List.class, sup2.getRawClass()); 
     assertNull(sup2.getSuperType()); 
     sub = tf._findSuperTypeChain(MyMap.class, Map.class); 
     assertNotNull(sub); 
     assertEquals(2, _countSupers(sub)); 
     assertSame(MyMap.class, sub.getRawClass()); 
     sup = sub.getSuperType(); 
     assertSame(IntermediateMap.class, sup.getRawClass()); 
     sup2 = sup.getSuperType(); 
     assertSame(Map.class, sup2.getRawClass()); 
     assertNull(sup2.getSuperType()); 
 } 


public void testMapTypesAdvanced256() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     JavaType type = tf.constructType(MyMap.class); 
     MapType mapType = (MapType) type; 
     assertEquals(tf.constructType(String.class), mapType.getKeyType()); 
     assertEquals(tf.constructType(Long.class), mapType.getContentType()); 
     type = tf.constructType(MapInterface.class); 
     mapType = (MapType) type; 
     assertEquals(tf.constructType(String.class), mapType.getKeyType()); 
     assertEquals(tf.constructType(Integer.class), mapType.getContentType()); 
     type = tf.constructType(MyStringIntMap.class); 
     mapType = (MapType) type; 
     assertEquals(tf.constructType(String.class), mapType.getKeyType()); 
     assertEquals(tf.constructType(Integer.class), mapType.getContentType()); 
 } 

    

    

    
    
    

    

    /**
     * Test for verifying that parametric types can be constructed
     * programmatically
     * 
     * @since 1.5
     */
    

    /**
     * Test for checking that canonical name handling works ok
     */
    

    /*
    /**********************************************************
    /* Unit tests: low-level inheritance resolution
    /**********************************************************
     */
    
    /**
     * @since 1.6
     */
    
    
    /**
     * @since 1.6
     */
    

    /**
     * @since 1.6
     */
    

    private int _countSupers(HierarchicType t)
    {
        int depth = 0;
        for (HierarchicType sup = t.getSuperType(); sup != null; sup = sup.getSuperType()) {
            ++depth;
        }
        return depth;
    }
    
    /*
    /**********************************************************
    /* Unit tests: map/collection type parameter resolution
    /**********************************************************
     */
    
    /**
     * @since 1.6
     */
    

    /**
     * @since 1.6
     */
    

    /**
     * @since 1.6
     */
    

    /**
     * Specific test to verify that complicate name mangling schemes
     * do not fool type resolver
     * 
     * @since 1.6
     */
        
    
    /**
     * Plus sneaky types may be found via introspection as well.
     * 
     * @since 1.7
     */
        
    
    /**
     * Looks like type handling actually differs for properties, too.
     * 
     * @since 1.7
     */
    
    
    

    

    /*
    /**********************************************************
    /* Unit tests: construction of "raw" types
    /**********************************************************
     */

    

    

    /*
    /**********************************************************
    /* Unit tests: other
    /**********************************************************
     */
    
    
}
        
