package csc223.tw;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest {
    @Test
    public void testlevelorder(){
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode('A');
        tree.root.left = new TreeNode('B');
        tree.root.right = new TreeNode('C');
        tree.root.left.left = new TreeNode('D');
        tree.root.left.right = new TreeNode('E');
        System.out.println(tree.levelorder());
        assertEquals([[A], [B, C], [D, E]], tree.levelorder());
    }

    @Test
    public void testpreorder(){
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode('A');
        tree.root.left = new TreeNode('B');
        tree.root.right = new TreeNode('C');
        tree.root.left.left = new TreeNode('D');
        tree.root.left.right = new TreeNode('E');
        //System.out.println(tree.preorder());
        assertEquals("ABDEC", tree.preorder());
    }

    @Test
    public void testinorder(){
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode('A');
        tree.root.left = new TreeNode('B');
        tree.root.right = new TreeNode('C');
        tree.root.left.left = new TreeNode('D');
        tree.root.left.right = new TreeNode('E');
        System.out.println(tree.inorder());
        assertEquals("DBEAC", tree.inorder());
    }

    @Test
    public void testpostorder(){
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode('A');
        tree.root.left = new TreeNode('B');
        tree.root.right = new TreeNode('C');
        tree.root.left.left = new TreeNode('D');
        tree.root.left.right = new TreeNode('E');
        System.out.println(tree.postorder());
        assertEquals("DEBCA", tree.postorder());
    }

    @Test
    public void testinsert(){
        BinaryTree tree = new BinaryTree();
        tree.insert('A');
        tree.insert('B');
        tree.insert('C');
        //assertEquals('ABC', tree.data);
        
    }

    @Test
    public void testsearch(){
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode('A');
        tree.root.left = new TreeNode('B');
        tree.root.right = new TreeNode('C');
        tree.root.left.left = new TreeNode('D');
        tree.root.left.right = new TreeNode('E');
        assertTrue(tree.search('B'));
        assertFalse(tree.search('Z'));
    }

    @Test
    public void testsize(){
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode('A');
        tree.root.left = new TreeNode('B');
        tree.root.right = new TreeNode('C');
        tree.root.left.left = new TreeNode('D');
        tree.root.left.right = new TreeNode('E');
        assertEquals(5, tree.size());
    }

    @Test
    public void testisEmpty(){
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode('A');
        tree.root.left = new TreeNode('B');
        tree.root.right = new TreeNode('C');
        tree.root.left.left = new TreeNode('D');
        tree.root.left.right = new TreeNode('E');
        assertFalse(tree.isEmpty());
    }

    @Test
    public void testheight(){
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode('A');
        tree.root.left = new TreeNode('B');
        tree.root.right = new TreeNode('C');
        tree.root.left.left = new TreeNode('D');
        tree.root.left.right = new TreeNode('E');
        assertEquals(3, tree.height());
    }

}
