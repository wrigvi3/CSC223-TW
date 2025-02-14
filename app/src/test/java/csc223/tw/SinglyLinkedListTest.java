package csc223.tw;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SinglyLinkedListTest {
    
    public void testInsert(){
        SinglyLinkedList sll = new SinglyLinkedList();
        assertEquals(0, sll.size());
        
        for (char i = 0; i < 10; i++) {
            assertFalse(sll.contains(i));
            sll.insert(i);
            assertTrue(sll.contains(i));
        }
    }

    public void testRemove(){
        SinglyLinkedList sll = new SinglyLinkedList();
        for (int i = 0; i < 10; i++) {
            assertTrue(int i : this.list);
            sll.remove(i);
            assertFalse(int i : this.list);
        }
    }

    public void testgetFirst(){
        SinglyLinkedList sll = new SinglyLinkedList();
        assertTrue(1, sll.getFirst());
    }

    public void testgetLast(){
        SinglyLinkedList sll = new SinglyLinkedList();
        assertTrue(10, sll.getLast());
    }

    public void testGet(){
        SinglyLinkedList sll = new SinglyLinkedList();
        for (int i : sll; i++) {
            assertEquals(i, sll.get(i));
        }
    }

    public void testSize(){
        SinglyLinkedList sll = new SinglyLinkedList();
        int count = 0;
        for (int i : sll; i++){
            count += 1;
        }
        assertEquals(count, sll.size());
    }
    
    public void testisEmpty(){
        SinglyLinkedList sll = new SinglyLinkedList();
        assertFalse(sll.isEmpty());
        sll.clear();
        assertTrue(sll.isEmpty());
    }

    public void testContains(){
        SinglyLinkedList sll = new SinglyLinkedList();
        for (int i = 0; i < 10; i++){
            assertTrue(sll[i]);
            sll.remove(i);
            assertFalse(sll[i]);
        }
    }

    public void testindexOf(){
        SinglyLinkedList sll = new SinglyLinkedList();
        for (char i = 0; i < 10; i++){
            sll.insert(i);
            assertEquals(i, indexOf(i));
        }
    }

    public void testlastIndexOf(){
        SinglyLinkedList sll = new SinglyLinkedList();
        for (char i = 0; i < 10; i++){
            sll.insert(i);
            assertEquals(i, lastIndexOf(i));
        }
    }

    public void testreverse(){
        SinglyLinkedList sll = new SinglyLinkedList();
        for (char i = 0; i < 10; i++){
            sll.insert(i);
        }
    }

    public void testtoString(){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insert('a');
        sll.insert('b');
        sll.insert('c');
        assertEquals('abc', toString(sll));
    }
}
