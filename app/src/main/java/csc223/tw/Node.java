package csc223.tw;

public class Node {
    Node next;
    Node previous;
    char data;

    public Node(char x){
        this.data = x;
        this.next = null;
        this.previous = null;
    }

    public Node(){
        this.data = ' ';
    }
}
