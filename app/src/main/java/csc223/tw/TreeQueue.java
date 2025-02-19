package csc223.tw;


public class TreeQueue implements Queue{
    Node head;
    Node tail;
    int size;

    public TreeQueue(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    @Override
    public void enqueue(int item){
        char items = (char) item;
        Node newnode = new Node(items);
        if (this.head == null){
            this.head = newnode;
        }
        else{
            this.tail.next = newnode;
        }
        this.tail = newnode;
        this.size += 1;
    }

    public void enqueue(Node curr){
        if (this.head == null){
            this.head = curr;
        }
        else{
            this.tail.next = curr;
        }
        this.tail = curr;
        this.size += 1;
    }
    @Override
    public int dequeue(){
        if (this.head == null){
            return -1;
        }
        int data = this.head.data;
        this.head = this.head.next;
        this.size -= 1;
        return data;
    }
    @Override
    public int peek(){
        if (this.head == null){
            return -1;
        }
        return this.head.data;
    }
    @Override
    public boolean isEmpty(){
        return this.head == null;
    }
    @Override
    public int size(){
        return this.size;
    }
}
