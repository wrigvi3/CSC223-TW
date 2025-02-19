package csc223.tw;

public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public char data;

    public TreeNode(char x){
        this.data = x;
        this.left = null;
        this.right = null;
    }

    public TreeNode(){
        this.data = ' ';
        this.left = null;
        this.right = null;
    }
}
