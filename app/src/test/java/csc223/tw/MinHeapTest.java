package csc223.tw;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MinHeapTest {
    
    @Test
    public void testInsert(){
        MinHeap mh = new MinHeap();
        assertEquals(0, mh.size());
        
        for (char i = 0; i < 10; i++) {
            assertFalse(mh.contains(i));
            mh.insert(i);
            assertTrue(mh.contains(i));
        }
    }

    @Test
    public void Testdelete(){
        MinHeap mh = new MinHeap();
        mh.insert(3);
        mh.insert(1);
        mh.insert(2);
        assertEquals(1, mh.peek());
        mh.delete();
        assertEquals(2, mh.peek());

    }

    @Test
    public void Testpeek(){
        MinHeap mh = new MinHeap();
        for (char i = 10; i > 0; i--) {
            mh.insert(i);
            assertEquals(i, mh.peek());
        }

    }

    @Test
    public void Testsize(){
        MinHeap mh = new MinHeap();
        assertEquals(0, mh.size());
        for (char i = 0; i < 10; i++) {
            mh.insert(i);
            assertEquals(i + 1, mh.size());
        }
    }

    @Test
    public void TestisEmpty(){
        MinHeap mh = new MinHeap();
        assertTrue(mh.isEmpty());
        mh.insert(1);
        assertFalse(mh.isEmpty());
    }

    @Test
    public void Testclear(){
        MinHeap mh = new MinHeap();
        for (char i = 0; i < 10; i++) {
            mh.insert(i);
        }
        mh.clear();
        assertTrue(mh.isEmpty());
    }

    @Test
    public void TesttoString(){
        MinHeap mh = new MinHeap();
        for (char i = 0; i < 10; i++) {
            mh.insert(i);
        }
        assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]", mh.toString());
    }
}
