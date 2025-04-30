package csc223.tw;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyHashtableTest {
    
    @Test
    public void testPut() {
        MyHashtable hashtable = new MyHashtable();

        assertEquals(1, hashtable.size());
        
        hashtable.put("abc", 1);
        hashtable.put("def", 2);

        assertEquals(2, hashtable.size());
    }

    @Test
    public void testGet() {
        MyHashtable hashtable = new MyHashtable();

        hashtable.put("abc", 1);
        hashtable.put("def", 2);

        assertEquals(1, hashtable.get("abc"));
        assertEquals(2, hashtable.get("def"));
    }
    @Test
    public void testRemove() {
        MyHashtable hashtable = new MyHashtable();

        hashtable.put("abc", 1);
        hashtable.put("def", 2);

        assertEquals(1, hashtable.get("abc"));
        assertEquals(2, hashtable.get("def"));

        hashtable.remove("abc");

        assertEquals(null, hashtable.get("abc"));
        assertEquals(2, hashtable.get("def"));
    }
    @Test
    public void testContainsKey() {
        MyHashtable hashtable = new MyHashtable();

        hashtable.put("abc", 1);
        hashtable.put("def", 2);

        assertEquals(true, hashtable.containsKey("abc"));
        assertEquals(false, hashtable.containsKey("xyz"));
    }
    @Test
    public void testSize() {
        MyHashtable hashtable = new MyHashtable();

        assertEquals(0, hashtable.size());

        hashtable.put("abc", 1);
        hashtable.put("def", 2);

        assertEquals(2, hashtable.size());

        hashtable.remove("abc");

        assertEquals(1, hashtable.size());
    }
}