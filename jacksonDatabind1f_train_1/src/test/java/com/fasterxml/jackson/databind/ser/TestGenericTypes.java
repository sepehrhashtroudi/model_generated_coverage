package com.fasterxml.jackson.databind.ser;

import java.util.*;


import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestGenericTypes extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */
    
    static class Account {
        private Long id;        
        private String name;
        
        public Account(String name, Long id) {
            this.id = id;
            this.name = name;
        }

        public String getName() { return name; }
        public Long getId() { return id; }
    }

    static class Key<T> {
        private final T id;
        
        public Key(T id) { this.id = id; }
        
        public T getId() { return id; }

        public <V> Key<V> getParent() { return null; }
    }
 
    static class Person1 {
        private Long id;
        private String name;
        private Key<Account> account;
        
        public Person1(String name) { this.name = name; }

        public String getName() {
                return name;
        }

        public Key<Account> getAccount() {
                return account;
        }

        public Long getId() {
                return id;
        }

        public void setAccount(Key<Account> account) {
            this.account = account;
        }    
    }

    static class Person2 {
        private Long id;
        private String name;
        private List<Key<Account>> accounts;
        
        public Person2(String name) {
                this.name = name;
        }

        public String getName() { return name; }
        public List<Key<Account>> getAccounts() { return accounts; }
        public Long getId() { return id; }

        public void setAccounts(List<Key<Account>> accounts) {
            this.accounts = accounts;
        }
    }

    static class GenericBogusWrapper<T> {
        public Element wrapped;

        public GenericBogusWrapper(T v) { wrapped = new Element(v); }

        class Element {
            public T value;
    
            public Element(T v) { value = v; }
        }
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */


@SuppressWarnings("unchecked") 
 public void testIssue468b135() throws Exception { 
     Person2 p2 = new Person2("John"); 
     List<Key<Account>> accounts = new ArrayList<Key<Account>>(); 
     accounts.add(new Key<Account>(new Account("a", 42L))); 
     accounts.add(new Key<Account>(new Account("b", 43L))); 
     accounts.add(new Key<Account>(new Account("c", 44L))); 
     p2.setAccounts(accounts); 
     ObjectMapper mapper = new ObjectMapper(); 
     String json = mapper.writeValueAsString(p2); 
     Map<String, Object> map = mapper.readValue(json, Map.class); 
     assertEquals("John", map.get("name")); 
     Object ob = map.get("accounts"); 
     assertNotNull(ob); 
     List<?> acctList = (List<?>) ob; 
     assertEquals(3, acctList.size()); 
 } 


public void testUnboundIssue572252() throws Exception { 
     GenericBogusWrapper<Integer> list = new GenericBogusWrapper<Integer>(Integer.valueOf(7)); 
     String json = new ObjectMapper().writeValueAsString(list); 
     assertEquals("{\"wrapped\":{\"value\":7}}", json); 
 } 

    

    

    /**
     * Issue [JACKSON-572] is about unbound type variables, usually resulting
     * from inner classes of generic classes (like Sets).
     */
    
}

