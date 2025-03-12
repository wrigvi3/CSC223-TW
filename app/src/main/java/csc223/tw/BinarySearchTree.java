package csc223.tw;

public class BinarySearchTree {
    TreeNode root;
    TreeNode curr;

    public BinarySearchTree(){
        this.root = null;
        this.curr = this.root;
    }

    //Inserts a new element to the BST.
    //If the element is already in BST, it should not be added again.
    public void insert(int value){
        insert(value, this.root);
    }

    private TreeNode insert(int x, TreeNode curr){
        if (curr == null){
            return new TreeNode(x);
        }
        else if (curr.data2 == x) {
            return this.curr;
        }
        else{
            if (curr.data2 > x){
                curr.left = insert(x, curr.left);
            }
            else{
                curr.right = insert(x, curr.right);
            }
            return this.curr;
        }
    }

    //Deletes an element from the BST. 
    //If the element is not in the BST, the method should do nothing.
    public void delete(int value){
        delete(value, this.root);
    }

    private void delete(int x, TreeNode curr){
        if (curr.data2 == x){
            if (curr.left == null && curr.right == null){
                curr = null;
            }
            else if (curr.left == null || curr.right == null){
                if (curr.left != null){
                    int temp = curr.left.data;
                    curr.left = null;
                    curr.data2 = temp;
                }
                else{
                    int temp = curr.right.data;
                    curr.right = null;
                    curr.data2 = temp;
                }
            }
            else{
                getreplacement(curr);
            }
        }
    }

    private void getreplacement(TreeNode x){
        findmin(x.right);
    }

    private TreeNode findmin(TreeNode x){
        if (x.left == null){
            return x;
        }
        return findmin(x.left);
    }

    //Returns true if the BST contains the specified element, and false otherwise
    public boolean search(int value){
        return search(value, this.root);
    }

    private boolean search(int x, TreeNode curr){
        if (curr.data2 == x){
            return true;
        }
        else if (curr == null){
            return false;
        }
        else{
            if (curr.data2 > x){
                return search(x, curr.left);
            }
            else{
                return search(x, curr.right);
            }
        }
    }

    //Updates an element in the BST. 
    //If the element is not in the BST, the method should do nothing.
    public void update(int oldValue, int newValue){
        update(oldValue, newValue, this.root);
    }

    private void update(int oldval, int newval, TreeNode curr){
        if (curr.data2 == oldval){
            delete(oldval);
            insert(newval);
        }
        else{
            if (curr.data > oldval){
                update(oldval, newval, curr.left);
            }
            else{
                update(oldval, newval, curr.right);
            }
        }
    }

    //Returns a string representation of all elements in the BST in in-order traversal
    public String inOrder(){
        return inOrder(this.root);
    }
    
    private String inOrder(TreeNode curr){
        if (curr == null){
            return "";
        }
        else{
            String left = inOrder(curr.left);
            String right = inOrder(curr.right);
            return left + curr.data + right;
        }
    }

    //Creates a height-balanced BST from a sorted array of integers.
    //The method should return the root of the BST.
    public TreeNode sortedArrayToBST(int[] values){
        if (values == null || values.length == 0){
            return null;
        }
        return sortedArrayToBST(values, 0, values.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] values, int start, int end){
        if (start > end){
            return null;
        }
        int mid = start + (end-start) / 2;
        TreeNode root = new TreeNode(values[mid]);
        root.left = sortedArrayToBST(values, start, mid-1);
        root.right = sortedArrayToBST(values, mid+1, end);
        return root;
    }
    


    //Returns the lowest common ancestor of two elements in the BST.
    //If either element is not in the BSt, the method should return -1.
    public int lowestCommonAncestor(TreeNode root, int p, int q){
        return lowestCommonAncestors(root, p, q);
    }

    private int lowestCommonAncestors(TreeNode curr, int p, int q){
        if (curr == null){
            return -1;
        }
        else if (curr.data2 == p || curr.data2 == q){
            return curr.data2;
        }
        else{
            if ((p < curr.data2) && (q < curr.data2)){
                lowestCommonAncestor(curr.left, p, q);
            }
            else if (p > curr.data2 && q > curr.data2){
                lowestCommonAncestor(curr.right, p, q);
            }
            else{
                return curr.data2;
            }
            return -1;
        }
    }
}
