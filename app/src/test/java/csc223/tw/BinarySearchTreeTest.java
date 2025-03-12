package csc223.tw;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
public class BinarySearchTreeTest {
    
    @Test
    public void testinsert(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        assertEquals(123, tree.data2);
    }

    @Test
    public void testdelete(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        assertTrue(tree.search(1));
        tree.delete(1);
        assertFalse(tree.search(1));
    }

    @Test
    public void testsearch(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        assertTrue(tree.search(1));
        assertFalse(tree.search(5));
    }

    @Test
    public void testupdate(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        assertFalse(tree.search(5));
        assertTrue(tree.search(2));
        tree.update(2, 5);
        assertTrue(tree.search(5));
        assertFalse(tree.search(2));
    }

    @Test
    public void testinOrder(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        assertEquals("123", tree.inOrder());
    }

    @Test
    public void testSortedArray(){
        BinarySearchTree tree = new BinarySearchTree();
        int[] nums = [1, 2, 3];
        assertEquals(2, tree.sortedArrayToBST(nums));
    }

    @Test
    public void testAncestor(){
        BinarySearchTree tree = new BinarySearchTree();
        int[] nums = [6,2,8,0,4,7,9,null,null,3,5];
        assertEquals(6, tree.lowestCommonAncestor(nums, 2, 8));
    }
   
}
