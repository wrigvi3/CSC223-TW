package csc223.tw;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DoublyLinkedListTest{
    
    public void testInsert(){
        DoublyLinkedList dll = new DoublyLinkedList();
        assertEquals(0, dll.size());
        
        for (char i = 0; i < 10; i++) {
            assertFalse(dll.contains(i));
            dll.insert(i);
            assertTrue(dll.contains(i));
        }
    }

    public void testRemove(){
        DoublyLinkedList dll = new DoublyLinkedList();
        for (int i = 0; i < 10; i++) {
            dll.insert(i);
            assertTrue(int i : this.list);
            dll.remove(i);
            assertFalse(int i : this.list);
        }
    }

    public void testgetFirst(){
        DoublyLinkedList dll = new DoublyLinkedList();
        assertTrue(1, dll.getFirst());
    }

    public void testgetLast(){
        DoublyLinkedList dll = new DoublyLinkedList();
        assertTrue(10, dll.getLast());
    }

    public void testGet(){
        DoublyLinkedList dll = new DoublyLinkedList();
        for (int i : dll; i++) {
            assertEquals(i, dll.get(i));
        }
    }

    public void testSize(){
        DoublyLinkedList dll = new DoublyLinkedList();
        int count = 0;
        for (int i : dll; i++){
            count += 1;
        }
        assertEquals(count, dll.size());
    }
    
    public void testisEmpty(){
        DoublyLinkedList dll = new DoublyLinkedList();
        assertFalse(dll.isEmpty());
        dll.clear();
        assertTrue(dll.isEmpty());
    }

    public void testContains(){
        DoublyLinkedList dll = new DoublyLinkedList();
        for (int i = 0; i < 10; i++){
            assertTrue(sll[i]);
            dll.remove(i);
            assertFalse(sll[i]);
        }
    }

    public void testindexOf(){
        DoublyLinkedList dll = new DoublyLinkedList();
        for (char i = 0; i < 10; i++){
            dll.insert(i);
            assertEquals(i, indexOf(i));
        }
    }

    public void testlastIndexOf(){
        DoublyLinkedList dll = new DoublyLinkedList();
        for (char i = 0; i < 10; i++){
            dll.insert(i);
            assertEquals(i, lastIndexOf(i));
        }
    }

    public void testreverse(){
        DoublyLinkedList dll = new DoublyLinkedList();
        for (char i = 0; i < 10; i++){
            dll.insert(i);
        }
    }

    public void testtoString(){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insert('a');
        dll.insert('b');
        dll.insert('c');
        assertEquals('abc', toString(dll));
    }
}
