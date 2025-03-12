# PROGRAMMING ASSIGNMENT 5

**Due: Tuesday, March 12th, 2024, 2:30 PM**

--- 

<br/>
<h1><center>BINARY SEARCH TREE (BST) </h1></center>

<br/>

In this assignment, you will implement a Binary Search Tree (BST) data structure with the following public methods, making sure that the tree satisifes the BST properties at all times:

1. `insert(int value)`: Inserts a new element to the BST. If the element is already in the BST, it should not be added again. 

2. `delete(int value)`: Deletes an element from the BST. If the element is not in the BST, the method should do nothing.

3. `search(int value)`: Returns true if the BST contains the specified element, and false otherwise.

4. `update(int oldValue, int newValue)`: Updates an element in the BST. If the element is not in the BST, the method should do nothing.

5. `inOrder()`: Returns a string representation of all elements in the BST in in-order traversal.

6. `sortedArrayToBST(int[] values)`: Creates a height-balanced BST from a sorted array of integers. The method should return the root of the BST. 

    [Try it on Leetcode as well](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/)

   A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.

   Example 1:

   _Input_: `nums = [-10,-3,0,5,9]` <br/>
   _Output_: \
   <img src="https://assets.leetcode.com/uploads/2021/02/18/btree1.jpg">
   or 
   <img src="https://assets.leetcode.com/uploads/2021/02/18/btree2.jpg">

   Example 2:


    _Input_: `nums = [1,3]` <br/>
    _Output_: \
    <img src="https://assets.leetcode.com/uploads/2021/02/18/btree.jpg">

    _Explanation_: [1,null,3] and [3,1] are both height-balanced BSTs.

<br/>

7. `lowestCommonAncestor(int p, int q)`: Returns the lowest common ancestor of two elements in the BST. If either element is not in the BST, the method should return -1. 

    [Try it on Leetcode as well](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/)

   Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.

   The lowest common ancestor is defined between two nodes `p` and `q` as the lowest node in `T` that has both `p` and `q` as descendants (where we allow **a node to be a descendant of itself**).”

   **Example 1**:

   Given binary search tree:  
   <img src="https://assets.leetcode.com/uploads/2018/12/14/binarysearchtree_improved.png">

   _Input_: `root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8` \
_Output_: `6` \
_Explanation_: The LCA of nodes 2 and 8 is 6.

   **Example 2**:

   Given binary search tree:  
   <img src="https://assets.leetcode.com/uploads/2018/12/14/binarysearchtree_improved.png">


   _Input_: `root = [6,2,8,0,4,7,9,null,null,3,5]`, `p = 2`, `q = 4` \
_Output_: `2` \
_Explanation_: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.

Feel free to define any additional helper methods or classes as needed. 

All helper methods must be private.

## Evaluation

Your submission will be evaluated based on the correctness **_and completeness_** of your implementation and test cases. If your implementation is correct but your test cases are incomplete, you will lose points. If your implementation is incorrect, you will lose even more points.



