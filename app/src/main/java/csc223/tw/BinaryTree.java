package csc223.tw;


public class BinaryTree {
    TreeNode root;
    TreeNode curr;

    public BinaryTree(){
        this.root = null;
        this.curr = this.root;
    }

    public String levelorder(){
        Queue q = new TreeQueue();
        if (this.root == null){
        this.root = new TreeNode();
        return "";
        }
        while (q.isEmpty() == false){
            q.dequeue();
            if (this.curr.left == null){
                this.curr.left = new TreeNode();
                return "";
            }
            else{
                q.enqueue(curr.left);
            }
            if (this.curr.right == null){
                this.curr.right = new TreeNode();
            }
            else{
                q.enqueue(curr.right);
            }
        }
        
    }


    public String preorder(){
        return preorder(this.root);
    }

    private String preorder(TreeNode curr){
        if (curr == null){
            return "";
        }
        String left = preorder(curr.left);
        String right = preorder(curr.right);
        return curr.data + left + right;
    }

    public String inorder(){
        return inorder_helper(this.root);

    }

    private String inorder_helper(TreeNode curr){
        if (curr == null){
            return "";
        }
        String left = inorder_helper(curr.left);
        String right = inorder_helper(curr.right);
        return left + curr.data + right;
    }

    public String postorder(){
        return postorder(this.root);
    }

    private String postorder(TreeNode curr){
        if (curr == null){
            return "";
        }
        String left = postorder(curr.left);
        String right = postorder(curr.right);
        return left + right + curr.data;
    }

    public void insert(char item){
        TreeQueue q = new TreeQueue();
        if (this.root == null){
            this.root = new TreeNode(item);
            return;
        }
        q.enqueue2(this.root);
        
        while (q.isEmpty() == false){
            curr.q.dequeue();
            if (curr.left == null){
                curr.left = new TreeNode(item);
                return;
            }
            else{
                q.enqueue(curr.left);
            }
            if (curr.left == null){
                curr.right = new TreeNode(item);
                return;
            }
            else{
                q.enqueue(curr.right);
            }
        }
    }

    public boolean search(char item){
        return search(this.root, item);
    }

    private boolean search(TreeNode curr, char item){
        if (curr == null){
            return false;
        }
        if (curr.data == item){
            return true;
        }
        return search(curr.left, item) || search(curr.right, item);
    }

    public int size(){
        return size(this.root);
    }

    private int size(TreeNode curr){
        if (curr == null){
            return 0;
        }
        int LS = size(curr.left);
        int RS = size(curr.right);
        return (LS + RS + 1);
    }

    public boolean isEmpty(){
        return this.root == null;
    }

    public int height(){
        return height(this.root);
    }

    private int height(TreeNode curr){
        if (curr == null){
            return 0;
        }
        int LH = height(curr.left);
        int RH = height(curr.right);
        return Math.max(LH, RH) + 1;
    }
}
