package csc223.tw;

public class DoublyLinkedList extends SinglyLinkedList{
    Node head;
    Node curr;
    int size;

    public void DoublyLinkedList(){
        super.SinglyLinkedList();
        
    }

    public void insert(char item){
        super.insert(item);
        this.curr.next.previous = this.curr.previous;
    }

    public void remove(char item){
        super.remove(item);
        while (this.curr != null){
            this.curr.next.previous = this.curr.previous;
        }
        this.curr = this.curr.next;
    }

    public char getFirst(){
        return super.getFirst();
    }

    public char getLast(){
        return super.getLast();
    }

    public char get(int index){
        return super.get(index);
    }

    public int size(){
        return super.size();
    }

    public boolean isEmpty(){
        return super.isEmpty();
    }

    public void clear(){
        super.clear();
    }

    public boolean contains(char item){
        return super.contains(item);
    }

    public int indexOf(char item){
        return super.indexOf(item);
    }

    public int lastIndexOf(char item){
        return super.lastIndexOf(item);
    }

    public void reverse(){
        Node temp = null;
        Node current = this.head;

        while (current != null){
            temp = current.previous;
            current.previous = current.next;
            current.next = temp;
            current = current.previous;
        }
    }

    public String toString(){
        return super.toString();
    }
}
