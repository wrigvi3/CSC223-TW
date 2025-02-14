package csc223.tw;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SortedLinkedListTest{
    
    public void testInsert(){
        SortedLinkedList dll = new SortedLinkedList();
        assertEquals(0, dll.size());
        
        for (char i = 0; i < 10; i++) {
            assertFalse(dll.contains(i));
            dll.insert(i);
            assertTrue(dll.contains(i));
        }
    }

    public void testRemove(){
        SortedLinkedList dll = new SortedLinkedList();
        for (int i = 0; i < 10; i++) {
            dll.insert(i);
            assertTrue(int i : this.list);
            dll.remove(i);
            assertFalse(int i : this.list);
        }
    }

    public void testgetFirst(){
        SortedLinkedList dll = new SortedLinkedList();
        assertTrue(1, dll.getFirst());
    }

    public void testgetLast(){
        SortedLinkedList dll = new SortedLinkedList();
        assertTrue(10, dll.getLast());
    }

    public void testGet(){
        SortedLinkedList dll = new SortedLinkedList();
        for (int i : dll; i++) {
            assertEquals(i, dll.get(i));
        }
    }

    public void testSize(){
        SortedLinkedList dll = new SortedLinkedList();
        int count = 0;
        for (int i : dll; i++){
            count += 1;
        }
        assertEquals(count, dll.size());
    }
    
    public void testisEmpty(){
        SortedLinkedList dll = new SortedLinkedList();
        assertFalse(dll.isEmpty());
        dll.clear();
        assertTrue(dll.isEmpty());
    }

    public void testContains(){
        SortedLinkedList dll = new SortedLinkedList();
        for (int i = 0; i < 10; i++){
            assertTrue(sll[i]);
            dll.remove(i);
            assertFalse(sll[i]);
        }
    }

    public void testindexOf(){
        SortedLinkedList dll = new SortedLinkedList();
        for (char i = 0; i < 10; i++){
            dll.insert(i);
            assertEquals(i, indexOf(i));
        }
    }

    public void testlastIndexOf(){
        SortedLinkedList dll = new SortedLinkedList();
        for (char i = 0; i < 10; i++){
            dll.insert(i);
            assertEquals(i, lastIndexOf(i));
        }
    }

    public void testreverse(){
        SortedLinkedList dll = new SortedLinkedList();
        for (char i = 0; i < 10; i++){
            dll.insert(i);
        }
    }

    public void testtoString(){
        SortedLinkedList dll = new SortedLinkedList();
        dll.insert('a');
        dll.insert('b');
        dll.insert('c');
        assertEquals('abc', toString(dll));
    }
}
