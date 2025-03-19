package csc223.tw;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MaxHeapTest {
    

    @Test
    public void testInsert(){
        MaxHeap mh = new MaxHeap();
        assertEquals(0, mh.size());
        
        for (char i = 0; i < 10; i++) {
            assertFalse(mh.contains(i));
            mh.insert(i);
            assertTrue(mh.contains(i));
        }
    }

    @Test
    public void Testdelete(){
        MaxHeap mh = new MaxHeap();
        mh.insert(3);
        mh.insert(1);
        mh.insert(2);
        assertEquals(3, mh.peek());
        mh.delete();
        assertEquals(2, mh.peek());
    }

    @Test
    public void Testpeek(){
        MaxHeap mh = new MaxHeap();
        for (char i = 10; i > 0; i--) {
            mh.insert(i);
            assertEquals(10, mh.peek());
        }
    }

    @Test
    public void Testsize(){
        MaxHeap mh = new MaxHeap();
        assertEquals(0, mh.size());
        for (char i = 0; i < 10; i++) {
            mh.insert(i);
            assertEquals(i + 1, mh.size());
        }
    }

    @Test
    public void TestisEmpty(){
        MaxHeap mh = new MaxHeap();
        assertTrue(mh.isEmpty());
        mh.insert(1);
        assertFalse(mh.isEmpty());
    }

    @Test
    public void Testclear(){
        MaxHeap mh = new MaxHeap();
        for (char i = 0; i < 10; i++) {
            mh.insert(i);
        }
        assertFalse(mh.isEmpty());
        mh.clear();
        assertTrue(mh.isEmpty());
    }

    @Test
    public void TesttoString(){
        MaxHeap mh = new MaxHeap();
        assertEquals("[]", mh.toString());
        for (char i = 0; i < 10; i++) {
            mh.insert(i);
        }
        assertEquals("[9, 8, 6, 7, 5, 2, 4, 0, 3, 1]", mh.toString());
}
}
